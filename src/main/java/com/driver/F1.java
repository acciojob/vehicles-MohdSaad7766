package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,4,0,6,isManual,"F1",1);
        //Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats)
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate

        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1

            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        else if (newSpeed <= 50){
//                speed 1-50: gear 1
            changeGear(1);


        }
        else if(newSpeed <= 100){
//                speed 51-100: gear 2
            changeGear(2);


        }
        else if(newSpeed <= 150){
//                speed 101-150: gear 3
            changeGear(3);

        }
        else if(newSpeed <= 200){
//                speed 151-200: gear 4
            changeGear(4);

        }else if(newSpeed <= 250){
//                speed 201-250: gear 5
            changeGear(5);

        }
        else{
//                speed more than 250: gear 6
            changeGear(6);
        }


        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());

        }
    }
}
