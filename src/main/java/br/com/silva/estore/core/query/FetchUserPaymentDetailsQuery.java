package br.com.silva.estore.core.query;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FetchUserPaymentDetailsQuery {
    private String userId;
}
