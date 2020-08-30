/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinavirtual;

import java.io.*;

/**
 *
 * @author Dell
 */
public class Arquivo {
    protected String nome;
    
    public Arquivo(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
	this.nome = nome;		
    }

    public String getNome(){
	return nome;		
    } 
    
    public String imprimir() throws FileNotFoundException, IOException{
        int i = 1;
        FileInputStream stream = new FileInputStream(nome);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        
        String linha = br.readLine();
        String txt = "";
        while(linha != null) {
            //System.out.println(linha);
            txt += i +" "+ linha+"\n";
            linha = br.readLine();
            i++;
        }
        return txt;
    }
    public void inserirArryList(Codigo c) throws FileNotFoundException, IOException{
        FileInputStream stream = new FileInputStream(nome);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        
        String l = br.readLine();
        while(l != null) {
            c.inserir(l);
            l = br.readLine();
        }
    }
}
