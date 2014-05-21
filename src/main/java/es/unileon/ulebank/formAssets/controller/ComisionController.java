package es.unileon.ulebank.formAssets.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.unileon.ulebank.formAssets.model.Comisions;
import es.unileon.ulebank.formAssets.model.Loan;

@Controller
@RequestMapping(value="/comision.htm")
public class ComisionController {
	
	@Autowired
	private Loan loan;

	@RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid Comisions comision, BindingResult result)
    {
		
		
		this.loan.setCancelFee(comision.getCancelFee());
		this.loan.setModifyFee(comision.getModifyFee());
		this.loan.setOpenningFee(comision.getOpenningFee());
		this.loan.setStudyFee(comision.getStudyFee());

        return "redirect:/hello.htm";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected Comisions formBackingObject(HttpServletRequest request) throws ServletException {
        Comisions commisions = new Comisions();
        
        
        return commisions;
    }

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

   
	
}
