public class Main {
    public static long ExtractNumber(String sentence) {
        String[] split=sentence.split(" ");
        long ans=0;
        for(int i=0;i<split.length;i++) {
            String res=split[i];
            if(!Character.isLetter(res.charAt(0))) {
                if(!res.contains("9")) if(ans<Long.parseLong(res)) ans=Long.parseLong(res);
            }
        }
        if(ans!=0) return ans;
        else return -1;
    }
    public static void main(String[] args) {
        String sentence="This is alpha 5057 and 97";
        System.out.println(ExtractNumber(sentence));
    }
}