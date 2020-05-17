import javax.swing.*;
import java.awt.*;

//center positioning
public class DesignPanel extends JPanel {
    final MainFrame mainFrame;
    final static int width = 600, height = 600;
    //JButton testButton = new JButton("Testing");

    public DesignPanel(MainFrame mainFrame){
        this.mainFrame = mainFrame;
        initialize();
    }
    private void initialize(){
        setPreferredSize(new Dimension(width, height));
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        //add(testButton);
    }
    public void updateComponent(int index){
        if(index==0){
            JButton newButton = new JButton(mainFrame.controlPanel.textField.getText());
            add(newButton);
            validate(); //apparently you have to use this, cause otherwise the panel won't refresh :-??
        }
        if(index==1){
            JLabel newLabel = new JLabel(mainFrame.controlPanel.textField.getText());
            add(newLabel);
            validate();
        }
        if(index==2){
            JTextField newTextField = new JTextField(mainFrame.controlPanel.textField.getText());
            add(newTextField);
            validate();
        }
    }
}
