package com.example.merks.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class DataItem implements Parcelable {
	protected DataItem(Parcel in) {
		// Ambil data dari Parcel
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// Tulis data ke Parcel
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<DataItem> CREATOR = new Creator<DataItem>() {
		@Override
		public DataItem createFromParcel(Parcel in) {
			return new DataItem(in);
		}

		@Override
		public DataItem[] newArray(int size) {
			return new DataItem[size];
		}
	};

	@SerializedName("asal")
	private String asal;

	@SerializedName("nama")
	private String nama;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("filosofi")
	private String filosofi;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("logo")
	private String logo;

	@SerializedName("id")
	private int id;

	@SerializedName("desc")
	private String desc;

	public void setAsal(String asal){
		this.asal = asal;
	}

	public String getAsal(){
		return asal;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setFilosofi(String filosofi){
		this.filosofi = filosofi;
	}

	public String getFilosofi(){
		return filosofi;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setLogo(String logo){
		this.logo = logo;
	}

	public String getLogo(){
		return logo;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

	public String getDesc(){
		return desc;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"asal = '" + asal + '\'' + 
			",nama = '" + nama + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",filosofi = '" + filosofi + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",logo = '" + logo + '\'' + 
			",id = '" + id + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}