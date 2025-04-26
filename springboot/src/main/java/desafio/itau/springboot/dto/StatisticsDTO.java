package desafio.itau.springboot.dto;

import java.util.DoubleSummaryStatistics;

public record StatisticsDTO(long count, double sum, double avg, double min, double max) {

    public StatisticsDTO(DoubleSummaryStatistics statistics){
       this(
               statistics.getCount(),
               statistics.getSum(),
               statistics.getAverage(),
               statistics.getMin(),
               statistics.getMax()
       );
    }
}
