import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerStateCodeTest {

    private static final String INDIA_CENSUS_CSV_PATH = "F:\\indian-state-census-analyzer\\src\\main\\resources\\IndiaStateCode.csv";

    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_CENSUS_CSV_PATH);
            Assert.assertEquals(37, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

}