package wf3.project.alpha_betise.utils;

import org.hibernate.dialect.MySQL5Dialect;

public class MySQL5InnoDBDialectUtf8mb4 extends MySQL5Dialect {

    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci";
    }
}
