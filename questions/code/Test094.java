package dan.javatests.code;

public class Test094 {
    public static void main(String [] args) {
        int x=20;
        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
        System.out.println(sup);
    }
}