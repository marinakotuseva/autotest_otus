package org.coal;

public class CoalMine {

    private static Integer capacity = 1000;

    public static  Integer getCapacityAndDecreaseByTen(){
        return capacity-=10;
    }

}
