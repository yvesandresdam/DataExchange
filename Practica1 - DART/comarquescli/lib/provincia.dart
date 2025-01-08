class Provincia {
  // Atributos de clase
  late String name;
  String? image;

  // Constructor por defecto
  Provincia({required this.name, this.image});

  // Constructor de objetos JSON
  Provincia.fromJSON(Map<String, dynamic> objecteJSON) {
    name = objecteJSON["provincia"] ?? "";
    image = objecteJSON["img"] ?? "";
  }

  // Herramientas de UI
  String redColor = "\x1B[31m";
  String yellowColor = "\x1B[33m";
  String resetColor = "\x1B[0m";

  // Sobreescritura de funcion'toString()'
  @override
  String toString() {
    return "${redColor}Nombre:\t${yellowColor}${name}\n" +
        "${redColor}Imagen:\t${yellowColor}${image}${resetColor}\n";
  }
}
