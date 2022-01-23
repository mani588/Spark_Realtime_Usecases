import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class SparkExample {
    public long myCounter(Dataset<Row> df){
        return df.count();
    }
}
