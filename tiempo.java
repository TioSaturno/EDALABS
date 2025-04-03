class Tiempo{
public static void medirtiempo(){ 
long startTime = System.nanoTime();
//aqui va todo el codigo del metodo
for(int i=0; i<10; i++){
    System.out.println(i);
}//este seria el final de todo el metodo
long endTime = System.nanoTime();
System.out.println("El metodo x se demoro " + (endTime -startTime) + " nano-segundos");
}
public static void main(String[] args) {
    medirtiempo();
}
}