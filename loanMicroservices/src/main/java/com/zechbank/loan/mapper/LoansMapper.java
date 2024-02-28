package com.zechbank.loan.mapper;

import com.zechbank.loan.dto.LoansDto;
import com.zechbank.loan.entity.Loans;

public  class LoansMapper {
    public static LoansDto mapToLoansDto(Loans loans,LoansDto loansDto){
        loansDto.setLoanNumber(loans.getLoanNumber());
        loansDto.setLoanType(loans.getLoanType());
        loansDto.setMobileNumber(loans.getMobileNumber());
        loansDto.setTotalLoan(loans.getTotalLoan());
        loansDto.setAmountPaid(loans.getAmoundPaid());
        loansDto.setOutstandingAmount(loans.getOutstandingAmount());
return loansDto;
    }
    public  static Loans mapToLoans(LoansDto loansDto,Loans loans){
        loans.setLoanNumber(loansDto.getLoanNumber());
        loans.setLoanType(loansDto.getLoanType());
        loans.setMobileNumber(loansDto.getMobileNumber());
        loans.setTotalLoan(loansDto.getTotalLoan());
        loans.setAmoundPaid(loansDto.getAmountPaid());
        loans.setOutstandingAmount(loansDto.getOutstandingAmount());
        return loans;
    }
}
