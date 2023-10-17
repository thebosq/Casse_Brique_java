import java.awt.*;
public class Balle extends Sprite {
    private int vitesseX;
    private int vitesseY;
    private int diametre;

    public Balle(int posX, int posY, Color couleur, int vitesseX, int vitesseY, int diametre) {
        super(posX, posY, couleur);
        this.vitesseX = vitesseX;
        this.vitesseY = vitesseY;
        this.diametre = diametre;
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

    public int getDiametre() { return diametre; }

    public void setDiametre(int diametre) { this.diametre = diametre; }

    public void deplacement() {
        this.posX += this.vitesseX;
        this.posY += this.vitesseY;
    }

    public void rebond(){
        if (this.posX + 30>= CasseBrique.width || this.posX < 0){
            this.vitesseX = -this.vitesseX;
        }
        if (this.posY + 30>= CasseBrique.height || this.posY < 0){
            this.vitesseY = -this.vitesseY;
        }
    }

    public void dessiner(Graphics2D dessin) {
        dessin.setColor(this.couleur);
        dessin.fillOval(posX,posY,this.diametre,this.diametre);
    }

}