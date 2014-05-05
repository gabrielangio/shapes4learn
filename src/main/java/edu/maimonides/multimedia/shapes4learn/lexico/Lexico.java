package edu.maimonides.multimedia.shapes4learn.lexico;

import edu.maimonides.multimedia.shapes4learn.interpreter.CodeException;
import edu.maimonides.multimedia.shapes4learn.interpreter.Interpreter;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public  class Lexico implements Interpreter {
    //Constructor
    public Lexico() {
    }
       
    //Método de la interfaz Interpreter
    public void interpret(String code, ShapeAmbient ambient) throws CodeException{
                    
                 ArrayList array = new ArrayList();  
                 
                 //Se definen ExpresionesRegulares
                // Pattern expRegularMetodo = Pattern.compile("[create|setcolor|setbase|setheight|setradius|setposition]");  
                 Pattern expRegularNumero = Pattern.compile("[0-9]+");
                 
                //Se procesa el código fuente y se guarda en una lista los distintos lexemas
                StringTokenizer tokens = new StringTokenizer(code);
                while(tokens.hasMoreTokens()){
                        array.add(tokens.nextToken());
                } 
                
                for(int i = 0; i < array.size();i++){
                    
                    //Evalua si el lexema es un Metodo
                    if( (array.get(i).equals("create")) || (array.get(i).equals("setcolor")) || (array.get(i).equals("setbase")) || (array.get(i).equals("setheight")) || (array.get(i).equals("setradius")) || (array.get(i).equals("setposition")))    {
                        System.out.println(array.get(i)+"(METODO)");
                    }
                        else
                                {
                                //Evalua si el lexema es una Forma
                                if( (array.get(i).equals("shape")) || (array.get(i).equals("rectangle")) || (array.get(i).equals("circle"))){
                                System.out.println(array.get(i)+"(FORMA)");
                                }
                        else
                                {
                                //Evalua  si el lexema es un in
                                if( array.get(i).equals("in")){
                                System.out.println(array.get(i)+"(in)"); 
                                }
                        else
                                {
                                System.out.println(array.get(i)+"(id)"); 
                                }}
                                }
                    }
    }
}