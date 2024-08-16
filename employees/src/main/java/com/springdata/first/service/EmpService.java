package com.springdata.first.service;

import com.springdata.first.model.dto.EmployeeDTO;
import com.springdata.first.model.entity.Employee;
import com.springdata.first.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    public EmployeeDTO getUser(Integer id){
        Optional<Employee> emp = this.empRepo.findById(id);
        if(emp.isPresent())
            return EmployeeDTO.toDTO(emp.get());
        return null;
        // return emp.map(EmployeeDTO::toDTO).orElse(null);
    }

    public EmployeeDTO save(EmployeeDTO employee){
        return  EmployeeDTO.toDTO(empRepo.save(Employee.toEntity(employee)));
    }

    public void delete(Integer id){
        this.empRepo.deleteById(id);
    }

    public EmployeeDTO update(EmployeeDTO employee){
        return  EmployeeDTO.toDTO(empRepo.save(Employee.toEntity(employee)));
    }
}
