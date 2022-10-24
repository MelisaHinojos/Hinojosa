package calcu;

public class Calculadora {
    public int suma(int num1,int num2){
        return num1 + num2 ;
    }
    public int resta(int num1,int num2){
        return num1 - num2 ;
    }
    public int multiplicacion(int num1,int num2){
        return num1 * num2 ;
    }
    public int division(int num1,int num2){
        return num1 / num2 ;
    }
    public double cuadratica(int a, int b, int c){
        return (-b +- Math.sqrt( (b*b)-(4*a*c) ) )/2*a;
    }
}
