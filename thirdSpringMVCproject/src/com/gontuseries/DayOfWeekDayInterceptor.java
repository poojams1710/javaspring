package com.gontuseries;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekDayInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception{
		 Calendar cal=Calendar.getInstance();
		 int dayofweek=cal.get(cal.DAY_OF_WEEK);
		 if(dayofweek==6) {
			 
			 response.getWriter().write("this site closed on friday if visitor is mohit then we ill do something");
			 return false;
		 }
		 return true;
		
	}
	
	
	
	
}