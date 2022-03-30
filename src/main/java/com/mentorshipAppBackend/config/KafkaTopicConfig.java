package com.mentorshipAppBackend.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.kafka.config.TopicBuilder;

@Configurable
public class KafkaTopicConfig {

    public NewTopic mentorshipAppTopic() {
        return TopicBuilder.name("mentorshipApp")
                .build();
    }
}
