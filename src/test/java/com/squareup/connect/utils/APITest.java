package com.squareup.connect.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import org.junit.BeforeClass;

public class APITest {

    protected static Map<String, Account> accounts;

    @BeforeClass
    public static void loadAccounts() throws IOException {
        Gson gson = new Gson();
        Reader jsonReader = Files.newBufferedReader(Paths.get("./travis-ci/accounts.json"));
        Type collectionType = new TypeToken<Map<String, Account>>() {}.getType();
        accounts = gson.fromJson(jsonReader, collectionType);
    }
}