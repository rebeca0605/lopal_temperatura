package br.dev.rebeca.temperatura.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.dev.rebeca.temperatura.model.Temperatura;

public class TelaConversor {

	private JLabel labelCelsius;
	private JTextField txtCelsius;
	private JButton buttonFahrenheit;
	private JButton buttonKelvin;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	public void criarTelaConversor() {

		JFrame tela = new JFrame();
		tela.setSize(405, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		buttonFahrenheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String textCelsius = txtCelsius.getText();

				try {

					double celsius = Double.parseDouble(textCelsius);

					Temperatura fahrenheit = new Temperatura();
					fahrenheit.setCelsius(celsius);
					celsius = fahrenheit.converterParaFahrenheit();

					labelResultado.setText(String.valueOf(Math.round(celsius) + "  FAHRENHEIT"));

				} catch (NumberFormatException e2) {

					labelMensagemErro.setText("<html> Conversão não realizada! <br> Por favor, insira apenas números.<html>");

				}

			}
		});

		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(195, 89, 165, 30);
		buttonKelvin.setFont(new Font("Arial", Font.BOLD, 15));
		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String textCelsius = txtCelsius.getText();

				try {

					double celsius = Double.parseDouble(textCelsius);

					Temperatura kelvin = new Temperatura();
					kelvin.setCelsius(celsius);
					celsius = kelvin.converterParaKelvin();

					labelResultado.setText(String.valueOf(Math.round(celsius) + "  KELVIN"));

				} catch (NumberFormatException e2) {

					labelMensagemErro.setText("<html> Conversão não realizada! <br> Por favor, insira apenas números.<html>");
				}

			}
		});

		labelResultado = new JLabel();
		labelResultado.setBounds(100, 140, 250, 35);
		labelResultado.setFont(new Font("Arial", Font.BOLD, 22));

		labelMensagemErro = new JLabel();
		labelMensagemErro.setForeground(Color.red);
		labelMensagemErro.setBounds(50, 20, 300, 355);

		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(buttonFahrenheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);

		tela.setVisible(true);

	}

}