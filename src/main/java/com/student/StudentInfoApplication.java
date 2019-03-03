package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Arun Kaushik
 */
@SpringBootApplication
public class StudentInfoApplication {
  /**
   * @param args : running arguments
   * @implNote Main method responsible to run application
   */
  public static void main(String[] args) {
    SpringApplication.run(StudentInfoApplication.class, args);
  }
}
