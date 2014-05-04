package edu.maimonides.multimedia.shapes4learn;

import edu.maimonides.multimedia.shapes4learn.interpreter.CodeException;
import edu.maimonides.multimedia.shapes4learn.lexico.Lexico;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Circle;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Rectangle;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Shape;
import edu.maimonides.multimedia.shapes4learn.model.Color;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import edu.maimonides.multimedia.shapes4learn.model.exceptions.InexistentShapeException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
   
    public static void main(String[] args) throws CodeException {
        
        /*Lexico analisisLexico = new Lexico();
        String codigo = "setbase 5 + 4 in rectangle myrectangle1 ;";
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
       
            //Invoco a la interfaz Interpreter
            analisisLexico.interpret(codigo, ambiente);
        */
        
        System.out.println("Hola Mundo");
        
    }
}