package com.soa.vie.takaful.batch;

import javax.sql.DataSource;

import com.soa.vie.takaful.entitymodels.Cotisation;
import com.soa.vie.takaful.util.Constants;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnuelReaderFromDB extends JdbcCursorItemReader<Cotisation> {

    public AnnuelReaderFromDB(@Autowired DataSource dataSource) {

        setDataSource(dataSource);
        setSql(Constants.SQLREQUESTANNUELCOTISATION);
        setRowMapper(new CotisationRowMapper());
    }

}
