import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerStateCodeTest {

 wrongRecord
    private static final String INDIA_STATE_CSV_PATH = "C:\\Users\\singh\\IdeaProjects\\censusanalyser\\src\\main\\resources\\IndiaStateCode.csv";

    //2.1 Happy Test case for correct record match

 RecordMatch
    private static final String INDIA_CENSUS_CSV_PATH = "C:\\Users\\singh\\IdeaProjects\\censusanalyser\\src\\main\\resourcesresources\\IndiaStateCode.csv";

    private static final String INDIA_CENSUS_CSV_PATH = "C:\\Users\\singh\\IdeaProjects\\censusanalyser\\src\\main\\resources\\IndiaStateCode.csv";


    @Test
    public void givenIndianStateCSVFileReturnsCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_STATE_CSV_PATH);
            Assert.assertEquals(37, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

 wrongRecord
    //2.2 Sad Test case for wrong record
    @Test
    public void givenIndianStateCSVFileReturnsInCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_STATE_CSV_PATH);
            Assert.assertEquals(40, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

}

}

