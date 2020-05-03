package wesley.leonardo1.Cartao.model;

import lombok.*;
/**
 @author Wesley de Souza e Leonardo Santos
 @since 02/05/2020 23:30
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cartao {

    @Getter @Setter
    private String cartao;
    @Getter @Setter
    private String numero;
    @Getter @Setter
    private String dataValidade;
    @Getter @Setter
    private String codigoSeguranca;
}
