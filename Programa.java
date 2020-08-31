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
    }
    //ADD (Somar):
    //M[s-1]:=M[s-1] + M[s]; s:=s - 1
    public void add(){
        int value = Integer.parseInt(M.get(s-1).toString())+ Integer.parseInt(M.get(s).toString());
        M.set(s-1, value);
        this.s--;
    }
    //SUB (Subtrair):
    //M[s-1]:=M[s-1] - M[s]; s:=s - 1
    public void sub(){
        int value = Integer.parseInt(M.get(s-1).toString())- Integer.parseInt(M.get(s).toString());
        M.set(s-1, value);
        this.s--;
    }
    //MULT (Multiplicar):
    //M[s-1]:=M[s-1] * M[s]; s:=s - 1
    public void mult() {
        int value = Integer.parseInt(M.get(s-1).toString())* Integer.parseInt(M.get(s).toString());
        M.set(s-1, value);
        this.s--;
    }
    //DIVI (Dividir):
    //M[s-1]:=M[s-1] div M[s]; s:=s - 1 
    public void divi() {
        int value = Integer.parseInt(M.get(s-1).toString())/ Integer.parseInt(M.get(s).toString());
        M.set(s-1, value);
        this.s--;
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
    //LDV n (Carregar valor):
    //S:=s + 1 ; M[s]:=M[n] 
    public void ldv(int n){
        this.s++;
         M.add(s, M.get(n));
    }
    //INV (Inverter sinal):
    //M[s]:= -M[s] 
    public void inv(){
        int value = Integer.parseInt(M.get(s).toString()) * (-1);
        M.set(s, value);
    }
    //AND (Conjunção):
    //se M [s-1] = 1 e M[s] = 1 então M[s-1]:=1 senão M[s-1]:=0; s:=s - 1 
     public void and(){
        int value1 = Integer.parseInt(M.get(s).toString());
        int value2 = Integer.parseInt(M.get(s-1).toString());
        int result = 0;
        if ((value2 == 1) && (value1 == 1)) 
            result = 1;
        M.set(s-1, result);
        this.s--;
    }
    //NEG (Negação):
    //M[s]:=1 - M[s] 
    public void neg(){
        int value = 1 - Integer.parseInt(M.get(s).toString());
        M.set(s, value);
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
                if(linha[0].equals("LDV")){
                    ldv(Integer.parseInt(linha[1]));
                }else{
                    if(linha[0].equals("ADD")){
                        add();
                    }else{
                        if(linha[0].equals("SUB")){
                            sub();
                        }else{
                            if(linha[0].equals("MULT")){
                                mult();
                            }else{
                                if(linha[0].equals("DIVI")){
                                    divi();
                                }else{
                                    if(linha[0].equals("NEG")){
                                        neg();
                                    }else{
                                        if(linha[0].equals("INV")){
                                            inv();
                                        }else{
                                            if(linha[0].equals("AND")){
                                                and();
                                            }else{
                         
                                            }
                                        }
                                    }
                                }
                            }
                        }  
                    }
                }
            }
        }
        System.out.println(M);
        i++;
        return M;
    }
}
