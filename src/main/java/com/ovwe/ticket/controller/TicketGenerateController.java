package com.ovwe.ticket.controller;

import com.ovwe.ticket.model.ticket.Ticket;
import com.ovwe.ticket.service.ticket.TicketGenerateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ticketGenerate")
public class TicketGenerateController {
    private static final Logger logger = LogManager.getLogger(TicketGenerateController.class.getName());

    @Autowired
    private TicketGenerateService ticketGenerateService;

    /**
     * Description: 1 描述
     * @param
     * @return
     * @Author
     * @CreationDate 18:57 2019/1/28
     * @Update [序号][YYYY-MM-DD] [更改人][更改描述]
     */
    @RequestMapping(value = "/generateTrain", method = RequestMethod.GET)
    public List<Ticket> generateTrain(String train) {
        return ticketGenerateService.generateTrain(train);
    }

    @RequestMapping(value = "/deleteTrain", method = RequestMethod.GET)
    public int deleteTrain(String train) {
        return ticketGenerateService.deleteTrain(train);
    }
}
