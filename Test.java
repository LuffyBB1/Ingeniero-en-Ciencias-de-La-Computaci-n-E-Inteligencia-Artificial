
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se verifica el numero de estados que tiene el autómata
        Scanner x= new Scanner(System.in);
        System.out.println("Ingrese el numero de estados: ");
        int filas =x.nextInt();
        //El alfabeto de entrada tiene que ser letras
        System.out.println("Ingrese la cantidad de caracteres en el alfabeto");
        int colum=x.nextInt();
            
        //Se genera la matriz o el recorrido del autómata, es decir, se define el DFA
        int [][] matrix=new int[filas][colum];
        for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < colum; j++) {
                        //Se llena la matriz del autómata
                        System.out.println("Ingrese el valor en la posicion: "+i+","+j);
                        matrix[i][j]=x.nextInt();
                    }
                
            }
        //los estados en este caso se manejan como números(para evitar confusiones, por supuesto también pueden ser letras)
        System.out.println("Ingrese la cantidad de estados de aceptacion: ");
        int numb_estados=x.nextInt();
        int[] ends = new int[numb_estados];
        for (int i = 0; i < numb_estados; i++){
            //El estado o esdtados finales de aceptación
            System.out.println("Ingrese los estados de aceptacion: ");
                ends[i]=x.nextInt();
        }
                
        //Se ingresa la cadena a evaluar y se instancia la clase del autómata
        System.out.println("Ingrese la cadena: ");
        String a = x.next();
        DFADemo dfaDemo = new DFADemo();
        System.out.println(dfaDemo.getResult(ends,matrix,a)); 
        
    }
}