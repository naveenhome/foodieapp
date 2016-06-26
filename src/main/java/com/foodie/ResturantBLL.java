package com.foodie;

public class ResturantBLL {

	public boolean find(String location, String foodType) {
		// TODO Auto-generated method stub
		if (location.equals("Hitech City"))
			return true;
		else
			return false;
	}
	
	public boolean AddNew(Resturants rest)
	{
		//business logic

		ResturantDao restdao = new ResturantDao();
		return restdao.AddNew(rest);
	}
	

}
