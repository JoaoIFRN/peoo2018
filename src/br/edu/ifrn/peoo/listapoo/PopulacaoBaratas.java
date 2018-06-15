/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.listapoo;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author joaon
 */
public class PopulacaoBaratas {
    
    private long quantidade;
    
    public PopulacaoBaratas(long quantidade){
        this.quantidade = quantidade;
    }
    
    public void aguardar(){
        this.quantidade = this.quantidade * 2;
        //this.quantidade *= 2;
    }
    
    public void pulverizar(){
        this.quantidade = (long) (this.quantidade * 0.9);
    }
    
    public long getBaratas(){
        return this.quantidade;
    }
    
    @Override
    public String toString(){
        return "População: " + this.quantidade;
    }
    
    public static void main(String [] args){
        PopulacaoBaratas baratas = new PopulacaoBaratas(10);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                baratas.aguardar();
                System.out.println(baratas);
            }
        }, 0, 3000);
    }
    
}
