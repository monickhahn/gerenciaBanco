/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author MonickHahn
 */
public class ContaBancaria {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;
    
    public ContaBancaria(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.00;
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso.");
    }
    
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
    
    public String toStrong() {
        return "Cliente: " + nome + " " + sobrenome + " | CPF: " + cpf + " | Saldo: R$" + saldo;
    }
}