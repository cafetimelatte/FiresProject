package com.yg.ex16;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job{

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Quartz의 Job이 실행됨 - System.currentTimeMillis() :"  +
				new Date(System.currentTimeMillis()));
		
	}
	
}
