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

       
        if (obj == f.btnBeenden) {
            System.exit(0);
        }

       
        if (obj == f.btnEinfuellen) {

            double fuellstand = f.myTank.getFuellstand();

            fuellstand = fuellstand + 5;

            f.myTank.setFuellstand(fuellstand);

           
            f.progressBar.setValue((int) f.myTank.getFuellstand());

           
            f.lblFuellstand.setText((int) f.myTank.getFuellstand() + " %");
        }

       
        if (obj == f.btnVerbrauchen) {

            double fuellstand = f.myTank.getFuellstand();

            fuellstand = fuellstand - 2;

            f.myTank.setFuellstand(fuellstand);

            
            f.progressBar.setValue((int) f.myTank.getFuellstand());

            
            f.lblFuellstand.setText((int) f.myTank.getFuellstand() + " %");
        }

       
        if (obj == f.btnzuruecksetzen) {

            f.myTank.setFuellstand(0);

           
            f.progressBar.setValue(0);

           
            f.lblFuellstand.setText("0 %");
        }
    }
}
