package com.dagcoin.domain;

/**
 * Response class for POST /transaction/make
 * 
 * @author shubhrapahwa
 *
 */
public class TransactionResponse {
	
	private String transactionId;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
}
