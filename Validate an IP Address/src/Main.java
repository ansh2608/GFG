public class Main {
    public boolean isValid(String str) {
        String[] arr=str.split("[.]");
        String s;
        if(arr.length<4 || arr.length>4) return false;
        for(int i=0;i<arr.length;i++){
            s=arr[i];
            if(s.equals("")) return false;
            else{
                if(s.charAt(0)=='0' && s.length()>1) return false;
                int j=Integer.parseInt(s);
                if(j>=256||j<0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}