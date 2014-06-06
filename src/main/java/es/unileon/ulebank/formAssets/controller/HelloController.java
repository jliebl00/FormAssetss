package es.unileon.ulebank.formAssets.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.ulebank.formAssets.domain.Loan;
import es.unileon.ulebank.formAssets.service.ListLoan;

@Controller
public class HelloController {
	
	 @Autowired
	 ListLoan loans;
	
	 @RequestMapping(value="/hello.htm")
	 public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	    
		 	int last=this.loans.getLoans().size()-1;
	        Map<String, Object> myModel = new HashMap<String, Object>();
	        myModel.put("totalLoan", this.loans.getLoans().get(last).getTotalLoan());
	        myModel.put("cancelFee", this.loans.getLoans().get(last).getTotalLoan());
	        myModel.put("modifyFee", this.loans.getLoans().get(last).getTotalLoan());
	        myModel.put("openningFee", this.loans.getLoans().get(last).getTotalLoan());
	        myModel.put("studyFee", this.loans.getLoans().get(last).getTotalLoan());
	        
	        return new ModelAndView("hello", "model", myModel);
	    }
	

	public void setLoan(ListLoan loans) {
		this.loans = loans;
	}

	
	 
	 
}




