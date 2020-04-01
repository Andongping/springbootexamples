package com.example.springboot.cache;

import com.example.springboot.cache.bean.Employee;
import com.example.springboot.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *
 * </pre>
 *
 * <pre>
 * @author mazq
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2020/04/01 14:20  修改内容:
 * </pre>
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = {"/emp/{id}"})
    public Employee getEmp(@PathVariable("id")Integer id){
        Employee employee = this.employeeService.getEmp(id);
        return employee;
    }

}
