import 'package:flutter/material.dart';
import 'package:projeto_gabriel_p4/Classe/Pokemon.dart';
import 'package:projeto_gabriel_p4/Utilities/NetWorkHelper.dart';
import 'Utilities/NetWorkHelper.dart';
class Gen1 extends StatelessWidget {
  var id ;
  var name ;
  var link = "https://pokeapi.co/api/v2/pokemon/";

//  @override
//  Widget build(BuildContext context) {
//    return Scaffold(
//     body : ListView(children: new List.generate(151, (index) => new ListTile(title : Text(chama("${index + 1}")), leading: Image.network('https://pokeres.bastionbot.org/images/pokemon/${index+1}.png'),)))
//    );

//  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: FutureBuilder(
        future: getLink(151),
        builder: (context,  snapshot){
          List<Pokemon> pokemons = snapshot.data;
            if(snapshot.hasData) {
              return Scaffold(
                  body: new ListView(
                      children: new List.generate(151, (index) =>
                      new ListTile(
                        title: Text(
                            "Nome: " + pokemons[index].name + "\n" + "Id: " +
                                pokemons[index].id.toString()),
                        leading: Image.network(
                            'https://pokeres.bastionbot.org/images/pokemon/${index +
                                1}.png'),))
                  ));
            }else{
              return CircularProgressIndicator();
            }

        },
      )
    );

  }


  //String chama(String i){
  //  String e;
  //  getLink(i).then((value) => {e = value});
   // return e;


  //}
 // Future<String>getLink(String i) async{
 //   var requisicao = NetworkHelper(url: link+i);
 //   var dados = Pokemon.fromJson( await requisicao.getData());
 //   Pokemon pokemon = dados;
 //   return "Nome: " + pokemon.name + "Id: " + pokemon.id.toString();


 // }
  Future<List<Pokemon>>getLink(int i) async{
    List<Pokemon> list;
    int j;
    for(j = 1;j<=i;j++) {
      var requisicao = NetworkHelper(url: link+j.toString());
      var dados = Pokemon.fromJson(await requisicao.getData());
      Pokemon pokemon = dados;
      print(pokemon.name);
      list.add(pokemon);
    }
    return list;
  }


}
class Conexao {

  String name;
  String id;
  String link;

  Conexao(String link){
    this.link = link;
    getLink();

  }

  void getLink() async {
    Pokemon pokemon;
    var requisicao = NetworkHelper(url: link);
    var dados = Pokemon.fromJson( await requisicao.getData() );
    pokemon =   dados;
    this.name =  pokemon.name;
    this.id =   pokemon.id.toString();

  }

  @override
  String toString() {
    return 'Nome: ${this.name} \n Id: ${this.id}';
  }
}

