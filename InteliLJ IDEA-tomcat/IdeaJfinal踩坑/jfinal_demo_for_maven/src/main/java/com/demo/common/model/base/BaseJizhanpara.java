package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseJizhanpara<M extends BaseJizhanpara<M>> extends Model<M> implements IBean {

	public M setEUI(java.lang.Integer EUI) {
		set("EUI", EUI);
		return (M)this;
	}
	
	public java.lang.Integer getEUI() {
		return getInt("EUI");
	}

	public M setHardwareversion(java.lang.String Hardwareversion) {
		set("Hardwareversion", Hardwareversion);
		return (M)this;
	}
	
	public java.lang.String getHardwareversion() {
		return getStr("Hardwareversion");
	}

	public M setFirmwareversion(java.lang.String Firmwareversion) {
		set("Firmwareversion", Firmwareversion);
		return (M)this;
	}
	
	public java.lang.String getFirmwareversion() {
		return getStr("Firmwareversion");
	}

	public M setDeviceHandle(java.lang.String DeviceHandle) {
		set("DeviceHandle", DeviceHandle);
		return (M)this;
	}
	
	public java.lang.String getDeviceHandle() {
		return getStr("DeviceHandle");
	}

	public M setNetID(java.lang.String NetID) {
		set("NetID", NetID);
		return (M)this;
	}
	
	public java.lang.String getNetID() {
		return getStr("NetID");
	}

	public M setNBroker(java.lang.String NBroker) {
		set("NBroker", NBroker);
		return (M)this;
	}
	
	public java.lang.String getNBroker() {
		return getStr("NBroker");
	}

	public M setNMSBroker(java.lang.String NMSBroker) {
		set("NMSBroker", NMSBroker);
		return (M)this;
	}
	
	public java.lang.String getNMSBroker() {
		return getStr("NMSBroker");
	}

	public M setDHCP(java.lang.String DHCP) {
		set("DHCP", DHCP);
		return (M)this;
	}
	
	public java.lang.String getDHCP() {
		return getStr("DHCP");
	}

	public M setGUP4(java.lang.String GUP4) {
		set("GUP4", GUP4);
		return (M)this;
	}
	
	public java.lang.String getGUP4() {
		return getStr("GUP4");
	}

	public M setIP(java.lang.String IP) {
		set("IP", IP);
		return (M)this;
	}
	
	public java.lang.String getIP() {
		return getStr("IP");
	}

	public M setSubNetMask(java.lang.String SubNetMask) {
		set("SubNetMask", SubNetMask);
		return (M)this;
	}
	
	public java.lang.String getSubNetMask() {
		return getStr("SubNetMask");
	}

	public M setDefaultGateWay(java.lang.String DefaultGateWay) {
		set("DefaultGateWay", DefaultGateWay);
		return (M)this;
	}
	
	public java.lang.String getDefaultGateWay() {
		return getStr("DefaultGateWay");
	}

	public M setDNS(java.lang.String DNS) {
		set("DNS", DNS);
		return (M)this;
	}
	
	public java.lang.String getDNS() {
		return getStr("DNS");
	}

	public M setAPN(java.lang.String APN) {
		set("APN", APN);
		return (M)this;
	}
	
	public java.lang.String getAPN() {
		return getStr("APN");
	}

	public M setGPSLati(java.lang.String GPSLati) {
		set("GPSLati", GPSLati);
		return (M)this;
	}
	
	public java.lang.String getGPSLati() {
		return getStr("GPSLati");
	}

	public M setGPSLongti(java.lang.String GPSLongti) {
		set("GPSLongti", GPSLongti);
		return (M)this;
	}
	
	public java.lang.String getGPSLongti() {
		return getStr("GPSLongti");
	}

	public M setFreqlist(java.lang.String Freqlist) {
		set("Freqlist", Freqlist);
		return (M)this;
	}
	
	public java.lang.String getFreqlist() {
		return getStr("Freqlist");
	}

	public M setBeaconDR(java.lang.String BeaconDR) {
		set("BeaconDR", BeaconDR);
		return (M)this;
	}
	
	public java.lang.String getBeaconDR() {
		return getStr("BeaconDR");
	}

	public M setBeaconFreq(java.lang.String BeaconFreq) {
		set("BeaconFreq", BeaconFreq);
		return (M)this;
	}
	
	public java.lang.String getBeaconFreq() {
		return getStr("BeaconFreq");
	}

}
