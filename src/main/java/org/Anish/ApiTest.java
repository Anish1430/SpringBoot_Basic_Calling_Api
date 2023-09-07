package org.Anish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {
    @Autowired

     Car myObj;

    @GetMapping("api2/aks/DukhiAttmaAnish")
    public  String api() {
        return "Anish kumar SHarma";
    }

     @GetMapping("api3/thats/start/Conservation")
      public  Car getMyObj() {
        return myObj;
     }
}
