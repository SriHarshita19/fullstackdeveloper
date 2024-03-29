package com.cts.training.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class ZullLogginFilter extends ZuulFilter{
Logger logger=LoggerFactory.getLogger(this.getClass());
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		logger.info("Should filter method start");
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		HttpServletRequest request=RequestContext.getCurrentContext().getRequest();
        logger.info("Request --> {} and URI --> {},",request,request.getRequestURI()); 
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		
		return 1;
	}

}
