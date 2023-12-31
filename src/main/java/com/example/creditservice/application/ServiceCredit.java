package com.example.creditservice.application;
import com.example.creditservice.model.Credit;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface ServiceCredit {
    public Mono<ResponseEntity<Credit>> createCredit(Credit CreditMono);
}
