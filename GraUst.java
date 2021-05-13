package Projekt;

import javax.swing.*;

public class GraUst {
    public static JFrame widok = new JFrame("POKEMONY");
    public static Projekt.PanelG.Panel PanelG = new PanelG.Panel();
    public static int x;
    public static int y;

    public static void start() {
        widok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        widok.setBounds(1000, 1000, 1100, 700);
        widok.add(PanelG);
        widok.setVisible(true);
        widok.setLocationRelativeTo(null);
    }
}
