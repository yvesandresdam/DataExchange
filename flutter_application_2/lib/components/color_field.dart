import 'package:flutter/material.dart';

class ColorField extends StatelessWidget {
  final Color varColor;
  const ColorField({super.key,required this.varColor});

  @override
  Widget build(BuildContext context) {
    return Container(width: 500, height: 10, color: varColor);
  }
}
