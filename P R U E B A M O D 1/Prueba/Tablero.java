package Prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {

	public static void main(String[] args) {
		//llamamos clase show para ejecutar el panel de inicio via JOption
		Show.lanzarMensaje();
		
		String [][]Matriz = CrearMatriz(); //Creamos la Matriz.
		
		Matriz=CrearCarro(Matriz); //creamos los objetos de Carro.
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese fila numero (1 - 15) : ");
		int fila = scanner.nextInt();
		System.out.println("Ingrese columna numero (1 - 15) : ");
		int columna = scanner.nextInt();
		Matriz= Huevo.Marcar (fila, columna, Matriz);
		
		int[] Pu=Huevo.PuntajeAdicional(fila, columna, Matriz);
		
		MostrarMatriz(Matriz);//
		
	}
	
	
	public static String[][] CrearCarro(String [][] Matriz) {
		
		//creaci�n de Objetos
			
		Kromi krom_1 = new Kromi(); //creamos 3 Objetos del tipo Kromi
		Kromi krom_2 = new Kromi();
		Kromi krom_3 = new Kromi();
				
		Caguano cag_1 = new Caguano();//Creamos 5 objtos del tipo Caguano
		Caguano cag_2 = new Caguano();
		Caguano cag_3 = new Caguano();
		Caguano cag_4 = new Caguano();
		Caguano cag_5 = new Caguano();
		
		Trupalla tru_1 = new Trupalla(); //Creamos 10 objetos del tipo Trupalla.
		Trupalla tru_2 = new Trupalla();
		Trupalla tru_3 = new Trupalla();
		Trupalla tru_4 = new Trupalla();
		Trupalla tru_5 = new Trupalla();
		Trupalla tru_6 = new Trupalla();
		Trupalla tru_7 = new Trupalla();
		Trupalla tru_8 = new Trupalla();
		Trupalla tru_9 = new Trupalla();
		Trupalla tru_10 = new Trupalla();
		
		//Intentamos colocar los objetos con sus respectivos datos.
		/*
				//krom(int anoFabricacion, String marca)
		Kromi krom1 = new Kromi(2000;"mazda"); 
		Kromi krom2 = new Kromi(2002, "Mazda");
		Kromi krom3 = new Kromi( 2010, "Mercedes");
		
		//Cag(alcanceTiro, String colorConfeti)
		Caguano cag1 = new Caguano(int 130, String "Amarillo");
		Caguano cag2 = new Caguano(int 100, String "Verde");
		Caguano cag3 = new Caguano(int 120, String "Azul");
		Caguano cag4 = new Caguano(int 130, String "Azul");
		Caguano cag5 = new Caguano(int 100, String "Amarillo");
		
		//tru(nivelArmadura, Nombre)
		Trupalla tru1 = new Trupalla(int 1, String "Pedro");
		Trupalla tru2 = new Trupalla(int 2, String "Juan");
		Trupalla tru3 = new Trupalla(int 3, String "Diego");
		Trupalla tru4 = new Trupalla(int 4, String "Alexis");
		Trupalla tru5 = new Trupalla(int 5, String "Arturo");
		Trupalla tru6 = new Trupalla(int 3, String "Darth");
		Trupalla tru7 = new Trupalla(int 4, String "Baby");
		Trupalla tru8 = new Trupalla(int 3, String "Ironman");
		Trupalla tru9 = new Trupalla(int 2, String "Hulk");
		Trupalla tru10 = new Trupalla(int 1, String "Checopete");
		
		*/
		
		ArrayList<Integer> Filas = new  ArrayList<Integer>(); //creamos una lista de numeros para agregar las filas
		ArrayList<Integer> Columnas = new ArrayList<Integer>();//creamos una lista de numeros para agregar las columnas
	
		Filas.add(0);
		Columnas.add(0);
		int indice=0;
		
				do {
					if(indice ==0) {

						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
							if(Matriz[columna][fila]=="[   ]"&& Matriz[columna][fila+1]=="[   ]" 
									&& Matriz[columna][fila+2]=="[   ]") {
								indice=1;
								krom_1.setFila(fila);
								krom_1.setColumna(columna);
								String [][] Poscion_krom_1=krom_1.Posicion_Kromi();
								int fila_1 = Integer.parseInt(Poscion_krom_1[0][0]);
								int columna_1 = Integer.parseInt(Poscion_krom_1[0][1]);
								String dato_1 = Poscion_krom_1[0][2];
								int fila_2 = Integer.parseInt(Poscion_krom_1[1][0]);
								int columna_2 = Integer.parseInt(Poscion_krom_1[1][1]);
								String dato_2 = Poscion_krom_1[1][2];
								int fila_3 = Integer.parseInt(Poscion_krom_1[2][0]);
								int columna_3 = Integer.parseInt(Poscion_krom_1[2][1]);
								String dato_3 = Poscion_krom_1[2][2];
								Filas.add(fila_1);
								Filas.add(fila_2);
								Filas.add(fila_3);
								Columnas.add(columna_1);
								Columnas.add(columna_2);
								Columnas.add(columna_3);
								
								Matriz[columna_1][fila_1]=dato_1;
								Matriz[columna_2][fila_2]=dato_2;
								Matriz[columna_3][fila_3]=dato_3;
								}
					} 
						if(indice==1) {
						
						int columna =(int) (Math.random()*13+1);
						int fila = (int) (Math.random()*13+1);
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							indice=2;
							krom_2.setFila(fila);
							krom_2.setColumna(columna);
							String [][] Poscion_krom_2=krom_2.Posicion_Kromi();
							int fila_1 = Integer.parseInt(Poscion_krom_2[0][0]);
							int columna_1 = Integer.parseInt(Poscion_krom_2[0][1]);
							String dato_1 = Poscion_krom_2[0][2];
							int fila_2 = Integer.parseInt(Poscion_krom_2[1][0]);
							int columna_2 = Integer.parseInt(Poscion_krom_2[1][1]);
							String dato_2 = Poscion_krom_2[1][2];
							int fila_3 = Integer.parseInt(Poscion_krom_2[2][0]);
							int columna_3 = Integer.parseInt(Poscion_krom_2[2][1]);
							String dato_3 = Poscion_krom_2[2][2];
							Filas.add(fila_1);
							Filas.add(fila_2);
							Filas.add(fila_3);
							Columnas.add(columna_1);
							Columnas.add(columna_2);
							Columnas.add(columna_3);
							Matriz[columna_1][fila_1]=dato_1;
							Matriz[columna_2][fila_2]=dato_2;
							Matriz[columna_3][fila_3]=dato_3;
						}
						
					} 
						if (indice==2) {
						int columna =(int) (Math.random()*13+1);
						int fila = (int) (Math.random()*13+1);
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
								indice=3;
								krom_3.setFila(fila);
								krom_3.setColumna(columna);
								String [][] Poscion_krom_3=krom_3.Posicion_Kromi();
								int fila_1 = Integer.parseInt(Poscion_krom_3[0][0]);
								int columna_1 = Integer.parseInt(Poscion_krom_3[0][1]);
								String dato_1 = Poscion_krom_3[0][2];
								int fila_2 = Integer.parseInt(Poscion_krom_3[1][0]);
								int columna_2 = Integer.parseInt(Poscion_krom_3[1][1]);
								String dato_2 = Poscion_krom_3[1][2];
								int fila_3 = Integer.parseInt(Poscion_krom_3[2][0]);
								int columna_3 = Integer.parseInt(Poscion_krom_3[2][1]);
								String dato_3 = Poscion_krom_3[2][2];
								Filas.add(fila_1);
								Filas.add(fila_2);
								Filas.add(fila_3);
								Columnas.add(columna_1);
								Columnas.add(columna_2);
								Columnas.add(columna_3);
								Matriz[columna_1][fila_1]=dato_1;
								Matriz[columna_2][fila_2]=dato_2;
								Matriz[columna_3][fila_3]=dato_3;
								}
					}
				}while(indice<3);
				
				int indice_2=0;
				
				//Para ingresar los Caguanos
				
				do {
				
				if(indice_2 ==0) {

					int columna =(int) (Math.random()*13+1);
					int  fila = (int) (Math.random()*13+1);
					
					if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
							&& Matriz[columna-1][fila]=="[   ]") {
						indice_2=1;
						cag_1.setFila(fila);
						cag_1.setColumna(columna);
						String [][] Poscion_cag_1=cag_1.Posicion_Caguano();
						int fila_1 = Integer.parseInt(Poscion_cag_1[0][0]);
						int columna_1 = Integer.parseInt(Poscion_cag_1[0][1]);
						String dato_1 = Poscion_cag_1[0][2];
						int fila_2 = Integer.parseInt(Poscion_cag_1[1][0]);
						int columna_2 = Integer.parseInt(Poscion_cag_1[1][1]);
						String dato_2 = Poscion_cag_1[1][2];
						Filas.add(fila_1);
						Filas.add(fila_2);
						Columnas.add(columna_1);
						Columnas.add(columna_2);
						Matriz[columna_1][fila_1]=dato_1;
						Matriz[columna_2][fila_2]=dato_2;
					}
				}
				
				if(indice_2 ==1) {
				int columna =(int) (Math.random()*13+1);
				int  fila = (int) (Math.random()*13+1);
				
				if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
						&& Matriz[columna-1][fila]=="[   ]") {
					indice_2=2;
					cag_2.setFila(fila);
					cag_2.setColumna(columna);
					String [][] Poscion_cag_2=cag_2.Posicion_Caguano();
					int fila_1 = Integer.parseInt(Poscion_cag_2[0][0]);
					int columna_1 = Integer.parseInt(Poscion_cag_2[0][1]);
					String dato_1 = Poscion_cag_2[0][2];
					int fila_2 = Integer.parseInt(Poscion_cag_2[1][0]);
					int columna_2 = Integer.parseInt(Poscion_cag_2[1][1]);
					String dato_2 = Poscion_cag_2[1][2];
					Filas.add(fila_1);
					Filas.add(fila_2);
					Columnas.add(columna_1);
					Columnas.add(columna_2);
					Matriz[columna_1][fila_1]=dato_1;
					Matriz[columna_2][fila_2]=dato_2;
					}
				
				}
				if(indice_2 ==2) {
					int columna =(int) (Math.random()*13+1);
					int  fila = (int) (Math.random()*13+1);
					
					if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
							&& Matriz[columna-1][fila]=="[   ]") {
						indice_2=3;
						cag_3.setFila(fila);
						cag_3.setColumna(columna);
						String [][] Poscion_cag_3=cag_3.Posicion_Caguano();
						int fila_1 = Integer.parseInt(Poscion_cag_3[0][0]);
						int columna_1 = Integer.parseInt(Poscion_cag_3[0][1]);
						String dato_1 = Poscion_cag_3[0][2];
						int fila_2 = Integer.parseInt(Poscion_cag_3[1][0]);
						int columna_2 = Integer.parseInt(Poscion_cag_3[1][1]);
						String dato_2 = Poscion_cag_3[1][2];
						Filas.add(fila_1);
						Filas.add(fila_2);
						Columnas.add(columna_1);
						Columnas.add(columna_2);
						Matriz[columna_1][fila_1]=dato_1;
						Matriz[columna_2][fila_2]=dato_2;
					}
				}
				
				if(indice_2 ==3) {
					int columna =(int) (Math.random()*13+1);
					int  fila = (int) (Math.random()*13+1);
					
					if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
							&& Matriz[columna-1][fila]=="[   ]") {
						indice_2=4;
						cag_4.setFila(fila);
						cag_4.setColumna(columna);
						String [][] Poscion_cag_4=cag_4.Posicion_Caguano();
						int fila_1 = Integer.parseInt(Poscion_cag_4[0][0]);
						int columna_1 = Integer.parseInt(Poscion_cag_4[0][1]);
						String dato_1 = Poscion_cag_4[0][2];
						int fila_2 = Integer.parseInt(Poscion_cag_4[1][0]);
						int columna_2 = Integer.parseInt(Poscion_cag_4[1][1]);
						String dato_2 = Poscion_cag_4[1][2];
						Filas.add(fila_1);
						Filas.add(fila_2);
						Columnas.add(columna_1);
						Columnas.add(columna_2);
						Matriz[columna_1][fila_1]=dato_1;
						Matriz[columna_2][fila_2]=dato_2;
					}
				}
				
				if(indice_2 == 4) {
					int columna =(int) (Math.random()*13+1);
					int  fila = (int) (Math.random()*13+1);
					
					if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
							&& Matriz[columna-1][fila]=="[   ]") {
						indice_2= 5;
						cag_5.setFila(fila);
						cag_5.setColumna(columna);
						String [][] Poscion_cag_5=cag_5.Posicion_Caguano();
						int fila_1 = Integer.parseInt(Poscion_cag_5[0][0]);
						int columna_1 = Integer.parseInt(Poscion_cag_5[0][1]);
						String dato_1 = Poscion_cag_5[0][2];
						int fila_2 = Integer.parseInt(Poscion_cag_5[1][0]);
						int columna_2 = Integer.parseInt(Poscion_cag_5[1][1]);
						String dato_2 = Poscion_cag_5[1][2];

						Filas.add(fila_1);
						Filas.add(fila_2);
						Columnas.add(columna_1);
						Columnas.add(columna_2);
						Matriz[columna_1][fila_1]=dato_1;
						Matriz[columna_2][fila_2]=dato_2;
					}
				}
				
			}while(indice_2<5);
				
				int indice_3=0;
				
				do {
					
					if(indice_3 ==0) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 1;
							Filas.add(fila);
							Columnas.add(columna);
							tru_1.setFila(fila);
							tru_1.setColumna(columna);
							String [][] Poscion_tru_1=tru_1.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_1[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_1[0][1]);
							String dato_1 = Poscion_tru_1[0][2];
							
							Matriz[columna_1][fila_1]=dato_1;
			
							}
						}
					
					if(indice_3 ==1) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 2;
							Filas.add(fila);
							Columnas.add(columna);
							tru_2.setFila(fila);
							tru_2.setColumna(columna);
							String [][] Poscion_tru_2=tru_2.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_2[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_2[0][1]);
							String dato_1 = Poscion_tru_2[0][2];
							
							Matriz[columna_1][fila_1]=dato_1;
					
						}
					}
					
					if(indice_3 ==2) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 3;
							Filas.add(fila);
							Columnas.add(columna);
							tru_3.setFila(fila);
							tru_3.setColumna(columna);
							String [][] Poscion_tru_3=tru_3.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_3[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_3[0][1]);
							String dato_1 = Poscion_tru_3[0][2];
							
							Matriz[columna_1][fila_1]=dato_1;
			
						}
					}
					
					if(indice_3 ==3) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 4;
							Filas.add(fila);
							Columnas.add(columna);
							tru_4.setFila(fila);
							tru_4.setColumna(columna);
							String [][] Poscion_tru_4=tru_4.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_4[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_4[0][1]);
							String dato_1 = Poscion_tru_4[0][2];
							Matriz[columna_1][fila_1]=dato_1;
						
							}
					}
					
					if(indice_3 ==4) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 5;
							Filas.add(fila);
							Columnas.add(columna);
							tru_5.setFila(fila);
							tru_5.setColumna(columna);
							String [][] Poscion_tru_5=tru_5.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_5[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_5[0][1]);
							String dato_1 = Poscion_tru_5[0][2];
							
							Matriz[columna_1][fila_1]=dato_1;
							}
					}
					
					if(indice_3 ==5) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 6;
							Filas.add(fila);
							Columnas.add(columna);
							tru_6.setFila(fila);
							tru_6.setColumna(columna);
							String [][] Poscion_tru_6=tru_6.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_6[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_6[0][1]);
							String dato_1 = Poscion_tru_6[0][2];
							
							Matriz[columna_1][fila_1]=dato_1;
			
							}
					}
					
					if(indice_3 ==6) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 7;
							Columnas.add(columna);
							tru_7.setFila(fila);
							tru_7.setColumna(columna);
							String [][] Poscion_tru_7=tru_7.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_7[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_7[0][1]);
							String dato_1 = Poscion_tru_7[0][2];
							
							Matriz[columna_1][fila_1]=dato_1;
			
							}
					}
					
					if(indice_3 ==7) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 8;
							Filas.add(fila);
							Columnas.add(columna);
							tru_8.setFila(fila);
							tru_8.setColumna(columna);
							String [][] Poscion_tru_8=tru_8.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_8[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_8[0][1]);
							String dato_1 = Poscion_tru_8[0][2];
							
							Matriz[columna_1][fila_1]=dato_1;
				
						
							}
					}
					if(indice_3 ==8) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 9;
							Filas.add(fila);
							Columnas.add(columna);
							tru_9.setFila(fila);
							tru_9.setColumna(columna);
							String [][] Poscion_tru_9=tru_9.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_9[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_9[0][1]);
							String dato_1 = Poscion_tru_9[0][2];
							
							Matriz[columna_1][fila_1]=dato_1;
		
						
							}
					}
					
					if(indice_3 ==9) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 10;
							Filas.add(fila);
							Columnas.add(columna);
							tru_10.setFila(fila);
							tru_10.setColumna(columna);
							String [][] Poscion_tru_10=tru_10.Posicion_Trupalla();
							int fila_1 = Integer.parseInt(Poscion_tru_10[0][0]);
							int columna_1 = Integer.parseInt(Poscion_tru_10[0][1]);
							String dato_1 = Poscion_tru_10[0][2];
							
							Matriz[columna_1][fila_1]=dato_1;

						}
					}
					
					
					
					
					}while(indice_3<10);
					
					
		
		return Matriz;
	}
	
	public void LanzarHuevo() {
		
	}
	
	public static void MostrarMatriz(String [][] Matriz) {
		//Para mostrar la matriz
		for(int i = 0; i<16; i++) {
			for(int j = 0; j<15; j++) {
				System.out.print(Matriz[j][i]+" \t");
			}
			System.out.println(" "+Matriz[15][i]+" \t  ");
		}
		
	}
	
	public int CalcularPuntaje() {
		int puntaje=0;
		
		return puntaje;
	}
	
	public static String [][] CrearMatriz(){
		int contador =0;
		int Cont=0;
		String[][] Matriz = new String [16][16];	
		
		//Para llenar la Matriz inicial.
				
		for(int j = 0; j<16; j++) {//eje y (vertical)
			for(int i = 0; i<16; i++) {//eje x (horizontal)
				
				if (i==0 && j==0) { //posicion (0,0) se da un espacio
					Matriz[0][0]=("  ");
					}
				else if(j==0 && i>0 ) { //Para el eje horizontal, colocamos letras de A hasta la O
					Cont++;
					Matriz[i][0]=("  "+Integer.toString(Cont)); //transformamos el caracter en String
					
					}
				else if(i==0 && j>0 ) {//Para el eje vertical, colocamos numeros de 1 a 15.
						if (contador <9) {//esta parte es para que tenga el mismo ancho los 
										 // numeros menores que 10.(recuerde que se incrementa
										// que se imprime.
							contador++;
							Matriz[0][j]=("  "+Integer.toString(contador));					
							}
						else {// los numeros mayores de 10.
						contador++;
						Matriz[0][j]=(" "+Integer.toString(contador));
						}
				}
				else //Esta parte rellena lo que no esta en los ejes.
				
					Matriz[j][i]=("[   ]");
				}
			}
		
		return Matriz;
		
	}

}
