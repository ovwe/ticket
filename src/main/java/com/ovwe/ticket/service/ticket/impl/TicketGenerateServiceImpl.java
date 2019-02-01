package com.ovwe.ticket.service.ticket.impl;


import com.ovwe.ticket.dao.ticket.TicketMapper;
import com.ovwe.ticket.model.ticket.Ticket;
import com.ovwe.ticket.model.ticket.TicketExample;
import com.ovwe.ticket.service.ticket.TicketGenerateService;
import com.ovwe.ticket.util.AlphabetEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TicketGenerateServiceImpl implements TicketGenerateService {

    @Autowired
    private TicketMapper ticketMapper;

    private static final Logger logger = LogManager.getLogger(TicketGenerateServiceImpl.class.getName());

    public List<Ticket> generateTrain(String train) {
        for (int i = 1; i <= 100; i++) {
            logger.info("ok");
            logger.error("ok");
        }

        List<Ticket> ticketsList = new ArrayList<>();
        int carriageMax = 16;
        int rowNumberMax = 20;
        int carriage = 0;
        int rowNumber = 0;
        String alphabet = "";
        String seat = "";
        for (int i = 1; i <= carriageMax; i++) {
            for (int j = 1; j <= rowNumberMax; j++) {
                for (int k = 1; k <= 5; k++) {
                    String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                    carriage = i;
                    rowNumber = j;
                    alphabet = AlphabetEnum.fromIndex(k).name();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(carriage);
                    stringBuilder.append("车");
                    stringBuilder.append(rowNumber);
                    stringBuilder.append("排");
                    stringBuilder.append(alphabet);
                    stringBuilder.append("座");
                    seat = stringBuilder.toString();
                    Ticket ticket = new Ticket();
                    ticket.setUid(uuid);
                    ticket.setTrain(train);
                    ticket.setCarriage(carriage);
                    ticket.setRowNumber(rowNumber);
                    ticket.setAlphabet(alphabet);
                    ticket.setSeat(seat);
                    ticketsList.add(ticket);
                }
            }
        }
        //int insertList = ticketMapper.insertList(ticketsList);
        //logger.info(insertList);
        return ticketsList;
    }

    public int deleteTrain(String train) {
        TicketExample ticketExample = new TicketExample();
        ticketExample.or().andTrainEqualTo(train);
        int deleteByExample = ticketMapper.deleteByExample(ticketExample);
        return deleteByExample;
    }

}
