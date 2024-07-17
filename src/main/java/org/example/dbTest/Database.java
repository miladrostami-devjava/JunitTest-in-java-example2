package org.example.dbTest;

import java.util.List;
import java.util.stream.Collectors;

public class Database {
    public void setStorage(List<String> storage) {
        storage.stream().collect(Collectors.toList());
    }

    public void openDB() {

    }

    public void close() {

    }

    public void insert(String name) {

    }

    public void delete(String name) {

    }
}
