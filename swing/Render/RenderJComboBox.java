package Render;

import java.awt.Component;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

@SuppressWarnings("rawtypes")
public class RenderJComboBox extends JLabel implements ListCellRenderer {
	private static final long serialVersionUID = 1L;
	Hashtable<Object, ImageIcon> icono = null;

	public RenderJComboBox() {
		icono = new Hashtable<Object, ImageIcon>();
		icono.put("uno", new ImageIcon("../Modulo_Evaluaciones/multimedia/Multimedia/Paleta.png"));
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		if (icono.get(value) != null)
			setIcon(icono.get(value));
		else
			setIcon(null);
		return this;
	}

}
