package com.jspider.student;

public class Song {
	String sname;
	String singer;
	String type;
	void Song(String sname, String singer, String type)
	{
		this.sname=sname;
		this.singer=singer;
		this.type=type;
	}
	void details()
	{
		System.out.println(sname);
		System.out.println(singer);
		System.out.println(type);
	}

	public static void main(String[] args) {
		Song s=new Song();
		s.Song("ra","rafi","mp3");
		s.details();

	}

}
