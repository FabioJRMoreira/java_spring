package com.fabio.my_api_rest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabio.my_api_rest.model.Carro;
import com.fabio.my_api_rest.repository.ICarroRepository;
import com.fabio.my_api_rest.service.ICarroService;

@Service
public class CarroServices implements ICarroService {

	@Autowired
	private ICarroRepository carroRepository;

	public List<String> getCarro() {
		List<String> carros = new ArrayList<String>();

		carros.add("Opala");
		carros.add("Jouney");
		carros.add("Mustang");
		carros.add("Civic");
		carros.add("Impala");

		return carros;
	}

	public Carro getCarroById(int id) {
		Optional<Carro> optCarro = this.carroRepository.findById(id);
		if(!optCarro.isPresent() ) {
			return new Carro();
		}
		return optCarro.get();
	}

}
