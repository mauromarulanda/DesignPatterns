
// Definimos una interfaz común para los objetos que se pueden decorar
interface Saludo {
  void saludar();
}

// Definimos una clase concreta que implementa la interfaz
class SaludoSimple implements Saludo {
  @Override
  public void saludar() {
    System.out.println("Hola");
  }
}

// Definimos una clase abstracta que envuelve a un saludo y delega la operación
abstract class SaludoDecorador implements Saludo {
  protected Saludo saludo;

  public SaludoDecorador(Saludo saludo) {
    this.saludo = saludo;
  }

  @Override
  public void saludar() {
    saludo.saludar();
  }
}

// Definimos un decorador concreto que añade un comportamiento al saludo
class SaludoFormal extends SaludoDecorador {
  public SaludoFormal(Saludo saludo) {
    super(saludo);
  }

  @Override
  public void saludar() {
    super.saludar();
    System.out.println("Encantado de conocerle");
  }
}

// Definimos otro decorador concreto que añade otro comportamiento al saludo
class SaludoAmistoso extends SaludoDecorador {
  public SaludoAmistoso(Saludo saludo) {
    super(saludo);
  }

  @Override
  public void saludar() {
    super.saludar();
    System.out.println("¿Qué tal estás?");
  }
}

// Creamos un objeto saludo y lo decoramos con diferentes decoradores
Saludo saludo = new SaludoSimple();
saludo = new SaludoFormal(saludo);
saludo = new SaludoAmistoso(saludo);

// Llamamos al método saludar del objeto decorado
saludo.saludar();

// Salida:
// Hola
// Encantado de conocerle
// ¿Qué tal estás?
