package com.company;

/*

1524. Level 15 Lection 12. The order of loading variables
Understand what and in what sequence is initialized. Set breakpoints and use debugger.
Correct the data initialization order so that the result is as follows:
static void init ()
Static block
public static void main
non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name
Requirements:
1. The program should display data on the screen.
2. The output to the screen should correspond to the condition of the task.
3. The result of the static initializer of the Solution class should be the output of the lines "static void init ()" and "Static block".
4. The program should not read data from the keyboard.


 */

public class Solution {
    static {
        init();
        System.out.println("Static block");
    }

    {
        System.out.println("non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";
//    static {
//
//    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);  // тут obj.i I obj.j змінені місцями у порівнянні із попереднім завданням
    }
}


