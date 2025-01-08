import 'dart:convert';
import 'package:comarquescli/comarca.dart';
import 'package:comarquescli/provincia.dart';
import 'package:comarquescli/solutions_type.dart';
import 'package:http/http.dart' as http;

class ComarquesService {
  static Future<List<Provincia>> getProvinces() async {
    String url =
        "https://node-comarques-rest-server-production.up.railway.app/api/comarques/provincies";
    try {
      var dataRequest = await http.get(Uri.parse(url));
      List<Provincia> listProvince = [];

      // Si recibimos respuesta, devolvemos los datos en forma de lista
      if (dataRequest.statusCode == 200) {
        String body = utf8.decode(dataRequest.bodyBytes);
        final bodyJSON = jsonDecode(body) as List;

        // El enumerado SolutionsType nos muestra 4 posibles soluciones

        SolutionsType solution = SolutionsType.solution1;

        // Solucion 1. Iteramos la respuesta JSON y creamos una lista nueva
        if (solution == SolutionsType.solution1) {
          for (var provinciaJSON in bodyJSON) {
            //a. Con el constructor por defecto
            listProvince.add(Provincia(
              name: provinciaJSON["provincia"],
              image: provinciaJSON["img"],
            ));
          }
          // Solucion 2. Iteramos la respuesta JSON y creamos una lista nueva
        } else if (solution == SolutionsType.solution2) {
          for (var provinciaJSON in bodyJSON) {
            // b. Con el constructor de objetos JSON
            listProvince.add(Provincia.fromJSON(provinciaJSON));
          }
          // Solucion 3: Mapeando el resultado
        } else if (solution == SolutionsType.solution3) {
          listProvince = bodyJSON.map((provinciaJSON) {
            // a. Con el constructor por defecto
            return Provincia(
              name: provinciaJSON["provincia"],
              image: provinciaJSON["img"],
            );
          }).toList();
          // Solucion 4: Mapeando el resultado
        } else if (solution == SolutionsType.solution4) {
          listProvince = bodyJSON.map((provinciaJSON) {
            //b. With JSON constructor
            return Provincia.fromJSON(provinciaJSON);
          }).toList();
        }
      }
      return listProvince;
    } catch (exception) {
      print(exception.toString());
      return [];
    }
  }

  static Future<String> getComarcas(String provincia) async {
    String url =
        "https://node-comarques-rest-server-production.up.railway.app/api/comarques/comarquesAmbImatge/$provincia";
    try {
      var data = await http.get(Uri.parse(url));
      String bodyJSON = "";
      //List<Comarca> listComarca = [];
      //List<Comarca> listDecoded = [];
      // Si hay respuesta la formateamos en forma de Lista
      if (data.statusCode == 200) {
        bodyJSON = utf8.decode(data.bodyBytes);

        // Solucion 1.
        // Devuelvo directamente el JSON con el resultado
        // Ese JSON recibe el formato en la clase comarquescli
      }
      return bodyJSON;

      // b. Con el constructor de objetos JSON
      // listProvince.add(Provincia.fromJSON(provinciaJSON));

      // Solution 2: Mapeando el resultado
      // listProvince = bodyJSON.map((provinciaJSON) {

      // a. Con el constructor por defecto
      // return Provincia(
      //   name: provinciaJSON["provincia"],
      //   image: provinciaJSON["img"],
      // );
      //    }).toList();

      //b. Con el constructor de objetos JSON
      //     return Provincia.fromJSON(provinciaJSON);
      //     }).toList();
      //   }
      // return listProvince;
    } catch (exception) {
      print(exception.toString());
      return "";
    }
  }

  static Future<Comarca> getComarcaInfo(String comarca) async {
    Comarca comarcaResult = Comarca(comarca: "vacio");
    String url =
        "https://node-comarques-rest-server-production.up.railway.app/api/comarques/infoComarca/$comarca";
    try {
      var data = await http.get(Uri.parse(url));
      // Si hay respuesta se devuelve en forma de Lista
      if (data.statusCode == 200) {
        //String body = utf8.decode(data.bodyBytes);
        //final bodyJSON = jsonDecode(body) as List;

        // String body = utf8.decode(data.bodyBytes);
        // final bodyJSON = jsonDecode(body) as List;

        String body = utf8.decode(data.bodyBytes);
        final Map<String, dynamic> bodyJSON = jsonDecode(body);

        //final List<dynamic> bodyJSON = jsonDecode(body);
        comarcaResult = Comarca.fromJSON(bodyJSON);
      }
      return comarcaResult;

      // b. Con el constructor de objetos JSON
      // listProvince.add(Provincia.fromJSON(provinciaJSON));

      // Solucion 2: Mapeando el resultado
      // listProvince = bodyJSON.map((provinciaJSON) {

      // a. Con el constructor por defecto
      // return Provincia(
      //   name: provinciaJSON["provincia"],
      //   image: provinciaJSON["img"],
      // );
      //    }).toList();

      //b. Con el constructor de objetos JSON
      //     return Provincia.fromJSON(provinciaJSON);
      //     }).toList();
      //   }
      // return listProvince;
    } catch (exception) {
      print(exception.toString());
      return Comarca(comarca: "vacio");
    }
  }
}
