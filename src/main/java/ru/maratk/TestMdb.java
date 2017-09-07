package ru.maratk;

import com.sun.messaging.jmq.jmsclient.ObjectMessageImpl;

import javax.ejb.MessageDriven;
import javax.jms.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@MessageDriven(mappedName="jms/TestQueue")
public class TestMdb implements MessageListener {

    private static final Logger logger = Logger.getLogger(TestMdb.class.getName());

    @Override
    public void onMessage(Message message) {
        if(message instanceof TextMessage){
            try {
                logger.log(Level.INFO, "Receive text message: {0}", ((TextMessage) message).getText());
            } catch (JMSException e) {
                logger.log(Level.WARNING, "Can't process text message", e);
            }
        } else {
            logger.log(Level.WARNING, "Unknown type of JMS message");
        }
    }
}