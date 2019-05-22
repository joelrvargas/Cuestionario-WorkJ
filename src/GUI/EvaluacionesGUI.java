package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.text.StyledEditorKit;

import Render.RenderJComboBox;

public class EvaluacionesGUI extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 3047970016539799163L;
	private JPanel PEditorContenidos;
	private JPanel BarMenuOpciones;
	private JButton btnNegrita;
	private JButton btnCursiva;
	private JButton btnSubrayado;
	@SuppressWarnings("rawtypes")
	private JComboBox cboTamano;
	private JButton btnFormatoCentro;
	private JButton btnFormatoIquierda;
	private JButton btnFormatoDerecha;
	private JButton button_6;
	@SuppressWarnings("rawtypes")
	private JComboBox cboFuentes;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton btnGuardar;
	private JScrollPane scrollPane;
	private JTextPane txtEntradaDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EvaluacionesGUI frame = new EvaluacionesGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public EvaluacionesGUI() {
		setBounds(100, 100, 819, 453);
		getContentPane().setLayout(null);

		PEditorContenidos = new JPanel();
		PEditorContenidos.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		PEditorContenidos.setBackground(Color.WHITE);
		PEditorContenidos.setBounds(10, 46, 783, 321);
		getContentPane().add(PEditorContenidos);
		PEditorContenidos.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(0, 0, 783, 321);
		PEditorContenidos.add(scrollPane);

		txtEntradaDatos = new JTextPane();
		txtEntradaDatos.setFont(new Font("Barlow Semi Condensed Medium", Font.PLAIN, 12));
		scrollPane.setViewportView(txtEntradaDatos);

		BarMenuOpciones = new JPanel();
		BarMenuOpciones.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		BarMenuOpciones.setBackground(Color.LIGHT_GRAY);
		BarMenuOpciones.setBounds(10, 11, 783, 35);
		getContentPane().add(BarMenuOpciones);
		BarMenuOpciones.setLayout(null);

		btnNegrita = new JButton("");
		btnNegrita.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNegrita.addActionListener(this);
		btnNegrita.setIcon(new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/Negrita.png")));
		btnNegrita.setBackground(Color.WHITE);
		btnNegrita.setBounds(10, 4, 30, 27);
		btnNegrita.setFocusable(false);
		BarMenuOpciones.add(btnNegrita);

		btnCursiva = new JButton("");
		btnCursiva.addActionListener(this);
		btnCursiva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCursiva.setIcon(new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/cursiva.png")));
		btnCursiva.setBackground(Color.WHITE);
		btnCursiva.setBounds(50, 4, 30, 27);
		btnCursiva.setFocusable(false);
		BarMenuOpciones.add(btnCursiva);

		btnSubrayado = new JButton("");
		btnSubrayado.addActionListener(this);
		btnSubrayado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSubrayado.setIcon(new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/texto-subrayado.png")));
		btnSubrayado.setBackground(Color.WHITE);
		btnSubrayado.setBounds(90, 4, 30, 27);
		btnSubrayado.setFocusable(false);
		BarMenuOpciones.add(btnSubrayado);

		btnFormatoCentro = new JButton("");
		btnFormatoCentro.addActionListener(this);
		btnFormatoCentro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFormatoCentro.setIcon(
				new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/alineacion-del-texto-centrada.png")));
		btnFormatoCentro.setBackground(Color.WHITE);
		btnFormatoCentro.setBounds(170, 4, 30, 27);
		btnFormatoCentro.setFocusable(false);
		BarMenuOpciones.add(btnFormatoCentro);

		btnFormatoIquierda = new JButton("");
		btnFormatoIquierda.addActionListener(this);
		btnFormatoIquierda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFormatoIquierda
				.setIcon(new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/alinear-a-la-izquierda.png")));
		btnFormatoIquierda.setBackground(Color.WHITE);
		btnFormatoIquierda.setBounds(130, 4, 30, 27);
		btnFormatoIquierda.setFocusable(false);
		BarMenuOpciones.add(btnFormatoIquierda);

		btnFormatoDerecha = new JButton("");
		btnFormatoDerecha.addActionListener(this);
		btnFormatoDerecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFormatoDerecha
				.setIcon(new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/alinear-a-la-derecha.png")));
		btnFormatoDerecha.setBackground(Color.WHITE);
		btnFormatoDerecha.setBounds(210, 4, 30, 27);
		btnFormatoDerecha.setFocusable(false);
		BarMenuOpciones.add(btnFormatoDerecha);

		button_6 = new JButton("");
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setIcon(new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/format-size.png")));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(307, 4, 30, 27);
		BarMenuOpciones.add(button_6);

		cboFuentes = new JComboBox();
		cboFuentes.addActionListener(this);
		cboFuentes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboFuentes.setFont(new Font("Courier New", Font.PLAIN, 11));
		cboFuentes.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		cboFuentes.setBorder(new LineBorder(Color.WHITE));
		cboFuentes.setBackground(Color.WHITE);
		cboFuentes.setAlignmentX(1.0f);
		cboFuentes.setBounds(347, 4, 195, 27);
		cboFuentes.setFocusable(false);
		BarMenuOpciones.add(cboFuentes);

		button_7 = new JButton("");
		button_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_7.setIcon(
				new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/imagenes-simbolo-de-interfaz.png")));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(552, 4, 30, 27);
		BarMenuOpciones.add(button_7);

		button_8 = new JButton("");
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.setIcon(
				new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/atras-simbolo-de-flecha-izquierda.png")));
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(592, 4, 30, 27);
		BarMenuOpciones.add(button_8);

		button_9 = new JButton("");
		button_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_9.setIcon(
				new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/atras-simbolo-de-flecha-derecha.png")));
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(632, 4, 30, 27);
		BarMenuOpciones.add(button_9);

		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setIcon(
				new ImageIcon(EvaluacionesGUI.class.getResource("/Multimedia/silueta-del-icono-de-salvar.png")));
		btnGuardar.setFont(new Font("Courier New", Font.PLAIN, 11));
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setBounds(672, 4, 101, 27);
		BarMenuOpciones.add(btnGuardar);

		cboTamano = new JComboBox();
		cboTamano.addActionListener(this);
		cboTamano.setBounds(247, 4, 50, 27);
		cboTamano.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboTamano.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		cboTamano.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		cboTamano.setAlignmentX(Component.RIGHT_ALIGNMENT);
		cboTamano.setBorder(new LineBorder(Color.WHITE));
		cboTamano.setBackground(Color.WHITE);
		cboTamano.setFocusable(false);
		BarMenuOpciones.add(cboTamano);

		PoblarCombo();
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboTamano) {
			actionPerformedCboTamano(arg0);
		}
		if (arg0.getSource() == btnFormatoDerecha) {
			actionPerformedBtnFormatoDerecha(arg0);
		}
		if (arg0.getSource() == btnFormatoCentro) {
			actionPerformedBtnFormatoCentro(arg0);
		}
		if (arg0.getSource() == btnFormatoIquierda) {
			actionPerformedBtnFormatoIzquierda(arg0);
		}
		if (arg0.getSource() == btnSubrayado) {
			actionPerformedBtnSubrayado(arg0);
		}
		if (arg0.getSource() == btnCursiva) {
			actionPerformedBtnCursiva(arg0);
		}
		if (arg0.getSource() == cboFuentes) {
			actionPerformedCboFuentes(arg0);
		}
		if (arg0.getSource() == btnNegrita) {
			actionPerformedBtnNegrita(arg0);
		}
	}

	/* Accion para cambiar el estilo de letra a negrita */
	protected void actionPerformedBtnNegrita(ActionEvent e) {
		Action BoldAction = new StyledEditorKit.BoldAction();
		BoldAction.actionPerformed(e);
	}

	/* Accion para cambiar el estilo de letra a cursiva */
	protected void actionPerformedBtnCursiva(ActionEvent e) {
		Action italicAction = new StyledEditorKit.ItalicAction();
		italicAction.actionPerformed(e);
	}

	/* Accion para cambiar el estilo de letra a subrayado */
	protected void actionPerformedBtnSubrayado(ActionEvent e) {
		Action subrayarAction = new StyledEditorKit.UnderlineAction();
		subrayarAction.actionPerformed(e);
	}

	/* Accion para cambiar la fuente del texto seleccionado */
	protected void actionPerformedCboFuentes(ActionEvent e) {
		@SuppressWarnings("rawtypes")
		JComboBox cbo = (JComboBox) e.getSource();
		String selected = (String) cbo.getSelectedItem();

		Action fontAction = new StyledEditorKit.FontFamilyAction(selected, selected);
		fontAction.actionPerformed(e);
	}

	/* Accion para cambiar el tamaño del texto seleccionado */
	protected void actionPerformedCboTamano(ActionEvent e) {
		@SuppressWarnings("rawtypes")
		JComboBox cbo = (JComboBox) e.getSource();
		int selected = (Integer) cbo.getSelectedItem();
		
		Action fontSize =  new StyledEditorKit.FontSizeAction("tamano",selected);
		fontSize.actionPerformed(e);
	}

	/* Accion para alinear el texto seleccionado a la izquierda */
	protected void actionPerformedBtnFormatoIzquierda(ActionEvent e) {
		Action alignment = new StyledEditorKit.AlignmentAction("derecha", 0);
		alignment.actionPerformed(e);
	}

	/* Accion para alinear el texto seleccionado al centro */
	protected void actionPerformedBtnFormatoCentro(ActionEvent e) {
		Action alignment = new StyledEditorKit.AlignmentAction("centro", 1);
		alignment.actionPerformed(e);
	}

	/* Accion para alinear el texto seleccionado a la derecha */
	protected void actionPerformedBtnFormatoDerecha(ActionEvent e) {
		Action alignment = new StyledEditorKit.AlignmentAction("derecha", 2);
		alignment.actionPerformed(e);
	}

	/* Poblar ComboBox Con todas las fuentes disponibles */
	@SuppressWarnings("unchecked")
	public void PoblarCombo() {
		/* Poblamos las fuentes */
		String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		ArrayList<String> ArregloFuentes = new ArrayList<String>();
		for (int i = 0; i < fontNames.length; i++) {
			ArregloFuentes.add(fontNames[i]);
		}

		for (String fuente : ArregloFuentes) {
			cboFuentes.addItem(fuente);
		}
		Integer[] number = { 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 36, 48, 72 };
		for (int i = 0; i < number.length; i++) {
			cboTamano.addItem(number[i]);
		}
	}

}
