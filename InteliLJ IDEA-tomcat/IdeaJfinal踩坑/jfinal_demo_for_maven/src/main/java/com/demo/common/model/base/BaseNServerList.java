package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseNServerList<M extends BaseNServerList<M>> extends Model<M> implements IBean {

	public M setSN(java.lang.Integer SN) {
		set("SN", SN);
		return (M)this;
	}
	
	public java.lang.Integer getSN() {
		return getInt("SN");
	}

	public M setNsNwkid(java.lang.String nsNwkid) {
		set("ns_nwkid", nsNwkid);
		return (M)this;
	}
	
	public java.lang.String getNsNwkid() {
		return getStr("ns_nwkid");
	}

	public M setNsNetid(java.lang.String nsNetid) {
		set("ns_netid", nsNetid);
		return (M)this;
	}
	
	public java.lang.String getNsNetid() {
		return getStr("ns_netid");
	}

	public M setNsName(java.lang.String nsName) {
		set("ns_name", nsName);
		return (M)this;
	}
	
	public java.lang.String getNsName() {
		return getStr("ns_name");
	}

	public M setNsOverload(java.lang.String nsOverload) {
		set("ns_overload", nsOverload);
		return (M)this;
	}
	
	public java.lang.String getNsOverload() {
		return getStr("ns_overload");
	}

	public M setNsUppackets(java.lang.String nsUppackets) {
		set("ns_uppackets", nsUppackets);
		return (M)this;
	}
	
	public java.lang.String getNsUppackets() {
		return getStr("ns_uppackets");
	}

	public M setNsUpbytes(java.lang.String nsUpbytes) {
		set("ns_upbytes", nsUpbytes);
		return (M)this;
	}
	
	public java.lang.String getNsUpbytes() {
		return getStr("ns_upbytes");
	}

	public M setNsDnpackets(java.lang.String nsDnpackets) {
		set("ns_dnpackets", nsDnpackets);
		return (M)this;
	}
	
	public java.lang.String getNsDnpackets() {
		return getStr("ns_dnpackets");
	}

	public M setNsGwcounts(java.lang.String nsGwcounts) {
		set("ns_gwcounts", nsGwcounts);
		return (M)this;
	}
	
	public java.lang.String getNsGwcounts() {
		return getStr("ns_gwcounts");
	}

	public M setNsAppcounts(java.lang.String nsAppcounts) {
		set("ns_appcounts", nsAppcounts);
		return (M)this;
	}
	
	public java.lang.String getNsAppcounts() {
		return getStr("ns_appcounts");
	}

	public M setNsMotecounts(java.lang.String nsMotecounts) {
		set("ns_motecounts", nsMotecounts);
		return (M)this;
	}
	
	public java.lang.String getNsMotecounts() {
		return getStr("ns_motecounts");
	}

	public M setNsActivemotes(java.lang.String nsActivemotes) {
		set("ns_activemotes", nsActivemotes);
		return (M)this;
	}
	
	public java.lang.String getNsActivemotes() {
		return getStr("ns_activemotes");
	}

}
