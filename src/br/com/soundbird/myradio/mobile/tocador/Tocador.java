package br.com.soundbird.myradio.mobile.tocador;

import java.util.List;

import br.com.soundbird.myradio.mobile.MyRadioApp;
import br.com.soundbird.myradio.mobile.model.Musica;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Binder;

public class Tocador extends Binder implements ITocador, OnCompletionListener {

	private final MediaPlayer mMediaPlayer = new MediaPlayer();
	
	public Tocador() {
		mMediaPlayer.setOnCompletionListener(this);
	}
	
	@Override
	public void tocar() {
		mMediaPlayer.start();
	}

	@Override
	public void tocar(List<Musica> musicas) {
	}

	@Override
	public void tocar(Musica musica) {
		mMediaPlayer.reset();
		try {
			mMediaPlayer.setDataSource(MyRadioApp.getContext(), musica.getLocal());
			mMediaPlayer.prepare();
		} catch (Exception e) {
		}
		mMediaPlayer.start();
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

	@Override
	public void onCompletion(MediaPlayer arg0) {
	}

}
