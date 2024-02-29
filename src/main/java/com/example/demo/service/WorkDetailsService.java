package com.example.demo.service;

import com.example.demo.entity.WorkDetails;

import java.util.List;

public interface WorkDetailsService {
    List<WorkDetails> fetchWorkDetails();

    WorkDetails saveWorkDetails(WorkDetails workDetails);

    WorkDetails fetchWorkDetailsById(long workerId);

    void deleteWorkDetailsById(long workerId);

    WorkDetails updateWorkDetails(long workerId, WorkDetails workDetails);
}

