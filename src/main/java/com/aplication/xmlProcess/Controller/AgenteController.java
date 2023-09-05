package com.aplication.xmlProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplication.xmlProcess.Service.AgenteService;

import Repository.AgenteRepository;

@RestController
@RequestMapping("/agentes")
public class AgenteController {

	@Autowired
	private AgenteService agenteService;

	@Autowired
	private AgenteRepository agenteRepository;

	// Recebimento do Xml
	@PostMapping("/xml")
	public ResponseEntity<String> receberXml(@RequestBody String xml) throws Exception {
		agenteService.processarXml(xml);
		return ResponseEntity.ok("XML recebido e processado com sucesso!");
	}

	// Busca por região
	@GetMapping("/consolidadoPorRegiao")
	public String consolidadoPorRegiao(Model model) {
		List<Object[]> dados = agenteRepository.dadosConsolidadosPorRegiao();
		model.addAttribute("dadosConsolidados", dados);
		return "consolidadoPorRegiao";
	}

}
