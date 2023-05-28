public class singleton {
    // Declaramos una variable estática privada para guardar la instancia única
    private static singleton instance;
  
    // El constructor es privado para evitar que se creen nuevas instancias
    private singleton() {
      // Aquí podemos inicializar otras propiedades o métodos de la clase
    }
  
    // El método estático público para obtener la instancia
    public static singleton getInstance() {
      // Si la instancia no existe, la creamos
      if (instance == null) {
        instance = new singleton();
      }
      // Si la instancia existe, la devolvemos
      return instance;
    }
  }
  