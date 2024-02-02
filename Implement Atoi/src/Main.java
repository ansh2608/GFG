public class Main {
    public static int atoi(String s) {
        try{
            return Integer.parseInt(s);
        }
        catch(Exception e)
        {
            return -1;
        }
    }
    public static void main(String[] args) {
        String s = "-123";
        System.out.println(atoi(s));
    }
}