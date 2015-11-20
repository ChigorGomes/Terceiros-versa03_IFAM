/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceiros.ctr;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Dmitry
 */
public class CTRUpperCase implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        ((JTextComponent) e.getSource()).setText(((JTextComponent) e.getSource()).getText().toUpperCase());
    }

}
