

public class test {
    public static void main(String[] args) {
        System.out.println(10000*35660);
        //用一个数组存放结果，数组的默认值为0
        int[] a = new int[35660];
        // n用于外层循环，每一次循环代表一个乘数，乘到10000即为n!
        int n = 20;
        // a[0]代表初始时被乘数为1，1乘10000！还是10000！，len代表被乘数的长度初始时为1， x代表被乘数的每一位和乘数的结果的进位
        a[0] = 1;
        int len = 1, x = 0;
        // 外层循环控制1X2X3...X10000
        for (int i = 1; i <= n; i++) {
            // 内层循环控制被乘数的每一位和乘数相乘
//            进位控制, j+1就是进位一个
            for (int j = 0; j < len; j++) {
                // 计算乘出来的结果
                a[j] = a[j] * i + x;
                // 计算进位
                x = a[j] / 10;
                // 计算结果数组的值，该值即为乘出来的结果的余数
                a[j] = a[j] % 10;
                // 处理最后一次进位
                if(x > 0 && j >= len - 1){
                    //数组右移一位，十位变百位
                    len++;
                }
            }
        }
        // 逆序输出
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}

