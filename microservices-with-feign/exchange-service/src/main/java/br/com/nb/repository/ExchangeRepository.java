package br.com.nb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nb.model.Exchange;

public interface ExchangeRepository extends JpaRepository<Exchange,Long> {

    Exchange findByFromAndTo(String from, String to);
    
}
