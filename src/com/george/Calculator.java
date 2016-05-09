package com.george;

public class Calculator {
    private static int result=0;    //静态变量，用于存储运行结果

    public void add(int n)
    {
        result=result+n;
    }
    
    public void substract(int n)
    {
        result=result-1;        //Bug：正确的应该是result=result-n;
    }
    
    public void multiply(int n)
    {
        result*=n;
    }
    
    public void divide(int n)
    {
        result=result/n;
    }
    
    public void square(int n)
    {
        result=n*n;
    }
    
    public void squareRoot(int n)
    {
        result=(int)Math.sqrt(n);
    }
    
    public void clear()
    {
        result=0;  //将结果清零
    }
    
    public int getResult()
    {
        return result;
    }
}
