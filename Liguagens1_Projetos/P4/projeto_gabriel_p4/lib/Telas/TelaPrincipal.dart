import 'package:flutter/material.dart';

import 'Gen1.dart';

class MinhaTela extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(backgroundColor: Colors.red,title: Text("Pokedéx"),),

      body: Column(
        children: [SizedBox(width: 1000,height: 100,child: Image.network("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/International_Pok%C3%A9mon_logo.svg/1200px-International_Pok%C3%A9mon_logo.svg.png")),
          FlatButton(onPressed: () {
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Gen1()),
            );
          }, child: Text("Gen 1")),
          FlatButton(onPressed: null, child: Text("Gen 2")),
          FlatButton(onPressed: null, child: Text("Gen 3")),
          FlatButton(onPressed: null, child: Text("Gen 4")),
          FlatButton(onPressed: null, child: Text("Gen 5")),
          FlatButton(onPressed: null, child: Text("Gen 6")),
          FlatButton(onPressed: null, child: Text("Gen 7")),],
      ),
    );
  }
}