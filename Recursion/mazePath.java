package Recursion;

public class mazePath
{
    public static void main(String[] args)
    {
        System.out.println(mazepath(0,0,3,3,""));
    }

    static int  mazepath(int sr ,int sc,int er,int ec,String psf) {                    //basic solution of maze path
        int c=0;
        if(sr==er && sc==ec) {
            System.out.println(psf);

            return 1;

        }

        if (sr + 1 <= er)
            c +=mazepath(sr + 1, sc, er, ec, psf + 'H');
        if (sc + 1 <= ec)
            c +=mazepath(sr, sc + 1, er, ec, psf + 'V');

        return c;
    }

}
