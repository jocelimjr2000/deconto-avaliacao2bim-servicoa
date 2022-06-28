package deconto.avaliacao.sva.services;

import org.springframework.stereotype.Service;

import deconto.avaliacao.sva.datatransferobjects.FolhaCalculadaDTO;
import deconto.avaliacao.sva.datatransferobjects.FolhaDTO;

@Service("FolhaService")
public class FolhaService {
	
	public FolhaCalculadaDTO calcular(FolhaDTO folhaDTO) {
		
		FolhaCalculadaDTO folhaCalculadaDTO = new FolhaCalculadaDTO();
		
		float bruto = (float) (folhaDTO.getHoras() * folhaDTO.getValor());
		float inss = this.calcINSS(bruto);
		float fgts = (float) ((bruto * 8.0) / 100);
		float ir = this.calcIRRF(bruto);
		float liq = bruto - ir - inss;
		
		folhaCalculadaDTO.setMes(folhaDTO.getMes());
		folhaCalculadaDTO.setAno(folhaDTO.getAno());
		folhaCalculadaDTO.setHoras(folhaDTO.getHoras());
		folhaCalculadaDTO.setValor(folhaDTO.getValor());
		folhaCalculadaDTO.setBruto(bruto);
		folhaCalculadaDTO.setIrrf(ir);
		folhaCalculadaDTO.setInss(inss);
		folhaCalculadaDTO.setFgts(fgts);
		folhaCalculadaDTO.setLiquido(liq);
		folhaCalculadaDTO.setFuncionario(folhaDTO.getFuncionario());
		
		return folhaCalculadaDTO;
	}
	
	public float calcIRRF(float bruto) {

		// 27.5%
		if(bruto > 4664.68) {
			return (float)((bruto * 27.7) / 100);
		}
		
		// 22.5%
		if(bruto >= 3751.06) {
			return (float)((bruto * 22.5) / 100);
		}
		
		// 15.0%
		if(bruto > 2826.66) {
			return (float)((bruto * 15.5) / 100);
		}
		
		// 7.5%
		if(bruto >= 1903.99) {
			return (float)((bruto * 7.5) / 100);
		}

		// 0.0%
		return 0;
	}
	
	public float calcINSS(float bruto) {

		// 8.0%
		if(bruto <= 1693.72) {
			return (float) (bruto - ((bruto * 8.0) / 100));
		}
		
		// 9.0%
		if(bruto <= 2822.90) {
			return (float) (bruto - ((bruto * 9.0) / 100));
		}
		
		// 11.0%
		if(bruto <= 5645.80) {
			return (float) (bruto - ((bruto * 11.0) / 100));
		}
		
		return (float) 621.03;
	}
	
}
