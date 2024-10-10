package com.coding.task_management.Dto;

import com.coding.task_management.Entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class RegisterRequest {
    private Long id;
    private String fullname;
    private String email;

    private String password;
    private Role role;

}
