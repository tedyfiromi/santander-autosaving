package com.santander.autosavings.middleware.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Scheduler {
	
	@Id
	public Long idScheduler;
	public String label;
	
	public Scheduler() {		
	}	
	
	public Scheduler(Long idScheduler, String label) {
		super();
		this.idScheduler = idScheduler;
		this.label = label;
	}

	public Long getIdScheduler() {
		return idScheduler;
	}
	public void setIdScheduler(Long idScheduler) {
		this.idScheduler = idScheduler;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return "Scheduler [idScheduler=" + idScheduler + ", label=" + label + "]";
	}

}
