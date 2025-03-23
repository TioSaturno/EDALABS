public class Perro {
   //Este seria el codigo que se pidio, ya las adicciones como los get seria desicion de cada uno
   
    String nombrePerro;
    int edadPerro;
    int energia=10;
    
    public Perro(String nombre, int edad) {
        
        nombrePerro=nombre;
        edadPerro=edad;
    }

  
    public void pasear(){
        //
        if(energia==0){
            System.out.println("Tu perro esta sin energia, debe descansar primero");
            return;
        }
        energia--;
    }

 
    public void descansar(){
        //
        if(energia==10){
           System.out.println("Tu perro tiene la energia al maximo, ve a gastarla!!");
           return;
        }
        energia++;
    }

    public void jugar(Perro miPerro, Perro tuPerro){
        //
        if(miPerro.energia==0 || tuPerro.energia==0){
            System.out.println("Uno de los perros esta muy cansado, dile que vaya a descansar:(");
            return;
        }
        miPerro.energia--;
        tuPerro.energia--;

    }
    public static void main(String[] args) {
        
    }

}
