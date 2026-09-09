package de.futurehome.tanksimulator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class TankSimulator extends Frame {

    public Tank myTank;

    private Label lblUeberschrift = new Label("Tank-Simulator");

    // ProgressBar von 0 bis 100 %
    public JProgressBar progressBar = new JProgressBar(0, 100);

    // Anzeige des Füllstands in Prozent
    public Label lblFuellstand = new Label("0 %");

    public Button btnBeenden = new Button("Beenden");
    public Button btnEinfuellen = new Button("Einf\u00fcllen");
    public Button btnVerbrauchen = new Button("Verbrauchen");
    public Button btnzuruecksetzen = new Button("Zur\u00fccksetzen");

    private Panel pnlNorth = new Panel();

    // 2 Zeilen:
    // 1. ProgressBar
    // 2. Prozentanzeige
    private Panel pnlCenter = new Panel(new GridLayout(2, 1));

    private Panel pnlSouth = new Panel(new GridLayout(1, 0));

    private MyActionListener myActionListener = new MyActionListener(this);

    public TankSimulator() {
        super("Tank-Simulator");

        myTank = new Tank(0);

        // ProgressBar einstellen
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setValue(0);

        // Prozentzahl im ProgressBar anzeigen
        progressBar.setStringPainted(true);

        // Überschrift
        this.lblUeberschrift.setFont(new Font("", Font.BOLD, 16));

        // Überschrift
        this.pnlNorth.add(this.lblUeberschrift);

        // ProgressBar zuerst
        this.pnlCenter.add(this.progressBar);

        // Prozentanzeige darunter
        this.pnlCenter.add(this.lblFuellstand);

        // Buttons
        this.pnlSouth.add(this.btnEinfuellen);
        this.pnlSouth.add(this.btnVerbrauchen);
        this.pnlSouth.add(this.btnBeenden);
        this.pnlSouth.add(this.btnzuruecksetzen);

        // Panels zum Fenster hinzufügen
        this.add(this.pnlNorth, BorderLayout.NORTH);
        this.add(this.pnlCenter, BorderLayout.CENTER);
        this.add(this.pnlSouth, BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);

        // Ereignissteuerung
        this.btnEinfuellen.addActionListener(myActionListener);
        this.btnVerbrauchen.addActionListener(myActionListener);
        this.btnBeenden.addActionListener(myActionListener);
        this.btnzuruecksetzen.addActionListener(myActionListener);
    }

    public static void main(String argv[]) {
        new TankSimulator();
    }
}
