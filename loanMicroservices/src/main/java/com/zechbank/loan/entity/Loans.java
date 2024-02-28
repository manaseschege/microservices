package com.zechbank.loan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Loans {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long loansId;
    private  String mobileNumber;
    private String loanNumber;
    private String loanType;
    private  int totalLoan;
    private int amoundPaid;
    private int outstandingAmount;


}
