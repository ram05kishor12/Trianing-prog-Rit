import java.io.*;
import  java.util.*;
public int uniqueDigitsCount(int input1){
String numStr = Integer.toString(input1);
    int[] digitCounts = new int[10];
    for (int i = 0; i < numStr.length(); i++) {
        int digit = Character.getNumericValue(numStr.charAt(i));
        digitCounts[digit]++;
    }
    int count = 0;
    for (int i = 0; i < digitCounts.length; i++) {
        if (digitCounts[i] == 1) {
            count++;
        }
    }
    return count;
