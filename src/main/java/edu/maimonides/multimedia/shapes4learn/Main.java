package edu.maimonides.multimedia.shapes4learn;

import edu.maimonides.multimedia.shapes4learn.interpreter.CodeException;
import edu.maimonides.multimedia.shapes4learn.lexico.Lexico;
import edu.maimonides.multimedia.shapes4learn.model.Color;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import edu.maimonides.multimedia.shapes4learn.model.exceptions.InexistentShapeException;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Circle;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Rectangle;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Shape;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;


public class Main {
   
    public static void main(String[] args) throws CodeException, FileNotFoundException, IOException {
                
        JLabel Enunciado = new JLabel ("Introduzca el texto a analizar");
        
        JButton Boton = new JButton("Analizar Texto Ingresado");
        JLabel Comentario = new JLabel ("En C:\\ se le generará el archivo final.txt con el resultado del análisis");
        
        JFrame Ventana = new JFrame();
        Ventana.setTitle("Analizador Léxico");
        Ventana.setLocationRelativeTo(null);
        Ventana.setLayout(new FlowLayout());
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Panel = new JPanel();
        final JTextArea Texto = new JTextArea(10,20);
        JScrollPane spane = new JScrollPane(Texto);
        Panel.add(spane);
        Ventana.add(Panel);
        Ventana.setSize(400, 400);
        

        
        Ventana.add(Enunciado);
        Ventana.add(Texto);
        Ventana.add(Boton);
        Ventana.add(Comentario);
        Ventana.setVisible(true);
      
        
        Boton.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed (java.awt.event.ActionEvent evt)
                    {
                    try {
                        BotonActionPerformed(evt);
                    } catch (CodeException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                private void BotonActionPerformed(ActionEvent evt) throws CodeException
                    {
                        ShapeAmbient ambiente = new ShapeAmbient() {

                            @Override
                            public void add(Shape shape) {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }

                            @Override
                            public Shape get(String id) throws InexistentShapeException {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }

                            @Override
                            public void remove(String id) throws InexistentShapeException {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }

                            @Override
                            public boolean contains(String id) {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }

                            @Override
                            public Iterable<Shape> shapes() {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }
                        };
                        
                        Lexico analizadorLexico = new Lexico();
                        String codigo;
                        codigo = Texto.getText();
                        analizadorLexico.interpret(codigo, ambiente);
                    }
            }
        );  
    }

}