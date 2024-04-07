package igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
/**
 * 
 * Clase Ventana.java
 * @user: Germán Iglesias Ramos
 * 
 * @fecha: 7 abr 2024
 */
public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JPanel panelDatos;
	private JLabel labelNombre;
	private JLabel labelApellidos;
	private JLabel labelNacimiento;
	private JLabel labelPassword;
	private JLabel lblRepiteElPassword;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldPassword;
	private JTextField textFieldPasswordRepetido;
	private JComboBox comboBox;
	private JPanel panelCheck;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JButton btnSiguiente;
	private JButton btnCancelar;

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/img/cantar-15040.jpg")));
		setTitle("Formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.GRAY);
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		panelPrincipal.add(getPanelDatos());
		panelPrincipal.add(getPanelCheck());
		panelPrincipal.add(getBtnSiguiente());
		panelPrincipal.add(getBtnCancelar());
	}
	private JPanel getPanelDatos() {
		if (panelDatos == null) {
			panelDatos = new JPanel();
			panelDatos.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelDatos.setName("");
			panelDatos.setBackground(Color.LIGHT_GRAY);
			panelDatos.setBounds(10, 11, 564, 170);
			panelDatos.setLayout(null);
			panelDatos.add(getLabelNombre());
			panelDatos.add(getLabelApellidos());
			panelDatos.add(getLabelNacimiento());
			panelDatos.add(getLabelPassword());
			panelDatos.add(getLblRepiteElPassword());
			panelDatos.add(getTextFieldNombre());
			panelDatos.add(getTextFieldApellidos());
			panelDatos.add(getTextFieldPassword());
			panelDatos.add(getTextFieldPasswordRepetido());
			panelDatos.add(getComboBox());
		}
		return panelDatos;
	}
	private JLabel getLabelNombre() {
		if (labelNombre == null) {
			labelNombre = new JLabel("Nombre:");
			labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
			labelNombre.setBounds(10, 11, 66, 20);
		}
		return labelNombre;
	}
	private JLabel getLabelApellidos() {
		if (labelApellidos == null) {
			labelApellidos = new JLabel("Apellidos:");
			labelApellidos.setFont(new Font("Tahoma", Font.PLAIN, 12));
			labelApellidos.setBounds(10, 42, 66, 20);
		}
		return labelApellidos;
	}
	private JLabel getLabelNacimiento() {
		if (labelNacimiento == null) {
			labelNacimiento = new JLabel("Año de nacimiento:");
			labelNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
			labelNacimiento.setBounds(10, 73, 116, 20);
		}
		return labelNacimiento;
	}
	private JLabel getLabelPassword() {
		if (labelPassword == null) {
			labelPassword = new JLabel("Password:");
			labelPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
			labelPassword.setBounds(10, 104, 66, 20);
		}
		return labelPassword;
	}
	private JLabel getLblRepiteElPassword() {
		if (lblRepiteElPassword == null) {
			lblRepiteElPassword = new JLabel("Repite el password:");
			lblRepiteElPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblRepiteElPassword.setBounds(10, 135, 132, 20);
		}
		return lblRepiteElPassword;
	}
	private JTextField getTextFieldNombre() {
		if (textFieldNombre == null) {
			textFieldNombre = new JTextField();
			textFieldNombre.setBounds(67, 12, 487, 20);
			textFieldNombre.setColumns(10);
		}
		return textFieldNombre;
	}
	private JTextField getTextFieldApellidos() {
		if (textFieldApellidos == null) {
			textFieldApellidos = new JTextField();
			textFieldApellidos.setColumns(10);
			textFieldApellidos.setBounds(67, 43, 487, 20);
		}
		return textFieldApellidos;
	}
	private JTextField getTextFieldPassword() {
		if (textFieldPassword == null) {
			textFieldPassword = new JTextField();
			textFieldPassword.setColumns(10);
			textFieldPassword.setBounds(76, 104, 478, 20);
		}
		return textFieldPassword;
	}
	private JTextField getTextFieldPasswordRepetido() {
		if (textFieldPasswordRepetido == null) {
			textFieldPasswordRepetido = new JTextField();
			textFieldPasswordRepetido.setColumns(10);
			textFieldPasswordRepetido.setBounds(130, 135, 424, 20);
		}
		return textFieldPasswordRepetido;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(130, 73, 159, 20);
		}
		return comboBox;
	}
	private JPanel getPanelCheck() {
		if (panelCheck == null) {
			panelCheck = new JPanel();
			panelCheck.setBorder(new TitledBorder(null, "Check", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelCheck.setBackground(Color.LIGHT_GRAY);
			panelCheck.setBounds(10, 192, 251, 58);
			panelCheck.setLayout(null);
			panelCheck.add(getRdbtnHombre());
			panelCheck.add(getRdbtnMujer());
		}
		return panelCheck;
	}
	private JRadioButton getRdbtnHombre() {
		if (rdbtnHombre == null) {
			rdbtnHombre = new JRadioButton("Varón");
			rdbtnHombre.setSelected(true);
			rdbtnHombre.setBounds(40, 17, 59, 23);
		}
		return rdbtnHombre;
	}
	private JRadioButton getRdbtnMujer() {
		if (rdbtnMujer == null) {
			rdbtnMujer = new JRadioButton("Hembra");
			rdbtnMujer.setBounds(139, 17, 71, 23);
		}
		return rdbtnMujer;
	}
	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
			btnSiguiente.setEnabled(false);
			btnSiguiente.setBackground(new Color(34, 139, 34));
			btnSiguiente.setForeground(Color.WHITE);
			btnSiguiente.setBounds(352, 214, 107, 36);
		}
		return btnSiguiente;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setForeground(Color.WHITE);
			btnCancelar.setBackground(Color.RED);
			btnCancelar.setBounds(469, 214, 107, 36);
		}
		return btnCancelar;
	}
}
