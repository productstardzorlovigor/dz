package HTTPnetworking.Parsing;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TakeValue {
    public List<Pars> getPars() throws IOException {
        String url = "https://raw.githubusercontent.com/productstar-team/javaTwo/master/resources/monthly_IBM.csv";

        try (BufferedInputStream comeHere = new BufferedInputStream(new URL(url).openStream())) {
            Scanner scanner = new Scanner(comeHere).useDelimiter("\\A"); //одни махом весь текст
            String result = scanner.hasNext() ? scanner.next() : "";
            return convertedResult(result);
        } catch (Exception e){
            System.out.println("No date");
        }
        return Collections.emptyList();
    }

    private List<Pars> convertedResult(String result) {
        List<Pars> pars = new ArrayList<>();
        String[] lines = result.split("\n");

        for (int i = 1; i < lines.length; i++){
            pars.add(convertLinesToPars(lines[i]));
        }
        return pars;
    }

    private Pars convertLinesToPars(String line) {
        String[] indexes = line.split(",");
        return new Pars(indexes[0], Float.parseFloat(indexes[4]));
    }
}
