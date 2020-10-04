package br.maua.testes;

import br.maua.Menu.Menu;
import br.maua.api.ApiReader;
import br.maua.dao.AnimeDao;
import br.maua.json.AnimeParser;
import br.maua.json.MangaParser;
import br.maua.model.Anime;
import br.maua.model.Manga;

import java.sql.*;
/**
 * @author Gabriel Cardoso
 * classe de teste
 */
public class TesteDao {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.menu();

    }

}
