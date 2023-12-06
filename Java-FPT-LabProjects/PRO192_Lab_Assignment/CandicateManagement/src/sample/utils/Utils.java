/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import java.util.Scanner;

/**
 *
 * @author hd
 */
public class Utils {
    
    public static final int INT_MIN = 1;
    public static final int INT_MAX = 1000;
    

    public static String getString(String welcome) {
        boolean check = true;
        String result = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println("\u001b[31mInput text!!!\u001b[30m");
            } else {
                check = false;
            }
        } while (check);
        return result;
    }

    public static String getString(String welcome, String oldData) {
        String result = oldData;
        Scanner sc = new Scanner(System.in);
        System.out.print(welcome);
        String tmp = sc.nextLine();
        if (!tmp.isEmpty()) {
            result = tmp;
        }
        return result;
    }

    public static int getInt(String welcome, int min, int max) {
        boolean check = true;
        int number = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome + " from " + min + " to " + max + ": ");
                number = Integer.parseInt(sc.nextLine());
                check = false;
                if(number < min || number > max)
                throw new Exception();                    
            } catch (Exception e) {
                System.out.println("\u001b[31mNumber in range" + " from " + min + " to " + max +"\u001b[30m");
            }
        } while (check || number > max || number < min);
        return number;
    }
   
    public static int getInt(String welcome, int min, int max, int oldData) {
        boolean check = true;
        int number = oldData;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome + " from " + min + " to " + max + ": ");
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    check = false;
                } else {
                    number = Integer.parseInt(tmp);
                    check = false;
                    if(number < min || number > max)
                    throw new Exception();
                }
                
            } catch (Exception e) {
                System.out.println("\u001b[31mNumber in range" + "from " + min + " to " + max + "\u001b[30m");
            }
        } while (check || number > max || number < min);
        return number;
    }
    
    public static int getInt(String welcome) {
        boolean check = true;
        int number = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                check = false;                    
            } catch (Exception e) {
                System.out.println("\u001b[31m Input number !!!\u001b[30m");
            }
        } while (check);
        return number;
    }

    public static boolean confirmYesNo(String welcome) {
        boolean result = false;
        String confirm = Utils.getString(welcome);
        if ("Y".equalsIgnoreCase(confirm)) {
            result = true;
        }
        return result;
    }
}
