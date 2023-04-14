package Day1_SonarSweep;

import AoC2021.Day1_SonarSweep.Logic;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class logicTest {


    @Test
    public void readFileTest() throws IOException {
        Logic logic = new Logic(true);
        int totalLines = 0;
        ArrayList<String> textArray = logic.readFile();

        System.out.println(textArray);
        System.out.println(textArray.size());
        assert textArray.size() == 10;
    }

    @Test
    public void checkDepthIncreasesTest(){
        Logic logic = new Logic(true);
        List<String> list = Arrays.asList("199","200","208");
        assert logic.checkDepthIncreases(list) == 2;
    }

    @Test
    public void checkDepthIncreasesByThreeTest() throws IOException {
        Logic logic = new Logic(true);

        assert logic.checkDepthIncreasesByThree(logic.readFile()) == 5;
    }


}
