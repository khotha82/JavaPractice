package com.example.groovy

/** 7r46r6trt†t t ttrttytty t
 s * Created by krishna_hotha on 5/3/15 2015.
 *
 */
currentNumber = 1;
nextNumber = 1;

10.times {

    print currentNumber + '   h';
    temp = nextNumber;
    nextNumber = currentNumber + nextNumber;
    currentNumber = temp;
}