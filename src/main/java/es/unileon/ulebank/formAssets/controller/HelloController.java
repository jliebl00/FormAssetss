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

import es.unileon.ulebank.formAssets.model.Loan;

@Controller
public class HelloController {
	
	 @Autowired
	Loan loan;
	
	 @RequestMapping(value="/hello.htm")
	 public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	    
	        
	        Map<String, Object> myModel = new HashMap<String, Object>();
	        myModel.put("totalLoan", this.loan.getTotalLoan());
	        myModel.put("cancelFee", this.loan.getCancelFee());
	        myModel.put("modifyfee", this.loan.getModifyfee());
	        myModel.put("openningfee", this.loan.getOpenningfee());
	        myModel.put("studyFee", this.loan.getStudyFee());
	        
	        return new ModelAndView("hello", "model", myModel);
	    }
	

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	
	 
	 
}




