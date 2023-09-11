package com.genpact.projectk.coding.designpatterns;

public class SOLID {
	public static void main(String[] args) {
		Whatsapp w=new Whatsapp();
		w.setStatus();
		FaceBook fb=new FaceBook();
		fb.groupVideocall();
	}

}

interface SocialMedia{
	public void chatWithFriends();
	
	
}
interface VideoManager{
	public void groupVideocall();
}
interface PhotosMediaManager{
	
	public void postOnNewsFeed();
}
interface PostStatus{
	public void setStatus();
}
class FaceBook implements VideoManager,PhotosMediaManager{

	@Override
	public void postOnNewsFeed() {
		System.out.println("posted on facebook wall");
		
	}

	@Override
	public void groupVideocall() {
		// TODO Auto-generated method stub
		System.out.println("facebook group call");
	}
	
}
class Whatsapp implements VideoManager,PostStatus{

	@Override
	public void setStatus() {
		// TODO Auto-generated method stub
		System.out.println("status has been set in whatsapp");
	}

	@Override
	public void groupVideocall() {
		// TODO Auto-generated method stub
		System.out.println("whatsapp group video calls");
	}
	
}
