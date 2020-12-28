package com.zy._2020.Dec.TwentyEight;

import java.util.Scanner;

/**
 * @author at
 * @Date 2020/12/28
 **/
public class T_1114_按序打印 {
    class Foo {
        public  int i = 0;

        public Foo() {

        }
        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            if(i==1)
                printFirst.run();
            else second(printFirst);
        }

        public void second(Runnable printSecond) throws InterruptedException {

            // printSecond.run() outputs "second". Do not change or remove this line.
            if (i==2)
                printSecond.run();
            else third(printSecond);
        }

        public void third(Runnable printThird) throws InterruptedException {

            // printThird.run() outputs "third". Do not change or remove this line.
            if (i==3)
                printThird.run();
            else third(printThird);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



    }
}
