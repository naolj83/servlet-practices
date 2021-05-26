package com.douzone.guestbook.dao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
//		insertTest();
//		deleteTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		for (GuestbookVo vo : list) {
			System.out.println(vo);
		}
		
	}

	private static void insertTest() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("뽀로로");
		vo.setPassword("뽀로로비번");
		vo.setMessage("나는 뽀로로다");
		vo.setRegDate(LocalDateTime.now().toString());
		
		new GuestbookDao().insert(vo);
	}
	
	private static void deleteTest() {
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(9L);
		vo.setPassword("qlqjs");
		
		new GuestbookDao().delete(vo);
		
	}
		
}

