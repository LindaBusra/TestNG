package techproed.tests.MyPractice01;

import org.testng.annotations.Test;

public class C01_Priority {
    @Test (priority = -9)  // Priority must be integer.   the order is  -9, 0, 5
    public void youtubeTest(){
        System.out.println("Youtube test");
    }

    @Test (priority = 5)
    public void amazonTest(){
        System.out.println("Amazon tes");

    }


    @Test
    public void bestbuyTest(){     // if there is no priority it is as default = 0
        System.out.println("Bestbuy test");
    }


}