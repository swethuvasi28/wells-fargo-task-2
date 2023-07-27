package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;

@Entity
public class financialAdvisor {
    @Id
    @GeneratedValue(stratergy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    @ManyToOne

    private entity.FinancialAdvisor financialAdvisor;



}
