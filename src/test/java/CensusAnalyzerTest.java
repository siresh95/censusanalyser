import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerTest {

    private static final String INDIA_CENSUS_CSV_PATH_HEADER = "C:\\Users\\singh\\IdeaProjects\\censusanalyser\\src\\main\\resources\\IndiaStateCensusDataHeader.csv";

    //UseCase 1.5 Path is correct but in csv file header incorrect
    @Test
    public void givenIndianCensusCSVFileHaveIncorrectHeader() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_PATH_HEADER);
            Assert.assertTrue("Wrong header in csv file", true);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }

    }

}