package com.example.demo_back.controller;

import com.example.demo_back.configuration.bean.Dot;
import com.example.demo_back.dto.DotResponse;
import com.example.demo_back.service.DotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GetDotController {
    @Autowired
    DotService dotService;
    @ResponseBody
    @RequestMapping(value = "/getDot")
    public DotResponse getDot(HttpServletRequest request){
        try {
            System.out.print("Y="+request.getParameter("Y")+" X="+request.getParameter("X")+" R="+request.getParameter("R")+"\n");
            Double X = Double.parseDouble(request.getParameter("X"));
            Double Y = Double.parseDouble(request.getParameter("Y"));
            Integer R = Integer.parseInt(request.getParameter("R"));
            if(Y > 4.0||Y <- 4.0){
                DotResponse responseDot = new DotResponse();
                responseDot.setMessage("Please make sure your y is not bigger than 3, and not smaller than -3\n");
                return responseDot;
            }else if(X > 4 || X < -4){
                DotResponse responseDot = new DotResponse();
                responseDot.setMessage("Please make sure your X is not bigger than -5, and not smaller than 3\n");
                return responseDot;
            }/*
            here is spring bean, i finished it at beginning. But in fact it's not important in this lab(
            //get bean
            DotBean bean = (DotBean) DemoBackApplication.AC.getBean("dotBean");
            //destroy old one
            DefaultSingletonBeanRegistry registry = (DefaultSingletonBeanRegistry) DemoBackApplication.AC.getBeanFactory();
            registry.destroySingleton("dotBean");
            Dot newDot = new Dot(X, Y, R);
            bean.addDot(newDot);
            //create new one
            registry.registerSingleton("dotBean", bean);
            */
            Dot newDot = new Dot(X, Y, R);
            dotService.addDot(newDot.getX(),newDot.getY(),newDot.getR(),newDot.getHit(),newDot.getDate());
            return new DotResponse(newDot.getX(),newDot.getY(),newDot.getR(),newDot.getHit(),newDot.getDate(),"success\n",false);
        }catch (NumberFormatException e){
            DotResponse responseDot = new DotResponse();
            responseDot.setMessage("Please input a available number for Y(like 2, -1.0, 1.5)\n");
            return responseDot;
        }
    }
}
