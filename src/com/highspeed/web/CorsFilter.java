package com.highspeed.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

//������������
@WebFilter("/*")
public class CorsFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		     HttpServletResponse resp = (HttpServletResponse) response;
	        
	        // ��������������ַ����������domain���� , ������
	        //�ӣ�ǰ̨axios����withCredentials: true��Access-Control-Allow-Origin��ֵ������Ϊ* 
	        resp.setHeader("Access-Control-Allow-Origin", "http://localhost:9080");
	        /* ������������ͷ */
	        resp.setHeader("Access-Control-Allow-Headers", "*");
	        /* �����������󷽷�GET, POST, HEAD �� */
	        resp.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
	        /* ����Ԥ�������Ļ���ʱ�� (s)     ǰ�˵�ַ����������    ��һ������ ������Ƿ�����ǰ�˵ĵ�ַ���� ����������    
                                                                                                    �ͻ�ִ�еڶ�������  �����ѯ�� ���룬 ɾ���� 
                                                                                                    
                                           ǰ����Ŀ�ĵ�һ���������Ԥ�죬 ����������ָ����ʱ���ڶ�����ҪԤ�� */
	        resp.setHeader("Access-Control-Max-Age", 20 * 24 * 60 * 60 + "");
	        /* �Ƿ�Я��cookie,session֧�� */
	        resp.setHeader("Access-Control-Allow-Credentials", "true");  
	        chain.doFilter(request, resp);

		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
