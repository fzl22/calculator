public class Calculator{

public int add(int a, int b){
return a+b;
}

public double add(double a, double b){
return a+b;
}

public int subtract(int a, int b){
return a-b;
}

public double subtract(double a, double b){
return a-b;
}

public int multiply(int a, int b){
return a * b;
}

public int divide(int a, int b){
if(b!=0)
return a/b;
else
return -1;
}

public double divide(double a, double b){
if(b!=0)
return a/b;
else
return -1;
}
  
  public long power(int x, int y){
    int result = 1;
    for(int i=1;i<=y;i++)
      result = result * x;
    return result;
  }
}
