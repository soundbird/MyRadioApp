package br.com.soundbird.myradio.mobile.tocador;

import java.util.List;

import br.com.soundbird.myradio.mobile.model.Musica;
import android.media.MediaPlayer;
import android.os.Binder;

public class Tocador extends Binder implements ITocador {

	private final MediaPlayer mMediaPlayer = new MediaPlayer();
	
	@Override
	public void tocar() {
		mMediaPlayer.start();
	}

	@Override
	public void tocar(List<Musica> musicas) {
	}

	@Override
	public void tocar(Musica musica) {
	}

	@Override
	public void pausar() {
		mMediaPlayer.pause();
	}

	@Override
	public void parar() {
		mMediaPlayer.stop();
	}
	
	public void fechar() {
		parar();
		mMediaPlayer.release();
	}

}
