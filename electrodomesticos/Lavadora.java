package electrodomesticos;

public class Lavadora extends Electrodomestico {

	private static final int cargaDefecto = 5;

	private int carga = cargaDefecto;

	/* CONSTRUCTORS */
	public Lavadora() {
		super();
	}

	public Lavadora(float precio, int peso) {
		super(precio, peso);
	}

	public Lavadora(float precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	protected void precioFinal() {
		super.precioFinal();
		precioBase+= + (this.carga > 30 ? 50 : 0);
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
