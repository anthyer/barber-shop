package Controller.Helper;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper implements IHelper
{
    private final Agenda view;

    public AgendaHelper(Agenda view)
    {
        this.view = view;
    }
    
    public void preencherTabela(ArrayList<Agendamento> agendamentos)
    {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        for(Agendamento agendamento : agendamentos)
        {
            tableModel.addRow(new Object[]
            {
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
    }
    
    public void preencherClientes(ArrayList<Cliente> clientes)
    {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        for (Cliente cliente: clientes)
        {
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencherservicos(ArrayList<Servico> servicos)
    {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        for (Servico servico : servicos)
        {
            comboBoxModel.addElement(servico);
        }
    }

    public Cliente obterCliente()
    {
        return (Cliente) view.getjComboBoxCliente().getSelectedItem();
    }
    
    public Servico obterServico()
    {
        return (Servico) view.getjComboBoxServico().getSelectedItem();
    }

    public void setarValor(float valor)
    {
        view.getjTextFieldValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo()
    {
        String idString = view.getjTextFieldId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getjTextFieldValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getjTextFieldData().getText();
        String hora = view.getjTextFieldHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextAreaObservacoes().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
    }

    @Override
    public void limparTela()
    {
        view.getjTextFieldId().setText("0");
        view.getjTextFieldData().setText("");
        view.getjTextFieldHora().setText("");
        view.getjTextAreaObservacoes().setText("");
    }
}
