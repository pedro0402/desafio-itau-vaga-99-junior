package desafio.itau.springboot.mappers;

import desafio.itau.springboot.dto.TransactionDTO;
import desafio.itau.springboot.model.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    Transaction toEntity(TransactionDTO transactionDTO);
}
