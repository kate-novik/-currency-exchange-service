package com.novik.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

/**
 * CurrencyExchangeController.
 * @author Kate Novik
 */
@Log4j2
@RestController
public class CurrencyExchangeController {

  @Autowired
  private Environment env;

  @Autowired
  private ExchangeValueRepository exchangeValueRepository;

  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
    ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
//        new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));

    exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
    log.info("{}", exchangeValue);
    return exchangeValue;
  }

}
