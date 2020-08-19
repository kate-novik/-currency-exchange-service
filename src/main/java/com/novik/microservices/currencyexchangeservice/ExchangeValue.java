package com.novik.microservices.currencyexchangeservice;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ExchangeValue DTO.
 * @author Kate Novik
 */
@NoArgsConstructor
@Setter
@Getter
public class ExchangeValue {

  private Long id;
  private String from;
  private String to;
  private BigDecimal conversionMultiple;

  private int port;

  public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;

  }
}
