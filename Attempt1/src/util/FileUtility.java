package util;

import java.io.*;

public class FileUtility {
    public static Object readFileDeserialize(String name) {
        Object obj = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(name));
            obj = in.readObject();
        } finally {
            return obj;
        }
    }

    public static boolean writeFileDeserialize(Object obj, String name) {
        try (FileOutputStream fout = new FileOutputStream(name)) {
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(obj);
            return true;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
