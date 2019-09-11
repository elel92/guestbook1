<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="kr.co.itcen.guestbook.dao.GuestbookDao"%>
<%@page import="kr.co.itcen.guestbook.vo.GuestbookVo"%>
<%
	request.setCharacterEncoding("utf-8");
	String para_no = request.getParameter("no");
	int no = Integer.parseInt(para_no);
	String password = request.getParameter("password");
	
	new GuestbookDao().set_delete(no, password);
	
	response.sendRedirect(request.getContextPath());
%>