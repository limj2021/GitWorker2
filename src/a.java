public class a {
    public static void main(String[] args) {
        a b=new a();
        b.jiecheng(2);
        System.out.println();
        System.out.println(""+b.recursion(11));

//        b.a();



    }


    public void a(){

        //用一个数组存放结果，数组的默认值为0
        int[] a = new int[35660];
        // n用于外层循环，每一次循环代表一个乘数，乘到10000即为n!
        int n = 10000;
        // a[0]代表初始时被乘数为1，1乘10000！还是10000！，len代表被乘数的长度初始时为1， x代表被乘数的每一位和乘数的结果的进位
        a[0] = 1;
        int len = 1, x = 0;
        // 外层循环控制1X2X3...X10000
        for (int i = 1; i <= n; i++) {
            // 内层循环控制被乘数的每一位和乘数相乘
            for (int j = 0; j < len; j++) {
                // 计算乘出来的结果
                a[j] = a[j] * i + x;
                // 计算进位
                x = a[j] / 10;
                // 计算结果数组的值，该值即为乘出来的结果的余数
                a[j] = a[j] % 10;
                // 处理最后一次进位
                if(x > 0 && j >= len - 1) {
                    len++;
                }
            }
        }
        // 逆序输出
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    public void jiecheng(int number) {
        int[] result = new int[35660];
        //阶乘的第一位为1
        result[1] = 1;
        //得到数组长度-35660
        int len = result.length;
        System.out.println(len);
        //进位
        int jingwei = 0;

        int a;

        //开始阶乘循环
        for (int i = 1; i <= number; i++) {

//            j<35660
            for (int j = 0; j < len; j++) {

                if (j == 0) {

                    a = result[j] * i;

                    //        取余数
//                    System.out.println(101%10);//1

                    result[j] = a % 10;

                    //        取商的整数
//                    System.out.println(101/10);//10
                    jingwei = a / 10;
                } else {

                    a = result[j] * i + jingwei;
                    jingwei = a / 10;
                    result[j] = a % 10;
                }
            }
        }
        for (int k = len - 1; k >= 0; k--) {
            System.out.print(result[k]);
        }

    }


    public int recursion(int num){//利用递归计算阶乘
        int sum=1;
        if(num < 0){
            //抛出不合理参数异常
            throw new IllegalArgumentException("必须为正整数!");
        }
        else if(num==1){
            return 1;
            //根据条件,跳出循环
        }else{
            sum=num * recursion(num-1);
            //运用递归计算
            return sum;
        }

    }

}
