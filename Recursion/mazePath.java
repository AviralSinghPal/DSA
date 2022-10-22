package Recursion;

public class mazePath
{
    public static void main(String[] args)
    {
        mazepath(0,0,3,3,"");
    }

    static void mazepath(int sr ,int sc,int er,int ec,String psf) {
        if(sr==er && sc==ec)
            System.out.println(psf);
        if (sr + 1 <= er)
            mazepath(sr + 1, sc, er, ec, psf + 'R');
        if (sc + 1 <= ec)
            mazepath(sr, sc + 1, er, ec, psf + 'D');
    }

}
