package forum.hub.api.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensagem;

    private String autor;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    private LocalDateTime data = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private StatusDoTopico status;

    public Topico(DadosCadastroTopico dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.autor = dados.autor();
        this.curso = dados.curso();
        this.status = StatusDoTopico.ATIVO;
    }

    public void atualizarConteudo(@Valid DadosAtualizacaoTopico dados) {
        if (dados.titulo() != null)  {
            this.titulo = dados.titulo();
        }
        if (dados.mensagem() != null) {
            this.mensagem = dados.titulo();
        }
    }
}
