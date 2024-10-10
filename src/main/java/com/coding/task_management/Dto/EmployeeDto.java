package com.coding.task_management.Dto;

import com.coding.task_management.Entities.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends RegisterRequest
{
    private String matricule;
    private String grade;
    private String adresse;

    public static Employee Toentite(EmployeeDto request) {
        return Employee.builder()
                .id(request.getId())
                .fullname(request.getFullname())
                .email(request.getEmail())
                .password(request.getPassword())
                .matricule(request.getMatricule())
                .grade(request.getGrade())
                .adresse(request.getAdresse())
                .build();

    }

    public static EmployeeDto fromentite(Employee request) {
        return EmployeeDto.builder()
                .id(request.getId())
                .fullname(request.getFullname())
                .email(request.getEmail())
                .password(request.getPassword())
                .matricule(request.getMatricule())
                .grade(request.getGrade())
                .adresse(request.getAdresse())
                .build();
    }


}
