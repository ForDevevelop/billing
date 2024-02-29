package com.example.demo.controller;

import com.example.demo.entity.WorkDetails;
import com.example.demo.service.WorkDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkDetailsController {

    @Autowired
    private WorkDetailsService workDetailsService;

    @PostMapping("/work")
    public WorkDetails saveWorkDetails(@RequestBody WorkDetails workDetails) {
        return workDetailsService.saveWorkDetails(workDetails);
    }

    @GetMapping("/work")
    public List<WorkDetails> fetchWorkDetails(){
        return workDetailsService.fetchWorkDetails();
    }

    @GetMapping("/work/{id}")
    public WorkDetails fetchWorkDetailsById(@PathVariable("id") long workerId){
        return workDetailsService.fetchWorkDetailsById(workerId);
    }
    @DeleteMapping("/work/{id}")
    public String deleteDepartmentById(@PathVariable("id") long workerId){
        workDetailsService.deleteWorkDetailsById(workerId);
        return "Worker's Details are Deleted Successfully!!";
    }

    @PutMapping("/work/{id}")
    public WorkDetails updateWorkDetails(@PathVariable("id") long workerId, @RequestBody WorkDetails workDetails){
        return workDetailsService.updateWorkDetails(workerId, workDetails);
    }

}
