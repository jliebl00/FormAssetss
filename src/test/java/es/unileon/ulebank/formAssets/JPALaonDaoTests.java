package es.unileon.ulebank.formAssets;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.unileon.ulebank.formAssets.domain.Loan;
import es.unileon.ulebank.formAssets.repository.JPALoanDao;
import es.unileon.ulebank.formAssets.repository.LoanDao;


public class JPALaonDaoTests{
	private ApplicationContext context;
	private LoanDao loanDao;
	
	@Before
	public void setUp(){
		context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
		loanDao =  (LoanDao) context.getBean("loanDao");
	}
	 @Test
	    public void testGetProductList() {
		 	
	        List<Loan> loans = loanDao.getLoans();
	        assertEquals(loans.size(), 1);	        
	         
	 }
	 
	 @Test
	    public void testSaveProduct() {
	        List<Loan> loans =  loanDao.getLoans();
	       
	        
	        Loan l=loans.get(0);
	      
	        l.setCancelFee(200.00);
	        loanDao.saveLoan(l);;
	        
	        List<Loan> updateLoans=loanDao.getLoans();
	     
	        Loan l2 = updateLoans.get(0);
	        assertEquals(l2.getCancelFee(), 200, 0);
	    }
}
 