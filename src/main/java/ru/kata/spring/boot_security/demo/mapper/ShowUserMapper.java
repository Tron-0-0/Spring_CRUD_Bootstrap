package ru.kata.spring.boot_security.demo.mapper;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.dto.ShowUserReadDto;
import ru.kata.spring.boot_security.demo.entity.User;

@Component
public class UserMapper implements Mapper<ShowUserReadDto, User>{
    @Override
    public ShowUserReadDto map(User entity) {

        return new ShowUserReadDto(
                entity.getUsername(),
                entity.getFirstname(),
                entity.getLastname(),
                entity.getBirthdate(),
                entity.getRoles()
        );
    }
}
