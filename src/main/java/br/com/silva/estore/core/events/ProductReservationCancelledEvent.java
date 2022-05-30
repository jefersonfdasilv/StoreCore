package br.com.silva.estore.core.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductReservationCancelledEvent {

	private String productId;
	private int quantity;
	private String orderId;
	private String userId;
	private String reason;

}
