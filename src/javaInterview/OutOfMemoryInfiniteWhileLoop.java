package javaInterview;

import recursion.NFactorial;

import java.math.BigInteger;

public class OutOfMemoryInfiniteWhileLoop {


    public void process () {
        Long count = 1L;
        while(1==1){
            NFactorial nFactorial = new NFactorial();
            System.out.println(count++);
        }
    }


}
