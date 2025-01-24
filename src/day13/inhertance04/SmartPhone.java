package day13.inhertance04;

import day13.inheritance03.Phone;

public class SmartPhone extends Phone {

    public SmartPhone(){}
    public SmartPhone(String model, String color){
        super();
        System.out.println("SmartPhone model 과 color" + super.getBander() +super.getModel() +super.getModel());
    }
}
