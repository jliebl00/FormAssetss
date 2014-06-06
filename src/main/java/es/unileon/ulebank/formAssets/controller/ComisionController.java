package es.unileon.ulebank.formAssets.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.unileon.ulebank.formAssets.domain.Comisions;
import es.unileon.ulebank.formAssets.domain.Loan;
import es.unileon.ulebank.formAssets.service.ListLoan;

@Controller
@RequestMapping(value="/comision.htm")
public class ComisionController {
	
	@Autowired
	ListLoan loans;

	@RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid Comisions comision, BindingResult result)
    {
		
		
		loans.saveComision(comision);
		
        return "redirect:/hello.htm";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected Comisions formBackingObject(HttpServletRequest request) throws ServletException {
        Comisions commisions = new Comisions();
        
        
        return commisions;
    }

	public ListLoan getloans() {
		return loans;
	}

	public void setLoan(ListLoan loans) {
		this.loans = loans;
	}

   
	
}
