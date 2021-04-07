import java.util.Arrays;

public class BoyClass {
    protected String[] boyName;

    public String[] getBoyName() {
        return boyName;
    }

    public void setBoyName(String[] boyName) {
        this.boyName = boyName;
    }

    @Override
    public String toString() {
        return "BoyClass{" +
                "boyName=" + Arrays.toString(boyName) +
                '}';
    }
}
