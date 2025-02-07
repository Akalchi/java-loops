package dev.alejandra;

import java.util.ArrayList;
import java.util.List;

public class Multiplier {

    public Multiplier() {
    }

    public List<String> getMultiplier(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(n + " x " + i + " = " + (n * i));
        }
        return result;
    }
}


