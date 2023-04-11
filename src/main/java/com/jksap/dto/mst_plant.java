package com.jksap.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity

public class mst_plant {
	
	@Id
	@Column(name="p_id ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer p_id;
    private String p_name;
    private Integer plant_no;

 public mst_plant()
 {
 
 }
 public mst_plant(Integer p_id, String p_name, Integer plant_no)
 {
	 super();
		this.p_id=p_id;
		this.p_name = p_name;
		this.plant_no = plant_no;
 }
/**
 * @return the p_id
 */
public Integer getP_id() {
	return p_id;
}
/**
 * @param p_id the p_id to set
 */
public void setP_id(Integer p_id) {
	this.p_id = p_id;
}
/**
 * @return the p_name
 */
public String getP_name() {
	return p_name;
}
/**
 * @param p_name the p_name to set
 */
public void setP_name(String p_name) {
	this.p_name = p_name;
}
/**
 * @return the plant_no
 */
public Integer getPlant_no() {
	return plant_no;
}
/**
 * @param plant_no the plant_no to set
 */
public void setPlant_no(Integer plant_no) {
	this.plant_no = plant_no;
}

}
