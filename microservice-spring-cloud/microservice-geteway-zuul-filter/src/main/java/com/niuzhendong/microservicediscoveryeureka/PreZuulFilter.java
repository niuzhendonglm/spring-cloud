package com.niuzhendong.microservicediscoveryeureka;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


/**
 * @author niuzhendong
 * @package_name com.niuzhendong.microservicediscoveryeureka
 * @project_name microservice-spring-cloud
 * @date 2020/1/9
 */
public class PreZuulFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(PreZuulFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String remoteHost = request.getRemoteHost();
        PreZuulFilter.LOGGER.info("远程的host："+remoteHost);
        return null;
    }
}
