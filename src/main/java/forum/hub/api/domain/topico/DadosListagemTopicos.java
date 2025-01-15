package forum.hub.api.domain.topico;

import java.time.LocalDateTime;

public record DadosListagemTopicos(String titulo,
                                   String mensagem,
                                   LocalDateTime data,
                                   StatusDoTopico status,
                                   String autor,
                                   Curso curso) {

    public DadosListagemTopicos(Topico topico){
        this(topico.getTitulo(), topico.getMensagem(), topico.getData(),
                topico.getStatus(), topico.getAutor(), topico.getCurso());
    }
}
