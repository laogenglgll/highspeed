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

//拦截所有请求
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
	        
	        // 允许跨域的主机地址，允许任意domain访问 , 白名单
	        //坑：前台axios设置withCredentials: true后，Access-Control-Allow-Origin的值不可以为* 
	        resp.setHeader("Access-Control-Allow-Origin", "http://localhost:9080");
	        /* 允许跨域的请求头 */
	        resp.setHeader("Access-Control-Allow-Headers", "*");
	        /* 允许跨域的请求方法GET, POST, HEAD 等 */
	        resp.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
	        /* 重新预检验跨域的缓存时间 (s)     前端地址发两个请求    第一个请求： 检测后端是否允许前端的地址跨域， 如果允许跨域    
                                                                                                    就会执行第二个请求，  比如查询， 插入， 删除。 
                                                                                                    
                                           前端项目的第一个请求会有预检， 其他请求在指定的时间内都不需要预检 */
	        resp.setHeader("Access-Control-Max-Age", 20 * 24 * 60 * 60 + "");
	        /* 是否携带cookie,session支持 */
	        resp.setHeader("Access-Control-Allow-Credentials", "true");  
	        chain.doFilter(request, resp);

		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
