package Recursion;



public class COINchange
{
    public static int CCpermutation(int []coins,int target,String psf)
    {
        if(target==0)
        {
            System.out.println(psf);
            return 1;
        }
        int count=0;
        for(int i:coins)
        {
            if(target-i>=0)
                count+=CCpermutation(coins,target-i,psf+i+" ");
        }
        return count;
    }
    public static int CCcombination(int []coins,int index,int target,String psf)
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
                count+=CCcombination(coins,i,target-coins[i],psf+coins[i]+" ");
        }
        return count;
    }
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
                count+=CCcombinationSIN(coins,i+1,target-coins[i],psf+coins[i]+" ");
        }
        return count;
    }

    public static int CCpremutationSIN(int []queens,int target,String psf)
    {
        if(target==0)
        {
            System.out.println(psf);
            return 1;
        }
        int count=0;
        for(int i=0;i<queens.length;i++)
        {
            if(queens[i]>0 && target-queens[i]>=0) {
                int val=queens[i];
                queens[i]=-queens[i];
                count += CCpremutationSIN(queens,target - val, psf + val + " ");
                queens[i]=-queens[i];

            }
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

