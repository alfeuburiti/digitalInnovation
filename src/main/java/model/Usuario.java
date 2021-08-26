package model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Usuario {

    @Id
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime finalJornada;
    private LocalDateTime inicioJornada;
}
