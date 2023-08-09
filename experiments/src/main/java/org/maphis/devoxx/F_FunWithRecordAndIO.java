package org.maphis.devoxx;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author emaph"
 */
public class F_FunWithRecordAndIO {

    static record RangeRecord(int begin, int end) implements Serializable {

        RangeRecord  {
            if (end < begin) {
                throw new IllegalArgumentException("End must be grater than begin");
            }
        }

    }

    static class RangeClass implements Serializable {

        private final int begin;
        private final int end;

        public RangeClass(int begin, int end) {
            if (end < begin) {
                throw new IllegalArgumentException("End must be grater than begin");
            }
            this.begin = begin;
            this.end = end;
            System.out.println("Building range");
        }

        @Override
        public String toString() {
            return "Range{ "
                    + "begin = " + begin
                    + "end = " + end + "}";
        }
    }


    private static RangeRecord inRange(Path path) throws ClassNotFoundException, IOException {
        var is = Files.newInputStream(path);
        var ois = new ObjectInputStream(is);
        System.out.println("Reading range");
        var readRange = ois.readObject();
        return (RangeRecord)readRange;
    }

    private static void outRange(RangeRecord range, Path path) throws IOException {
        System.out.println("range = " + range);

        var fos = Files.newOutputStream(path);
        var oos = new ObjectOutputStream(fos);

        oos.writeObject(range);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Path path = Path.of("files/range-record-10-0.dat");

        //var range = new RangeRecord(0, 10);
        //outRange(range, path);

        var readRange = inRange(path);
        System.out.println("readRange = " + readRange);
    }

}
