package org.Anish;

import org.springframework.stereotype.Component;

@Component   //what is Component?.
             // Creates an Object ...
             //beans:Object which are Created by Spring is called bean
  public class Car {

    private String color;
    private  String name;
    private  String value;

    private  int roll_No;
      public Car() {
          this.color="Golden is Created by Anish Kumar Sharma";
          this.name="Anish kumar sharma";
            this.value="7-09-2023 5:04 PM";
            this.roll_No=1811141;
          System.out.println("Car object is created by Anish");
      }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public int getRoll_No() {
        return roll_No;
    }
}
