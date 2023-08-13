package com.example.EmployeeSearch.service;

import com.example.EmployeeSearch.domain.Employee;
import com.example.EmployeeSearch.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository repo;

    public List<Employee> listAll() {
        return repo.findAll();
    }



    public Employee get(long id) {
        return repo.findById(id).get();
    }

}