package com.example.demo.runner;

import java.util.List;
import java.util.Set;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationArgument implements ApplicationRunner {
	
	@Autowired
	List<String> mailList;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<String> blockedMails=args.getNonOptionArgs();
			Set<String> temp=new HashSet<>();
		mailList.forEach(mail->{
			boolean flag=false;
			for(String obj:blockedMails) {
				if(mail.equals(obj)) {
					System.out.println("Mail not sent to blocked mail: "+obj);
					flag=true;
					break;
				}
			}
				if(flag==false) {
					temp.add(mail);
					
				}

			
		});// TODO Auto-generated method stub
		if(temp.isEmpty()) {
			System.out.println("Mail sent to : "+mailList);
		}
		else {
			System.out.println("Mail sent to : "+temp);
		}
		
	}

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		List<String> blockedMails=
//
//	}

}
