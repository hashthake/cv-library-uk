package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "JobSearch")
    public static Object[][] jobSearchData(){
        return new Object[][]{
                {"Tester", "Harrow", "up to 5 miles".trim(), "30000", "50000","Per annum".trim(),"Permanent".trim(),"Permanent Tester jobs in Harrow on the Hill".trim()},
                {"Tester", "Wembley", "up to 7 miles".trim(), "30000", "50000","Per annum".trim(),"Contract".trim(),"Contract Tester jobs in Wembley".trim()},
                {"Tester", "Watford", "up to 10 miles".trim(), "30000", "50000","Per annum".trim(),"Temporary".trim(),"Temporary Tester jobs in Watford".trim()},
                {"Tester", "Dunstable", "up to 15 miles".trim(), "30000", "50000","Per annum".trim(),"Permanent".trim(),"Permanent Tester jobs in Dunstable".trim()},
                {"Tester", "Ealing", "up to 25 miles".trim(), "30000", "50000","Per annum".trim(),"Contract".trim(),"Contract jobs in Ealing".trim()},
                {"Tester", "Stanmore", "up to 35 miles".trim(), "30000", "50000","Per annum".trim(),"Temporary".trim(),"Temporary Tester jobs in Stanmore".trim()}
        };
    }
}
