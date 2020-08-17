package ssemaforo.pkg2.pkg0;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;

public class SSEMAFORO20 extends JFrame {

    JLabel jLabel1, jLabel2, vertical, jLabel4, jLabel5, jLabel6, carro4;
    JFrame frame = new JFrame();
    int contador = 0, temp = 0, temp2 = 0, temp3 = 0, temp4 = 0;

    public static void main(String[] args) {
        SSEMAFORO20 obj = new SSEMAFORO20();
    }

    public SSEMAFORO20() {
        frame.setTitle("Simulador semaforo");
        frame.setLayout(null);
        

        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        frame.setBounds(0, 0, 640, 610);
        frame.setBackground(new Color(250, 250, 250));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jLabel2 = new javax.swing.JLabel();
        vertical = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        carro4 = new javax.swing.JLabel();

        //jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/verde2.png"))); // NOI18N
        //jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/rojo1.png"))); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/carro1.png"))); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/carro2.png"))); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/carro3.png"))); // NOI18N
        carro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/carro4.png")));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N

        jLabel4.setBounds(180, 190, 70, 40);
        vertical.setBounds(380, 350, 40, 70);
        jLabel1.setBounds(0, 0, 627, 570);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/verde2.png")));
        vertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/rojo1.png")));

        frame.add(jLabel2);
        frame.add(vertical);
        frame.add(jLabel4);
        frame.add(jLabel5);
        frame.add(jLabel6);
        frame.add(carro4);
        frame.add(jLabel1);
        frame.setVisible(true);

        int contadorcarro1 = 700, contadorcarro2 = 500, contadorcarro3 = 500, contadorsemaforo1 = 1000, contadorsemaforo2 = 1000, contadorcarro4 = 700;
        //while (true) {

        while (true) {
            for (int i = 0; i < 70; i++) {
                //jLabel2.setBounds(contadorcarro1, 230, 100, 50);

                jLabel5.setBounds(320, contadorcarro2, 50, 120);
                jLabel6.setBounds(260, contadorcarro3, 50, 110);
                contadorcarro2 = contadorcarro2 - 2;
                contadorcarro3 = contadorcarro3 - 2;

                try {
                    Thread.sleep(10);
                } catch (Exception x) {
                }
            }
            contadorsemaforo1 = 1000;
            for (int i = 0; i < 1000; i++) {
                contadorsemaforo1 = contadorsemaforo1 - 1;

                jLabel2.setBounds(contadorcarro1, 235, 120, 50);
                carro4.setBounds(contadorcarro4, 285, 120, 50);
                contadorcarro1 = contadorcarro1 - 1;
                contadorcarro4 = contadorcarro4 - 2;
                if (contadorsemaforo1 == 1000) {
                    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/verde2.png"))); // NOI18N
                    vertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/rojo1.png")));

                }
                if (contadorsemaforo1 == 600) {
                    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/amarillo2.png"))); // NOI18N
                    vertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/rojo1.png")));

                }
                if (contadorsemaforo1 == 300) {
                    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/rojo2.png"))); // NOI18N
                    vertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/verde1.png")));

                }
                try {
                    Thread.sleep(4);
                } catch (Exception x) {
                }
            }

            for (int i = 0; i < 300; i++) {
                //jLabel2.setBounds(contadorcarro1, 230, 100, 50);
                jLabel5.setBounds(320, contadorcarro2, 50, 120);
                jLabel6.setBounds(260, contadorcarro3, 50, 110);
                contadorcarro1 = contadorcarro1 - 9;
                contadorcarro2 = contadorcarro2 - 3;
                contadorcarro3 = contadorcarro3 - 2;

                try {
                    Thread.sleep(10);
                } catch (Exception x) {
                }
            }

            contadorcarro1 = 700;
            contadorcarro2 = 500;
            contadorcarro3 = 500;
            contadorcarro4=700;
            contadorsemaforo1 = 300;
        }

    }
}
