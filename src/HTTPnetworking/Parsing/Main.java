package HTTPnetworking.Parsing;


import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        TakeValue takeValue = new TakeValue();

        List<Pars> pars = takeValue.getPars();

        pars.sort(new Comparator<Pars>() {
            @Override
            public int compare(Pars pars, Pars t1) {
                Float val1 = new Float(pars.getValue());
                Float val2 = new Float(t1.getValue());
                return val1.compareTo(val2);
            }
        });

        System.out.println("Smaller is : " + pars.get(0).getDate() + " value is : " + pars.get(0).getValue());
        System.out.println("Bigger is : " + (pars.get(pars.size() - 1)).getDate() + " value is : " + (pars.get(pars.size() - 1)).getValue());
    }
}
