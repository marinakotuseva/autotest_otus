package org.coal;

public class CoalMinersTest {

    public static void main(String[] args) {
        new Thread(new CoalMiner()).start();
    }
}
