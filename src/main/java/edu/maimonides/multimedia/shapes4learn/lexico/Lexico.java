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
        
                //Se crea una lista para almacenar los lexemas
                ArrayList array = new ArrayList();  
                 
                 //Se definen ExpresionesRegulares
                // Pattern expRegularMetodo = Pattern.compile("[create|setcolor|setbase|setheight|setradius|setposition]");  
                // Pattern expRegularNumero = Pattern.compile("[0-9]+");
                
                 // se inicializa contador de lexemas 
                 int valor = 0; 
                
                //Se procesa el código fuente y se guarda en una lista los distintos lexemas
                StringTokenizer tokens = new StringTokenizer(code);
                while(tokens.hasMoreTokens()){
                        array.add(tokens.nextToken());
                        valor = valor+1;
                } 
                                
                System.out.println("Cantidad de lexemas encontrados:"+ valor);
                
                //Se inicializan contadores para contar los tokens
                int tokenmetodo=0;
                int tokenforma=0;
                int tokenin=0;
                int tokenid=0;
                int tokensuma = 0;
                int tokenresta = 0;
                int tokenproducto = 0;
                int tokendivision = 0;
                int tokenparentesisapertura = 0;
                int tokenparentesiscierre = 0;
                int tokennumero = 0;
                int tokencolor = 0;
                int tokenfinsentencia = 0;
                
            try{
                            BufferedWriter out = new BufferedWriter (new FileWriter("C:\\final.txt"));
                            out.write("Cantidad de lexemas encontrados: "+ valor );
                            out.write(System.getProperty("line.separator"));
                                   
                    for(int i = 0; i < array.size();i++){
                     
                    
                    
                        try{
                        BufferedWriter out2 = new BufferedWriter (new FileWriter("intermedio.txt",true));
                                         
                                //Evalua si el lexema es un Metodo
                               if( (array.get(i).equals("create")) || (array.get(i).equals("setcolor")) || (array.get(i).equals("setbase")) || (array.get(i).equals("setheight")) || (array.get(i).equals("setradius")) || (array.get(i).equals("setposition")))
                               {
                                    System.out.println(array.get(i)+"(METODO)");
                                    tokenmetodo=1;
                                    out2.write(array.get(i)+" (METODO)");
                                     out2.write(System.getProperty("line.separator"));
                               }
                                //Evalua si el lexema es una Forma
                              
                                  if( (array.get(i).equals("shape")) || (array.get(i).equals("rectangle")) || (array.get(i).equals("circle"))){
                                    System.out.println(array.get(i)+"(FORMA)");
                                    tokenforma=1;
                                    out2.write(array.get(i)+" (FORMA)");
                                    out2.write(System.getProperty("line.separator"));
                                }
                                                       
                                //Evalua  si el lexema es un in
                                  
                                   if( array.get(i).equals("in")){
                                    System.out.println(array.get(i)+"(in)"); 
                                    tokenin=1;
                                    out2.write(array.get(i)+" (IN)");
                                    out2.write(System.getProperty("line.separator"));
                                }
                    
                                
                                //Evalua  si el lexema es un +
                            {      
                                     if( array.get(i).equals("+")){
                                     System.out.println(array.get(i)+"(OPERADOR_SUMA)"); 
                                    tokensuma=1;
                                    out2.write(array.get(i)+" (OPERADOR_SUMA)");
                                    out2.write(System.getProperty("line.separator"));
                                }
                                
                                      
                                //Evalua  si el lexema es un -
                               if( array.get(i).equals("-")){
                                    System.out.println(array.get(i)+"(OPERADOR_RESTA)"); 
                                    tokenresta=1;
                                    out2.write(array.get(i)+" (OPERADOR_RESTA)");
                                    out2.write(System.getProperty("line.separator"));
                                }
                                           
                                
                                //Evalua  si el lexema es un *
                               if( array.get(i).equals("*")){
                                    System.out.println(array.get(i)+"(OPERADOR_PRODUCTO)"); 
                                    tokenproducto=1;
                                    out2.write(array.get(i)+" (OPERADOR_PRODUCTO)");
                                    out2.write(System.getProperty("line.separator"));
                                }
                                                       
                                //Evalua  si el lexema es un /
                                if( array.get(i).equals("/")){
                                    System.out.println(array.get(i)+"(OPERADOR_DIVISION)"); 
                                    tokendivision=1;
                                    out2.write(array.get(i)+" (OPERADOR_DIVISION)");
                                    out2.write(System.getProperty("line.separator"));
                                }
                                
                                  
                                //Evalua  si el lexema es un (
                               if( array.get(i).equals("(")){
                                    System.out.println(array.get(i)+"(PARENTESIS_APERTURA)"); 
                                    tokenparentesisapertura=1;
                                    out2.write(array.get(i)+" (PARENTESIS_APERTURA)");
                                    out2.write(System.getProperty("line.separator"));
                                }          
                                                 
                                
                                //Evalua  si el lexema es un )
                                if( array.get(i).equals(")")){
                                    System.out.println(array.get(i)+"(PARENTESIS_CIERRE)"); 
                                    tokenparentesiscierre=1;
                                    out2.write(array.get(i)+" (PARENTESIS_CIERRE)");
                                    out2.write(System.getProperty("line.separator"));
                                }      
                                
                                //Evalua si el lexema es un fin de sentencia
                                if( array.get(i).equals(";")){
                                    System.out.println(array.get(i)+"(FIN_SENTENCIA)"); 
                                    tokenfinsentencia=1;
                                    out2.write(array.get(i)+" (FIN_SENTENCIA)");
                                    out2.write(System.getProperty("line.separator"));
                                }
                                
                                
                                /*Evalua si el lexema es un numero
                                  Se define expresión regular  
                                 */                          
                                
                                  Pattern expresionRegularNumero = Pattern.compile("[0-9]+");
                                  Matcher matchNumero = expresionRegularNumero.matcher((CharSequence) array.get(i));
                            
                                    if (matchNumero.matches()) {
                                    System.out.println(array.get(i)+"(NUMERO)"); 
                                    tokennumero=1;
                                    out2.write(array.get(i)+" (NUMERO)");
                                    out2.write(System.getProperty("line.separator"));
                                } 
                                
                                /*Evalua si el lexema es un color
                                  Se define expresión regular  
                                 */                          
                                
                                  Pattern expresionRegularColor = Pattern.compile("[#][0-9A-F][0-9A-F][0-9A-F][0-9A-F][0-9A-F][0-9A-F]");
                                  Matcher matchColor = expresionRegularColor.matcher((CharSequence) array.get(i));
                                    if (matchColor.matches()) {
                                    System.out.println(array.get(i)+"(COLOR)"); 
                                    tokencolor=1;
                                    out2.write(array.get(i)+" (COLOR)");
                                    out2.write(System.getProperty("line.separator"));
                                  }
                                
                                /*Evalua si el lexema es un identificador
                                  Se define expresión regular  
                                 */                          
                                
                                  Pattern expresionRegularId = Pattern.compile("[a-zA-Z]+");
                                  Matcher matchId = expresionRegularId.matcher((CharSequence) array.get(i));    
                                     
                                          
                                    if ( (matchId.matches()) && !(array.get(i).equals("create")) && !(array.get(i).equals("setcolor")) && !(array.get(i).equals("setbase")) && !(array.get(i).equals("setheight")) && !(array.get(i).equals("setradius")) && !(array.get(i).equals("setposition")) && !(array.get(i).equals("shape")) && !(array.get(i).equals("circle")) && !(array.get(i).equals("rectangle")) && !(array.get(i).equals("in")) && !(array.get(i).equals("+")) && !(array.get(i).equals("-")) && !(array.get(i).equals("*")) && !(array.get(i).equals("/")) && !(array.get(i).equals("(")) && !(array.get(i).equals(")"))  && !(array.get(i).equals(";")))  { 
                                    System.out.println(array.get(i)+"(ID)"); 
                                    tokenid=1;
                                    out2.write(array.get(i)+" (ID)");
                                    out2.write(System.getProperty("line.separator"));
                                }
                                    
                                    //El lexema no es válido para el lenguaja shape4learn
                                    else if ( !(matchId.matches()) &&   !(matchColor.matches()) && !(matchNumero.matches()) && !(array.get(i).equals("create")) && !(array.get(i).equals("setcolor")) && !(array.get(i).equals("setbase")) && !(array.get(i).equals("setheight")) && !(array.get(i).equals("setradius")) && !(array.get(i).equals("setposition")) && !(array.get(i).equals("shape")) && !(array.get(i).equals("circle")) && !(array.get(i).equals("rectangle")) && !(array.get(i).equals("in")) && !(array.get(i).equals("+")) && !(array.get(i).equals("-")) && !(array.get(i).equals("*")) && !(array.get(i).equals("/")) && !(array.get(i).equals("(")) && !(array.get(i).equals(")"))  && !(array.get(i).equals(";"))){
                                        System.out.println(array.get(i)+"(TOKEN_INVALIDO)"); 
                                    out2.write(array.get(i)+" (TOKEN_INVALIDO)");
                                    out2.write(System.getProperty("line.separator"));
                                    }
          
                    

                        }                                      
                                                                 
                                
                                
                                
                                          
                                        
                    out2.close();
                    }
                    catch (IOException e){                    
                    }
                                        
                    }
                    
                        
                System.out.println("Cantidad de tokens encontrados: "+(tokenmetodo+tokenforma+tokenin+tokenid+tokensuma+tokenresta+tokenproducto+tokendivision+tokenparentesisapertura+tokenparentesiscierre+tokennumero+tokencolor+tokenfinsentencia));  
                out.write("Cantidad de tokens encontrados: "+(tokenmetodo+tokenforma+tokenin+tokenid+tokensuma+tokenresta+tokenproducto+tokendivision+tokenparentesisapertura+tokenparentesiscierre+tokennumero+tokencolor+tokenfinsentencia));
                out.write(System.getProperty("line.separator"));
                out.write(System.getProperty("line.separator"));
                
                try{
                    FileInputStream fstream = new FileInputStream("intermedio.txt");
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
                
                File intermedio = new File ("intermedio.txt");
                intermedio.delete();
               
    }
       
}