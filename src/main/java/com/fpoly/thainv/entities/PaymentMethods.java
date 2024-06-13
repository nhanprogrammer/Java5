package com.fpoly.thainv.entities;
// Generated Jun 6, 2024, 12:44:43 AM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * PaymentMethods generated by hbm2java
 */
@Entity
@Table(name = "payment_methods", schema = "dbo", catalog = "TMDT")
public class PaymentMethods implements java.io.Serializable {

	private Integer paymentMethodId;
	private String methodName;
	private Set<Payments> paymentses = new HashSet<Payments>(0);

	public PaymentMethods() {
	}

	public PaymentMethods(String methodName) {
		this.methodName = methodName;
	}

	public PaymentMethods(String methodName, Set<Payments> paymentses) {
		this.methodName = methodName;
		this.paymentses = paymentses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "payment_method_id", unique = true, nullable = false)
	public Integer getPaymentMethodId() {
		return this.paymentMethodId;
	}

	public void setPaymentMethodId(Integer paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	@Column(name = "method_name", nullable = false, length = 50)
	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paymentMethods")
	public Set<Payments> getPaymentses() {
		return this.paymentses;
	}

	public void setPaymentses(Set<Payments> paymentses) {
		this.paymentses = paymentses;
	}

}