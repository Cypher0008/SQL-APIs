package com.jksap.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="mst_cement_type")
public class mst_cment_type {
	
	@Id
	@Column(name="ctype_id ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer ctype_id;
    private String ctype_name;
  //  private Integer plant_no;

 public mst_cment_type()
 {
 
 }
 public mst_cment_type(Integer ctype_id, String ctype_name)
 {
	 super();
		this.ctype_id=ctype_id;
		this.ctype_name=ctype_name;
		
 }
/**
 * @return the ctype_id
 */
public Integer getCtype_id() {
	return ctype_id;
}
/**
 * @param ctype_id the ctype_id to set
 */
public void setCtype_id(Integer ctype_id) {
	this.ctype_id = ctype_id;
}
/**
 * @return the ctype_name
 */
public String getCtype_name() {
	return ctype_name;
}
/**
 * @param ctype_name the ctype_name to set
 */
public void setCtype_name(String ctype_name) {
	this.ctype_name = ctype_name;
}

}
