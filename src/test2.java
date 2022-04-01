public class test2 {
    public static void main(String[] args) {
        int[] result = new int[35660];
        //阶乘的第一位为1
        result[0] = 1;
        //得到数组长度-35660
        int len = result.length;
        System.out.println(len);
        //进位
        int jingwei = 0;
        int a;

        //开始阶乘循环
        for (int i = 2; i <= 20; i++) {
//            j<35660-进位
            for (int j = 0; j < len; j++) {
                //不需要进位的情况
                if (j == 0) {
                    a = result[j] * i;

                    //        取余数
//                    System.out.println(101%10);//1
                    result[j] = a % 10;
                    //        取商的整数
//                    System.out.println(101/10);//10
                    jingwei = a / 10;
                } else {
                    //需要进位的情况
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
}
