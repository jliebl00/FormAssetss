package es.unileon.ulebank.formAssets;

import java.util.ArrayList;

import org.junit.Test;

import es.unileon.ulebank.formAssets.controller.ComisionController;
import es.unileon.ulebank.formAssets.domain.Loan;
import es.unileon.ulebank.formAssets.service.ListLoan;

public class ComisionControllerTests {
	 @Test
	    public void testHandleRequestView() throws Exception{		
	       ComisionController controller = new ComisionController();
	        ListLoan spm = new ListLoan();
	        spm.setLoanDao(new InMemoryLoanDao(new ArrayList<Loan>()));
	        controller.setLoan(spm);
	        //controller.setProductManager(new SimpleProductManager());
	    
	    }
    
}
