package br.com.silva.estore.core.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import br.com.silva.estore.core.model.PaymentDetails;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProcessPaymentCommand {

	@TargetAggregateIdentifier
	private String paymentId;
	private String orderId;
	private PaymentDetails paymentDetails;

}
