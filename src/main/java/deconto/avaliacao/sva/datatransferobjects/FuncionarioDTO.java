package deconto.avaliacao.sva.datatransferobjects;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FuncionarioDTO {
	
	@ApiModelProperty(value = "33205245857", example = "33205245857")
	private String cpf;
	
	@ApiModelProperty(value = "Jocelim Rodrigues Abdala Junior", example = "Jocelim Rodrigues Abdala Junior")
	private String nome;

//	public FuncionarioDTO(FuncionarioEntity funcionarioEntity) {
//		this.cpf = funcionarioEntity.getCpf();
//		this.nome = funcionarioEntity.getNome();
//	}
}
