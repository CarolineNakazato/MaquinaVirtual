/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinavirtual;

import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author Dell
 */
public class Programa {
    Stack M;
    Codigo P;
    Arquivo arq;
    int i, s;
    //i = posicao; s = top
 
    public Programa(String nomeArq) throws IOException{
       
        P = new Codigo();
        arq = new Arquivo(nomeArq);
        arq.inserirArryList(P);
        M = new Stack();
        i = 0;
        s = 0;
    }
    
    public void soma(){
        int value; 
        value = (int) M.get(s);// + M.get(s-1);
        M.set((s-1), value); 
        s= s - 1;
    }
    public void start(){
        this.s = -1;
    }
    //LDC k (Carregar constante):
    //S:=s + 1 ; M [s]: = k 
    public void ldc(int k){
        this.s++;
        M.add(s, k);
    }
    
    public Stack debug(int numeroInstrucao){
        String[] linha = P.getValue(numeroInstrucao).split(" ");
        //int tamanhoLinha = linha.length;
        System.out.println(linha[0]);
        //System.out.println(linha[1]);
        if(linha[0].equals("START")){
            start();
        }else{
            if(linha[0].equals("LDC")){
                ldc(Integer.parseInt(linha[1]));
            }else{
            
            }
        }
        System.out.println(M);
        i++;
        return M;
    }
}
