# jee6-jms-receiver

Simple message-driven bean, that listens queue from JNDI with mapped name jms/TestQueue.

To add test queue to OpenMQ managed by Glassfish 3.1.2.2:

```sh
asadmin create-jms-resource --restype javax.jms.Queue --property Name=TestQueue jms/TestQueue
```

To send messages for this app you can use [jee6-jms-sender](https://github.com/MaratKarimov/jee6-jms-sender) app.

