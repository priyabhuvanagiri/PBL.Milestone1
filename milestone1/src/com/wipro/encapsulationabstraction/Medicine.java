package com.wipro.encapsulationabstraction;

	public class Medicine {
		private String medname;
		private String batchno;
		private String disease;
		private double price;
		public Medicine() {}
		public Medicine(String medname,String batchno,String disease,double price) {
			this.medname=medname;
			this.batchno=batchno;
			this.disease=disease;
			this.price=price;
		}
		public String getMedname() {
			return medname;
		}
		public void setMedname(String medname) {
			this.medname = medname;
		}
		public String getBatchno() {
			return batchno;
		}
		public void setBatchno(String batchno) {
			this.batchno = batchno;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
	}


