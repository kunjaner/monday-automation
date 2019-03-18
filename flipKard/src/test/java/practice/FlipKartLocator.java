package practice;

import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class FlipKartLocator extends FlipKartManager {

    public void search(String item){
        driver.findElement(By.name("q")).sendKeys(item);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }
    public void categories(String cuCategory){
        List<WebElement> category =driver.findElements(By.cssSelector("._3aoPnm>div>div>a"));
        for(WebElement categories:category){
           String actulCategory =categories.getText();
           if(actulCategory.matches(cuCategory)){
               categories.click();
           }
        }
    }
    public void selectReview(String cuRating){
       List<WebElement> ratings= driver.findElements(By.cssSelector("._36jUgy>div>div"));
       for(WebElement rating:ratings){
          String ratingText =rating.getText();
          if(ratingText.matches(cuRating)){
              rating.click();
              break;
          }
       }
    }
    public void searchBrand(String brands){
List<WebElement> allbrands=driver.findElements(By.cssSelector("._36jUgy>div>div"));
for (WebElement expectedbrands:allbrands) {
            String actulbrands=expectedbrands.getText();
            if(actulbrands.matches(brands)){
                expectedbrands.click();
            }

        }
    }


}




//    List<WebElement> ratings = driver.findElements(By.cssSelector(".ac-facet__label.ac-facet__label--rating"));
//        for (WebElement rating : ratings) {
//                String ratingInString = rating.getText();
//                if (ratingInString.matches(customerRatings)) {
//                rating.click();
//                break;
//                }