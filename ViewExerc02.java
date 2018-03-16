package com.indra.exerc02.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.indra.exerc02.controller.Exerc02Controller;
import com.indra.exerc02.model.ClienteExerc02;

public class ViewExerc02 {
public static void main(String[]args) {
	
		ClienteExerc02 cli = new ClienteExerc02();
		ArrayList<ClienteExerc02> clientes = new ArrayList<ClienteExerc02>();
		
		
		cli.setNome(JOptionPane.showInputDialog("Nome do Cliente: "));
		cli.setRua(JOptionPane.showInputDialog("Rua do cliente: "));
		cli.setNumeroCasa(Integer.parseInt(JOptionPane.showInputDialog("Numero da casa:")));
		cli.setTelefone(Long.parseLong(JOptionPane.showInputDialog("Telefone do cliente: ")));
		cli.setCelular(Long.parseLong(JOptionPane.showInputDialog("Celular do cliente: ")));
		cli.setCpf(JOptionPane.showInputDialog("Cpf do cliente: "));
		cli.setCnpj(JOptionPane.showInputDialog("Cnpj do cliente: "));
		
		
		Exerc02Controller controller = new Exerc02Controller();
		clientes.add(cli);
		controller.listeTodosClientes(clientes);
		

	}
}
