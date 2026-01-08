package com.springboot.crud.mapper;

import com.springboot.crud.dto.UserDto;
import com.springboot.crud.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "password", ignore = true)
    UserDto toDto(User entity);

    User toEntity(UserDto dto);
}
