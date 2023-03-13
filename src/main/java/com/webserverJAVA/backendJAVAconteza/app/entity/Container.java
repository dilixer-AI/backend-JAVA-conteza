package com.webserverJAVA.backendJAVAconteza.app.entity;

;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.Message;







@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "containers")
public class Container {
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private  long id;
  private String number;
  private String company;
  private String size;
  private String cargo;
  private String status;
}





