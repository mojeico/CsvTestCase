package com.company.statistics;

import java.io.FileWriter;
import java.io.IOException;

public class ClientStat {

    public void clientStatistic(int invalidLineCount, int validLineCOunt) {

        int allCount = invalidLineCount + validLineCOunt;

        try {
            String clientLogFile = "log.txt";

            String clientStatistic = "We got " + allCount + " of records received \n"
                    + invalidLineCount + " of records failed, \n" +
                    validLineCOunt + " of records successful and ";

            FileWriter fileWriter = new FileWriter(clientLogFile);
            fileWriter.write(clientStatistic);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
