package igu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * 
 * Clase Ventana.java
 * 
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
	private JComboBox<String> comboBox;
	private JPanel panelCheck;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JButton btnSiguiente;
	private JButton btnCancelar;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
	private ButtonGroup grupo = new ButtonGroup();
	private ProcesaCheck pC = new ProcesaCheck();
	private ProcesaFoco pF = new ProcesaFoco();

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
		setLocationRelativeTo(null);
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
			panelDatos
					.setBorder(new TitledBorder(
							new TitledBorder(
									new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
											new Color(160, 160, 160)),
									"Datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)),
							"Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
			panelDatos.add(getComboBox());
			panelDatos.add(getPasswordField1());
			panelDatos.add(getPasswordField2());
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
			textFieldNombre.addFocusListener(pF);
		}
		return textFieldNombre;
	}

	private JTextField getTextFieldApellidos() {
		if (textFieldApellidos == null) {
			textFieldApellidos = new JTextField();
			textFieldApellidos.setColumns(10);
			textFieldApellidos.setBounds(67, 43, 487, 20);
			textFieldApellidos.addFocusListener(pF);
		}
		return textFieldApellidos;
	}

	private JComboBox<String> getComboBox() {
		if (comboBox == null) {
			String[] años = new String[90];
			for (int i = 0; i < 90; i++) {
				años[i] = "" + ((90 - i) + 1920);
			}
			comboBox = new JComboBox<String>();
			comboBox.setModel(new DefaultComboBoxModel<String>(años));
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
			grupo.add(rdbtnHombre);
			rdbtnHombre.setSelected(true);
			rdbtnHombre.setBounds(40, 17, 59, 23);
			rdbtnHombre.addActionListener(pC);
		}
		return rdbtnHombre;
	}

	private JRadioButton getRdbtnMujer() {
		if (rdbtnMujer == null) {
			rdbtnMujer = new JRadioButton("Hembra");
			grupo.add(rdbtnMujer);
			rdbtnMujer.setBounds(139, 17, 71, 23);
			rdbtnMujer.addActionListener(pC);
		}
		return rdbtnMujer;
	}

	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
			btnSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Comprobar();
				}
			});
			btnSiguiente.setBackground(new Color(34, 139, 34));
			btnSiguiente.setForeground(Color.WHITE);
			btnSiguiente.setBounds(352, 214, 107, 36);
		}
		return btnSiguiente;
	}

	protected void Comprobar() {
		var contraseña = String.valueOf(getPasswordField1().getPassword());
		var contraseñaRepetida = String.valueOf(getPasswordField2().getPassword());
		var nombre = getTextFieldNombre();
		var apellidos = getTextFieldApellidos();
		if (nombre.getText().isBlank() || nombre.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "El campo [nombre] debe rellenarse");
		} else if (apellidos.getText().isBlank() || apellidos.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "El campo [apellidos] debe rellenarse");
		} else if (!contraseña.equals(contraseñaRepetida)) {
			JOptionPane.showMessageDialog(this, "La contraseña no corresponde con la contraseña repetida");
		} else {
			JOptionPane.showMessageDialog(this, "¡Formulario Completado!");
			System.exit(0);
		}

	}

	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0); // si pulsamos el siguiente boton "Cancelar", la ventana se cierra
				}
			});
			btnCancelar.setForeground(Color.WHITE);
			btnCancelar.setBackground(Color.RED);
			btnCancelar.setBounds(469, 214, 107, 36);
		}
		return btnCancelar;
	}

	private JPasswordField getPasswordField1() {
		if (passwordField1 == null) {
			passwordField1 = new JPasswordField();
			passwordField1.setBounds(67, 104, 487, 20);
		}
		return passwordField1;
	}

	private JPasswordField getPasswordField2() {
		if (passwordField2 == null) {
			passwordField2 = new JPasswordField();
			passwordField2.setBounds(152, 136, 402, 23);
		}
		return passwordField2;
	}

	class ProcesaCheck implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (getRdbtnHombre().isSelected()) {
				getTextFieldNombre().addFocusListener(pF);
				getTextFieldApellidos().addFocusListener(pF);

			} else {
				getTextFieldNombre().removeFocusListener(pF);
				getTextFieldApellidos().removeFocusListener(pF);
			}

		}

	}

	class ProcesaFoco extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			((JTextField) e.getSource()).setText("");
			((JTextField) e.getSource()).setBackground(Color.white);
			((JTextField) e.getSource()).setForeground(Color.black);
		}

		@Override
		public void focusLost(FocusEvent e) {
			((JTextField) e.getSource()).setBackground(Color.PINK);
			((JTextField) e.getSource()).setForeground(Color.black);
		}
	}
}
