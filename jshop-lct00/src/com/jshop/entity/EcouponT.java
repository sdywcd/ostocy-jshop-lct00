package com.jshop.entity;

// Generated 2012-8-2 9:31:29 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * EcouponT generated by hbm2java
 */
public class EcouponT implements java.io.Serializable {

	private String eid;
	private String goodsname;
	private double favourableprices;
	private double pricededuction;
	private String goodsid;
	private Date begintime;
	private Date endtime;
	private String ecouponstate;
	private String state;
	private String note;
	private String timerangebegin;
	private String timerangeendtime;

	public EcouponT() {
	}

	public EcouponT(String eid, String goodsname, double favourableprices,
			double pricededuction, String goodsid, Date begintime,
			Date endtime, String ecouponstate, String state, String note,
			String timerangebegin, String timerangeendtime) {
		this.eid = eid;
		this.goodsname = goodsname;
		this.favourableprices = favourableprices;
		this.pricededuction = pricededuction;
		this.goodsid = goodsid;
		this.begintime = begintime;
		this.endtime = endtime;
		this.ecouponstate = ecouponstate;
		this.state = state;
		this.note = note;
		this.timerangebegin = timerangebegin;
		this.timerangeendtime = timerangeendtime;
	}

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public double getFavourableprices() {
		return this.favourableprices;
	}

	public void setFavourableprices(double favourableprices) {
		this.favourableprices = favourableprices;
	}

	public double getPricededuction() {
		return this.pricededuction;
	}

	public void setPricededuction(double pricededuction) {
		this.pricededuction = pricededuction;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getEcouponstate() {
		return this.ecouponstate;
	}

	public void setEcouponstate(String ecouponstate) {
		this.ecouponstate = ecouponstate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTimerangebegin() {
		return this.timerangebegin;
	}

	public void setTimerangebegin(String timerangebegin) {
		this.timerangebegin = timerangebegin;
	}

	public String getTimerangeendtime() {
		return this.timerangeendtime;
	}

	public void setTimerangeendtime(String timerangeendtime) {
		this.timerangeendtime = timerangeendtime;
	}

}
