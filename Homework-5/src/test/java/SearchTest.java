import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepObject.SearchSteps;
import utils.ChromeRunner;

import static dataObject.SearchData.searchInput;

public class SearchTest extends ChromeRunner {
    SearchSteps searchSteps = new SearchSteps();

    @Test
    @Description("Validate politic page load successfully")
    public void searchTest() {
        searchSteps
                .searchClick()
                .searchData(searchInput)
                .clickSearchBtn();
        Assert.assertEquals(searchSteps.searchValidate.getText(),"ძიების შედეგი");
    }

}
