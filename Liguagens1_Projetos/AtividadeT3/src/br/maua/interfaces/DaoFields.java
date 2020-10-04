package br.maua.interfaces;

/**
 * @author Gabriel Cardoso
 * Interface com as chmadas do SQL
 */
public interface DaoFields {
    String getTableName();
    String getInsertString(String table);
    String getSelectAllString(String table);
    String getSelectConditionalString(String table);
}
