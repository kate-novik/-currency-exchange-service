package com.novik.microservices.currencyexchangeservice;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ExchangeValue DTO.
 * @author Kate Novik
 */
@AllArgsConstructor
@Data
public class ExchangeValue {

  private Long id;
  private String from;
  private String to;
  private BigDecimal conversionMultiple;

}
