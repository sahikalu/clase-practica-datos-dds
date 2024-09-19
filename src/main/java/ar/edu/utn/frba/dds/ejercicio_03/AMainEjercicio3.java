package ar.edu.utn.frba.dds.ejercicio_03;

public class AMainEjercicio3 {
  // corre el metodo main para persistir y ver como queda en tu DB!

  public static void main(String[] args) {

    //* -------------- Marcas --------------
    Marca lays = new Marca();
    lays.setNombre("Lays");

    Marca cocaCola = new Marca();
    cocaCola.setNombre("Coca Cola");

    Marca paty = new Marca();
    paty.setNombre("Paty");

    Marca marcaNachos = new Marca();
    marcaNachos.setNombre("Combo Nachos!");

    //* -------------- Producto Simple --------------
    ProductoSimple papas = new ProductoSimple();
    papas.setNombre("Papas");
    papas.setMarca(lays);
    papas.setPrecio(100.0);
    papas.setStock(10);


    ProductoSimple coca = new ProductoSimple();
    coca.setNombre("Coca");
    coca.setMarca(cocaCola);
    coca.setStock(20);
    coca.setPrecio(150.0);


    ProductoSimple hamburguesa = new ProductoSimple();
    hamburguesa.setNombre("Hamburguesa");
    hamburguesa.setMarca(paty);
    hamburguesa.setStock(30);
    hamburguesa.setPrecio(200.0);

    Combo ComboHamburguesaConPapasYBebida = new Combo();
    ComboHamburguesaConPapasYBebida.setNombre("Combo Hamburguesa con Papas y Bebida");
    ComboHamburguesaConPapasYBebida.setMarca(marcaNachos);
    ComboHamburguesaConPapasYBebida.agregarProducto(hamburguesa);
    ComboHamburguesaConPapasYBebida.agregarProducto(papas);
    ComboHamburguesaConPapasYBebida.agregarProducto(coca);


    DescuentoFijo descuentoFijo = new DescuentoFijo();
    descuentoFijo.setNombre("DescuentoFijo");
    descuentoFijo.setValor(100.0);


    Packaging packagingDeHamburguesa = new Packaging();

    packagingDeHamburguesa.setPrecio(50.0);
    packagingDeHamburguesa.setProducto(hamburguesa);
  }
}
