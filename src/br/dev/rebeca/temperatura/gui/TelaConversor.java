package br.dev.rebeca.temperatura.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class TelaConversor {
	
	private JLabel labelCelsius;
	private JTextField txtCelsius;
	private JButton buttonFahrenheit;
	private JButton buttonKelvin;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

public void criarTelaConversor() {
		
		JFrame tela = new JFrame();
		tela.setSize(450, 400);
		tela.setDefaultCloseOperation(3);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em grau celsius:");
		labelCelsius.setBounds(25, 15, 350, 35);
		
		txtCelsius = new JTextField();
		txtCelsius.setBounds(25, 49, 336, 35);	
		
		buttonFahrenheit = new JButton();
		buttonFahrenheit.setText("Fahrenheit");
		buttonFahrenheit.setBounds(25, 89, 165, 30);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(195, 89, 165, 30);
		
		labelResultado = new JLabel();
		labelResultado.setText("78.8 FAHRENHEIT");
		labelResultado.setBounds(225, 125, 130, 295);
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("A Mensagem de erro deve aparecer aqui!");
		labelMensagemErro.setBounds(20, 20, 130, 355);
		
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(buttonFahrenheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		
		tela.setVisible(true);
		
	}
	
}