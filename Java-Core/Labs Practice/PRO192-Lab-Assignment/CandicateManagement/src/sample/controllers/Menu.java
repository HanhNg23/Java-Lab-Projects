package sample.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
import java.util.ArrayList;
import sample.dto.IMenu;
import sample.utils.Utils;

public class Menu extends ArrayList<String> implements IMenu { //vua inherit Arraylistvua la I_Menu

    public Menu() {
        super();
    }
    // must implement all abstract method of I_Menu interface

    @Override
    public void addItem(String s) {
        this.add(s);
    }

    @Override
    public void showMenu() {
        for(int i = 0; i < this.size(); i++){
            System.out.println(this.get(i));
        }
    }

    @Override
    public boolean confirmYesNo(String welcome) {
        boolean result = false;
        result = Utils.confirmYesNo(welcome);
        return result;
        
    }

    @Override
    public int getChoice() {
        int choosefrom = 1;
        int to = this.size();
        return Utils.getInt("Your choice", choosefrom, to);
    }

}
