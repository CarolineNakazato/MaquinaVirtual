/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinavirtual;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Codigo {
     ArrayList<String> cod = new ArrayList();
     //int tamanho;
     
    public Codigo(){
          //arq = new Arquivo(nomeArq);
    }
     
    public void inserir(String linha){
	this.cod.add(linha);		
    }
    
    public void excluir(int posicao){
        try {
            cod.remove(posicao);
        } catch (IndexOutOfBoundsException e) {
        System.out.printf("\nErro: posição inválida (%s).",e.getMessage());
        }
    }
    
    public String getValue(int posicao){
        return cod.get(posicao);
    }
    
    public int getTamanho(){
        return cod.size();
    }
    
    public int getPosicao(String linha){
        int tamanho = cod.size();
        for (int i=0; i<tamanho; i++) {
            if((cod.get(i).equals(linha)))
            return i;
        }
        return -1;
    }
    
    public String imprimir(){
        int tamanho = cod.size();
        String txt = "";
        for (int i=0; i<tamanho; i++) {
            txt += cod.get(i);
        }
        return txt;
    }
}
