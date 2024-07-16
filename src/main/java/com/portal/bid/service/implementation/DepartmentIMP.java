package com.portal.bid.service.implementation;

import com.portal.bid.entity.Department;
import com.portal.bid.repository.DepartmentRepository;
import com.portal.bid.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentIMP implements DepartmentService {

    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department dep) {
        return departmentRepository.save(dep);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department dep) {
        return null;
    }

    @Override
    public boolean deleteDepartment(Long id) {
        return false;
    }
}
