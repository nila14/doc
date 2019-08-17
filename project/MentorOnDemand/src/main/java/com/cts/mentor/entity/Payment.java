package com.cts.mentor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "payment")

public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "mentor_id")
	private int mentor_id;
	
	@Column(name = "training_id")
	private int training_id;

	@Column(name = "txn_type")
	private String txn_type;

	@Column(name = "amount")
	private long amount;

	@Column(name = "datetime")
	private String datetime;

	@Column(name = "remarks")
	private String remarks;

	public Payment(int id, int mentor_id, int training_id, String txn_type, long amount, String datetime,
			String remarks) {
		super();
		this.id = id;
		this.mentor_id = mentor_id;
		this.training_id = training_id;
		this.txn_type = txn_type;
		this.amount = amount;
		this.datetime = datetime;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(int mentor_id) {
		this.mentor_id = mentor_id;
	}

	public int getTraining_id() {
		return training_id;
	}

	public void setTraining_id(int training_id) {
		this.training_id = training_id;
	}

	public String getTxn_type() {
		return txn_type;
	}

	public void setTxn_type(String txn_type) {
		this.txn_type = txn_type;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", mentor_id=" + mentor_id + ", training_id=" + training_id + ", txn_type="
				+ txn_type + ", amount=" + amount + ", datetime=" + datetime + ", remarks=" + remarks + "]";
	}
	
	

}
