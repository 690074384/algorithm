package com.lph.jianzhi;

/**
 * 题目描述:
     在一个二维数组中，每一行都按照从左到右递增的顺序排序，
     每一列都按照从上到下递增的顺序排序。
     请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

 * 思路：
 * 从右上角开始，若小，向下走，删除一行，若大，向左走，删除一列
 */

public class ArraySearch {
    public boolean find(int target, int [][] array) {
        int row = 0;
        int col = array.length - 1;
        while(row <= array[0].length-1 && col >=0){
            if(target == array[row][col])
                return true;
            else if(target > array[row][col])
                row++;
            else
                col--;
        }
        return false;
    }
}
