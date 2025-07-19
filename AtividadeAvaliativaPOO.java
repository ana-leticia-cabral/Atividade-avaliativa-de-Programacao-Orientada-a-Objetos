/*
 * Tarefa 5) Para essa tarefa, escreva uma classe contendo o método "main". Nesse método:
 * - adicione comandos para criar objetos do tipo "Retangulo", "Triangulo" e "Circulo" (um objeto de cada tipo). 
 * - adicione comandos para definir valores para os atributos desses objetos, usando os métodos "set" correspondentes. 
 *- adicione o trecho de código abaixo, para adicionar os objetos criados em um ArrayList:

 *   // Adiciona as figuras geometricas em uma lista
 *   List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>() ;
 *   listaFigurasGeometricas.add( retangulo );   
 *   listaFigurasGeometricas.add( triangulo );
 *   listaFigurasGeometricas.add( circulo );
    
 * - adicione o trecho de código abaixo, para mostrar a descrição e a área das figuras que você adicionou na lista:

 *    // Mostra dados das figuras geometricas
 *   for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
 *      System.out.println( figuraGeometrica.getDescricao() );
 *      System.out.printf( "Area da figura: %.2f \n", figuraGeometrica.getArea() );
    }
 */


import java.util.ArrayList;
import java.util.List;

public class AtividadeAvaliativaPOO {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo ("Retangulo",0,0);
        retangulo.setBase(12.5);
        retangulo.setAltura(13.7);

        Triangulo triangulo = new Triangulo("Triangulo", 0, 0);
        triangulo.setBase(20.2);
        triangulo.setAltura(4.9);

        Circulo circulo = new Circulo("Circulo", 0);
        circulo.setRaio(6.7);

        // Adiciona as figuras geometricas em uma lista
        List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
        listaFigurasGeometricas.add(retangulo);
        listaFigurasGeometricas.add(triangulo);
        listaFigurasGeometricas.add(circulo);

        // Mostra dados das figuras geometricas
        for (FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
            System.out.println(figuraGeometrica.getDescricao());
            System.out.printf("Area da figura: %.2f \n ", figuraGeometrica.getArea());
        }
         /*
         * Mensagens impressas:
         * Retangulo com base 12.5 e altura 13.7
         * Area da figura: 171,25
         * Triangulo com base 20.2 e altura 4.9
         * Area da figura: 49,49
         * Valor do raio: 6.7
         * Area da figura: 141,03
         */ 
    }
}
 

/* 
 * Tarefa 1) Escreva o código de uma classe Java denominada "FiguraGeometrica". Essa classe:
 * - deve ser declarada como "abstract"
 * - deve ter um atributo "nome" para guardar o nome da figura geométrica
 * - deve um método "getArea", que retorna um valor do tipo "double" correspondente à área da figura geométrica. Esse método deverá ser declarado como "abstract", porque iremos sobrescrevê-lo nas subclasses de "FiguraGeometrica".
 * - um método "getDescricao", que retorna um valor do tipo "String" correspondente à descrição da figura geométrica. Esse método deverá ser declarado como "abstract", porque iremos sobrescrevê-lo nas subclasses de "FiguraGeometrica".
 */


abstract class FiguraGeometrica {

    private String nome;

//Métodos abstratos
    public abstract double getArea();

    public abstract String getDescricao();

// Métodos especiais
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

// Construtor
    public FiguraGeometrica(String n) {
        this.setNome(n);
    }
}


/*
 * Tarefa 2) Escreva o código de uma classe Java denominada "Retangulo". Essa classe:
 * - deve ser filha de "FiguraGeometrica"
 * - deve ter os atributos "base" e "altura" para guardar a base e a altura do retângulo
 * - deve ter um método "getArea", que sobrepõe o método definido na classe "FiguraGeometrica", e que retorna a área do retângulo.
 * - deve ter um método "getDescricao", que sobrepõe o método definido na classe "FiguraGeometrica", e que retorna um texto que mostra os valores da base e da altura do retângulo.
 */

class Retangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    // Implementando os métodos abstratos
    @Override
    public double getArea() {
        double area;
        area = (this.getBase() * this.getAltura());
        return area;

    }

    @Override
    public String getDescricao() {
        return "Retangulo com base " + this.getBase() + " e altura " + this.getAltura();
    }

    // Métodos especiais  
    public void setBase(double b) {
        this.base = b;
    }

    public double getBase() {
        return this.base;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public double getAltura() {
        return this.altura;
    }

    // Construtor
    public Retangulo(String n, double b, double a) {
        super(n);
        this.setBase(b);
        this.setAltura(a);
    }
}


/*
 * Tarefa 3) Escreva o código de uma classe Java denominada "Triangulo". Essa classe:
 * - deve ser filha de "FiguraGeometrica"
 * - deve ter os atributos "base" e "altura" para guardar a base e a altura do triângulo
 * - deve ter um método "getArea", que sobrepõe o método definido na classe "FiguraGeometrica", e que retorna a área do triângulo.
 * - deve ter um método "getDescricao", que sobrepõe o método definido na classe "FiguraGeometrica", e que retorna um texto que mostra os valores da base e da altura do triângulo.
 */

class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    // Implementando os métodos abstratos
    @Override
    public double getArea() {
        double area;
        area = (this.getBase() * this.getAltura()) / 2.0;
        return area;
    }

    @Override
    public String getDescricao() {
        return "Triangulo com base " + this.getBase() + " e altura " + this.getAltura();
    }

    // Métodos especiais
    public void setBase(double b) {
        this.base = b;
    }

    public double getBase() {
        return this.base;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public double getAltura() {
        return this.altura;
    }

    // Construtor
    public Triangulo(String n, double b, double a) {
        super(n);
        this.setBase(b);
        this.setAltura(a);
    }
}


/* 
 * Tarefa 4)Escreva o código de uma classe Java denominada "Circulo". Essa classe:
 * - deve ser filha de "FiguraGeometrica"
 * - deve ter um atributo "raio" para guardar o raio do círculo
 * - deve ter um método "getArea", que sobrepõe o método definido na classe "FiguraGeometrica", e que retorna a área do círculo.
 * - deve ter um método "getDescricao", que sobrepõe o método definido na classe "FiguraGeometrica", e que retorna um texto que mostra o valor do raio do círculo.
 */


class Circulo extends FiguraGeometrica {
    
    private double raio;

    // Implementando os métodos abstratos
    @Override
    public double getArea() {
        double area;
        area = Math.PI * Math.pow(this.getRaio(), 2);
        return area;
    }
    
    @Override
    public String getDescricao() {
        return "Valor do raio: " + this.getRaio();
    }

    //Métodos especiais
    public void setRaio(double r) {
        this.raio = r;
    }
    
    public double getRaio() {
        return this.raio;
    }

    // Construtor
    public Circulo(String n, double r) {
        super(n);
        this.setRaio(r);
    }
}


