package org.camunda.example.externaltaskworker;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.spring.boot.starter.ClientProperties;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlerConfiguration {

  protected static Logger LOG = LoggerFactory.getLogger(HandlerConfiguration.class);

  protected String workerId;

  public HandlerConfiguration(ClientProperties properties) {
    workerId = properties.getWorkerId();
  }

  @ExternalTaskSubscription("log")
  @Bean
  public ExternalTaskHandler creditScoreChecker() {
    return (externalTask, externalTaskService) -> {

      LOG.info("Item {}", externalTask.getVariable("item").toString());
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      externalTaskService.complete(externalTask);
    };
  }


}
