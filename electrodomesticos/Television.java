package electrodomesticos;

public class Television extends Electrodomestico {

	private static final float pulgadasDefecto = 20;
	private static final boolean sintonizadorDefecto = false;

	private float pulgadas = pulgadasDefecto;
	private boolean sintonizador = sintonizadorDefecto;

	public Television() {
		super();
	}

	public Television(float precioBase, int peso) {
		super(precioBase, peso);
	}

	public Television(float precioBase, String color, char consumoEnergetico, int peso, float pulgadas, boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);
		this.pulgadas = pulgadas;
		this.sintonizador = sintonizador;
	}

	public float getPulgadas() {
		return pulgadas;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	@Override
	protected void precioFinal() {
		super.precioFinal();
		precioBase+= (this.pulgadas > 40 ? this.precioBase * 0.3f : 0)
				+ (this.sintonizador ? this.precioBase * 0.5f : 0);
	}

	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + ", precioBase=" + precioBase
				+ ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}

}
