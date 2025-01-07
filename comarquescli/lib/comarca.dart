class Comarca {
  // Atributos de clase
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

  // Constructor de objetos JSON
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

  // Herramientas de UI
  String redColor = "\x1B[31m";
  String yellowColor = "\x1B[33m";
  String resetColor = "\x1B[0m";

  // Sobreescritura de funcion 'toString()'
  @override
  String toString() {
    return "${redColor}Comarca:\t${yellowColor}${comarca}\n" +
        "${redColor}Capital:\t${yellowColor}${capital}\n" +
        "${redColor}Poblacion:\t${yellowColor}${poblacion}\n" +
        "${redColor}Imagen:\t${yellowColor}${image}\n" +
        "${redColor}Descripcion:\t${yellowColor}${desc}\n" +
        "${redColor}Coordenadas:\t${yellowColor}${latitud},${longitud}\n";
  }
}
