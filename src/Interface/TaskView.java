package src.Interface;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;

public class TaskView extends JPanel {
	private JTextField mTitleField;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
				
		TaskView taskView = new TaskView();
		
		frame.getContentPane().add(taskView);
		frame.pack();
		frame.setVisible(true);
	}
	
	public TaskView() {
		setLayout(new MigLayout("", "[450px,grow]", "[20px][23px][grow]"));
		
		mTitleField = new JTextField();
		add(mTitleField, "cell 0 0,growx,aligny center");
		mTitleField.setColumns(10);
		
		JCheckBox chckbxTodoToday = new JCheckBox("Todo Today");
		add(chckbxTodoToday, "cell 0 1");
		
		JCheckBox chckbxHasNoDate = new JCheckBox("No Date");
		chckbxHasNoDate.setSelected(true);
		add(chckbxHasNoDate, "cell 0 1");
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		datePicker.getModel().setDate(12, 12, 12);
				
		add(datePicker, "cell 0 1");
		
		JCheckBox chckbxIsComplete = new JCheckBox("Complete");
		add(chckbxIsComplete, "flowx,cell 0 1,alignx left,aligny center");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane, "cell 0 2,grow");
		
		JEditorPane editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
	}
}
