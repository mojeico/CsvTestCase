package com.company.service;

import com.company.entity.Client;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public class CsvReader {

    private int invalidLineCount = 0;


    public List<Client> parseCSVFileToList() {

        List<Client> list = new LinkedList<>();

        try (Reader reader = new FileReader("src/main/testData.csv")) {

            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Client.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withSkipLines(1)
                    .build();

            for (Client myCsv : (Iterable<Client>) csvToBean) {
                list.add(myCsv);
                    if( myCsv.verify()){
                        invalidLineCount++;
                    }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return list;
    }

    public int getInvalidLineCount() {
        return invalidLineCount;
    }

}
