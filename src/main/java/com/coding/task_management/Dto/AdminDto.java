package com.coding.task_management.Dto;

import com.coding.task_management.Entities.Admin;
import com.coding.task_management.Entities.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto extends RegisterRequest{
    private boolean isadmin;
    public static Admin Toentite(AdminDto request) {
        return Admin.builder()
                .id(request.getId())
                .fullname(request.getFullname())
                .email(request.getEmail())
                .password(request.getPassword())
                .isadmin(request.isadmin)
                .build();

    }

    public static AdminDto fromentite(Admin request) {
        return AdminDto.builder()
                .id(request.getId())
                .fullname(request.getFullname())
                .email(request.getEmail())
                .password(request.getPassword())
                .isadmin(request.isIsadmin())
                .build();

    }

}
