import 'package:flutter/material.dart';

class Detail extends StatelessWidget {
  const Detail({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
        child: Column(children: [
      SizedBox(
          height: 50,
          child: Center(
              child: Text(
            "Pelicula",
            style: TextStyle(color: Colors.indigo, fontSize: 25),
          ))),      
      SizedBox(
        width: 300,
        child: Image.asset(
          'assets/naranjamecanica1.png'
        ),
      ),
      Padding(
          padding: EdgeInsets.all(20.0),
          child: SizedBox(
            width: 300,
            child: Column(children: [
              Column(crossAxisAlignment: CrossAxisAlignment.start, children: [
                Text("La naranja mecánica",
                    style: TextStyle(color: Colors.indigo, fontSize: 10)),
                Text("Ciencia ficcion, 1970"),
                SizedBox(height: 10),
                Text(
                  "Sinopsis",
                  style: TextStyle(fontWeight: FontWeight.bold),
                ),
                Text("La película, filmada en el Reino Unido, relata las desventuras de Alex DeLarge," +
                    "un delincuente juvenil cuyos placeres son: escuchar música clásica, el sexo, las drogas y la «ultraviolencia»"),
                SizedBox(height: 10),
                Text(
                  "Director",
                  style: TextStyle(fontWeight: FontWeight.bold),
                ),
                Text("Stanley Kubrick")
              ]),
              SizedBox(height: 10),
              Container(
                width: 500,
                child: Flex(direction: Axis.horizontal, children: [
                  Expanded(
                    child: ElevatedButton(
                        onPressed: () {},
                        style: ElevatedButton.styleFrom(
                            backgroundColor: Colors.green),
                        child: Text(
                          "Ver reparto",
                          style: TextStyle(
                              color: Colors.white, fontWeight: FontWeight.bold),
                        )),
                  ),
                ]),
              ),
            ]),
          ))
    ]));
  }
}
