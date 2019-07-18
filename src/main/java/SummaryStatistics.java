import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class SummaryStatistics {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = DoubleStream.generate(Math::random)
                .limit(1_000)
                .summaryStatistics();
        System.out.println(stats);

        System.out.println(stats.getAverage());
        System.out.println(stats.getSum()); // etc...
    }
}
