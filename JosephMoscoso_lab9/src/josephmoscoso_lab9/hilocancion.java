/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephmoscoso_lab9;

import javax.swing.JLabel;
import javax.swing.JMenu;

/**
 *
 * @author Joseph
 */
public class hilocancion extends Thread {
    private int lim;
    private JLabel menuhora;
    
    public hilocancion(int lim, JLabel menuhora) {
        this.lim = lim;
        this.menuhora = menuhora;
    }
    
    
    public hilocancion(JLabel menuhora) {
        this.menuhora = menuhora;
    }

    public JLabel getMenuhora() {
        return menuhora;
    }

    public void setMenuhora(JLabel menuhora) {
        this.menuhora = menuhora;
    }

    @Override
    public void run() {
        int a=0;
        while (a<=lim) {
            try {
                menuhora.setText(Integer.toString(a));
                a++;
                Thread.sleep(lim*1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return  menuhora.getText();
    }
}
