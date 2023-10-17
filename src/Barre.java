import java.awt.*;

public class Barre extends Sprite {
    private int vitesse;
    private int height;
    private int width;

    public Barre(int posX, int posY, Color couleur, int vitesse, int height, int width) {
        super(posX, posY, couleur);
        this.vitesse = vitesse;
        this.height = height;
        this.width = width;
    }

    public void deplacementDroite() {
        if (this.posX + this.width < CasseBrique.width) {
            this.posX += this.vitesse;
        }
    }



    public void deplacementGauche() {
        if (this.posX > -1){
            this.posX -= this.vitesse;
        }
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void dessiner(Graphics2D dessin) {
        dessin.setColor(this.couleur);
        dessin.fillRect(posX,posY,this.width, this.height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
