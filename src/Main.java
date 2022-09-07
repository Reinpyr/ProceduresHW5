import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] in = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] out = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        int x = 4;
        //System.out.println(Arrays.toString(remove(in, out, x)));

        //This method can for example be used to remove certain data that isn't something we want to share
        int[] storage1 = {90,98,70,40,73,21,90,80,98,8};
        int[] storage2 = {0,0,0,0,0,0,0,0,0,0};
        int secretinfo = 98;

        boolean hasAccess = false;
        if(hasAccess == false)
        {
            System.out.println(Arrays.toString(remove(storage1,storage2,secretinfo)));
        }
        else {
            for(int v = 0; v < storage2.length; v = v + 1)
                storage2[v] = storage1[v];
            System.out.println(Arrays.toString(storage2));
        }
    }

    static int[] remove(int[] in, int[] out, int x) {
        int n = 0;
        for (int i = 0; i < in.length-n; i = i + 1)
        {
            {
            if (in[i] == x || in[i+n] == x)
            {
                while(in[i+n] == x)
                {
                    n = n + 1;
                }
                out[i] = in[i+n];
            }
            else {
                out[i] = in[i + n];
            }
            }
        }
        for(int k = in.length-n; k < in.length; k = k + 1)
        {
            out[k] = 0;
        }
        return out;
    }
}