// Modelar TipoPrenda como enum porque el dominio es finito
enum TipoPrenda{
  ZAPATO,
  PANTALON,
  CAMISA,
  ZAPATILLAS,
  BLUSA,
  REMERA,
  CAMISA
}

// Modelar Material como enum porque el dominio es finito
enum Material{
  JEAN,
  GABARDINA,
  ALGODON,
  SEDA
}

// Modelar Color con el codigo sabiendo que le podemos disponibilizar al usuarie una paleta de colores
class Color{
  String codigo;
}

// Para la validacion de Prendas, si es nulo cualquiera de sus atributos lanzo excepcion generica
class PrendaInvalidaException extends RuntimeException{
  PrendaInvalidaException(String message){
    super(message);
  }
}

class Prenda{
  TipoPrenda tipo;
  Material material;
  Color principal;
  Color secundario;

  Prenda(TipoPrenda tipo, Material material, Color principal, Color secundario = null) {
    if (tipo == null || material == null || principal == null) {
      throw new PrendaInvalidaException("La prenda es invalida");
    }
    this.tipo= tipo;
    this.material = material;
    this.principal = principal;
    this.secundario = secundario;
  }
}

enum Categoria{
  PARTEINFERIOR,
  PARTESUPERIOR,
  CALZADO,
  ACCESORIO
}
// Validacion tipoPrenda con categoria

class TipoPrenda{
  Categoria categoria;

  public getCategoria(){ return categoria;}
  TipoPrenda( Categoria categoria ) {
    this.categoria = categoria;
  }

  ZAPATO(Categoria.CALZADO);
  PANTALON(Categoria.PARTEINFERIOR);
  CAMISA(Categoria.PARTESUPERIOR);
  ZAPATILLAS(Categoria.CALZADO);
  BLUSA(Categoria.PARTESUPERIOR);
  REMERA(Categoria.PARTESUPERIOR);
}