package es.unileon.ulebank.formAssets.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



@Entity
@Table(name="loans") 
public class Loan {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	double totalLoan;
	private double cancelFee;
	private double studyFee;
	private double openningFee;
	private double modifyFee;
	public double getTotalLoan() {
		return totalLoan;
	}
	public void setTotalLoan(double totalLoan) {
		this.totalLoan = totalLoan;
	}
	public double getCancelFee() {
		return cancelFee;
	}
	public void setCancelFee(double cancelFee) {
		this.cancelFee = cancelFee;
	}
	public double getStudyFee() {
		return studyFee;
	}
	public void setStudyFee(double studyFee) {
		this.studyFee = studyFee;
	}
	public double getOpenningFee() {
		return openningFee;
	}
	public void setOpenningFee(double openningFee) {
		this.openningFee = openningFee;
	}
	public double getModifyFee() {
		return modifyFee;
	}
	public void setModifyFee(double modifyFee) {
		this.modifyFee = modifyFee;
	}
	
	
	
	
	
}
