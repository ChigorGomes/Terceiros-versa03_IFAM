/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Dmitry
 */
public class KeyStroker {

    private String key;
    private Object value;
    private Typo typo;

    public KeyStroker(String key, Object value, Typo typo) {
        this.setKey(key);
        this.setValue(value);
        this.setTypo(typo);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Typo getTypo() {
        return typo;
    }

    public void setTypo(Typo typo) {
        this.typo = typo;
    }

    public enum Typo {

        R_LIKE, L_LIKE, LIKE, EQUALS, CASE_EQUALS, ORDER_ASC, ORDER_DESC, LESS, GREATER, NULL, N_NULL, EMPTY, N_EMPTY;

    }

}
