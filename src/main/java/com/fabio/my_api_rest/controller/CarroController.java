/**
 * 
 */
package com.fabio.my_api_rest.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabio.my_api_rest.model.Carro;
import com.fabio.my_api_rest.service.ICarroService;

/**
 * @author fabio
 *
 */

//seto a clase a ser um controller
@RestController
//nome da api
@RequestMapping("carro")
public class CarroController {
	
	@Autowired
	private ICarroService carroService;
	
	@GetMapping
	public List<String> getCarro() {
		return this.carroService.getCarro();
	}

	@GetMapping(value = "/{id}")
	public Carro getCarroById(@PathVariable("id") int id) {

		return this.carroService.getCarroById(id);
	}
	
	@PostMapping(consumes = "application/json")
	public void saveCarro(@RequestBody Carro carro) throws ParseException {
		Carro c = carro;
		System.out.println("##################");
		System.out.println("ID "+c.getId());
		System.out.println("Nome "+c.getNome());
		System.out.println("Cor "+c.getCor());
		System.out.println("Ano "+c.getData_fab());
		System.out.println("##################");
		
//		System.out.println("nome do carro "+nm_carro);
//		Carro carro = new Carro();
//		carro.setNome(nm_carro);
//		carro.setCor(cor);
//		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
//		Date data = formato.parse(data_fabricacao);
//		carro.setData_fab(data);
		this.carroService.saveCarro(carro);
		
	}

}
