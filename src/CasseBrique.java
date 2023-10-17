import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CasseBrique extends Canvas implements KeyListener {

    public static final int width = 500;
    public static final int height = 700;

    protected Balle balle = new Balle(235,600,Color.black,7,5,30);
    protected Barre barre = new Barre(215,670,Color.red,5,0,10,70);

    public CasseBrique() throws InterruptedException {

        this.setSize(width,height);
        this.setBounds(0,0,width,height);


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

        this.start();
    }
    public void start() throws InterruptedException {

        while (true) {
            Graphics2D draw = (Graphics2D) getBufferStrategy().getDrawGraphics();

            /* Program */
            draw.setColor(Color.white);
            draw.fillRect(0,0,width,height);

            balle.dessiner(draw);
            barre.dessiner(draw);

            balle.deplacement();
            balle.rebond();

            boolean collissionY = balle.getPosY() + balle.getDiametre() == barre.getPosY();
            boolean collissionDebutBarre = balle.getPosX() + balle.getDiametre() >= barre.getPosX();
            boolean collissionFinBarre = balle.getPosX() < barre.getPosX() + barre.getWidth();

            if (collissionY && (collissionDebutBarre && collissionFinBarre)) {
                balle.setVitesseY(-balle.getVitesseY());
            }

            /* Fin program */

            draw.dispose();
            getBufferStrategy().show();
            Thread.sleep(1000 / 60);
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
