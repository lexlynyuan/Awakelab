package PruebaInd;

public class Ejecutable {

public static void main(String[] args) {
// declaración y creación de objetos
	
Electrodomesticos lista[]=new Electrodomesticos[10];

	//agregar datos al arreglo de objetos

		lista[0] = new Lavadora(1000, "blanco",'A',0,0);
		lista[1] = new Electrodomesticos("blanco", 'D', 20);
		lista[2] = new Electrodomesticos("rojo", 'B', 25);
		lista[3] = new Lavadora(200, 35);
		lista[4] = new Electrodomesticos(1000,20);
		lista[5] = new Lavadora(1000, "blanco",'A',0,0);
		lista[6] = new Electrodomesticos("ROJO", 'C', 25);
		lista[7] = new Television(220, 50);
		lista[8] = new Television(100,40);
		lista[9] = new Electrodomesticos(120, 60);
		

	
	//inicializo las variables que suman
		
        double totalElectrodomesticos=0;
        double totalTelevision=0;
        double totalLavadoras=0;
        
      for(int i=0;i<lista.length;i++){
        	
        	if(lista[i] instanceof Lavadora){
                   lista[i].PrecioFinal();
               } 
        	if(lista[i] instanceof Television){
                 lista[i].PrecioFinal();
             } 
        	if(lista[i] instanceof Electrodomesticos){
                  lista[i].PrecioFinal();
              }
   

          }
      
      //imprime las cantidades calculadas
      
        System.out.println("La suma del total de lavadoras es de "+ totalLavadoras + " euros");
        System.out.println("La suma del total de televisiones es de "+ totalTelevision+ " euros");
        System.out.println("La suma del total de electrodomesticos es de "+ totalElectrodomesticos+ " euros");
        
        }



}

