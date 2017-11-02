package com.example.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.pojo.Book;

@Repository
public class BookRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*@Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(dataSource);
    }*/
	
	public Book getBookInfo(String request) {
		Book book=jdbcTemplate.queryForObject("select * from book where name=?", new Object[] {request}, new RowMapper<Book>() {
			@Override
			public Book mapRow(ResultSet rs,
                    int rowNum) throws SQLException {
              Book b=new Book();
              b.setId(rs.getInt("id"));
              b.setName(rs.getString("name"));
              b.setWriter(rs.getString("writer"));
              b.setSerial_no(rs.getString("serial_no"));
              
              return b;
            }

			
		});
		return book;
	}
	
}
