package electrodomesticos;

public abstract class Electrodomestico implements Cloneable{

	private static final int pesoDefecto = 5;
	private static final float precioDefecto = 100f;
	private static final char consumoDefecto = 'F';
	private static final String colorDefecto = "BLANCO";

	protected float precioBase = precioDefecto;
	protected String color = colorDefecto;
	protected char consumoEnergetico = consumoDefecto;
	protected int peso = pesoDefecto;

	/* CONSTRUCTORS */
	public Electrodomestico() {

	}

	public Electrodomestico(float precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(float precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = this.comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	/* GETTERS */
	public float getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	/* FUNCTIONS */
	private char comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
			return letra;
		default:
			return consumoDefecto;
		}

	}

	private String comprobarColor(String color) {
		color = color.toUpperCase();
		switch (color) {
		case "BLANCO":
		case "NEGRO":
		case "ROJO":
		case "AZUL":
		case "GRIS":
			return color;
		default:
			return colorDefecto;
		}

	}

	protected void precioFinal() {
		float precioSuma = 0;

		switch (this.consumoEnergetico) {
		case 'A':
			precioSuma += 100;
			break;
		case 'B':
			precioSuma += 80;
			break;
		case 'C':
			precioSuma += 60;
			break;
		case 'D':
			precioSuma += 50;
			break;
		case 'E':
			precioSuma += 30;
			break;
		case 'F':
			precioSuma += 10;
			break;
		}

		if (peso <= 19)
			precioSuma += 10;
		else if (peso <= 49)
			precioSuma += 50;
		else if (peso <= 79)
			precioSuma += 50;
		else if (peso >= 80)
			precioSuma += 50;

		this.precioBase+=precioSuma;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
