package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();
        String[] massivS = k.split(" ");
        int a = Integer.valueOf(massivS[0]);
        int b = Integer.valueOf(massivS[1]);
        int c = Integer.valueOf(massivS[2]);
        boolean l = false;
         if ((a%2==0 && b%2==0) || (a%2==0 && c%2==0) || (b%2==0 && c%2==0))
        {
            l = true;
        }
        System.out.println(l);

        /*String k = in.nextLine();
        String[] massivS = k.split(" ");
        int a = Integer.valueOf(massivS[0]);
        int b = Integer.valueOf(massivS[1]);
        int c = Integer.valueOf(massivS[2]);
        int d = Integer.valueOf(massivS[3]);
        boolean l = false;
        if(a==-b || a==-c || a==-d || b==-c || b==-d || c==-d)
        {
            l = true;
        }
        System.out.println(l);*/
        /*int x = in.nextInt();
        boolean y = (x>=100 && x<=999)&&(x%5==0);
        System.out.println(y);*/

        /*in.useLocale(Locale.US);
        float x = in.nextFloat();
        boolean y = !((x>=-2 && x<=3)||(x>=6 && x<=9));
       // boolean y = (x>=-3 && x<=5)||(x>=9 && x<=15);
        System.out.println(y);*/

        /*Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        float a = 3;
        float b = 8;
        float x = in.nextFloat();
        boolean y = (x>=3 && x<=8);
        System.out.println(y);*/


    }
}

