import 'dart:convert';
import 'package:comarquescli/comarca.dart';
import 'package:comarquescli/provincia.dart';
import 'package:http/http.dart' as http;
//import 'dart:io';

class ComarquesService {
  static Future<List<Provincia>> getProvinces() async {
    try {
      String url =
          "https://node-comarques-rest-server-production.up.railway.app/api/comarques/provincies";
      var data = await http.get(Uri.parse(url));

      List<Provincia> listProvince = [];

      if (data.statusCode == 200) {
        // If there's answer, it is returned as a list Provinces

        String body = utf8.decode(data.bodyBytes);
        final bodyJSON = jsonDecode(body) as List;

        // Solution 1. Iterating the JSON and creating a LIST
        for (var provinciaJSON in bodyJSON) {
          //a. With default constructor
          listProvince.add(Provincia(
            name: provinciaJSON["provincia"],
            image: provinciaJSON["img"],
          ));
        }
      }
      return listProvince;

      // b. With JSON constructor
      // listProvince.add(Provincia.fromJSON(provinciaJSON));

      // Solution 2: Using MAPS
      // listProvince = bodyJSON.map((provinciaJSON) {

      // a. With default constructor
      // return Provincia(
      //   name: provinciaJSON["provincia"],
      //   image: provinciaJSON["img"],
      // );
      //    }).toList();

      //b. With JSON constructor
      //     return Provincia.fromJSON(provinciaJSON);
      //     }).toList();
      //   }
      // return listProvince;
    } catch (exception) {
      print(exception.toString());
      return [];
    }
  }

  static Future<List<Comarca>> getComarcas(String provincia) async {
    try {
      String url =
          "https://node-comarques-rest-server-production.up.railway.app/api/comarques/$provincia";
      var data = await http.get(Uri.parse(url));

      List<Comarca> listComarca = [];

      if (data.statusCode == 200) {
        // If there's answer, it is returned as a list Provinces

        String body = utf8.decode(data.bodyBytes);
        //final bodyJSON = jsonDecode(body) as List;

        final List<dynamic> bodyJSON = jsonDecode(body);

        //print(bodyJSON);

        // Solution 1. Iterating the JSON and creating a LIST
        for (var comarcaJSON in bodyJSON) {
          //a. With default constructor
          listComarca.add(Comarca(comarca: comarcaJSON));
        }
      }
      return listComarca;

      // b. With JSON constructor
      // listProvince.add(Provincia.fromJSON(provinciaJSON));

      // Solution 2: Using MAPS
      // listProvince = bodyJSON.map((provinciaJSON) {

      // a. With default constructor
      // return Provincia(
      //   name: provinciaJSON["provincia"],
      //   image: provinciaJSON["img"],
      // );
      //    }).toList();

      //b. With JSON constructor
      //     return Provincia.fromJSON(provinciaJSON);
      //     }).toList();
      //   }
      // return listProvince;
    } catch (exception) {
      print(exception.toString());
      return [];
    }
  }

  static Future<Comarca> getComarcaInfo(String comarca) async {
    Comarca comarcaResult = Comarca(comarca: "vacio");
    try {
      String url =
          "https://node-comarques-rest-server-production.up.railway.app/api/comarques/infoComarca/$comarca";
      var data = await http.get(Uri.parse(url));

      if (data.statusCode == 200) {
        // If there's answer, it is returned as a list Provinces

        //String body = utf8.decode(data.bodyBytes);
        //final bodyJSON = jsonDecode(body) as List;

        // String body = utf8.decode(data.bodyBytes);
        // final bodyJSON = jsonDecode(body) as List;

        String body = utf8.decode(data.bodyBytes);
        final Map<String, dynamic> bodyJSON = jsonDecode(body);

        //final List<dynamic> bodyJSON = jsonDecode(body);

        print(bodyJSON);

        comarcaResult = Comarca.fromJSON(bodyJSON);

      }
      return comarcaResult;

      // b. With JSON constructor
      // listProvince.add(Provincia.fromJSON(provinciaJSON));

      // Solution 2: Using MAPS
      // listProvince = bodyJSON.map((provinciaJSON) {

      // a. With default constructor
      // return Provincia(
      //   name: provinciaJSON["provincia"],
      //   image: provinciaJSON["img"],
      // );
      //    }).toList();

      //b. With JSON constructor
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
