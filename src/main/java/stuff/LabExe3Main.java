/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stuff;

import java.util.ArrayList;

public class LabExe3Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        printNumbers(numbers);

    }

    public static void printNumbers(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            System.out.println(num);
        }
    }
}
