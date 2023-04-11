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
@Table(name="cloud_insert_smpl_collection")
public class Cloud_insert_smpl_collection {
	
	@Id
	@Column(name="cloud_insert_smpl_collection_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer cloud_insert_smpl_collection_id;
	private Integer smpl_collection_id,plant_id;
	private Boolean is_sent;
	
	public Cloud_insert_smpl_collection()
	{
		
	}
	
	public Cloud_insert_smpl_collection(Integer cloud_insert_smpl_collection_id, Integer smpl_collection_id,
			Integer plant_id, Boolean is_sent) {
		super();
		this.cloud_insert_smpl_collection_id = cloud_insert_smpl_collection_id;
		this.smpl_collection_id = smpl_collection_id;
		this.plant_id = plant_id;
		this.is_sent = is_sent;
	}

	/**
	 * @return the cloud_insert_smpl_collection_id
	 */
	public Integer getCloud_insert_smpl_collection_id() {
		return cloud_insert_smpl_collection_id;
	}

	/**
	 * @param cloud_insert_smpl_collection_id the cloud_insert_smpl_collection_id to set
	 */
	public void setCloud_insert_smpl_collection_id(Integer cloud_insert_smpl_collection_id) {
		this.cloud_insert_smpl_collection_id = cloud_insert_smpl_collection_id;
	}

	/**
	 * @return the smpl_collection_id
	 */
	public Integer getSmpl_collection_id() {
		return smpl_collection_id;
	}

	/**
	 * @param smpl_collection_id the smpl_collection_id to set
	 */
	public void setSmpl_collection_id(Integer smpl_collection_id) {
		this.smpl_collection_id = smpl_collection_id;
	}

	/**
	 * @return the plant_id
	 */
	public Integer getPlant_id() {
		return plant_id;
	}

	/**
	 * @param plant_id the plant_id to set
	 */
	public void setPlant_id(Integer plant_id) {
		this.plant_id = plant_id;
	}

	/**
	 * @return the is_sent
	 */
	public Boolean getIs_sent() {
		return is_sent;
	}

	/**
	 * @param is_sent the is_sent to set
	 */
	public void setIs_sent(Boolean is_sent) {
		this.is_sent = is_sent;
	}
	
	
	

}
