package domain;

import exceptions.TramaInvalidaException;

public enum TipoDeMaterial {
	TELA(Trama.LISA),
	CUERO(null),
	ALGODON(null),
	JEAN(null),
	SEDA(null),
	NAYLON(null);

	public Trama tipoTrama;
	
	TipoDeMaterial(Trama unaTrama) {
		this.tipoTrama = unaTrama;
		}
	
	public void indicarTrama(Trama unaTrama) {
		if(this==TipoDeMaterial.TELA && unaTrama != null) {
			this.tipoTrama=unaTrama;
		}else {
			throw new TramaInvalidaException("No se puede asignar " + unaTrama + " al material " + this);
		}
	}
}