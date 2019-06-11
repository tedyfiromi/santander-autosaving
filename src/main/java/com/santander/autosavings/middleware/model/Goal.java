package com.santander.autosavings.middleware.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document
public class Goal {
	
	@Id
	public String id;
	public String title;
	public double total;
	public double saved;
	public double recorrence;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	public LocalDate createdAt;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	public LocalDate updatedAt;
	
	@DBRef
	public List<TransactionGoal> transactionGoals; 
	
	public Goal(String id, String title, double total, double saved, double recorrence, LocalDate createdAt,
			LocalDate updatedAt, List<TransactionGoal> transactionGoals) {
		super();
		this.id = id;
		this.title = title;
		this.total = total;
		this.saved = saved;
		this.recorrence = recorrence;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.transactionGoals = transactionGoals;
	}

	public Goal() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getSaved() {
		return saved;
	}

	public void setSaved(double saved) {
		this.saved = saved;
	}

	public double getRecorrence() {
		return recorrence;
	}

	public void setRecorrence(double recorrence) {
		this.recorrence = recorrence;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<TransactionGoal> getTransactionGoals() {
		return transactionGoals;
	}

	public void setTransactionGoal(List<TransactionGoal> transactionGoals) {
		this.transactionGoals = transactionGoals;
	}
	
}
