package es.unileon.ulebank.formAssets.repository;

import java.util.List;

import es.unileon.ulebank.formAssets.domain.Loan;

public interface LoanDao {
	public List<Loan> getLoans();
	public void saveLoan(Loan loan);
	
}
