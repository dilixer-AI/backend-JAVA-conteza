package com.webserverJAVA.backendJAVAconteza.app.repository;

import com.webserverJAVA.backendJAVAconteza.app.entity.Container;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContRepository  extends JpaRepository<Container, Long> {


}
