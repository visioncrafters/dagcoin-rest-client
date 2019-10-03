package com.dagcoin.service;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dagcoin.domain.CustomerWalletBalanceResponse;
import com.dagcoin.domain.DagCoinParameters;
import com.dagcoin.domain.DagEnvironment;
import com.dagcoin.domain.ExchangeRateResponse;
import com.dagcoin.domain.PaperWalletResponse;
import com.dagcoin.domain.TransactionResponse;
import com.dagcoin.domain.ValidateWalletResponse;
import com.dagcoin.domain.WalletBalanceResponse;
import com.dagcoin.exception.DagCoinRestClientException;

public class DagCoinApiClientServiceTest {
	
	/*
	
	private static final Logger log = LoggerFactory.getLogger(DagCoinApiClientServiceTest.class.getName());
	private DagCoinApiClientService service;
	private String walletId;
	private DagCoinParameters params;
	
	@Before
	public void setUp() throws DagCoinRestClientException {
		this.params = new DagCoinParameters(DagEnvironment.DEVELOPMENT, "", "", "", "", "");
		this.service = new DagCoinApiClientService(this.params);
		readProperties();
	}

	@Test
	public void testGetExchangeRate() throws DagCoinRestClientException {
		ExchangeRateResponse response = service.getExchangeRate();
		log.info("Response :: Rate - " + response.getRate() + 
						 " :: Currency pair - " + response.getCurrencyPair());
	}
	
	
	@Test
	public void testValidateWalletAddress() throws DagCoinRestClientException {
		ValidateWalletResponse response = service.validateWalletAddress(this.walletId);
		log.info("Response :: isValid - " + response.getIsValid());
	}
	
	@Test(expected = DagCoinRestClientException.class)
	public void testGetBalance() throws DagCoinRestClientException {
		WalletBalanceResponse response = service.getBalance(this.walletId);
		log.info("Response :: Amount - " + response.getAmount() + 
						 " :: Pending - " + response.getPending());
	}
	
	@Test
	public void testGetCustomerBalance() throws DagCoinRestClientException {
		CustomerWalletBalanceResponse response = service.getCustomerBalance(this.walletId);
		log.info("Response :: Amount - " + response.getBalance());
	}
	
	@Test
	public void testGeneratePaperWallet() throws DagCoinRestClientException {
		PaperWalletResponse response = service.generatePaperWallet();
		log.info("Response :: Card ID - " 	+ response.getCardId() +
						 " :: Wallet ID - " + response.getWalletId() +
						 " :: ATM PIN - " 	+ response.getAtmPin());
	}

	@Test(expected = DagCoinRestClientException.class)
	public void testMakeTransaction() throws DagCoinRestClientException {
		TransactionResponse response = service.makeTransaction(this.walletId, "1", "DAG");
		log.info("Response :: Txn ID - " + response.getTransactionId());
	}
	
	private void readProperties() {
		Properties prop = new Properties();
		try {
			prop.load(DagCoinApiClientServiceTest.class.getResourceAsStream("/testConfig.properties"));
			this.walletId = prop.getProperty("WALLET_ID");
		} catch (IOException ex) {
			this.walletId = "OGNCQNQT43TDD5PFVIAG6AOK2R7AE3PD";
		}
	}
	
	*/
	
}
