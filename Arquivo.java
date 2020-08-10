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
//Serialized??????
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
   
    public Pilha colocaNaPilha() throws FileNotFoundException, IOException{
        FileInputStream stream = new FileInputStream(nome);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        
        Pilha s = new Pilha();
        String linha = br.readLine();
        
        while(linha != null) {
            //System.out.println(linha);
            s.empilhar(linha);
            linha = br.readLine();
        }
        return s;
    }
    
    public String imprimir() throws FileNotFoundException, IOException{
        FileInputStream stream = new FileInputStream(nome);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        
        String linha = br.readLine();
        String txt = "";
        while(linha != null) {
            //System.out.println(linha);
            txt += linha+"/n";
            linha = br.readLine();
        }
        return txt;
    }
}
