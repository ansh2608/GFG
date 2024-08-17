public class Main {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long[] res=new long[nums.length];
        long product=1;
        Boolean zero=false;
        Boolean two=false;
        for(int i=0;i<nums.length;i++)
        {  if(nums[i]!=0)
            product*=nums[i];
        else
        {
            if(zero)
                two=true;
            zero=true;
        }
        }
        if(two)
            return res;
        for(int i=0;i<nums.length;i++)
        {   if(zero && nums[i]==0)
            res[i]=product;
        else if(!zero && nums[i]!=0)
            res[i]=product/nums[i];
        else
            res[i]=0;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}