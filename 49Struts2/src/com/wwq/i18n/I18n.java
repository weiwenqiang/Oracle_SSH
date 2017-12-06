package com.wwq.i18n;

import java.util.Locale;

public class I18n {
	public static void main(String[] args){
		Locale[] locale = Locale.getAvailableLocales();
		for (int i = 0; i < locale.length; i++) {
			Locale ll = locale[i];
			System.out.println(ll.getDisplayCountry()+"\t\t"+ll.getDisplayLanguage()+"\t\t"+ll.getLanguage()+"\t"+ll.getCountry());
		}
	}
}
