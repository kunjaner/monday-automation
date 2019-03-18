package practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

public class FlipKartSmoke extends Hooks {
    FlipKartLocator locator = new FlipKartLocator();

    @Test
    public void searchTest() {
        locator.search("watches");

 locator.searchBrand("Timex");
        //locator.searchBrand("Men");
    }
}

//        assertThat(actual,everyItem(greaterThan(2.0)));
//    // locators.selectPrice("£15 - £20");
//        //locators.selectCategory("Running");