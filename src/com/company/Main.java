package com.company;

public class Main
{
    int meth1(int a)
    {
         System.out.println("meth1 value:"+a);
         return 20;
    }
    int meth2(int b)
    {
        System.out.println("meth2 value:"+b);
        return 30;
    }
    int meth3(int c)
    {
        System.out.println("meth3 value:"+c);
        return 40;
    }
    int meth4(int d)
    {
        System.out.println("meth4 value:"+d);
        return 50;
    }
    int meth5(int e)
    {
        System.out.println("meth5 value:"+e);
        return 10;
    }
    public static void main(String[] args)
    {
        Main obj=new Main();
        obj.meth5(obj.meth4(obj.meth3(obj.meth2(obj.meth1(10)))));

    }
}
