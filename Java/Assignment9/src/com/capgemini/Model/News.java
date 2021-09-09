package com.capgemini.Model;
public class News
{
	private int newsid;
	private String postedByUser;
	private String commentByUser;
	private String comment;
	public News(int newsid,String postedByUser,String commentByUser,String comment)
	{
		super();
		// TODO Auto-generated constructor stub
		this.newsid=newsid;
		this. postedByUser= postedByUser;
		this.commentByUser=commentByUser;
		this.comment=comment;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsid=" + newsid + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
	
}
