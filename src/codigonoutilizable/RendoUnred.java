package codigonoutilizable;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class RendoUnred extends JFrame {
	protected JTextArea textArea = new JTextArea();

	

	 JButton undoButton = new JButton("Deshacer");

	 JButton redoButton = new JButton("Rehacer");

	KeyStroke undoKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Z,
			Event.CTRL_MASK);
	KeyStroke redoKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Y,
			Event.CTRL_MASK);
	
	UndoManager undoManager = new UndoManager();

	public RendoUnred() {
		super("Undo/Redo Demo");

		undoButton.setEnabled(false);
		redoButton.setEnabled(false);

		JPanel buttonPanel = new JPanel(new GridLayout());
		buttonPanel.add(undoButton);
		buttonPanel.add(redoButton);

		JScrollPane scroller = new JScrollPane(textArea);

		getContentPane().add(buttonPanel, BorderLayout.NORTH);
		getContentPane().add(scroller, BorderLayout.CENTER);

		textArea.getDocument().addUndoableEditListener(
				new UndoableEditListener() {
					public void undoableEditHappened(UndoableEditEvent e) {
						undoManager.addEdit(e.getEdit());
						updateButtons();
					}
				});

		Document document = textArea.getDocument();
		document.addUndoableEditListener(new UndoableEditListener() {
			public void undoableEditHappened(UndoableEditEvent e) {
				undoManager.addEdit(e.getEdit());

			}
		});

		undoButton.addActionListener((ActionEvent e) -> {
			try {
				undoManager.undo();
			} catch (CannotUndoException cue) {
			}

		});
		undoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					undoManager.undo();
				} catch (CannotUndoException cre) {
					cre.printStackTrace();
				}
				updateButtons();
			}
		});

		redoButton.addActionListener((ActionEvent e) -> {
			try {
				undoManager.redo();
			} catch (CannotRedoException cre) {
			}
		});

		redoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					undoManager.redo();
				} catch (CannotRedoException cre) {
					cre.printStackTrace();
				}
				updateButtons();
			}
		});

		textArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
				undoKeyStroke, "undoKeyStroke");
		textArea.getActionMap().put("undoKeyStroke", new AbstractAction() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					undoManager.undo();
				} catch (CannotUndoException cue) {
				}
			}
		});
		textArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
				redoKeyStroke, "redoKeyStroke");
		textArea.getActionMap().put("redoKeyStroke", new AbstractAction() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					undoManager.redo();
				} catch (CannotRedoException cre) {
				}
			}
		});

		setSize(400, 300);
		setVisible(true);
	}

	public void updateButtons() {
		undoButton.setText(undoManager.getUndoPresentationName());
		redoButton.setText(undoManager.getRedoPresentationName());
		undoButton.setEnabled(undoManager.canUndo());
		redoButton.setEnabled(undoManager.canRedo());
	}

	public static void main(String argv[]) {
		new RendoUnred();
	}
}
