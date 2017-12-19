package Presentacion;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTree;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.border.TitledBorder;

import Dominio.Usuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class IU_VistaGeneral extends JPanel {
	private JPanel pnl_infoUsuario;
	private JButton btn_infoUsuario;
	private JPanel pnl_contenido;
	private JPanel pnl_vistaPrincipal;
	private JButton btnVistaUsuarios;
	private JButton btnVistaProyectos;
	private JButton btnNewButton;
	private JButton btn_VistaGestionUsuarios;
	private JButton btn_VistaGestionProyectosTareas;
	private JPanel pnl_botonInfoUsuario;
	private JPanel pnl_vistaUsuario;
	private JPanel pnl_usuario;
	private JLabel lblNombre;
	private JTextField txt_nombre;
	private JLabel lblApellidos;
	private JTextField txt_apellidos;
	private JLabel lblEmail;
	private JTextField txt_email;
	private JLabel lblTelfono;
	private JTextField txt_telefono;
	private JLabel lblDni;
	private JTextField txt_dni;
	private JLabel lblEdad;
	private JTextField txt_edad;
	private JLabel lblNewLabel;
	private JLabel lblFoto;
	private JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */

	
	public IU_VistaGeneral() {
		setSize(new Dimension(800, 600));
		setMinimumSize(new Dimension(800, 600));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 89, 0};
		gridBagLayout.rowHeights = new int[]{95, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		pnl_infoUsuario = new JPanel();
		pnl_infoUsuario.setLayout(new CardLayout(0, 0));
		IU_pnlInfoUsuario iu=new IU_pnlInfoUsuario();
		pnl_infoUsuario.add(iu,"panel Info");
		GridBagConstraints gbc_pnl_infoUsuario = new GridBagConstraints();
		gbc_pnl_infoUsuario.anchor = GridBagConstraints.NORTHWEST;
		gbc_pnl_infoUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_pnl_infoUsuario.gridx = 0;
		gbc_pnl_infoUsuario.gridy = 0;
		add(pnl_infoUsuario, gbc_pnl_infoUsuario);
		
		pnl_botonInfoUsuario = new JPanel();
		pnl_botonInfoUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnl_infoUsuario.add(pnl_botonInfoUsuario, "pnl_infoUsuario");
		GridBagLayout gbl_pnl_botonInfoUsuario = new GridBagLayout();
		gbl_pnl_botonInfoUsuario.columnWidths = new int[]{152, 0};
		gbl_pnl_botonInfoUsuario.rowHeights = new int[]{29, 0};
		gbl_pnl_botonInfoUsuario.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnl_botonInfoUsuario.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnl_botonInfoUsuario.setLayout(gbl_pnl_botonInfoUsuario);
		
		btn_infoUsuario = new JButton("Abrir Información de usuario");
		btn_infoUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btn_infoUsuario = new GridBagConstraints();
		gbc_btn_infoUsuario.anchor = GridBagConstraints.NORTHWEST;
		gbc_btn_infoUsuario.gridx = 0;
		gbc_btn_infoUsuario.gridy = 0;
		pnl_botonInfoUsuario.add(btn_infoUsuario, gbc_btn_infoUsuario);
		btn_infoUsuario.setToolTipText("Aquí puede comprobar sus datos de usuario");
		btn_infoUsuario.addActionListener(new Btn_infoUsuarioActionListener());
		
		pnl_contenido = new JPanel();
		GridBagConstraints gbc_pnl_contenido = new GridBagConstraints();
		gbc_pnl_contenido.gridheight = 2;
		gbc_pnl_contenido.fill = GridBagConstraints.BOTH;
		gbc_pnl_contenido.gridx = 1;
		gbc_pnl_contenido.gridy = 0;
		add(pnl_contenido, gbc_pnl_contenido);
		pnl_contenido.setLayout(new CardLayout(0, 0));
		
		pnl_vistaPrincipal = new JPanel();
		pnl_contenido.add(pnl_vistaPrincipal, "name_22155849009830");
		GridBagLayout gbl_pnl_vistaPrincipal = new GridBagLayout();
		gbl_pnl_vistaPrincipal.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnl_vistaPrincipal.rowHeights = new int[]{0, 0, 0};
		gbl_pnl_vistaPrincipal.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_vistaPrincipal.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		pnl_vistaPrincipal.setLayout(gbl_pnl_vistaPrincipal);
		
		btn_VistaGestionUsuarios = new JButton("");
		btn_VistaGestionUsuarios.setIcon(new ImageIcon(IU_VistaGeneral.class.getResource("/Presentacion/recursos/gestion usuarios icon.jpg")));
		GridBagConstraints gbc_btn_VistaGestionUsuarios = new GridBagConstraints();
		gbc_btn_VistaGestionUsuarios.insets = new Insets(0, 0, 5, 5);
		gbc_btn_VistaGestionUsuarios.gridx = 1;
		gbc_btn_VistaGestionUsuarios.gridy = 0;
		pnl_vistaPrincipal.add(btn_VistaGestionUsuarios, gbc_btn_VistaGestionUsuarios);
		
		btn_VistaGestionProyectosTareas = new JButton("");
		btn_VistaGestionProyectosTareas.setIcon(new ImageIcon(IU_VistaGeneral.class.getResource("/Presentacion/recursos/gestion proyectos tareas icono.jpg")));
		GridBagConstraints gbc_btn_VistaGestionProyectosTareas = new GridBagConstraints();
		gbc_btn_VistaGestionProyectosTareas.insets = new Insets(0, 0, 5, 5);
		gbc_btn_VistaGestionProyectosTareas.gridx = 3;
		gbc_btn_VistaGestionProyectosTareas.gridy = 0;
		pnl_vistaPrincipal.add(btn_VistaGestionProyectosTareas, gbc_btn_VistaGestionProyectosTareas);
		
		btnVistaUsuarios = new JButton((String) null);
		btnVistaUsuarios.addActionListener(new BtnVistaUsuariosActionListener());
		btnVistaUsuarios.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnVistaUsuarios.setToolTipText("Aqu\u00ED puede gestionar los usuarios");
		btnVistaUsuarios.setVerticalAlignment(SwingConstants.BOTTOM);
		btnVistaUsuarios.setIcon(new ImageIcon(IU_VistaGeneral.class.getResource("/Presentacion/recursos/businessman_318-72886.jpg")));
		GridBagConstraints gbc_btnVistaUsuarios = new GridBagConstraints();
		gbc_btnVistaUsuarios.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVistaUsuarios.insets = new Insets(0, 0, 0, 5);
		gbc_btnVistaUsuarios.gridx = 0;
		gbc_btnVistaUsuarios.gridy = 1;
		pnl_vistaPrincipal.add(btnVistaUsuarios, gbc_btnVistaUsuarios);
		
		btnVistaProyectos = new JButton("");
		btnVistaProyectos.setIcon(new ImageIcon(IU_VistaGeneral.class.getResource("/Presentacion/recursos/proyect icon.png")));
		GridBagConstraints gbc_btnVistaProyectos = new GridBagConstraints();
		gbc_btnVistaProyectos.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVistaProyectos.insets = new Insets(0, 0, 0, 5);
		gbc_btnVistaProyectos.gridx = 2;
		gbc_btnVistaProyectos.gridy = 1;
		pnl_vistaPrincipal.add(btnVistaProyectos, gbc_btnVistaProyectos);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(IU_VistaGeneral.class.getResource("/Presentacion/recursos/tasks icon.jpg")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 1;
		pnl_vistaPrincipal.add(btnNewButton, gbc_btnNewButton);
		
		pnl_vistaUsuario = new JPanel();
		pnl_contenido.add(pnl_vistaUsuario, "Vista Usuarios");
		GridBagLayout gbl_pnl_vistaUsuario = new GridBagLayout();
		gbl_pnl_vistaUsuario.columnWidths = new int[]{0, 0, 0};
		gbl_pnl_vistaUsuario.rowHeights = new int[]{0, 0, 0};
		gbl_pnl_vistaUsuario.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_pnl_vistaUsuario.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		pnl_vistaUsuario.setLayout(gbl_pnl_vistaUsuario);
		
		
		pnl_usuario = new JPanel();
		pnl_usuario.setBorder(new TitledBorder(null, "Informaci\u00F3n de Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnl_usuario = new GridBagConstraints();
		gbc_pnl_usuario.insets = new Insets(0, 0, 5, 0);
		gbc_pnl_usuario.fill = GridBagConstraints.BOTH;
		gbc_pnl_usuario.gridx = 1;
		gbc_pnl_usuario.gridy = 0;
		pnl_vistaUsuario.add(pnl_usuario, gbc_pnl_usuario);
		GridBagLayout gbl_pnl_usuario = new GridBagLayout();
		gbl_pnl_usuario.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_pnl_usuario.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnl_usuario.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnl_usuario.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnl_usuario.setLayout(gbl_pnl_usuario);
		
		lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		pnl_usuario.add(lblNombre, gbc_lblNombre);
		
		txt_nombre = new JTextField();
		GridBagConstraints gbc_txt_nombre = new GridBagConstraints();
		gbc_txt_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_txt_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_nombre.gridx = 1;
		gbc_txt_nombre.gridy = 0;
		pnl_usuario.add(txt_nombre, gbc_txt_nombre);
		txt_nombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.gridx = 2;
		gbc_lblApellidos.gridy = 0;
		pnl_usuario.add(lblApellidos, gbc_lblApellidos);
		
		txt_apellidos = new JTextField();
		GridBagConstraints gbc_txt_apellidos = new GridBagConstraints();
		gbc_txt_apellidos.insets = new Insets(0, 0, 5, 0);
		gbc_txt_apellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_apellidos.gridx = 3;
		gbc_txt_apellidos.gridy = 0;
		pnl_usuario.add(txt_apellidos, gbc_txt_apellidos);
		txt_apellidos.setColumns(10);
		
		lblEmail = new JLabel("email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 1;
		pnl_usuario.add(lblEmail, gbc_lblEmail);
		
		txt_email = new JTextField();
		GridBagConstraints gbc_txt_email = new GridBagConstraints();
		gbc_txt_email.insets = new Insets(0, 0, 5, 5);
		gbc_txt_email.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_email.gridx = 1;
		gbc_txt_email.gridy = 1;
		pnl_usuario.add(txt_email, gbc_txt_email);
		txt_email.setColumns(10);
		
		lblTelfono = new JLabel("Teléfono:");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.EAST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 2;
		gbc_lblTelfono.gridy = 1;
		pnl_usuario.add(lblTelfono, gbc_lblTelfono);
		
		txt_telefono = new JTextField();
		GridBagConstraints gbc_txt_telefono = new GridBagConstraints();
		gbc_txt_telefono.insets = new Insets(0, 0, 5, 0);
		gbc_txt_telefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_telefono.gridx = 3;
		gbc_txt_telefono.gridy = 1;
		pnl_usuario.add(txt_telefono, gbc_txt_telefono);
		txt_telefono.setColumns(10);
		
		lblDni = new JLabel("DNI:");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.EAST;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 0;
		gbc_lblDni.gridy = 2;
		pnl_usuario.add(lblDni, gbc_lblDni);
		
		txt_dni = new JTextField();
		GridBagConstraints gbc_txt_dni = new GridBagConstraints();
		gbc_txt_dni.insets = new Insets(0, 0, 5, 5);
		gbc_txt_dni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_dni.gridx = 1;
		gbc_txt_dni.gridy = 2;
		pnl_usuario.add(txt_dni, gbc_txt_dni);
		txt_dni.setColumns(10);
		
		lblEdad = new JLabel("Edad:");
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.anchor = GridBagConstraints.EAST;
		gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad.gridx = 2;
		gbc_lblEdad.gridy = 2;
		pnl_usuario.add(lblEdad, gbc_lblEdad);
		
		txt_edad = new JTextField();
		GridBagConstraints gbc_txt_edad = new GridBagConstraints();
		gbc_txt_edad.insets = new Insets(0, 0, 5, 0);
		gbc_txt_edad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_edad.gridx = 3;
		gbc_txt_edad.gridy = 2;
		pnl_usuario.add(txt_edad, gbc_txt_edad);
		txt_edad.setColumns(10);
		
		lblFoto = new JLabel("Foto:");
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.insets = new Insets(0, 0, 0, 5);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 3;
		pnl_usuario.add(lblFoto, gbc_lblFoto);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(IU_VistaGeneral.class.getResource("/Presentacion/recursos/usuario icon.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		pnl_usuario.add(lblNewLabel, gbc_lblNewLabel);
		
		btnNewButton_1 = new JButton("Cambiar Foto");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 3;
		pnl_usuario.add(btnNewButton_1, gbc_btnNewButton_1);

	}
	private class Btn_infoUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			IU_pnlInfoUsuario iu=new IU_pnlInfoUsuario();
			JFrame j=new JFrame();
			j.getContentPane().add(iu);
			
			//((CardLayout) pnl_infoUsuario.getLayout()).show(pnl_infoUsuario,"panel Info");
			
		}
	}
	private class BtnVistaUsuariosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout)pnl_contenido.getLayout()).show(pnl_contenido,"Vista Usuarios");
		}
	}
}
