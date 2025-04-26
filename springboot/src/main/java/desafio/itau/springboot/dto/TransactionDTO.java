package desafio.itau.springboot.dto;


import jakarta.validation.constraints.PastOrPresent;

import java.time.OffsetDateTime;

public record TransactionDTO(double valor, @PastOrPresent OffsetDateTime dataHora) {
}
