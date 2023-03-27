import java.nio.file.Files;

public class Main{
    public static void main(String[] args) {

        Ordenador ord=new Ordenador(); //voy a llamar al ordenador

//los tres numeros que voy a ingresar
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        String orden=args[3];
        boolean v=false;
        if (orden.equals("a")){ //si ingresa la "a" va a ser ascendente
            v=true;
        }else if (orden.equals("d")){ //descendente
            v=false;
        }
        int[] numeros=ord.ordenar(a,b,c, v);
        for (int n : numeros){
            System.out.println(n);
        }
    }
}