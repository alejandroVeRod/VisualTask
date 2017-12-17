package Presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Date;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IU_pnlInfoUsuario extends JPanel {
	private JPanel pnl_contenido;
	private JLabel lblFoto;
	private JLabel lblNombre;
	private JTextField txt_nombre;
	private JLabel lblNewLabel;
	private JTextField txt_apellidos;
	private JLabel lblEmail;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblEmailejemploes;
	private JLabel label;
	private JPanel pnl_cerrarSesion;
	private JLabel lblUltimoAcceso;
	private JLabel txt_UltimoAcesso;
	private JButton btnCerrarSesion;
	private JButton btn_Ocultar;

	/**
	 * Create the panel.
	 */
	public IU_pnlInfoUsuario() {
		setBorder(new TitledBorder(null, "Autenticado como:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{380, 0};
		gridBagLayout.rowHeights = new int[]{125, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		pnl_contenido = new JPanel();
		GridBagConstraints gbc_pnl_contenido = new GridBagConstraints();
		gbc_pnl_contenido.insets = new Insets(0, 0, 5, 0);
		gbc_pnl_contenido.fill = GridBagConstraints.BOTH;
		gbc_pnl_contenido.gridx = 0;
		gbc_pnl_contenido.gridy = 0;
		add(pnl_contenido, gbc_pnl_contenido);
		GridBagLayout gbl_pnl_contenido = new GridBagLayout();
		gbl_pnl_contenido.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnl_contenido.rowHeights = new int[]{0, 0, 0, 0};
		gbl_pnl_contenido.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnl_contenido.rowWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		pnl_contenido.setLayout(gbl_pnl_contenido);
		
		lblFoto = new JLabel("Foto:");
		lblFoto.setFont(new Font("Calibri", Font.BOLD, 11));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.fill = GridBagConstraints.VERTICAL;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 1;
		pnl_contenido.add(lblFoto, gbc_lblFoto);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Calibri", Font.BOLD, 11));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		pnl_contenido.add(lblNombre, gbc_lblNombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setText("Esto es");
		txt_nombre.setEditable(false);
		GridBagConstraints gbc_txt_nombre = new GridBagConstraints();
		gbc_txt_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_txt_nombre.fill = GridBagConstraints.BOTH;
		gbc_txt_nombre.gridx = 2;
		gbc_txt_nombre.gridy = 1;
		pnl_contenido.add(txt_nombre, gbc_txt_nombre);
		txt_nombre.setColumns(10);
		
		lblNewLabel = new JLabel("Apellidos:");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		pnl_contenido.add(lblNewLabel, gbc_lblNewLabel);
		
		txt_apellidos = new JTextField();
		txt_apellidos.setEditable(false);
		txt_apellidos.setText("Un Ejemplo");
		GridBagConstraints gbc_txt_apellidos = new GridBagConstraints();
		gbc_txt_apellidos.insets = new Insets(0, 0, 5, 0);
		gbc_txt_apellidos.fill = GridBagConstraints.BOTH;
		gbc_txt_apellidos.gridx = 4;
		gbc_txt_apellidos.gridy = 1;
		pnl_contenido.add(txt_apellidos, gbc_txt_apellidos);
		txt_apellidos.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(IU_pnlInfoUsuario.class.getResource("/Presentacion/recursos/Baby_Koala-icon.png")));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		pnl_contenido.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblEmail = new JLabel("email:");
		lblEmail.setFont(new Font("Calibri", Font.BOLD, 11));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.fill = GridBagConstraints.VERTICAL;
		gbc_lblEmail.insets = new Insets(0, 0, 0, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 2;
		pnl_contenido.add(lblEmail, gbc_lblEmail);
		
		lblEmailejemploes = new JLabel("email@ejemplo.es");
		GridBagConstraints gbc_lblEmailejemploes = new GridBagConstraints();
		gbc_lblEmailejemploes.insets = new Insets(0, 0, 0, 5);
		gbc_lblEmailejemploes.gridx = 2;
		gbc_lblEmailejemploes.gridy = 2;
		pnl_contenido.add(lblEmailejemploes, gbc_lblEmailejemploes);
		
		lblNewLabel_1 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 2;
		pnl_contenido.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		label = new JLabel("653 222 111");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridx = 4;
		gbc_label.gridy = 2;
		pnl_contenido.add(label, gbc_label);
		
		pnl_cerrarSesion = new JPanel();
		GridBagConstraints gbc_pnl_cerrarSesion = new GridBagConstraints();
		gbc_pnl_cerrarSesion.fill = GridBagConstraints.BOTH;
		gbc_pnl_cerrarSesion.gridx = 0;
		gbc_pnl_cerrarSesion.gridy = 1;
		add(pnl_cerrarSesion, gbc_pnl_cerrarSesion);
		GridBagLayout gbl_pnl_cerrarSesion = new GridBagLayout();
		gbl_pnl_cerrarSesion.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnl_cerrarSesion.rowHeights = new int[]{0, 0};
		gbl_pnl_cerrarSesion.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_cerrarSesion.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnl_cerrarSesion.setLayout(gbl_pnl_cerrarSesion);
		
		lblUltimoAcceso = new JLabel("Ultimo acceso:");
		lblUltimoAcceso.setFont(new Font("Calibri", Font.BOLD, 11));
		GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
		gbc_lblUltimoAcceso.insets = new Insets(0, 0, 0, 5);
		gbc_lblUltimoAcceso.gridx = 0;
		gbc_lblUltimoAcceso.gridy = 0;
		pnl_cerrarSesion.add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		//Date fecha=new Date();
		txt_UltimoAcesso = new JLabel("28/11/2017");
		//txt_UltimoAcesso.setText(fecha.getDay()+" "+fecha.getMonth());
		GridBagConstraints gbc_txt_UltimoAcesso = new GridBagConstraints();
		gbc_txt_UltimoAcesso.insets = new Insets(0, 0, 0, 5);
		gbc_txt_UltimoAcesso.gridx = 1;
		gbc_txt_UltimoAcesso.gridy = 0;
		pnl_cerrarSesion.add(txt_UltimoAcesso, gbc_txt_UltimoAcesso);
		
		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new BtnCerrarSesionActionListener());
		
		btn_Ocultar = new JButton("Ocultar Información");
		btn_Ocultar.addActionListener(new Btn_OcultarActionListener());
		GridBagConstraints gbc_btn_Ocultar = new GridBagConstraints();
		gbc_btn_Ocultar.insets = new Insets(0, 0, 0, 5);
		gbc_btn_Ocultar.gridx = 3;
		gbc_btn_Ocultar.gridy = 0;
		pnl_cerrarSesion.add(btn_Ocultar, gbc_btn_Ocultar);
		GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
		gbc_btnCerrarSesion.gridx = 5;
		gbc_btnCerrarSesion.gridy = 0;
		pnl_cerrarSesion.add(btnCerrarSesion, gbc_btnCerrarSesion);

	}

	private class BtnCerrarSesionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int res=JOptionPane.showConfirmDialog(null,"¿Estás seguro de cerrar la sesión?");
			if (JOptionPane.OK_OPTION == res){
				  
				 }
				  
				   
			/*Volver al menu login*/
			
		}
	}
	private class Btn_OcultarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		
		}
	}
}
