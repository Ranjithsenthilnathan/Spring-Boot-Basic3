package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class AddressModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productname;
    private String fixedprice;
    private String purposetosale;
    private String estimattimeline;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getFixedprice() {
		return fixedprice;
	}
	public void setFixedprice(String fixedprice) {
		this.fixedprice = fixedprice;
	}
	public String getPurposetosale() {
		return purposetosale;
	}
	public void setPurposetosale(String purposetosale) {
		this.purposetosale = purposetosale;
	}
	public String getEstimattimeline() {
		return estimattimeline;
	}
	public void setEstimattimeline(String estimattimeline) {
		this.estimattimeline = estimattimeline;
	}
	@Override
	public String toString() {
		return "AddressModel [id=" + id + ", productname=" + productname + ", fixedprice=" + fixedprice
				+ ", purposetosale=" + purposetosale + ", estimattimeline=" + estimattimeline + "]";
	}
}
