/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 *
 * @author joaon
 */
public class TestesComDatas {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
        System.out.println(localDate.getMonth());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        localDate = (LocalDate) dateTimeFormatter.parse("05/07/1978");
        System.out.println(localDate);
    }
}
