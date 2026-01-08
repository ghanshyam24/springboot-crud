package com.springboot.crud.service;

import com.springboot.crud.dto.UserDto;
import com.springboot.crud.entity.User;
import com.springboot.crud.exception.UserNotFoundException;
import com.springboot.crud.mapper.UserMapper;
import com.springboot.crud.repo.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto findUser(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

        return userMapper.toDto(user);
    }

    public UserDto save(UserDto userDto) {
        userDto.setId(UUID.randomUUID());
        User savedUser = userRepository.save(userMapper.toEntity(userDto));
        return userMapper.toDto(savedUser);
    }

    public UserDto updateUser(UUID id, @Valid UserDto userDto) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    if (userDto.getUsername() != null) existingUser.setUsername(userDto.getUsername());
                    if (userDto.getFatherName() != null) existingUser.setFatherName(userDto.getFatherName());
                    if (userDto.getMotherName() != null) existingUser.setMotherName(userDto.getMotherName());

                    User saved = userRepository.save(existingUser);
                    return userMapper.toDto(saved);
                })
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

    public void deleteUser(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
        userRepository.delete(user);
    }

}