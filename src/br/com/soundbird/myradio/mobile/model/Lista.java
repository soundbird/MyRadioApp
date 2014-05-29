package br.com.soundbird.myradio.mobile.model;

import java.util.ArrayList;
import java.util.List;

import br.com.soundbird.myradio.mobile.R;
import android.net.Uri;

public class Lista {

	public static List<Musica> MUSICAS = new ArrayList<Musica>();
	
	public static void adicionaMusica(Musica musica) {
		MUSICAS.add(musica);
	}
	
	static {
		adicionaMusica(new Musica("Lumaban Ka", Uri.parse("android.resource://br.com.soundbird.myradio.mobile/" + R.raw.lumaban_ka)));
		adicionaMusica(new Musica("Some Sort of Creature", Uri.parse("android.resource://br.com.soundbird.myradio.mobile/" + R.raw.some_sort_of_creature)));
	}
	
}
