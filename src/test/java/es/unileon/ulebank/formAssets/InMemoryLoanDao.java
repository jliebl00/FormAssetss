package es.unileon.ulebank.formAssets;

import java.util.List;

import es.unileon.ulebank.formAssets.domain.Loan;
import es.unileon.ulebank.formAssets.repository.LoanDao;


public class InMemoryLoanDao implements LoanDao{
		
		
	private List<Loan> loans;

	

	

	public InMemoryLoanDao(List<Loan> loans) {
		this.loans = loans;
	}

	@Override
	public void saveLoan(Loan loan) {
		
		
	}

	@Override
	public List<Loan> getLoans() {
		return loans;
	}

}
