import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CasseBrique extends Canvas implements KeyListener {

    public static final int width = 500;
    public static final int height = 700;

    public Balle balle = new Balle(235,600,Color.black,1,1,30);
    public Barre barre = new Barre(215,670,Color.red,5,10,70);

    public CasseBrique() throws InterruptedException {

        setSize(width,height);
        setBounds(0,0,width,height);


        JFrame fenetre = new JFrame();
        JPanel panneau = (JPanel) fenetre.getContentPane();

        panneau.setSize(width,height);
        panneau.add(this);
        panneau.setVisible(true);

        fenetre.pack();
        fenetre.setResizable(false);
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fenetre.requestFocus();
        fenetre.addKeyListener(this );

        this.createBufferStrategy(2);
        this.setIgnoreRepaint(true);
        this.setFocusable(false);

        this.demarrer();
    }
    public void demarrer() throws InterruptedException {
        while (true) {

            Graphics2D dessin = (Graphics2D) getBufferStrategy().getDrawGraphics();

            /* Program */

            dessin.setColor(Color.white);
            dessin.fillRect(0,0,width,height);

            balle.dessiner(dessin);
            barre.dessiner(dessin);

            balle.deplacement();
            balle.rebond();

            System.out.println("Position x : " + balle.getPosX());
            System.out.println("Position y : " + balle.getPosY());
            System.out.println("Position Y barre : " + barre.getPosY());


            if (balle.getPosY() + balle.getDiametre() == barre.getPosY()){
                System.out.println("Touché");
            }

            /* Fin program */

            dessin.dispose();
            getBufferStrategy().show();
            Thread.sleep(1000 / 10);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 39){
            barre.deplacementDroite();
        } else if (e.getKeyCode() == 37) {
            barre.deplacementGauche();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
}
