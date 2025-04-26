package desafio.itau.springboot.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    @NotNull
    @Positive
    private double valor;

    @NotNull
    @PastOrPresent
    private OffsetDateTime dataHora;
}
