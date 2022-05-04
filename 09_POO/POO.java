/**
 * @file Ejemplo.java
 * @version 1.0
 * @author yo
 * @date   18-marzo-2013
 * @url   http://www.codemonkeyjunior.blogspot.com
 * @description   Ejemplos
 */
 
 
 //172
public class Ejemplos{
  public static void main(String[] args) {
    Greeting hola=new Greeting();
    hola.greet();
    if(args.length!=0){hola.greet(args);}
  }
}

class Greeting{
  public Greeting(){
  }

  public void greet(){
    System.out.println("Hola desde "+new Greeting().getClass().getName());
  }

  public void greet(String ... cad){
    for(String c: cad){
      System.out.println("Hola "+c);
    }
  }
}


// 171 http://www.ibm.com/developerworks/ssa/library/j-5things2/
// http://www.journaldev.com/1330/java-collections-interview-questions-and-answers
//http://www.journaldev.com/716/java-enum-examples-with-benefits-and-class-usage
//http://java-buddy.blogspot.mx/2013/01/example-of-collectionsbinarysearch-in.html
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ejemplos{
     public static void main(String ... args){
Person ted = new Person("Ted", "Neward", 39,
            new Person("Michael", "Neward", 16),
            new Person("Matthew", "Neward", 10));

        // Iterate over the kids
        for (Person kid : ted)
        {
            System.out.println(kid.getFirstName());
        }
     }
}



class Person
    implements Iterable<Person>
{
    public Person(String fn, String ln, int a, Person... kids)
    {
        this.firstName = fn; this.lastName = ln; this.age = a;
        for (Person child : kids)
            children.add(child);
    }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public int getAge() { return this.age; }

    public Iterator<Person> iterator() { return children.iterator(); }

    public void setFirstName(String value) { this.firstName = value; }
    public void setLastName(String value) { this.lastName = value; }
    public void setAge(int value) { this.age = value; }

    public String toString() {
        return "[Person: " +
            "firstName=" + firstName + " " +
            "lastName=" + lastName + " " +
            "age=" + age + "]";
    }

    private String firstName;
    private String lastName;
    private int age;
    private List<Person> children = new ArrayList<Person>();
}


//170 http://www.programcreek.com/2013/03/hashmap-vs-treemap-vs-hashtable-vs-linkedhashmap/
import java.util.HashMap;
import java.util.Map.Entry;


public class Ejemplos{
    public static void main(String ... args){

        HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
        Dog d1 = new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");

        hashMap.put(d1, 10);
        hashMap.put(d2, 15);
        hashMap.put(d3, 5);
        hashMap.put(d4, 20);

        //print size
        System.out.println(hashMap.size());

        //loop HashMap
        for (Entry<Dog, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }
}


class Dog {
    String color;

    Dog(String c) {
        color = c;
    }
    public String toString(){
        return color + " dog";
    }
}


//169 http://java.dzone.com/articles/hashmap-vs-treemap-vs
import java.util.Comparator;
import java.util.TreeMap;

public class Ejemplos{
    public static void main(String[] args){
        TreeMap<String, String> hm = new TreeMap<String, String>(new MyComp());
        
        hm.put("java", "language");
        hm.put("computer", "machine");
        hm.put("india","country");
        hm.put("mango","fruit");
        System.out.println(hm);
    }
}

class MyComp implements Comparator<String>{

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }

}

//168 http://tutorialswithexamples.com/java-treemap-tutorial-and-examples/
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class Ejemplos {
//    public Ejemplos() {
//        super();
//    }

    public static void main(String[] args) {
        //create an instance of TreeMap to Store Phone Number
        Map  testTreeMap= new TreeMap();

        //Populate example map with values
        testTreeMap.put("Sam", 258963147);
        testTreeMap.put("John", 5874569);
        testTreeMap.put("Sunny", 58963147);
        testTreeMap.put("Linda", 523658);
        testTreeMap.put("Amit", 5333658);
        testTreeMap.put("Sheila", 4566878);
        testTreeMap.put("Lili", 852369);

        for(Map.Entry entry: testTreeMap.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " +
                               entry.getValue());
        }

        //headMap method usage
        SortedMap headMapElements = ((TreeMap) testTreeMap).headMap("Linda") ;
        System.out.println("Output of headMap method ");
        for(Map.Entry entry: headMapElements.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " +
                               entry.getValue());
        }

        //tailMap method usage
        SortedMap tailMapElements = ((TreeMap) testTreeMap).tailMap("Sheila") ;
        System.out.println("Output of tailMap method ");
        for(Map.Entry entry: tailMapElements.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " +entry.getValue());
        }

        //subMap method usage
        SortedMap subMapElements = ((TreeMap) testTreeMap).subMap("Amit","Sheila") ;
        System.out.println("output of subMap method ");
        for(Map.Entry entry : subMapElements.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " +
                               entry.getValue());
        }

    }
}


//167
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;


public class Ejemplos{
    public static void main(String[] args){
      TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
//      SortedMap<Integer, String> treemapincl = new TreeMap<Integer, String>();
      treemap.put(2, "two");
      treemap.put(1, "one");
      treemap.put(3, "three");
      treemap.put(6, "six");
      treemap.put(5, "five");

      System.out.println("Datos (ordenados) de la coleccion:");
      Collection coll=treemap.values();
      System.out.println("Valores: "+coll);
      
      Collection entrySet = treemap.entrySet();
      Iterator it = entrySet.iterator();
        System.out.println("TreeMap entries : ");
        while(it.hasNext()){
    System.out.println(it.next());}

    }
}

//166 
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class Ejemplos{
public static void main(String args[]){
// Definir un TreeMap
TreeMap agenda = new TreeMap();

// Agregar pares "clave"-"valor" al HashMap
agenda.put("Doctor", "(+52)-4000-5000");
agenda.put("Casa", "(888)-4500-3400");
agenda.put("Hermano", "(575)-2042-3233");
agenda.put("Tio", "(421)-1010-0020");
agenda.put("Suegros", "(334)-6105-4334");
agenda.put("Oficina", "(304)-5205-8454");
agenda.put("Abogado", "(756)-1205-3454");
agenda.put("Papa", "(55)-9555-3270");
agenda.put("Tienda", "(874)-2400-8600");

// Notese que el orden del TreeMap refleja un orden ascendente
// en sus elementos independientemente del orden de insercion.
// Debido al uso de String se refleja un orden alfabetico
mostrarMapa(agenda);

// Definir dos TreeMap nuevos
SortedMap agendaAO = agenda.subMap("A", "O");
SortedMap agendaPZ = agenda.tailMap("P");

System.out.println("---- Agenda A-O ----");
mostrarMapa(agendaAO);

System.out.println("---- Agenda P-Z ----");
mostrarMapa(agendaPZ);
}

public static void mostrarMapa(Map agenda) {
System.out.println(" Agenda con " + agenda.size() +
" telefonos");
for( Iterator it = agenda.keySet().iterator(); it.hasNext();) {
String clave = (String)it.next();
String valor = (String)agenda.get(clave);
System.out.println(clave + " : " + valor);
}
}
}




// 165 http://optimizarsinmas.blogspot.mx/2011/01/manejar-colecciones-ordenadas-treeset-y.html
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;


public class Ejemplos{

    public static void mostrarLista(Collection lista) {
System.out.println(" Lista del mercado con " + lista.size() +
" productos");
for( Iterator it = lista.iterator(); it.hasNext();) {
Producto producto = (Producto)it.next();
System.out.println(producto);
}
}

    public static void main(String[] args){
// Definir 5 instancias de la Clase Producto
Producto pan = new Producto("Pan", 6);
Producto leche = new Producto("Leche", 2);
Producto manzanas = new Producto("Manzanas", 5);
Producto brocoli = new Producto("Brocoli", 2);
Producto carne = new Producto("Carne", 2);
Producto res = new Producto("Carne", 3);

// Definir un TreeSet
TreeSet lista = new TreeSet();
lista.add(pan);
lista.add(leche);
lista.add(manzanas);
lista.add(brocoli);
lista.add(carne);
lista.add(res);

// Imprimir contenido de TreeSet
// Aunque se agregan 6 elementos, el TreeSet solo contiene 5
// TreeSet no permite elementos duplicados,
// TreeSet detecta que el elemento "Carne" esta duplicado
// Notese que el orden del TreeSet refleja un orden ascendente
mostrarLista(lista);

// No es posible eliminar elementos por indice
// Un TreeSet solo elimina por valor de Objeto
lista.remove(manzanas);
mostrarLista(lista);

// Eliminar todos los valores del TreeSet
lista.clear();
mostrarLista(lista);
    }
}


class Producto implements Comparable {

public String nombre;
public int cantidad;

public Producto(String s, int i) {
nombre = s;
cantidad = i;
}

    @Override
public String toString(){
return ("Nombre: "+nombre+" Cantidad: "+cantidad);
}

public int compareTo( Object objeto ) {
// Indica en base a que atributos se compara el objeto
// Devuelve +1 si this es > que objeto
// Devuelve -1 si this es < que objeto
// Devuelve 0 si son iguales

Producto producto = (Producto)objeto;
String nombreObjeto = producto.nombre.toLowerCase();
String nombreThis = this.nombre.toLowerCase();

return( nombreThis.compareTo( nombreObjeto ) );
}
}




//164 uso de linkedlist, list, y array
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejemplos{
    public static void main(String[] args)throws Exception{
        LinkedList<Persona> lista=new LinkedList<Persona>();
        Persona per1= new Persona(1,"Fer");
        Persona per2= new Persona(2,"Uriel");
        Persona per3= new Persona(3,"Horacio");
        Persona per4= new Persona(4,"Omar");

        lista.push(per1);
        lista.push(per2);
        lista.push(per3);
        lista.push(per4);
System.out.println("Lista ligada");
        for(int i=0;i<lista.size();i++){
            System.out.println("id: "+lista.get(i).getId()+"  - nombre: "+lista.get(i).getNombre());
        }
System.out.println("Lista");
        List<Persona> listaP= new ArrayList<Persona>(lista);
        for(Persona x: listaP){
            System.out.println(x.getId() + " - "+ x.getNombre());
        }
        
        Persona[] vectorP= new Persona[listaP.size()];
        //arreglo a lista
        //Object[] array = new Object[]{"12","23","34"};
        //java.util.List list = Arrays.asList(array);
        //lista a arreglo
        listaP.toArray(vectorP);
        System.out.println("Array");
        for(Persona x2: vectorP){
            System.out.println(x2.getId()+" - "+x2.getNombre());
        }
    }
}

class Persona{
    private int id;
    private String nombre;

    public Persona(){}
    public Persona(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
}


//163
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejemplos{
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);

        int num;
        int op;

        LinkedList lista = new LinkedList();
        do{
            System.out.println( "\t Menú \t" );
            System.out.println( "Operaciones con listas" );
            System.out.println( "1.- Insertar al principio" );
            System.out.println( "2.- Insertar al final" );
            System.out.println( "3.- Borrar al principio" );
            System.out.println( "4.- Borrar al final" );
            System.out.println( "5.- Mostrar la lista" );
            System.out.println( "6.- Borrar toda la lista" );
            System.out.println( "7.- Salir" );
            System.out.println( "\n" );
            System.out.println( "Elija la operación que desee" );

            op = leer.nextInt();

            switch(op){
                case 1:
                      System.out.println( "Inserte numero" );
                      num = leer.nextInt();
                      lista.addFirst(num);
                      break;
                case 2:
                      System.out.println( "Inserte numero" );
                      num = leer.nextInt();
                      lista.addLast(num);
                      break;
                case 3:
                      System.out.println( "Se borrara el primer nodo" );
                      lista.removeFirst();
                      break;
                case 4:
                      System.out.println( "Se borrara el nodo final" );
                      lista.removeLast();
                      break;
                case 5:
                      System.out.println( "La lista es la siguiente" );
                      List lista2 = new ArrayList(lista);
                      Iterator it = lista2.iterator();
                      while (it.hasNext()){
                           System.out.println(it.next()+"");
                       }
                       break;
                case 6:
                      System.out.println( "Se borraran todos los elementos de la lista" );
                      lista.clear();
                      break;
                case 7:
                      System.out.println( "Al rato" );
                      break;
                }
            }

        while( op != 7 );
    }
}




//162 uso de hashmap
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejemplos{

    public static void main(String[] args){
       HashMap<Integer,Persona> mapa=new HashMap<Integer,Persona>();
       Persona pers1=new Persona(1,"Fernando");
       Persona pers2=new Persona(2,"Oscar");
       Persona pers3=new Persona(3,"Javier");
       Persona pers4=new Persona(4,"Jaime");
       Persona pers5=new Persona(5,"Omar");

       mapa.put(1, pers1);
       mapa.put(2, pers2);
       mapa.put(3, pers3);
       mapa.put(4, pers4);
       mapa.put(5, pers5);

       Iterator it = mapa.entrySet().iterator();
       while (it.hasNext()) {
           Map.Entry e = (Map.Entry)it.next();
           Persona pers=(Persona) e.getValue();
           System.out.println("clave: "+pers.getId()+"  -nombre:"+pers.getNombre());  
       }
    }
}

class Persona{
    private Integer id;
    private String nombre;

    public Persona(){}
    public Persona(Integer _id, String _nombre){
      this.id=_id;
      this.nombre=_nombre;
    }

    public Integer getId(){
        return  id;
    }

    public String getNombre(){
        return nombre;
    }
}


//161 uso de itext http://tutorials.jenkov.com/java-itext/anchor.html
// http://gonzasilve.wordpress.com/2010/12/20/creacion-de-un-pdf-usando-la-libreria-itext/
//http://www.mikesdotnetting.com/Article/88/iTextSharp-Drawing-shapes-and-Graphics

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Image;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
//import java.awt.Color;
import java.io.File;
//import com.itextpdf.text.Rectangle;

public class Ejemplos{
    public static final String RESULT= "/home/fernando/Documentos/prueba.pdf";

    public static void main(String[] args) throws DocumentException, IOException {
        new Ejemplos().createPdf(RESULT);
        File f=new File("/home/fernando/Documentos/prueba.pdf");
        System.out.println(f.exists() ? "se ha creado: "+f.getAbsolutePath() : "no se creo");
    }

    public void createPdf(String filename)
    throws DocumentException, IOException {

        // Rectangle pagesize = new Rectangle(216f, 720f);
//        Image image = Image.getInstance("/home/fernando/Imágenes/Selección_004.png");
        // step 1
        Document document = new Document();
        //Document document = new Document(pagesize, 36f, 72f, 108f, 180f);
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();
        document.addTitle("Mi primer PDF");
        document.addSubject("Usando iText");
        document.addKeywords("Java, PDF, iText");
        document.addAuthor("fer");
        document.addCreator("fer");



        // step 4
        document.add(new Paragraph("Hoy es "+ new java.util.Date()));
        document.add(new Paragraph("EL OJO SAGRADO "));

        document.add(new Paragraph("Este es el segundo y tiene una fuente rara",
                FontFactory.getFont("arial",   // fuente
                22,                            // tamaño
                Font.ITALIC,                   // estilo
                BaseColor.RED)));

        document.add(new Paragraph("Este es el segundo y tiene una fuente rara",
                FontFactory.getFont("arial",   // fuente
                12,                            // tamaño
                Font.NORMAL,                   // estilo
                BaseColor.BLACK)));
//        PdfPCell cell2 = new PdfPCell(image, false);


        document.add(new Paragraph("\n\n\n\n"));

        PdfPTable mitablasimple=new PdfPTable(3);
//        mitablasimple.addCell(cell2);
        mitablasimple.addCell("Enero");
        mitablasimple.addCell("Febrero");
        mitablasimple.addCell("Marzo");
        mitablasimple.addCell("Abril");
        mitablasimple.addCell("Mayo");
        mitablasimple.addCell("Junio");
        mitablasimple.addCell("Julio");
        mitablasimple.addCell("Agosto");
        mitablasimple.addCell("Septiembre");
        mitablasimple.addCell("Octubre");
        document.add(mitablasimple);


        Paragraph paragraph = new Paragraph();
      paragraph.add(new Phrase("You can find the IText tutorial at "));


      Anchor anchor = new Anchor(
          "http://tutorials.jenkov.com/java-itext/index.html",
                FontFactory.getFont("arial",   // fuente
                11,                            // tamaño
                Font.NORMAL,                   // estilo
                BaseColor.BLUE));
      anchor.setReference(
          "http://tutorials.jenkov.com/java-itext/index.html");

      paragraph.add(anchor);
      document.add(paragraph);

        // step 5
        document.close();
    }

}


//160
public class Ejemplos{

    public static void main(String[] args) {
       String[] vector={"Fernando","Carraro","Aguirre"};
       String cad="";
       System.out.println("\nDe vector a cadena");
       for(String e: vector){
        cad+=e+" ";
       }

       System.out.printf("%s\n",cad);

       int tam=cad.length();
       String[] otra=new String[tam];
       for(int i=0;i<otra.length;i++){
        char car=cad.charAt(i);
        otra[i]=String.valueOf(car);
       }
       java.util.List<String> lista=new java.util.ArrayList<String>();
       System.out.println("\nDe cadena a vector");
       for(String x: otra){
        System.out.println(x);
        lista.add(x);
       }

       System.out.println("En lista: "+lista);
    }
}


//159

import java.util.Scanner;

public class Ejemplos{
    public static final int TAM=3;
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int [] matriz []= new int[TAM][TAM];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("valor: ["+i+","+j+"]: ");
                matriz[i][j]=teclado.nextInt();
            }
        }

        System.out.println("\n\tDatos:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("matriz["+i+","+j+"]="+matriz[i][j]);
            }
        }

    }
}


//158
import java.util.Scanner;

public class Ejemplos{

    static int introduceDato(){
        int dato=0;
        Scanner lee=new Scanner(System.in);
        try{
            dato=lee.nextInt();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return dato;
    }

    public static void main(String[] args) {
        int tam=0;
        do{
            System.out.println("Introduce tamanyo de la matriz:");
            tam=introduceDato();
        }while(tam==0);

        int[][] matriz=new int[tam][tam];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("Introduce dato: ["+i+" ,"+j+"] :");
                matriz[i][j]=introduceDato();
            }
        }

        System.out.println("\n\tDatos:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("\n\t"+"matriz["+i+","+j+"]="+matriz[i][j]);
            }
        }

        //tratar de cambiar de posición
        System.out.println("\n\tDatos:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("\n\t"+"matriz["+i+","+j+"]="+matriz[j][i]);
            }
        }

        int[] vector=new int [matriz.length];
        java.util.List<Integer> lista=new java.util.ArrayList<Integer>();
        System.out.println("\n\tDatos:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                vector[i]=matriz[i][j];
            }
        }

        java.util.Arrays.sort(vector);
        for(int e: vector){
            lista.add(e);
        }

        System.out.println(lista);

    }
}



//157

public class Ejemplos{
    
    public static void main(String[] args)throws Exception {

        if(args.length!=0){    
        Persona obrero=new Obrero(args[0],args[1],args[2],Integer.parseInt(args[3]), Double.parseDouble(args[4]),Integer.parseInt(args[4]));
        obrero.ver();
        }else{
            System.out.println("No hay argumentos:\n"+uso());
        }
    }

    static String uso(){
        return "java Ejemplos <nombre> <apellidoPaterno> <apellidoMaterno> <edad> <tasa> <horas>";
    }
}

interface Servicio{
    public abstract void ver();
}


abstract class Persona implements Servicio{
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected int edad;


    public abstract String obtenerDatos();
    public abstract double obtenerSalarioNeto();
    public abstract double obtenerSalarioBruto();

    public Persona(){}

    public Persona(String nombre,String apellidoPaterno,String apellidoMaterno, int edad){
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }

    public String getApellidoMaterno(){
        return apellidoMaterno;
    }

    public int getEdad(){
        return edad;
    }

}

class Obrero extends Persona{
    public double tasa;
    public int horas;


    public static final double VALOR1=1.5;
    public static final double VALOR2=0.9;

    public Obrero(){
    }

    public Obrero(String nombre,String apellidoPaterno,String apellidoMaterno,int edad,double tasa,int horas){
        super(nombre,apellidoPaterno,apellidoMaterno,edad);
        this.tasa=tasa;
        this.horas=horas;
    }

    @Override
    public double obtenerSalarioBruto(){
        double salarioB=0.0;
        int extras=0;
        if(horas<=38){
            extras=0;
        }else{
            extras=horas-38;
            horas=38;
        }
        salarioB=horas*tasa+extras*tasa*VALOR1;
        return salarioB;
    }

    @Override
    public double obtenerSalarioNeto(){
        double salarioN=0.0;
        if(obtenerSalarioBruto()<=300){
            salarioN=obtenerSalarioBruto();
        }else{
            salarioN=obtenerSalarioBruto()*VALOR2;
        }
        return salarioN;
    }

    @Override
    public void ver(){
        System.out.println(obtenerDatos());
    }

    @Override
    public String obtenerDatos(){
        return "Obrero(nombre: "+nombre+" , apellido paterno: "+apellidoPaterno+" , apellido materno: "+apellidoMaterno+" , edad: "+edad+" , tasa: "+tasa+" , horas: "+horas+" , salario bruto: "+obtenerSalarioBruto()+" , salario neto: "+obtenerSalarioNeto();
    }
}

 
 //156
public class Ejemplos{
    
    public static void main(String[] args) {
        Figura esfera=new Esfera(20);
        esfera.ver();
    }
}

interface Servicio{
    public abstract void ver();
}

abstract class Figura implements Servicio{
    private double radio;
    public abstract double volumen();

    public Figura(){}

    public Figura(double _radio){
        this.radio=_radio;
    }

    public double getRadio(){
        return this.radio;
    }
}

class Esfera extends Figura{
    double r;

    public Esfera(){}

    public Esfera(double _r){
        super(_r);
        r=_r;
    }

    @Override
    public double volumen(){
        return ((4/3) * Math.PI*(r*r*r));
    }

    @Override
    public void ver(){
        System.out.println(String.format("radio: %f , volumen esfera: %f",getRadio(),volumen()));
    }
}



//154
public class Ejemplos{
    public static void main(String[] args)throws Exception {
        int[] numeros= {3,6,54,21,0,2};
        Sumador numero=new Numero(numeros);
        numero.ver();
    }
}

interface Servicios{
    public abstract int sumatoria();
    public abstract String resultado();
}

abstract class Sumador implements Servicios{
    private String nombre;
    
    public Sumador(){
    }

    public abstract void ver();
}

class Numero extends Sumador{
    private int[] n;
    public Numero(int[] _n){
        this.n=_n;
    }

    public void setN(int[] _n){
        this.n=_n;
    }

    public int[] getN(){
        return n;
    }


    @Override
    public int sumatoria(){
        int suma=0;
        for(int e: n){
            suma+=e;
        }
        return suma;
    }
    @Override
    public String resultado(){
        return String.format("resultado %d",sumatoria());
    }
    @Override
    public void ver(){
        System.out.println(resultado());
    }
}

//153

import java.io.File;
import java.io.IOException;


public class Ejemplos{
    //public static final String DIRECTORIO="/home/user/algo";
    
    public static void main(String[] args) {
        if(args.length!=0){
        String DIRECTORIO=args[0];
        File directorio=new File(DIRECTORIO);
        if(directorio.exists()){
            System.out.println("Si existe\n\tContenido:");

            File[] archivos=directorio.listFiles();

            for(int i=0;i<archivos.length;i++){
                System.out.println(archivos[i].getName());
                if(archivos[i].isDirectory()){
                    System.out.println("[[ directorio: "+archivos[i].getName()+"]]");
                    recorreDirectorio(archivos[i].getAbsolutePath());
                }
            }



        }else{
            System.out.println("No existe directorio");
        }

    }//fin if
    else{
        System.out.println("introducir una ruta");
    }

    }// fin main

    public static void recorreDirectorio(String cad){
        File f=new File(cad);
        File[] archivos=f.listFiles();
        for(int i=0;i<archivos.length;i++){
            System.out.println(archivos[i].isDirectory() ? "directorio >>"+archivos[i].getName() : "archivo >>"+archivos[i].getName());
            if(archivos[i].isDirectory()){
                recorreDirectorio(archivos[i].getAbsolutePath());
            }
        }

    }

}


//152
 
import static java.lang.Math.random;


public class Ejemplos{
    public static final int TAM=3;
    public static void main(String[] args) {
     int[] entero [] =new int[TAM][TAM];
     for(int i=0;i<entero.length;i++){
        for(int j=0;j<entero.length;j++){
            entero[i][j]=(int)(random()*25)+10;
        }
     }
     
     for(int i=0;i<entero.length;i++){
        for(int j=0;j<entero.length;j++){
            System.out.println(entero[i][j]);
        }
     }


    }
}

//151

import java.io.Console;

public class Ejemplos{
    public static void main(String[] args) {
        Console con=System.console();
        String cad=null;
        do{
        con.printf("Introduce una cadena de texto:\n");
        cad=con.readLine();
        }while(cad.equals(""));

        int cont=0;
        char c='i';
        for(int i=0;i<cad.length();i++){
            if(cad.charAt(i)==c)
                cont++;
        }
        con.printf("no. de veces que aparece '%c' en la cadena: %d\n",c,cont);
    }
}


 //150

import java.io.IOException;
import java.io.File;
import java.util.Date;

public class Ejemplos{

    public static final String DIRECTORIO="C:\\Users\\Uriel\\Documents\\Programas\\Ejemplos";
    public static void main(String[] args)throws IOException {
        File directorio=new File(DIRECTORIO);
        if(directorio.exists()){
            System.out.println("existe el directorio: "+directorio.getAbsolutePath());
            File subDir=new File(directorio.getAbsolutePath());
            File[] archivos=subDir.listFiles();
            for(int i=0;i<archivos.length;i++){
                if(archivos[i].canRead() || archivos[i].canWrite() || archivos[i].canExecute()){
                    System.out.println("se tienen todos los permisos: "+archivos[i].getName());
                    if(new File(archivos[i].getName()).isFile()){
                        System.out.println("es archivo: "+archivos[i].getName()+"  ultima modificacion: "+new Date(archivos[i].lastModified()));
                    }
                    if(new File(archivos[i].getName()).isDirectory()){
                        System.out.println("es directorio: "+archivos[i].getName()+" ultima modificacion: "+new Date(archivos[i].lastModified()));
                    }

                    //ver solo archivos txt
                    if(archivos[i].getName().endsWith("txt")){
                        System.out.println("es archivo txt: "+archivos[i].getName()+" ultima modificacion: "+new Date(archivos[i].lastModified()));;
                    }

                }else{
                    System.out.println("no se tienen los  permisos necesarios: "+archivos[i].getName());
                }

            }//fin for
        }//fin if
    }//fin main

    

}

//149

import java.io.File;

public class Ejemplos{
    public static void main(String[] args) {
        String sFichero = "C:\\Users\\Uriel\\Documents\\Programas\\Ejemplos\\Ejemplos.java";
        File f = new File(sFichero);
        boolean real=f.isDirectory();
        System.out.println("es directorio? : "+real);
        if (f.exists()){
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }
    }
}


//148 http://www.mkyong.com/java/search-directories-recursively-for-file-in-java/

import java.io.File;
import java.util.ArrayList;
import java.util.List;
 
public class Ejemplos{
 
  private String fileNameToSearch;

  private List<String> result = new ArrayList<String>();
 
  public String getFileNameToSearch() {
    return fileNameToSearch;
  }
 
  public void setFileNameToSearch(String fileNameToSearch) {
    this.fileNameToSearch = fileNameToSearch;
  }
 
  public List<String> getResult() {
    return result;
  }
 
  public static void main(String[] args) {
 
    Ejemplos fileSearch = new Ejemplos();
 
    
    fileSearch.searchDirectory(new File("C:\\Users\\Uriel\\Documents\\Programas\\Ejemplos"), "archivo.java");
 
    int count = fileSearch.getResult().size();
    if(count ==0){
        System.out.println("\nNo encontrado");
    }else{
        System.out.println("\nEncontrados: " + count + " !\n");
        for (String matched : fileSearch.getResult()){
        System.out.println("Encontrados : " + matched);
        }
    }
  }
 
  public void searchDirectory(File directory, String fileNameToSearch) {
 
    setFileNameToSearch(fileNameToSearch);
 
    if (directory.isDirectory()) {
        search(directory);
    } else {
        System.out.println(directory.getAbsoluteFile() + "  no es un directorio");
    }
 
  }
 
  private void search(File file) {
 
    if (file.isDirectory()) {
      System.out.println("Buscando en ... " + file.getAbsoluteFile());
     
        if (file.canRead()) {
        for (File temp : file.listFiles()) {
            if (temp.isDirectory()) {
            search(temp);
            } else {
            if (getFileNameToSearch().equals(temp.getName().toLowerCase())) {           
                result.add(temp.getAbsoluteFile().toString());
            }
 
        }
        }
 
     } else {
        System.out.println(file.getAbsoluteFile() + "  no tienes permisos");
     }
      }
 
  }
 
}

 //147

public class Ejemplos{

    public Ejemplos(){}

    public static class Ejemplo{
        public Ejemplo(){}
        public void verNombre(Object c){
            System.out.println(c.getClass().getName());
        }
    }

    private static class Otro{
        public Otro(){}
        public String verNombre(Object c){
            return c.getClass().getName();
        }
    }


    public static void main(String[] args) {
       new  Ejemplo().verNombre(new Ejemplos());
      System.out.println(new Otro().verNombre(new Ejemplos()));

    }
}


//146

import java.io.File;
import java.io.IOException;
import static java.lang.System.out;

public class Ejemplos{
    public static final String DIRECTORIO="C:\\Users\\Uriel\\Documents\\Programas\\Ejemplos";
    
    public static void main(String[] args)throws IOException {
        File directorio=new File(DIRECTORIO);
        int cont=0;
        if(directorio.exists()){
            out.println("existe directorio");
            if(directorio.isDirectory()){
                out.println("estamos en: "+directorio.getAbsolutePath());
                File subDir=new File(directorio.getAbsolutePath());
                File[] archivos=subDir.listFiles();
                out.println("\tArchivos:");
                for(int i=0;i<archivos.length;i++){
                    out.println(archivos[i].getName());
                    cont++;
                }//fin for
            }//fin if
        }//fin if
        out.println("no. total: "+cont);
    }

}


//144

import java.io.Console;


public class Ejemplos{
    public static void main(String[] args) {
    Console consola=System.console();
    System.out.println("introduce un nombre: ");
    String nombre=consola.readLine();

    new Ejemplos().ver(nombre);

    }


    public void ver(String cad){
        if(!cad.equals("") || cad!=null){
            System.out.println("Hola "+cad);

        }
    }
}

//143

public class Ejemplos{
    public static void main(String[] args) {
        int[] vector;int cont=0;
        if(args.length!=0){
            vector=new int[args.length];
            for(String arg: args){
                vector[cont]=Integer.parseInt(arg);
                cont++;
            }
            java.util.Arrays.sort(vector);
            for(int v: vector){
                System.out.println(v);
            }  
        }
        System.exit(1);
    }
}




//142

public class Ejemplos{

    public static void main(String[] args)throws MiException {
        Servicio servicio=new ServicioImpl();
        if(args.length!=0){
            servicio.ver(args[0]);
        }else{
            throw new MiException("nada de parametros");
        }
    }
}


interface Servicio{
public abstract void ver(String c);
}

class ServicioImpl implements Servicio{

    public ServicioImpl(){}

    @Override
    public void ver(String c){
        if(c.equals("") || c==null){
            System.out.println("Cadena vacia");
        }else{
            c=c.concat(" bienvenido");
            System.out.println("Hola "+c);
        }
    }
}


class MiException extends Exception{
    public MiException(String msg){
        super(msg);
    }
}


//141

import java.io.File;
import java.io.IOException;

public class Ejemplos{

    public static void main(String[] args)throws IOException {
        File archivo=new File("Clase.txt");
        System.out.println(archivo.exists());
        archivo.createNewFile();
        System.out.println(archivo.exists());

    }
}



//140

public class Ejemplos{
    public static void main(String[] args) {
        Televisor televisor=new Televisor();
        televisor.ajustarVolumen("subir",24);
        televisor.ajustarVolumen("bajar",7);
        televisor.ajustarVolumen("subir",90);
    }
}

class Televisor{
    private int volumen;

    public Televisor(){
    }

    public void ajustarVolumen(String modo,int valor){
        if(modo.equals("subir")){
            volumen+=valor;
        }else{
            volumen-=valor;
        }

        System.out.println("volumen: "+volumen);
    }
}


//139

public class Ejemplos{
    public static void main(String[] args) {
        Maria maria=new Maria();
        Jose jose=new Jose();

        if(maria instanceof Maria){
            maria.estudiar();
        }

        if(jose instanceof Jose){
            jose.desayunar();
        }

        System.out.println("Clases: "+maria.getClass().getName()+"  y "+ jose.getClass().getName());

        if(maria.getClass().getName().equalsIgnoreCase("Maria")){
            maria.estudiar();
        }
        if(jose.getClass().getName().equalsIgnoreCase("Jose")){
            jose.desayunar();
        }
        
    }
}

class Maria{
    public void estudiar(){
        System.out.println("Maria estudia para su examen");
    }

    public Maria(){}
}

class Jose{
    public void desayunar(){
        System.out.println("Jose esta desayunando en este momento");
    }

    public Jose(){}
}



//138

import static java.lang.System.out;
import static java.lang.System.err;

public class Ejemplos{
    
    public static void main(String[] args) {
        int cont=0;
        java.util.List<String> lista=new java.util.ArrayList<String>();
        try{
            if(args.length==0){
                err.println("hay "+args.length+" parametros");
            }
            for(String arg: args){
                out.println("no. "+(cont++)+ "  -->"+arg);
                lista.add(arg);
            }
            out.println("lista: "+lista);
        }catch(Exception e){
            err.println("error: "+e+"  causa: "+e.getCause());
        }
    }

}


//137

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Ejemplos{
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int tam=0;
    int[] vectorA=null;
    int[] vectorB=null;
    List<Integer> listaC=new ArrayList<Integer>();
    System.out.println("tamanyo del vector: ");
    tam=in.nextInt();
    vectorA=new int[tam];
    vectorB=new int[tam];
    int valorA=0,valorB=0;

System.out.println("llenamos vector A");
    for(int i=0;i<vectorA.length;i++){
      System.out.println("valor no. "+(i+1)+" :");
      valorA=in.nextInt();
      vectorA[i]=valorA;
    }
    Arrays.sort(vectorA);
System.out.println("llenamos vector B");
    for(int j=0;j<vectorB.length;j++){
      System.out.println("valor no. "+(j+1)+" :");
      valorB=in.nextInt();
      vectorB[j]=valorB;
    }
    Arrays.sort(vectorB);
System.out.println("llenamos lista C");
    for(int a:vectorA){
        listaC.add(a);
    }
    for(int b:vectorB){
        listaC.add(b);
    }
       Collections.sort(listaC);
       System.out.println(listaC);    
    }
}


//136

import java.util.Scanner;

public class Ejemplos{
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int tam=0;
    int[] vectorA=null;
    int[] vectorB=null;
    int[] vectorC=null;
    System.out.println("tamanyo del vector: ");
    tam=in.nextInt();
    vectorA=new int[tam];
    vectorB=new int[tam];
    vectorC=new int[tam];
    int valorA=0,valorB=0;

System.out.println("llenamos vector A");
    for(int i=0;i<vectorA.length;i++){
      System.out.println("valor no. "+(i+1)+" :");
      valorA=in.nextInt();
      vectorA[i]=valorA;
    }
System.out.println("llenamos vector B");
    for(int j=0;j<vectorB.length;j++){
      System.out.println("valor no. "+(j+1)+" :");
      valorB=in.nextInt();
      vectorB[j]=valorB;
    }
System.out.println("llenamos vector C");
    for(int k=0;k<vectorA.length;k++){
        vectorC[k]=vectorA[k]+vectorB[k];
    }
System.out.println("mostramos vector C");
    for(int c:vectorC){
        System.out.println(c);
    }
           
    }
}


//135

import static java.lang.System.out;

public class Ejemplos{
    public static void main(String[] args) {
        int[] vector=new int[args.length];
        int cont=0;
        try{
            if(args.length==0 || args==null){
                out.print("debe haber parametros\njava <Ejemplos> <param1>...");
            }
            for(String arg:args){
                vector[cont]=Integer.parseInt(arg);
                cont++;
            }
            out.println("no. de elementos: "+cont);
            out.println(menor(vector));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static String menor(int[] v){
        String resultado="";
        int menor=v[0];
        try{
            for(int e:v){
                if(e<menor){
                    menor=e;
                }
            }
            resultado+="el menor es: "+menor;
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultado;
    }
}



//134

public class Ejemplos{
    public static void main(String[] args) {
        int[] vector=new int[args.length];
        try{
            for(int i=0;i<vector.length;i++){
                vector[i]=Integer.parseInt(args[i]);
            }

            System.out.println(Sumador.menor(vector));
            System.out.println(Sumador.mayor(vector));
            System.out.println(Sumador.sumatoria(vector));
        }catch(MiExcepcion e){
            System.err.println("Error: "+e.toString());
        }
    }
}

class Sumador{
    public static String menor(int[] vector)throws MiExcepcion{
        String resultado="";
        int menor=vector[0];
        if(vector.length==0){
            throw new MiExcepcion("el vector no debe ser null");
        }else{
            for(int i=0;i<vector.length;i++){
                if(vector[i]<menor){
                    menor=vector[i];
                }
            }
            resultado+=String.valueOf(menor);
        }
        return "el menor es: "+resultado;
    }

    public static String mayor(int[] vector)throws MiExcepcion{
        String resultado="";
        int mayor=vector[0];
        if(vector.length==0){
            throw new MiExcepcion("el vector no debe ser null");
        }else{
            for(int i=0;i<vector.length;i++){
                if(vector[i]>mayor){
                    mayor=vector[i];
                }
            }
            resultado+=String.valueOf(mayor);
        }
        return "el mayor es: "+resultado;
    }


    public static String sumatoria(int[] vector)throws MiExcepcion{
        String resultado="";
        int suma=0;
        if(vector.length==0){
            throw new MiExcepcion("el vector no debe ser null");
        }else{
            for(int i=0;i<vector.length;i++){
                suma+=vector[i];
            }
            resultado+=String.valueOf(suma);
        }
        return "la sumatoria es: "+resultado;
    }
}

class MiExcepcion extends Exception{    
    public MiExcepcion(String msg){
        super(msg);
    }
}

/*http://www.javazoom.net/jzservlets/uploadbean/uploadbean.html*/
//133

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

public class Ejemplos{
    public static void main(String[] args) {
     Soldado steve=new Soldado();
     Soldado john=new Soldado();

     RangoSoldado rango1, rango2;

     steve.setNombre("Steve Rogers");
     steve.setEdad(28);
     steve.setRango(RangoSoldado.CAPITAN);

     john.setNombre("John Walker");
     john.setEdad(30);
     john.setRango(RangoSoldado.TENIENTE);

     rango1=steve.getRango();
     rango2=john.getRango();

     out.println("Steve: "+rango1.getTitulo());
     out.println("John: "+rango2.getTitulo());

     List<Soldado> listaS=new ArrayList<Soldado>();
     listaS.add(steve);listaS.add(john);

     for(Soldado soldado: listaS){
        out.println("nombre: "+soldado.getNombre()+"  ,edad: "+soldado.getEdad()+"  ,rango: "+soldado.getRango());
     }




    }
}

class Soldado{
    public Soldado(){}

    public Soldado(String _nombre,int _edad, RangoSoldado _rango){
        nombre=_nombre;
        edad=_edad;
        rango=_rango;
    }

    private String nombre;
    private int edad;
    private RangoSoldado rango;


    public void setNombre(String _nombre){
        nombre=_nombre;
    }

    public void setEdad(int _edad){
        edad=_edad;
    }

    public void setRango(RangoSoldado _rango){
        rango=_rango;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public RangoSoldado getRango(){
        return rango;
    }
}

enum RangoSoldado{
    RASO("raso"),CABO("cabo"),TENIENTE("teniente"),CAPITAN("capitan");

  
    public  String titulo;

    RangoSoldado(String _titulo){
        titulo=_titulo;
    }

    RangoSoldado(){
    }

    public String getTitulo(){
        return titulo;
    }
}

//132

import static java.lang.System.out;


public class Ejemplos{
    
    public static void main(String[] args)throws MiExcepcion {
        out.println("sumatoria: "+Sumador.sumatoria(3,6,5,21,54));
        out.println("sumatoria: "+Sumador.sumatoria(9,21,65,0,111,20));
    }
}

class Sumador{
    public static int sumatoria(int ... e)throws MiExcepcion{
        int suma=0;
        if(e==null){
            throw new MiExcepcion("no hay valores");
        }else{
            for(int i: e)
                suma+=i;
        }

        return suma;
    }
}

class MiExcepcion extends Exception{    
    public MiExcepcion(String msg){
        super(msg);
    }
}



//131

import static java.lang.System.out;

public class Ejemplos{
    
    public static void main(String[] args)throws Exception {
        int[] vector= new int[args.length];
        for(int i=0;i<args.length;i++){
            vector[i]=Integer.parseInt(args[i]);
        }
        out.println("sumatoria: "+Ejemplos.sumatoria(vector));
    }

    public static int sumatoria(int[] vector)throws MiExcepcion{
        int resultado=0;
        if(vector.length==0){
            throw new MiExcepcion("el vector no debe estar vacio");
        }else{
            for(int i=0;i<vector.length;i++){
                resultado+=vector[i];
            }
        }
        return resultado;
    }
}

class MiExcepcion extends Exception{
    
    public MiExcepcion(String msg){
        super(msg);
    }
}
 

//130

public class Ejemplos{

    public static void main(String[] args) {
        for(char letra='a';letra<='z';System.out.println(letra++)){}
    }
}


//129 http://piotrga.wordpress.com/2008/05/07/how-to-unzip-archive-in-java/
public class ZipUtils {
    Logger log;

    public ZipUtils(Logger log) {
        this.log = log;        
    }

    public void unzipArchive(File archive, File outputDir) {
        try {
            ZipFile zipfile = new ZipFile(archive);
            for (Enumeration e = zipfile.entries(); e.hasMoreElements(); ) {
                ZipEntry entry = (ZipEntry) e.nextElement();
                unzipEntry(zipfile, entry, outputDir);
            }
        } catch (Exception e) {
            log.error("Error while extracting file " + archive, e);
        }
    }

    private void unzipEntry(ZipFile zipfile, ZipEntry entry, File outputDir) throws IOException {


        if (entry.isDirectory()) {
            createDir(new File(outputDir, entry.getName()));
            return;
        }
        
        File outputFile = new File(outputDir, entry.getName());
        if (!outputFile.getParentFile().exists()){
            createDir(outputFile.getParentFile());
        }

        log.debug("Extracting: " + entry);
        BufferedInputStream inputStream = new BufferedInputStream(zipfile.getInputStream(entry));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile));

        try {
            IOUtils.copy(inputStream, outputStream);
        } finally {
            outputStream.close();
            inputStream.close();
        }
    }

    private void createDir(File dir) {
        log.debug("Creating dir "+dir.getName());
        if(!dir.mkdirs()) throw new RuntimeException("Can not create dir "+dir);
    }
}
 
 //128
import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

public class Ejemplos{
    public static final int TAM=10;
    public static void main(String[] args) {
    List<Integer> lista=new ArrayList<Integer>();
    for(int i=0;i<TAM+1;i++){
        lista.add(i*2);
    }   
    out.println(lista);
    }
}

//127
import java.net.URL;
import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplos{
    
    public static void main(String[] args){
        URL url=null;
        try{
        url=new URL("http://www.google.com.mx/");
        out.println("nombre clase: "+url.getClass().getName().toString());
        out.println("contenido: "+url.getContent());
        out.println("autoridad: "+url.getAuthority());
        out.println("archivo: "+url.getFile());
        out.println("host: "+url.getHost());
        out.println("ruta: "+url.getPath());
        out.println("protocolo: "+url.getProtocol());
        out.println("puerto: "+url.getPort());
        out.println("consulta: "+url.getQuery());
        out.println("referencia: "+url.getRef());
        out.println("usuario: "+url.getUserInfo());
        out.println("URI: "+url.toURI());


        out.println("\tContenido:");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            out.println(inputLine);
        in.close();

       }catch(Exception ex){
        ex.printStackTrace();
       }
       finally{
        out.println("ha terminado...");
       }

    }
}




//126

import java.io.File;

public class Ejemplos{

public static void main(String ... args){
      
      //String DIRECTORIO="/home/fernando";
    String DIRECTORIO="C:\\Users\\Uriel\\Documents\\Programas\\Ejemplos";
    
      File archivo=new File(DIRECTORIO);
      try{
          File[] archivos=archivo.listFiles();
          for(int i=0;i<archivos.length;i++){
              if(archivos[i].getName().endsWith("xml")){
                 System.out.println(""+archivos[i].getName()+"  --> ruta: "+archivos[i].getParent());
              }

          }
      }catch(Exception ex)
      {
        System.err.println("error: "+ex+"  causa: "+ex.getCause());
      }

    }
}

 
 //125
import static java.lang.System.out;
import java.util.List;
import java.util.ArrayList;

public class Ejemplos{
    public static void main(String[] args) {
        int cont=0,numero=0;
        double suma=0.0,calf=0.0,promedio=0.0;
        java.util.Scanner t=new java.util.Scanner(System.in);
        List<Double> lista=new ArrayList<Double>();
        out.println("no. de materias: ");
        numero=t.nextInt();

        while(cont<numero){
            out.println("calf. no. "+(cont+1)+" : ");
            calf=t.nextDouble();
            lista.add(calf);
            suma+=calf;
            cont++;
        }
        out.println("calificaciones: "+lista);
        promedio=suma/cont;
        out.println("promedio obtenido: "+promedio);
    }
}


//124 autor: @OscarRyz

import static java.lang.System.out;
import java.util.Scanner;
class Equipo {
    private String nombre;
    private int juegosJugados;
    private int juegosGanados;
    private int juegosEmpatados;
    private int juegosPerdidos;
    private int golesFavor;
    private int golesEnContra;
    public int calcularPuntos() {
        return juegosJugados * 3 + juegosEmpatados;
    }
    public int calcularBono() {
        return calcularPuntos() * 100
        + golesFavor * 500
        - juegosPerdidos * 500
        + (juegosJugados % 2 == 0 ? 5000 : 0);
    }
    public String toString()  {
        return String.format("Nombre: %-20s, Bono: %-10d, Puntos: %-10d", nombre, calcularBono(), calcularPuntos());
    }
    public static Equipo creaEquipo( String nombre, int jj, int jg, int je, int jp, int gf, int ge ) {
        Equipo e          = new Equipo();
        e.nombre          = nombre;
        e.juegosJugados   = jj;
        e.juegosGanados   = jg;
        e.juegosEmpatados = je;
        e.juegosPerdidos  = jp;
        e.golesFavor      = gf;
        e.golesEnContra   = ge;
        return e;
    }
}
public class Ejemplos {

    private static Scanner in = new Scanner(System.in);
    
    public static void main( String ... args ) {
        int numeroEquipos = readInt("Escriba el numero de equipos: ");
        Equipo [] equipos = new Equipo[numeroEquipos];
        for ( int i = 0 ; i < numeroEquipos ; i++ ) {
            equipos[i] = Equipo.creaEquipo(
                readString("\n\nNombre del equipo: "), 
                readInt("Juego jugados: "), 
                readInt("Juego ganados: "), 
                readInt("Juego empatados: "), 
                readInt("Juego perdidos: "), 
                readInt("Goles a favor: "), 
                readInt("Goles en contra: "));
        }
        for ( Equipo e : equipos ) {
            out.println( e );
        }
    }
    private static String readString( String message ) {
        out.print( message );
        return in.next();
    } 
    private static int readInt(String message) {
        out.print(message);
        return in.nextInt();
    }
}

 //123
import static java.lang.System.out;

public class Ejemplos{
    public static void main(String[] args) {
    out.println("Fernando".length());
    out.println("Fernando".replace('o','a'));
    out.println("Fernando".indexOf("d"));
    out.println("Fernando".equalsIgnoreCase("Ariel"));
    out.println("Fernando".charAt(3));
    out.println("Fernando".substring(0,4));
    out.println("Fernando".toLowerCase());
    out.println("Fernando".toUpperCase());
    }
}

//122

public class Ejemplos{
    
    public static void main(String[] args)throws Exception {

        java.util.HashMap<Integer,String> mapa=new java.util.HashMap<Integer,String>();
        mapa.put(0,"En un horizonte lejano");
        mapa.put(1,"El gato de Florestan vive muy feliz");
        mapa.put(2,"En un valle oscuro simpre habra un rayo de luz y esperanza");

        java.util.Iterator iter = mapa.entrySet().iterator();
 
            while (iter.hasNext()) {
                java.util.Map.Entry mEntry = (java.util.Map.Entry) iter.next();
                System.out.println(mEntry.getKey() + " : " + mEntry.getValue());
            }

        
        
    }
}


//121

public class Ejemplos{
    public static void main(String[] args) {
        java.util.List<String> lista= new java.util.ArrayList<String>();
lista.add("Maria");
lista.add("Horacio");
lista.add("Ernesto");
System.out.println(lista); 
  for(String e: lista){ System.out.println(e);
}
}
    
}


//120

import static java.lang.System.out;

public class Ejemplos{

    public static void main(String[] args) {
        String lenguaje="Java";

        switch (lenguaje) {
            case "Java" :
            out.println("Te gusta usar muchas librerias");
            break;
            case "Ruby" :
            out.println("Te gusta lo sencillo");
            break;
            case "PHP" :
            out.println("Te gusta lo facil");
            break;
        }
    }
}



//119

public class Ejemplos{
    public static void main(String[] args) {
        int cont=0;
        if(args.length!=0){
            for(String arg: args){
                System.out.println("argumento: "+arg+"  no. "+cont);
                cont++;
            }
        System.out.println("no. de parametros: "+cont);
        }else{
            System.out.println("nada que evaluar");
        }
    }
}

 //118

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Ejemplos{
    public static void main(String[] args) {
        String acumulador="";
        for(int i=1;i<=10;i++){
            System.out.println("Tabla de multiplicar del: "+i);
            for(int j=1;j<=10;j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
                acumulador+="\n"+String.valueOf(i)+" x "+String.valueOf(j)+" = "+String.valueOf((i*j))+"\n";
            }
        }

        try{
        System.out.println("Datos:\n");
        System.out.println(acumulador);
        FileWriter fstream = new FileWriter("archivo.txt", true);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write("\n"+acumulador+"\n");
        out.close();
    }catch(Exception ex){ex.printStackTrace(System.err);}

    try{
        Runtime.getRuntime().exec ("cmd /c start notepad archivo.txt");
    }catch(Exception ioex){
        ioex.printStackTrace(System.err);
    }

    }
}

//117 de arreglo a lista y viceversa

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Ejemplos{
    public static void main(String[] args) {
        String[] str={"Adela","Camila","Horacio","Uriel"};
        List<String> lista=Arrays.asList(str);
        System.out.println("lista: "+lista);

        String[] nuevo=lista.toArray(new String[lista.size()]);
        for(String e: lista){
            System.out.println(e);
        }

    }
}


//116  de List<Object> a String[]

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

public class Ejemplos{
    public List<Object> lista;

    public List<Object> getLista(){
        lista=new ArrayList<Object>();
        lista.add("Fernando");
        lista.add(new Date());
        lista.add(123);
        lista.add(0.32);
        return lista;
    }
    public static void main(String[] args) {
        String[]str=new String[new Ejemplos().getLista().size()];
        try{
        for(int i=0;i<new Ejemplos().getLista().size();i++){
            Object obj=(Object) new Ejemplos().getLista().get(i);
            str[i]=String.valueOf(obj);
        }

        out.println("Datos: ");
       for(String e: str){
        out.println(e);
       }

        
    }catch(Exception ex){
        out.println("error: "+ex+"  causa:"+ex.getCause());
    }
    }
}



//115

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

public class Ejemplos{

    private List<Object> lista;

    public Ejemplos(){}

    public void getTipo(Object obj){
        if(obj instanceof Ejemplos){
            out.println(" es de tipo: Ejemplos");
        }else if(obj instanceof java.util.Date){
            out.println(" es de tipo: Date");
        }else if(obj instanceof String){
            out.println(" es de tipo: String");
        }else if(obj instanceof Integer){
            out.println(" es de tipo: Integer");
        }else if(obj instanceof Boolean){
            out.println(" es de tipo: Boolean");
        }else{
            out.println(" es de tipo: "+obj.getClass());
        }

    }

    public List<Object> getLista(){
        lista=new ArrayList<Object>();
        lista.add(new java.util.Date());
        lista.add("Fernando");
        lista.add('e');
        lista.add(0.777);
        lista.add(19);
        lista.add(new Ejemplos());
        return lista;
    }
    
    public static void main(String[] args) {
        for(Object obj: new Ejemplos().getLista()){
            out.println(obj+" ");
            new Ejemplos().getTipo(obj);
        }
    }
}


//114

import java.util.Scanner;

public class Ejemplos{
    
    public static final int MAX=3;

    public static void main(String[] args) {
        String[] res=new String[MAX];
        Scanner t=new Scanner(System.in);
    for(int i=0;i<=res.length-1;i++){
      System.out.println("Dato: "+(i+1));
      res[i]=t.nextLine();
    }
    System.out.println("Datos:");
    for(String e: res){
        System.out.println(e);
    }

    

    }
}


//113

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ejemplos {
        
        public static void main(String[] args) {
                Connection connection = null;
                ResultSet resultSet = null;
                Statement statement = null;
                try {
                        Class.forName("org.firebirdsql.jdbc.FBDriver");
                        connection = DriverManager.getConnection("jdbc:firebirdsql://localhost:3050/C:/Firebird/Firebird_2_1/examples/empbuild/EMPLOYEEDB.fdb","sysdba", "masterkey");
                        statement = connection.createStatement();
                        resultSet = statement
                                        .executeQuery("SELECT EMPNAME FROM EMPLOYEEDETAILS");
                        while (resultSet.next()) {
                                System.out.println("EMPLOYEE NAME:"
                                                + resultSet.getString("EMPNAME"));
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                } finally {
                        try {
                                resultSet.close();
                                statement.close();
                                connection.close();
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                }
        }
}


//112

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

public class Ejemplos{

    public static void main(String args[]) throws UnknownHostException, IOException {
        InetAddress inAdd;
        for (int i = 100; i < 115; i++) {
            inAdd = InetAddress.getByName("192.168.0." + i);
            if (inAdd.isReachable(1500)) {
                System.out.println("IP: " + inAdd.getHostAddress());
                System.out.println("HOST: " + inAdd.getHostName());
                System.out.println();
            }
        }

        InetAddress ip;
    
 
        ip = InetAddress.getLocalHost();
        System.out.println("Current IP address : " + ip.getHostAddress());
        System.out.println("HOST: " + ip.getHostName());
    }
}

 
 //111
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Ejemplos{

    private List<Persona> listaPersonas;

    public Ejemplos(){
    }

    public List<Persona> getListaPersonas(){
        listaPersonas=new ArrayList<Persona>();
        listaPersonas.add(new Persona("Fernando",31));
        listaPersonas.add(new Persona("Daniel",30));
        listaPersonas.add(new Persona("Camila",2));
        return listaPersonas;
    }

    public static void main(String[] args) {
      Ejemplos eje=new Ejemplos();
      List<Persona> lista= eje.getListaPersonas();

      for(Persona p: lista){
        System.out.println("nombre: "+p.getNombre()+"  ,edad: "+p.getEdad());
      }
}

}
class Persona{
    private String nombre;
    private int edad;

    public Persona(){}

    public Persona(String n,int d){
        this.nombre=n;
        this.edad=d;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
}

 
 //110

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ejemplos {
    public static void main(String[] args) {

        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;

        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            connection = DriverManager
                    .getConnection(
                            "jdbc:firebirdsql://localhost:3050/C:/FirebirdDB/EMPLOYEEDB.fdb",
                            "sysdba", "masterkey");
            statement = connection.createStatement();
            resultSet = statement
                    .executeQuery("SELECT EMPNAME FROM EMPLOYEEDETAILS");
            while (resultSet.next()) {
                System.out.println("EMPLOYEE NAME:"
                        + resultSet.getString("EMPNAME"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


//109
public class Ejemplos{

    public static void main(String[] args) {
        int $maxprimes=100;  
            int $value=1;  
            int $count=0;  
              
            long $start = System.currentTimeMillis();  
            System.out.println("Imprimiendo los primeros " + $maxprimes + " +numeros que son primos... \n");  
            while ($count < $maxprimes)   
            {  
               $value++;  
               int $composite=0;//false  
               OUTER:   
                  for (int $i=2; $i < $value; $i++)   
                  {  
                     INNER:  
                        for (int $j=$i; $j<$value; $j++)   
                        {  
                           if (($j*$i) == $value)   
                           {  
                              $composite=1;//true  
                              break OUTER;  
                           }  
                        }  
                  }  
                  if ($composite == 1)   
                  {  
                     $count++;  
                     System.out.println($value + " es primo\n");  
                  }  
            }  
            long $time = (System.currentTimeMillis() - $start) / 1000;
  
            System.out.println("tiempo transcurrido  " + $time + "  en segundos");  
    }
}

//108
public class Ejemplos{
    public static void main(String[] args) {
        long epoca=System.currentTimeMillis()/1000;
        System.out.println(String.valueOf(epoca));
    }
}

//107 código tomado de http://foro.elhacker.net/java/java_diccionario_online_01-t383017.0.html;new;boardseen#new
import java.util.Scanner;
import java.net.*;
import java.io.*;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Ejemplos {
 
    public static void main(String[] args) throws Exception {
 
        String code;
 
        String palabra;
 
        Scanner host = new Scanner(System.in);
        System.out.println("\n\n-- == Diccionario Online 0.1 == --\n\n");
        System.out.println("[+] Palabra : ");
        palabra = host.nextLine();
 
        code = toma("http://es.thefreedictionary.com/" + palabra);
 
        Pattern uno = null;
        Matcher dos = null;
 
        uno = Pattern.compile("<div class=runseg><b>1 </b>&nbsp; (.*?)[.:<]");
        dos = uno.matcher(code);
 
        if (dos.find()) {
            System.out.println("\n" + dos.group(1));
        } else {
            System.out.println("\n[-] No se encontro el significado");
        }
 
        System.out.println("\n\n-- == Coded By Doddy H == --\n\n");
 
    }
 
    private static String toma(String urla) throws Exception {
 
        String re;
 
        StringBuffer conte = new StringBuffer(40);
 
        URL url = new URL(urla);
        URLConnection hc = url.openConnection();
        hc.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; nl; rv:1.8.1.12) Gecko/20080201Firefox/2.0.0.12");
 
        BufferedReader nave = new BufferedReader(
                new InputStreamReader(hc.getInputStream()));
 
        while ((re = nave.readLine()) != null) {
            conte.append(re);
        }
 
        nave.close();
 
        return conte.toString();
    }
}

//106

public class Ejemplos{

    public static void main(String[] args) {
        String cad="";
        java.util.Scanner t=new java.util.Scanner(System.in);
        do{
        System.out.println("Introduce nombre: ");
        cad=t.nextLine();
        }while(cad.equals(""));
        cad=cad.toLowerCase();
        String acumulador="";
        int cont=0;
        for(int i=0;i<cad.length();i++){
            char c=cad.charAt(i);
            String str=String.valueOf(c);
            if(str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u")){
                cont++;
                acumulador+=","+str;
            }
        }
        System.out.println("no. de vocales: "+cont+" vocales obtenidas: "+acumulador);
    }

}


//105

public class Ejemplos{
    public static void main(String[] args) {
        Futbol fut1=new Futbol("Atletico San Tomas",3,7,1,12,10,4,"Alfonso Quiroz");
        Futbol fut2=new Futbol("Deportivo Cataluña",12,8,4,4,13,8,"Mario Alcantara");
        Futbol fut3=new Futbol("Club Deportivo XG",5,4,6,1,10,6,"Tomas Gomora");
        Futbol fut4=new Futbol("Deportivo Corintia",5,6,4,8,6,8,"Juan Uribe");

        Nodo n1=new Nodo(fut1);
        Nodo n2=new Nodo(fut2);
        Nodo n3=new Nodo(fut3);
        Nodo n4=new Nodo(fut4);

        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        n3.setSiguiente(n4);

        Nodo aux=n1;
        for(int i=0;i<4;i++){
            Futbol aux2=(Futbol)aux.getContiene();
            System.out.println("Nombre del equipo: "+aux2.getNombreEquipo()+", Goles goleador: "+aux2.getGolesGoleador());
            aux=(Nodo)aux.getSiguiente();
        }
    }
}

class Nodo{
    private Nodo siguiente;
    private Object contiene;

    Nodo(){}
    Nodo(Nodo n){
        this.siguiente=n;
        this.contiene=null;
    }


    Nodo(Object obj){
        this.contiene=obj;
        this.siguiente=null;
    }

    Nodo(Nodo n,Object obj){
        this.contiene=obj;
        this.siguiente=n;
    }


    public void setSiguiente(Nodo n){
        this.siguiente=n;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setContiene(Object obj){
        this.contiene=obj;
    }

    public Object getContiene(){
        return contiene;
    }


}


class Futbol{
    private String nombreEquipo;
    private int victorias;
    private int derrotas;
    private int empates;
    private int golesAFavor;
    private int golesEnContra;
    private int golesGoleador;
    private String nombreGoleador;

    Futbol(){}

    Futbol(String nombreEquipo,int victorias,int derrotas,int empates,int golesAFavor,int golesEnContra,int golesGoleador,String nombreGoleador){
        this.nombreEquipo=nombreEquipo;
        this.victorias=victorias;
        this.derrotas=derrotas;
        this.empates=empates;
        this.golesAFavor=golesAFavor;
        this.golesEnContra=golesEnContra;
        this.golesGoleador=golesGoleador;
        this.nombreGoleador=nombreGoleador;
    }

    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo=nombreEquipo;
    }

    public String getNombreEquipo(){
        return nombreEquipo;
    }

    

    public void setVictorias(int victorias){
        this.victorias=victorias;
    }

    public int getVictorias(){
        return victorias;
    }

    public void setDerrotas(){
        this.derrotas=derrotas;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public void setEmpates(int empates){
        this.empates=empates;
    }

    public int getEmpates(){
        return derrotas;
    }
        
    public void setGolesAFavor(){
        this.golesAFavor=golesAFavor;
    }

    public int getGolesAFavor(){
        return golesAFavor;
    }

    public void setGolesEnContra(){
        this.golesEnContra=golesEnContra;
    }

    public int getGolesEnContra(){
        return golesAFavor;
    }
        
    
    public void setGolesGoleador(int golesGoleador){
        this.golesGoleador=golesGoleador;
    }

    public int getGolesGoleador(){
        return golesGoleador;
    }

    public void setNombreGoleador(String nombreGoleador){
       this.nombreGoleador=nombreGoleador; 
    }

    public String getNombreGoleador(){
        return nombreGoleador;
    }
        
       
}

//104

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.Date;

public class Ejemplos{
    
    public static void main(String[] args){
     //defino un vector anónimo de tipo Object
    Object[] objetoVector={"Esta es una cadena",9,new Ejemplos(),'e',6.44,new Date()};

    //mostrar el contenido del vector
    String acumulador="";
    for(Object obj:objetoVector){
        acumulador+="\n\t"+String.valueOf(obj);
    }
    JOptionPane.showMessageDialog(null,acumulador,"Contenido del vector",JOptionPane.PLAIN_MESSAGE,new ImageIcon("im.jpg"));

    //ahora tratar de convertir ese vector a una matriz
    //defino una matriz de tipo Object
    int tam=objetoVector.length;
    Object[][] objetoMatriz=new Object[tam][tam];
    String acumulador2="";
    for(int i=0;i<objetoMatriz.length;i++){
        for(int j=0;j<objetoMatriz.length;j++){
            objetoMatriz[i][j]=objetoVector[i];
            //System.out.println("-"+objetoMatriz[i][j]);
             acumulador2+="\n"+String.valueOf(objetoMatriz[i][j]);
        }
    }
    System.out.println("\nContenido de la matriz: "+acumulador2);
    //JOptionPane.showMessageDialog(null,acumulador2,"Contenido de la matriz",JOptionPane.PLAIN_MESSAGE,new ImageIcon("im.jpg"));

    Object[] otro=new Object[objetoMatriz.length];
    String acumulador3="";
    for(int i=0;i<otro.length;i++){
        for(int j=0;j<otro.length;j++){
            otro[i]=objetoMatriz[i][j];
            acumulador3+="\n"+String.valueOf(otro[i]);
        }
    }
    System.out.println("\nContenido del nuevo vector: "+acumulador3);


    }
}


//103

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class Ejemplos{


    public static void main(String[] args) { 
    String nombre=null;
    String apellido=null;

    try{
    do{
        nombre=JOptionPane.showInputDialog("Tu primer nombre");
    } while(nombre.equals(""));

    do{
        apellido=JOptionPane.showInputDialog("Tu primer apellido");
    }while(apellido.equals(""));
    

    int tamNombre=nombre.length();
    int tamApellido=apellido.length();

    String acumulador1="";

    //para el nombre
    for(int i=0;i<tamNombre;i++){
        char c1=nombre.charAt(i);
        String aux1=String.valueOf(c1);
        if(aux1.equals("a") || aux1.equals("j") || aux1.equals("s")){
            acumulador1+="1";
        }else if(aux1.equals("b") || aux1.equals("k") || aux1.equals("t")){
            acumulador1+="2";
        }
        else if(aux1.equals("c") || aux1.equals("l") || aux1.equals("u")){
            acumulador1+="3";
        }else if(aux1.equals("d") || aux1.equals("m") || aux1.equals("v")){
            acumulador1+="4";
        }else if(aux1.equals("e") || aux1.equals("n") || aux1.equals("w")){
            acumulador1+="5";
        }else if(aux1.equals("f") || aux1.equals("o") || aux1.equals("x")){
            acumulador1+="6";
        }else if(aux1.equals("g") || aux1.equals("p") || aux1.equals("y")){
            acumulador1+="7";
        }else if(aux1.equals("h") || aux1.equals("q") || aux1.equals("z")){
            acumulador1+="8";
        }else if(aux1.equals("i") || aux1.equals("r")){
            acumulador1+="9";
        }else{
            System.out.println("");
        }
    }

    //System.out.println("acumulador 1:"+acumulador1);

    String acumulador2="";
    //para el apellido
    for(int j=0;j<tamApellido;j++){
        char c2=apellido.charAt(j);
        String aux2=String.valueOf(c2);
        if(aux2.equals("a") || aux2.equals("j") || aux2.equals("s")){
            acumulador2+="1";
        }else if(aux2.equals("b") || aux2.equals("k") || aux2.equals("t")){
            acumulador2+="2";
        }
        else if(aux2.equals("c") || aux2.equals("l") || aux2.equals("u")){
            acumulador2+="3";
        }else if(aux2.equals("d") || aux2.equals("m") || aux2.equals("v")){
            acumulador2+="4";
        }else if(aux2.equals("e") || aux2.equals("n") || aux2.equals("w")){
            acumulador2+="5";
        }else if(aux2.equals("f") || aux2.equals("o") || aux2.equals("x")){
            acumulador2+="6";
        }else if(aux2.equals("g") || aux2.equals("p") || aux2.equals("y")){
            acumulador2+="7";
        }else if(aux2.equals("h") || aux2.equals("q") || aux2.equals("z")){
            acumulador2+="8";
        }else if(aux2.equals("i") || aux2.equals("r")){
            acumulador2+="9";
        }else{
            System.out.println("");
        }
    }

    //System.out.println("acumulador 2:"+acumulador2);

    int tamAcumulador1=acumulador1.length();
    int tamAcumulador2=acumulador2.length();
    //System.out.println("acumulador(size) 1: "+tamAcumulador1+" -- acumulador(size) 2: "+tamAcumulador2);

    //para el nombre
    int sumaNombre=0;
    for(int i=0;i<tamAcumulador1;i++){
        char c3=acumulador1.charAt(i);
        sumaNombre+=Integer.parseInt(String.valueOf(c3));
    }

    //para el apellido
    int sumaApellido=0;
    for(int j=0;j<tamAcumulador2;j++){
        char c4=acumulador2.charAt(j);
        sumaApellido+=Integer.parseInt(String.valueOf(c4));
    }

    int sumaNomApellido=sumaNombre+sumaApellido;

    //System.out.println("suma nombre: "+sumaNombre+" -- suma apellido: "+sumaApellido+"\nsuma (nombre y apellido):"+sumaNomApellido);

    
    int sumaParcial=0;
    String fin=String.valueOf(sumaNomApellido);
    for(int j=0;j<fin.length();j++){
        char c5=fin.charAt(j);
        sumaParcial+=Integer.parseInt(String.valueOf(c5));
    }

    //System.out.println("suma: "+sumaParcial);
    
    int sumafinal=0;
    String fin2=String.valueOf(sumaParcial);
    for(int j=0;j<fin2.length();j++){
        char c6=fin2.charAt(j);
        sumafinal+=Integer.parseInt(String.valueOf(c6));
    }




JOptionPane.showMessageDialog(null,"\t\nNombre: "+nombre.toUpperCase()+"\n\tApellido: "+apellido.toUpperCase()+"\n\tNo. del destino: "+String.valueOf(sumafinal),"Aviso del sistema",JOptionPane.PLAIN_MESSAGE,new ImageIcon("ferd.jpg"));
      System.exit(0);
}
catch(Exception ex){
JOptionPane.showMessageDialog(null,"\t\nCausa del error: "+ex.toString(),"Ha ocurrido un error",JOptionPane.ERROR_MESSAGE,new ImageIcon("SRN.png"));

}

    }
}


//102 https://www.youtube.com/watch?v=yJzbMOyK41A


public class Ejemplos{
    public static void main(String[] args) {
        Persona pers1=new Persona("Fernando",31);
        Persona pers2=new Persona("Anuihm",39);
        Persona pers3=new Persona("Camm",45);
        Persona pers4=new Persona("Yhlemh",65);

        Nodo n1=new Nodo(pers1);
        Nodo n2=new Nodo(pers2);
        Nodo n3=new Nodo(pers3);
        Nodo n4=new Nodo(pers4);

        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        n3.setSiguiente(n4);

        Nodo aux=n1;
        for(int i=0;i<4;i++){
            Persona aux2=(Persona)aux.getContiene();
            System.out.println("Nombre: "+aux2.getNombre()+", edad: "+aux2.getEdad());
            aux=(Nodo)aux.getSiguiente();
        }

    }
}

class Nodo{
    private Nodo siguiente;
    private Object contiene;

    Nodo(){}
    Nodo(Nodo n){
        this.siguiente=n;
        this.contiene=null;
    }


    Nodo(Object obj){
        this.contiene=obj;
        this.siguiente=null;
    }

    Nodo(Nodo n,Object obj){
        this.contiene=obj;
        this.siguiente=n;
    }


    public void setSiguiente(Nodo n){
        this.siguiente=n;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setContiene(Object obj){
        this.contiene=obj;
    }

    public Object getContiene(){
        return contiene;
    }


}

class Persona{
    private String nombre;
    private int edad;

    Persona(){}

    Persona(String n,int e){
        this.nombre=n;
        this.edad=e;
    }

    public void setNombre(String n){
        this.nombre=n;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int e){
        this.edad=e;
    }

    public int getEdad(){
        return edad;
    }

} 

//101
/*
import static java.lang.System.out;

public class Ejemplos{

    public static void main(String[] args) {
        Interna interna=null;
        String nombre=null;
        try{
            out.println("Introduce tu nombre: ");
            interna=new Interna();
            nombre=interna.getCadena();
            out.println("hola: "+nombre);
        }catch(Exception ex){
            System.err.println("error: "+ex+"  causa: "+ex.getCause());
        }
    }

    static class Interna{
        
        Interna(){}

        public String getCadena(){
            java.util.Scanner teclado=new java.util.Scanner(System.in);
            String cad=null;
            try{
                cad=teclado.nextLine();
            }catch(Exception ex){
                ex.printStackTrace(System.err);
            }
            return cad;
        }


    }

}

*/


//100
/*
public class Ejemplos{
    
    public static void main(String[] args)throws Exception {
        Interna interna=null;
        Externa externa=null;

        if(interna==null && externa==null){
            interna=new Interna("Fernando");
            externa=new Externa("Ariel");

            interna.verNombre();
            externa.verNombre();

        }else{
            System.out.println("no deberia verse");
        }

    }


    static class Interna{
        private String nombre;

        Interna(){}
        Interna(String n){
            this.nombre=n;
        }

        public String getNombre(){
            return nombre;
        }

        public void verNombre(){
            System.out.println("Hola "+getNombre());
        }

    }


}

class Externa{
private String nombre;

Externa(){}

Externa(String n){
    this.nombre=n;
}

public String getNombre(){
    return nombre;
}

public void verNombre(){
    System.out.println("Hola "+getNombre());
}

}
*/


//99
/*
public class Ejemplos{

    public static void main(String[] args) {
        Medallas medalla=null;
        java.util.Scanner teclado=new java.util.Scanner(System.in);
        int valor=0;
        String cad=null;

    try{
        
        do{
        System.out.println("Valor: ");
        valor=teclado.nextInt();
        }while(valor<=0);

        switch(valor){
             case 5: 
             medalla=Medallas.BRONCE;
             cad="BRONCE";
             break;
             case 15: 
             medalla=Medallas.PLATA;
             cad="PLATA";
             break;
             case 30: 
             medalla=Medallas.ORO;
             cad="ORO";
             break;
            default: 
            cad="... lo sentimos no hay medalla";
            break;
        }

        System.out.println("medalla de:  "+cad);

        //for(Medallas m:Medallas.values()){
          //  System.out.println(m);
       //} 

    }catch(Exception ex){
        System.err.println(ex+" ...causa: "+ex.getCause());
    }    
  }

  
}


enum Medallas{
    BRONCE(5),PLATA(15),ORO(30);

    Medallas(int p){
        this.peso=p;
    }

    public void setPeso(int p){
       this.peso=p;   
    }

    public int getPeso(){
        return peso;
    }

    private int peso;

}

*/

//98

public class Ejemplos{
    private Numero numero;
    
    public Ejemplos(){
    }

    Ejemplos(Numero num){
        this.numero=num;
    }
    
    public void setNumero(Numero num){
        this.numero=num;
    }   
    
    public Numero getNumero(){
        return numero;
    }   
        
    public static void main (String[] args)throws NumeroNull {
        Numero miNumero=null;
        if(miNumero==null){
            miNumero=new Numero();
            miNumero.setValor(23);
            System.out.println("numero: "+miNumero.getValor());
            Ejemplos ejemplo=new Ejemplos(new Numero(miNumero.getValor()));
            System.out.println("numero: "+ejemplo.getNumero().getValor());
            
            
        }else{
            throw new NumeroNull("ha ocurrido un error");
        }
   }
   

}

class Numero{
    private int valor;
    
    public Numero(){
    }
    
    public Numero(int _valor){
        this.valor=_valor;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int _valor){
        this.valor=_valor;
    }
    
}


class NumeroNull extends Exception{
    public NumeroNull(String msg){
        super(msg);
    }
}




//97
import java.util.Observable;
import java.util.Observer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejemplos2{
	
	public static void main (String[] args) {
	  new Console();
    }
}

 class Console extends JPanel{
    
    protected JTextField input;
    protected JTextArea output;
    public Data data;
    protected int fontSize;
 
    public Console(){
        super();
        initConsole();
    }
    
    public final void initConsole(){
        
        fontSize = 20;
        data = new Data();
        
        input = new JTextField();
        input.addKeyListener(new KeyList());
        input.setBackground(Color.DARK_GRAY);
        input.setForeground(Color.LIGHT_GRAY);
                
        output = new JTextArea();
        output.setEditable(false);
        output.setBackground(Color.DARK_GRAY);
        output.setForeground(Color.LIGHT_GRAY);
        updateFont();
        
        this.setLayout(new BorderLayout());
        
        this.add(output, BorderLayout.CENTER);
        this.add(input, BorderLayout.NORTH);
        
        this.setPreferredSize(new Dimension(820,640));
        
        clearConsole();
    }
    
    protected void updateFont(){
        output.setFont(new Font(Font.DIALOG, Font.PLAIN, fontSize));
        input.setFont(new Font(Font.DIALOG, Font.PLAIN, fontSize));
    }
   
    public void clearConsole(){
        data.setText("");
        data.setLastLine("");
    }
 
    
    protected class KeyList implements KeyListener{
 
        
        @Override
        public void keyTyped(KeyEvent e) {
            
        }
 
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                String text = input.getText();
                data.setLastLine(text);
                data.setText(text + "\n" +data.getText());
                output.setText(data.getText());
                input.setText("");
            }
            
            if(e.getKeyCode() == 107 && e.isControlDown()){  //+
                fontSize++;
                updateFont();
            }
            if(e.getKeyCode() == 109 && e.isControlDown()){  //-
                fontSize--;
                updateFont();
            }
            if(e.getKeyCode() == 27 ){  //Esc
                System.exit(0);
            }
 
        }
 
        @Override
        public void keyReleased(KeyEvent e) {
            
        }
 
 
    
    }
}



class ConsoleExecuter implements Observer{
    Console console;
    
    public ConsoleExecuter(Console console){
        this.console = console; 
        this.console.data.addObserver(this);
    }
 
    @Override
    public void update(Observable o, Object arg) {
        String command = console.data.getLastLine();
        System.out.println(command);
        boolean exec = executeConsoleCommand(command);
        if (!exec){
            executeGeneralCommand(command);
        }
    }
    protected boolean executeConsoleCommand(String command){
        boolean exec = false;
        switch (command.trim()){
            case "clr": console.clearConsole();
                      exec = true;
                      break;
        }
        
        
        return exec;
    }
    
    public void executeGeneralCommand(String command){
        
    }
}

 class Data extends Observable
    {
        private String text;
        private String lastLine;
 
        public String getText(){
            return text;
        }
        public String getLastLine(){
            return lastLine;
        }
 
        protected void setText(String text){
            this.text = text;
        }
        protected void setLastLine(String text){
            this.lastLine = text;
            this.setChanged();
            this.notifyObservers();
        }
    }


//96
import static java.lang.System.out;

public class Ejemplos2{
	
	public static void main (String[] args) {
	String[] palabras={"En una colina muy lejana","un gato de color azul marron","mi bebe come mucho arroz"};
	String busca="mi";
	for(String p: palabras){
		System.out.println("cadena: "+p+"  palabra a buscar 'mi' ,existe?:  "+existe(p,busca));
	}
	
		
}
    static boolean existe(String texto,String compara){
    	if(texto.indexOf(compara)!=-1){
    		return true;
    	}else{
    		return false;
    	}
    }
    
     

//95
public class Ejemplos2{
	public static void main (String[] args) {
		Object[] objetos={new java.util.Date(),"Una simpe cadena",21,'A',0.21,new Ejemplo2().getClass().getName(),new Ejemplo2()};
		
		for(int i=0;i<objetos.length;i++){
  		if(objetos[i] instanceof String){
  			System.out.println(objetos[i]+": de tipo String");	
  		}else if(objetos[i] instanceof Double){
  			System.out.println(objetos[i]+": de tipo Double");	
  		}
  		else if(objetos[i] instanceof Integer){
  			System.out.println(objetos[i]+": de tipo Integer");	
  		}
  		else if(objetos[i] instanceof Ejemplo2){
  			System.out.println(objetos[i]+": de tipo Ejemplo2");	
  		}
  		else if(objetos[i] instanceof Character){
  			System.out.println(objetos[i]+": de tipo Character");	
  		}
  		else if(objetos[i] instanceof java.util.Date){
  			System.out.println(objetos[i]+": de tipo Date");	
  		}
  		else{
  			System.out.println("");	
  		}
	}			
  		
  }
  
}


//94
/*
import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

public class Ejemplos2{

  public static void main(String[] args){
     
     for(TipoUsuarios t: TipoUsuarios.values()){
     	switch(t.getUsuario()){
     		case "invitado":
     			out.println("invitado");break;
     			
     	    case "registrado":
     			out.println("registrado");break;
     			usuario.setTipoUsuario(t);
     			
     		case "administrador":
     			out.println("administrador");break;
     		    usuario.setTipoUsuario(t);
     				
     	    default:
     	    	out.println("nunguna de las anteriores");
     	    	break;
     	}
     	
     	
     }	
   }
}

enum TipoUsuarios{
	INVITADO("invitado"),REGISTRADO("registrado"),ADMIN("administrador");
	
	
	TipoUsuarios(String _usuario){
		this.usuario=_usuario;
	}
	
	public String getUsuario(){
		return usuario;
	}
	
	private String usuario;
	
}

class Usuario{
	private TipoUsuarios tipoUsuario;
	
	public void setTipoUsuario(TipoUsuarios t){
		this.tipoUsuario=t;
	}
	
	public TipoUsuarios getTipoUsuario(){
		return tipoUsuario;
	}
	
	public Usuario(){
	}
	
	public Usuario(TipoUsuarios _tipoUsuario){
		this.tipoUsuario=_tipoUsuario;
	}
	
	
}

*/



//93
import static java.lang.System.out;

public class Ejemplos2{

    public static void main(String ... args)throws Exception{
       for(TipoUsuarios t: TipoUsuarios.values()){
       	out.println(t);       	
       }

  }

}

enum TipoUsuarios{
	INVITADO("invitado"),REGISTRADO("registrado"),ADMIN("administrador");
	
	TipoUsuarios(String _usuario){
		this.usuario=_usuario;
	}
	
	private String usuario;
	
	public String getUsuario(){
		return usuario;
	}
}

//92
import static  java.lang.System.out;

public class Ejemplos2{
	
	public static void main (String[] args)throws FerException {
		Object[] objetos={"Una simple cadena",new java.util.Date(),'c',21.0,3,new Ejemplos2().getClass().getName()};
		if(objetos==null){
			throw new FerException("es un array de objetos nulo");
		}else{
			for(Object obj:objetos){
				out.println(obj);
			}
		}		
    }
		
}

class FerException extends Exception{
	FerException(String msg){
		super(msg);
	}
}

//91
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

 
public class Ejemplos2 {
    
    public static void main(String[] args) {
    	try{
Class.forName("com.mysql.jdbc.Driver");
Connection conecta=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda","root","root");
System.out.println("Conexión exitosa\n");
Statement sentencia= conecta.createStatement();
ResultSet registro=sentencia.executeQuery("select * from usuarios");
while(registro.next()){
System.out.println("\t\nId: "+registro.getInt("id"));
System.out.println("Nombre: "+registro.getString("nombre"));
System.out.println("Apellido paterno:"+registro.getString("apellido_p"));
System.out.println("Apellido materno:"+registro.getString("apellido_m"));
System.out.println("Telefono: "+registro.getString("telefono"));
System.out.println("Email: "+registro.getString("email"));
System.out.println("Direccion: "+registro.getString("direccion"));
System.out.println("Fecha: "+registro.getString("fecha"));
}
conecta.close();
System.out.println("\nConexión cerrada");
}catch(Exception ex){
ex.printStackTrace();
}
    }
}

//90
/*
import java.util.Map;
import java.util.*;


public class Ejemplos{

public static void main(String[] args) {
  
   System.out.println("\tPropiedades del sistema");

   long inicio=System.currentTimeMillis();

  for(Map.Entry<Object,Object> prop :System.getProperties().entrySet()){

     System.out.printf("%-30s : %50s%n", prop.getKey(), prop.getValue());

  } 

  long fin=System.currentTimeMillis();
  
  System.out.println("\ntiempo: "+ (fin-inicio)+" milisegundos");

}

}
*/

//89
/*
public class Ejemplos{
    public static void main(String[] args) {
        System.out.println("valor presente:"+new Economica(300.0,3.8,12).valorpresente());
        System.out.println("valor futuro: "+ new Economica(300.0,3.8,12).valorfuturo());
    }
}

class Economica{
    private double valor;
    private double interes;
    private int plazo;

    public Economica(){
    } 

    public Economica(double valor,double interes,int plazo){
        this.valor=valor;
        this.interes=interes;
        this.plazo=plazo;
    }

    public double valorfuturo(){
        return valor*Math.pow(1+interes/100,plazo);
    }

    public double valorpresente(){
        return valor/Math.pow(1+interes/100,plazo);
    }
}

*/


//88
/*
import java.awt.Desktop;
import java.io.File;

public class Ejemplos{
    
    public static void main(String[] args) {
        try{
        File arch = new File("C:\\Users\\Uriel\\Documents\\Programas\\Ejemplos\\archivo.txt"); 
        Desktop.getDesktop().open(arch); 
        }
        catch(Exception ex){
            ex.printStackTrace(System.err);
        }
    }

}
*/



//87
import static java.lang.System.out;
import java.lang.Runtime;
import java.io.*;

public class Ejemplo2{


  public static void main(String ... args)throws Exception{
   
    try {  

String [] cmd2 = {"sh","Shell0.sh"}; 


Process p = Runtime.getRuntime().exec(cmd2);  
BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));  
String line = null;  
      while ((line = in.readLine()) != null) {  
                out.println(line);  
      }  
    System.out.println(line.length()<=0 ? "vacio, no genero nada" : "parece que si funciono");
} 

catch (IOException e) {  
System.err.println("error: "+e.getCause());  
}  


    }
}


//86
public void EjecutarBash() {
	if (SO.ConsultarSO().indexOf("Linux") != -1) {
		try {
			String[] command = {"sh","-c","ls /dev/sd*"};
			Process process = Runtime.getRuntime().exec(command);
 
			InputStream is = process.getInputStream();
			byte[] buffer = new byte[1024];	
 
			for(int count = 0; (count = is.read(buffer)) >= 0;)
			{ System.out.write(buffer, 0, count); } // end for
		} catch (Exception e) {
			e.printStackTrace();
		} // end try
	} else {
		System.out.println("No es un sistema operativo basado en GNU/Linux");
	} // end if
} // end EjecutarBash
 
public static String ConsultarSO() {
	return System.getProperty("os.name");
} // end ConsultarSO


//85

import static java.lang.System.out;
import java.io.*;
import java.lang.Runtime;



public class Ejemplo{

  public static void main(String ... args){
  String s = null;

                try {

                        // Determinar en qué SO estamos
                        String so = System.getProperty("os.name");

                        String comando;

                        // Comando para Linux
                        if (so.equals("Linux"))
                                comando = "ifconfig";

                        // Comando para Windows
                        else
                                comando = "cmd /c ipconfig";

                        // Ejcutamos el comando
                        Process p = Runtime.getRuntime().exec(comando);

                        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

                        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

                        // Leemos la salida del comando
                        System.out.println("Ésta es la salida standard del comando:\n");
                        while ((s = stdInput.readLine()) != null) {
                                System.out.println(s);
                        }

                        // Leemos los errores si los hubiera
                        System.out.println("Ésta es la salida standard de error del comando (si la hay):\n");
                        while ((s = stdError.readLine()) != null) {
                                System.out.println(s);
                        }

                        System.exit(0);
                } catch (IOException e) {
                        System.out.println("Excepción: ");
                        e.printStackTrace();
                        System.exit(-1);
                }
  }
}




//84

import static java.lang.System.out;
import java.io.*;
import javax.script.*;


public class Ejemplo{

  public static void main(String ... args){
   try
        {
            ScriptEngine engine = 
                new ScriptEngineManager().getEngineByName("javascript");
                
            for (String arg : args)
            {
                Bindings bindings = new SimpleBindings();
                bindings.put("author", new Person("Ted", "Neward", 39));
                bindings.put("title", "5 Things You Didn't Know");
                
                FileReader fr = new FileReader(arg);
                if (engine instanceof Compilable)
                {
                    System.out.println("Compiling....");
                    Compilable compEngine = (Compilable)engine;
                    CompiledScript cs = compEngine.compile(fr);
                    cs.eval(bindings);
                }
                else
                    engine.eval(fr, bindings);
            }
        }
        catch(IOException ioEx)
        {
            ioEx.printStackTrace();
        }
        catch(ScriptException scrEx)
        {
            scrEx.printStackTrace();
        }
    
  }
}

class Person{

private String nombre;
     private String apellido;
     private int edad;

   public Person(String nombre,String apellido,int edad){
     nombre=nombre;
     apellido=apellido;
     edad=edad;
  }

   public String getNombre(){
  return nombre;
}
public String getApellido(){return apellido;}
public int getEdad(){return edad;}

}


//83
/*************************************************************************************************************/
//http://javalangnullpointer.wordpress.com/2007/03/14/ejecutar-shell-scripts-desde-java/
/**
* StramGobbler.java
*
* Para capturar la salida de la ejecucion del comando.
*
* @modified clase original de javaworld modificada por jdelgado
* @version 0.0.0.2 - 13 Marzo 2007
* @sinde JDK 1.5 - Eclipse 3.2
*/
package comun.util.unix;
import java.io.*;
class StreamGobbler extends Thread {
// Flujo de entrada
InputStream is;
// Tipo de Flujo: generalmente output o error
String type;
// Flujo de salida
OutputStream os;
// Variable para mostrar por la salida estandard
boolean debug = false;
// para guardar la salida generada
String output = "";
// ----
/**
* Constructor
*
* @param is
* InputStream
* @param type
* tipo de flujo (OUTPUT o ERROR)
* @param debug
* indica si se debe mostrar o no la salida por la salida
* estandard
*/
StreamGobbler(InputStream is, String type, boolean debug) {
this(is, type, null, debug);
}
// ----
/**
* Constructor
*
* @param is
* InputStram
* @param type
* tipo de flujo (OUTPUT o ERROR)
* @param redirect
* OutputStream donde redireccionar la salida
* @param debug
* indica si se debe mostrar o no la salida por la salida
* estandard
*/
StreamGobbler(InputStream is, String type, OutputStream redirect,
boolean debug) {
this.is = is;
this.type = type;
this.os = redirect;
this.debug = debug;
}
// ----
/**
* Ejecutar el hilo
*/
public void run() {
try {
PrintWriter pw = null;
if (os != null)
pw = new PrintWriter(os);
InputStreamReader isr = new InputStreamReader(is);
BufferedReader br = new BufferedReader(isr);
String line = null;
while ((line = br.readLine()) != null) {
// si hay fichero lo imprime a fichero
if (pw != null)
pw.println(line);
if (debug)
System.out.println(type + "> " + line);
output = output + line + "\r\n";
}
if (pw != null)
pw.flush();
} catch (IOException ioe) {
ioe.printStackTrace();
}
}
// ------
/**
* Recuperar el flujo de datos generado
*
* @return un String con el output
*/
public String getOutput() {
return output;
}
// ------
}
// end of class StreamGobbler.java


/**
* Script.java
*
* Clase para ejecutar scripts unix o SQL localmente
*
* @author jdelgado
* @version 0.0.0.1 - 13 Marzo 2007
* @since JDK 1.5 - Eclipse 3.2
*
*/
package comun.util.unix;
import java.io.File;
import java.io.FileOutputStream;
public class Script {
// contenido a ejecutar
private String content = null;
// interprete de comandos: Si usas Windows adaptalo para usar CMD
private String SHELL = "/bin/sh";
// resultado de la ejecucion
private String output = null;
// posibles errores en la ejecucion
private String error = null;
// imprimir o no traza en los threads
private Boolean verbose = false;
// path por defecto para ficheros temporales
private String RUTA = "/tmp";
// cabecera para shell scripts
private String SHELLHEADER = "#!/bin/sh";
// indica si hay que añadir el interprete a los shell scripts que se generen
private boolean addSHELLHEADER = false;
// caracter de retorno
private String RETORNO = "\n";
// ----
/**
* Constructor. crea una nueva instancia de la clase
*/
public Script() {
}
// ----
/**
* Constructor. crea una nueva instancia de la clase
*
* @param content
* contenido del script a ejecutar
*/
public Script(String content) {
this.content = content;
}
// ----
/**
* Ejecuta el script
*
* @throws Exception
* excepcion levantada en caso de error
*/
public String executeCommand() throws Exception {
output = null;
error = null;
StreamGobbler errorGobbler = null;
StreamGobbler outputGobbler = null;
try {
if (content == null)
throw new Exception("command is null");
// String ruta="/home/jose/Desktop/temporal.txt";
// FileOutputStream fos = new FileOutputStream(ruta);
Runtime rt = Runtime.getRuntime();
// Process proc = rt.exec(new String[]{"/bin/sh", "-c", "cd
// /home/jose/Desktop\n./SQLPLUS.sh\ncal\\nps -ef"});
String[] data = new String[3];
data[0] = this.SHELL;
data[1] = "-c";
data[2] = this.content;
Process proc = rt.exec(data);
// any error message?
errorGobbler = new StreamGobbler(proc.getErrorStream(), "ERROR",
this.verbose);
// any output?
outputGobbler = new StreamGobbler(proc.getInputStream(), "OUTPUT",
null, this.verbose);
// StreamGobbler(proc.getInputStream(), "OUTPUT", fos);
// kick them off
errorGobbler.start();
outputGobbler.start();
// any error???
int exitVal = proc.waitFor();
} catch (Throwable t) {
t.printStackTrace();
} finally {
String out = outputGobbler.getOutput();
this.output = out;
output = out;
out = errorGobbler.getOutput();
this.error = out;
error = out;
}
return output;
}
// ----
/**
* Recupera la salida de la ejecucion del comando
* @return un string con el resultado de la ejecucion
*/
public String getOutput() {
return output;
}
// ----
/**
* Recupera el error de la ejecucion del comando
* @return un string con el error de la ejecucion
*/
public String getError() {
return error;
}
// ----
/**
* Ejecuta un Script creando un fichero .sh con el contenido y ejecutandolo
*
* @param content
* contenido del script
* @param pathname
* el nombre del fichero que se crea si es null lo crea en /tmp y
* de la forma /tmp/timestamp.sh
* @param delete
* indica si se debe borrar o no el fichero temporal tras su
* ejecucion
* @result el resultado de la ejecucion del Script
* @throws Exception
* Excepcion levantada en caso de error
*/
public String executeScript(String content, String pathname, boolean delete)
throws Exception {
File f = null;
FileOutputStream fout = null;
try {
// crear fichero .sh
if (pathname == null) {
long timestamp = System.currentTimeMillis();
pathname = RUTA + File.separator + timestamp + ".sh";
}
if (this.addSHELLHEADER)
{
content = this.SHELLHEADER+this.RETORNO+content;
}
traza("executeScript","Generando fichero [" + pathname + "]...");
f = new File(pathname);
fout = new FileOutputStream(f);
fout.write(content.getBytes());
if (fout != null)
fout.close();
traza("executeScript","Fichero generado");
// darle permisos de ejecucion
traza("executeScript","Asignando permisos...");
Script permisos = new Script("chmod +x " + pathname);
permisos.setVerbose(this.verbose);
permisos.executeCommand();
String error = permisos.getError();
if (error != null) {
if (error.length() > 0)
throw new Exception("Permission denied : " + error);
}
traza("executeScript","Permisos asignados");
// ejecutar fichero .sh
traza("executeScript","Ejecutando script...");
Script ejecucion = new Script(pathname);
ejecucion.setVerbose(this.verbose);
String result = ejecucion.executeCommand();
error = ejecucion.getError();
this.error = error;
this.output = result;
traza("executeScript","Script ejecutado");
// eliminar fichero .sh
if (delete) {
if (f != null) {
if (f.exists())
f.delete();
}
traza("executeScript","fichero eliminado");
}
return result;
} catch (Exception e) {
throw e;
}
}
// ----
/**
* Para probar el correcto funcionamiento de la clase
* @param args argumentos de entrada
*/
public static void main(String[] args) {
try {
// sqlplus directamente no mejor ejecutar sh shellscript.sh que tenga el
// contenido
// Script sc = new Script("ls -l\ncal2\nps -ef | grep
// java\nsqlplus");
// sc.setDebug(false);
// String output = sc.executeCommand();
// System.out.println("OUT:-------------------\r\n"+output);
// String error = sc.getError();
// System.out.println("ERROR:-----------------\r\n"+error);
// output = sc.getOutput();
// System.out.println("output:\r\n"+output);
// System.out.println("***ERROR***");
// String err = sc.getError();
// System.out.println("error:"+err);
Script sc = new Script();
sc.setVerbose(true);
String CONTENT = "sqlplus2\nls -l\nps\necho \"End\\nFin\"";
String OUTPUT = sc.executeScript(CONTENT,
"/home/jose/Desktop/MiScript.sh", true);
System.out.println(OUTPUT);
String ERROR = sc.getError();
System.out.println("**ERROR**" + ERROR);
Script sql = new Script();
sql.setVerbose(false);
sql.setAddSHELLHEADER(true);
sql.setSHELLHEADER("#!/bin/sh");
//sql.setRUTA("/home/jose/Desktop");
CONTENT = "SELECT sysdate FROM DUAL;\nSELECT sysdate FECHA_HOY FROM DUAL;";
OUTPUT = sql.executeSQLScript(CONTENT, "EVO", "EVO", "EVODES",
null, "/home/jose/Desktop/MiSQL.sh", false);
System.out.println(OUTPUT);
ERROR = sql.getError();
System.out.println("**ERROR**" + ERROR);
} catch (Exception e) {
e.printStackTrace();
}
}
// ----
/**
* Completa un script de SQL para poder ejecutarlo con sqlplus desde un
* shell script
*
* @param sqlcontent
* sentencias SQL
* @param user
* usuario de base de datos
* @param password
* password de la base de datos (TODO: guardar encriptada)
* @param sid
* sid de la base de datos
* @param redirect
* si se indica es el fichero donde se redirecciona la salida del
* sqlplus
* @return un string con el sqlplus
*/
public String prepareSQLScript(String sqlcontent, String user,
String password, String sid, String redirect) {
if (redirect == null)
redirect = "";
else
redirect = "> " + redirect;
String INICIO_SQL = "sqlplus " + user + "/" + password + "@" + sid
+ " << EOF" + " " + redirect;
String FIN_SQL = "EOF";
String sql = sqlcontent;
sql = INICIO_SQL + RETORNO + sql + RETORNO + "exit" + RETORNO + FIN_SQL;
return sql;
}
// ----
/**
* Ejecuta un Script SQL mediante sqlplus
*
* @param sqlcontent
* las sentencias SQL
* @param user
* usuario de la base de datos
* @param password
* la password de la base de datos
* @param redirect
* si se indica es el fichero donde se redirecciona la salida del
* sqlplus
* @param pathname
* nombre del shell script que se crea
* @param delete
* indica si se debe borrar o no el shell script tras la
* ejecucion
* @return el resultado de la ejecucion del script
*/
public String executeSQLScript(String sqlcontent, String user,
String password, String sid, String redirect, String pathname,
boolean delete) throws Exception {
String SQL_CONTENT = prepareSQLScript(sqlcontent, user, password, sid,
redirect);
return executeScript(SQL_CONTENT, pathname, delete);
}
// ----
/**
* Recupera el valor del flag
* @return el valor del flag
*/
public Boolean getVerbose() {
return verbose;
}
// ----
/**
* Fija el valor del flag para mostrar por la consola estandard la ejecucion
* @param debug el valor del flag
*/
public void setVerbose(Boolean debug) {
this.verbose = debug;
}
// ----
/**
* Para imprimir un mensaje de traza
*
* @param metodo
* nombre del metodo
* @param mensaje
* nombre de la clase
*/
public void traza(String metodo, String mensaje) {
// TODO: reemplazar aqui para emplear LOG4J
// System.out.println(mensaje);
}
// ----
public boolean isAddSHELLHEADER() {
return addSHELLHEADER;
}
public void setAddSHELLHEADER(boolean addSHELLHEADER) {
this.addSHELLHEADER = addSHELLHEADER;
}
public String getContent() {
return content;
}
public void setContent(String content) {
this.content = content;
}
public String getRETORNO() {
return RETORNO;
}
public void setRETORNO(String retorno) {
RETORNO = retorno;
}
public String getRUTA() {
return RUTA;
}
public void setRUTA(String ruta) {
RUTA = ruta;
}
public String getSHELL() {
return SHELL;
}
public void setSHELL(String shell) {
SHELL = shell;
}
public String getSHELLHEADER() {
return SHELLHEADER;
}
public void setSHELLHEADER(String shellheader) {
SHELLHEADER = shellheader;
}
public void setError(String error) {
this.error = error;
}
public void setOutput(String output) {
this.output = output;
}
}
// end Script.java







/*************************************************************************************************************/

//82
import static java.lang.System.out;
import java.lang.Runtime;
import java.io.*;

public class Ejemplo2{

  public static void main(String ... args){
   
     String s = null;

                try {

                        // Determinar en qué SO estamos
                        String so = System.getProperty("os.name");

                        String comando;

                        // Comando para Linux
                        if (so.equals("Linux")){
                                comando = "ls -la";
                        }
                        // Comando para Windows
                        else{
                                comando = "cmd /c dir";
                        }

                        // Ejcutamos el comando
                        Process p = Runtime.getRuntime().exec(comando);

                        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

                        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

                        // Leemos la salida del comando
                       out.println("Ésta es la salida standard del comando:\n");
                        while ((s = stdInput.readLine()) != null) {
                                out.println(s);
                        }

                        // Leemos los errores si los hubiera
                       out.println("Ésta es la salida standard de error del comando (si la hay):\n");
                        while ((s = stdError.readLine()) != null) {
                                out.println(s);
                        }

                        System.exit(0);
                } catch (IOException e) {
                        System.out.println("Excepción: ");
                        e.printStackTrace();
                        System.exit(-1);
                }


    }
}




//81
/*
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Ejemplos{
    public static void main(String[] args) {
           
SwingUtilities.invokeLater (new Runnable(){public void run(){
        new Ventana("Movimiento circular").setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }});


    }
}

class Ventana extends JFrame{
    public static final int ANCHO=800;
    public static final int ALTO=200;

    private JButton btnActiva;
    private JButton btnSalir;
    private JPanel panel;
    private JTextField txtVelocidad_ang; 
    private JTextField txtTiempo;
    private JTextField txtAceleracion_ang;  
    private JTextField  txtRadio;  
    private JTextField   txtVuelta;



    public Ventana(String msg){
        super(msg);
        setSize(ANCHO,ALTO);
        setVisible(true);
        setResizable(true);
        add(getGUI());
    }

    public JPanel getGUI(){
        panel=new JPanel();

     


        txtVelocidad_ang=new JTextField(6);
        txtTiempo=new JTextField(6);
        txtAceleracion_ang=new JTextField(6);
        txtRadio=new JTextField(6);
        txtVuelta=new JTextField(6);

        panel.setBackground(Color.black);
        panel.add(new JLabel("<html><font color='white'>Velocidad angular:</font></html>"));
        panel.add(txtVelocidad_ang); 
        panel.add(new JLabel("<html><font color='white'>Tiempo:</font></html>"));   
        panel.add(txtTiempo);
        panel.add(new JLabel("<html><font color='white'>Aceleracion angular:</font></html>"));
        panel.add(txtAceleracion_ang);  
        panel.add(new JLabel("<html><font color='white'>Radio:</font></html>"));
        panel.add(txtRadio);  
        panel.add(new JLabel("<html><font color='white'>Vuelta:</font></html>"));
        panel.add(txtVuelta);
        panel.add(getActiva());
        panel.add(getSalida());
        return panel;
    }

    public JButton getActiva(){
        btnActiva=new JButton("<html><font color='white'><b>Activar</b></font></html>",new ImageIcon("ferd.jpg"));
        btnActiva.setToolTipText("activa evento");
        btnActiva.setBackground(Color.blue);

        btnActiva.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ev){
            Movimiento movimiento=new Movimiento();

             double velocidad_ang=Double.parseDouble(txtVelocidad_ang.getText()); 
             double tiempo=Double.parseDouble(txtTiempo.getText());
             double aceleracion_ang=Double.parseDouble(txtAceleracion_ang.getText());
             double radio=Double.parseDouble(txtRadio.getText());
             double vuelta=Double.parseDouble(txtVuelta.getText());
             

            String res="\n";

            res+="Aceleracion angular: "+String.valueOf(movimiento.aceleracion_angular(velocidad_ang,tiempo));
            res+="\nAceleracion tangencial: "+String.valueOf(movimiento.aceleracion_tangencial(radio,aceleracion_ang));
            res+="\nPeriodo: "+String.valueOf(movimiento.periodo(vuelta));
            res+="\nFrecuencia:"+String.valueOf(movimiento.frecuencia(vuelta));

            JOptionPane.showMessageDialog(null,res,"Movimiento circular",JOptionPane.PLAIN_MESSAGE,new ImageIcon("ferd.jpg"));
            
             limpia();
        }
        });
   

        return btnActiva;
    }

    public JButton getSalida(){
        btnSalir=new JButton("<html><font color='white'><b>Salir</b></font></html>",new ImageIcon("ferd.jpg"));
        btnSalir.setToolTipText("salir");
        btnSalir.setBackground(Color.red);

        btnSalir.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ev){
             System.exit(0);
        }
        });
   


        return btnSalir;
    }

    public void limpia(){
         txtVelocidad_ang.setText(""); 
     txtTiempo.setText("");
   txtAceleracion_ang.setText("");  
    txtRadio.setText("");  
    txtVuelta.setText("");
    }

}

class Movimiento{

    private double velocidad_angular;
    private double tiempo;
    private double aceleracion_angular;
    private double vuelta;
    private double radio;

    public Movimiento(){}

    public double aceleracion_angular(double velocidad_angular,double tiempo){
        return velocidad_angular/tiempo;
    }

    public double aceleracion_tangencial(double radio,double aceleracion_angular){
        return radio*aceleracion_angular;
    }

    public double periodo(double vuelta){
        return (2*Math.PI)/vuelta;
    }

    public double frecuencia(double vuelta){
        return vuelta/(2*Math.PI);
    }
    
}

*/


//80
/*  Código de CasiDiablo
public class Ejemplos{
    public static void main(String[] args) {
        System.out.println("Nombre del PC: " + nombrePC());
       System.out.println("Nombre usuario: " + usuario());
       System.out.println("Procesador: " + procesador());
       System.out.println("Sistema operativo: " + SO());
       System.out.println("Version JDK: " + JDK());
       System.out.println("Directorio actual: " + dir());
    }

    public static String nombrePC()
    {
       return System.getenv("COMPUTERNAME");
    }
    public static String usuario()
    {
       return System.getProperty("user.name");
    }
    public static String procesador()
    {
       return System.getenv("PROCESSOR_IDENTIFIER");
    }
    public static String SO()
    {
         return System.getProperty("os.name");
    }
    public static String JDK()
    {
         return System.getProperty("java.version");      
    }
    public static String dir()
    {
       return System.getProperty("user.dir");      
    }
}
*/
//79
/*
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejemplos{

    public static void main(String[] args)throws Exception{
    File file = new File("archivo.txt");
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line = reader.readLine();
    while (line != null) {
      System.out.println(line.toUpperCase());
      line = reader.readLine();
    }
    reader.close();
    }
    
}

*/

//78
/*
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JLabel;




public class Ejemplos{
    public static void main(String[] args) {
           
SwingUtilities.invokeLater (new Runnable(){public void run(){
        new Ventana("Calcular hipoteca").setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }});








    }
}




class Ventana extends JFrame{
    public static final int ANCHO=500;
    public static final int ALTO=200;




    private JButton btnActiva;
    private JButton btnSalir;
    private JPanel panel;
    private JTextField txtValor;
    private JTextField txtInteres;
    private JTextField txtPlazo;




    public Ventana(String msg){
        super(msg);
        setSize(ANCHO,ALTO);
        setVisible(true);
        setResizable(true);
        add(getGUI());
    }




    public JPanel getGUI(){
        panel=new JPanel();




        txtValor=new JTextField(6);
        txtInteres=new JTextField(6);
        txtPlazo=new JTextField(6);




        panel.setBackground(Color.black);
        panel.add(new JLabel("<html><font color='white'>Valor:</font></html>"));
        panel.add(txtValor); 
        panel.add(new JLabel("<html><font color='white'>Interes:</font></html>"));   
        panel.add(txtInteres);
        panel.add(new JLabel("<html><font color='white'>Plazo:</font></html>"));
        panel.add(txtPlazo);    
        panel.add(getActiva());
        panel.add(getSalida());
        return panel;
    }




    public JButton getActiva(){
        btnActiva=new JButton("<html><font color='white'><b>Activar</b></font></html>",new ImageIcon("ferd.jpg"));
        btnActiva.setToolTipText("activa evento");
        btnActiva.setBackground(Color.blue);




        btnActiva.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ev){
            Economica economica=null;
            double valor=Double.parseDouble(txtValor.getText());
            double interes=Double.parseDouble(txtInteres.getText());
            int plazo=Integer.parseInt(txtPlazo.getText());




            String vacio= (txtValor.getText().equals("") || txtPlazo.getText().equals("") || txtInteres.getText().equals("")) ? "vacio" : "lleno"; 




            if(vacio.equals("vacio")){
                JOptionPane.showMessageDialog(null,"Debes llenar los campos","Aviso del sistema",JOptionPane.ERROR_MESSAGE,new ImageIcon("ferd.jpg"));
            }else{
            economica=new Economica(interes,valor,plazo);
           }




             JOptionPane.showMessageDialog(null,String.format("%1$s",String.valueOf(economica.valorFuturo())),"Valor futuro",JOptionPane.PLAIN_MESSAGE,new ImageIcon("ferd.jpg"));
             limpia();
        }
        });
   




        return btnActiva;
    }




    public JButton getSalida(){
        btnSalir=new JButton("<html><font color='white'><b>Salir</b></font></html>",new ImageIcon("ferd.jpg"));
        btnSalir.setToolTipText("salir");
        btnSalir.setBackground(Color.red);




        btnSalir.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ev){
             System.exit(0);
        }
        });
   








        return btnSalir;
    }




    public void limpia(){
        txtValor.setText("");txtInteres.setText("");txtPlazo.setText("");
    }




}




class Economica{
    private double interes;
    private double valor;
    private int plazo;




    Economica(){}




    Economica(double _interes,double _valor,int _plazo){
        this.interes=_interes;
        this.valor=_valor;
        this.plazo=_plazo;
    }  




    public double valorFuturo(){
        return valor*Math.pow(1+interes/100,plazo);
    }
}




*/




//77
/*
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;








public class Ejemplos{




    public static void main(String[] args) {
        new CerrarVentana();
    }




}
















class CerrarVentana extends JFrame {




        private static final long serialVersionUID = 1L;
        
        public CerrarVentana(){
                super("Hola Mundo");
                
                JLabel label = new JLabel("Hola Mundo");
                getContentPane().add(label);
                
                addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                                System.out.println("adios");
                                System.exit(0);
                        }
                });
                
                
                
                setSize(200,100);
                setVisible(true);
        }
        
        
        




}
*/




//76
/*
import java.util.ArrayList;
import java.util.List;




public class Ejemplos{




    
    public static void main(String[] args) {
        List<Ejemplos> lista=new ArrayList<Ejemplos>();
        lista.add(new Ejemplos());




        for(Ejemplos e: lista){
            System.out.println(e.toString());
        }




    }




    public String toString(){
        return (this==null) ? "<null>" : super.toString();
    }
}
*/
//75
/*
import java.util.Scanner;




public class Ejemplos{
    Scanner entrada=new Scanner(System.in);




    public Ejemplos(){}




    public String cadena(){
        String cadena=null;
        try{
            cadena=entrada.nextLine();
        }catch(Exception ex){
            System.err.println("causa del error: "+ex.getCause());
        }
        return cadena;
    }




    public static void main(String[] args) {
        System.out.println("Tu nombre: ");
        String nombre=new Ejemplos().cadena();
        if(nombre==null || nombre.equals(""))
            nombre="fer";




        System.out.println("Hola "+nombre);
    }
    
}


*/

//74 autor Feffo Calendino
package com.lineadecodigo.java.mail;

/**
 * @file Gmail.java
 * @version 1.0
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date Dec 27, 2012
 * @url http://lineadecodigo.com/java/obtener-cantidad-de-email-sin-leer-en-gmail-con-java/
 * @description Obtiene la cantidad de mensajes leidos y no leidos de una casilla de gmail  
 */

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Session;
import javax.mail.Store;

public class Gmail {

        protected String user; // Usuario
        protected String pass; // Contraseña
        protected String host; // Servidor
        protected Folder inbox; // Carpeta a analizar

        public Gmail(String user, String pass) {
                this.user = user + "@gmail.com";
                this.pass = pass;
                this.host = "imap.gmail.com";
        }

        // Crea la conexion con la bandeja de entrada de gmail
        // Mediante un boolean indica si la conexion se puedo realizar
        public boolean connect() {
                try {
                        Properties props = System.getProperties();
                        props.setProperty("mail.store.protocol", "imaps"); // Protocolo a
                                                                                                                           // usar

                        Session session = Session.getDefaultInstance(props, null); // Obtenemos
                                                                                                                                           // una
                                                                                                                                           // session
                        Store store = session.getStore("imaps");
                        store.connect(host, user, pass); // Hacemos la conexion con
                                                                                         // elementos mencionados

                        inbox = store.getFolder("Inbox"); // Obtenemos la casilla de entrada
                                                                                          // como carpeta a analizar

                        return true; // Se puso hacer la conexión! :)
                } catch (Exception e) {
                        e.printStackTrace();
                        return false; // Hubo un error :(
                }
        }

        // Obtiene la cantidad de mails en la carpeta INBOX de gmail
        // En caso de haber una falla retorna -1
        public int getMessageCount() {
                try {
                        inbox.open(Folder.READ_ONLY);
                        int count = inbox.getMessageCount();
                        inbox.close(false);

                        return count;
                } catch (Exception e) {
                        System.out.println(e);
                        return -1;
                }
        }

        // Obtiene la cantidad de mails sin leer en la carpeta INBOX de gmail
        // En caso de haber una falla retorna -1
        public int getUnreadMessageCount() {
                try {
                        inbox.open(Folder.READ_ONLY);
                        // Indicamos que solo vamos a leer la carpeta

                        int count = inbox.getUnreadMessageCount();
                        // Obtenemos la cantidad de mensajes sin leer

                        inbox.close(false);
                        // Cerramos la carpeta, el false se debe a que le indicamos que no
                        // debe hacerse
                        // ningún cambio en gmail

                        return count;
                } catch (Exception e) {
                        System.out.println(e);
                        return -1;
                        // En caso de una excepción retornamos -1
                }
        }

        public static void main(String[] args) {
                Gmail gmail = new Gmail("USER", "PASS");

                gmail.connect();

                System.out.println("Mails: " + gmail.getMessageCount());
                System.out.println("Unread: " + gmail.getUnreadMessageCount());
        }
}

//73
/*
public class Ejemplos{
    
    public static void main(String[] args) {
        Fisica movimiento=new Movimiento(200,34.2,12);
        movimiento.ver();
    }
}

interface Servicio{
    public abstract void ver();
}


abstract class Fisica implements Servicio{
    private double distancia;
    private double velocidad;
    private double tiempo;

    public Fisica(){}

    public Fisica(double d,double v,double t){
        this.velocidad=v;
        this.distancia=d;
        this.tiempo=t;
    }

    public abstract double velocidad();
    public abstract double tiempo();
    public abstract double distancia();

}

class Movimiento extends Fisica{
    double v;
    double t;
    double d;

    public Movimiento(){
    }

    public Movimiento(double d,double v,double t){
        super(d,v,t);
        this.v=v;
        this.d=d;
        this.t=t;
    }

    @Override
    public double velocidad(){
        return d/t;
    }

    @Override
    public double tiempo(){
        return d/v;
    }

    @Override
    public double distancia(){
        return v*t;
    }

    @Override
    public void ver(){
        String resultado=String.format("velocidad: %f, tiempo: %f , distancia:%f",velocidad(),tiempo(),distancia());
        System.out.println(resultado);
    }

}
*/
//72
/*
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Ejemplos{

    public static final String[] pizzas = { "Spiderman", "Capitan America", "Superman", "Batman" };
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("elije a tu super heroe");
    String favoritePizza = (String) JOptionPane.showInputDialog(frame, 
        "cual es tu heroe favorito?",
        "Heroe favorito",
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        pizzas, 
        pizzas[0]);
    if(favoritePizza==null){
        favoritePizza=" mi gato";
    }
    JOptionPane.showMessageDialog(null,"Heroe favorito es "+favoritePizza,"Aviso",JOptionPane.PLAIN_MESSAGE,new ImageIcon("ferd.jpg"));
    System.exit(0);
    }
}

*/

//71
/*
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Ejemplos{
    public static void main(String[] args) {
           
SwingUtilities.invokeLater (new Runnable(){public void run(){
        new Ventana("Ventana").setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }});


    }
}

class Ventana extends JFrame{
    public static final int ANCHO=500;
    public static final int ALTO=300;

    private JButton btnActiva;
    private JButton btnSalir;
    private JPanel panel;

    public Ventana(String msg){
        super(msg);
        setSize(ANCHO,ALTO);
        setVisible(true);
        setResizable(true);
        add(getGUI());
    }

    public JPanel getGUI(){
        panel=new JPanel();
        panel.add(getActiva());
        panel.add(getSalida());
        return panel;
    }

    public JButton getActiva(){
        btnActiva=new JButton("<html><font color='white'><b>Activar</b></font></html>",new ImageIcon("ferd.jpg"));
        btnActiva.setToolTipText("activa evento");
        btnActiva.setBackground(Color.blue);

        btnActiva.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ev){
            Hipoteca hipoteca=null;
            double capital=Double.parseDouble(JOptionPane.showInputDialog("Capital:"));
            double interes=Double.parseDouble(JOptionPane.showInputDialog("Tasa de interes(%):"));
            int plazo=Integer.parseInt(JOptionPane.showInputDialog("Plazo:"));
            hipoteca=new Hipoteca(interes,capital,plazo);
             JOptionPane.showMessageDialog(null,String.format("%1$s",String.valueOf(hipoteca.cuota())),"Cuota obtenida",JOptionPane.PLAIN_MESSAGE,new ImageIcon("ferd.jpg"));
        }
        });
   

        return btnActiva;
    }

    public JButton getSalida(){
        btnSalir=new JButton("<html><font color='white'><b>Salir</b></font></html>",new ImageIcon("ferd.jpg"));
        btnSalir.setToolTipText("salir");
        btnSalir.setBackground(Color.red);

        btnSalir.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ev){
             System.exit(0);
        }
        });
   


        return btnSalir;
    }
}

class Hipoteca{
    private double interes;
    private double capital;
    private int plazo;

    Hipoteca(){}

    Hipoteca(double _interes,double _capital,int _plazo){
        this.interes=_interes;
        this.capital=_capital;
        this.plazo=_plazo;
    }  

    public double cuota(){
        return (capital*interes)/(1-Math.pow(1+(interes/100),-plazo));
    }
}
*/
//70
/*
import java.util.StringTokenizer;

public class Ejemplos{

    public static void main(String[] args) {
        String nombre="Angel Franco García";
        StringTokenizer tokens=new StringTokenizer(nombre);
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }

        String strDatos="6.3\n6.2\n6.4\n6.2";
        tokens=new StringTokenizer(strDatos, "\n");
        int nDatos=tokens.countTokens();
        double[] datos=new double[nDatos];
        int i=0;
        while(tokens.hasMoreTokens()){
            String str=tokens.nextToken();
            datos[i]=Double.valueOf(str).doubleValue();
            System.out.println(datos[i]);
            i++;
        }

        try  {
            System.in.read();
        }catch (Exception e) {  
          e.printStackTrace();
        }

    }

}

*/

//69
/*
public class Ejemplos{

    public static void main(String[] args) {
        Abstracta ejemplo=new Clase1(23.0,45.2);
        ejemplo.ver();
    }

}

interface Servicio1{
    void ver();
} 

interface Servicio2{
    int suma();
}

abstract class Abstracta implements Servicio1,Servicio2{
    private double x;
    private double y;

    Abstracta(){}

    Abstracta(double _x,double _y){
        this.x=_x;
        this.y=_y;
    }

}

class Clase1 extends Abstracta{
    double x;
    double y;


    Clase1(double x,double y){
     super(x,y);
     this.x=x;
     this.y=y;
    }

    @Override
    public int suma(){
        return (int)(x+y);
    }

    @Override
    public void ver(){
        System.out.println(String.format("numeros: [ %f , %f ] -> suma: %d",x,y,suma()));
    }
}

*/

//68
/*
public class Ejemplos{
    
    public static final String MSG="Error,debes introducir una palabra";
    
    public static void main(String[] args)throws MiError {

        if(args.length==0){
            throw new MiError(MSG);
        }else{
            String cad=args[0];
            cad=cad.trim();
            String res="";
            String res2="";
            String res3="";
            for(int i=0;i<cad.length();i++){
            char c=cad.charAt(i);
            if(!String.valueOf(c).equals("")){
                res+=String.valueOf(c).trim();
            }
        }

        for(int j=0;j<res.length();j++){
            char e=res.charAt(j);
            String aux2=String.valueOf(e);
            if(aux2.equals(aux2.toUpperCase())){
                res2+=aux2+",";
            }
            if(aux2.equals(aux2.toLowerCase())){
                res3+=aux2+",";
            }
        }
         System.out.println("mayusculas: "+res2);
         System.out.println("minusculas: "+res3);
        }
    }
}

class MiError extends Exception{
    
    public MiError(String msg){
        super(msg);
    }
}
*/

//67
/*
public class Ejemplos{
    
    public static void main(String[] args) {
        Figura esfera=new Esfera(20);
        esfera.ver();
    }
}

interface Servicio{
    public abstract void ver();
}

abstract class Figura implements Servicio{
    private double radio;
    public abstract double volumen();

    public Figura(){}

    public Figura(double _radio){
        this.radio=_radio;
    }

    public double getRadio(){
        return this.radio;
    }
}

class Esfera extends Figura{
    double r;

    public Esfera(){}

    public Esfera(double _r){
        super(_r);
        r=_r;
    }

    @Override
    public double volumen(){
        return ((4/3) * Math.PI*(r*r*r));
    }

    @Override
    public void ver(){
        System.out.println(String.format("radio: %f , volumen esfera: %f",getRadio(),volumen()));
    }
}
*/

//66
/*
public class Ejemplos{

    public static void main(String[] args) {
        String nombre="Fernando";
        int edad=12;
        String cad= (nombre.equals("") && (edad==0 || edad<=0)) ? "vacio" : "lleno";
        System.out.println(cad);
    }

}
*/

//65
/*
public class Ejemplos{
    
    public static void main(String[] args) {
                  // F e r n a n d o
                  // 0 1 2 3 4 5 6 7
                  // 1 2 3 4 5 6 7 8
        String cad="Fernando";
        String cad2="Un gato come muy bien";
        System.out.println("tam cad 1: "+cad.length()+ " tam cad 2:"+ cad2.length());
        System.out.println(cad.substring(0,6)); // substring(n,m) donde m-n
        System.out.println(cad2.substring(6));
        int index=cad.indexOf("o");
        System.out.println(index);
        index=cad.indexOf("o",index-1);
        System.out.println(index);

    }
}
*/


//64
/*
import java.util.Scanner;

public class Ejemplos{

    public static void main(String[] args) {
        String cad="";
        String res="",res2="";
        String aux="";
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce cadena:");
        cad=in.nextLine();
        cad=cad.trim();
        //System.out.println(cad);
        for(int i=0;i<cad.length();i++){
            char c=cad.charAt(i);
        //    System.out.println(String.valueOf(c));
            if(!String.valueOf(c).equals("")){
                res+=String.valueOf(c).trim();
            }
        }
      //  System.out.println(res);

        for(int j=0;j<res.length();j++){
            char e=res.charAt(j);
            String aux2=String.valueOf(e);
            if(aux2.equals(aux2.toUpperCase())){
                res2+=aux2+",";
            }
        }
         System.out.println(res2);
        
    }

}

//64

import java.util.Scanner;

public class Ejemplos{

    public static void main(String[] args) {
        String cad="";
        String res="",res2="";
        String aux="";
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce cadena:");
        cad=in.nextLine();
        cad=cad.trim();
        for(int i=0;i<cad.length();i++){
            char c=cad.charAt(i);
            if(!String.valueOf(c).equals("")){
                res+=String.valueOf(c).trim();
            }
        }
     

        for(int j=0;j<res.length();j++){
            char e=res.charAt(j);
            String aux2=String.valueOf(e);
            if(aux2.equals(aux2.toUpperCase())){
                res2+=aux2+",";
            }
        }
         System.out.println(res2);
        
    }

}


//63
/*
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Ejemplos{
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
    Date now=calendar.getTime();
    System.out.println("original: "+dateMonth(now));
    verMes(now);
    }

public static void verMes(Date date){
    String result = "";
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int month = 0;

month = calendar.get(Calendar.MONTH);

   HashMap<Integer,String> mapa=new HashMap<Integer,String>();
   String[] meses={"Enero",
   "Febrero",
   "Marzo","Abril",
   "Mayo","Junio",
   "Julio","Agosto",
   "Septiembre","Octubre",
   "Noviembre","Diciembre"};
   
   //lenar el mapa
for(int i=0;i<meses.length;i++){
     mapa.put(i,meses[i]);
   }
   
   Iterator it = mapa.entrySet().iterator();
while (it.hasNext()) {
Map.Entry e = (Map.Entry)it.next();
//System.out.println(e.getKey() + " " + e.getValue());
if(e.getKey().equals(month)){  System.out.println("Es: "+e.getValue());} 
}
  
}


   public static String dateMonth(Date date) {
                String result = "";
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int month = 0;

                try {
                        month = calendar.get(Calendar.MONTH);
                } catch (Exception ex) {
                }
                switch (month) {
                case 0: {
                        result = "Enero";
                        break;
                }
                case 1: {
                        result = "Febrero";
                        break;
                }
                case 2: {
                        result = "Marzo";
                        break;
                }
                case 3: {
                        result = "Abril";
                        break;
                }
                case 4: {
                        result = "Mayo";
                        break;
                }
                case 5: {
                        result = "Junio";
                        break;
                }
                case 6: {
                        result = "Julio";
                        break;
                }
                case 7: {
                        result = "Agosto";
                        break;
                }
                case 8: {
                        result = "Septiembre";
                        break;
                }
                case 9: {
                        result = "Octubre";
                        break;
                }
                case 10: {
                        result = "Noviembre";
                        break;
                }
                case 11: {
                        result = "Diciembre";
                        break;
                }
                default: {
                        result = "Error";
                        break;
                }
                }
                return result;
        }


}


*/

//62
/*
import javax.swing.JOptionPane;
import javax.swing.*;

public class Ejemplos{
    
    public static void main(String[] args) {
         try{
         double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce radio:"));  
         double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce altura:"));   
         JOptionPane.showMessageDialog(null,"Volumen obtenido\n"+String.valueOf(volumen(radio,altura)),"Aviso", JOptionPane.PLAIN_MESSAGE,new ImageIcon("ferd.jpg"));
         System.exit(0);
         }    
         catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getCause().toString(),"Aviso", JOptionPane.ERROR_MESSAGE,new ImageIcon("img.jpg"));
         }
    }

    public static double volumen(double r,double h){
        return (Math.PI*(r*r)*h)/3;
    }
}

*/


//61
/*
import java.util.Scanner;
import static java.lang.System.out;


public class Ejemplos{

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        out.println("nombre: ");
        String nombre=entrada.nextLine();
        out.println("edad:");
        int edad=entrada.nextInt();
        
        if(esVacio(nombre,edad)){
            out.println("error");
        }

        out.printf(" nombre: %s y edad: %d",nombre,edad);
    }

    public static boolean esVacio(String cadena,int entero){
        String cad= (cadena.equals("") ||  cadena==null && (entero==0))  ? "vacio" : "lleno";
        if(cad.equals("vacio")){
            return true;
        }else{
            return false;
        }
    }
}
*/


//60
/*
import java.util.Calendar;
import java.util.Date;

public class Ejemplos{
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
                Date now=calendar.getTime();
                System.out.println(dateMonth(now));
    }

    public static String dateMonth(Date date) {
                String result = "";
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int month = 0;

                try {
                        month = calendar.get(Calendar.MONTH);
                } catch (Exception ex) {
                }
                switch (month) {
                case 0: {
                        result = "Enero";
                        break;
                }
                case 1: {
                        result = "Febrero";
                        break;
                }
                case 2: {
                        result = "Marzo";
                        break;
                }
                case 3: {
                        result = "Abril";
                        break;
                }
                case 4: {
                        result = "Mayo";
                        break;
                }
                case 5: {
                        result = "Junio";
                        break;
                }
                case 6: {
                        result = "Julio";
                        break;
                }
                case 7: {
                        result = "Agosto";
                        break;
                }
                case 8: {
                        result = "Septiembre";
                        break;
                }
                case 9: {
                        result = "Octubre";
                        break;
                }
                case 10: {
                        result = "Noviembre";
                        break;
                }
                case 11: {
                        result = "Diciembre";
                        break;
                }
                default: {
                        result = "Error";
                        break;
                }
                }
                return result;
        }
}

*/

//59
/*
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ejemplos extends JFrame{
private JButton btnCalcula,btnSalir;
private JTextField txtNumero;
private JPanel panel;
private  JLabel lblResult;
   
public static final int ANCHO=400;
public static final int ALTO=300;

   public Ejemplos(){
     setTitle("::Factorial::");
         setVisible(true);
     setSize(ANCHO,ALTO);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
         add(getGUI());
   }
   
   
   public static int factorial(int n){
     if(n==0){
            return 1;
         }else{
            return n * factorial(n-1);
         }
   
   }
   
   
   public void limpia(){
     txtNumero.setText("");
   }
   
   
   
   
   public JPanel getGUI(){
    panel=new JPanel();
        
        
        txtNumero=new JTextField(6);
        txtNumero.setToolTipText("debes colocar un número");
        
        
        btnCalcula=new JButton("<html><font color='white'><b>Calcular</b></font></html>",new ImageIcon("SRN4.jpg"));
    btnCalcula.setToolTipText("calcular factorial");
    btnCalcula.setBackground(Color.blue);
        
        
        
        btnSalir=new JButton("<html><font color='yellow'><b>Salir</b></font></html>",new ImageIcon("SRN4.jpg"));
    btnSalir.setToolTipText("quitar aplicación");
    btnSalir.setBackground(Color.red);
        
        
        lblResult=new JLabel("<html><b><font color='red'> </font></b></html>");
        lblResult.setVisible(false);
        
   
    ActionListener actionListener1= new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                
                  int res=factorial( Integer.parseInt(txtNumero.getText()));  
                  lblResult.setText(String.valueOf(res));
                  lblResult.setVisible(true);
                  
                  limpia();
                  
                   
                }
        };
        
      
    ActionListener actionListener2= new ActionListener(){
            public void actionPerformed(ActionEvent ev){
               
                  System.exit(0);
                }
        };
        
       
      
        btnCalcula.addActionListener(actionListener1);
        btnSalir.addActionListener(actionListener2);
    
        
        panel.add(new JLabel("<html><b><font color='green'>Número entero:</font></b></html>"));
        panel.add(txtNumero);
    panel.add(btnCalcula);
        panel.add(new JLabel("<html><b><font color='blue'>resultado: </font></b></html>"));
        panel.add(lblResult);
          panel.add(btnSalir);
        
        return panel;   
   }
   
    
  public static void main(String ... args)throws Exception{
  
    for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
          if("Nimbus".equals(laf.getName()))
        try {
                UIManager.setLookAndFeel(laf.getClassName());
            new Ejemplos();
            
                }
                catch (ClassNotFoundException e) {
                        System.out.println("[Main.main:ClassNotFoundException]"+ e.getMessage());
                }
                catch (InstantiationException e) {
                        System.out.println("[Main.main:InstantiationException]"+ e.getMessage());
                }
                
        }
  }
        
       
}

*/

//58
/*
import java.lang.Runtime;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.io.*;

public class Ejemplos{

    public void ejecutar(String archivo){
        try {
            String comando;
            Process proceso = Runtime.getRuntime().exec(archivo);
            BufferedReader lector = new BufferedReader (new InputStreamReader (proceso.getInputStream()));
            while ((comando = lector.readLine()) != null) {
                System.out.println(comando);
            }
                lector.close();
            }catch (Exception err) {
                err.printStackTrace();
            }
    }
    
    public static void main(String[] args) {
        new Ejemplos().ejecutar("ejecuta.bat");
    }
}

*/

//57
/*
public class Ejemplos{

    Servicios servicio;

    public Ejemplos(){}

    public Ejemplos(Servicios serv){
        this.servicio=serv;
    }

    public void activa(){
        System.out.println("volumen obtenido: "+servicio.volumen());
    }

    public static void main(String[] args) {
        Servicios piramide=new Piramide(10,15);

        new Ejemplos(piramide).activa();

    }

}

interface Servicios{
public static final int M=3;
public abstract double volumen();
}

class Piramide implements Servicios{
    private double area_base;
    private double altura;

    public Piramide(){}

    public Piramide(double ab,double h){
        this.area_base=ab;
        this.altura=h;
    }

    @Override
    public double volumen(){
        return (area_base*altura)/M;
    }
}
*/

//56
/*
public class Ejemplos{

    public static void main(String[] args) {
        Persona empleado=new Empleado();

        empleado.setNombre("Fernando");
        empleado.setApellidos("Carraro Aguirre");
        empleado.setEdad(31);

        Empleado emp=new Empleado(empleado.getNombre(),empleado.getApellidos(),empleado.getEdad(),8000.00);
        emp.ver();

        
    }
    
}

abstract class Persona{
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(){}

    public Persona(String _nombre,String _apellidos,int _edad){
        setNombre(_nombre);
        setApellidos(_apellidos);
        setEdad(_edad);
    }

    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    public void setApellidos(String _apellidos){
        this.apellidos=_apellidos;
    }
    public void setEdad(int _edad){
        this.edad=_edad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public int getEdad(){
        return this.edad;
    }

    public abstract void ver();
}

class Empleado extends Persona{
    protected double salario;

    public Empleado(String _nombre,String _apellidos,int _edad,double _salario){
        super(_nombre,_apellidos,_edad);
        this.salario=_salario;
    }

    public void setSalario(double _salario){
        this.salario=_salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public Empleado(){}

    @Override
    public void ver(){
        System.out.println("nombre: "+getNombre()+"\napellidos:"+getApellidos()+"\nedad: "+getEdad()+"\nsalario: "+getSalario());
    }

}
*/

//55
/*
public class Ejemplos{
	public static void main(String[] args) {
		Singleton singleton=Singleton.getSingleton();
		singleton.ver();
	}
}

class Singleton{
	private static Singleton singleton=null;

	private Singleton(){}

	public static Singleton getSingleton(){
		if(singleton==null){
			singleton=new Singleton();
		}
		return singleton;
	}

	public void ver(){
		System.out.println("Estoy desde la clase: "+this.getClass().getName());
	}
}
*/

//54 http://thecafetechno.com/tutorials/design-patterns/facade-pattern-in-java/
//http://java.dzone.com/articles/fa%C3%A7ade-design-pattern-%E2%80%93-design

/*
public class Ejemplo{

    public static void main(String[] args) {
        Facade facade= new Facade();
        facade.metodo1();
        facade.metodo2();
    }

}

interface Servicio{
    void ver();
}

class Primera implements Servicio{

    @Override
    public void ver(){
        System.out.println(this.getClass().getName());
    }
}


class Segunda implements Servicio{

    @Override
    public void ver(){
        System.out.println(this.getClass().getName());
    }
}

class Facade{
    private Primera p=new Primera();
    private Segunda s=new Segunda();

    public void metodo1(){
        p.ver();
    }

    public void metodo2(){
        s.ver();
    }
}
*/

//53 http://www.javacodegeeks.com/2012/11/facade-design-pattern-design-standpoint.html
// facade
/*
public class Ejemplo{
    
    public static void main(String[] args) {
    
    OrdenFacade orderFacade = new OrdenFacade();
      orderFacade.colocarPedido("3444");
      System.out.println("Terminado !!!");

    }
}

class Inventario{
    public String checarInventario(String pedidoId){
        return "Invetario revisado";
    }
}

class Pago{
    public String deduciPago(String pedidoId){
        return "Pago realizado";
    }
}

class OrdenFacade{
    private Inventario inven=new Inventario();
    private Pago pgo=new Pago();

    public void colocarPedido(String pedidoId){
        String st1= inven.checarInventario(pedidoId);
        String st2=pgo.deduciPago(pedidoId);
        System.out.println("Todo listo: "+ st1  + " y " + st2);

    }
}
*/
//52 http://www.allapplabs.com/java_design_patterns/facade_pattern.htm
//http://www.fluffycat.com/Java-Design-Patterns/Facade/  - http://www.avajava.com/tutorials/lessons/facade-pattern.html?page=1
/*
public class Ejemplo{

    static{
        System.out.println("inicio ");
    }
    static{
        System.out.println("fin ");
    }

    static class Nada{

        public static void ver(){
            System.out.println("ver ");
        }
    }

    public static void main(String[] args) {
        new Ejemplo();
        Nada.ver();
    }
}
*/


//51 http://www.youtube.com/watch?v=v2imluYMIRI
/* singleton 
import java.util.ArrayList;
import java.util.List;

public class Ejemplo{

    public static void main(String[] args) {
        Servicio servicio=Servicio.INSTANCE;
        System.out.println(servicio.getLista());
    }

}

enum Servicio{
    INSTANCE();

    private static Servicio servicio;
    private List<String> lista;

    Servicio(){
        lista=new ArrayList<String>();
        lista.add("fer");
        lista.add("camila");
        lista.add("horacio");
    }

    public String getLista(){
        if(lista.size()>0){
            return lista.toString();
        }
        return "nada";
    }

}
*/



//52
import java.lang.Runtime;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.io.*;

public class Ejemplos{

    public void ejecutar(String archivo){
        try {
            String comando;
            Process proceso = Runtime.getRuntime().exec(archivo);
            BufferedReader lector = new BufferedReader (new InputStreamReader (proceso.getInputStream()));
            while ((comando = lector.readLine()) != null) {
                System.out.println(comando);
            }
                lector.close();
            }catch (Exception err) {
                err.printStackTrace();
            }
    }
    
    public static void main(String[] args) {
        new Ejemplos().ejecutar("ejecuta.bat");
    }
}


/*

//51 patrón Factory
/*
public class Ejemplo{

    public static void main(String[] args) {
  
    }

}

class FiguraFactory {

 public final static int CUADRADO = 0;
 public final static int CIRCULO = 1;
 
 public static Figura getFigura(int tipo, double lado) {
  switch (tipo) {
   case CUADRADO:
    return new Cuadrado(lado);
   case CIRCULO:
    return new Circulo(lado);
  }  
  return null;
 }
}

interface Figura {
 public double getArea();
}

class Circulo implements Figura {
 double radio;
 
 public Circulo(double radio) {
  this.radio = radio;
 }
 
 public double getArea() {
  return Math.PI*(radio*radio);
 }
}

class Cuadrado implements Figura {
 double lado;
 
 public Cuadrado(double lado) {
  this.lado = lado;
 }
 
 public double getArea() {
  return lado * lado;
 }
}
*/

//50
/*

import  java.math.BigInteger;

public class Ejemplo{

    public static void main(String[] args) {
        Ayuda ayuda=Ayuda.getAyuda();
        ayuda.verFacto();
    }

}

//otro singleton
class Ayuda{
    private static Ayuda ayuda=null;

    private Ayuda(){}

    public static Ayuda getAyuda(){
        if(ayuda==null){
            ayuda=new Ayuda();
        }
        return ayuda;
    }

    public void verFacto(){
        BigInteger n = BigInteger.ONE;
        for (int i=1; i<=20; i++) {
            n = n.multiply(BigInteger.valueOf(i));
            System.out.println(i + "! = " + n);
        }
    }

}
*/



//49 http://franvarvil.blogspot.mx/2011/11/como-se-usa-joptionpane-en-java.html

/*
import javax.swing.JOptionPane;
import javax.swing.*;

public class Ejemplo{

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,Servicio.ver("Fernando"),"Aviso",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("github.jpg"));
        
    }

}

final class Servicio{
    public static String ver(String cad){
        return "Hola "+ cad;
    }
}

*/


//48
/*
import  java.math.BigInteger;
public class Ejemplo{

    public static void main(String[] args) {
        BigInteger n = BigInteger.ONE;
        for (int i=1; i<=20; i++) {
            n = n.multiply(BigInteger.valueOf(i));
            System.out.println(i + "! = " + n);
        }
    }

}
*/




//47
import  java.math.BigDecimal;
import  java.math.BigInteger;

public class Ejemplo{

    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("2500.00");
        BigDecimal tasa = new BigDecimal("3.5");
        BigInteger plazo = new BigInteger("12");
       

        System.out.println("valor: "+valor);
        System.out.println("tasa: " + tasa);
        System.out.println("periodo: " + plazo);

        BigDecimal r1=tasa.divide(new BigDecimal("100"));
        
        BigDecimal r2=r1.add(new BigDecimal("1"));

        BigDecimal r3=new BigDecimal(Math.pow(Double.parseDouble(String.valueOf(r2)),Integer.parseInt(String.valueOf(plazo))));

        BigDecimal r4=valor.multiply(r3);

        //vf=vp*pow(1+i,n)
        System.out.println("VF: "+Math.round(r4.doubleValue()));
        

        
    }



}
*/
//46
/*
import  java.math.BigDecimal;

public class Ejemplo{

    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal(10);
        BigDecimal numero2 = new BigDecimal(5);
        System.out.println("Es el bigdecimal 1: "+numero1);
        System.out.println("Es el bigdecimal 2: " + numero2);

        System.out.println("Suma: "+numero1.add(numero2));
        System.out.println("Resta: "+numero1.subtract(numero2));
        System.out.println("Division: "+numero1.divide(numero2));
        System.out.println("Multiplicacion: "+numero1.multiply(numero2));
    }

}
*/

//45 javadoc Ejemplo.java
/*
public class Ejemplo{

    public static void main(String[] args) {
        System.out.println(Servicio.verClase(new Ejemplo()));
    }

}

final class Servicio{

    /**
 * Regresa el <b>nombre de la clase</b>
 *
 * @param  object 
 * @return   el nombre de la clase
 * @see      Object
 */
  //  public static String verClase(Object obj){
    //    return String.format("nombre clase [ ' %s ' ]",obj.getClass().getName());
    //}
//}
//*/


//44 http://yasnameza.wordpress.com/2011/03/02/patrones-de-diseno-en-java/
/*
public class Ejemplo{

    public static void main(String[] args) {

        ChileAddress nueva = new ChileAddressFactory().crearDireccion();
        ChileNumberPhone nuevo = new ChileAddressFactory().crearTelefono();

        
        nueva.setCalle("Anibal Pinto");
        nueva.setCiudad("Concepcion");
        nueva.setCodigoPostal("430");
        nueva.setRegion("Octava");

        
        nuevo.setNumero("2234567");
        nuevo.setCodigoCiudad("41");

        
        System.out.println(nueva);
        System.out.println(nuevo);
    }
}System.out.println(nuevo);

abstract class Direccion{
private String calle;
private String ciudad;
private String region;
private String codigoPostal;

public void setCalle(String calle){ this.calle=calle;}
public void setCiudad(String ciudad){ this.ciudad=ciudad;}
public void setRegion(String region){ this.region=region;}
public void setCodigoPostal(String codigoPostal){ this.codigoPostal=codigoPostal;}


public String getCalle(String calle){ return this.calle;}
public String getCiudad(String ciudad){ return this.ciudad;}
public String getRegion(String region){ return this.region;}
public String getCodigoPostal(String codigoPostal){ return this.codigoPostal;}


}

interface DireccionFactory{
public Direccion crearDireccion();
public NumeroTelefonico crearTelefono();
}

abstract class NumeroTelefonico{
    private String numero;

    public String getNumero() { return numero; }

    public void setNumero(String numero) {
        try{
           Long.parseLong(numero);
           this.numero = numero;
        } catch(NumberFormatException error){}
     }
     
     public abstract String getCodigoPais();
}

class DireccionMexico extends Direccion{
    public static final String PAIS="Mexico";

    public getPais(){
        return PAIS;
    }
    public String getDireccion(){
         return this.getCalle() + " " + this.getCiudad() + " " + this.getRegion() + " " + this.getCodigoPostal() + " " + PAIS; 
    }

    @Override
    public String toString(){
        return getDireccion();
    }
}

class DireccionMexicoFactory implements DireccionFactory{
    public DireccionMexico crearDireccion(){
        return new DireccionMexico();
    }

    public MexicoNumeroTelefonico crearTelefono(){
        return MexicoNumeroTelefonico();
    }
}

class MexicoNumeroTelefonico extends NumeroTelefonico{
     private static final String CODIGO_PAIS = "52";
   private static final int LONGITUD_NUMERO = 7;
   public String getCodigoPais() { return CODIGO_PAIS; }
   public String getCodigoCiudad() { return codigoCiudad; }
   public void setCodigoCiudad(String codigoCiudad) { this.codigoCiudad = codigoCiudad; }
   private String codigoCiudad;

   @Override
   public String toString(){ return CODIGO_PAIS + "-" + this.getCodigoCiudad() + "-" + this.getNumero();    }
   
   @Override
   public void setNumero(String numero){
      if (numero.length() == LONGITUD_NUMERO) super.setNumero(numero);
   }
}
*/


//43 singletons: la clase Math y Runtime de Java
/*
public class Ejemplo{

    public static void main(String[] args) {
        System.out.println("suma: "+Servicio.suma(45,5));
        System.out.println("resta: "+Servicio.resta(45,5));
    }
}
//otra forma de crear el singleton
final class Servicio{
    public static int suma(int a,int b){
        return a+b;
    }

    public static int resta(int a,int b){
        return a-b;
    }
}
//otra mas
class Soporte{
    public static boolean bandera=false;

    public Soporte()throws Exception{
        if(bandera){
            throw new Exception("ya existe la instancia");
        }else{
            bandera=true;
        }
    }

    public void finalize(){
        bandera=false;
    }
}
*/
//42
/*
public class Ejemplo{

    public static void main(String[] args) {
        Servicio servicio=Servicio.getServicio();
        servicio.verClase();
    }

}

class Servicio{
    private static Servicio servicio=null;

    private Servicio(){}

    public static  Servicio getServicio(){
        if(servicio==null){
            servicio=new Servicio();
        }
        return servicio;
    }

    public void verClase(){
        System.out.println(this.getClass().getName());
    }
}
*/
//41
/*
public class Ejemplo{

    public static void main(String[] args) {
        Singleton  s=Singleton.getInstance(34);
        s.ver();

    }
}

class Singleton
{
    private static Singleton singleton = null;  
    private final int x;

    private Singleton(int x) {
        this.x = x;
    }
    
    //synchronized
    public  static Singleton getInstance(int x) {
        if(singleton == null) singleton = new Singleton(x);
        return singleton;
    }

    public void ver(){
        System.out.println(x);
    }
}

*/
//40
/*
public class Ejemplo{

    public static void main(String[] args) {
        Servicio serv=Servicio.getInstance();
        serv.ver();
    }

}
class Servicio{
    private static final Servicio INSTANCE=new Servicio();
    private Servicio(){}

    public static final Servicio getInstance(){
        return INSTANCE;
    }

    public void ver(){
        System.out.println(this.getClass().getName());
    }
}
*/


//39
/*
import java.util.ArrayList;


public class Ejemplo{

    public void crearPersona(){
        Persona perso1= Persona.getInstancia();
        Persona perso2=Persona.getInstancia();
        System.out.println(perso1==perso2 ? "son el mismo objeto" : "objetos diferentes");
    }
    public static void main(String[] args) {
        new Ejemplo().crearPersona();
    }
}

class Persona{
    private static Persona persona=null;

    private Persona(){}

    public static Persona getInstancia(){
        if(persona==null){
            persona=new Persona();
        }

        return persona;
    }
}
*/


//38

/*
public class Ejemplo{


    public static void main(String[] args) {
        Singleton s1= Singleton.getInstance();
        s1.setX(23);
        s1.setY(43);
        s1.ver();
    }
}

interface Servicio{
    public abstract int suma();
}


class Singleton implements Servicio{

    private static Singleton instance=null;

    private int x;
    private int y;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public void setX(int _x){
        x=_x;
    }

    public void setY(int _y){
        y=_y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public int suma(){
        return x+y;
    }

    public void ver(){
        System.out.println(suma());
    }
}
*/

//37 singleton
/*
public class Ejemplo{

    public static void main(String[] args) {
        Singleton s= Singleton.getInstance();
        s.ver();
    }
}


class Singleton implements Servicio{
    private static Singleton INSTANCE = new Singleton();
 
    private Singleton() {}
 
    public static Singleton getInstance() {
        return INSTANCE;
    }

    @Override
    public void ver(){
        System.out.println("Hola desde la clase ["+this.getClass().getName()+"]");
    }

}

interface Servicio{
    void ver();
}
*/

//36 otro ejemplo de singleton
/*
public class Ejemplo{
    public static void main(String[] args) {
        Singleton s= Singleton.INSTANCE;
        s.setEdad(31);
        System.out.println(s.getEdad());
    }
}

enum Singleton implements Servicio{
    INSTANCE;

    private int edad;

    public void setEdad(int d){
        edad=d;
    }

    @Override
    public int getEdad(){
        return edad;
    }

}

interface Servicio{
    public abstract int getEdad();
}
*/

//35 un Singleton en un enum
/*
public class Ejemplo{

    public static void main(String[] args) {
        
    }
}


enum Singleton{
    INSTANCE;
    public String getNombre(){
        return this.getClass().getName();
    }
}

enum OtroSingleton{
    INSTANCE;

    private int edad;

    public void setEdad(int d){
    edad=d;
    }

    public int getEdad(){
        return edad;
    }
}
*/

//34
//http://migranitodejava.blogspot.mx/2011/05/singleton.html
/*
public class Ejemplo{

    public static void main(String[] args) {
       ServicioEducativo servicio=ServicioEducativo.getInstance();
       servicio.setNombreServicio("Educacion a distancia");
       System.out.println("nombre: "+servicio.getNombreServicio());

       ServicioEducativo servicio2= ServicioEducativo.getInstance();
       System.out.println("nombre: "+servicio2.getNombreServicio());

       ServicioEducativo servicio3=ServicioEducativo.getInstance();
       servicio3.setNombreServicio("Educacion online");
       System.out.println("nombre: "+servicio3.getNombreServicio());

    }
}

class ServicioEducativo{

    private static ServicioEducativo instance;
    private String nombreServicio;

    public ServicioEducativo(){}

    public static ServicioEducativo getInstance(){
        if(instance==null){
            instance=new ServicioEducativo();
        }
        return instance;
    }

    public void setNombreServicio(String nom){
        nombreServicio=nom;
    }

    public String getNombreServicio(){
        return nombreServicio;
    }

}

*/

//33 Sigleton, instancia única de una clase
/*
public class Ejemplo{

    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();

        System.out.println(single1 == single2);
    }
}


class Singleton{

    private static Singleton single=null;

    private Singleton(){}

    // Clase estatica oculta. Tan solo se instanciara el singleton una vez
   private static class SingletonHolder { 
  // El constructor de Singleton puede ser llamado desde aquí al ser protected
     private final static Singleton INSTANCE = new Singleton();
   }
    
   // Método para obtener la instancia de nuestra clase
   public static Singleton getInstance() {
     return SingletonHolder.INSTANCE;
   }
}
*/

//32 Patrón Singleton
//http://www.tutorialspoint.com/java/java_using_singleton.htm
/*
public class Ejemplo{

    public static void main(String[] args) {
        Singleton tmp = Singleton.getInstanciaUnica();
        tmp.ver();
    }
}

class Singleton{

    private static Singleton single=null;

    private Singleton(){}

    public static Singleton getInstanciaUnica(){
        if(single==null){
            single= new Singleton();
        }
        return single;
    } 

    //método de prueba
    public void ver(){
        System.out.println("Estoy en la clase ["+new Singleton().getClass().getName()+"]");
    }
}

*/

//31 patrón Bridge
//http://es.wikipedia.org/wiki/Bridge_(patr%C3%B3n_de_dise%C3%B1o)
/*
public class Ejemplo{
    public static void main(String[] args) {
        Abstraccion[] abstracciones = new Abstraccion[2];
        abstracciones[0] = new AbstraccionRefinada(new ImplementacionA());
        abstracciones[1] = new AbstraccionRefinada(new ImplementacionB());
        for(Abstraccion abstraccion:abstracciones){
            abstraccion.operacion();
        }
    }
}

interface Implementador {
    public abstract void operacion();
}
 
//primera implementacion de Implementador 
class ImplementacionA implements Implementador{
    public void operacion() {
        System.out.println("Esta es la implementacion A");
    }
}
//segunda implementacion de Implementador 
class ImplementacionB implements Implementador{
    public void operacion() {
        System.out.println("Esta es una implementacion de B");
    }
}
// interfaz de abstracción 
interface Abstraccion {
    public void operacion();
}
// clase refinada que implementa la abstraccion 
class AbstraccionRefinada implements Abstraccion{
    private Implementador implementador;
    public AbstraccionRefinada(Implementador implementador){
        this.implementador = implementador;
    }
    public void operacion(){
        implementador.operacion();
    }
}
*/
//30
/*
public class Ejemplo{

    public static void main(String[] args) {
        Abstracta c1=new Normal("Fernando",31);
        c1.ver();
        System.out.println("nombre: "+c1.getNombre());
        System.out.println("edad: "+c1.getEdad());
    }

}

abstract class Abstracta{
    protected String nombre;
    protected int edad;

    public Abstracta(String n,int d){
        nombre=n;
        edad=d;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public String toString(){
        return String.format("Datos(nombre: %s , edad: %d)",nombre,edad);
    }

    public abstract void ver();

}

class Normal extends Abstracta{

    public Normal(String n,int d){
        super(n,d);
    }
    @Override
    public void ver(){
        System.out.println(toString());
    }
}
*/
//29
/*
public class Ejemplo{
    public static void main(String[] args) {
        Clase1 c1= new Clase1();
        Clase1 c2= new Clase2();
        Clase2 c3= new Clase2();

        c1.ver();
        c2.ver();
        ((Clase2)c2).otro();
        c3.otro();
    }
}

class Clase1{
public void ver(){
System.out.println(new Clase1().getClass().getName());
}
}

class  Clase2 extends Clase1{
public void otro(){
System.out.println(new Clase2().getClass().getName());
}
}
*/

//28
/*
public class Ejemplo{

    public static void main(String[] args) {
        new Clase1().ver();
        new Clase2().ver();
    }
}

class Clase1{
    public void ver(){
        System.out.println(new Clase1().getClass().getName());
    }
}

class Clase2 extends Clase1{
    public void ver(){
        System.out.println(new Clase2().getClass().getName());
    }
}

*/
//27
/*
public class Ejemplo{
    public static void main(String[] args) {
        RainbowColor color = RainbowColor.INDIGO;
 
        Ejemplo es = new Ejemplo();
        String colorCode = es.getColorCode(color);
        System.out.println("ColorCode = #" + colorCode);
    }

    public String getColorCode(RainbowColor color) {
        String colorCode = "";
 
        //
        // We use the switch-case statement to get the hex color code of our
        // enum type rainbow colors. We can pass the enum type as expression
        // in the swith. In the case statement we only use the enum named
        // constant excluding its type name.
        //
        switch (color) {
            //
            // We use RED instead of RainbowColor.RED
            //
            case RED:
                colorCode = "FF0000";
                break;
            case ORANGE:
                colorCode = "FFA500";
                break;
            case YELLOW:
                colorCode = "FFFF00";
                break;
            case GREEN:
                colorCode = "008000";
                break;
            case BLUE:
                colorCode = "0000FF";
                break;
            case INDIGO:
                colorCode = "4B0082";
                break;
            case VIOLET:
                colorCode = "EE82EE";
                break;
            default:
                break;
        }
        return colorCode;
    }
}

enum RainbowColor {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}
 
 */
//26
//http://cirovladimir.wordpress.com/2010/07/12/java-switch-sobre-una-cadena/
/*
public class Ejemplo{
    public static void main(String[] args) {
        Day day= Day.SUNDAY;
        System.out.println(day.toDay("MONDAY"));
    }
}


enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY,
    NOVALUE;

    public static Day toDay(String str)
    {
        try {
            return valueOf(str);
        } 
        catch (IllegalArgumentException ex) {
            return NOVALUE;
        }
    } 

 public static Day toDay(String str)
    {
        for(Day day:EnumSet.allOf(Day.class)){
       
        if(day.toString().equals(str)){
       
       
        return day;
       
        }
        }
        return Day.NOVALUE;
    } 


}
*/


//25 
//http://javarevisited.blogspot.mx/2011/08/enum-in-java-example-tutorial.html
//http://cirovladimir.wordpress.com/2010/07/12/java-switch-sobre-una-cadena/

/*
public class Ejemplo{
    public static void main(String[] args) {
        //ver las enumeraciones
        for (Mascota m: Mascota.values())
        {
            System.out.println(m);
        }
        

    }
}


enum Mascota{

    GATO("felino"){
        public String metodo(){
            return "maullar";
        }

    },PERRO("canino"){
        public String metodo(){
            return "ladrar";
        }
    };

    private String mascota;

    private Mascota(String m){
        mascota=m;
    }

    public String getMascota(){
        return mascota;
    }


}
*/

//24
/*
public class Ejemplo{
    TipoSoftware tipoSoftw;
    public Ejemplo(TipoSoftware tipo){
        tipoSoftw=tipo;
    }

    public void ver(){
        switch(tipoSoftw){
            case OPEN:
            
            System.out.println(TipoSoftware.OPEN.getTipo());
            break;

            case FREE:
            System.out.println(TipoSoftware.FREE.getTipo());
            break;

            case PROPRIETARY:
            System.out.println(TipoSoftware.PROPRIETARY.getTipo());
            break;

            default:
            System.out.println("nada");
            break;
        }
    }
 public static void main(String[] args) {
     TipoSoftware tipo;
     String cad=args[0];
     if(cad.equalsIgnoreCase("microsoft")){
        tipo=TipoSoftware.PROPRIETARY;
     }else if(cad.equalsIgnoreCase("linux")){
        tipo=TipoSoftware.FREE;
     }else{     
        tipo=TipoSoftware.OPEN;
     }
     new Ejemplo(tipo).ver();
 }
}

enum TipoSoftware{
    OPEN("open source"), FREE("free") ,PROPRIETARY("proprietary software");

    private String tipo;

    private TipoSoftware(String t){
        this.tipo=t;
    }

    public String getTipo(){
        return tipo;
    }


}
*/

//23
/*
public class Ejemplo{
    TipoSoftware tipoSoftw;
    public Ejemplo(TipoSoftware tipo){
        tipoSoftw=tipo;
    }

    public void ver(){
        switch(tipoSoftw){
            case OPEN:
            
            System.out.println(TipoSoftware.OPEN.getTipo());
            break;

            case FREE:
            System.out.println(TipoSoftware.FREE.getTipo());
            break;

            case PROPRIETARY:
            System.out.println(TipoSoftware.PROPRIETARY.getTipo());
            break;

            default:
            System.out.println("nada");
            break;
        }
    }
 public static void main(String[] args) {
     TipoSoftware tipo= TipoSoftware.OPEN;
     new Ejemplo(tipo).ver();
 }
}

enum TipoSoftware{
    OPEN("open source"), FREE("free") ,PROPRIETARY("proprietary software");

    private String tipo;

    
    
    private TipoSoftware(String t){
        this.tipo=t;
    }

    public String getTipo(){
        return tipo;
    }


}*/
//22
/*
public class Ejemplo{
    int cont=9;

    public void logIn(){
        int cont=10;
        System.out.println("contador local: "+cont+"  --"+new Ejemplo().getClass().getName());
    }

    public void conteo(){
        System.out.println("contador instaciado: "+"  --"+new Ejemplo().getClass().getName());
    }

    public static void main(String[] args) {
        new Ejemplo().logIn();
        new Ejemplo().conteo();

        new Servidor().logIn();
        new Servidor().conteo(9);
    }
}
class Servidor{
int cont;
    public Servidor(){}

    public void logIn(){
        int cont=10;
        System.out.println("contador local: "+cont+"  --"+new Servidor().getClass().getName());
    }

    public void conteo(int i){
        cont=i;
        System.out.println("contador instanciado: "+cont+"  --"+new Servidor().getClass().getName());
    }
}
*/

//21
/*
public class Ejemplo{

    public static void main(String[] args) {
        Soporte s= new Clase(20,21);
        s.ver();
    }
}
interface Servicio{
    public abstract void ver();
}

abstract class Soporte implements Servicio{
    public abstract int suma();
}

abstract class Ayuda extends Soporte{
    public abstract int resta();
}

class Clase extends Ayuda{
    private int num1;
    private int num2;

    public Clase(){}

    public Clase(int n1,int n2){
        num1=n1;
        num2=n2;
    }

    @Override
    public int suma(){
        return num1+num2;
    }

    @Override
    public int resta(){
        return num1-num2;
    }

    @Override
    public void ver(){
        System.out.println("suma: "+suma());
        System.out.println("resta: "+resta());
    }
}
*/


//20
/*
public class Ejemplo{

    public static void main(String[] args) {
        Soporte s=new Clase(12,45);
        s.ver();
    }
}

abstract class Servicio{
    public abstract void ver();
}

abstract class Soporte extends Servicio{
    public abstract int suma();
}

class Clase extends Soporte{
    private int num1;
    private int num2;

    public Clase(){}

    public Clase(int n1,int n2){
        num1=n1;
        num2=n2;
    }

    @Override
    public int suma(){
        return num1+num2;
    }

    @Override
    public void ver(){
        System.out.println("suma: "+suma());
    }
}
*/
//19
/*
import java.lang.*;
import java.lang.Thread;
import java.util.Random;

public class Ejemplo{

    public static void main(String[] args) {
        Clase t1,t2;
       t1=new Clase("Fernando");
       t2=new Clase("Camila");
    }
}


class Clase implements Runnable{
        public static final int MAX=7;
     private Thread hilo;
     private String msg;

     public Clase(String m){
        msg=m;
        hilo=new Thread(this);
        hilo.start();
     }
     @Override
     public void run(){
        System.out.println("iniciando hilo ..."+this.msg);
        try{
           for(int i=0;i<=MAX;i++){     
           Thread.sleep(1000);
           System.out.println("No. aleatorio generado: "+aleatorio());
          }
        }catch(InterruptedException ex){
                System.err.println(ex.getCause());
        }
        System.out.println("Finalizando hilo..."+this.msg);
     }
     public int aleatorio(){
        int numero;
        Random azar=new Random();
        numero=((int)azar.nextInt(12)*99)+1;
        return numero;
     }
}
*/
//18
/*
public class Ejemplo{

    public static void main(String[] args) {
        System.out.println("valor: "+UserStatus.ACTIVE.getStatusCode());
    }
}

enum UserStatus {
    PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D");
 
    private String statusCode;
 
    private UserStatus(String s) {
        statusCode = s;
    }
 
    public String getStatusCode() {
        return statusCode;
    }
 
}
*/

//17
/*
//ejecutar un .bat u otro archivo
public void ejecutar(String archivo){
        try {
            String comando;
            Process proceso = Runtime.getRuntime().exec(archivo);
            BufferedReader lector = new BufferedReader (new InputStreamReader (proceso.getInputStream()));
            while ((comando = lector.readLine()) != null) {
                System.out.println(comando);
            }
                lector.close();
            }catch (Exception err) {
                err.printStackTrace();
            }
    }

    */


//16
/*
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class Ejemplo{

    public static void main(String[] args) {
        LinkedList<String>  listaLigada=new LinkedList<String>();
        listaLigada.add("34");
        listaLigada.add("7");
        listaLigada.add("45");
        listaLigada.add("67");
        System.out.println(listaLigada);
        listaLigada.remove(1);
        System.out.println(listaLigada);

    }
}
*/

//15
//List<Date> listOfDates = Arrays.asList(arrayOfDates);
//List<Date> listOfDates = Arrays.asList(new Date[]{date1, date2});
//convertir la lista a arreglo
//Date[] arrayOfDates = listOfDates.toArray(new Date[]{});

//14
/*

public class TradingSystem{
   public String getDescription(){
      return "electronic trading system";
   }
}

public class DirectMarketAccessSystem extends TradingSystem{
   public String getDescription(){
     return "direct market access system";
   }
}

public class CommodityTradingSystem extends TradingSystem{
   public String getDescription(){
     return "Futures trading system";
   }
}
*/

//Read more: http://javarevisited.blogspot.com/2011/08/what-is-polymorphism-in-java-example.html#ixzz2I5ZJrQ9o

//13
/*
import javax.swing.JOptionPane;

public class Ejemplo{
    public static void main(String[] args) {
    

    }
}

class Nodo{
    private Object contiene;//dato
    private Nodo siguiente;//enlace

    public Nodo(){}

    public Nodo(Object c,Nodo s){
        contiene=c;
        siguiente=s;
    }

    public void setContiene(Object c){
        contiene=c;
    }

    public Object getContiene(){
        return contiene;
    }


    public void setSiguiente(Nodo s){
        siguiente=s;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

}


public class ListaS {
    private Nodo primero;
    private Nodo ultimo;
    private int tamano;
    public ListaS() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }
//Metodo utilizado para denotar que la lista se encuentra vacia.
    public boolean siVacio() {
        return (this.primero == null);
    }
//Metodo para agregar al final de la lista.
    public ListaS addLast(int dato) {
        if(siVacio()) {
            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        }
        else {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
        return this;
    }
//Metodo para borrar al final de la lista.
    public Nodo deleteLast() {
        Nodo eliminar = null;
        if(siVacio()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
            return null;
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }
        else {
            Nodo actual = primero;
            while(actual.nodoDer != ultimo) {
                actual = actual.nodoDer;
            }
            eliminar = actual.nodoDer;
            actual.nodoDer = null;
            ultimo = actual;
        }
        this.tamano--;
        return eliminar;
    }
//Metodo que imprime el tamaño de la lista.
    public void tamano() {
        JOptionPane.showMessageDialog(null, "El tamaño es:\n " + this.tamano);
    }
//Metodo que imprime la lista y los valores ingresados.
    public void imprimir() {
        if(tamano != 0) {
            Nodo temp = primero;
            String str = "";
            for(int i = 0; i < this.tamano; i++) {
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;
            }
            JOptionPane.showMessageDialog(null, str);
        }
    }
}
*/

//12 sobre Nodos
//https://www.youtube.com/watch?v=yJzbMOyK41A
/*
public class Ejemplo{

    public static void main(String[] args) {
        Lapiz lp1=new Lapiz(3,1,"2B","verde");
        Lapiz lp2=new Lapiz(3,2,"HB","rojo");
        Lapiz lp3=new Lapiz(3,1,"2B","azul");
        Lapiz lp4=new Lapiz(3,1,"2A","amarillo");

        Nodo n1=new Nodo(lp1);
        Nodo n2=new Nodo(lp2);
        Nodo n3=new Nodo(lp3);
        Nodo n4=new Nodo(lp4);

        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        n3.setSiguiente(n4);

        Nodo aux= n1;
        for(int i=0;i<4;i++){
            Lapiz aux2=(Lapiz)aux.getContiene();
            System.out.println(" tamanyo: "+aux2.getTamanyo()+" ,peso: "+aux2.getPeso()+" ,color: "+aux2.getColor()+" ,tipo: "+aux2.getTipo());
            aux=(Nodo)aux.getSiguiente();
        }

    }

}

class Lapiz{
    int tamanyo;
    int peso;
    String tipo;
    String color;

    public Lapiz(int tam,int pes, String tip,String col){
        tamanyo=tam;
        peso=pes;
        tipo=tip;
        color=col;
    }

    public int getTamanyo(){
        return tamanyo;
    }

    public int getPeso(){
        return peso;
    }

    public String getTipo(){
        return tipo;
    }

    public String getColor(){
        return color;
    }
}


class Nodo{
    private Nodo siguiente;//siguiente
    private Object contiene;//contenido

    public Nodo(){
        siguiente=null;
        contiene=null;
    }

    public Nodo(Object obj){
        siguiente=null;
        contiene=obj;
    }

    public Nodo(Object obj,Nodo sig){
        siguiente=sig;
        contiene=obj;
    }

    
    public void setSiguiente(Nodo sig){
        this.siguiente=sig;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setContiene(Object obj){
        this.contiene=obj;
    }
    
    public Object getContiene(){
        return contiene;
    }


}

*/

//11
//http://www.youtube.com/watch?v=5sKyhB-YWkk
/*
public class Ejemplo{

    public static void main(String[] args) {  
        Persona[] p=new Persona[2];

        Persona alum= new Alumno("Fernando","Carraro");
        Persona prof= new Profesor("Andres","Lopez");

        p[0]= alum;
        p[1]=prof;

for(int i=0; i<p.length;i++){
    System.out.println(p[i].getNombre());
    if(p[i] instanceof Alumno){
        System.out.println("alumno "+p[i].getNombre());
    }
    if(p[i] instanceof Profesor){
System.out.println("profesor "+p[i].getNombre());
    }
}


    } 


}

abstract class Persona{
    protected String nombre;
    protected int edad;
    protected String apellidos;
    protected int salario;

    public Persona(){}
    public Persona(String nom,String ape){
        nombre=nom;
        apellidos=ape;
    }

    public abstract String hablar();

    public String getNombre(){
        return nombre;
    }



}

class Alumno extends Persona{
    public Alumno(){}
    public Alumno(String nom,String ape){
        nombre=nom;
        apellidos=ape;
    }

    @Override
    public String hablar(){
        return "alumno habla";
    }

}

class Profesor extends Persona{
    public Profesor(){}

    public Profesor(String nom,String ape){
        nombre=nom;
        apellidos=ape;
    }


    @Override
    public String hablar(){
        return "profesor habla";
    }
}
*/

//10
/*
public class Ejemplo{

    public static void main(String[] args) {  
        Alumno a1= new Alumno();
        Alarma.despertar(a1);
        Despertable d1= new Alumno();
        Alarma.despertar(d1);
    } 


}

interface Despertable{
    public static final int DORMIDO=1;
    public static final int DESPIERTO=2;
    public void despierta();
}

class Alumno implements Despertable{

    public Alumno(){}

    int estado=DESPIERTO;
    public void dormir(){
        estado=Despertable.DORMIDO;
        String res= estado==2 ? "despierto" : "dormido";
        System.out.println(res);
    }

    @Override
    public void despierta(){
        estado=DESPIERTO;
        String res= estado==2 ? "despierto" : "dormido";
        System.out.println(res);
    }

}

class Alarma{
    public static void despertar(Despertable d){
        d.despierta();
    }
}
*/
//9
/*
public class Ejemplo{

    Clase clase;

    public Ejemplo(){}

    public Ejemplo(Clase c){
        clase=c;
    }

    public void activa(){
        clase.ver();
    }
    
    public static void main(String[] args) {  
        new Ejemplo(new Otra()).activa();
    }   
}

interface Servicio{
    void getEdad();
}

abstract class Clase implements Servicio{
    private int edad;

    public Clase(){}

//Si la clase que implementa la interface se declara 
//como abstracta no tiene por qué 
    //implementar los metodos de la interface en este caso el
    // método ver()

    public abstract void ver();
}

class Otra extends Clase{
    public Otra(){}
    @Override
    public void getEdad(){
        System.out.println("tiene 4 anyos");
    }

    @Override
    public void ver(){
        getEdad();
    }

}
*/
//8
/*
import java.util.List;
import java.util.ArrayList;

public class Ejemplo{
    Servicio servicio;

    public Ejemplo(){}

    public Ejemplo(Servicio serv){
        servicio=serv;
    }

    public void activa(){
        servicio.ver();
    }

    public static void main(String[] args) {  
        new Ejemplo(new Clase()).activa();
    }   
}


class Animal{
    private String nombre;
    public Animal(){}

    public Animal(String n){
        this.nombre=n;
    }

    public String getNombre(){
        return nombre;
    }

    public String toString(){
        return String.format("##Animal(nombre: %s)",nombre);
    }

}

abstract class Servicio{
    public abstract void ver();
    public abstract List<Animal> datos();
}

class Clase extends Servicio{

public Clase(){}

    
@Override
public void ver(){
    System.out.println("lista: ");
        // se asigna el valor de la lista datos() a la lista listaAnimales  
        List<Animal> listaAnimales = new Clase().datos();  
        System.out.println("Hay " + listaAnimales.size() + " animales ");  

        for(Animal a : listaAnimales) 
        { 
            System.out.println("nombre: " + a.getNombre()); 
        } 
}


@Override
public List<Animal> datos(){
    List<Animal> animales=new ArrayList<Animal>();
        String[] nombres={"Jaguar","Toro","Rinoceronte"};
        for(int cont=0;cont<nombres.length;cont++){
            animales.add(new Animal(nombres[cont]));
        }
        return animales;
}



}
*/
//7

/*
import java.util.List;
import java.util.ArrayList;


public class Ejemplo{
    Servicio servicio;

    public Ejemplo(){}

    public Ejemplo(Servicio serv){
        servicio=serv;
    }

    public void activa(){
        servicio.ver();
    }

    public static void main(String[] args) {  
        new Ejemplo(new Clase()).activa();
    }   
}

class Persona{
    private String nombre;
    private int edad;

    public Persona(){}

    public Persona(String n,int d){
        this.nombre=n;
        this.edad=d;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
}

abstract class Servicio{
    public abstract List<Persona> datos();
    public abstract void ver();
}

class Clase extends Servicio{
    public Clase(){}
    @Override
    public List<Persona> datos(){
        List<Persona> personas=new ArrayList<Persona>();
        String[] nombres={"Fernando","Camila","Daniel"};
        int[]edades={31,2,30};
        for(int cont=0;cont<nombres.length;cont++){
            personas.add(new Persona(nombres[cont],edades[cont]));
        }
        return personas;
    }

    @Override
    public void ver(){
        System.out.println("lista: ");
        // se asigna el valor de la lista datos() a la lista listaPersonas  
        List<Persona> listaPersonas = new Clase().datos();  
        System.out.println("Hay " + listaPersonas.size() + " personas ");  

        for(Persona p : listaPersonas) 
        { 
            System.out.println("nombre: " + p.getNombre()+" , edad: "+p.getEdad()); 
        } 
    }
}
*/
//6
/*
public class Ejemplo{
    Servicio servicio;

    public Ejemplo(Servicio serv){
        this.servicio=serv;
    }

    public void activa(){
        servicio.ver();
    }

    public static void main(String[] args) {
        new Ejemplo(new Esfera(2.9)).activa();
    }
}

abstract class Servicio{
    public abstract double volumen();
    public abstract void ver();
}

class Esfera extends Servicio{
    private double radio;

    public Esfera(double r){
        this.radio=r;
    }

    @Override
    public double volumen(){
        return (4*Math.PI*Math.pow(radio,3))/3;
    }

    @Override
    public void ver(){
        System.out.println("volumen obtenido: "+volumen());
    }

}
*/


//5
/*
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejemplo{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(1);
        Collections.sort(list, new MyIntComparable());
        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println(list.getClass().getName());

	}
}



class MyIntComparable implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
    }
}
*/

//4

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Ejemplo {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            Arrays.sort(args);
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } else {
            List lines = new ArrayList();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    System.in));
            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            Collections.sort(lines);
            for (Iterator i = lines.iterator(); i.hasNext();) {
                System.out.println(i.next());
            }
        }
    }
}
*/

//3
/*
import static java.lang.System.out;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Ejemplo {

	public static void main(String[] args) {
		Integer[] valores={67,7,32,12,1,3,4,5,13,5,21,12};
		Arrays.sort(valores);
		List<Integer> lista=Arrays.asList(valores);
		out.println("lista: "+lista);
		out.println("tamanyo: "+lista.size());
		for(int i=0;i<lista.size();i++){
			out.println(lista.get(i));
		}
		String llena= !lista.isEmpty() ? "llena" : "vacia"; 
		out.println("la lista esta "+llena);
		for(Integer e: lista){
			out.println(e);
		}
		out.println("lista: ");
		Iterator<Integer> iterator = lista.iterator();
	      while (iterator.hasNext()) {
		out.println(iterator.next());
	}

	out.println("lista: ");
	int j = 0;
	while (j < lista.size()) {
		out.println(lista.get(j));
		j++;
	}

	out.println("\nFrecuencia del 12");
	out.println("12 : " + Collections.frequency(lista, 12));
 
	out.println("\nFrecuencias");
	Set<Integer> uniqueSet = new HashSet<Integer>(lista);
	for (Integer temp : uniqueSet) {
		out.println(temp + ": " + Collections.frequency(lista, temp));
	}
		

	}
}
*/

//2
/*
import java.util.*;
//http://xahlee.info/java-a-day/pairings_reduce.html

public class Ejemplo {

    static HashMap combo (int n) {
        HashMap result = new HashMap(100);
        for (int j=1; j <= n; j++) {
            for (int i=1; i < j; i++) {
                int[] v= {i,j};
                result.put(i+ ","+j, v);
            }
        }
        return result;
    }

    static HashMap reduce (HashMap pairings, int[] pair) {
        int[] k= new int[2];
        int[] j= pair;
        HashMap newP = new HashMap(pairings); // make a copy to work with inside destructive loop
        newP.remove(j[0]+","+j[1]);
        for (Iterator it=pairings.values().iterator(); it.hasNext(); ){
            k = (int[]) it.next();
            if (k[0]==j[0]) {
                if (j[1] < k[1]) {
                    newP.remove(j[1]+","+k[1]);
                }
                else {
                    newP.remove(k[1]+","+j[1]);
                }
            }
            if (k[1]==j[0]) {
                if (k[0] < j[1]) {
                    newP.remove(k[0]+","+j[1]);
                } 
                else {
                    newP.remove(j[1]+","+k[0]);
                }
            }
        }
        return newP;
    }

    public static void main(String[] args) {
        HashMap result = new HashMap(100);
        HashMap result2 = new HashMap(100);
        int[] pair= {2,3};
        result = combo(5);
        System.out.println(result.keySet().toString());
        System.out.println( reduce(result, pair).keySet().toString());
    }
}
*/

//1
/*
import java.util.List;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.System.out;
import java.util.Collections;
public class Ejemplo{

	public static final int TAM=4;

	public static void main(String[] args) {

		String[] nombres=new String[TAM];
		List<String> lista=new ArrayList<String>();
		for(int i=0;i<TAM;i++){
			nombres[i]=showInputDialog("nombre no. "+String.valueOf(i));
		}

		for(String e: nombres){
			lista.add(e);
		}

		out.println(lista);
		Collections.sort(lista);
		out.println(lista);
		for(int i=0;i<lista.size();i++){
			out.println(lista.get(i));
		}

	}
}
*/

//16
/*
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class Ejemplo{

    public static void main(String[] args) {
        LinkedList<String>  listaLigada=new LinkedList<String>();
        listaLigada.add("34");
        listaLigada.add("7");
        listaLigada.add("45");
        listaLigada.add("67");
        System.out.println(listaLigada);
        listaLigada.remove(1);
        System.out.println(listaLigada);

    }
}
*/

//15
//List<Date> listOfDates = Arrays.asList(arrayOfDates);
//List<Date> listOfDates = Arrays.asList(new Date[]{date1, date2});
//convertir la lista a arreglo
//Date[] arrayOfDates = listOfDates.toArray(new Date[]{});

//14
/*

public class TradingSystem{
   public String getDescription(){
      return "electronic trading system";
   }
}

public class DirectMarketAccessSystem extends TradingSystem{
   public String getDescription(){
     return "direct market access system";
   }
}

public class CommodityTradingSystem extends TradingSystem{
   public String getDescription(){
     return "Futures trading system";
   }
}
*/

//Read more: http://javarevisited.blogspot.com/2011/08/what-is-polymorphism-in-java-example.html#ixzz2I5ZJrQ9o

//13
/*
import javax.swing.JOptionPane;

public class Ejemplo{
    public static void main(String[] args) {
    

    }
}

class Nodo{
    private Object contiene;//dato
    private Nodo siguiente;//enlace

    public Nodo(){}

    public Nodo(Object c,Nodo s){
        contiene=c;
        siguiente=s;
    }

    public void setContiene(Object c){
        contiene=c;
    }

    public Object getContiene(){
        return contiene;
    }


    public void setSiguiente(Nodo s){
        siguiente=s;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

}


public class ListaS {
    private Nodo primero;
    private Nodo ultimo;
    private int tamano;
    public ListaS() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }
//Metodo utilizado para denotar que la lista se encuentra vacia.
    public boolean siVacio() {
        return (this.primero == null);
    }
//Metodo para agregar al final de la lista.
    public ListaS addLast(int dato) {
        if(siVacio()) {
            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        }
        else {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
        return this;
    }
//Metodo para borrar al final de la lista.
    public Nodo deleteLast() {
        Nodo eliminar = null;
        if(siVacio()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
            return null;
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }
        else {
            Nodo actual = primero;
            while(actual.nodoDer != ultimo) {
                actual = actual.nodoDer;
            }
            eliminar = actual.nodoDer;
            actual.nodoDer = null;
            ultimo = actual;
        }
        this.tamano--;
        return eliminar;
    }
//Metodo que imprime el tamaño de la lista.
    public void tamano() {
        JOptionPane.showMessageDialog(null, "El tamaño es:\n " + this.tamano);
    }
//Metodo que imprime la lista y los valores ingresados.
    public void imprimir() {
        if(tamano != 0) {
            Nodo temp = primero;
            String str = "";
            for(int i = 0; i < this.tamano; i++) {
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;
            }
            JOptionPane.showMessageDialog(null, str);
        }
    }
}
*/

//12 sobre Nodos
//https://www.youtube.com/watch?v=yJzbMOyK41A
/*
public class Ejemplo{

    public static void main(String[] args) {
        Lapiz lp1=new Lapiz(3,1,"2B","verde");
        Lapiz lp2=new Lapiz(3,2,"HB","rojo");
        Lapiz lp3=new Lapiz(3,1,"2B","azul");
        Lapiz lp4=new Lapiz(3,1,"2A","amarillo");

        Nodo n1=new Nodo(lp1);
        Nodo n2=new Nodo(lp2);
        Nodo n3=new Nodo(lp3);
        Nodo n4=new Nodo(lp4);

        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        n3.setSiguiente(n4);

        Nodo aux= n1;
        for(int i=0;i<4;i++){
            Lapiz aux2=(Lapiz)aux.getContiene();
            System.out.println(" tamanyo: "+aux2.getTamanyo()+" ,peso: "+aux2.getPeso()+" ,color: "+aux2.getColor()+" ,tipo: "+aux2.getTipo());
            aux=(Nodo)aux.getSiguiente();
        }

    }

}

class Lapiz{
    int tamanyo;
    int peso;
    String tipo;
    String color;

    public Lapiz(int tam,int pes, String tip,String col){
        tamanyo=tam;
        peso=pes;
        tipo=tip;
        color=col;
    }

    public int getTamanyo(){
        return tamanyo;
    }

    public int getPeso(){
        return peso;
    }

    public String getTipo(){
        return tipo;
    }

    public String getColor(){
        return color;
    }
}


class Nodo{
    private Nodo siguiente;//siguiente
    private Object contiene;//contenido

    public Nodo(){
        siguiente=null;
        contiene=null;
    }

    public Nodo(Object obj){
        siguiente=null;
        contiene=obj;
    }

    public Nodo(Object obj,Nodo sig){
        siguiente=sig;
        contiene=obj;
    }

    
    public void setSiguiente(Nodo sig){
        this.siguiente=sig;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setContiene(Object obj){
        this.contiene=obj;
    }
    
    public Object getContiene(){
        return contiene;
    }


}

*/

//11
//http://www.youtube.com/watch?v=5sKyhB-YWkk
/*
public class Ejemplo{

    public static void main(String[] args) {  
        Persona[] p=new Persona[2];

        Persona alum= new Alumno("Fernando","Carraro");
        Persona prof= new Profesor("Andres","Lopez");

        p[0]= alum;
        p[1]=prof;

for(int i=0; i<p.length;i++){
    System.out.println(p[i].getNombre());
    if(p[i] instanceof Alumno){
        System.out.println("alumno "+p[i].getNombre());
    }
    if(p[i] instanceof Profesor){
System.out.println("profesor "+p[i].getNombre());
    }
}


    } 


}

abstract class Persona{
    protected String nombre;
    protected int edad;
    protected String apellidos;
    protected int salario;

    public Persona(){}
    public Persona(String nom,String ape){
        nombre=nom;
        apellidos=ape;
    }

    public abstract String hablar();

    public String getNombre(){
        return nombre;
    }



}

class Alumno extends Persona{
    public Alumno(){}
    public Alumno(String nom,String ape){
        nombre=nom;
        apellidos=ape;
    }

    @Override
    public String hablar(){
        return "alumno habla";
    }

}

class Profesor extends Persona{
    public Profesor(){}

    public Profesor(String nom,String ape){
        nombre=nom;
        apellidos=ape;
    }


    @Override
    public String hablar(){
        return "profesor habla";
    }
}
*/

//10
/*
public class Ejemplo{

    public static void main(String[] args) {  
        Alumno a1= new Alumno();
        Alarma.despertar(a1);
        Despertable d1= new Alumno();
        Alarma.despertar(d1);
    } 


}

interface Despertable{
    public static final int DORMIDO=1;
    public static final int DESPIERTO=2;
    public void despierta();
}

class Alumno implements Despertable{

    public Alumno(){}

    int estado=DESPIERTO;
    public void dormir(){
        estado=Despertable.DORMIDO;
        String res= estado==2 ? "despierto" : "dormido";
        System.out.println(res);
    }

    @Override
    public void despierta(){
        estado=DESPIERTO;
        String res= estado==2 ? "despierto" : "dormido";
        System.out.println(res);
    }

}

class Alarma{
    public static void despertar(Despertable d){
        d.despierta();
    }
}
*/
//9
/*
public class Ejemplo{

    Clase clase;

    public Ejemplo(){}

    public Ejemplo(Clase c){
        clase=c;
    }

    public void activa(){
        clase.ver();
    }
    
    public static void main(String[] args) {  
        new Ejemplo(new Otra()).activa();
    }   
}

interface Servicio{
    void getEdad();
}

abstract class Clase implements Servicio{
    private int edad;

    public Clase(){}

//Si la clase que implementa la interface se declara 
//como abstracta no tiene por qué 
    //implementar los metodos de la interface en este caso el
    // método ver()

    public abstract void ver();
}

class Otra extends Clase{
    public Otra(){}
    @Override
    public void getEdad(){
        System.out.println("tiene 4 anyos");
    }

    @Override
    public void ver(){
        getEdad();
    }

}
*/
//8
/*
import java.util.List;
import java.util.ArrayList;

public class Ejemplo{
    Servicio servicio;

    public Ejemplo(){}

    public Ejemplo(Servicio serv){
        servicio=serv;
    }

    public void activa(){
        servicio.ver();
    }

    public static void main(String[] args) {  
        new Ejemplo(new Clase()).activa();
    }   
}


class Animal{
    private String nombre;
    public Animal(){}

    public Animal(String n){
        this.nombre=n;
    }

    public String getNombre(){
        return nombre;
    }

    public String toString(){
        return String.format("##Animal(nombre: %s)",nombre);
    }

}

abstract class Servicio{
    public abstract void ver();
    public abstract List<Animal> datos();
}

class Clase extends Servicio{

public Clase(){}

    
@Override
public void ver(){
    System.out.println("lista: ");
        // se asigna el valor de la lista datos() a la lista listaAnimales  
        List<Animal> listaAnimales = new Clase().datos();  
        System.out.println("Hay " + listaAnimales.size() + " animales ");  

        for(Animal a : listaAnimales) 
        { 
            System.out.println("nombre: " + a.getNombre()); 
        } 
}


@Override
public List<Animal> datos(){
    List<Animal> animales=new ArrayList<Animal>();
        String[] nombres={"Jaguar","Toro","Rinoceronte"};
        for(int cont=0;cont<nombres.length;cont++){
            animales.add(new Animal(nombres[cont]));
        }
        return animales;
}



}
*/
//7

/*
import java.util.List;
import java.util.ArrayList;


public class Ejemplo{
    Servicio servicio;

    public Ejemplo(){}

    public Ejemplo(Servicio serv){
        servicio=serv;
    }

    public void activa(){
        servicio.ver();
    }

    public static void main(String[] args) {  
        new Ejemplo(new Clase()).activa();
    }   
}

class Persona{
    private String nombre;
    private int edad;

    public Persona(){}

    public Persona(String n,int d){
        this.nombre=n;
        this.edad=d;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
}

abstract class Servicio{
    public abstract List<Persona> datos();
    public abstract void ver();
}

class Clase extends Servicio{
    public Clase(){}
    @Override
    public List<Persona> datos(){
        List<Persona> personas=new ArrayList<Persona>();
        String[] nombres={"Fernando","Camila","Daniel"};
        int[]edades={31,2,30};
        for(int cont=0;cont<nombres.length;cont++){
            personas.add(new Persona(nombres[cont],edades[cont]));
        }
        return personas;
    }

    @Override
    public void ver(){
        System.out.println("lista: ");
        // se asigna el valor de la lista datos() a la lista listaPersonas  
        List<Persona> listaPersonas = new Clase().datos();  
        System.out.println("Hay " + listaPersonas.size() + " personas ");  

        for(Persona p : listaPersonas) 
        { 
            System.out.println("nombre: " + p.getNombre()+" , edad: "+p.getEdad()); 
        } 
    }
}
*/
//6
/*
public class Ejemplo{
    Servicio servicio;

    public Ejemplo(Servicio serv){
        this.servicio=serv;
    }

    public void activa(){
        servicio.ver();
    }

    public static void main(String[] args) {
        new Ejemplo(new Esfera(2.9)).activa();
    }
}

abstract class Servicio{
    public abstract double volumen();
    public abstract void ver();
}

class Esfera extends Servicio{
    private double radio;

    public Esfera(double r){
        this.radio=r;
    }

    @Override
    public double volumen(){
        return (4*Math.PI*Math.pow(radio,3))/3;
    }

    @Override
    public void ver(){
        System.out.println("volumen obtenido: "+volumen());
    }

}
*/


//5
/*
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejemplo{
  public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(1);
        Collections.sort(list, new MyIntComparable());
        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println(list.getClass().getName());

	}
}



class MyIntComparable implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
    }
}
*/

//4

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Ejemplo {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            Arrays.sort(args);
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } else {
            List lines = new ArrayList();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    System.in));
            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            Collections.sort(lines);
            for (Iterator i = lines.iterator(); i.hasNext();) {
                System.out.println(i.next());
            }
        }
    }
}
*/

//3
/*
import static java.lang.System.out;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Ejemplo {

	public static void main(String[] args) {
		Integer[] valores={67,7,32,12,1,3,4,5,13,5,21,12};
		Arrays.sort(valores);
		List<Integer> lista=Arrays.asList(valores);
		out.println("lista: "+lista);
		out.println("tamanyo: "+lista.size());
		for(int i=0;i<lista.size();i++){
			out.println(lista.get(i));
		}
		String llena= !lista.isEmpty() ? "llena" : "vacia"; 
		out.println("la lista esta "+llena);
		for(Integer e: lista){
			out.println(e);
		}
		out.println("lista: ");
		Iterator<Integer> iterator = lista.iterator();
	      while (iterator.hasNext()) {
		out.println(iterator.next());
	}

	out.println("lista: ");
	int j = 0;
	while (j < lista.size()) {
		out.println(lista.get(j));
		j++;
	}

	out.println("\nFrecuencia del 12");
	out.println("12 : " + Collections.frequency(lista, 12));
 
	out.println("\nFrecuencias");
	Set<Integer> uniqueSet = new HashSet<Integer>(lista);
	for (Integer temp : uniqueSet) {
		out.println(temp + ": " + Collections.frequency(lista, temp));
	}
		

	}
}
*/

//2
/*
import java.util.*;
//http://xahlee.info/java-a-day/pairings_reduce.html

public class Ejemplo {

    static HashMap combo (int n) {
        HashMap result = new HashMap(100);
        for (int j=1; j <= n; j++) {
            for (int i=1; i < j; i++) {
                int[] v= {i,j};
                result.put(i+ ","+j, v);
            }
        }
        return result;
    }

    static HashMap reduce (HashMap pairings, int[] pair) {
        int[] k= new int[2];
        int[] j= pair;
        HashMap newP = new HashMap(pairings); // make a copy to work with inside destructive loop
        newP.remove(j[0]+","+j[1]);
        for (Iterator it=pairings.values().iterator(); it.hasNext(); ){
            k = (int[]) it.next();
            if (k[0]==j[0]) {
                if (j[1] < k[1]) {
                    newP.remove(j[1]+","+k[1]);
                }
                else {
                    newP.remove(k[1]+","+j[1]);
                }
            }
            if (k[1]==j[0]) {
                if (k[0] < j[1]) {
                    newP.remove(k[0]+","+j[1]);
                } 
                else {
                    newP.remove(j[1]+","+k[0]);
                }
            }
        }
        return newP;
    }

    public static void main(String[] args) {
        HashMap result = new HashMap(100);
        HashMap result2 = new HashMap(100);
        int[] pair= {2,3};
        result = combo(5);
        System.out.println(result.keySet().toString());
        System.out.println( reduce(result, pair).keySet().toString());
    }
}
*/

//1
/*
import java.util.List;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.System.out;
import java.util.Collections;
public class Ejemplo{

	public static final int TAM=4;

	public static void main(String[] args) {

		String[] nombres=new String[TAM];
		List<String> lista=new ArrayList<String>();
		for(int i=0;i<TAM;i++){
			nombres[i]=showInputDialog("nombre no. "+String.valueOf(i));
		}

		for(String e: nombres){
			lista.add(e);
		}

		out.println(lista);
		Collections.sort(lista);
		out.println(lista);
		for(int i=0;i<lista.size();i++){
			out.println(lista.get(i));
		}

	}
}
*/