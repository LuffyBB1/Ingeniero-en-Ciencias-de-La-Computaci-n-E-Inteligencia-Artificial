public class DFADemo {
    //definicion del alfabeto, se puede ampliar para cualquier caracter, para pruebas se llenó el arreglo con esos
    char[] arr = new char[]{'a','b','c','d','e','f','g','h','j'};
    private int[][] matrix;
    private int[] ends;
    private int start,end;
    private String str;
    
    //Clase Autómata, la cual realiza la búsqueda y comparación para definir si la cadena es aceptada o no
    public DFADemo(){

    }
    //acá se van a guardar los estados finales, la función retornará true or false si la cadena es aceptada en el autómata o no
    public boolean getResult(int[] ends,int[][] matrix,String str){
        for (int i = 0; i < ends.length; i++) {
            this.ends = ends;
            this.matrix = matrix;
            this.str = str;
            start = 0;
            end = ends[i];
            boolean b = result(str);
            if (b == true){
                return b;
            }
        }
        return false;
    }
    public boolean result(String str){
        // Guarda la cadena como una matriz
        char[] strs = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strs[i] = str.charAt(i);
        }
        // Atraviesa la matriz
        int a = start;
        for (int i = 0; i < strs.length&&a!=-1; i++) {
                int next = Getnext(a,strs[i]);
                a = next;
        }
        // resultado crítico
        if (a != -1 && a==end){
            return true;
        }else {
            return false;
        }
    }
    // Atraviesa la fila ath de la matriz
    private int Getnext(int a, char str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str){
                if (matrix[a][i] != -1){
                    return matrix[a][i];
                }
            }
        }
       return -1;
    }
}