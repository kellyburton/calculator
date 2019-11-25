package com.leszko.calculator;
import org.springframework.stereotype.Service;
/**
 * Main Spring Service.
 */

@Service
public class Calculator {
     int sum(int a, int b) {
          return a + b;
     }
}
