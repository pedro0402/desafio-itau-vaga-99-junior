package desafio.itau.springboot.service;

import desafio.itau.springboot.exceptions.UnprocessableTransactionException;
import desafio.itau.springboot.model.Transaction;
import org.springframework.stereotype.Service;
import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

@Service
public class TransactionService {

    private final Queue<Transaction> transactions = new ConcurrentLinkedDeque<>();

    public void save(Transaction transaction) {
        if (transaction.getValor() <= 0) {
            throw new UnprocessableTransactionException();
        }
        transactions.add(transaction);
    }

    public void clearTransaction() {
        transactions.clear();
    }

    public DoubleSummaryStatistics getStatistics() {
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
                //.filter(t -> t.getDataHora().isAfter(now.minusSeconds(60)))
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();
    }

}
