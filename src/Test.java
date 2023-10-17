import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    public Test() {
        setSize(500,500);

        JPanel panneau = new JPanel();
        setContentPane(panneau);
        JButton bouton = new JButton("Click moi");
        panneau.add(bouton);
        JButton bouton2 = new JButton("Click moi vraiment !");
        panneau.add(bouton2);
        JButton bouton3 = new JButton("Click moi vraiment !");
        panneau.add(bouton3);

        // ActionListener evenement = new EvenementBouton();
        // bouton.addActionListener(evenement);
        bouton.addActionListener(new EvenementBouton());

        ActionListener evenement2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Deuxième message");
            }
        };
        bouton2.addActionListener(evenement2);

        // On peut remplacer le paramètre "e" par n'importe quel nom
        // Et les accolade s'il y a qu'une seule instruction
        ActionListener evenement3 = e -> System.out.println("3eme interraction");
        bouton3.addActionListener(e -> System.out.println("Troisieme interraction"));
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}
