package edu.maimonides.multimedia.shapes4learn.lexico;

import edu.maimonides.multimedia.shapes4learn.interpreter.CodeException;
import edu.maimonides.multimedia.shapes4learn.interpreter.Interpreter;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import java.util.ArrayList;
import java.util.StringTokenizer;


public  class Lexico implements Interpreter {
    //Constructor
    public Lexico() {
    }
       
    //M�todo de la interfaz Interpreter
    public void interpret(String code, ShapeAmbient ambient) throws CodeException{
        
        //Se procesa el c�digo fuente y se guarda en una lista los distintos lexemas
        ArrayList array = new ArrayList();    
        StringTokenizer tokens = new StringTokenizer(code);
	while(tokens.hasMoreTokens()){
            array.add(code);
        }    
        
        //Se imprimen los lexemas
        for(int i=0; i < array.size();i++){
            System.out.println(array.get(i));
        }
    } 
}