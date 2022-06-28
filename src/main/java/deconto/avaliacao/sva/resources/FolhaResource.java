package deconto.avaliacao.sva.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deconto.avaliacao.sva.datatransferobjects.FolhaCalculadaDTO;
import deconto.avaliacao.sva.datatransferobjects.FolhaDTO;
import deconto.avaliacao.sva.services.FolhaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/folha")
public class FolhaResource {
	
	@Autowired
	FolhaService folhaService;
	
	@PostMapping("/cadastrar")
	@ApiOperation("Cadastrar folha")
	public ResponseEntity<FolhaCalculadaDTO> findAll(@RequestBody FolhaDTO folhaDTO){

		FolhaCalculadaDTO result = folhaService.calcular(folhaDTO);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
}
