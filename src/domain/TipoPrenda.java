package domain;

public enum TipoPrenda {
	
	REMERA (CategoriaPrenda.PARTE_SUPERIOR),
	PANTALON (CategoriaPrenda.PARTE_INFERIOR);
	
	private final CategoriaPrenda categoriaPrenda;
	
	TipoPrenda(CategoriaPrenda categoriaPrenda) {
		this.categoriaPrenda = categoriaPrenda;
	}
	
	public CategoriaPrenda getCategoria() {
		return this.categoriaPrenda;
	}

}

