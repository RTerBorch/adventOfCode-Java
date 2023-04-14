package AoC2021.Day1_SonarSweep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Logic {
    private boolean test;


    public Logic(boolean test) {
        this.test = test;
    }

    public String filePath() {
        if (test) {
            return "src/main/java/AoC2021/Day1_SonarSweep/DepthReportDemo";
        } else return "src/main/java/AoC2021/Day1_SonarSweep/DepthReport";
    }


    // reads file and put values into list
    public ArrayList<String> readFile() throws IOException {

        ArrayList<String> depthList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath()));
        String line;
        while ((line = br.readLine()) != null) {
            depthList.add(line);
        }

        return depthList;
    }

    // checks every time depth increases, each time this happens depthCount go up.
    public int checkDepthIncreases(List<String> list) {

        int currentDepth = 199;
        int depthIncreases = 0;
        for (String depth : list) {

            if (Integer.parseInt(depth) > currentDepth) {
                depthIncreases++;
            }
            currentDepth = Integer.parseInt(depth);
        }

        return depthIncreases;
    }

    // Checks every depth value in a window of 3, each time it goes up one step and compare. (1,2,3 values compared to 2,3,4)
    public int checkDepthIncreasesByThree(ArrayList<String> list) {
        int previousNumber = 0;
        int windowSize = 3;
        int step = 1;
        int depthIncreases = 0;

        for (int i = 0; i <= list.size() - windowSize; i += step) {
            int windowSum = 0;
            for (int j = i; j < i + windowSize; j++) {
                windowSum += Integer.parseInt(list.get(j));
            }
            if (previousNumber != 0 && previousNumber < windowSum) {
                depthIncreases++;
            }
            previousNumber = windowSum;
        }
        return depthIncreases;
    }
}
