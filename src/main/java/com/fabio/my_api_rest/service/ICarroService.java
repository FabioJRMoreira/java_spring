package com.fabio.my_api_rest.service;

import java.util.List;

import com.fabio.my_api_rest.model.Carro;

public interface ICarroService {
	 
	public List<String> getCarro();
	
	public Carro getCarroById(int id);
	
	public void saveCarro(Carro carro);
	
	
}
