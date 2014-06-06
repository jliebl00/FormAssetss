package es.unileon.ulebank.formAssets;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import es.unileon.ulebank.assets.support.LoanList;
import es.unileon.ulebank.formAssets.domain.Loan;
import es.unileon.ulebank.formAssets.repository.LoanDao;
import es.unileon.ulebank.formAssets.service.ListLoan;

public class ListLoanTest {
	private ListLoan listLoan;
	List<Loan> loans;
	
	@Before
	public void setUp(){
		listLoan=new ListLoan();
		loans=new ArrayList<Loan>();
		Loan loan=new Loan();

		loan.setCancelFee(1000);
		loan.setModifyFee(1000);
		loan.setOpenningFee(1000);
		loan.setStudyFee(1000);
		loan.setTotalLoan(10000000);
		loans.add(loan);
		LoanDao loanDao = (LoanDao) new InMemoryLoanDao(loans);
        listLoan.setLoanDao(loanDao);
		
	}
	 @Test
	    public void testGetProductsWithNoProducts() {
	        listLoan = new ListLoan();
	        listLoan.setLoanDao((LoanDao) new InMemoryLoanDao(null));
	        assertNull(listLoan.getLoans());
	    }
	 @Test
	 public void testGetLoans(){
		 List<Loan> loans=listLoan.getLoans();
		 assertEquals(loans.get(0).getCancelFee(), 1000,0);
		 assertEquals(loans.get(0).getModifyFee(), 1000,0);
		 assertEquals(loans.get(0).getStudyFee(), 1000,0);
		 assertEquals(loans.get(0).getOpenningFee(), 1000,0);
	 }
	 
}
