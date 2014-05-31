package br.com.soundbird.myradio.mobile.model;

import android.net.Uri;

public class Musica {
	
	private static long sCounter = 0;

	private long mId;
	private String mNome;
	private Uri mLocal;
	
	public Musica(String nome, Uri local) {
		super();
		this.mId = ++sCounter;
		this.mNome = nome;
		this.mLocal = local;
	}
	
	@Override
	public String toString() {
		return this.mNome;
	};
	
	public long getId() {
		return mId;
	}
	public String getNome() {
		return mNome;
	}
	public void setNome(String nome) {
		this.mNome = nome;
	}
	public Uri getLocal() {
		return mLocal;
	}
	public void setLocal(Uri local) {
		this.mLocal = local;
	}
}
