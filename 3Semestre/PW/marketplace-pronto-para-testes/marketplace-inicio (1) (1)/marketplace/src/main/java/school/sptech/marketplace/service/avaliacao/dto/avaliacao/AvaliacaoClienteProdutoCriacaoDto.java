package school.sptech.marketplace.service.avaliacao.dto.avaliacao;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AvaliacaoClienteProdutoCriacaoDto {

    @Size(min = 1, max = 255)
    private String comentario;

    @Min(0)
    @Max(5)
    @NotNull
    private Integer nota;

    @Min(1)
    @NotNull
    private Long compradorId;

    @Min(1)
    @NotNull
    private Long produtoId;

    public AvaliacaoClienteProdutoCriacaoDto(String comentario, Integer nota, Long id, Long id1) {
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Long getCompradorId() {
        return compradorId;
    }

    public void setCompradorId(Long compradorId) {
        this.compradorId = compradorId;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }
}
