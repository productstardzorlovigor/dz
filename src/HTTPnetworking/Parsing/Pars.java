package HTTPnetworking.Parsing;

public class Pars {

    private String date;

    private float value;

    public Pars() {
    }

    public Pars(String date, float value) {
        this.date = date;
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
