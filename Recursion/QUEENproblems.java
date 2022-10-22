package Recursion;

public class QUEENproblems
{
    public static int CCcombinationSIN(int []coins,int index,int target,String psf)
    {
        if(target==0)
        {
            System.out.println(psf);
            return 1;
        }
        int count=0;
        for(int i=index;i<coins.length;i++)
        {
            if(target-coins[i]>=0)
                count+=CCcombinationSIN(coins,i+1,target-coins[i],psf+i+" ");
        }
        return count;
    }
    public static void main(String[] args) {
        int [] coins={2,3,5,7};
        int tar=10;
        // System.out.println(CCpermutation(coins,tar,""));
        System.out.println(CCcombinationSIN(coins,0,tar,""));

    }
}
