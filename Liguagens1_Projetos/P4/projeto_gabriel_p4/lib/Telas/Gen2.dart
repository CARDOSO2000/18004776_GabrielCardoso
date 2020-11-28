import 'package:flutter/material.dart';
import 'package:projeto_gabriel_p4/Classe/Pokemon.dart';
import 'package:projeto_gabriel_p4/Utilities/NetWorkHelper.dart';
import 'Utilities/NetWorkHelper.dart';

class Gen2 extends StatelessWidget {
  List<Pokemon> pokemons;

  Gen2(List poke) {
    this.pokemons = poke;
  }

  var link = "https://pokeapi.co/api/v2/pokemon/";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: ListView(children: new List.generate(pokemons.length, (index) =>
        new ListTile(title: Text(
            'Nome: ' + pokemons[index].name + '\n' + 'Id: ' +
                pokemons[index].id.toString()),
          leading: Image.network(
              'https://pokeres.bastionbot.org/images/pokemon/${index +
                  152}.png'),)))
    );
  }
}