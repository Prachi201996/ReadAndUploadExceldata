package model;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Freight_Register")
public class FreightRegisterTemplate {
	
	
	@Id
	/*  @Column(name = "Freight_User_ID_Name")
	 private String Freight_User_ID_Name;

	  @Column(name = "Freight_Upload_file_Date")
	  private Date Freight_Upload_file_Date;

	  @Column(name = "Freight_Upload_file_Time")
	  private LocalTime Freight_Upload_file_Time;

	  @Column(name = "Freight_File_Name")
	  private String Freight_File_Name;
	*/
		
	  
	  @Column(name = "Invoice_No")
	  private String Invoice_No;

	  @Column(name = "Date")
	  private Date Date;

	  @Column(name = "Invoice_Account")
	  private String Invoice_Account;

	  @Column(name = "Name")
	  private String Name;
	  
	  @Column(name = "Customer_Group")
	  private String Customer_Group;

	  @Column(name = "Factory_Site")
	  private String Factory_Site;

	  @Column(name = "Sales_Branch")
	  private String Sales_Branch;

	  @Column(name = "Gross_Weight")
	  private double Gross_Weight;
	  
	  @Column(name = "Sales")
	  private double Sales;
	  
	  @Column(name = "Cogs")
	  private String Cogs;
	  
	  @Column(name = "Carrier")
	  private String Carrier;
	  
	  @Column(name = "Delivery_State")
	  private String Delivery_State;
	  
	  @Column(name = "Delivery_City")
	  private String Delivery_City;
	  
	  @Column(name = "LR_Number")
	  private String LR_Number;
	  
	  @Column(name = "LR_Date")
	  private Date LR_Date;
	  
	  @Column(name = "Vehicle_No")
	  private String Vehicle_No;
	  
	  @Column(name = "Load_Type")
	  private String Load_Type;
	  
	  @Column(name = "Vehicle_Capacity")
	  private double Vehicle_Capacity;
	  
	  @Column(name = "Chargable_Weight")
	  private double Chargable_Weight;
	  
	  @Column(name = "Consignment_Type")
	  private String Consignment_Type;
	  
	  @Column(name = "Freight_Amount")
	  private double Freight_Amount;
	  
	  @Column(name = "Remarks")
	  private String Remarks;
	  
	  @Column(name = "Destination_code")
	  private String Destination_code;
	  
	  public FreightRegisterTemplate() {
		  
	  }
	  
	  

	public FreightRegisterTemplate(String Invoice_No, java.util.Date Date, String Invoice_Account, String Name, String Customer_Group, String Factory_Site, String Sales_Branch, double Gross_Weight, double Sales, String Cogs, String Carrier, String Delivery_State, String Delivery_City, String LR_Number, java.util.Date LR_Date, String Vehicle_No, String Load_Type, double Vehicle_Capacity, double Chargable_Weight, String Consignment_Type, double Freight_Amount, String Remarks, String Destination_code) {
	
		this.Invoice_No = Invoice_No;
		this.Date = Date;
		this.Invoice_Account = Invoice_Account;
		this.Name = Name;
		this.Customer_Group = Customer_Group;
		this.Factory_Site = Factory_Site;
		this.Sales_Branch = Sales_Branch;
		this.Gross_Weight = Gross_Weight;
		this.Sales = Sales;
		this.Cogs = Cogs;
		this.Carrier = Carrier;
		this.Delivery_State = Delivery_State;
		this.Delivery_City = Delivery_City;
		this.LR_Number = LR_Number;
		this.LR_Date = LR_Date;
		this.Vehicle_No = Vehicle_No;
		this.Load_Type = Load_Type;
		this.Vehicle_Capacity = Vehicle_Capacity;
		this.Chargable_Weight = Chargable_Weight;
		this.Consignment_Type = Consignment_Type;
		this.Freight_Amount = Freight_Amount;
		this.Remarks = Remarks;
		this.Destination_code = Destination_code;
	}

	public String getInvoice_No() {
		return Invoice_No;
	}

	public void setInvoice_No(String invoice_No) {
		this.Invoice_No = invoice_No;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		this.Date = date;
	}

	public String getInvoice_Account() {
		return Invoice_Account;
	}

	public void setInvoice_Account(String invoice_Account) {
		this.Invoice_Account = invoice_Account;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getCustomer_Group() {
		return Customer_Group;
	}

	public void setCustomer_Group(String customer_Group) {
		this.Customer_Group = customer_Group;
	}

	public String getFactory_Site() {
		return Factory_Site;
	}

	public void setFactory_Site(String factory_Site) {
		this.Factory_Site = factory_Site;
	}

	public String getSales_Branch() {
		return Sales_Branch;
	}

	public void setSales_Branch(String sales_Branch) {
		this.Sales_Branch = sales_Branch;
	}

	public double getGross_Weight() {
		return Gross_Weight;
	}

	public void setGross_Weight(double gross_Weight) {
		this.Gross_Weight = gross_Weight;
	}

	public double getSales() {
		return Sales;
	}

	public void setSales(double sales) {
		this.Sales = sales;
	}

	public String getCogs() {
		return Cogs;
	}

	public void setCogs(String cogs) {
		this.Cogs = cogs;
	}

	public String getCarrier() {
		return Carrier;
	}

	public void setCarrier(String carrier) {
		this.Carrier = carrier;
	}

	public String getDelivery_State() {
		return Delivery_State;
	}

	public void setDelivery_State(String delivery_State) {
		this.Delivery_State = delivery_State;
	}

	public String getDelivery_City() {
		return Delivery_City;
	}

	public void setDelivery_City(String delivery_City) {
		this.Delivery_City = delivery_City;
	}

	public String getLR_Number() {
		return LR_Number;
	}

	public void setLR_Number(String lR_Number) {
		this.LR_Number = lR_Number;
	}

	public Date getLR_Date() {
		return LR_Date;
	}

	public void setLR_Date(Date lR_Date) {
		this.LR_Date = lR_Date;
	}

	public String getVehicle_No() {
		return Vehicle_No;
	}

	public void setVehicle_No(String vehicle_No) {
		this.Vehicle_No = vehicle_No;
	}

	public String getLoad_Type() {
		return Load_Type;
	}

	public void setLoad_Type(String load_Type) {
		this.Load_Type = load_Type;
	}

	public double getVehicle_Capacity() {
		return Vehicle_Capacity;
	}

	public void setVehicle_Capacity(double vehicle_Capacity) {
		this.Vehicle_Capacity = vehicle_Capacity;
	}

	public double getChargable_Weight() {
		return Chargable_Weight;
	}

	public void setChargable_Weight(double chargable_Weight) {
		this.Chargable_Weight = chargable_Weight;
	}

	public String getConsignment_Type() {
		return Consignment_Type;
	}

	public void setConsignment_Type(String consignment_Type) {
		this.Consignment_Type = consignment_Type;
	}

	public double getFreight_Amount() {
		return Freight_Amount;
	}

	public void setFreight_Amount(double freight_Amount) {
		this.Freight_Amount = freight_Amount;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		this.Remarks = remarks;
	}

	public String getDestination_code() {
		return Destination_code;
	}

	public void setDestination_code(String destination_code) {
		this.Destination_code = destination_code;
	}

	@Override
	public String toString() {
		return "FreightRegisterTemplate [Invoice_No=" + Invoice_No + ", Date=" + Date + ", Invoice_Account="
				+ Invoice_Account + ", Name=" + Name + ", Customer_Group=" + Customer_Group + ", Factory_Site="
				+ Factory_Site + ", Sales_Branch=" + Sales_Branch + ", Gross_Weight=" + Gross_Weight + ", Sales="
				+ Sales + ", Cogs=" + Cogs + ", Carrier=" + Carrier + ", Delivery_State=" + Delivery_State
				+ ", Delivery_City=" + Delivery_City + ", LR_Number=" + LR_Number + ", LR_Date=" + LR_Date
				+ ", Vehicle_No=" + Vehicle_No + ", Load_Type=" + Load_Type + ", Vehicle_Capacity=" + Vehicle_Capacity
				+ ", Chargable_Weight=" + Chargable_Weight + ", Consignment_Type=" + Consignment_Type
				+ ", Freight_Amount=" + Freight_Amount + ", Remarks=" + Remarks + ", Destination_code="
				+ Destination_code + "]";
	}
	  
}
