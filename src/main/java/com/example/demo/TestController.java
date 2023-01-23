package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	  @GetMapping("/test/{order}")
		public PointsBean getUserDetails(@PathVariable Long order) {
		  PointsBean pointsBean=new PointsBean();
		 Long  points=0L;
		  if(order>100) {
			  points=points+(order-100)*2+50;
			
		  }else if(order>=50 && order<=100) {
			  points=order-50;
		  }
		  pointsBean.setPoints(points);
			return pointsBean;
		  }
	
}
