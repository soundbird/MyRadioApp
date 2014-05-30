package br.com.soundbird.myradio.mobile.tocador;

import java.util.List;

import br.com.soundbird.myradio.mobile.model.Musica;

public interface ITocador {
	public void tocar();
	public void tocar(List<Musica> musicas);
	public void tocar(Musica musica);
	public void pausar();
	public void parar();
}
