#Python 实现Fabonacci函数1-200项#
class Fibonacci:
    def of(x):
        if x<=0:
            return 0
        if x==1:
            return 1
        return of(x-1)+of(x-2)
    def of1(x):
        a=1
        b=1
        if(x==a):
            return a
        if(x==b):
            return b
        for x in range(3,x+1):
            temp=b
            b=a+b
            a=temp
        return b
    if __name__ == "__main__":
        for a in range(1,201):
            print('Fabonacci.of(',a,')=',of1(a))
        