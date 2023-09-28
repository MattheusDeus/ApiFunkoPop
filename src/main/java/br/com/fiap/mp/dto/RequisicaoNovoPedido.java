//RM95021 - Matheus de Deus

		package br.com.fiap.mp.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RequisicaoNovoPedido (
		@NotBlank(message = "Atributo nome não pode estar vazio")
		@Size(min = 5, max = 250, message = "Atributo nome tem que ser de 5 a 250 caracteres")
		String nomeProduto,
		@NotBlank(message = "Atributo produto não pode estar vazio")
		String urlProduto,
		@NotBlank(message = "Atributo url não pode estar vazio")
		String urlImagem,
		@NotBlank(message = "Atributo url não pode estar vazio")
		String urlImagemCaixa,
		String descricao
) {

}