package com.company;

import com.company.entity.Client;
import com.company.repo.CsvRepository;
import com.company.service.CsvReader;
import com.company.statistics.ClientStat;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CsvReader csvReader = new CsvReader();
        List<Client> clients = csvReader.parseCSVFileToList();


        CsvRepository csvRepository = new CsvRepository();
        csvRepository.loadClientsToDataBase(clients);


        ClientStat clientStat = new ClientStat();
        clientStat.clientStatistic(csvReader.getInvalidLineCount(),csvReader.getValidLineCOunt() );

    }
}
