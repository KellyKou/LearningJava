import java.util.Arrays;

public class Demo1 {

    int J = 20;//instance variable















    public void diffParameters(String v,int g,boolean h)
    {
        System.out.println(v);
        System.out.println(g);
        System.out.println(h);
    }

    public int addNumbers(int o, int u) {
        int e = o + u;
        System.out.println(e - 1);
        return e;
    }

    public static String doLogin2() {
        //login code
        doLogin();
        System.out.println("yyy");
        return "pdf";


    }

    public String doLogin1() {
        //login code
        doLogin();
        System.out.println("Method");
        return "sdf";

    }

    public static void doLogin() {
        //login code
        System.out.println("login");

    }

    public void myMethod() {
        int k = 11; // Local variable

    }

    public static void main(String[] args) {

        //sdfas
        /*
        stuffs
         */
        Demo1 de = new Demo1();
        new Demo1();
        new Demo1();
        new Demo1();
        new Demo1();
        System.out.println("test");

        de.doLogin1();
        doLogin2();
        de.addNumbers(4, 7);
        System.out.println(de.addNumbers(5, 7));
        de.diffParameters("cxs",46,true);

        short st = 12324;
        boolean bl = true;
        System.out.println(!bl);
        float fl = 1.35f;
        byte bt = -125;
        long lg = 131231233123L;
        double db = 1.24324234234234d;
        char ch = 'c';

        String str = new String();
        str = "class";

        String str1 = "class1";

        String str2 = new String("class2");
        System.out.println(str == str1);// 对比location
        System.out.println(str.equals(str1));//对比Value

// type variableName = value;
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        System.out.println(str + "sdfsd" + bt);//对比Value
        System.out.println(lg + bt);//对比Value

        if (n1 == n2) {
            System.out.println("=");
        } else {
            System.out.println("!=");
        }

        if ((n1 == n2) && (n1 == n3)) {
            System.out.println("yes");
            if (n2 > n3) {
                System.out.println("K");
            } else {
                System.out.println("KK");
            }

        } else if ((n1 != n2) && (n1 == n3)) {
            System.out.println("no");
        } else {
            System.out.println("P");
            if (n2 > n3) {
                System.out.println("S");
            } else {
                System.out.println("SS");
            }
        }

        // Variable =(condition)? TrueExpression : FalseExpression
        String result = (n1 < n2) ? "A" : "B";
        System.out.println(result);
        Boolean result1 = (n1 < n2) ? true : false;
        System.out.println(result1);

        /*
         Switch(expression){
         case 1:
          statements
          case 2:
          statements

          default
          statements
         */

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("T");
                break;
            case 5:
                System.out.println("F");
                break;
            default:
                System.out.println("weekend");
                break;
        }

        System.out.println("WHILE LOOP");
        //Loop
        /*while(condition)
        {Statement(s)};
        do not know the number of iteration
         */
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);
        System.out.println("AFTER WHILE LOOP");

        System.out.println("Do WHILE LOOP");
        /*
        do{Statement(s)}
        while(condition);
        want to execute the code at least once no matter what condition is
         */

        do {
            i++;
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println(i);

        System.out.println("For LOOP");
        /*
        for（initial；condition；update）
        {Statement}
        Know how many iteration you want to run at the beginning
         */
        for (int l = 1; l <= 5; l++) {
            System.out.println("l=" + l);
        }
//work but not recommend
        int k = 1;
        for (; k < 3; ) {
            System.out.println("k=" + k);
            k++;
        }

        System.out.println("break and continue");
        for (int m = 1; m <= 5; m++) {
            if (m == 3) {
                break;//stop from here
            }
            System.out.println(m);
        }
        System.out.println("end");
        for (int m = 1; m <= 5; m++) {
            if (m == 3) {
                continue;//skip it and go further
            }
            System.out.println(m);
        }
        System.out.println("end");


        System.out.println("Nested Loops");
        int count = 0;
        for (int x = 1; x <= 4; x++) {
            int s = 1;
            while (s <= 5) {
                System.out.println("x=" + x + "s=" + s);
                s++;
                for (int w = 1; w <= 2; w++) {
                    System.out.println("w=" + w);
                    count++;
                }
                count++;

            }
            count++;
        }
        System.out.println(count);

        System.out.println("Array");
        int myInt2 = 2;
        int[] myIntArray = new int[10];
        myIntArray[0] = 0;
        myIntArray[1] = 10;
        myIntArray[2] = 20;
        myIntArray[3] = 30;
        myIntArray[4] = 40;
        myIntArray[5] = 50;
        myIntArray[6] = 60;
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[3]);
        System.out.println(myIntArray[8]);
        System.out.println(myIntArray[4] + myIntArray[7]);
        System.out.println(myIntArray.length);
        int[] myIntArray1 = {10, 20, 30, 40};
        System.out.println(myIntArray1[3]);
        System.out.println(Arrays.stream(myIntArray).average());
        for (int t = 2; t < myIntArray1.length; t++) {
            System.out.println(myIntArray1[t]);
        }


        System.out.println("MultiDimeArray");
        int[][] myMultiInt = new int[2][3];
        myMultiInt[0][0] = 1;
        myMultiInt[0][2] = 5;
        myMultiInt[1][2] = 7;
        System.out.println(myMultiInt[0][1]);
        System.out.println(myMultiInt[1][2]);
        int[][] myMultiInt1 = {{2, 3, 4}, {6, 7, 8}};

        for (int q = 0; q < myMultiInt1.length; q++) {
            for (int f = 0; f < myMultiInt1[q].length; f++) {
                System.out.println(myMultiInt1[q][f]);
            }

        }

        System.out.println("Package");
        /*
        import packageName.className;
         */


    }
}
