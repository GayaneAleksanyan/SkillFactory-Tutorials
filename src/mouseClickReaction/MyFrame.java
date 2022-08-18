package mouseClickReaction;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(400, 300);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth() / 2,
                        e.getYOnScreen() - getHeight() / 2);

            }
        });
    }
}
