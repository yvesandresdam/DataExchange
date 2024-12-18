import 'package:flutter/material.dart';
import 'package:flutter_application_2/views/login.dart';
import 'package:flutter_application_2/views/catalog.dart';
import 'package:flutter_application_2/views/detail.dart';
import 'package:flutter_application_2/components/card.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: Scaffold(
        body: Center(
            //vista: Pantalla de Login
            //child: Login()

            //vista: Pantalla de catalogo
            child: Catalog()

            //vista: Pantalla detalle
            //child: Detail()

            //vista: Individual ficha pelicula
            //child: MyCard()

            //testing: 
            //child: SizedBox(height: 50, width: 50, child: MyCard())),
      ),
    ));
  }
}
