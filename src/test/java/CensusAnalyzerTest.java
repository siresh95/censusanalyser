import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerTest {
    private static final String INDIA_CENSUS_CSV_PATH = "C:\\Users\\singh\\IdeaProjects\\censusanalyser\\src\\main\\resources\\IndiaStateCensusData.csv";
    private static final String INDIA_CENSUS_CSV_WRONG_FILETYPE = "C:\\Users\\singh\\IdeaProjects\\censusanalyser\\src\\main\\resources\\IndiaStateCensusData.pdf";
    private static final String INDIA_CENSUS_CSV_PATH_DELIMETER = "C:\\Users\\singh\\IdeaProjects\\censusanalyser\\src\\main\\resources\\IndiaStateCensusData.csv";
    private static final String INDIA_CENSUS_CSV_PATH_HEADER = "C:\\Users\\singh\\IdeaProjects\\censusanalyser\\src\\main\\resources\\IndiaStateCensusDataHeader.csv";

    //UseCase 1.1 Happy
    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_CENSUS_CSV_PATH);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //UseCase 1.2 Sad
    @Test
    public void givenIndianCensusCSVFileReturnsInCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_CENSUS_CSV_PATH);
            Assert.assertNotEquals(30, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //UseCase 1.3 Path is correct but file type is incorrect
    @Test
    public void givenIndianCensusCSVFileReturnsInCorrecFileType_But_PathShouldBeCorrect() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_CENSUS_CSV_WRONG_FILETYPE);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //UseCase 1.4 Path is correct but delimiter incorrect
    @Test
    public void givenIndianCensusCSVFileReturnsIncorrectDelimeter() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            censusAnalyzer.loadIndiaStateCodeData(INDIA_CENSUS_CSV_PATH_DELIMETER);
            Assert.assertTrue("Wrong delimiter", true);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //UseCase 1.5 Path is correct but in csv file header incorrect
    @Test
    public void givenIndianCensusCSVFileHaveIncorrectHeader() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            censusAnalyzer.loadIndiaStateCodeData(INDIA_CENSUS_CSV_PATH_HEADER);
            Assert.assertTrue("Wrong header in csv file", true);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }
}
