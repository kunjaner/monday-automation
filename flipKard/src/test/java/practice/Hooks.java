package practice;

import org.junit.After;
import org.junit.Before;

public class Hooks {
    FlipKartManager manager=new FlipKartManager();

    @Before
    public void set(){
        manager.openBrowser();
        manager.navigateTo("https://www.flipkart.com");
        manager.maxDriver();
        manager.impWait();
        manager.handleCookies();
    }


//    @After
//    public void tearDown(){ manager.closeBrowse();
//    }
}
