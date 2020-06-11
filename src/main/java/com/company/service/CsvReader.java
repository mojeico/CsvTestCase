package com.company.service;

import com.company.entity.Client;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CsvReader {

    private int invalidLineCount = 0;
    private int validLineCOunt = 0;


    public List<Client> parseCSVFileToList() {

        List<Client> listOfValidClient = new LinkedList<>();
        List<String[]> listOfInvalidClient = new ArrayList<String[]>();

        try (Reader reader = new FileReader("src/main/testData.csv")) {

            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Client.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withSkipLines(1)
                    .build();

            for (Client client : (Iterable<Client>) csvToBean) {

                if (!client.verify()) {

                    listOfValidClient.add(client);
                    validLineCOunt++;
                } else if (client.verify()) {

                    invalidLineCount++;
                    listOfInvalidClient.add(new String[]{
                            client.getA(),
                            client.getB(),
                            client.getC(),
                            client.getD(),
                            client.getE(),
                            client.getF(),
                            client.getG(),
                            client.getH(),
                            client.getI(),
                            client.getJ()});
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        writeBadLine(listOfInvalidClient);

        return listOfValidClient;
    }


    public void writeBadLine(List<String[]> listOfInvalidClient) {

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();

        String filePath = "bad-data-" + formatter.format(date) + ".csv";

        try {

            File file = new File(filePath);
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);

            writer.writeAll(listOfInvalidClient);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public int getInvalidLineCount() {
        return invalidLineCount;
    }

    public int getValidLineCOunt() {
        return validLineCOunt;
    }
}
