package com.fabio.my_api_rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabio.my_api_rest.model.Carro;

@Repository
public interface ICarroRepository extends JpaRepository<Carro, Integer> {
      public Optional<Carro> getById(int id);
}
