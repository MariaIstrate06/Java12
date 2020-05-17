import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class MainFrame extends JFrame {
    ControlPanel controlPanel;
    DesignPanel designPanel;

    public MainFrame() {
        super("Mariuca te iubeste");
        setUp();
    }
    private void setUp(){
        this.setBounds(100,100,700,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        controlPanel = new ControlPanel(this);
        designPanel = new DesignPanel(this);

        setLayout(new BorderLayout());
        add(controlPanel, BorderLayout.NORTH);
        add(designPanel, CENTER);

        //pack();
    }
}
