import 'package:ejemplo_scaffold/screens/page1.dart';
import 'package:ejemplo_scaffold/screens/page2.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: NavBar()
    );
  }
}


  class NavBar extends StatefulWidget {
    const NavBar({super.key});
  
    @override
    State<NavBar> createState() => _NavBarState();
  }
  
  class _NavBarState extends State<NavBar> {
    int currentPageIndex = 0;
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          centerTitle: true,
          title: Text("Ejemplo"),
          backgroundColor: Colors.red,
          leading: IconButton(onPressed: (){}, icon: Icon(Icons.arrow_back)),
        ),
        bottomNavigationBar: NavigationBar(
          onDestinationSelected: (int index){
            setState(() {
              currentPageIndex = index;
            });
          },
          selectedIndex: currentPageIndex,
          backgroundColor: Colors.red,
          destinations: 
          [
            NavigationDestination(icon: Icon(Icons.home), label: "Gastos"),
            NavigationDestination(icon: Icon(Icons.add), label: "Añadir"),
          ]
          ),
        body: [Page1(),Page2()][currentPageIndex]
      );
    }
  }
