import java.util.Scanner;

public class Gato {
    String nombre;
    int edad;
    int afecto = 0;
    public Gato(String nombreGato, int edadGato){
        nombre = nombreGato;
        edad = edadGato;
    }
    public void Acariciar(){
        afecto++;
    }
    public void Retar(){
        afecto--;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String meQuiere(){
        if (afecto > 2) {
            return "Si";
        }
        else {
            return "No";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CatName = sc.nextLine();
        int CatAge = sc.nextInt();
        Gato gato = new Gato(CatName, CatAge);
        System.out.println(gato.meQuiere());
        System.out.println(gato.getNombre());
        System.out.println(gato.getEdad());
        gato.Acariciar();
        gato.Acariciar();
        gato.Acariciar();
        System.out.println(gato.meQuiere());
        gato.Retar();
        System.out.println(gato.meQuiere());
    }
}
