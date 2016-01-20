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
public class VentanaCuadrado extends JFrame implements ActionListener{
	
	private JTextField txtN1= new JTextField();
	
	private JLabel lbN1= new JLabel("Ingresa el Area:");
	
	private JLabel lbResultado= new JLabel("Resultado");
	
	private JButton btnCalcular= new JButton("Calcular");
	
	private Container c= getContentPane();
	
	/**
	 * Objeto op de la clase operaciones que es llamana para calcular perimetros
	 */
private Operaciones op = new Operaciones();
	
	/**
	 * Dimenciones de ventana
	 */
	public VentanaCuadrado(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		cargarControles();
	}
	/**
	 * Dimenciones de ventana en tamañanos de botones y cajas de texto
	 */
	private void cargarControles() {
		
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);

		btnCalcular.setBounds(10, 170, 280, 30);
		
		lbResultado.setBounds(10,200, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}
	/**
	 * Metodo del boton calcular
	 */
	public void actionPerformed(ActionEvent arg0) {
		int r = op.areaCuadrado(Integer.parseInt(txtN1.getText()));
		lbResultado.setText(String.format("El area %s Es = %d", txtN1.getText(), r)); 		
	}
}
