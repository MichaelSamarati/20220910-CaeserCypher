package pkg20220910_caesercypher;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        FlatLightLaf.setup();
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            UIManager.put("Button.arc", 13);
        UIManager.put("TextComponent.arc", 10);
        } catch (Exception e) {
            System.out.println(e);
        }
        GUI gui = new GUI();
        gui.setVisible(true);
    }
    
}
