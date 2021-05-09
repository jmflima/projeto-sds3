package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SeleSumDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String SallerName;
	private Double sum;
	
	public SeleSumDto() {
	}

	public SeleSumDto(Seller seller, Double sum) {
		SallerName = seller.getName();
		this.sum = sum;
	}

	public String getSallerName() {
		return SallerName;
	}

	public void setSallerName(String sallerName) {
		SallerName = sallerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
