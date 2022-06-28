package deconto.avaliacao.sva.datatransferobjects;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FolhaDTO {
	
	@ApiModelProperty(value = "5", example = "5")
	private int mes;
	
	@ApiModelProperty(value = "2022", example = "2022")
	private int ano;
	
	@ApiModelProperty(value = "1000", example = "1000")
	private int horas;
	
	@ApiModelProperty(value = "50", example = "50")
	private int valor;
	
	private FuncionarioDTO funcionario;
}
