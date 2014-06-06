package es.unileon.ulebank.formAssets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import es.unileon.ulebank.formAssets.domain.Comisions;
import es.unileon.ulebank.formAssets.domain.Loan;
import es.unileon.ulebank.formAssets.repository.LoanDao;
@Component
public class ListLoan {
	
	private static final long serialVersionUID = 1L;
	@Autowired
    private LoanDao loanDao;
	
	
    public void setLoanDao(LoanDao loanDao) {
        this.loanDao = loanDao;
    }

    public List<Loan> getLoans() {
        return loanDao.getLoans();
    }
    public void saveComision(Comisions comision){
    	Loan loan=loanDao.getLoans().get(0);
    	loan.setCancelFee(comision.getCancelFee());
		loan.setModifyFee(comision.getModifyFee());
		loan.setOpenningFee(comision.getOpenningFee());
		loan.setStudyFee(comision.getStudyFee());
		loanDao.saveLoan(loan);
		//CAmbiar esto por secuencia sql
    }
    
    
    
}
