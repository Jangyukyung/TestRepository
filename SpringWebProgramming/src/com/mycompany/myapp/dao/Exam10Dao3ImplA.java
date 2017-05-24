package com.mycompany.myapp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("subExam10Dao3ImplA")
public class Exam10Dao3ImplA implements Exam10Dao3{
	private static final Logger LOGGER=LoggerFactory.getLogger(Exam10Dao3ImplA.class);
	
	@Override
	public void insert(){
		LOGGER.info("회원가입");
		//System.out.println("Exam10Dao3Impl insert() 실행 ! ");
	}
	
	@Override
	public void select(){
		LOGGER.info("회원가입검색");
		//System.out.println("Exam10Dao3Impl select() 실행 ! ");
	}
}
