package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.pojo.Book;
import com.example.repo.BookRepo;

import io.spring.guides.gs_producing_web_service.GetWriterRequest;
import io.spring.guides.gs_producing_web_service.GetWriterResponse;

@Endpoint
public class BookStoreEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	@Autowired
	BookRepo repo;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWriterRequest")
	@ResponsePayload
	public GetWriterResponse getCountry(@RequestPayload GetWriterRequest request) {
		GetWriterResponse response = new GetWriterResponse();
		Book bookInfo = repo.getBookInfo(request.getBookName());
		response.setWriter(bookInfo.getWriter());
		return response;
	}

}
