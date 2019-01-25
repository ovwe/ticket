package com.ovwe.ticket.service.ticket.impl;

import com.ovwe.ticket.dao.TicketMapper;
import com.ovwe.ticket.model.Ticket;
import com.ovwe.ticket.util.AlphabetEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class TicketGenerateServiceImpl {

    @Autowired
    private TicketMapper ticketMapper;

    private static final Logger logger = LogManager.getLogger(TicketGenerateServiceImpl.class.getName());

    public List<Ticket> generate(String train) {
        int carriageMax = 16;
        int rowNumberMax = 20;
        int carriage = 0;
        int rowNumber = 0;
        String alphabet = "";
        for (int i = 1; i <= carriageMax; i++) {
            for (int j = 1; j <= rowNumberMax; j++) {
                for (int k = 1; k <= 5; k++) {
                    String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                    carriage = i;
                    rowNumber = j;
                    alphabet = AlphabetEnum.fromIndex(k).name();
                }
            }
        }

    }

}
