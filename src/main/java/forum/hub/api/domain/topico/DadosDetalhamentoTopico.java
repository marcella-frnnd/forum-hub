package forum.hub.api.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(
        @NotNull
        Long id,

        String titulo,

        String mensagem,

        LocalDateTime data,

        Curso curso,

        StatusDoTopico status) {

    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData(),
                topico.getCurso(), topico.getStatus());
    }
}
