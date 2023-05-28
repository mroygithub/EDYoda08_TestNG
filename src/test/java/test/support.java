package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class support {

    @BeforeSuite
    public void run_Before_Suite(){

        System.out.println("This is Before Suite .....");
    }



    @AfterSuite
    public void run_After_Suite(){

        System.out.println("This is After Suite .....");
    }




}
