import 'package:flutter/material.dart';

class Myrow extends StatelessWidget {
  const Myrow({super.key});

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        Expanded(
          child: Container(
            height: double.infinity,
            color: Colors.red,
          ),
        ),

        Expanded(
          child: Container(
            height: 100,
            color: Colors.red,
          ),
        )
      ],
    );
  }
}