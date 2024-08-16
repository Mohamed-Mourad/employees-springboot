package com.springdata.first.controller;

import com.springdata.first.model.dto.EmployeeDTO;
import com.springdata.first.model.entity.Employee;
import com.springdata.first.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/get-emp")
    public EmployeeDTO getUser(@RequestParam Integer id){
        return empService.getUser(id);
    }

    @PostMapping("/save-emp")
    public EmployeeDTO saveUser(@RequestBody EmployeeDTO employee){
        return empService.save(employee);
    }

    @GetMapping("/delete-emp")
    public void deleteUser(@RequestBody Integer id){
        empService.delete(id);
    }

    @PutMapping("/update-emp")
    public EmployeeDTO updateUser(@RequestBody EmployeeDTO employee){
        return empService.update(employee);
    }
}
