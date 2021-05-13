package Projekt;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelG {




    public static class Panel extends JPanel implements MouseListener {
        public Panel() {
            addMouseListener(this);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            ImageIcon tlo = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\miasto.PNG");
            g.drawImage(tlo.getImage(), 0, 0, 1100, 700, null);
            ImageIcon przyciskStart = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\przyciskStart.PNG");
            g.drawImage(przyciskStart.getImage(), 350 ,200,400 ,300,null);

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

        public static class Panel2 extends JPanel implements KeyListener {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        }

}
























        /*
        Scanner sc = new Scanner(System.in);
        int wybor;
        String a = "Graj";
        String b = "Zakoncz";
        System.out.println("------------------");
        System.out.println(" Wybierz opcje:");
        System.out.println("   1. " + a);
        System.out.println("   2. " + b);
        System.out.println("------------------");
        wybor = sc.nextInt();
        switch (wybor) {
            case 1:
                System.out.println("Wybierz jednego z trzech pokemonow: ");
                int pok;
                System.out.println( "1. Bulbasaur ");
                System.out.println( "2. Charmander ");
                System.out.println( "3. Squirtle ");
                pok = sc.nextInt();
                switch (pok){
                    case 1:
                        System.out.println("Oto statystyki twojego stworka:");
                        Bulbasaur poke = new Bulbasaur("Bulbasaur");
                        poke.statystyki();
                        break;
                        case 2:
                            System.out.println("Oto statystyki twojego stworka:");
                            Charmander poke1 = new Charmander("Charmander");
                            poke1.statystyki();
                            break;
                            case 3:
                                System.out.println("Oto statystyki twojego stworka:");
                                Squirtle poke2 = new Squirtle("Squirtle");
                                poke2.statystyki();
                                break;
                    default:
                        return;
                }
            case 2:
               break;
            default:
                System.out.println("Nie ma takiej opcji");
                return;

        }
        System.out.println();
        int sam;
        System.out.println("Czy chcesz przejść samouczek?");
        System.out.println(" 1. Tak");
        System.out.println(" 2. Nie");
        sam = sc.nextInt();
        switch (sam){
            case 1:


            case 2:
                break;
            default:
                System.out.println("nie ma takiej obcji");
                return;
        }


         */
