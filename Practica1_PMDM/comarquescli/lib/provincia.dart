class Provincia {

  // Atributes
  late String name; 
  String? image; 

  //Default Constructor
  Provincia({
    required this.name,
    this.image
  });

  //Constructor from JSON
  // Provincia.fromJSON(Map<String, dynamic> objecteJSON) {
  //   name = objecteJSON["provincia"] ?? "";
  //   image = objecteJSON["img"] ?? "";
  // }

  // Override toString Function
  String redColor = "\x1B[31m";
  String yellowColor = "\x1B[33m";
  String resetColor = "\x1B[0m";
  @override
  String toString() =>
      redColor + "Name:\t" + yellowColor + "$name" + "_\t" + 
      redColor + "Image:\t" + yellowColor + "$image" + "\n" + resetColor;
}
