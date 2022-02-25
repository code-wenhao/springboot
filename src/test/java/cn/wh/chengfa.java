package cn.wh;

public class chengfa {
    public static void main(String[] args) {
//        for(int a = 1;a<=9;a++){
//            for (int b = 0;b<a;b++){
//                System.out.print((b+1)+"*"+a+"="+(b+1)*a+" ");
//            }
//            System.out.println();
//        }
        f();
    }
    public static void f(){
        for(int i=1,j=1;j<10;i++) {
            System.out.print(i+"*"+j+"="+i*j+"  ");
            if(i==j) {
                System.out.println();
                i=0;
                j++;
            }
        }
    }
}
