/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.auxilio;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Rayane
 */
public class ObterDataHorario {

    public String obeterData() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String oberHorario() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
