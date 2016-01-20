import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author SAIN PEDRAZA GUERRERO
 *
 */
public class VentanaCirculo extends JFrame implements ActionListener {
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	
	private JLabel lbN1 = new JLabel("CALCULAR POR RADIO");
	private JLabel lbN2 = new JLabel("Ingresa Radio");
	private JLabel lbN3 = new JLabel("CALCULAR POR DIAMETRO");
	private JLabel lbN4 = new JLabel("Ingresa Diametro");
	
	private JLabel lbResultado= new JLabel("Resultado");
	
	private JButton btnCalcularRadio= new JButton("Calcular");
	private JButton btnCalcularDiametro= new JButton("Calcular");
	
	private Container c= getContentPane();
	
	private Operaciones op = new Operaciones();
	
	/**
	 * Dimenciones de ventana
	 */
	public VentanaCirculo(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		cargarControles();
	}
	/**
	 * Dimenciones de cada elemento que conforma la ventana
	 */
	private void cargarControles() {

		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		lbN2.setBounds(10,40, 280, 30);
		txtN1.setBounds(10, 70, 280, 30);
		
		btnCalcularRadio.setBounds(10, 100, 280, 30);
		
		lbN3.setBounds(10,130, 280, 30);
		lbN4.setBounds(10,170, 280, 30);
		txtN2.setBounds(10, 200, 280, 30);
		
		btnCalcularDiametro.setBounds(10, 230, 280, 30);
		
		lbResultado.setBounds(10,260, 280,30);
		/**
		 * Agrega cada elemento a la ventana
		 */
		c.add(lbN1);
		c.add(lbN2);
		c.add(txtN1);
		
		c.add(lbN3);
		c.add(lbN4);
		c.add(txtN2);
		
		c.add(btnCalcularRadio);
		c.add(btnCalcularDiametro);
		c.add(lbResultado);
		btnCalcularRadio.addActionListener(this);
		btnCalcularDiametro.addActionListener(this);
		
	}
	/**
	 * Metodo con sentencia if para calcular mediante radio y diametro el primetro del circulo
	 */
	public void actionPerformed(ActionEvent arg0){
		Object boton = arg0.getSource();
		if(boton==btnCalcularRadio){
			float s = op.areaCirculoRadio(Float.parseFloat(txtN1.getText()));
			lbResultado.setText(String.format("El perimetro %s = %f metros cuadrados", txtN1.getText(), s));
		}
		if(boton==btnCalcularDiametro){
			float r = op.areaCirculoDiametro(Float.parseFloat(txtN2.getText()));
			lbResultado.setText(String.format("El perimetro %s = %f metros cuadrados", txtN2.getText(), r));
		}
	}

}
