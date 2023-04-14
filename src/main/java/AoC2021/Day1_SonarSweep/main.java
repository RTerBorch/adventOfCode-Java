package AoC2021.Day1_SonarSweep;

import java.io.IOException;

public class main {

    public static void main(String[] args) {
        int depthIncreases;
        int depthIncreasesByThree;
        Logic logic = new Logic(false);

        try {
            depthIncreases = logic.checkDepthIncreases(logic.readFile());
            depthIncreasesByThree = logic.checkDepthIncreasesByThree(logic.readFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Part 1 - Depth increases: " + depthIncreases);
        System.out.println("Part 2 - Depth increases: " + depthIncreasesByThree);
    }


}
