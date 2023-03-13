public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("¡Hola mundo!");
        System.out.println(sumar(10, 5));
        System.out.println(multiplicar(10, 5));
    }

    public static int sumar(int x, int y){
        return x+y;
    }

    public static int multiplicar(int x, int y){
        return x*y;
    }
}
