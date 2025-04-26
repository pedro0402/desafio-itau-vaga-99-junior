package desafio.itau.springboot.controller;

import desafio.itau.springboot.dto.StatisticsDTO;
import desafio.itau.springboot.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
@RequiredArgsConstructor
public class StatisticsController {
    private final TransactionService transactionService;

    @GetMapping
    public ResponseEntity<StatisticsDTO> getStatistics(){
        DoubleSummaryStatistics stats = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsDTO(stats));
    }
}
