package dao;

import java.sql.Connection;

public class LogInDAO {
private Connection connection;
public LogInDAO(Connection connection) {
    this.connection = connection;
}
}
