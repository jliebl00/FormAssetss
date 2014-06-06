package es.unileon.ulebank.formAssets.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.unileon.ulebank.formAssets.domain.Loan;


@Repository(value="loanDao")
public class JPALoanDao implements LoanDao{
	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em){
		this.em = em;
	}

	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<Loan> getLoans() {
		
		List<Loan> loan=em.createQuery("select l from Loan l").getResultList();
		return loan;
	}
	
	
	@Transactional(readOnly=false)
	public void saveLoan(Loan loan) {
		em.merge(loan);
	}
	
}
