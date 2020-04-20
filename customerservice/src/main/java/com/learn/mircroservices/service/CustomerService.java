package com.learn.mircroservices.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private static Map < Long, Customer > EmployeeRepsitory = null;
    static {
        Stream < String > employeeStream = Stream.of("1,Shamik  Mitra,Java,Architect", "2,Samir  Mitra,C++,Manager",
                "3,Swastika  Mitra,AI,Sr.Architect");
        EmployeeRepsitory = employeeStream.map(employeeStr -> {
            String[] info = employeeStr.split(",");
            return createEmployee(new Long(info[0]), info[1], info[2], info[3]);
        }).collect(Collectors.toMap(Employee::getEmployeeId, emp -> emp));
    }

    public findById(Long id){

    }
}
