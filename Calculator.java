public class Calculator{

public static void main(){
System.out.println("Hello");
System.out.println("World");
}

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
}