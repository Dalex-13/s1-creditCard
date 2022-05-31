package com.nttdata.creditCard.controller;


import com.nttdata.creditCard.entitys.Credit;
import com.nttdata.creditCard.service.CreditService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CreditController {

    private final CreditService service;



    @PostMapping("/add")
    public Mono<Credit> registrar(@RequestBody Credit credit){
        log.info("creando tipo de credito");
        return service.save(credit);
    }

    @GetMapping("/listar")
    public Flux<Credit> listAll(){
        log.info("listando los creditos");
        return service.findAll();
    }


    @GetMapping("/listar/{id}")
    public Mono<Credit> listById(@PathVariable String id){
        log.info("buscando tipo de credito por ID");
        return service.findById(id);
    }

    @PutMapping("/actualizar/{id}")
    public Mono<Credit> putById(@PathVariable String id, @RequestBody Credit credit){
        log.info("Actualizando credito por Id");
        return service.updateById(id, credit);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteById(@PathVariable String id){
        log.info("Eliminando credito por Id");
        return service.delete(id);
    }

}
