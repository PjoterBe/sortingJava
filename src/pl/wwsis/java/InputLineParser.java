package pl.wwsis.java;

import java.util.ArrayList;
import java.util.List;

public class InputLineParser {
    Integer[] parseInput(String input) throws InputParseException {
        if (input == null || "".equals(input)) {
            return new Integer[0];
        }

        String[] s1 = input.split(" ");
        List<Integer> parsedInput = new ArrayList<>();
        for (String s : s1) {
            try {
                int i = Integer.parseInt(s);
                parsedInput.add(i);
            } catch (NumberFormatException e) {
                throw new InputParseException("Invalid input passed", e);
            }
        }
        return parsedInput.toArray(new Integer[parsedInput.size()]);
    }

}

