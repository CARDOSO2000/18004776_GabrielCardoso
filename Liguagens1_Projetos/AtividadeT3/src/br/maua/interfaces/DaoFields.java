package br.maua.interfaces;

public interface DaoFields {
    String getTableName();
    String getInsertString(String table);
    String getSelectAllString(String table);
    String getSelectConditionalString(String table);
}
