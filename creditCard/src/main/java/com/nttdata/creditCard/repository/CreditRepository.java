package com.nttdata.creditCard.repository;

import com.nttdata.creditCard.entitys.Credit;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends ReactiveCrudRepository<Credit, String> {
}
