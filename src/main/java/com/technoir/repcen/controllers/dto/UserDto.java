package com.technoir.repcen.controllers.dto;

import com.technoir.repcen.domain.Role;
import com.technoir.repcen.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String middleName;

    private String email;

    private String password;

    private Set<Role> roles;

    public static UserDto fromUser(User user) {
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getMiddleName(), user.getEmail(), user.getPassword(), user.getRoles());
    }
}
