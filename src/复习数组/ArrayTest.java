package 复习数组;

import java.util.Scanner;


public class ArrayTest {
    public static void main(String[] args) {
        /**
         * 从键盘输入学生成绩，找出最高分，并输出学生等级
         * 成绩>=最高分-10等级为‘a’
         * 成绩>=最高分-20等级为‘b’
         * 成绩>=最高分-30等级为‘c‘
         */
        
        // 导入sacnner类从键盘读取数据 读取学生个数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生的个数");
        int number = sc.nextInt();
        // 定义数组 存储学生的成绩
        System.out.println("输入"+number+"位学生的成绩");
        int[] source = new int[number];
        //定义变量比交最大值
        int MaxNuber = 0;
        //使用for循环遍历赋值
        for (int i = 0; i < source.length; i++) {
            source[i]  = sc.nextInt();
            // 找出学生成绩最大值
            if(source[i] > MaxNuber){
                MaxNuber = source[i];
            }
        }
        System.out.println("最大学生的成绩:"+ MaxNuber);
        // 定义字符类型用来比较学生的等级
          char level;
        // for循环遍历成绩输出学生的成绩等级
        for (int i = 0; i < source.length; i++) {
            if(MaxNuber - source[i] <=10){
                level = 'a';
            }else if (MaxNuber - source[i] <=20){
                level = 'b';
            }else if (MaxNuber - source[i] <=30){
                level = 'c';
            }else {
                level = 'd';
            }
            //输入学生的个数出学生成绩的等级信息
            System.out.println("学生，" + i + "，成绩" + source[i] + "，等级" + level);
        }

    }
}
