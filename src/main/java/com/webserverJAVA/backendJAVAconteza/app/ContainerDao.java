package com.webserverJAVA.backendJAVAconteza.app;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class ContainerDao {
    private final NamedParameterJdbcTemplate template;

    public ContainerDao(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public Long createContainer (Container container) {
        String sql = "INSERT INTO containers (number, company, size, cargo, status, created) "
                + "VALUES (:number, :company, :size, :cargo, :status, :created) RETURNING ID";
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("number", container.getNumber())
                .addValue("company", container.getCompany())
                .addValue("size", container.getSize())
                .addValue("cargo", container.getCargo())
                .addValue("status", container.getStatus())
                .addValue("created", container.getCreated());

        return template.queryForObject(sql, parameterSource, Long.class);
    }

    public Container getContainerById(long id) {
        String sql = "SELECT * FROM containers WHERE container.id = :id";
        SqlParameterSource parameterSource = new MapSqlParameterSource("id", id);
        return template.queryForObject(sql, parameterSource, new ContainerRowMapper());
    }

    public void editContainer(Container container) {
        String sql = "UPDATE customer SET fio = :fio, address = :address, phone = :phone WHERE id = :id";
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("id", container.getId())
                .addValue("number", container.getNumber())
                .addValue("company", container.getCompany())
                .addValue("size", container.getSize())
                .addValue("cargo", container.getCargo())
                .addValue("status", container.getStatus())
                .addValue("created", container.getCreated());

        template.update(sql, parameterSource);
    }

    public void deleteContainer(long id) {
        String sql = "DELETE FROM containers WHERE id = :id";
        SqlParameterSource parameterSource = new MapSqlParameterSource("id", id);
        template.update(sql, parameterSource);
    }
}