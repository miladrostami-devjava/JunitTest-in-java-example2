package org.example.dbTest;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DatabaseTest {


    private static Database db;
    private static List<String> storage;

    @BeforeClass
    public static void startup(){
        db = new Database();
        storage = new ArrayList<String>();
        db.setStorage(storage);
    }

    @AfterClass
    public static void shutdown(){
        db = null;
        storage = null;
        db.setStorage(storage);
    }
    @Before
    public void setup(){
        db.openDB();
    }
    @After
    public void tearDown(){
        db.close();
    }

    @Test
    public void testDB(){
        String name = "ali zare";
        db.insert(name);
        assertTrue(storage.contains(name));
        db.delete(name);
        assertFalse(storage.contains(name));
    }

    @Test
    public void testNullValue(){
db.insert(null);
assertTrue(storage.contains(null));
assertEquals(1,storage.size());


    }

}
