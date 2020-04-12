package domain;

public enum TipoPrenda {
	
	REMERA (CategoriaPrenda.PARTE_SUPERIOR, FactorClima.SOL),
	PANTALON (CategoriaPrenda.PARTE_INFERIOR, FactorClima.FRIO);
	
	private final CategoriaPrenda categoriaPrenda;
	private final FactorClima climaOptimo;
	
	TipoPrenda(CategoriaPrenda categoriaPrenda, FactorClima climaOptimo) {
		this.categoriaPrenda = categoriaPrenda;
		this.climaOptimo = climaOptimo;
	}
	
	public CategoriaPrenda getCategoriaPrenda() {
		return this.categoriaPrenda;
	}
	
	public FactorClima getClimaOptimo() {
		return climaOptimo;
	}
}

