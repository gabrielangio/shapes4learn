package edu.maimonides.multimedia.shapes4learn.lexico;

import edu.maimonides.multimedia.shapes4learn.interpreter.CodeException;
import edu.maimonides.multimedia.shapes4learn.interpreter.Interpreter;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import java.io.*;
import static java.lang.System.in;
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
                int valor = 0; 
                //Se procesa el código fuente y se guarda en una lista los distintos lexemas
                StringTokenizer tokens = new StringTokenizer(code);
                while(tokens.hasMoreTokens()){
                        array.add(tokens.nextToken());
                        valor = valor+1;
                } 
                                
                System.out.println("Cantidad de lexemas encontrados:"+ valor);
                
                int tokenmetodo=0;
                int tokenforma=0;
                int tokenin=0;
                int tokenid=0;
                
                try{
                    BufferedWriter out = new BufferedWriter (new FileWriter("C:\\final.txt"));
                    out.write("Cantidad de lexemas encontrados: "+ valor );
                    out.write(System.getProperty("line.separator"));
                                   
                for(int i = 0; i < array.size();i++){
                     
                    
                    
                    try{
                        BufferedWriter out2 = new BufferedWriter (new FileWriter("C:\\intermedio.txt",true));
                                         
                    //Evalua si el lexema es un Metodo
                    if( (array.get(i).equals("create")) || (array.get(i).equals("setcolor")) || (array.get(i).equals("setbase")) || (array.get(i).equals("setheight")) || (array.get(i).equals("setradius")) || (array.get(i).equals("setposition")))    {
                        System.out.println(array.get(i)+"(METODO)");
                        tokenmetodo=1;
                        out2.write(array.get(i)+" (METODO)");
                        out2.write(System.getProperty("line.separator")); 
                    }
                        else
                                {
                                //Evalua si el lexema es una Forma
                                if( (array.get(i).equals("shape")) || (array.get(i).equals("rectangle")) || (array.get(i).equals("circle"))){
                                System.out.println(array.get(i)+"(FORMA)");
                                tokenforma=1;
                                out2.write(array.get(i)+" (FORMA)");
                                out2.write(System.getProperty("line.separator"));
                                }
                        else
                                {
                                //Evalua  si el lexema es un in
                                if( array.get(i).equals("in")){
                                System.out.println(array.get(i)+"(in)"); 
                                tokenin=1;
                                out2.write(array.get(i)+" (IN)");
                                out2.write(System.getProperty("line.separator"));
                                }
                        else
                                {
                                System.out.println(array.get(i)+"(id)"); 
                                tokenid=1;
                                out2.write(array.get(i)+" (ID)");
                                out2.write(System.getProperty("line.separator"));
                                }}
                    }
                                        
                    out2.close();
                    }
                    catch (IOException e){
                    
                    }
                   
                }
                System.out.println("Cantidad de tokens encontrados: "+(tokenmetodo+tokenforma+tokenin+tokenid));  
                out.write("Cantidad de tokens encontrados: "+(tokenmetodo+tokenforma+tokenin+tokenid));
                out.write(System.getProperty("line.separator"));
                out.write(System.getProperty("line.separator"));
                
                try{
                    FileInputStream fstream = new FileInputStream("C:\\intermedio.txt");
                    DataInputStream entrada = new DataInputStream(fstream);
                    BufferedReader out3 = new BufferedReader (new InputStreamReader (entrada));
                    String strLinea;
                    while ((strLinea = out3.readLine()) != null){
                        out.write (strLinea);
                        out.write(System.getProperty("line.separator"));
                    }      
                
                out3.close();
                }
                catch (IOException e){
                        
                }
                                
                out.close();
                }
                catch (IOException e){
                }
                
                File intermedio = new File ("C:\\intermedio.txt");
                intermedio.delete();
               
    }
       
}
