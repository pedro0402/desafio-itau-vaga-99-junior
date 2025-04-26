package desafio.itau.springboot.controller;

import desafio.itau.springboot.dto.TransactionDTO;
import desafio.itau.springboot.mappers.TransactionMapper;
import desafio.itau.springboot.model.Transaction;
import desafio.itau.springboot.service.TransactionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transacao")
public class TransactionController {

    private final TransactionService transactionService;
    private final TransactionMapper transactionMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTransaction(@Valid @RequestBody TransactionDTO transactionDTO) {
        transactionService.save(transactionMapper.toEntity(transactionDTO));
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void deleteTransaction(){
        transactionService.clearTransaction();
    }

}
