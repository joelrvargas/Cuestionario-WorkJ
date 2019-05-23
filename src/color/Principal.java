package color;

	import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.ForegroundAction;


	public class Principal extends JFrame {
	 
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	JButton btnColor;
	 Color color;
	 JPanel p;
	 private JTextPane textPane;
	 
	 public Principal(){
	  p=new JPanel();
	  btnColor=new JButton("Seleccionar Color");
	  btnColor.setBounds(159, 5, 115, 23);
	  btnColor.addActionListener(new ActionListener(){


	        public void actionPerformed(ActionEvent e){
	                JColorChooser Selectorcolor=new JColorChooser();
	                color=Selectorcolor.showDialog(null, "Seleccione un Color", Color.BLUE);
	                Action actionColor = new ForegroundAction(Action.NAME, color);
	                actionColor.actionPerformed(e);
	                
	         }
	  });
	 p.setLayout(null);
	  p.add(btnColor);
	  getContentPane().add(p);
	  
	  textPane = new JTextPane();
	  textPane.setBounds(52, 44, 342, 196);
	  p.add(textPane);
	  
	  
	 }
	 public static void main(String arg[]){
	  Principal p=new Principal();
	  p.setVisible(true);
	  p.setBounds(0, 0, 400, 400);
	  p.setLocationRelativeTo(null);
	 }
	}



