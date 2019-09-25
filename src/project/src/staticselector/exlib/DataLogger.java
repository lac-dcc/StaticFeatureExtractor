/*
 * Copyright (C) 2019 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package staticselector.exlib;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class DataLogger {
    private static Set<String> log = new HashSet<String>();
    private static String logname = "choamp-runtime.txt";

    public static void log (String features, long diffTime) {
        String data = features + "," + diffTime + "\n";
        log.add(data);
    }
    
    public static void dump () {
        try {
            FileWriter fw = new FileWriter(logname, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String line : log) {
                bw.write(line);
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.clear();
    }
}
