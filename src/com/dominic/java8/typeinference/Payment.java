package com.dominic.java8.typeinference;

import java.math.BigDecimal;

public class Payment {
	
	private String product;
	
	private Integer authCode;
	
	private String terminalId;
	
	private Boolean isPosTrx;
	
	private String arn;
	
	private BigDecimal trxAmount;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getAuthCode() {
		return authCode;
	}

	public void setAuthCode(Integer authCode) {
		this.authCode = authCode;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public Boolean getIsPosTrx() {
		return isPosTrx;
	}

	public void setIsPosTrx(Boolean isPosTrx) {
		this.isPosTrx = isPosTrx;
	}

	public String getArn() {
		return arn;
	}

	public void setArn(String arn) {
		this.arn = arn;
	}

	public BigDecimal getTrxAmount() {
		return trxAmount;
	}

	public void setTrxAmount(BigDecimal trxAmount) {
		this.trxAmount = trxAmount;
	}

}
