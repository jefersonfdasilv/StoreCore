/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.silva.estore.core.events;

import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class PaymentProcessedEvent {
	private String orderId;
	private String paymentId;
}
