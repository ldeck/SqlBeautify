package tools;

import java.io.InputStream;

import blanco.commons.sql.format.BlancoSqlFormatter;
import blanco.commons.sql.format.BlancoSqlRule;

public class SqlBeautify {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        StringBuilder sb = new StringBuilder();
        byte[] buffer = new byte[4096];
        int read;
        while ((read = is.read(buffer)) != -1) {
            sb.append(new String(buffer, 0, read));
        }
        System.out.println(new BlancoSqlFormatter(new BlancoSqlRule()).format(sb.toString()));
    }
}
