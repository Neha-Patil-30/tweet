package com.application.tweetapp.tweet.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class DynamoDbConfig {
	 
	    @Bean
	    public DynamoDBMapper dynamoDBMapper() {
	        return new DynamoDBMapper(buildAmazonDynamoDB());
	    }

	 

	    private AmazonDynamoDB buildAmazonDynamoDB() {
	        return AmazonDynamoDBClientBuilder.standard()
	                .withEndpointConfiguration(
	                        new AwsClientBuilder.EndpointConfiguration("dynamodb.us-east-2.amazonaws.com", "us-east-2"))
	                .withCredentials(new AWSStaticCredentialsProvider(
	                        new BasicAWSCredentials("AKIATYTEAV6LTNSZQFHN", "WW4U7nS0J79ZkMjYFHM3ej7gk+j+n73gMes+v9Rd")))
	                .build();
	    }

	 

	}


