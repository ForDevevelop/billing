package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "work_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WorkDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long workerId;

    @Column(name = "worker_name")
    private String workerName;

    @Column(name = "timing")
    private String timing;

    @Column(name = "machine_no")
    private String machineNo;

    @Column(name = "shift")
    private String shift;

}