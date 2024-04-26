/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import Model.Agendamento;

/**
 *
 * @author ADS
 */
public class Main
{
    public static void main(String[] args)
    {
        String nome = "Rodrigo";
        System.out.println(nome);

        Servico servico = new Servico(1, "barba", 30);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());

        Cliente cliente = new Cliente(1, "Jorge", "Rua Tesla, 95", "4895566958");
        System.out.println(cliente.getNome());//Neste caso getNome vem herdado de Pessoa

        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario.getNome());//Neste caso getNome vem herdado de Pessoa

        /*Pessoa pessoa = new Pessoa(1, "Joao");//Erro Pessoa da classe abstract não pode ser instanciado
        System.out.println(pessoa.getNome());*/
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "25/03/2024 11:20");
        System.out.println(agendamento.getCliente().getNome());//Breakpoint
    }
}
