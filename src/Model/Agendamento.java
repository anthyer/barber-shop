/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADS
 */
public class Agendamento
{
    private int id;
    private Cliente cliente;
    private Servico servico;
    float valor;
    Date data;
    String observacao;

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data)
    {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        //Tentativa de fazer o parsing da data recebida para o formato "dd/MM/yyyy HH:mm"
        try
        {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex)
        { //Captura de exceção caso o parsing falhe
            //Log do erro utilizando o Logger
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    public float getValor()
    {
        return valor;
    }

    public void setValor(float valor)
    {
        this.valor = valor;
    }

    public Date getData()
    {
        return data;
    }

    public void setData(Date data)
    {
        this.data = data;
    }

    public String getObservacao()
    {
        return observacao;
    }

    public void setObservacao(String observacao)
    {
        this.observacao = observacao;
    }
}