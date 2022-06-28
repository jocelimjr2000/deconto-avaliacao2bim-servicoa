package deconto.avaliacao.sva.datatransferobjects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FolhaCalculadaDTO {

	private int mes;
	
	private int ano;
	
	private int horas;
	
	private int valor;
	
	private float bruto;
	
	private float irrf;
	
	private float inss;
	
	private float fgts;
	
	private float liquido;
	
	private FuncionarioDTO funcionario;
	
}
