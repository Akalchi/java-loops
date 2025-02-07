package dev.alejandra;

import java.util.List;
import java.util.ArrayList;

public class Multiplier {
      public List<Integer> numbers= new ArrayList<>();
      
        public List<Integer> multiply(int n) {
            for (int i = 1; i <= 10; i++) {
                numbers.add(i*n);
            }
            return numbers;
        }
    }

