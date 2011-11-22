package com.microsoft.windowsazure.services.serviceBus;

import static com.microsoft.windowsazure.services.serviceBus.Util.*;

import org.junit.Before;
import org.junit.BeforeClass;

import com.microsoft.windowsazure.services.serviceBus.models.QueueInfo;
import com.microsoft.windowsazure.services.serviceBus.models.ReceiveMessageOptions;
import com.microsoft.windowsazure.services.serviceBus.models.TopicInfo;

public abstract class IntegrationTestBase {
    @BeforeClass
    public static void initializeSystem() {
        System.out.println("initialize");
        System.setProperty("http.proxyHost", "itgproxy");
        System.setProperty("http.proxyPort", "80");
        System.setProperty("http.keepAlive", "false");
    }

    @Before
    public void initialize() throws Exception {
        System.out.println("initialize");
        System.setProperty("http.proxyHost", "itgproxy");
        System.setProperty("http.proxyPort", "80");
        System.setProperty("http.keepAlive", "false");

        boolean testAlphaExists = false;
        ServiceBusContract service = new ServiceBusService();
        for (QueueInfo queue : iterateQueues(service)) {
            String queueName = queue.getName();
            if (queueName.startsWith("Test") || queueName.startsWith("test")) {
                if (queueName.equalsIgnoreCase("TestAlpha")) {
                    testAlphaExists = true;
                    long count = queue.getMessageCount();
                    for (long i = 0; i != count; ++i) {
                        service.receiveQueueMessage(queueName, new ReceiveMessageOptions().setTimeout(20));
                    }
                }
                else {
                    service.deleteQueue(queueName);
                }
            }
        }
        for (TopicInfo topic : iterateTopics(service)) {
            String topicName = topic.getName();
            if (topicName.startsWith("Test") || topicName.startsWith("test")) {
                service.deleteQueue(topicName);
            }
        }
        if (!testAlphaExists) {
            service.createQueue(new QueueInfo("TestAlpha"));
        }
    }
}
