/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author MEL
 */
public class funciones {
    private BufferedReader br;
    
   public void habilitar(String d1){
    String dir4=d1;
    File archivoo=new File(dir4);
    archivoo.delete();
   }
   public double[][][] rellenar(){
       double A[][][]= new double[20][15][2];
       
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                for(int k=0;k<A[i][j].length;k++){
                 A[i][j][k]=0.0;
            }}}
        
        return A;
   }
   
   public double[] rellena(double num[]){
          
        for(int i=0;i<num.length;i++){
             num[i]=0.0;
            }   
        return num;
   }
  
   
  //----------------------------------------------------------------------------------
  public void limpia1() {//elimina espacio y lee
    try{
    String dir1="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\t2.txt";
    String dir2="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\limpia1.txt ";
    habilitar(dir2);
    
    String cadena;
    
    FileReader fr=new FileReader(dir1);
    br=new BufferedReader(fr);
    File archivo=new File(dir2);
    
        try (FileWriter escribir = new FileWriter(archivo,true)) {
            escribir.write("\t\t      Filtro1\n");
            escribir.write("\t\t --------------\n");
                
                while((cadena=(br.readLine()).replaceAll("\\s", ""))!=null){
                    escribir.write("\n"+cadena);
                   }
        }    
   }
           
    catch(Exception e){
    }}
   
  public void limpia2() {
    try{
    String dir1="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\t2.txt";
    String dir2="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\limpia2.txt ";
    habilitar(dir2);
    
    String cadena,cad2;
   
    
    FileReader fr=new FileReader(dir1);
    br=new BufferedReader(fr);
    File archivo=new File(dir2);
    
        try (FileWriter escribir = new FileWriter(archivo,true)) {
            escribir.write("\t\t      Temperatura\n");
            escribir.write("\t\t ------------------- \n");
                
                while((cadena=(br.readLine()).replaceAll("\\s", ""))!=null){
                                
                int lon=cadena.length();
                if(cadena.endsWith("17")){
                escribir.write("\nFecha: "+cadena);
                escribir.write("\n------------------\n");

                }
                else{
                   cad2=cadena.substring(lon-22);
                   escribir.write("longitud::"+lon+"cadena (lon-22) "+cad2+"\n");
                   }
                }
                }
        }
           
    catch(Exception e){
   }}
    
  public void limpia3() {
    try{
    String dir1="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\t2.txt";
    String dir2="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\limpia3.txt ";
    habilitar(dir2);
    
    String cadena,cad2;
    
    FileReader fr=new FileReader(dir1);
    br=new BufferedReader(fr);
    File archivo=new File(dir2);
    
        try (FileWriter escribir = new FileWriter(archivo,true)) {
            escribir.write("\t\t      Temperatura\n");
            escribir.write("\t\t --------------------- \n");
                
                while((cadena=(br.readLine()).replaceAll("\\s", ""))!=null){
                                
                int lon=cadena.length();
                if(cadena.endsWith("17")){
                escribir.write("\nFecha: "+cadena);
                escribir.write("\n------------------\n");

                }
                else{
                   cad2=cadena.substring(lon-22);
                   if(cad2.startsWith("A") || cad2.startsWith("V")|| cad2.startsWith("C")  ){
                        escribir.write(cad2.substring(6,10)+"  "+cad2.substring(10,14)+"\n");} 
                    else{
                        escribir.write(cad2.substring(0,4)+"  "+cad2.substring(4,8)+"\n"); }
                }
                }
        }
        
   }
           
    catch(Exception e){
   }}
  
  public void limpia4() {
      try{
    String dir1="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\t2.txt";
    String dir2="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\limpia4.txt ";
    habilitar(dir2);
    
    String cadena,cad2;
    Double t1,t2,mayor,n1,n2,menor;
  

            
    FileReader fr=new FileReader(dir1);
    br=new BufferedReader(fr);
    File archivo=new File(dir2);
        
        try (FileWriter escribir = new FileWriter(archivo,true)) {
            escribir.write("\t\t      Temperatura\n");
            escribir.write("\t\t --------------------------- \n");
                 Double n3=0.0;
                 Double n4=100.0;
                 int cont2=1;
                   
                 while((cadena=(br.readLine()).replaceAll("\\s", ""))!=null){
                     int lon=cadena.length();
                     
                     if(cadena.endsWith("17")){
                        escribir.write("\nPERFIL DE TEMPERATURA ");
                        escribir.write("\n------------------"); 
                        escribir.write("\nFecha: "+cadena+"\n");

                                }
                     else{
                         cad2=cadena.substring(lon-22);
                         if(cad2.startsWith("A") || cad2.startsWith("V")|| cad2.startsWith("C")  ){
                             t1=Double.parseDouble(cad2.substring(6,10));
                             t2=Double.parseDouble(cad2.substring(10,14));       
                            } 
                         else{
                             t1=Double.parseDouble(cad2.substring(0,4));
                             t2=Double.parseDouble(cad2.substring(4,8));   
                              }
                         n1=t1;
                         n2=t2;
                      escribir.write("t1: "+n1+" t2: "+n2+" n3: "+n3+" n4: "+n4+" ->");
                         if((n1>n2)&&(n1>n3)){
                           mayor=n1;}
                         else{
                             if(n2>n3){
                                 mayor=n2;}
                             else
                                 mayor=n3;}
                         //menor
                         if((n1<n2)&&(n1<n4)){
                             menor=n1;       }
                         else{
                             if(n2<n4){
                                 menor=n2;}
                             else
                                 menor= n4;}
                    
                            n4=menor;
                            n3=mayor;
                             escribir.write("mayor= "+n3+" menor= "+n4+"\n");  
                           

                     }
                        
                     if(cont2%25==0){
                         escribir.write("Temperatura minima: "+n4+"\nTemperatura mayor: "+n3+"\n");
                         n3=0.0; n4=100.0;  
                         
                 }
                     
                     
                      cont2++;
                }    

                
        }
        
   }
           
    catch(Exception e){
  
    } 
                    
        
               
                
                   // n1=t1;
                    //n2=t2;
                     //System.out.print("t1: "+n1+" t2: "+n2+" n3: "+n3+" n4: "+n4+" ->");
                     //escribir.write("t1: "+n1+" t2: "+n2+" n3: "+n3+" n4: "+n4+" ->");
       //           n4=menor;
         //           n3=mayor;
        //}
          //        System.out.print("mayor= "+n3+" menor= "+n4+"\n");    
            //      escribir.write("mayor= "+n3+" menor= "+n4+"\n");    
                 
           
      
   
   
  
  } //---------------------------------------------------------
  
 public void limpia5() {
    try{
    String dir1="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\t2.txt";
    String dir2="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\limpia5.txt ";
    habilitar(dir2);
    
    String cadena,cad2;
    Double t1,t2,mayor,n1,n2,menor;
    double p[][][]=rellenar();
    double num[]=new double [48];
    ArrayList<Double> nuevo = new ArrayList<Double>();
  

            
    FileReader fr=new FileReader(dir1);
    br=new BufferedReader(fr);
    File archivo=new File(dir2);
        
        try (FileWriter escribir = new FileWriter(archivo,true)) {
            escribir.write("\t\t      Temperatura\n");
            escribir.write("\t\t --------------------------- \n");
                 Double n3=0.0;
                 Double n4=100.0;
                 int cont2=1;
                 int cont=0;  
                 while((cadena=(br.readLine()).replaceAll("\\s", ""))!=null){
                     int lon=cadena.length();
                     
                     if(cadena.endsWith("17")){
                        escribir.write("\n\nPERFIL DE TEMPERATURA ");
                        escribir.write("\n------------------"); 
                        escribir.write("\nFecha: "+cadena+"\n");
                         cont=0;
                            }
                     else{
                         cad2=cadena.substring(lon-22);
                         if(cad2.startsWith("A") || cad2.startsWith("V")|| cad2.startsWith("C")  ){
                             t1=Double.parseDouble(cad2.substring(6,10));
                             t2=Double.parseDouble(cad2.substring(10,14));       
                            } 
                         else{
                             t1=Double.parseDouble(cad2.substring(0,4));
                             t2=Double.parseDouble(cad2.substring(4,8));   
                              }
                         n1=t1;
                         n2=t2;
                         num[48-cont]=t2; 
                         num[cont-1]=t1;                 
                       
                         if((n1>n2)&&(n1>n3)){
                           mayor=n1;}
                         else{
                             if(n2>n3){
                                 mayor=n2;}
                             else
                                 mayor=n3;}
                         //menor
                         if((n1<n2)&&(n1<n4)){
                             menor=n1;       }
                         else{
                             if(n2<n4){
                                 menor=n2;}
                             else
                                 menor= n4;}
                    
                            n4=menor;
                            n3=mayor;
                          

                     }
                        
                     if(cont2%25==0){
                         escribir.write("\nTemp[]: "+Arrays.toString(num));
                         escribir.write("\nTemperatura minima: "+n4+"\nTemperatura mayor: "+n3+"\n");
                         
                         for(int j=0;j<48;j++){
                         if( num[j] >= n4 && num[j] <= n3 && num[j]%1==0.0) {
                             nuevo.add(num[j]);
                             escribir.write("\n a["+j+"]="+num[j]);
                                                      }
                         }
                        escribir.write("\n\nLista cae condicion:"+nuevo.toString());
                       Collections.sort(nuevo);
                        escribir.write("\nLista ordenada"+nuevo.toString());

              
                        //inicializar valores
                         n3=0.0; n4=100.0;  rellena(num);
                                         
                         
                 }
                    cont++; cont2++;
                }    

                
        }
        
   }
           
    catch(Exception e){
    
    }}
   
 public void limpia6() 
 {
    try{
    String dir1="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\t2.txt";
    String dir2="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\limpia6.txt ";
    habilitar(dir2);
    
    String cadena,cad2;
    int maxf;
    Double t1,t2,mayor,n1,n2,menor,fin;
    double p[][][]=rellenar();
    double num[]=new double [48];
    ArrayList<Double> nuevo = new ArrayList<Double>();
    ArrayList<Double> moda = new ArrayList<Double>(); 

            
    FileReader fr=new FileReader(dir1);
    br=new BufferedReader(fr);
    File archivo=new File(dir2);
        
        try (FileWriter escribir = new FileWriter(archivo,true)) {
            escribir.write("\t\t      Temperatura\n");
            escribir.write("\t\t --------------------------- \n");
                 Double n3=0.0;
                 Double n4=100.0;
                 int cont2=1;
                 int cont=0;  
                 while((cadena=(br.readLine()).replaceAll("\\s", ""))!=null){
                     int lon=cadena.length();
                     
                     if(cadena.endsWith("17")){
                        escribir.write("\n\nPERFIL DE TEMPERATURA ");
                        escribir.write("\n------------------"); 
                        escribir.write("\nFecha: "+cadena+"\n");
                         cont=0;
                            }
                     else{
                         cad2=cadena.substring(lon-22);
                         if(cad2.startsWith("A") || cad2.startsWith("V")|| cad2.startsWith("C")  ){
                             t1=Double.parseDouble(cad2.substring(6,10));
                             t2=Double.parseDouble(cad2.substring(10,14));       
                            } 
                         else{
                             t1=Double.parseDouble(cad2.substring(0,4));
                             t2=Double.parseDouble(cad2.substring(4,8));   
                              }
                         n1=t1;
                         n2=t2;
                         num[48-cont]=t2; 
                         num[cont-1]=t1;                 
                       
                         if((n1>n2)&&(n1>n3)){
                           mayor=n1;}
                         else{
                             if(n2>n3){
                                 mayor=n2;}
                             else
                                 mayor=n3;}
                         //menor
                         if((n1<n2)&&(n1<n4)){
                             menor=n1;       }
                         else{
                             if(n2<n4){
                                 menor=n2;}
                             else
                                 menor= n4;}
                    
                            n4=menor;
                            n3=mayor;
                          

                     }
                        
                     if(cont2%25==0){
                         
                         escribir.write("\nTemp[]: "+Arrays.toString(num));
                         escribir.write("\nTemperatura minima: "+n4+"\nTemperatura mayor: "+n3+"\n");
                         
                         for(int j=0;j<48;j++){
                         if( num[j] >= n4 && num[j] <= n3 && num[j]%1==0.0) {
                             nuevo.add(num[j]);
                              escribir.write("\n a["+j+"]="+num[j]); }}
                         escribir.write("\n\nLista cae condicion:"+nuevo.toString());
                         Collections.sort(nuevo);
                         escribir.write("\nLista ordenada"+nuevo.toString()+"\n");

                        //moda con condiciones
                        maxf = 0;
                        for(int i=0; i<nuevo.size(); i++){ 
                            int vecesRepite = 0; 
                             for(int j=0; j<nuevo.size(); j++){
                                if(nuevo.get(i).equals( nuevo.get(j)))
                                    vecesRepite++;
                                escribir.write(vecesRepite+"/ ");} 
                            escribir.write("\n");
                            if (vecesRepite >maxf) { 
                               moda.clear(); 
                               moda.add(nuevo.get(i)); 
                               maxf = vecesRepite;}  
                            else if (vecesRepite == maxf) { 
                                if (!moda.contains(nuevo.get(i))) { 
                                    moda.add(nuevo.get(i)); 
                                    maxf= vecesRepite;}}}
                        
                       if (moda.size() == nuevo.size()){
                            escribir.write("\nn1"+moda.toString());
                            escribir.write("\nn2"+nuevo.toString());
                             fin=nuevo.get((nuevo.size())-1);
                             escribir.write("\n\n->temperatura: "+fin);}
                        else {
                            //escribir.write("\nmaxfrecuencia"+moda.toString());
                            //escribir.write("\nn2"+nuevo.toString());
                             fin= moda.get((moda.size())-1);
                             escribir.write("\n\nFrecuencia" + moda + " con un total de " + maxf + " apariciones"); 
                             escribir.write("\n->temperatura:  " +fin );} 
                         //inicializar valores
                         n3=0.0; n4=100.0;  rellena(num); nuevo.clear();
                                         
                         
                 }
                cont++; cont2++;
                }    
        }
        
   }
           
    catch(Exception e){}}

 public void limpia7() {
    try{
    String dir1="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\t2.txt";
    String dir2="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\limpia7.txt ";
    habilitar(dir2);
    
    String cadena,cad2;
    int maxf;
    Double t1,t2,mayor,n1,n2,menor,fin;
    double p[][][]=rellenar();
    double num[]=new double [48];
    ArrayList<Double> nuevo = new ArrayList<Double>();
    ArrayList<Double> moda = new ArrayList<Double>(); 

            
    FileReader fr=new FileReader(dir1);
    br=new BufferedReader(fr);
    File archivo=new File(dir2);
        
        try (FileWriter escribir = new FileWriter(archivo,true)) {
            escribir.write("\t\t      Temperatura\n");
            escribir.write("\t\t --------------------------- \n");
                 Double n3=0.0;
                 Double n4=100.0;
                 int cont2=1;
                 int cont=0;  
                 while((cadena=(br.readLine()).replaceAll("\\s", ""))!=null){
                     int lon=cadena.length();
                     
                     if(cadena.endsWith("17")){
                        escribir.write("\n\nPERFIL DE TEMPERATURA ");
                        escribir.write("\n------------------"); 
                        escribir.write("\nFecha: "+cadena+"\n");
                         cont=0;
                            }
                     else{
                         cad2=cadena.substring(lon-22);
                         if(cad2.startsWith("A") || cad2.startsWith("V")|| cad2.startsWith("C")  ){
                             t1=Double.parseDouble(cad2.substring(6,10));
                             t2=Double.parseDouble(cad2.substring(10,14));       
                            } 
                         else{
                             t1=Double.parseDouble(cad2.substring(0,4));
                             t2=Double.parseDouble(cad2.substring(4,8));   
                              }
                         n1=t1;
                         n2=t2;
                         num[48-cont]=t2; 
                         num[cont-1]=t1;                 
                       
                         if((n1>n2)&&(n1>n3)){
                           mayor=n1;}
                         else{
                             if(n2>n3){
                                 mayor=n2;}
                             else
                                 mayor=n3;}
                         //menor
                         if((n1<n2)&&(n1<n4)){
                             menor=n1;       }
                         else{
                             if(n2<n4){
                                 menor=n2;}
                             else
                                 menor= n4;}
                    
                            n4=menor;
                            n3=mayor;
                          

                     }
                        
                     if(cont2%25==0){
                         
                         escribir.write("\nTemp[]: "+Arrays.toString(num));
                         escribir.write("\nTemperatura minima: "+n4+"\nTemperatura mayor: "+n3+"\n");
                         
                         for(int j=0;j<48;j++){
                         if( num[j] >= n4 && num[j] <= n3 && num[j]%1==0.0) {
                             nuevo.add(num[j]); }}
                          Collections.sort(nuevo);
                        

                        //moda con condiciones
                        maxf = 0;
                        for(int i=0; i<nuevo.size(); i++){ 
                            int vecesRepite = 0; 
                             for(int j=0; j<nuevo.size(); j++){
                                if(nuevo.get(i).equals( nuevo.get(j)))
                                    vecesRepite++;
                                
                             } 
                           // escribir.write("\n");
                            if (vecesRepite >maxf) { 
                               moda.clear(); 
                               moda.add(nuevo.get(i)); 
                               maxf = vecesRepite;}  
                            else if (vecesRepite == maxf) { 
                                if (!moda.contains(nuevo.get(i))) { 
                                    moda.add(nuevo.get(i)); 
                                    maxf= vecesRepite;}}}
                        
                       if (moda.size() == nuevo.size()){
                           fin=nuevo.get((nuevo.size())-1);
                             escribir.write("temperatura : "+fin);}
                        else {
                             fin= moda.get((moda.size())-1);
                             escribir.write("temperatura:  " +fin );} 
                         //inicializar valores
                         n3=0.0; n4=100.0;  rellena(num); nuevo.clear();
                                         
                         
                 }
                cont++; cont2++;
                }    
        }
        
   }
           
    catch(Exception e){}}

 
 
public void limpia9() {
    try{
    String dir1="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\t2.txt";
    String dir2="E:\\documentillos\\netbeans\\datosm_1\\src\\txt\\txtfinal.txt ";
    habilitar(dir2);
    
    String cadena,cad2;
    int repeticiones;
    Double t1,t2,mayor,n1,n2,menor,fin;
    Double ta=10.0;
    double p[][][]=rellenar();
    double num[]=new double [48];
    ArrayList<Double> nuevo = new ArrayList<Double>();
    ArrayList<Double> moda = new ArrayList<Double>(); 
    double matrizz[][]=new double[11][6];
    double matri[][]=new double[11][6];
    double calor[][]=new double[11][6];
                            

            
    FileReader fr=new FileReader(dir1);
    br=new BufferedReader(fr);
    File archivo=new File(dir2);
        
        try (FileWriter escribir = new FileWriter(archivo,true)) {
            escribir.write("\t\t      Perfil de Temperatura\n");
            escribir.write("\t\t --------------------------- ");
                 Double n3=0.0;
                 Double n4=100.0;
                 int cont2=1;
                 int cont=0;  
                 while((cadena=(br.readLine()).replaceAll("\\s", ""))!=null){
                     int lon=cadena.length();
                     
                     if(cadena.endsWith("17")){
                           escribir.write("\n\nFecha: "+cadena+"");
                           escribir.write("\n----------------------\n");
                         cont=0;
                            }
                     else{
                         cad2=cadena.substring(lon-22);
                         if(cad2.startsWith("A") || cad2.startsWith("V")|| cad2.startsWith("C")  ){
                             t1=Double.parseDouble(cad2.substring(6,10));
                             t2=Double.parseDouble(cad2.substring(10,14));       
                            } 
                         else{
                             t1=Double.parseDouble(cad2.substring(0,4));
                             t2=Double.parseDouble(cad2.substring(4,8));   
                              }
                         n1=t1;
                         n2=t2;
                         num[48-cont]=t2; 
                         num[cont-1]=t1;                 
                       
                         if((n1>n2)&&(n1>n3)){
                           mayor=n1;}
                         else{
                             if(n2>n3){
                                 mayor=n2;}
                             else
                                 mayor=n3;}
                         //menor
                         if((n1<n2)&&(n1<n4)){
                             menor=n1;       }
                         else{
                             if(n2<n4){
                                 menor=n2;}
                             else
                                 menor= n4;}
                    
                            n4=menor;
                            n3=mayor;
                     

                     }
                     //datos al finalizar bloque x fecha
                     if(cont2%25==0){
                        escribir.write("\nTemperatura dada: "+ta+"\nTemperatura minima: "+n4+"\nTemperatura mayor: "+n3+"\n");
                         for(int j=0;j<48;j++){
                         if( num[j] >= n4 && num[j] <= n3 && num[j]%1==0.0) {
                             nuevo.add(num[j]);}}
                                                  
                         Collections.sort(nuevo);
                         
                        //moda con condiciones
                        repeticiones = 0;
                        for(int i=0; i<nuevo.size(); i++){ 
                            int vecesRepite = 0; 
                            for(int j=0; j<nuevo.size(); j++){
                                if(nuevo.get(i).equals( nuevo.get(j))) 
                                    vecesRepite++;} 
                            if (vecesRepite > repeticiones) { 
                                moda.clear(); 
                                moda.add(nuevo.get(i)); 
                                repeticiones = vecesRepite;} 
                            else if (vecesRepite == repeticiones) { 
                                if (!moda.contains(nuevo.get(i))) { 
                                    moda.add(nuevo.get(i)); 
                                    repeticiones = vecesRepite;}} 
                            } 
                        if (moda.size() == nuevo.size()){
                             fin=nuevo.get((nuevo.size())-1);
                             escribir.write("Temperatura: "+fin+"\n");}
                        else {
                             fin= moda.get((moda.size())-1);
                             escribir.write("Temperatura:  " +fin+"\n" );} 
                        //----------------------------------------
                        
                       
                                              
                          //inicializa matriz
                          
                           for (int x=0; x < matrizz.length; x++) {
                               escribir.write("|");
                                for (int y=0; y < matrizz[x].length; y++) {
                                    if(x!=0 && x!=10 && y==0 )
                                    { matrizz[x][y]=n3;}
                                    else if (x!=0 && x!=10 && y==5)
                                        { matrizz[x][y]=fin;}
                                    else if(x==0 )
                                        { matrizz[x][y]=ta; }
                                    else if(x==10)
                                        { matrizz[x][y]=n4;}
                                    else
                                    {  matrizz[x][y]=0;  }
                                       
                                     escribir.write(Double.toString(matrizz[x][y]) );
                                     if (y!=matrizz[x].length-1)  escribir.write("\t");}
                                 escribir.write("|\n");
                                }
                           
                           //gauss-seidel
                           int x,y;
                           double error;
                           boolean flag = true;
                           while (flag ){
                                flag = false;
                                 for ( x=0; x < matrizz.length; x++) {
                                 for ( y=0; y < matrizz[x].length; y++) {
                                     matri[x][y]=matrizz[x][y];  }}
                                 
                                 for ( x=1; x < (matrizz.length)-1; x++) {
                                     for ( y=1; y < (matrizz[x].length)-1; y++) {
                                         matrizz[x][y]=((matri[x-1][y]+matri[x+1][y]+matri[x][y-1]+matri[x][y+1])/4.0);  
                                         error =Math.abs((matrizz[x][y]-matri[x][y])/matri[x][y]);
                                         if(error>0.0001)       flag=true; }}
                            }
                           escribir.write("\n \n");
                           
                           for ( x=0; x < matrizz.length; x++) {
                               escribir.write("|");
                                for ( y=0; y < matrizz[x].length; y++) {
                                    escribir.write(Double.toString(Math.round(matrizz[x][y]* 100) / 100d)+"°C");
                                     if (y!=matrizz[x].length-1) escribir.write("  ");}
                                escribir.write("|\n");}
                           
                           //perfil calor
                           double k=0.8;
                           double dx=1.;
                           double dy=1.;
                           double A=50;
                            for ( x=1; x < (matrizz.length)-1; x++) {
                               for ( y=1; y < (matrizz[x].length)-1; y++) {
                                    calor[x][y]=k*A*((matrizz[x][y+1]-matrizz[x][y])/dy)+k*A*((matrizz[x][y-1]-matrizz[x][y])/dy)+k*A*((matrizz[x-1][y]-matrizz[x][y])/dx)+k*A*((matrizz[x][y-1]-matrizz[x][y])/dx); }}
                           escribir.write("\n\n");
                           
                         // System.out.println("\t|\n \tv");
                           for ( x=0; x < matrizz.length; x++) {
                               escribir.write("|");
                                for (y=0; y < matrizz[x].length; y++) {
                                    
                                    escribir.write(Double.toString(Math.round(calor[x][y]* 100) / 100d));
                                     if (y!=matrizz[x].length-1) escribir.write("     ");
                                     }
                                escribir.write("|\n");
                                }
                        
            
                                     
                         
                        //inicializar valores
                         n3=0.0; n4=100.0;  rellena(num); nuevo.clear();
                                         
                         
                 }
                     
                      cont++; cont2++;
                }    

                
        }
        
   }
           
    catch(Exception e){
   // System.out.println("Error);
    }}
  
 public void ejemplo(){
                      
                          //inicializa matriz
                          double matrizz[][]=new double[11][6];
                            double matri[][]=new double[11][6];
                            double calor[][]=new double[11][6];
                            int niteracion=0;
                            
                           for (int x=0; x < matrizz.length; x++) {
                               System.out.print("|");
                                for (int y=0; y < matrizz[x].length; y++) {
                                    if(x!=0 && x!=10 && y==0 )
                                    { matrizz[x][y]=900;}
                                    else if (x!=0 && x!=10 && y==5)
                                        { matrizz[x][y]=600;}
                                    else if(x==0 )
                                        { matrizz[x][y]=100; }
                                    else if(x==10)
                                        { matrizz[x][y]=400;}
                                    else
                                    {  matrizz[x][y]=0;  }
                                       
                                    System.out.print (matrizz[x][y]);
                                     if (y!=matrizz[x].length-1) System.out.print("\t");}
                                System.out.println("|");
                                }
                           
                           //gauss-seidel
                           int x,y;
                           double error;
                           boolean flag = true;
                           while (flag ){
                                flag = false;
                                 for ( x=0; x < matrizz.length; x++) {
                                 for ( y=0; y < matrizz[x].length; y++) {
                                     matri[x][y]=matrizz[x][y];  }}
                                 
                                 for ( x=1; x < (matrizz.length)-1; x++) {
                                     for ( y=1; y < (matrizz[x].length)-1; y++) {
                                         matrizz[x][y]=((matri[x-1][y]+matri[x+1][y]+matri[x][y-1]+matri[x][y+1])/4.0);  
                                         error =Math.abs((matrizz[x][y]-matri[x][y])/matri[x][y]);
                                         if(error>0.0001)     flag=true;  }}
                                 niteracion++;
                              }
                           
                           System.out.println("-Tolerancia iteracion  "+niteracion+"\n");
                           //matriz perfil temperatura
                           for ( x=0; x < matrizz.length; x++) {
                               System.out.print("|");
                                for ( y=0; y < matrizz[x].length; y++) {
                                    System.out.print(Math.round(matrizz[x][y]* 100) / 100d+"°C");
                                     if (y!=matrizz[x].length-1) System.out.print("   ");}
                                System.out.println("|");}
                           
                           //perfil calor
                           
                           
                           double k=0.8;
                           double dx=1.;
                           double dy=1.;
                           double A=1.;
                            for ( x=1; x < (matrizz.length)-1; x++) {
                               for ( y=1; y < (matrizz[x].length)-1; y++) {
                                    calor[x][y]=k*A*((matrizz[x][y+1]-matrizz[x][y])/dy)+k*A*((matrizz[x][y-1]-matrizz[x][y])/dy)+k*A*((matrizz[x-1][y]-matrizz[x][y])/dx)+k*A*((matrizz[x][y-1]-matrizz[x][y])/dx); }}
                           System.out.print("\n\n");
                           
                         // System.out.println("\t|\n \tv");
                           for ( x=0; x < matrizz.length; x++) {
                               System.out.print("|");
                                for (y=0; y < matrizz[x].length; y++) {
                                    
                                    System.out.print(Math.round(calor[x][y]* 100) / 100d);
                                     if (y!=matrizz[x].length-1) System.out.print("     ");
                                     }
                                System.out.println("|");
                                }
                        
            } 
 
}
    

