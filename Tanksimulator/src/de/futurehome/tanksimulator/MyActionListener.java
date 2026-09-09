package de.futurehome.tanksimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

    public TankSimulator f;

    public MyActionListener(TankSimulator f) {
        this.f = f;
    }

    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();

        // Beenden
        if (obj == f.btnBeenden) {
            System.exit(0);
        }

        // Einfüllen
        if (obj == f.btnEinfuellen) {

            double fuellstand = f.myTank.getFuellstand();

            fuellstand = fuellstand + 5;

            f.myTank.setFuellstand(fuellstand);

            // ProgressBar aktualisieren
            f.progressBar.setValue((int) f.myTank.getFuellstand());

            // Prozentanzeige aktualisieren
            f.lblFuellstand.setText((int) f.myTank.getFuellstand() + " %");
        }

        // Verbrauchen
        if (obj == f.btnVerbrauchen) {

            double fuellstand = f.myTank.getFuellstand();

            fuellstand = fuellstand - 2;

            f.myTank.setFuellstand(fuellstand);

            // ProgressBar aktualisieren
            f.progressBar.setValue((int) f.myTank.getFuellstand());

            // Prozentanzeige aktualisieren
            f.lblFuellstand.setText((int) f.myTank.getFuellstand() + " %");
        }

        // Zurücksetzen
        if (obj == f.btnzuruecksetzen) {

            f.myTank.setFuellstand(0);

            // ProgressBar zurücksetzen
            f.progressBar.setValue(0);

            // Prozentanzeige zurücksetzen
            f.lblFuellstand.setText("0 %");
        }
    }
}
