package com.springdata.first.model.dto;

import com.springdata.first.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private Integer id;
    private String firstName;
    private String lastName;
    private Double salary;

    public static EmployeeDTO toDTO(Employee entity){
        return EmployeeDTO.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .salary(entity.getSalary())
                .build();
    }
}
