package ar.edu.utn.frba.dds.ejercicio_01;

public class AMainEjercicio1 {

  public static void main(String[] args) {
    //* Crear deportista
    Deportista deportista = new Deportista();
    deportista.setNombre("Juan");
    deportista.setApellido("Pérez");
    deportista.setPesoInicialEnKilos(75.0);
    deportista.agregarContacto("juan.perez@example.com");
    deportista.agregarContacto("+123456789");

    //* Crear ejercicios
    Ejercicio ejercicio1 = new Ejercicio();
    ejercicio1.setNombre("Correr");
    ejercicio1.setDetalle("Correr 5km a un ritmo moderado");

    Ejercicio ejercicio2 = new Ejercicio();
    ejercicio2.setNombre("Sentadillas");
    ejercicio2.setDetalle("3 series de 12 repeticiones con peso moderado");

    //* Crear día de entrenamiento y agregar ejercicios usando el método personalizado
    DiaDeEntrenamiento dia1 = new DiaDeEntrenamiento();
    dia1.setNumero(1);
    dia1.agregarEjercicio(ejercicio1);
    dia1.agregarEjercicio(ejercicio2);

    DiaDeEntrenamiento dia2 = new DiaDeEntrenamiento();
    dia2.setNumero(2);
    dia2.agregarEjercicio(ejercicio1);
    dia2.agregarEjercicio(ejercicio2);

    //* Crear rutina y agregar días de entrenamiento usando el método personalizado
    Rutina rutina = new Rutina();
    rutina.setDeportista(deportista);
    rutina.agregarDiaDeEntrenamiento(dia1);
    rutina.agregarDiaDeEntrenamiento(dia2);
  }
}
