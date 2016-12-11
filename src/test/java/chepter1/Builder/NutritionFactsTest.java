package chepter1.Builder;

import org.junit.Assert;
import org.junit.Test;

public class NutritionFactsTest {

    @Test
    public void testBuilder(){

        NutritionFacts nutritionFacts=new NutritionFacts.Builder(100,200)
                                                        .calories(300)
                                                        .sodium(400).build();

        Assert.assertEquals(300,nutritionFacts.getCalories());

    }

}