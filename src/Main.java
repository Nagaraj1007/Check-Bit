
public class Main {
    public static int checkBit(int number, int index){
        return ((number & (1 << index)) == 0) ? 0 : 1;
    }

    public static void main(String[] args) {
        System.out.println(checkBit(5, 2));
    }
}