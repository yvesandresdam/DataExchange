// Importacion de librerias
import 'dart:io';
import 'package:comarquescli/comarques_service.dart';
import 'package:comarquescli/provincia.dart';
import 'package:comarquescli/comarca.dart';

  // UI de la aplicacion
  String fontColorBlack = "\x1B[31m";
  String fontColorReset = "\x1B[0m";

void main(List<String> arguments) {
  // Herramientas de clase
  // Atributos de clase
  List<String> listArguments = List.from(arguments);
  String? order;
  String? args;

  // Validacion de numero de argumentos
  if (arguments.isEmpty) {
    print("${fontColorBlack}Numero de argumentos incorrecto${fontColorReset}");
    exit(-1);
  }

  // Separamos la provincia, comarca e informacion de la lista de argumentos
  order = listArguments[0];
  listArguments.removeAt(0);
  args = listArguments.join(" ");

  // Llamamos a la funcion que corresponde segun el argumento que le pasamos al programa
  switch (order) {
    case "provincies":
      showProvinces();
      break;
    case "comarques":
      if (arguments.length != 2) {
        print(
            "${fontColorBlack}Numero de argumentos incorrecto. Debe especificar la provincia${fontColorReset}");
        exit(-1);
      }
      showComarcas(args);
      break;
    case "infocomarca":
      if (arguments.length < 2) {
        print(
            "${fontColorBlack}Numero de argumentos incorrecto. Debe especificar la comarca${fontColorReset}");
        exit(-1);
      }
      showInfoComarca(args);
      break;
    default:
      print("${fontColorBlack}Argumento desconocido${fontColorReset}");
  }
}

// FUNCIONES SINCRONICAS
// Funcion que muestra las provincias
showProvinces() {
  // Province List
  Future<List<Provincia>> futureAnswer = ComarquesService.getProvinces();

  // Callback
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
showComarcas(String provincia) async {
  List<Comarca> comarcasAnswer = await ComarquesService.getComarcas(provincia);

  // Comarca Callback
  if (comarcasAnswer.isNotEmpty) {
    for (var comarca in comarcasAnswer) {
      String result = comarca.toListElements();
      print(result);
    }
  } else {
    print("${fontColorBlack}No hay respuesta desde la API${fontColorReset}");
  }
}

//Funcion que muestra la informacion de una comarca
showInfoComarca(String comarcaNombre) async {
  Comarca comarca = await ComarquesService.getComarcaInfo(comarcaNombre);
  String result = comarca.toString();
  print(result);
}

// Implementacion de visualizar provincias con metodos sincronizados
showProvincesSync(String provincia) async {
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
