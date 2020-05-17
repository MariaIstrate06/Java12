import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

//north positioning
public class ControlPanel extends JPanel {

    final MainFrame mainFrame;
    JComboBox componentCombo;
    JTextField textField = new JTextField(); //you can use TextField for small texts & JTextArea for big chunks of text
    JButton addButton = new JButton("Add this..."); //the button that once you press, calls a function in the designPanel class that adds the preferred component

    public ControlPanel(MainFrame frame) {
        this.mainFrame = frame;
        setUp();
    }

    private void setUp(){
        setLayout(new GridLayout(1, 4)); //layout choices
        /*
        i think grid is the best swing layout for what we need. but there's a bunch of them if u wanna change
        https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
         */

        String[] components = {"Button", "Label", "Text"};

        componentCombo = new JComboBox(components);
        textField = new JTextField("Add the text here...");
        addButton = new JButton("ADD!");

        add(componentCombo);
        add(textField);
        add(addButton);

        addButton.addActionListener(this::addButton);
    }

    private void addButton(ActionEvent e){
        mainFrame.designPanel.updateComponent(componentCombo.getSelectedIndex());
    }
}
