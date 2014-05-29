package br.com.soundbird.myradio.mobile.model;

import android.net.Uri;

public class Musica {

	private String nome;
	private Uri local;
	
	public Musica(String nome, Uri local) {
		super();
		this.nome = nome;
		this.local = local;
	}
	
	@Override
	public String toString() {
		return this.nome;
	};
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Uri getLocal() {
		return local;
	}
	public void setLocal(Uri local) {
		this.local = local;
	}
}
