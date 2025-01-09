import 'package:flutter/material.dart';

class Mycontainer extends StatelessWidget {
  const Mycontainer({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Container(
        width: 100,
        height: 100,
        //color: Color(0xFF000000),
        alignment: Alignment.center,
        decoration: BoxDecoration(
          color: Colors.amber,
          border: Border.all(width: 2.0),
          borderRadius: BorderRadius.only(topLeft: Radius.circular(20.0), bottomRight: Radius.circular(20.0))
        ),
        child: const Text("Ejemplo")
        ,
      ),
    );
  }
}

