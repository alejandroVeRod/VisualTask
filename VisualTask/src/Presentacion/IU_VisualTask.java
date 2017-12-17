package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTree;
import java.awt.Toolkit;

public class IU_VisualTask {

	private JFrame VisualTask;
	private JPanel pnl_login;
	private JPanel pnl_logo;
	private JLabel label;
	private JPanel pnl_infoLogin;
	private JLabel lbl_email;
	private JTextField txt_emailLogin;
	private JLabel lbl_psswd;
	private JPanel pnl_btnIniciarSesion;
	private JButton button;
	private JTextField txt_passwdLogin;
	private IU_VistaGeneral pnl_VistaGeneral;
	private JPanel pnl_contenedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU_VisualTask window = new IU_VisualTask();
					window.VisualTask.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IU_VisualTask() {
		initialize();
	}
	public JPanel getpnl_contenedor() {
		return pnl_contenedor;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		VisualTask = new JFrame();
		VisualTask.setIconImage(Toolkit.getDefaultToolkit().getImage(IU_VisualTask.class.getResource("/Presentacion/recursos/line-chart_318-138765.jpg")));
		VisualTask.setBounds(100, 100, 450, 378);
		VisualTask.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VisualTask.getContentPane().setLayout(new CardLayout(0, 0));
		
		pnl_contenedor = new JPanel();
		VisualTask.getContentPane().add(pnl_contenedor, "pnl_contenedor");
		pnl_contenedor.setLayout(new CardLayout(0, 0));
			
			pnl_login = new JPanel();
			pnl_contenedor.add(pnl_login, "name_9974825849022");
			GridBagLayout gbl_pnl_login = new GridBagLayout();
			gbl_pnl_login.columnWidths = new int[]{0, 0, 0};
			gbl_pnl_login.rowHeights = new int[]{0, 0, 0, 0};
			gbl_pnl_login.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_pnl_login.rowWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
			pnl_login.setLayout(gbl_pnl_login);
			
			pnl_logo = new JPanel();
			GridBagConstraints gbc_pnl_logo = new GridBagConstraints();
			gbc_pnl_logo.gridwidth = 2;
			gbc_pnl_logo.insets = new Insets(0, 0, 5, 5);
			gbc_pnl_logo.fill = GridBagConstraints.BOTH;
			gbc_pnl_logo.gridx = 0;
			gbc_pnl_logo.gridy = 0;
			pnl_login.add(pnl_logo, gbc_pnl_logo);
			GridBagLayout gbl_pnl_logo = new GridBagLayout();
			gbl_pnl_logo.columnWidths = new int[]{0, 0};
			gbl_pnl_logo.rowHeights = new int[]{0, 0};
			gbl_pnl_logo.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_pnl_logo.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			pnl_logo.setLayout(gbl_pnl_logo);
			
			label = new JLabel("VisualTask™");
			label.setFont(new Font("Dialog", Font.PLAIN, 60));
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.gridx = 0;
			gbc_label.gridy = 0;
			pnl_logo.add(label, gbc_label);
			
			pnl_infoLogin = new JPanel();
			GridBagConstraints gbc_pnl_infoLogin = new GridBagConstraints();
			gbc_pnl_infoLogin.insets = new Insets(0, 0, 5, 5);
			gbc_pnl_infoLogin.fill = GridBagConstraints.BOTH;
			gbc_pnl_infoLogin.gridx = 0;
			gbc_pnl_infoLogin.gridy = 1;
			pnl_login.add(pnl_infoLogin, gbc_pnl_infoLogin);
			GridBagLayout gbl_pnl_infoLogin = new GridBagLayout();
			gbl_pnl_infoLogin.columnWidths = new int[]{0, 0, 0};
			gbl_pnl_infoLogin.rowHeights = new int[]{0, 0, 0};
			gbl_pnl_infoLogin.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_pnl_infoLogin.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			pnl_infoLogin.setLayout(gbl_pnl_infoLogin);
			
			lbl_email = new JLabel("email:");
			GridBagConstraints gbc_lbl_email = new GridBagConstraints();
			gbc_lbl_email.anchor = GridBagConstraints.EAST;
			gbc_lbl_email.insets = new Insets(0, 0, 5, 5);
			gbc_lbl_email.gridx = 0;
			gbc_lbl_email.gridy = 0;
			pnl_infoLogin.add(lbl_email, gbc_lbl_email);
			
			txt_emailLogin = new JTextField();
			txt_emailLogin.setColumns(10);
			GridBagConstraints gbc_txt_emailLogin = new GridBagConstraints();
			gbc_txt_emailLogin.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt_emailLogin.insets = new Insets(0, 0, 5, 0);
			gbc_txt_emailLogin.gridx = 1;
			gbc_txt_emailLogin.gridy = 0;
			pnl_infoLogin.add(txt_emailLogin, gbc_txt_emailLogin);
			
			lbl_psswd = new JLabel("contraseña:");
			lbl_psswd.setFont(new Font("Tahoma", Font.PLAIN, 9));
			GridBagConstraints gbc_lbl_psswd = new GridBagConstraints();
			gbc_lbl_psswd.anchor = GridBagConstraints.EAST;
			gbc_lbl_psswd.insets = new Insets(0, 0, 0, 5);
			gbc_lbl_psswd.gridx = 0;
			gbc_lbl_psswd.gridy = 1;
			pnl_infoLogin.add(lbl_psswd, gbc_lbl_psswd);
			
			txt_passwdLogin = new JTextField();
			GridBagConstraints gbc_txt_passwdLogin = new GridBagConstraints();
			gbc_txt_passwdLogin.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt_passwdLogin.gridx = 1;
			gbc_txt_passwdLogin.gridy = 1;
			pnl_infoLogin.add(txt_passwdLogin, gbc_txt_passwdLogin);
			txt_passwdLogin.setColumns(10);
			
			pnl_btnIniciarSesion = new JPanel();
			GridBagConstraints gbc_pnl_btnIniciarSesion = new GridBagConstraints();
			gbc_pnl_btnIniciarSesion.anchor = GridBagConstraints.WEST;
			gbc_pnl_btnIniciarSesion.insets = new Insets(0, 0, 5, 0);
			gbc_pnl_btnIniciarSesion.fill = GridBagConstraints.VERTICAL;
			gbc_pnl_btnIniciarSesion.gridx = 1;
			gbc_pnl_btnIniciarSesion.gridy = 1;
			pnl_login.add(pnl_btnIniciarSesion, gbc_pnl_btnIniciarSesion);
			GridBagLayout gbl_pnl_btnIniciarSesion = new GridBagLayout();
			gbl_pnl_btnIniciarSesion.columnWidths = new int[]{0, 0};
			gbl_pnl_btnIniciarSesion.rowHeights = new int[]{0, 0};
			gbl_pnl_btnIniciarSesion.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_pnl_btnIniciarSesion.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			pnl_btnIniciarSesion.setLayout(gbl_pnl_btnIniciarSesion);
			
			button = new JButton("Iniciar Sesion");
			button.addActionListener(new ButtonActionListener());
			
				button.setVerticalAlignment(SwingConstants.TOP);
				button.setHorizontalAlignment(SwingConstants.LEFT);
				GridBagConstraints gbc_button = new GridBagConstraints();
				gbc_button.gridx = 0;
				gbc_button.gridy = 0;
				pnl_btnIniciarSesion.add(button, gbc_button);
				pnl_login.setVisible(false);
			pnl_VistaGeneral=new IU_VistaGeneral();
			pnl_contenedor.add(pnl_VistaGeneral, "Vista General");
			
			
	}

	
	
	private class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (txt_emailLogin.getText().equals("admin@gmail.com") && txt_passwdLogin.getText().equals("1234")){
				JOptionPane.showMessageDialog(null,"¡Bienvenido! "+txt_emailLogin.getText());
				VisualTask.setBounds(0, 0, 1280, 720);
				((CardLayout)pnl_contenedor.getLayout()).show(pnl_contenedor,"Vista General");
			}else {
				JOptionPane.showMessageDialog(null,"Error en el email o contraseña");
			}
		}
	}
}
