package deconto.avaliacao.sva.configurations;

import org.springframework.amqp.core.Declarables;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import deconto.avaliacao.sva.constants.RabbitMQConstants;

@Configuration
public class RabbitMQConfig {

	@Bean
	Declarables qs() {
		return new Declarables(
			new Queue(RabbitMQConstants.QUEUE, true, false, false)
		);
	}
	
	@Bean
	public RabbitTemplate jsonRabbitTemplate(ConnectionFactory connectionFactory, ObjectMapper mapper) {
	    final var jsonRabbitTemplate = new RabbitTemplate(connectionFactory);
    	jsonRabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter(mapper));
	    return jsonRabbitTemplate;
	}

}
