package com.teamsankya.supershop.controller;

import java.util.List;

import com.teamsankya.supershop.dto.SupershopBean;

public class Test {

	public static void main(String[] args) {
		SupershopController superc = new SupershopController();
		List<SupershopBean> superbeanList =  superc.getId("pen");
		System.out.println(superbeanList);
	}

}
