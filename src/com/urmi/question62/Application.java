package com.urmi.question62;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat df = new DateFormat() {
		

			@Override
			public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Date parse(String source, ParsePosition pos) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		//df.setLocale(Locale.ITALY);
		//result compilation fail
		String s = df.format(date);
		
	}
	
	
}
