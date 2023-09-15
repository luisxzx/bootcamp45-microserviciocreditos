package com.example.creditservice.domain.repository;
import com.example.creditservice.domain.document.CreditEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Component;

/**
 * Interfaz que define un RepositoryCredit para CreditEntity.
 * */
@Component
public interface RepositoryCredit extends ReactiveMongoRepository<CreditEntity, String> {

}
