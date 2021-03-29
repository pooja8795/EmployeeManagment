package com.example.employee.Configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("basic")
public class BasicConfiguration {
   String msg;
   int no;
   String app_name;
}
