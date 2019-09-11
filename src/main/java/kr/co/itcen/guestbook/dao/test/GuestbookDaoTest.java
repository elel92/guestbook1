package kr.co.itcen.guestbook.dao.test;

import java.util.Date;

import kr.co.itcen.guestbook.dao.GuestbookDao;
import kr.co.itcen.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		//insertTest();
		deleteAll();
	}
	
	private static void insertTest() {
		GuestbookVo vo = new GuestbookVo();
		Date d = new Date();
		vo.setName("강민호");
		vo.setPassword("1234");
		vo.setContents("ㅎㅇㅎㅇ");
		vo.setReg_date("2019-09-11");
		
		new GuestbookDao().insert(vo);
	}
	
	private static void deleteAll() {
		new GuestbookDao().delete();
	}
}
