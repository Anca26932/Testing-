package VariabilaMetoda;

import org.testng.annotations.Test;

public class Vehicles {


    public String Make;    //The manufacturer of the vehicle (Pegeout)
    public String Model;
    public Integer year;
    public Boolean isElectric;
    public String Color;
    public Integer numDoors;
    public String VIN; //Vehicle Identification Number
    public Double engineSize;

@Test
    public void displayInfo(){
        Make="Peugeot ";
        Model="3008";
        year=2018;
        isElectric=true;
        Color="Black";
        numDoors=4;
        VIN="CJ26VAV";
        engineSize=1.5;



        System.out.print(Make+"  "+Model+"  "+ year);


    }




    public void fuelConsumed(){




    }


}
