import java.awt.*;

public class Sprite {
    protected int posX;
    protected int posY;
    protected Color couleur;
    protected int vitesseX;
    protected int vitesseY;

    public Sprite(int posX, int posY, Color couleur, int vitesseX, int vitesseY) {
        this.posX = posX;
        this.posY = posY;
        this.couleur = couleur;
        this.vitesseX = vitesseX;
        this.vitesseY = vitesseY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getVitesseX() {
        return vitesseX;
    }

    public void setVitesseX(int vitesseX) {
        this.vitesseX = vitesseX;
    }

    public int getVitesseY() {
        return vitesseY;
    }

    public void setVitesseY(int vitesseY) {
        this.vitesseY = vitesseY;
    }
}
