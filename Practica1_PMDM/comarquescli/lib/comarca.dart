class Comarca {
  // Atributos de Comarca
  late String comarca;
  String? capital;
  String? poblacion;
  String? image;
  String? desc;
  double? latitud;
  double? longitud;

  // Constructor por defecto
  Comarca(
      {required this.comarca,
      this.capital,
      this.poblacion,
      this.image,
      this.desc,
      this.latitud,
      this.longitud});

  // Constructor de objetos
  factory Comarca.fromJSON(Map<String, dynamic> json) {
    return Comarca(
      comarca: json["comarca"],
      capital: json["capital"],
      poblacion: json["poblacio"],
      image: json["img"],
      desc: json["desc"],
      latitud: json["latitud"],
      longitud: json["longitud"],
    );
  }

  // Salida por consola de lista de comarcas de una provincia
  String toListElements() {
    return comarca;
  }

  // Override toString Function
  String redColor = "\x1B[31m";
  String yellowColor = "\x1B[33m";
  String resetColor = "\x1B[0m";

  @override
  String toString() =>
      redColor +
      "Comarca:\t" +
      yellowColor +
      "$comarca" +
      "\n" +
      redColor +
      "Capital:\t" +
      yellowColor +
      "$capital" +
      "\n" +
      resetColor +
      redColor +
      "Poblacion:\t" +
      yellowColor +
      "$poblacion" +
      "\n" +
      resetColor +
      "\n" +
      redColor +
      "Imagen:\t" +
      yellowColor +
      "$image" +
      "\n" +
      redColor +
      "Descripcion:\t" +
      yellowColor +
      "$desc" +
      "\n" +
      resetColor +
      redColor +
      "Coordenadas:\t" +
      yellowColor +
      "($latitud" +
      "," +
      "$longitud)" +
      "\n" +
      resetColor;
}
