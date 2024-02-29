package com.example.demo.service;

import com.example.demo.entity.WorkDetails;
import com.example.demo.repository.WorkDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class WorkDetailsServiceImpl implements WorkDetailsService{
    @Autowired
    private WorkDetailsRepository workDetailsRepository;
    @Override
    public WorkDetails saveWorkDetails(WorkDetails workDetails) {
        return workDetailsRepository.save(workDetails);
    }
    @Override
    public List<WorkDetails> fetchWorkDetails() {
        return workDetailsRepository.findAll();
    }
    @Override
    public WorkDetails fetchWorkDetailsById(long workerId) {
        return workDetailsRepository.findById(workerId).get();
    }
    @Override
    public void deleteWorkDetailsById(long workerId) {
        workDetailsRepository.deleteById(workerId);
    }

    @Override
    public WorkDetails updateWorkDetails(long workerId, WorkDetails workDetails) {
        WorkDetails workDetailsForUpdate = workDetailsRepository.findById(workerId).get();

        if (Objects.nonNull(workDetails.getWorkerName()) && !"".equalsIgnoreCase(workDetails.getWorkerName())){
            workDetailsForUpdate.setWorkerName(workDetails.getWorkerName());
        }
        if (Objects.nonNull(workDetails.getTiming()) && !"".equalsIgnoreCase(workDetails.getTiming())){
            workDetailsForUpdate.setTiming(workDetails.getTiming());
        }
        if (Objects.nonNull(workDetails.getMachineNo()) && !"".equalsIgnoreCase(workDetails.getMachineNo())){
            workDetailsForUpdate.setMachineNo(workDetails.getMachineNo());
        }
        if (Objects.nonNull(workDetails.getShift()) && !"".equalsIgnoreCase(workDetails.getShift())){
            workDetailsForUpdate.setShift(workDetails.getShift());
        }
        return workDetailsRepository.save(workDetailsForUpdate);
    }

}
