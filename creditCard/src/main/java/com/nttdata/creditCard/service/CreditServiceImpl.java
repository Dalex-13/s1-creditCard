package com.nttdata.creditCard.service;

import com.nttdata.creditCard.entitys.Credit;
import com.nttdata.creditCard.repository.CreditRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CreditServiceImpl implements CreditService{

    private final CreditRepository repository;


    @Override
    public Flux<Credit> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Credit> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Credit> save(Credit credit) {
        return repository.save(credit);
    }

    @Override
    public Mono<Credit> updateById(String id, Credit credit) {
        return this.findById(id)
                .flatMap(entity -> this.save(credit))
                .switchIfEmpty( Mono.error(new Exception()));
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

}
