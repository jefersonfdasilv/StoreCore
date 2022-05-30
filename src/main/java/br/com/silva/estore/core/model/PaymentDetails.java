package br.com.silva.estore.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentDetails {
	private String name;
	private String cardNumber;
	private int validUntilMonth;
	private int validUntilYear;
	private String cvv;

}