package electrodomesticos;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];

		listaElectrodomesticos[0] = new Lavadora(140.2f, "grIs", 'A', 140, 58);
		listaElectrodomesticos[1] = new Lavadora(110f, "ROJO", 'B', 11, 58);
		listaElectrodomesticos[2] = new Lavadora(8.7f, "BLANCO", 'C', 25, 58);
		listaElectrodomesticos[3] = new Lavadora(16.10f, "mbappe", 'X', 73, 58);
		listaElectrodomesticos[4] = new Lavadora(133.69f, "azul", 'E', 53, 58);

		listaElectrodomesticos[5] = new Television(80.99f, "NEGRO", 'D', 15, 40.2f, true);
		listaElectrodomesticos[6] = new Television(1880.99f, "blanco", 'C', 55, 140.2f, false);
		listaElectrodomesticos[7] = new Television(380.2f, "GrIs", 'A', 45, 100.8f, false);
		listaElectrodomesticos[8] = new Television(266.1f, "messi", 'Z', 3, 13.33f, true);
		listaElectrodomesticos[9] = new Television(1999.99f, "Rojo", 'X', 195, 24.5f, true);
		
		for(Electrodomestico actual : listaElectrodomesticos) {
			actual.precioFinal();
		}
		
		float precioLavadoras = 0f;
		for(int i =0;i<5;i++) {
			precioLavadoras+=listaElectrodomesticos[i].getPrecioBase();
			System.out.printf("Precio LAVADORA #%d -> %.2f%n",i,listaElectrodomesticos[i].getPrecioBase());
		}
		System.out.println("PRECIO FINAL LAVADORAS = "+precioLavadoras);
		
		float precioTelevisiones = 0f;
		for(int i =5;i<10;i++) {
			precioTelevisiones+=listaElectrodomesticos[i].getPrecioBase();
			System.out.printf("Precio TV #%d -> %.2f%n",i,listaElectrodomesticos[i].getPrecioBase());
		}
		
		
		
		
		System.out.println("PRECIO FINAL TELEVISIONES = "+precioTelevisiones);
		
		System.out.printf("PRECIO TOTAL = %.2f",precioLavadoras+precioTelevisiones);
		
		try {
			Electrodomestico tele = (Electrodomestico) listaElectrodomesticos[7].clone();
			System.out.println(tele.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
