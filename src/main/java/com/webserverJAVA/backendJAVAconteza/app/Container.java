package com.webserverJAVA.backendJAVAconteza.app;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Container {
  private long id;
  private String number;
  private String company;
  private String size;
  private String cargo;
  private String status;
  private LocalDateTime created;
}
