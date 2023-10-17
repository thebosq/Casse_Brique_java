import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenementBouton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Tu m'as cliqué ! ");
    }
}
