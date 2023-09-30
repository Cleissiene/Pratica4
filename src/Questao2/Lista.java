package Questao2;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;


public class Lista {

    public static void main(String[] args) {

        Deque<Pessoa> dq = new ArrayDeque<>();  //crio o deque
        Scanner ler = new Scanner(System.in);  //crio variável para ler

        String nome, telefone, email;

        for(int i=1; i<=3; i++){
            System.out.println("Digite um nome");
            nome = ler.nextLine();
            System.out.println("Digite um número de telefone");
            telefone = ler.nextLine();
            System.out.println("Digite um email");
            email = ler.nextLine();

            Pessoa pessoa = new Pessoa(nome, telefone, email);
            dq.add(pessoa);

        }

        System.out.println("\nLista em ordem convencional: ");
        for(Pessoa pessoa: dq){
            System.out.println(pessoa);
        }

        System.out.println("\nLista em ordem descendente: ");
        for(Pessoa pessoa: dq) {
            System.out.println(pessoa);

        }

        for(Iterator itr = dq.descendingIterator(); itr.hasNext();){
            System.out.println(itr.next().toString());
        }
        ler.close();





    }
}
