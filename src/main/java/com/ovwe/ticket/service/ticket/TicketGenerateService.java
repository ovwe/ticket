package com.ovwe.ticket.service.ticket;

import com.ovwe.ticket.model.ticket.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TicketGenerateService {
    List<Ticket> generateTrain(String train);
    int deleteTrain(String train);
}
