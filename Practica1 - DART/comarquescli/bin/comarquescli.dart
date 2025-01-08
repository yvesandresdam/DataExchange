// Importacion de librerias
import 'dart:io';
import 'package:comarquescli/comarques_service.dart';
import 'package:comarquescli/provincia.dart';
import 'package:comarquescli/comarca.dart';

// UI de la aplicacion
String fontColorBlack = "\x1B[31m";
String fontColorRed = "\x1B[33m";
String fontColorReset = "\x1B[0m";

// Punto de entrada
void main(List<String> arguments) {
  // Herramientas de clase
  List<String> listArguments = List.from(arguments);
  String? endpoint;
  String? userArgument;

  // Validacion de numero de argumentos
  if (arguments.isEmpty) {
    print("${fontColorBlack}Numero de argumentos incorrecto${fontColorReset}");
    exit(-1);
  }

  // Separamos la provincia, comarca e informacion de la lista de argumentos
  endpoint = listArguments[0];
  listArguments.removeAt(0);
  userArgument = listArguments.join(" ");

  // Llamamos a la funcion que corresponde segun el argumento que le pasamos al programa
  // Los endpoints posibles son: 'provincies', 'comarques', 'infocomarca'
  switch (endpoint) {
    case "provincies":
      displayProvinces();
      break;
    case "comarques":
      if (arguments.length != 2) {
        print(
            "${fontColorBlack}Numero de argumentos incorrecto. Debe especificar la provincia${fontColorReset}");
        exit(-1);
      }
      displayComarcas(userArgument);
      break;
    case "infocomarca":
      if (arguments.length < 2) {
        print(
            "${fontColorBlack}Numero de argumentos incorrecto. Debe especificar la comarca${fontColorReset}");
        exit(-1);
      }
      displayInfoComarca(userArgument);
      break;
    default:
      print("${fontColorBlack}Argumento no valido${fontColorReset}");
  }
}

// FUNCIONES SINCRONICAS
// Funcion que muestra las provincias
displayProvinces() {
  Future<List<Provincia>> futureAnswer = ComarquesService.getProvinces();

  futureAnswer.then((answer) {
    if (answer.isNotEmpty) {
      for (var province in answer) {
        String result = province.toString();
        print(result);
      }
    } else {
      print("${fontColorBlack}No hay respuesta desde la API${fontColorReset}");
    }
  });
}

// FUNCIONES ASINCRONICAS
// Funcion que muestra las comarcas
displayComarcas(String provincia) async {
  List<Comarca> comarcasAnswer = await ComarquesService.getComarcas(provincia);

  if (comarcasAnswer.isNotEmpty) {
    for (var comarca in comarcasAnswer) {
      String result = comarca.getComarcaString();
      print(result);
    }
  } else {
    print("${fontColorBlack}No hay respuesta desde la API${fontColorReset}");
  }
}

// Funcion que muestra la informacion de una comarca
displayInfoComarca(String comarcaNombre) async {
  Comarca infoComarca = await ComarquesService.getComarcaInfo(comarcaNombre); 
  String infoResult = infoComarca.toString();
  print(infoResult); 
}

// La misma funcion de arriba de visualizar provincias, esta vez con metodos sincronizados
displayProvincesSync(String provincia) async {
  List<Comarca> provincies = await ComarquesService.getComarcas(provincia);

  if (provincies.isNotEmpty) {
    for (var provincia in provincies) {
      String result = provincia.toString();
      print(result);
    }
  } else {
    print("${fontColorBlack}No hay respuesta desde la API${fontColorReset}");
  }
}
