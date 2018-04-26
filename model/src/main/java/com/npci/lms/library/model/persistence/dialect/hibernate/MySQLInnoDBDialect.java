package com.npci.lms.library.model.persistence.dialect.hibernate;

import org.hibernate.dialect.MySQL5InnoDBDialect;

public class MySQLInnoDBDialect extends MySQL5InnoDBDialect {
    @Override
    public String getTableTypeString() {
        return "  ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_general_ci ";
    }
}
