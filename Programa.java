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
 * @author Caroline e Nícolas
 */
public class Programa {
    Stack M;
    Codigo P;
    Arquivo arq;
    int i, s;
    Object imprime;
    //i = posicao; s = top
 
    public Programa(String nomeArq) throws IOException{
        P = new Codigo();
        arq = new Arquivo(nomeArq);
        arq.inserirArryList(P);
        M = new Stack();
        i = 0;
        imprime = "x";
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
    public void sub() {
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

    //INV (Inverter sinal):
    //M[s]:= -M[s] 
    public void inv() {
        int value = Integer.parseInt(M.get(s).toString()) * (-1);
        M.set(s, value);
    }
    
    //AND (Conjunção):
    //se M [s-1] = 1 e M[s] = 1 então M[s-1]:=1 senão M[s-1]:=0; s:=s - 1 
    public void and() {
        int value1 = Integer.parseInt(M.get(s).toString());
        int value2 = Integer.parseInt(M.get(s-1).toString());
        int result = 0;
        if (value2 == 1 && value1 == 1) result = 1;
        M.set(s-1, result);
        this.s--;
    }
    
    //OR (Disjunção)
    //se M[s-1] = 1  ou M[s] = 1  então M[s-1]:=1  senão M[s-1]:=0; s:=s - 1 
    public void or() {
        int value1 = Integer.parseInt(M.get(s).toString());
        int value2 = Integer.parseInt(M.get(s-1).toString());
        int result = 0;
        if (value2 == 1 || value1 == 1) result = 1;
        M.set(s-1, result);
        this.s--;
    }
	
    //NEG (Negação):
    //M[s]:=1 - M[s] 
    public void neg(){
        int value = 1 - Integer.parseInt(M.get(s).toString());
        M.set(s, value);
    }
    
    //CME (Comparar menor)
    //se M[s-1] < M[s]  então M[s-1]:=1  senão M[s-1]:=0; s:=s - 1 
    public void cme() {
        int value1 = Integer.parseInt(M.get(s).toString());
        int value2 = Integer.parseInt(M.get(s-1).toString());
        int result = 0; 
        if (value2 < value1) result = 1;
        M.set(s-1, result);
        this.s--;
    }
    
    //CMA (Comparar maior)
    //se M[s-1] > M[s]  então M[s-1]:=1  senão M[s-1]:=0; s:=s - 1
    public void cma() {
        int value1 = Integer.parseInt(M.get(s).toString());
        int value2 = Integer.parseInt(M.get(s-1).toString());
        int result = 0;
        if (value2 > value1) result = 1;
        M.set(s-1, result);
        this.s--;
    }
    
    //CEQ (Comparar igual)
    //se M[s-1] = M[s]  então M[s-1]:=1  senão M[s-1]:=0; s:=s - 1 
    public void ceq() {
        int value1 = Integer.parseInt(M.get(s).toString());
        int value2 = Integer.parseInt(M.get(s-1).toString());
        int result = 0;
        if (value2 == value1) result = 1;
        M.set(s-1, result);
        this.s--;
    }
    
    //CDIF (Comparar desigual)
    //se M[s-1] ≠ M[s]  então M[s-1]:=1  senão M[s-1]:=0; s:=s - 1 
    public void cdif() {
        int value1 = Integer.parseInt(M.get(s).toString());
        int value2 = Integer.parseInt(M.get(s-1).toString());
        int result = 0;
        if (value2 != value1) result = 1;
        M.set(s-1, result);
        this.s--;
    }
     
    //CMEQ (Comparar menor ou igual)
    //se M[s-1] ≤ M[s]  então M[s-1]:=1  senão M[s-1]:=0; s:=s - 1 
    public void cmeq() {
        int value1 = Integer.parseInt(M.get(s).toString());
        int value2 = Integer.parseInt(M.get(s-1).toString());
        int result = 0;
        if (value2 <= value1) result = 1;
        M.set(s-1, result);
        this.s--;
    }
    
    //CMAQ (Comparar maior ou igual)
    //se M[s-1] ≥ M[s]  então M[s-1]:=1  senão M[s-1]:=0; s:=s - 1
    public void cmaq() {
        int value1 = Integer.parseInt(M.get(s).toString());
        int value2 = Integer.parseInt(M.get(s-1).toString());
        int result = 0;
        if (value2 >= value1) result = 1;
        M.set(s-1, result);
        this.s--;
    }
    
    //START (Iniciar Programa Principal)
    public void start(){
        this.s = -1;
    }
    
    //HLT (Parar)
    public void hlt() {
        M.removeAllElements();
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
    //STR n (Armazenar valor):
    //M[n]:=M[s]; s:=s-1 
    public void str(int n){
        M.set(n, M.get(s));
        this.s--;
    }
    //JMP t (Desviar sempre):
    //i:= t 
    public void jmp(String t){
        for(int j = 0; j<P.getTamanho(); j++){
            String[] linha = P.getValue(j).split(" ");
            if(t.equals(linha[0])){
                this.i = j;
            }
        }
        //System.out.println(i);
    }
    //JMPF t (Desviar se falso):
    //se M[s] = 0 então i:=t senão i:=i + 1;
    //s:=s-1
    public void jmpf(String t){
        if(M.get(s).equals(0)){
            for(int j = 0; j<P.getTamanho(); j++){
                String[] linha = P.getValue(j).split(" ");
                if(t.equals(linha[0])){
                    this.i = j;
                }
            }
        }
        this.s--;
        System.out.println(i);
    }
    //RD (Leitura):
    //S:=s + 1; M[s]:= “próximo valor de entrada”. 
    public Stack rd(int valor){
        this.s++;
        M.add(s, valor);
        this.i++;
         System.out.println("RD"+M);
        return M;
    }
    //PRN (Impressão):
    //“Imprimir M[s]”; s:=s-1 
    public void prn(){
        imprime = M.get(s);
        this.s--;
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
                                                if(linha[0].equals("OR")){
                                                    or();
                                                }else{
                                                    if(linha[0].equals("CME")){
                                                        cme();
                                                    }else{
                                                        if(linha[0].equals("CMA")){
                                                            cma();
                                                        }else{
                                                            if(linha[0].equals("CEQ")){
                                                                ceq();
                                                            }else{
                                                                if(linha[0].equals("CDIF")){
                                                                    cdif();
                                                                }else{
                                                                    if(linha[0].equals("CMEQ")){
                                                                        cmeq();
                                                                    }else{
                                                                        if(linha[0].equals("CMAQ")){
                                                                            cmaq();
                                                                        }else{
                                                                            if(linha[0].equals("HLT")){
                                                                                hlt();
                                                                            }else{
                                                                                if(linha[0].equals("STR")){
                                                                                    str(Integer.parseInt(linha[1]));
                                                                                }else{
                                                                                    if(linha[0].equals("JMP")){
                                                                                        jmp(linha[1]);
                                                                                    }else{
                                                                                        if(linha[0].equals("JMPF")){
                                                                                            jmpf(linha[1]);
                                                                                        }else{
                                                                                            if(linha[0].equals("PRN")){
                                                                                                prn();
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
            }
        }
        System.out.println(M);
        i++;
        return M;
    }
}