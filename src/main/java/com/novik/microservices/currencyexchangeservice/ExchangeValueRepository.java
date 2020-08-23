package com.novik.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ExchangeValueRepository.
 *
 * @author Kate Novik
 */
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

  ExchangeValue findByFromAndTo(String from, String to);

}
