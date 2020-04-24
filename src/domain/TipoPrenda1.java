package domain;

public enum TipoPrenda1 {
	
	REMERA (CategoriaPrenda.PARTE_SUPERIOR),
	PANTALON (CategoriaPrenda.PARTE_INFERIOR);
	
	private final CategoriaPrenda categoriaPrenda;
	
	TipoPrenda1(CategoriaPrenda categoriaPrenda) {
		this.categoriaPrenda = categoriaPrenda;
	}
	
	public CategoriaPrenda getCategoria() {
		return this.categoriaPrenda;
	}

}

