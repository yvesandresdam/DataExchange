import 'package:flutter/material.dart';

class MyCard extends StatelessWidget {
  const MyCard({super.key});

  @override
  Widget build(BuildContext context) {
    return Expanded(child: Image.asset('assets/naranjamecanica2.png')
        /*
          ,
          Padding(
            padding: EdgeInsets.all(10.0),
            child: Column(children: [
              Column(crossAxisAlignment: CrossAxisAlignment.start, children: [
                Text("La naranja mecánica",
                    style: TextStyle(color: Colors.indigo, fontSize: 3)),
                Text(
                  "Ciencia ficcion, 1970",
                  style: TextStyle(fontSize: 3),
                )
              ])
            ]),
          )*/
        );
  }
}


/*
  @override
  Widget build(BuildContext context) {
    return Container(
      width: 100,
      height: 100,
      color:Colors.red
    );
  }
  */

