package com.novik.microservices.currencyexchangeservice;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Entity
public class ExchangeValue {

  @Id
  private Long id;
  @Column(name = "currency_from")
  private String from;
  @Column(name = "currency_to")
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
