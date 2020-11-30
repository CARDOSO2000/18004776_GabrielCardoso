

import 'package:flutter/material.dart';
import 'package:projeto_gabriel_p4/Classe/Pokemon.dart';
import 'package:projeto_gabriel_p4/Utilities/NetWorkHelper.dart';

import 'Gen1.dart';
import 'Gen2.dart';
import 'Gen3.dart';
import 'Gen4.dart';
import 'Gen5.dart';
import 'Gen6.dart';
import 'Gen7.dart';


class MinhaTela extends StatelessWidget {
  var link = "https://pokeapi.co/api/v2/pokemon/";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(backgroundColor: Colors.red,title: Text("Pokedéx"),),
      body: Column(

        children: [SizedBox(width: 1000,height: 100,child: Image.network("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/International_Pok%C3%A9mon_logo.svg/1200px-International_Pok%C3%A9mon_logo.svg.png")),

          FlatButton(onPressed: () async{

            List<Pokemon> pokemons = List<Pokemon>();
            _onLoading(context);
            //Aviso de um tempo de espera para carregar a página
            for(int i=1;i<=151;i++) {
              var requisicao = NetworkHelper(url: link+i.toString());
              var dados = Pokemon.fromJson(await requisicao.getData());
              Pokemon pokemon = await dados;
              pokemons.add(pokemon);

            }

            Navigator.pop(context);
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Gen1(pokemons)),
            );
          }, child: Text("Gen 1")),
          FlatButton(onPressed: () async{
            List<Pokemon> pokemons = List<Pokemon>();
            _onLoading(context);
            //Aviso de um tempo de espera para carregar a página
            for(int i=152;i<=251;i++) {
              var requisicao = NetworkHelper(url: link+i.toString());
              var dados = Pokemon.fromJson(await requisicao.getData());
              Pokemon pokemon = await dados;
              pokemons.add(pokemon);

            }
            Navigator.pop(context);
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Gen2(pokemons)),
            );
          }, child: Text("Gen 2")),
          FlatButton(onPressed: () async{
            List<Pokemon> pokemons = List<Pokemon>();
            _onLoading(context);
            //Aviso de um tempo de espera para carregar a página
            for(int i=252;i<=386;i++) {
              var requisicao = NetworkHelper(url: link+i.toString());
              var dados = Pokemon.fromJson(await requisicao.getData());
              Pokemon pokemon = await dados;
              pokemons.add(pokemon);

            }
            Navigator.pop(context);
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Gen3(pokemons)),
            );
          }, child: Text("Gen 3")),
          FlatButton(onPressed: () async{
            List<Pokemon> pokemons = List<Pokemon>();
            _onLoading(context);
            //Aviso de um tempo de espera para carregar a página
            //Devido algum erro no site as fotos dos shaymin e giratina não foram carregadas
            for(int i=387;i<=493;i++) {
              var requisicao = NetworkHelper(url: link+i.toString());
              var dados = Pokemon.fromJson(await requisicao.getData());
              Pokemon pokemon = await dados;
              pokemons.add(pokemon);

            }
            Navigator.pop(context);
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Gen4(pokemons)),
            );
          }, child: Text("Gen 4")),
          FlatButton(onPressed: () async{
          List<Pokemon> pokemons = List<Pokemon>();
          _onLoading(context);
          //Aviso de um tempo de espera para carregar a página
          for(int i=494;i<=649;i++) {
          var requisicao = NetworkHelper(url: link+i.toString());
          var dados = Pokemon.fromJson(await requisicao.getData());
          Pokemon pokemon = await dados;
          pokemons.add(pokemon);

          }
          Navigator.pop(context);
          Navigator.push(
          context,
          MaterialPageRoute(builder: (context) => Gen5(pokemons)),
          );
          }, child: Text("Gen 5")),
          FlatButton(onPressed: () async{
            List<Pokemon> pokemons = List<Pokemon>();
            _onLoading(context);
            //Aviso de um tempo de espera para carregar a página
            for(int i=650;i<=721;i++) {
              var requisicao = NetworkHelper(url: link+i.toString());
              var dados = Pokemon.fromJson(await requisicao.getData());
              Pokemon pokemon = await dados;
              pokemons.add(pokemon);

            }
            Navigator.pop(context);
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Gen6(pokemons)),
            );
          }, child: Text("Gen 6")),
          FlatButton(onPressed: () async{
            List<Pokemon> pokemons = List<Pokemon>();
            _onLoading(context);
            //Aviso de um tempo de espera para carregar a página
            for(int i=722;i<=809;i++) {
              var requisicao = NetworkHelper(url: link+i.toString());
              var dados = Pokemon.fromJson(await requisicao.getData());
              Pokemon pokemon = await dados;
              pokemons.add(pokemon);

            }
            Navigator.pop(context);
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Gen7(pokemons)),
            );
          }, child: Text("Gen 7")),],
      ),
    );
  }
  _onLoading(BuildContext context) {
    return showDialog(
        context: context,
        builder: (BuildContext context) {
          return AlertDialog(
            title: new Text("Carregando"),
            actions: <Widget>[
             CircularProgressIndicator()
            ],
          );
        });}
}