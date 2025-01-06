package stepObject;

import io.qameta.allure.Step;
import pageObject.Search;

public class SearchSteps extends Search {
    @Step("Click search field")
    public SearchSteps searchClick(){
        searchArea.click();
        return this;
    }
    @Step("Enter Search data")
    public SearchSteps searchData(String data){
        searchArea.setValue(data);
        return this;
    }
    @Step("Click Search button")
    public SearchSteps clickSearchBtn(){
        searchBtn.click();
        return this;
    }

}
