package com.nttdata.creditCard.service;

import com.nttdata.creditCard.entitys.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {

    public Flux<Credit> findAll();

    public Mono<Credit> findById(String id);

    public Mono<Credit> save(Credit credit);

    public Mono<Credit> updateById(String id, Credit credit);

    public Mono<Void> delete(String id);

}
