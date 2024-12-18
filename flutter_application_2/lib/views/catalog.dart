import 'package:flutter/material.dart';
import 'package:flutter_application_2/components/card.dart';
import 'package:flutter_application_2/components/color_field.dart';

class Catalog extends StatelessWidget {
  const Catalog({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
      body: Column(children: [

        // HEADER
        SizedBox(
            height: 50,
            child: Center(
              child: Text("Catalogo",
                  style: TextStyle(color: Colors.indigo, fontSize: 25)),
            )),
        TextField(
          decoration: InputDecoration(
              labelText: 'Buscar película',
              border: OutlineInputBorder(
                  borderRadius: BorderRadius.all(Radius.circular(20)))),
        ),
        
        // ROW de Botones
        SizedBox(height: 10),
        SingleChildScrollView(
            scrollDirection: Axis.horizontal,
            child: Row(children: [
              ElevatedButton(
                  onPressed: () {},
                  style: ElevatedButton.styleFrom(
                      side: BorderSide(color: Colors.grey, width: 1.0)),
                  child: Text('Accion',
                      style: TextStyle(fontSize: 10, color: Colors.black))),
              ElevatedButton(
                  onPressed: () {},
                  style: ElevatedButton.styleFrom(
                      side: BorderSide(color: Colors.grey, width: 1.0)),
                  child: Text('Aventura',
                      style: TextStyle(fontSize: 10, color: Colors.black))),
              ElevatedButton(
                  onPressed: () {},
                  style: ElevatedButton.styleFrom(
                      side: BorderSide(color: Colors.grey, width: 1.0)),
                  child: Text('Historica',
                      style: TextStyle(fontSize: 10, color: Colors.black))),
              ElevatedButton(
                  onPressed: () {},
                  style: ElevatedButton.styleFrom(
                      side: BorderSide(color: Colors.grey, width: 1.0)),
                  child: Text('Drama',
                      style: TextStyle(fontSize: 10, color: Colors.black)))
            ])),     

        // ROW de Cards - tematica 'Ciencia Ficcion'
        SizedBox(height: 10),
        Column(children: [
          Container(
              height: 50,
              width: 1050,
              child: ListView(scrollDirection: Axis.horizontal, children: [
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard()
              ]))
        ]),


        // ROW de Cards - tematica 'Aventura'
        SizedBox(height: 10),
        Column(children: [
          Container(
              height: 50,
              width: 1050,
              child: ListView(scrollDirection: Axis.horizontal, children: [
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard()
              ]))
        ]),

        // ROW de Cards - tematica 'Historica'
        SizedBox(height: 10),
        Column(children: [
          Container(
              height: 50,
              width: 1050,
              child: ListView(scrollDirection: Axis.horizontal, children: [
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard()
              ]))
        ]),

        // ROW de Cards - tematica 'Drama'
        SizedBox(height: 10),
        Column(children: [
          Container(
              height: 50,
              width: 1050,
              child: ListView(scrollDirection: Axis.horizontal, children: [
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard(),
                SizedBox(width: 10),
                MyCard()
              ]))
        ])

        /*
        SizedBox(height: 20),
                    Text("Ciencia Ficcion"),
                    Row(
                      children: [
                        Expanded(
                          child: Container(
                            height: 120,
                            child: ListView(
                              scrollDirection: Axis.horizontal,
                              children: [
                                ColorField(varColor: Colors.red),
                                ColorField(varColor: Colors.green),
                                ColorField(varColor: Colors.blue),
                                ColorField(varColor: Colors.yellow)
                              ],
                            ),
                          ),
                        ),
                      ],
                    ),
                    SizedBox(height: 20),
                    Text("Ciencia Ficcion"),
                    Row(
                      children: [
                        Expanded(
                          child: Container(
                            height: 120,
                            child: ListView(
                              scrollDirection: Axis.horizontal,
                              children: [
                                ColorField(varColor: Colors.red),
                                ColorField(varColor: Colors.green),
                                ColorField(varColor: Colors.blue),
                                ColorField(varColor: Colors.yellow)
                              ],
                            ),
                          ),
                        ),
                      ],
                    ),
                    SizedBox(height: 20),
                    Text("Ciencia Ficcion"),
                    Row(
                      children: [
                        Expanded(
                          child: Container(
                            height: 120,
                            child: ListView(
                              scrollDirection: Axis.horizontal,
                              children: [
                                ColorField(varColor: Colors.red),
                                ColorField(varColor: Colors.green),
                                ColorField(varColor: Colors.blue),
                                ColorField(varColor: Colors.yellow)
                              ],
                            ),
                          ),
                        ),
                      ],
                    ),
                    SizedBox(height: 20)
                    */
      ]),
    ));
  }
}
