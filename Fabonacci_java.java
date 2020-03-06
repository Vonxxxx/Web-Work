import java.math.BigDecimal;

//java 实现Fabonacci函数1-200项
class Fabonacci{
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.println("Fabonacci("+i+")="+Fabonacci.of1(i));
        }
    }

    public static int of(int x){
        if(x<=0)
            return 0;
        if(x==1)
            return 1;
        return of(x-1)+of(x-2);
    }

    public static BigDecimal of1(int x){
        BigDecimal a=BigDecimal.valueOf(0);
        BigDecimal b=BigDecimal.valueOf(1);
        if(x==0)
            return a;
        if(x==1)
            return b;
        for (int i = 2; i <= x; i++) {
            BigDecimal tmp=b;
            b=a.add(b);
            a=tmp;
        }
        return b;
    }
}