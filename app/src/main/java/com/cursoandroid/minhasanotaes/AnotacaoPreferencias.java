package com.cursoandroid.minhasanotaes;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencias {
    private Context contexto;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private final String CHAVE_NOME = "nome";

    private final String NOME_ARQUIVO = "anotacao.preferencias";

    public  AnotacaoPreferencias(Context c){
        this.contexto=c;
        //MODE = 0 SIGNIFICA QUE SOMENTE O APP PODE ACESSAR O ARQUIVO DOS DADOS
        preferences = contexto.getSharedPreferences(NOME_ARQUIVO,0);
        editor = preferences.edit();
    }
    public void salvarAnotacao(String anotacao){
        editor.putString(CHAVE_NOME,anotacao);
        editor.commit();
    }

    public String recuperarAnotacao(){
        return preferences.getString(CHAVE_NOME,"");
    }
}
