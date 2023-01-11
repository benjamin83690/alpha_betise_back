package wf3.project.alpha_betise.utils;

import org.hibernate.dialect.MySQLDialect;

public class MySQLInnoDBDialectUtf8mb4 extends MySQLDialect {

    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_general_ci";
    }
}
