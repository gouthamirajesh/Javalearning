package com.company;

public class test {

    public void meth1(){
        int a=10;
        int b=20;
        System.out.println("addition : " +(a+b));





    }

     private int meth2(){

        int x=100;
        int y=200;

         System.out.println("substarction"+(y-x));


        return 1;
     }

     public void meth3(){

        int a=20;
        int b=5;
         System.out.println("divided");
         System.out.println(a/b);

     }

     public void meth4(){

        int a=2;
        int b=2;
         System.out.println(a*b);

     }


    public static void main(String[]args){
//
//        test aobj1=new test();
//        aobj1.meth1();
//        aobj1.meth2();
//        aobj1.meth3();
//        aobj1.meth4();

        new test().meth1();
        new test().meth2();
        new test().meth3();
        new test().meth4();


    }



}
