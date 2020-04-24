package domain;

import exceptions.TramaInvalidaException;

public enum Material {
	TELA(Trama.LISA),
	CUERO(Trama.NINGUNA),
	ALGODON(Trama.NINGUNA),
	JEAN(Trama.NINGUNA),
	SEDA(Trama.NINGUNA),
	NAYLON(Trama.NINGUNA);

	public Trama tipoTrama;
	
	Material(Trama unaTrama) {
		this.tipoTrama = unaTrama;
		}
	
	public void indicarTrama(Trama unaTrama) {
		if(this==Material.TELA && unaTrama != Trama.NINGUNA ) {
			this.tipoTrama=unaTrama;
		}else {
			throw new TramaInvalidaException("No se puede asignar " + unaTrama + " al material " + this);
		}
	}
}