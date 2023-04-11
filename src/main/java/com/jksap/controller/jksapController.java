package com.jksap.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.jksap.dto.Cloud_insert_smpl_collection;
import com.jksap.dto.Cloud_insert_smpl_collection_repo;
import com.jksap.dto.GrnDetailsInputCloud;
import com.jksap.dto.GrnDetailsInputCloud_repo;
import com.jksap.dto.KilnBreakdownData;
import com.jksap.dto.KilnBreakdownData_repo;
import com.jksap.dto.KilnStoppingData;
import com.jksap.dto.KilnStoppingData_repo;
import com.jksap.dto.RawMaterialSummary;
import com.jksap.dto.RawMaterialSummary_repo;
import com.jksap.dto.Smpl_collection;
import com.jksap.dto.Smpl_collection_repo;
import com.jksap.dto.mst_cement_type;
import com.jksap.dto.mst_cement_type_repo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@RestController
public class jksapController {
	
	private static final Logger LOGGER = LogManager.getLogger(jksapController.class);
	  
	@Autowired
	Cloud_insert_smpl_collection_repo   cloud_smplrepo;
	
	@Autowired
	Smpl_collection_repo   smplcollrepo;
	
	@Autowired
	mst_cement_type_repo mstcementtyperepo;
	
	
	
	@Autowired
	GrnDetailsInputCloud_repo grn_detail_repo;
	
	
	
	@Autowired
	KilnStoppingData_repo kilnstoppingdata_repo;
	
	@Autowired
	KilnBreakdownData_repo kilnbreakdowndata_repo;


	//******* RAW Material Summary API **************************

	@Autowired

	RawMaterialSummary_repo rawmaterialsummary_repo;
	
	
	 //***************** API For GateEntryDataInputCloud table ************************
	@CrossOrigin(origins = "http://localhost:8082", maxAge = 3600)	
	
	
	/***************KILN STOPPING DATA *******************/
	@PostMapping("/sap_iot/iot_kiln_stopping_data")
	public String iot_kiln_stopping_data(@Validated @RequestBody String request_data, BindingResult bindingResult)
	{
		  JSONObject response_msg=new JSONObject();
		  JSONObject response_error=new JSONObject();
		  LOGGER.info("Kiln Stopping Data From SAP "+request_data);
		  JSONObject jsnobject = new JSONObject(request_data);
		  JSONArray jsonarr1 = jsnobject.getJSONArray("request_data");
		  for (int icount = 0; icount< jsonarr1.length(); icount++)
		  {
			  try
				{
			     
			     java.text.SimpleDateFormat sm = new java.text.SimpleDateFormat("yyyy-MM-dd");
				 JSONObject kiln_stopping_data_json = jsonarr1.getJSONObject(icount);
				 
				 String plant=kiln_stopping_data_json.getString("plant");
				 int frequency=Integer.parseInt(kiln_stopping_data_json.getString("frequency"));
				 String position=kiln_stopping_data_json.getString("positiondet"); 
				 Date posting_date=sm.parse(kiln_stopping_data_json.getString("posting_date"));
				 String equipment_no=kiln_stopping_data_json.getString("equipment_no");
				 String equipment_description=kiln_stopping_data_json.getString("equipment_description");
				 String tech_id=kiln_stopping_data_json.getString("tech_id");
				 String damage_code_group= kiln_stopping_data_json.getString("damage_code_group");
				 String damage_code=kiln_stopping_data_json.getString("damage_code");
				 String reason_for_breakdown=kiln_stopping_data_json.getString("reason_for_breakdown");
				 String idle_code_group=kiln_stopping_data_json.getString("idle_code_group");
				 String idle_code=kiln_stopping_data_json.getString("idle_code");
				 String reason_for_idle=kiln_stopping_data_json.getString("reason_for_idle");
				 String effect_type=kiln_stopping_data_json.getString("effect_type");
				 String stoppage_details=kiln_stopping_data_json.getString("stoppage_details");
				 Date stop_date=sm.parse(kiln_stopping_data_json.getString("stop_date"));
				 Date start_date=sm.parse(kiln_stopping_data_json.getString("start_date"));
				 Double breakdown_hours=Double.parseDouble(kiln_stopping_data_json.getString("breakdown_hours"));
				 Double idle_hours=Double.parseDouble(kiln_stopping_data_json.getString("idle_hours"));
				 String stop_time=kiln_stopping_data_json.getString("stop_time");
				 String start_time=kiln_stopping_data_json.getString("start_time");
				 int hrs=0,mins=0;
				 String [] arrTime=stop_time.split(":");
				 hrs=Integer.parseInt(arrTime[0]);
				 mins=Integer.parseInt(arrTime[1]);
				 LocalTime stp_time=LocalTime.of(hrs,mins);
				 
				 arrTime=start_time.split(":");
				 hrs=Integer.parseInt(arrTime[0]);
				 mins=Integer.parseInt(arrTime[1]);
				 LocalTime str_time=LocalTime.of(hrs,mins);
				 
				 //KilnStoppingData kilnStopData=new KilnStoppingData(0,plant,frequency,position,posting_date,
				//		 					equipment_no,equipment_description,tech_id,damage_code_group,
				//		 					damage_code,reason_for_breakdown,idle_code_group,idle_code,reason_for_idle
				//		 					,effect_type,stoppage_details,stop_date,start_date,breakdown_hours,idle_hours
				//		 					,stp_time,str_time);
				 kilnstoppingdata_repo.insertData(plant, frequency, position, posting_date, equipment_no, equipment_description, tech_id, damage_code_group, damage_code, reason_for_breakdown, idle_code_group, idle_code, reason_for_idle, effect_type, stoppage_details, stop_date, start_date, breakdown_hours, idle_hours,stp_time,str_time);
				 
				 //kilnstoppingdata_repo.save(kilnStopData);
				 
		    	     response_error.put("status_code", "0");
				     response_error.put("message", "Kiln Stopping Data added data sucessfully");
				     LOGGER.info("Sucessfully, Insert Stopping Data!");
				}
				catch(Exception ex)
				{
					System.out.println("error "+ex);
					response_error.put("status_code", "1");
					response_error.put("message", "Fail to add data");
					LOGGER.error("Fail To Insert Stopping Data! ");
					
				}
				 
				 
				 
				 
		   }//end of for loop
		  
		  response_msg.put("status",response_error);
		  return response_msg.toString();
	}
	
	
		/***************RAW MATERIAL SUMMARY *******************/
		@PostMapping("/sap_iot/iot_raw_material_summary")
		public String raw_material_summary_data(@Validated @RequestBody String request_data, BindingResult bindingResult)
		{
			  JSONObject response_msg=new JSONObject();
			  JSONObject response_error=new JSONObject();
			  LOGGER.info("Raw From SAP "+request_data);
			  JSONObject jsnobject = new JSONObject(request_data);
			  JSONArray jsonarr1 = jsnobject.getJSONArray("request_data");
			  for (int icount = 0; icount< jsonarr1.length(); icount++)
			  {
				  try
					{
					 
					 java.text.SimpleDateFormat sm = new java.text.SimpleDateFormat("yyyy-MM-dd");
					 JSONObject raw_material_summary_json = jsonarr1.getJSONObject(icount);
					 
					 String plant=raw_material_summary_json.getString("plant");
					 int inspection_lot=Integer.parseInt(raw_material_summary_json.getString("inspection_lot"));
					 Date inspection_start_date=sm.parse(raw_material_summary_json.getString("inspection_start_date"));
					 int material=Integer.parseInt(raw_material_summary_json.getString("material"));
					 String material_despcription=raw_material_summary_json.getString("material_despcription"); 
					 int purchase_number=Integer.parseInt(raw_material_summary_json.getString("purchase_number"));
					 int item=Integer.parseInt(raw_material_summary_json.getString("item"));
					 int vendor=Integer.parseInt(raw_material_summary_json.getString("vendor"));
					 String vendor_name=raw_material_summary_json.getString("vendor_name");
					 String equipment_description=raw_material_summary_json.getString("equipment_description");
					 int material_document=Integer.parseInt(raw_material_summary_json.getString("material_document"));
					 Double qty =Double.parseDouble(raw_material_summary_json.getString("qty"));
					 String ud_status=raw_material_summary_json.getString("ud_status");
					 Double moisture=Double.parseDouble(raw_material_summary_json.getString("moisture"));
					 Double LOI =Double.parseDouble(raw_material_summary_json.getString("LOI"));
					 Double insoluble_residue=Double.parseDouble(raw_material_summary_json.getString("insoluble_residue"));
					 Double AL2O3=Double.parseDouble(raw_material_summary_json.getString("AL2O3"));
					 Double CaO=Double.parseDouble(raw_material_summary_json.getString("CaO"));
					 Double Fe2O3=Double.parseDouble(raw_material_summary_json.getString("Fe2O3"));
					 Double R2O3=Double.parseDouble(raw_material_summary_json.getString("R2O3"));
					 Double P2O5=Double.parseDouble(raw_material_summary_json.getString("P205"));
					 Double SO3_RM=Double.parseDouble(raw_material_summary_json.getString("SO3_RM"));
					 Double SO3=Double.parseDouble(raw_material_summary_json.getString("SO3"));
					 Double SiO2=Double.parseDouble(raw_material_summary_json.getString("SiO2"));
					 Double TiO2=Double.parseDouble(raw_material_summary_json.getString("TiO2"));
					 Double purity=Double.parseDouble(raw_material_summary_json.getString("purity"));
					 Double LSF=Double.parseDouble(raw_material_summary_json.getString("LSF"));
					 Double R45=Double.parseDouble(raw_material_summary_json.getString("R45"));
					 Double Cl=Double.parseDouble(raw_material_summary_json.getString("Cl"));
					 Double Chloride_RM=Double.parseDouble(raw_material_summary_json.getString("Chloride_RM"));
					 Double R2O5_RM=Double.parseDouble(raw_material_summary_json.getString("R2O5_RM"));
					 Double MgO=Double.parseDouble(raw_material_summary_json.getString("MgO"));
				     Double blaine=Double.parseDouble(raw_material_summary_json.getString("blaine"));
					 Double K2O=Double.parseDouble(raw_material_summary_json.getString("K2O"));
					 Double Na2O=Double.parseDouble(raw_material_summary_json.getString("Na2O"));
					
					 //KilnStoppingData kilnStopData=new KilnStoppingData(0,plant,frequency,position,posting_date,
					//		 					equipment_no,equipment_description,tech_id,damage_code_group,
					//		 					damage_code,reason_for_breakdown,idle_code_group,idle_code,reason_for_idle
					//		 					,effect_type,stoppage_details,stop_date,start_date,breakdown_hours,idle_hours
					//		 					,stp_time,str_time);
					 rawmaterialsummary_repo.insertData(plant, inspection_lot, inspection_start_date, material, material_despcription, equipment_description, purchase_number, item, vendor, vendor_name, vendor_name, equipment_description, material_document, qty, ud_status, moisture, LOI, insoluble_residue, AL2O3, CaO, Fe2O3, R2O3, P2O5, SO3_RM, SO3, SiO2, TiO2, purity, LSF, R45, Cl, Chloride_RM, R2O5_RM, MgO, blaine, K2O, Na2O);
					 
					 //kilnstoppingdata_repo.save(kilnStopData);
					 
						 response_error.put("status_code", "0");
						 response_error.put("message", "Raw Material Summary added data sucessfully");
						 LOGGER.info("Sucessfully, Insert Stopping Data!");
					}
					catch(Exception ex)
					{
						System.out.println("error "+ex);
						response_error.put("status_code", "1");
						response_error.put("message", "Fail to add data");
						LOGGER.error("Fail To Insert Raw Material Summary Data! ");
						
					}
					 
					 
					 
					 
			   }//end of for loop
			  
			  response_msg.put("status",response_error);
			  return response_msg.toString();
		}





	/***************KILN BREAKDOWN DATA *******************/
	@PostMapping("/sap_iot/iot_kiln_breakdown_data")
	public String iot_kiln_breakdown_data(@Validated @RequestBody String request_data, BindingResult bindingResult)
	{
		  JSONObject response_msg=new JSONObject();
		  JSONObject response_error=new JSONObject();
		  LOGGER.info("Kiln Breakdown Data From SAP "+request_data);
		  JSONObject jsnobject = new JSONObject(request_data);
		  JSONArray jsonarr1 = jsnobject.getJSONArray("request_data");
		  for (int icount = 0; icount< jsonarr1.length(); icount++)
		  {
			  try
				{
			     
			     java.text.SimpleDateFormat sm = new java.text.SimpleDateFormat("yyyy-MM-dd");
				 JSONObject kiln_breakdown_data_json = jsonarr1.getJSONObject(icount);
				 
				 
				
				 int sn=Integer.parseInt(kiln_breakdown_data_json.getString("sn"));
				 int frequency=Integer.parseInt(kiln_breakdown_data_json.getString("frequency"));
				 String section=kiln_breakdown_data_json.getString("sec_name");
				 String equipment_code=kiln_breakdown_data_json.getString("equipment_code");
				 String fault=kiln_breakdown_data_json.getString("fault");
				 String department=kiln_breakdown_data_json.getString("department");
				 String narration=kiln_breakdown_data_json.getString("narration");
				 //String jam=kiln_breakdown_data_json.getString("jam");
				 Double hours=Double.parseDouble(kiln_breakdown_data_json.getString("hours"));
				 Date date=sm.parse(kiln_breakdown_data_json.getString("c_date"));
				 
				
				 
				// KilnBreakdownData kilnbreakData=new KilnBreakdownData(0,sn,frequency,section,equipment_code,
				//			fault,department,narration,jam,hours,date);
				 
				 kilnbreakdowndata_repo.insertData(sn, frequency, section, equipment_code, fault, department, narration, hours, date);
				
					//kilnbreakdowndata_repo.save(kilnbreakData);
		    	     response_error.put("status_code", "0");
				     response_error.put("message", "Kiln Breakdown Data added data sucessfully");
				     LOGGER.info("Sucessfully, Insert Breakdown Data!");
				}
				catch(Exception ex)
				{
					System.out.println("error "+ex);
					response_error.put("status_code", "1");
					response_error.put("message", "Fail to add data");
					LOGGER.error("Fail To Insert Breakdown Data! ");
					
				}
				 
				 
				 
				 
		   }//end of for loop
		  
		  response_msg.put("status",response_error);
		  return response_msg.toString();
	}
	
		
	//***************** API For mst_cement_type table ************************
	@PostMapping("/sap_clouddata/mst_cement_typeData")
	public String mstcementtypeData(@Validated @RequestBody String request_data, BindingResult bindingResult)
	{
				  JSONObject response_msg=new JSONObject();
				  JSONObject response_error=new JSONObject();
				
				  try {
						  JSONObject jsnobject = new JSONObject(request_data);
						  JSONArray jsonarr1 = jsnobject.getJSONArray("request_data");
						  for (int icount = 0; icount< jsonarr1.length(); icount++)
						  {
							     Date entry_date=null;
							     java.text.SimpleDateFormat sm = new java.text.SimpleDateFormat("yyyy-MM-dd");
								 JSONObject mstcementtypeDatajson = jsonarr1.getJSONObject(icount);
								 
								 //***************** insert data into GateEntryDataInputCloud table ************************
				                
								 /**** Call First Constructor Start  ****/
								 mst_cement_type mct=new mst_cement_type(
										 		
										
										 Integer.parseInt(mstcementtypeDatajson.getString("ctype_id")), 
										 Integer.parseInt(mstcementtypeDatajson.getString("seq_no")), 
										 Integer.parseInt(mstcementtypeDatajson.getString("dayone_min")),
										 Integer.parseInt(mstcementtypeDatajson.getString("dayone_max")),
										 Integer.parseInt(mstcementtypeDatajson.getString("daythree_min")), 
										 Integer.parseInt(mstcementtypeDatajson.getString("daythree_max")), 
										 Integer.parseInt(mstcementtypeDatajson.getString("dayseven_min")),
										 Integer.parseInt(mstcementtypeDatajson.getString("dayseven_max")),
										 Integer.parseInt(mstcementtypeDatajson.getString("daytwenty_min")), 
										 Integer.parseInt(mstcementtypeDatajson.getString("daytwenty_max")), 
										 Integer.parseInt(mstcementtypeDatajson.getString("color_min")),
										 Integer.parseInt(mstcementtypeDatajson.getString("color_max")), 
										 Integer.parseInt(mstcementtypeDatajson.getString("blaine_min")),
										 Integer.parseInt(mstcementtypeDatajson.getString("blaine_max")), 
										 Integer.parseInt(mstcementtypeDatajson.getString("bomb_min")), 
										 Integer.parseInt(mstcementtypeDatajson.getString("bomb_max")),
										 Integer.parseInt(mstcementtypeDatajson.getString("p_id")),
										 mstcementtypeDatajson.getString("ctype_name"),
										 mstcementtypeDatajson.getString("report_yn"),
										  mstcementtypeDatajson.getString("short_name"),
										  mstcementtypeDatajson.getString("ref_id"),
										  mstcementtypeDatajson.getString("auto_registerto_elims"),
										 Boolean.parseBoolean(mstcementtypeDatajson.getString("assigned")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("lsf_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("lsf_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("sm_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("sm_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("am_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("am_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("mgo_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("mgo_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("k2o_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("k2o_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("fcao_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("fcao_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c3s_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c3s_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c2s_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c2s_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ir_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ir_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r212_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r212_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c3s_c2s_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c3s_c2s_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c3a_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("c3a_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("cao_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("cao_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("fe2o3_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("fe2o3_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r45_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r45_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("lime_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("lime_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ncv_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("ncv_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r_90_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r_90_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("active")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("sio2_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("sio2_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("al2o3_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("al2o3_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("tio2_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("tio2_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("p2o5_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("p2o5_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("loi_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("loi_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("sum_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("sum_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("naeq_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("naeq_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("fsilica_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("fsilica_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("bf_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("bf_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("lc_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("lc_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("as_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("as_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("sa_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("sa_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("mm_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("mm_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c4af_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c4af_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("exso3_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("exso3_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("hor_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("hor_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ltwt_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ltwt_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("nibs_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("nibs_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("nc_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("nc_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("autoclv_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("autoclv_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ist_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ist_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("fst_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("fst_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("pi_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("sio2_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("al2o3_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("fe2o3_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("cao_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("mgo_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("so3_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("tio2_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("sum_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("lime_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("naeq_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ir_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("als_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("sla_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("als_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("als_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("sla_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("sla_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("lsf_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("sm_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("am_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("mm_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c3s_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("c2s_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c3a_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c4af_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ex_so3_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("c3s_c2s_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("hor_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("nibs_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("blaine_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r45_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ac_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ac_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ac_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("nc_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("lc_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("lst_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("fst_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("day1_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("day3_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("day7_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("day28_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r90_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r212_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r40_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r30_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r30_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r30_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r20_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r20_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r20_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r10_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r10_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r10_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r3_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r3_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r3_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r33_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r33_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r33_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ds_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ds_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("pi_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("pitarget")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("ds_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("flyash_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("flyash_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("flyash_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("slag_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("slag_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("slag_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("f_silica_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("f_silica_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("f_silica_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("ncv_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("color_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r40_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r40_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("loi_kf_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("loi_kf_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("loi_kf_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("loi_hm_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("loi_hm_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("loi_hm_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("ash_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("ash_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ash_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("cmt_temp_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("cmt_temp_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("cmt_temp_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_bet_3and30_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_bet_3and30_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_bet_3and30_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_30_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_30_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_30_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_45_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_45_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_45_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_50_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_50_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_50_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_90_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_90_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_90_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_below_20_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_below_20_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_below_20_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_below_5_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_below_5_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_below_5_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_212_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_212_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("psd_above_212_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("lrcr10_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("lrcr10_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("lrcr10_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("lrcr28_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("lrcr28_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("lrcr28_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("alkaliso3_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("alkaliso3_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("alkaliso3_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("so3alkai_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("so3alkai_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("so3alkai_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ltwt_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("ballmillso3_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("ballmillso3_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("ballmillso3_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("liquid_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("liquid_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("liquid_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("bf_target")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("moisture_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("moisture_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("moisture_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("volatile_moisture_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("volatile_moisture_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("volatile_moisture_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("inherient_moisture_min")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("inherient_moisture_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("inherient_moisture_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("free_moisture_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("free_moisture_max")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("free_moisture_target")),
										 			Double.parseDouble(mstcementtypeDatajson.getString("r2o3_min")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r2o3_max")), 
										 			Double.parseDouble(mstcementtypeDatajson.getString("r2o3_target"))
										 
										 
										 		
										 
										 );
								 
								 /**** Call First Constructor End  ****/
								
								 
		
								     
										 mst_cement_type mct1= new mst_cement_type(
												 
												 
												 Double.parseDouble(mstcementtypeDatajson.getString("purity_min")), 
												 Double.parseDouble(mstcementtypeDatajson.getString("purity_max")),
												 Double.parseDouble(mstcementtypeDatajson.getString("purity_target")),
												 Double.parseDouble(mstcementtypeDatajson.getString("mn2o3_min")),
												 Double.parseDouble(mstcementtypeDatajson.getString("mn2o3_max")),
												 Double.parseDouble(mstcementtypeDatajson.getString("mn2o3_target")),
												 Double.parseDouble(mstcementtypeDatajson.getString("cl_min")), 
												 Double.parseDouble(mstcementtypeDatajson.getString("cl_max")), 
												
												Double.parseDouble(mstcementtypeDatajson.getString("cl_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("sulphur_min")), 
												Double.parseDouble(mstcementtypeDatajson.getString("sulphur_max")), 
												Double.parseDouble(mstcementtypeDatajson.getString("sulphur_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("so3_max")), 
												Double.parseDouble(mstcementtypeDatajson.getString("so3_min")), 
												
												Double.parseDouble(mstcementtypeDatajson.getString("na2o_max")), 
												Double.parseDouble(mstcementtypeDatajson.getString("na2o_min")), 
												Double.parseDouble(mstcementtypeDatajson.getString("na2o_target")),
												Double.parseDouble(mstcementtypeDatajson.getString("k2o_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("p2o5_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("loi_target")),
												Double.parseDouble(mstcementtypeDatajson.getString("bomb_cal_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("degreecalci_min")), 
												Double.parseDouble(mstcementtypeDatajson.getString("degreecalci_max")), 
												Double.parseDouble(mstcementtypeDatajson.getString("degreecalci_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("gcv_airdrybasis_min")),
												Double.parseDouble(mstcementtypeDatajson.getString("gcv_airdrybasis_max")),
												Double.parseDouble(mstcementtypeDatajson.getString("gcv_airdrybasis_target")),
												Double.parseDouble(mstcementtypeDatajson.getString("gcv_asreceivedbasis_min")), 
												Double.parseDouble(mstcementtypeDatajson.getString("gcv_asreceivedbasis_max")),
												Double.parseDouble(mstcementtypeDatajson.getString("gcv_asreceivedbasis_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("arb_freemoisture_min")), 
												Double.parseDouble(mstcementtypeDatajson.getString("arb_freemoisture_max")), 
												Double.parseDouble(mstcementtypeDatajson.getString("arb_freemoisture_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("arb_totalmoisture_min")), 
												Double.parseDouble(mstcementtypeDatajson.getString("arb_totalmoisture_max")), 
												Double.parseDouble(mstcementtypeDatajson.getString("arb_totalmoisture_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("adb_inherientmoisture_min")),
												Double.parseDouble(mstcementtypeDatajson.getString("adb_inherientmoisture_max")),
												Double.parseDouble(mstcementtypeDatajson.getString("adb_inherientmoisture_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("adb_volatilemoisture_min")),
												Double.parseDouble(mstcementtypeDatajson.getString("adb_volatilemoisture_max")), 
												Double.parseDouble(mstcementtypeDatajson.getString("adb_volatilemoisture_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("adb_ash_min")), 
												Double.parseDouble(mstcementtypeDatajson.getString("adb_ash_max")),
												Double.parseDouble(mstcementtypeDatajson.getString("adb_ash_target")), 
												Double.parseDouble(mstcementtypeDatajson.getString("adb_sulphur_min")),
												Double.parseDouble(mstcementtypeDatajson.getString("adb_sulphur_max")), 
												Double.parseDouble(mstcementtypeDatajson.getString("adb_sulphur_target")));
										 try {
											 mstcementtyperepo.save(mct);
											// mstcementtyperepo.save(mct1);
							    	     response_error.put("status_code", "0");
									     response_error.put("message", "GateEntry Data added data on cloud sucessfully"); 
								    }catch(Exception e) {
								    						System.out.println("error "+e);
															response_error.put("status_code", "1");
															response_error.put("message", "Fail to add data on cloud");
										                }
								 
						   }//end of for loop
				  }
				  catch(Exception e)
				  {
					  System.out.println("error ="+e);
				  }
				  
				  response_msg.put("status",response_error);
				  return response_msg.toString();
			}

			public jksapController(mst_cement_type_repo mstcementtyperepo) {
				super();
				this.mstcementtyperepo = mstcementtyperepo;
			}
			
			
			 //********** API For Insert mst_smpl_collection data(from elims to cloud)******************
			@PostMapping("/elims_to_cloud/insert_smpldatatocloud")
			public String insert_smpldatatocloud(@Validated @RequestBody String data, BindingResult bindingResult)
			{
				 JSONObject response_msg=new JSONObject();
				 JSONObject response_error=new JSONObject();
				 Date smpl_collected_dt = null;
				 
				 try
				    {
					 
						 JSONObject jsnobject = new JSONObject(data);
						 JSONArray jsonarr1 = jsnobject.getJSONArray("request_data");
						 java.text.SimpleDateFormat sm = new java.text.SimpleDateFormat("yyyy-MM-dd");
						 
						 for (int icount = 0; icount< jsonarr1.length(); icount++)
						  {
							  JSONObject smpljson = jsonarr1.getJSONObject(icount);
							  try { 
								  		
								    smpl_collected_dt = smpljson.getString("smpl_collected_dt").isEmpty() ? null:sm.parse(smpljson.getString("smpl_collected_dt")); 
								    
							    } 
							  catch (JSONException | ParseException e1) { // TODO Auto-generated catch block
															                	System.out.print(e1.getMessage());
																					   e1.printStackTrace();
																			}
							  
							  //**** insert data into mst_smpl_collection ***********
							  Smpl_collection smplmodel=new Smpl_collection(Integer.parseInt(smpljson.getString("smpl_id")),
															  smpl_collected_dt, Integer.parseInt(smpljson.getString("p_id")), Integer.parseInt(smpljson.getString("ctype_id")) , 
															  Integer.parseInt(smpljson.getString("supplier_id")) , Integer.parseInt(smpljson.getString("sect_id")) ,
															  Integer.parseInt(smpljson.getString("source_id")) , smpljson.getString("gate_entry_no"));
						
								 try {
					          		    smplcollrepo.save(smplmodel) ;
								        response_error.put("status_code", "0");
							            response_error.put("message", "Smpl_collection Data added data on cloud sucessfully"); 
						             }catch(Exception e) {
						    						System.out.println("error "+e);
													response_error.put("status_code", "1");
													response_error.put("message", "Fail to add Smpl_collection data on cloud");
								                }
						  
						  }
				    }catch(Exception e) {System.out.println(e);}
				 
				  response_msg.put("status",response_error);
				  return response_msg.toString();
			}
			
			
			@PostMapping("/elims_to_cloud/update_smpldatatocloud")
			public String update_smpldatatocloud(@Validated @RequestBody String data, BindingResult bindingResult)
			{
				 JSONObject response_msg=new JSONObject();
				 JSONObject response_error=new JSONObject();
				 
				 Integer  c_id = null,noof_cubes_1d = null, 
                 noof_cubes_3d = null, noof_cubes_7d = null, noof_cubes_28d = null, planned_brdays = null,psd_id = null,lrcr_avg_10d_kn = null,lrcr_avg_28d_kn = null,
                 lrcr_noof_cubes_10d = null, lrcr_noof_cubes_28d = null, rack_no = null, doc_no = null,smplreceived_time = null,afr_smpl_id = null;

				 
				 
	           Date smpl_casting_dt = null,blaine_test_datetime = null, 
               colorindex_test_datetime = null, xrf_test_datetime = null,bombcal_test_datetime = null,tga_test_datetime = null,mb_test_datetime = null,
               mw1_test_datetime = null, mw2_test_datetime = null,airmwt1_test_datetime = null,airmwt2_test_datetime = null, airmwt3_test_datetime = null,
               psd_test_datetime = null,smpl_casting_dt_3 = null, smpl_casting_dt_7 = null, smpl_casting_dt_28 = null,lrcr_smpl_casting_dt_10 = null, 
               lrcr_smpl_casting_dt_28 = null,rack_dt = null,kft_test_datetime = null,  at_test_datetime = null,  fp_test_datetime = null,cba_test_datetime = null,grn_date = null;
	 
	           String flyash_range = null,tga_batch_name = null,lims_id = null,degree_of_calci = null, ts_blaine = null, ts_color = null, ts_xrf = null,
				ts_ctm_1day = null, ts_ctm_3day = null, ts_bcal = null,pass_fail = null,
			    ts_ctm_7day = null, ts_ctm_28day = null, ts_lrcr_10day = null, ts_lrcr_28day = null,grn = null;

	           Double smpl_qty = null, smpl_breath = null, smpl_height = null, smpl_width = null,blaine = null, colorindex = null,CaO = null, SiO2 = null, Al2O3 = null, Fe2O3 = null, MgO = null,
               SO3 = null, K2O = null, Na2O = null, Cl = null,xrf_total = null, LSF = null, SM = null, AM = null, bombcal_gcv_gross = null, ti_o_2 = null, p2_os = null, loi = null, p_sum = null, ir = null, r_fourtyfive = null,
               nc = null, le_chatellier = null, autoclave = null, setting_time_initial = null, setting_time_final = null, c3s = null, c2s = null, c3a = null, c4af = null, liquid = null, sulphur = null,
               fcao = null, tga_moisture_std = null, tga_volatile_std = null, tga_volatile_dry_std = null, tga_ash_std = null, tga_ash_dry_std = null, 
               tga_fix_carbon_std = null, tga_fix_carbon_dry_std = null, ncv = null, hydrogen = null, mwt1 = null, mwt2 = null, mwt3 = null, mb_value = null, airmwt1 = null, airmwt2 = null,
               airmwt3 = null,total_moisture = null, airmb_value = null,manualcalculated_gcv = null, coal_sulphuradb = null, Mn2O3 = null, P2O5 = null, TiO2 = null, SrO = null,
               psd_size5 = null, psd_size10 = null, psd_size20 = null, 
               psd_size30 = null, psd_size40 = null, psd_size45 = null, psd_size50 = null, Quartz = null, xrf_sum = null, lc = null, lime = null,BaO = null, Na_Eq = null, LS = null, r_90 = null, r_212 = null, 
               f_silica = null, r_60 = null,r_45 = null, r_30 = null, r_20 = null, r_10 = null, r_3 = null, avg_1d_kn = null, avg_1d_mpa = null, avg_3d_kn = null, 
               avg_3d_mpa = null, avg_7d_kn = null, avg_7d_mpa = null, avg_28d_kn = null, avg_28d_mpa = null,ALKALI_SO3 = null, SO3_ALKAI = null, EXCESS_SO3 = null, C3S_C2S = null, ALKALI_AS_NA2O = null, 
               HOR = null, MM = null, BF = null, pi_percentage = null, slag_percentage = null, drying_shrinkage = null, cement_temp = null, ni_bs = null, loss_on_ignition_kf = null,
               loss_on_ignition_hm = null,lightweight = null, psd_size3 = null, psd_size90 = null, psd_size60 = null, ash_percentage = null, psd_bet_3and30 = null, psd_above_212 = null, 
               psd_above_30 = null, psd_above_45 = null, psd_above_50 = null, psd_above_90 = null, psd_below_20 = null, psd_below_5 = null,lrcr_avg_10d_mpa = null,lrcr_avg_28d_mpa = null,
               blaine_time = null,ball_meal_so3 = null,smpl_qty_received = null, moisture = null, volatile_moisture = null, inherient_moisture = null, free_moisture = null, 
               GCV_Airdrybasis = null, GCV_Asreceivedbasis = null,asreceivedbasis_freemoisture = null, asreceivedbasis_totalmoisture = null, airdrybasis_inherientmoisture = null,
               airdrybasis_volatilemoisture = null, airdrybasis_ash = null, airdrybasis_sulphur = null, purity = null, 
               carbon = null, nitrogen = null, r2o3 = null, Fluorine = null,at_cl = null,flashpoint = null,na2o3 = null,cr2o3 = null, Chloride_content = null, co2 = null;

				  try
				    {
					 
						 JSONObject jsnobject = new JSONObject(data);
						 JSONArray jsonarr1 = jsnobject.getJSONArray("request_data");
						 java.text.SimpleDateFormat sm = new java.text.SimpleDateFormat("yyyy-MM-dd");
						 
						 for (int icount = 0; icount< jsonarr1.length(); icount++)
						  {
							  
							  JSONObject smpljson = jsonarr1.getJSONObject(icount);
							
							  try { 
								     if(smpljson.has("smpl_casting_dt"))
								    	    smpl_casting_dt = smpljson.getString("smpl_casting_dt").isEmpty() ? null:sm.parse(smpljson.getString("smpl_casting_dt")); 
								    if(smpljson.has("blaine_test_datetime"))
								    	   blaine_test_datetime=smpljson.getString("blaine_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("blaine_test_datetime"));
								     if(smpljson.has("colorindex_test_datetime"))
								    	  colorindex_test_datetime=smpljson.getString("colorindex_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("colorindex_test_datetime"));
								     if(smpljson.has("xrf_test_datetime"))
									   xrf_test_datetime=smpljson.getString("xrf_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("xrf_test_datetime")); 
								     if(smpljson.has("bombcal_test_datetime"))
								    	bombcal_test_datetime=smpljson.getString("bombcal_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("bombcal_test_datetime"));
								     if(smpljson.has("tga_test_datetime"))
										 tga_test_datetime=smpljson.getString("tga_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("tga_test_datetime")); 
								     if(smpljson.has("mb_test_datetime"))
										   mb_test_datetime=smpljson.getString("mb_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("mb_test_datetime"));
								     if(smpljson.has("mw1_test_datetime"))
								    	 mw1_test_datetime=smpljson.getString("mw1_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("mw1_test_datetime"));
								     if(smpljson.has("mw2_test_datetime"))
								    	 mw2_test_datetime=smpljson.getString("mw2_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("mw2_test_datetime"));
								     if(smpljson.has("airmwt1_test_datetime"))
								    	 airmwt1_test_datetime=smpljson.getString("airmwt1_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("airmwt1_test_datetime")); 
								     if(smpljson.has("airmwt2_test_datetime"))
								         airmwt2_test_datetime=smpljson.getString("airmwt2_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("airmwt2_test_datetime"));
								     if(smpljson.has("airmwt3_test_datetime"))
								    	 airmwt3_test_datetime=smpljson.getString("airmwt3_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("airmwt3_test_datetime")); 
								     if(smpljson.has("psd_test_datetime")) 
								         psd_test_datetime=smpljson.getString("psd_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("psd_test_datetime"));
								     if(smpljson.has("smpl_casting_dt_3")) 
								    	 smpl_casting_dt_3=smpljson.getString("smpl_casting_dt_3").isEmpty()?null:sm.parse(smpljson.getString("smpl_casting_dt_3"));
								     if(smpljson.has("smpl_casting_dt_7"))
								    	 smpl_casting_dt_7=smpljson.getString("smpl_casting_dt_7").isEmpty()?null:sm.parse(smpljson.getString("smpl_casting_dt_7"));
								     if(smpljson.has("smpl_casting_dt_28"))
								        smpl_casting_dt_28=smpljson.getString("smpl_casting_dt_28").isEmpty()?null:sm.parse(smpljson.getString("smpl_casting_dt_28"));
								     if(smpljson.has("lrcr_smpl_casting_dt_10"))
								        lrcr_smpl_casting_dt_10=smpljson.getString("lrcr_smpl_casting_dt_10").isEmpty()?null:sm.parse(smpljson.getString("lrcr_smpl_casting_dt_10")); 
								     if(smpljson.has("lrcr_smpl_casting_dt_28"))
								    	 lrcr_smpl_casting_dt_28=smpljson.getString("lrcr_smpl_casting_dt_28").isEmpty()?null:sm.parse(smpljson.getString("lrcr_smpl_casting_dt_28"));
								     if(smpljson.has("rack_dt"))
								    	 rack_dt=smpljson.getString("rack_dt").isEmpty()?null:sm.parse(smpljson.getString("rack_dt"));
								     if(smpljson.has("kft_test_datetime"))
								    	 kft_test_datetime=smpljson.getString("kft_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("kft_test_datetime"));
								     if(smpljson.has("at_test_datetime"))
								        at_test_datetime=smpljson.getString("at_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("at_test_datetime"));
								     if(smpljson.has("fp_test_datetime"))
								    	 fp_test_datetime=smpljson.getString("fp_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("fp_test_datetime"));
								     if(smpljson.has("cba_test_datetime"))
								    	 cba_test_datetime=smpljson.getString("cba_test_datetime").isEmpty()?null:sm.parse(smpljson.getString("cba_test_datetime"));
								     if(smpljson.has("grn_date"))
								    	 grn_date=smpljson.getString("grn_date").isEmpty()?null:sm.parse(smpljson.getString("grn_date"));
								     if(smpljson.has("flyash_range"))
								    	  flyash_range=smpljson.getString("flyash_range");
								     if(smpljson.has("tga_batch_name"))
								        tga_batch_name =smpljson.getString("tga_batch_name");
								     if(smpljson.has("lims_id"))
								           lims_id=smpljson.getString("lims_id");
								     if(smpljson.has("degree_of_calci"))
								          degree_of_calci=smpljson.getString("degree_of_calci");
								     if(smpljson.has("ts_blaine"))
								         ts_blaine=smpljson.getString("ts_blaine");
								     if(smpljson.has("ts_color"))
								        ts_color=smpljson.getString("ts_color");
								     if(smpljson.has("ts_xrf"))
								    	 ts_xrf=smpljson.getString("ts_xrf");
								     if(smpljson.has("ts_ctm_1day"))
								    	 ts_ctm_1day=smpljson.getString("ts_ctm_1day");
								     if(smpljson.has("ts_ctm_3day"))
								    	 ts_ctm_3day=smpljson.getString("ts_ctm_3day");
								     if(smpljson.has("ts_bcal"))
								         ts_bcal=smpljson.getString("ts_bcal");
								     if(smpljson.has("pass_fail"))
								         pass_fail=smpljson.getString("pass_fail");
								     if(smpljson.has("ts_ctm_7day"))
								         ts_ctm_7day=smpljson.getString("ts_ctm_7day");
								     if(smpljson.has("ts_ctm_28day"))
								           ts_ctm_28day=smpljson.getString("ts_ctm_28day");
								     if(smpljson.has("ts_lrcr_10day"))
								         ts_lrcr_10day=smpljson.getString("ts_lrcr_10day");
								     if(smpljson.has("ts_lrcr_28day"))
								    	 ts_lrcr_28day=smpljson.getString("ts_lrcr_28day");
								     if(smpljson.has("grn"))
								    	  grn=smpljson.getString("grn");
								     if(smpljson.has("smpl_qty"))
								    	 smpl_qty=smpljson.getString("smpl_qty").isEmpty() ? null:Double.parseDouble(smpljson.getString("smpl_qty"));
								     if(smpljson.has("smpl_breath"))
								    	 smpl_breath= smpljson.getString("smpl_breath").isEmpty() ? null:Double.parseDouble(smpljson.getString("smpl_breath"));
								     if(smpljson.has("smpl_height"))
								    	 smpl_height=smpljson.getString("smpl_height").isEmpty() ? null:Double.parseDouble(smpljson.getString("smpl_height"));
								     if(smpljson.has("smpl_width"))
								        smpl_width=smpljson.getString("smpl_width").isEmpty() ? null:Double.parseDouble(smpljson.getString("smpl_width"));
								     if(smpljson.has("blaine"))
								    	 blaine=smpljson.getString("blaine").isEmpty() ? null:Double.parseDouble(smpljson.getString("blaine"));
								     if(smpljson.has("colorindex"))
								    	 colorindex=smpljson.getString("colorindex").isEmpty() ? null:Double.parseDouble(smpljson.getString("colorindex"));
								     if(smpljson.has("CaO"))
								    	 CaO=smpljson.getString("CaO").isEmpty() ? null:Double.parseDouble(smpljson.getString("CaO"));
								     if(smpljson.has("SiO2"))
								    	 SiO2=smpljson.getString("SiO2").isEmpty() ? null:Double.parseDouble(smpljson.getString("SiO2"));        
								     if(smpljson.has("Al2O3"))
								    	 Al2O3= smpljson.getString("Al2O3").isEmpty() ? null:Double.parseDouble(smpljson.getString("Al2O3"));
								     if(smpljson.has("Fe2O3"))
								    	 Fe2O3= smpljson.getString("Fe2O3").isEmpty() ? null:Double.parseDouble(smpljson.getString("Fe2O3")); 
								     if(smpljson.has("MgO"))
								    	 MgO=smpljson.getString("MgO").isEmpty() ? null:Double.parseDouble(smpljson.getString("MgO"));
								     if(smpljson.has("SO3"))
								    	 SO3=smpljson.getString("SO3").isEmpty() ? null:Double.parseDouble(smpljson.getString("SO3"));
								     if(smpljson.has("K2O"))
								    	 K2O=smpljson.getString("K2O").isEmpty() ? null:Double.parseDouble(smpljson.getString("K2O"));
								     if(smpljson.has("Na2O"))
								    	 Na2O=smpljson.getString("Na2O").isEmpty() ? null:Double.parseDouble(smpljson.getString("Na2O"));
								     if(smpljson.has("Cl"))
								    	 Cl= smpljson.getString("Cl").isEmpty() ? null:Double.parseDouble(smpljson.getString("Cl"));
								     if(smpljson.has("xrf_total"))
								    	 xrf_total=smpljson.getString("xrf_total").isEmpty() ? null:Double.parseDouble(smpljson.getString("xrf_total")); 
								     if(smpljson.has("LSF"))	  
								    	 LSF=smpljson.getString("LSF").isEmpty() ? null:Double.parseDouble(smpljson.getString("LSF"));
								     if(smpljson.has("SM"))
								    	 SM=smpljson.getString("SM").isEmpty() ? null:Double.parseDouble(smpljson.getString("SM")); 
								     if(smpljson.has("AM"))
								    	 AM=smpljson.getString("AM").isEmpty() ? null:Double.parseDouble(smpljson.getString("AM"));
								     if(smpljson.has("bombcal_gcv_gross"))
								    	 bombcal_gcv_gross= smpljson.getString("bombcal_gcv_gross").isEmpty() ? null:Double.parseDouble(smpljson.getString("bombcal_gcv_gross"));
								     if(smpljson.has("ti_o_2"))   
								    	 ti_o_2=smpljson.getString("ti_o_2").isEmpty() ? null:Double.parseDouble(smpljson.getString("ti_o_2"));
								     if(smpljson.has("p2_os"))
								    	 p2_os=smpljson.getString("p2_os").isEmpty() ? null:Double.parseDouble(smpljson.getString("p2_os"));
                                     if(smpljson.has("loi"))
                                    	 loi=smpljson.getString("loi").isEmpty() ? null:Double.parseDouble(smpljson.getString("loi"));
								     if(smpljson.has("p_sum"))  
								    	 p_sum= smpljson.getString("p_sum").isEmpty() ? null: Double.parseDouble(smpljson.getString("p_sum"));
                                     if(smpljson.has("ir"))  
                                    	 ir= smpljson.getString("ir").isEmpty() ? null:Double.parseDouble(smpljson.getString("ir"));
                                     if(smpljson.has("r_fourtyfive"))
                                    	 r_fourtyfive=smpljson.getString("r_fourtyfive").isEmpty() ? null:Double.parseDouble(smpljson.getString("r_fourtyfive"));
                                     if(smpljson.has("nc")) 
                                    	 nc=smpljson.getString("nc").isEmpty() ? null:Double.parseDouble(smpljson.getString("nc"));
                                     if(smpljson.has("le_chatellier")) 
                                    	 le_chatellier=smpljson.getString("le_chatellier").isEmpty() ? null:Double.parseDouble(smpljson.getString("le_chatellier")); 
                                     if(smpljson.has("autoclave"))  
                                    	 autoclave=smpljson.getString("autoclave").isEmpty() ? null: Double.parseDouble(smpljson.getString("autoclave"));
                                     if(smpljson.has("setting_time_initial"))
                                    	 setting_time_initial=smpljson.getString("setting_time_initial").isEmpty() ? null: Double.parseDouble(smpljson.getString("setting_time_initial"));
                                     if(smpljson.has("setting_time_final"))
                                    	 setting_time_final= smpljson.getString("setting_time_final").isEmpty() ? null: Double.parseDouble(smpljson.getString("setting_time_final"));
                                    if(smpljson.has("c3s"))  
                                    	c3s=smpljson.getString("c3s").isEmpty() ? null: Double.parseDouble(smpljson.getString("c3s"));
                                    if(smpljson.has("c2s"))  
                                    	c2s=smpljson.getString("c2s").isEmpty() ? null: Double.parseDouble(smpljson.getString("c2s"));
                                    if(smpljson.has("c3a"))
                                    	c3a=smpljson.getString("c3a").isEmpty() ? null:  Double.parseDouble(smpljson.getString("c3a"));
                                    if(smpljson.has("c4af"))
                                    	c4af=smpljson.getString("c4af").isEmpty() ? null:Double.parseDouble(smpljson.getString("c4af"));
                                    if(smpljson.has("liquid"))  
                                    	liquid=smpljson.getString("liquid").isEmpty() ? null: Double.parseDouble(smpljson.getString("liquid"));
                                    if(smpljson.has("sulphur"))
                                    	sulphur=smpljson.getString("sulphur").isEmpty() ? null: Double.parseDouble(smpljson.getString("sulphur"));
                                    if(smpljson.has("fcao"))
                                    	fcao=smpljson.getString("fcao").isEmpty() ? null:Double.parseDouble(smpljson.getString("fcao"));
                                   	if(smpljson.has("tga_moisture_std")) 
                                   		tga_moisture_std=smpljson.getString("tga_moisture_std").isEmpty() ? null: Double.parseDouble(smpljson.getString("tga_moisture_std"));
                                   if(smpljson.has("tga_volatile_std")) 
                                	   tga_volatile_std=smpljson.getString("tga_volatile_std").isEmpty() ? null: Double.parseDouble(smpljson.getString("tga_volatile_std"));
							      if(smpljson.has("tga_volatile_dry_std")) 
                                	   tga_volatile_dry_std=smpljson.getString("tga_volatile_dry_std").isEmpty() ? null:Double.parseDouble(smpljson.getString("tga_volatile_dry_std"));
                                   if(smpljson.has("tga_ash_std")) 
                                	   tga_ash_std=smpljson.getString("tga_ash_std").isEmpty() ? null: Double.parseDouble(smpljson.getString("tga_ash_std"));
                                   if(smpljson.has("tga_ash_dry_std"))
                                	   tga_ash_dry_std= smpljson.getString("tga_ash_dry_std").isEmpty() ? null: Double.parseDouble(smpljson.getString("tga_ash_dry_std"));
                                   if(smpljson.has("tga_fix_carbon_std"))
                                	   tga_fix_carbon_std=smpljson.getString("tga_fix_carbon_std").isEmpty() ? null:Double.parseDouble(smpljson.getString("tga_fix_carbon_std")); 
                                   if(smpljson.has("tga_fix_carbon_dry_std"))
                                    	tga_fix_carbon_dry_std= smpljson.getString("tga_fix_carbon_dry_std").isEmpty() ? null:Double.parseDouble(smpljson.getString("tga_fix_carbon_dry_std")); 
                                   if(smpljson.has("ncv"))
                                	   ncv=smpljson.getString("ncv").isEmpty() ? null: Double.parseDouble(smpljson.getString("ncv"));
                                   if(smpljson.has("hydrogen"))
                                	   hydrogen=smpljson.getString("hydrogen").isEmpty() ? null:Double.parseDouble(smpljson.getString("hydrogen"));
                                   if(smpljson.has("mwt1")) 
                                	   mwt1=smpljson.getString("mwt1").isEmpty() ? null: Double.parseDouble(smpljson.getString("mwt1"));
                                   if(smpljson.has("mwt2"))
                                	 mwt2=smpljson.getString("mwt2").isEmpty() ? null:Double.parseDouble(smpljson.getString("mwt2"));
                                   if(smpljson.has("mwt3"))
                                	mwt3=smpljson.getString("mwt3").isEmpty() ? null:Double.parseDouble(smpljson.getString("mwt3"));
                                   if(smpljson.has("mb_value"))
                                	 mb_value=smpljson.getString("mb_value").isEmpty() ? null:Double.parseDouble(smpljson.getString("mb_value"));
                                   if(smpljson.has("airmwt1"))
                                	 airmwt1=smpljson.getString("airmwt1").isEmpty() ? null:Double.parseDouble(smpljson.getString("airmwt1"));
                                  if(smpljson.has("airmwt2")) 
                                	airmwt2=smpljson.getString("airmwt2").isEmpty() ? null:Double.parseDouble(smpljson.getString("airmwt2"));
                                  if(smpljson.has("airmwt3"))
                                	airmwt3= smpljson.getString("airmwt3").isEmpty() ? null:Double.parseDouble(smpljson.getString("airmwt3"));
                                  if(smpljson.has("total_moisture")) 
                            	   total_moisture=smpljson.getString("total_moisture").isEmpty() ? null:Double.parseDouble(smpljson.getString("total_moisture")); 
                            	  if(smpljson.has("airmb_value")) 
                            		 airmb_value= smpljson.getString("airmb_value").isEmpty() ? null:Double.parseDouble(smpljson.getString("airmb_value"));
                            	  if(smpljson.has("manualcalculated_gcv")) 
                            		  manualcalculated_gcv=smpljson.getString("manualcalculated_gcv").isEmpty() ? null:Double.parseDouble(smpljson.getString("manualcalculated_gcv"));
                            	  if(smpljson.has("coal_sulphuradb")) 
                            		  coal_sulphuradb=smpljson.getString("coal_sulphuradb").isEmpty() ? null:Double.parseDouble(smpljson.getString("coal_sulphuradb"));
                                  if(smpljson.has("Mn2O3")) 
                                	  Mn2O3=smpljson.getString("Mn2O3").isEmpty() ? null:Double.parseDouble(smpljson.getString("Mn2O3"));
                            	  if(smpljson.has("P2O5"))  
                            		  P2O5= smpljson.getString("P2O5").isEmpty() ? null: Double.parseDouble(smpljson.getString("P2O5"));
                            	 if(smpljson.has("TiO2"))   
                            		TiO2=smpljson.getString("TiO2").isEmpty() ? null: Double.parseDouble(smpljson.getString("TiO2"));
                            	 if(smpljson.has("SrO")) 
                            		 SrO=smpljson.getString("SrO").isEmpty() ? null: Double.parseDouble(smpljson.getString("SrO"));
                            	 if(smpljson.has("psd_size5")) 
                            		 psd_size5= smpljson.getString("psd_size5").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_size5"));
                            	 if(smpljson.has("psd_size10")) 
                            		 psd_size10= smpljson.getString("psd_size10").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_size10"));
                            	 if(smpljson.has("psd_size20")) 
                            		 psd_size20= smpljson.getString("psd_size20").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_size20"));
                            	 if(smpljson.has("psd_size30"))  
                            		 psd_size30=smpljson.getString("psd_size30").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_size30"));
                            	 if(smpljson.has("psd_size40"))  
                            		 psd_size40=smpljson.getString("psd_size40").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_size40"));
                                 if(smpljson.has("psd_size45"))
                                	 psd_size45=smpljson.getString("psd_size45").isEmpty() ? null:  Double.parseDouble(smpljson.getString("psd_size45"));
                                 if(smpljson.has("psd_size50"))
                                	 psd_size50=smpljson.getString("psd_size50").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_size50"));
                                 if(smpljson.has("Quartz"))
                                	 Quartz=smpljson.getString("Quartz").isEmpty() ? null:Double.parseDouble(smpljson.getString("Quartz"));
                                 if(smpljson.has("xrf_sum"))
                                	 xrf_sum=smpljson.getString("xrf_sum").isEmpty() ? null:Double.parseDouble(smpljson.getString("xrf_sum"));
                                 if(smpljson.has("lc")) 
                                	 lc= smpljson.getString("lc").isEmpty() ? null:Double.parseDouble(smpljson.getString("lc"));
                                 if(smpljson.has("lime"))
                                	 lime= smpljson.getString("lime").isEmpty() ? null:Double.parseDouble(smpljson.getString("lime"));
                                 if(smpljson.has("BaO"))
                                	 BaO= smpljson.getString("BaO").isEmpty() ? null:Double.parseDouble(smpljson.getString("BaO"));
                                 if(smpljson.has("Na_Eq"))
                                	 Na_Eq=smpljson.getString("Na_Eq").isEmpty() ? null:Double.parseDouble(smpljson.getString("Na_Eq"));
                                 if(smpljson.has("LS"))
                                	 LS= smpljson.getString("LS").isEmpty() ? null:Double.parseDouble(smpljson.getString("LS"));
                                 if(smpljson.has("r_90"))
                                	 r_90= smpljson.getString("r_90").isEmpty() ? null:  Double.parseDouble(smpljson.getString("r_90"));
                                 if(smpljson.has("r_212"))
                                	 r_212=smpljson.getString("r_212").isEmpty() ? null: Double.parseDouble(smpljson.getString("r_212"));
                                 if(smpljson.has("f_silica"))
                                	 f_silica=smpljson.getString("f_silica").isEmpty() ? null: Double.parseDouble(smpljson.getString("f_silica"));
                                 if(smpljson.has("r_60"))
                                	 r_60=smpljson.getString("r_60").isEmpty() ? null: Double.parseDouble(smpljson.getString("r_60"));
                                 if(smpljson.has("r_45"))
                                	 r_45= smpljson.getString("r_45").isEmpty() ? null:Double.parseDouble(smpljson.getString("r_45"));
                                 if(smpljson.has("r_30"))
                                	 r_30= smpljson.getString("r_30").isEmpty() ? null: Double.parseDouble(smpljson.getString("r_30")); 
                                 if(smpljson.has("r_20"))
                                	 r_20= smpljson.getString("r_20").isEmpty() ? null: Double.parseDouble(smpljson.getString("r_20"));
                                 if(smpljson.has("r_10"))     
                                	 r_10=smpljson.getString("r_10").isEmpty() ? null: Double.parseDouble(smpljson.getString("r_10"));
                        	     if(smpljson.has("r_3"))
                        	    	 r_3=smpljson.getString("r_3").isEmpty() ? null: Double.parseDouble(smpljson.getString("r_3")); 
                        	     if(smpljson.has("avg_1d_kn"))     
                        	    	 avg_1d_kn= smpljson.getString("avg_1d_kn").isEmpty() ? null:  Double.parseDouble(smpljson.getString("avg_1d_kn"));
                        	     if(smpljson.has("avg_1d_mpa"))
                        	    	 avg_1d_mpa=smpljson.getString("avg_1d_mpa").isEmpty() ? null: Double.parseDouble(smpljson.getString("avg_1d_mpa")); 
                        	     if(smpljson.has("avg_3d_kn")) 
                        	    	 avg_3d_kn=smpljson.getString("avg_3d_kn").isEmpty() ? null: Double.parseDouble(smpljson.getString("avg_3d_kn"));
                        	     if(smpljson.has("avg_3d_mpa"))
                        	    	 avg_3d_mpa= smpljson.getString("avg_3d_mpa").isEmpty() ? null: Double.parseDouble(smpljson.getString("avg_3d_mpa"));
                        	     if(smpljson.has("avg_7d_kn"))
                        	    	 avg_7d_kn=	smpljson.getString("avg_7d_kn").isEmpty() ? null:Double.parseDouble(smpljson.getString("avg_7d_kn"));
                        	     if(smpljson.has("avg_7d_mpa"))
                        	    	 avg_7d_mpa= smpljson.getString("avg_7d_mpa").isEmpty() ? null:Double.parseDouble(smpljson.getString("avg_7d_mpa"));
                        	     if(smpljson.has("avg_28d_kn"))
                        	    	 avg_28d_kn=smpljson.getString("avg_28d_kn").isEmpty() ? null:Double.parseDouble(smpljson.getString("avg_28d_kn"));
                        	     if(smpljson.has("avg_28d_mpa"))
                        	    	 avg_28d_mpa= smpljson.getString("avg_28d_mpa").isEmpty() ? null:Double.parseDouble(smpljson.getString("avg_28d_mpa"));
                        	     if(smpljson.has("ALKALI_SO3"))
                        	    	 ALKALI_SO3=smpljson.getString("ALKALI_SO3").isEmpty() ? null: Double.parseDouble(smpljson.getString("ALKALI_SO3"));
                        	     if(smpljson.has("SO3_ALKAI"))
                        	    	 SO3_ALKAI= smpljson.getString("SO3_ALKAI").isEmpty() ? null: Double.parseDouble(smpljson.getString("SO3_ALKAI"));
                        	     if(smpljson.has("EXCESS_SO3"))
                        	    	 EXCESS_SO3= smpljson.getString("EXCESS_SO3").isEmpty() ? null: Double.parseDouble(smpljson.getString("EXCESS_SO3")); 
                        	     if(smpljson.has("C3S_C2S"))
                        	    	 C3S_C2S= smpljson.getString("C3S_C2S").isEmpty() ? null: Double.parseDouble(smpljson.getString("C3S_C2S"));
						        if(smpljson.has("ALKALI_AS_NA2O"))
						        	ALKALI_AS_NA2O=smpljson.getString("ALKALI_AS_NA2O").isEmpty() ? null: Double.parseDouble(smpljson.getString("ALKALI_AS_NA2O"));
                        	    if(smpljson.has("HOR"))
                        	    	HOR=smpljson.getString("HOR").isEmpty() ? null:Double.parseDouble(smpljson.getString("HOR"));
                        	     if(smpljson.has("MM"))
                        	    	 MM= smpljson.getString("MM").isEmpty() ? null:Double.parseDouble(smpljson.getString("MM"));
                        	    if(smpljson.has("BF"))
                        	    	BF=smpljson.getString("BF").isEmpty() ? null:Double.parseDouble(smpljson.getString("BF"));
                        	    if(smpljson.has("pi_percentage"))
                        	    	pi_percentage=  smpljson.getString("pi_percentage").isEmpty() ? null:Double.parseDouble(smpljson.getString("pi_percentage"));
                        	    if(smpljson.has("slag_percentage"))
                        	    	slag_percentage= smpljson.getString("slag_percentage").isEmpty() ? null:Double.parseDouble(smpljson.getString("slag_percentage"));
                        	    if(smpljson.has("drying_shrinkage")) 
                        	    	drying_shrinkage=smpljson.getString("drying_shrinkage").isEmpty() ? null:Double.parseDouble(smpljson.getString("drying_shrinkage")); 
                        	   	if(smpljson.has("cement_temp"))
                        	   		cement_temp=smpljson.getString("cement_temp").isEmpty() ? null: Double.parseDouble(smpljson.getString("cement_temp"));
                        	    if(smpljson.has("ni_bs"))
                        	    	ni_bs=smpljson.getString("ni_bs").isEmpty() ? null:Double.parseDouble(smpljson.getString("ni_bs"));
                        	    if(smpljson.has("loss_on_ignition_kf"))
                        	    	loss_on_ignition_kf=smpljson.getString("loss_on_ignition_kf").isEmpty() ? null:Double.parseDouble(smpljson.getString("loss_on_ignition_kf"));
                        	    if(smpljson.has("loss_on_ignition_hm"))
                        	    	loss_on_ignition_hm=smpljson.getString("loss_on_ignition_hm").isEmpty() ? null: Double.parseDouble(smpljson.getString("loss_on_ignition_hm"));
                        	    if(smpljson.has("lightweight"))
                        	    	lightweight=smpljson.getString("lightweight").isEmpty() ? null:Double.parseDouble(smpljson.getString("lightweight"));
                        	    if(smpljson.has("psd_size3"))
                        	    	psd_size3=smpljson.getString("psd_size3").isEmpty() ? null:Double.parseDouble(smpljson.getString("psd_size3"));
                        	    if(smpljson.has("psd_size90"))
                        	    	psd_size90=	smpljson.getString("psd_size90").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_size90"));
                        	    if(smpljson.has("psd_size60"))
                        	    	psd_size60=smpljson.getString("psd_size60").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_size60"));
                        	    if(smpljson.has("ash_percentage"))
                        	    	ash_percentage=smpljson.getString("ash_percentage").isEmpty() ? null:Double.parseDouble(smpljson.getString("ash_percentage"));
                        	    if(smpljson.has("psd_bet_3and30"))         
                        	    	psd_bet_3and30=smpljson.getString("psd_bet_3and30").isEmpty() ? null:Double.parseDouble(smpljson.getString("psd_bet_3and30"));
                        	    if(smpljson.has("psd_above_212"))
                        	    	psd_above_212= smpljson.getString("psd_above_212").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_above_212"));
                        	    if(smpljson.has("psd_above_30")) 
                        	    	psd_above_30=smpljson.getString("psd_above_30").isEmpty() ? null:Double.parseDouble(smpljson.getString("psd_above_30"));
                        	    if(smpljson.has("psd_above_45")) 
                        	    	psd_above_45=smpljson.getString("psd_above_45").isEmpty() ? null:Double.parseDouble(smpljson.getString("psd_above_45"));
                        	   if(smpljson.has("psd_above_50")) 
                        		   psd_above_50=smpljson.getString("psd_above_50").isEmpty() ? null:Double.parseDouble(smpljson.getString("psd_above_50"));
                        	   if(smpljson.has("psd_above_90")) 
                        		   psd_above_90=smpljson.getString("psd_above_90").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_above_90"));
                        	   if(smpljson.has("psd_below_20")) 
                        		   psd_below_20=smpljson.getString("psd_below_20").isEmpty() ? null:Double.parseDouble(smpljson.getString("psd_below_20"));
                        	   if(smpljson.has("psd_below_5"))  
                        		   psd_below_5=smpljson.getString("psd_below_5").isEmpty() ? null: Double.parseDouble(smpljson.getString("psd_below_5"));
                        	   if(smpljson.has("lrcr_avg_10d_mpa")) 
                        		   lrcr_avg_10d_mpa=smpljson.getString("lrcr_avg_10d_mpa").isEmpty() ? null: Double.parseDouble(smpljson.getString("lrcr_avg_10d_mpa"));
                        	   if(smpljson.has("lrcr_avg_28d_mpa")) 
                        		   lrcr_avg_28d_mpa=smpljson.getString("lrcr_avg_28d_mpa").isEmpty() ? null:Double.parseDouble(smpljson.getString("lrcr_avg_28d_mpa"));
                        	   if(smpljson.has("blaine_time")) 
                        		   blaine_time=smpljson.getString("blaine_time").isEmpty() ? null: Double.parseDouble(smpljson.getString("blaine_time"));
                        	   if(smpljson.has("ball_meal_so3")) 
                        		   ball_meal_so3=smpljson.getString("ball_meal_so3").isEmpty() ? null:Double.parseDouble(smpljson.getString("ball_meal_so3"));
                        	   if(smpljson.has("smpl_qty_received")) 
                        		   smpl_qty_received=smpljson.getString("smpl_qty_received").isEmpty() ? null:Double.parseDouble(smpljson.getString("smpl_qty_received"));
                        	   if(smpljson.has("moisture")) 
                        		   moisture=smpljson.getString("volatile_moisture").isEmpty() ? null:Double.parseDouble(smpljson.getString("moisture"));
                        	   if(smpljson.has("volatile_moisture")) 
                        		   volatile_moisture= smpljson.getString("volatile_moisture").isEmpty() ? null:Double.parseDouble(smpljson.getString("volatile_moisture")); 
                        	   if(smpljson.has("inherient_moisture")) 
                        		   inherient_moisture=smpljson.getString("inherient_moisture").isEmpty() ? null:Double.parseDouble(smpljson.getString("inherient_moisture"));
                        	   if(smpljson.has("free_moisture"))
                        		   free_moisture=smpljson.getString("free_moisture").isEmpty() ? null: Double.parseDouble(smpljson.getString("free_moisture"));
                        	  if(smpljson.has("GCV_Airdrybasis")) 
                        		  GCV_Airdrybasis=smpljson.getString("GCV_Airdrybasis").isEmpty() ? null: Double.parseDouble(smpljson.getString("GCV_Airdrybasis"));
                        	  if(smpljson.has("GCV_Asreceivedbasis")) 
                        		  GCV_Asreceivedbasis=smpljson.getString("GCV_Asreceivedbasis").isEmpty() ? null: Double.parseDouble(smpljson.getString("GCV_Asreceivedbasis"));
                        	  if(smpljson.has("asreceivedbasis_freemoisture")) 
                        	        asreceivedbasis_freemoisture= smpljson.getString("asreceivedbasis_freemoisture").isEmpty() ? null:Double.parseDouble(smpljson.getString("asreceivedbasis_freemoisture"));
                        	  if(smpljson.has("asreceivedbasis_totalmoisture")) 
                        	       asreceivedbasis_totalmoisture= smpljson.getString("asreceivedbasis_totalmoisture").isEmpty() ? null:Double.parseDouble(smpljson.getString("asreceivedbasis_totalmoisture"));
                        	  if(smpljson.has("airdrybasis_inherientmoisture")) 
                        		  airdrybasis_inherientmoisture=smpljson.getString("airdrybasis_inherientmoisture").isEmpty() ? null:Double.parseDouble(smpljson.getString("airdrybasis_inherientmoisture"));
                        	  if(smpljson.has("airdrybasis_volatilemoisture")) 
                        		  airdrybasis_volatilemoisture= smpljson.getString("airdrybasis_volatilemoisture").isEmpty() ? null:Double.parseDouble(smpljson.getString("airdrybasis_volatilemoisture"));
                        	  if(smpljson.has("airdrybasis_ash")) 
                        		  airdrybasis_ash=smpljson.getString("airdrybasis_ash").isEmpty() ? null: Double.parseDouble(smpljson.getString("airdrybasis_ash"));
                        	  if(smpljson.has("airdrybasis_sulphur")) 
                        		  airdrybasis_sulphur= smpljson.getString("airdrybasis_sulphur").isEmpty() ? null:Double.parseDouble(smpljson.getString("airdrybasis_sulphur"));
                        	  if(smpljson.has("purity")) 
                        		  purity=smpljson.getString("purity").isEmpty() ? null:Double.parseDouble(smpljson.getString("purity"));
                        	  if(smpljson.has("carbon")) 
                        		  carbon=smpljson.getString("carbon").isEmpty() ? null:Double.parseDouble(smpljson.getString("carbon"));
                        	  if(smpljson.has("nitrogen")) 
                        		  nitrogen=smpljson.getString("nitrogen").isEmpty() ? null: Double.parseDouble(smpljson.getString("nitrogen"));
                        	  if(smpljson.has("r2o3")) 
                        		  r2o3= smpljson.getString("r2o3").isEmpty() ? null: Double.parseDouble(smpljson.getString("r2o3"));
                        	  if(smpljson.has("Fluorine")) 
                        		  Fluorine=smpljson.getString("Fluorine").isEmpty() ? null:Double.parseDouble(smpljson.getString("Fluorine"));
                        	  if(smpljson.has("at_cl")) 
                        		  at_cl=smpljson.getString("at_cl").isEmpty() ? null:Double.parseDouble(smpljson.getString("at_cl"));
                        	  if(smpljson.has("flashpoint")) 
                        		  flashpoint=smpljson.getString("flashpoint").isEmpty() ? null: Double.parseDouble(smpljson.getString("flashpoint"));
                        	  if(smpljson.has("na2o3")) 
                        		 na2o3=smpljson.getString("na2o3").isEmpty() ? null:Double.parseDouble(smpljson.getString("na2o3"));
                        	  if(smpljson.has("cr2o3")) 
                        		  cr2o3=smpljson.getString("cr2o3").isEmpty() ? null:Double.parseDouble(smpljson.getString("cr2o3"));
                        	  if(smpljson.has("Chloride_content")) 
                        		  Chloride_content= smpljson.getString("Chloride_content").isEmpty() ? null:Double.parseDouble(smpljson.getString("Chloride_content"));
                        	  if(smpljson.has("co2")) 
                        		  co2= smpljson.getString("co2").isEmpty() ? null:Double.parseDouble(smpljson.getString("co2"));
                        	  if(smpljson.has("c_id")) 
                        		  c_id= smpljson.getString("c_id").isEmpty() ? null:Integer.parseInt(smpljson.getString("c_id"));
                        	  if(smpljson.has("noof_cubes_1d")) 
                        		  noof_cubes_1d= smpljson.getString("noof_cubes_1d").isEmpty() ? null:Integer.parseInt(smpljson.getString("noof_cubes_1d"));
                        	  if(smpljson.has("noof_cubes_3d")) 
                        		  noof_cubes_3d=smpljson.getString("noof_cubes_3d").isEmpty() ? null:Integer.parseInt(smpljson.getString("noof_cubes_3d"));
                        	  if(smpljson.has("noof_cubes_7d")) 
                        		 noof_cubes_7d=smpljson.getString("noof_cubes_7d").isEmpty() ? null:Integer.parseInt(smpljson.getString("noof_cubes_7d"));
                        	  if(smpljson.has("noof_cubes_28d")) 
                        		  noof_cubes_28d= smpljson.getString("noof_cubes_28d").isEmpty() ? null: Integer.parseInt(smpljson.getString("noof_cubes_28d"));
                        	  if(smpljson.has("planned_brdays")) 
                        		  planned_brdays=smpljson.getString("planned_brdays").isEmpty() ? null: Integer.parseInt(smpljson.getString("planned_brdays"));
                        	  if(smpljson.has("psd_id")) 
                        		 psd_id=smpljson.getString("psd_id").isEmpty() ? null: Integer.parseInt(smpljson.getString("psd_id"));
                        	  if(smpljson.has("lrcr_avg_10d_kn")) 
                        		  lrcr_avg_10d_kn=smpljson.getString("lrcr_avg_10d_kn").isEmpty() ? null: Integer.parseInt(smpljson.getString("lrcr_avg_10d_kn"));
                        	  if(smpljson.has("lrcr_avg_28d_kn"))
                        		  lrcr_avg_28d_kn=smpljson.getString("lrcr_avg_28d_kn").isEmpty() ? null:Integer.parseInt(smpljson.getString("lrcr_avg_28d_kn"));
                        	  if(smpljson.has("lrcr_noof_cubes_10d"))  
                        		  lrcr_noof_cubes_10d=smpljson.getString("lrcr_noof_cubes_10d").isEmpty() ? null:Integer.parseInt(smpljson.getString("lrcr_noof_cubes_10d")); 
                        	  if(smpljson.has("lrcr_noof_cubes_28d"))  
                        		  lrcr_noof_cubes_28d= smpljson.getString("lrcr_noof_cubes_28d").isEmpty() ? null:Integer.parseInt(smpljson.getString("lrcr_noof_cubes_28d")); 
                        	  if(smpljson.has("rack_no"))  
                        		  rack_no=smpljson.getString("rack_no").isEmpty() ? null: Integer.parseInt(smpljson.getString("rack_no"));
                        	  if(smpljson.has("doc_no"))  
                        		  doc_no=smpljson.getString("doc_no").isEmpty() ? null: Integer.parseInt(smpljson.getString("doc_no"));
                              if(smpljson.has("smplreceived_time"))  
                            	  smplreceived_time= smpljson.getString("smplreceived_time").isEmpty() ? null: Integer.parseInt(smpljson.getString("smplreceived_time"));
                              if(smpljson.has("afr_smpl_id"))  
                            	  afr_smpl_id= smpljson.getString("afr_smpl_id").isEmpty() ? null: Integer.parseInt(smpljson.getString("afr_smpl_id"));
                                                                                                                          	  
			                    
								     
							  }
				                catch (JSONException | ParseException e1)
				                   { // TODO Auto-generated catch block
				                	System.out.print(e1.getMessage());
										   e1.printStackTrace();
									}
							  
							 
				            
							          	 try {
							          		     //*********************** update mst_smpl_collection ******************
							          		   smplcollrepo.update_smpl_Data(flyash_range,tga_batch_name,lims_id,degree_of_calci,ts_blaine ,ts_color,
							          				 ts_xrf,ts_ctm_1day,ts_ctm_3day,ts_bcal,pass_fail,ts_ctm_7day, ts_ctm_28day,ts_lrcr_10day,ts_lrcr_28day,
							          		 		 grn, smpl_casting_dt, blaine_test_datetime, colorindex_test_datetime, xrf_test_datetime, bombcal_test_datetime, tga_test_datetime,
							          		 		 mb_test_datetime, mw1_test_datetime, mw2_test_datetime, airmwt1_test_datetime, airmwt2_test_datetime, 
							          		 		 airmwt3_test_datetime, psd_test_datetime, smpl_casting_dt_3, smpl_casting_dt_7, smpl_casting_dt_28, 
							          		 		 lrcr_smpl_casting_dt_10, lrcr_smpl_casting_dt_28, rack_dt, kft_test_datetime, at_test_datetime,
							          				 fp_test_datetime, cba_test_datetime, grn_date,smpl_qty,smpl_breath,smpl_height,smpl_width,blaine,
							          				 colorindex, CaO,SiO2,Al2O3,Fe2O3,MgO,SO3,K2O,Na2O,Cl,xrf_total,LSF,SM,AM,bombcal_gcv_gross,ti_o_2,p2_os,
							          				 loi,p_sum,ir,r_fourtyfive,nc,le_chatellier,autoclave,setting_time_initial,setting_time_final,c3s,c2s,c3a,c4af,
							          				 liquid,sulphur,fcao,tga_moisture_std,tga_volatile_std,tga_volatile_dry_std,tga_ash_std,tga_ash_dry_std,tga_fix_carbon_std,
							          				 tga_fix_carbon_dry_std,ncv,hydrogen,mwt1,mwt2,mwt3,mb_value,airmwt1,airmwt2,airmwt3,total_moisture,airmb_value,
							          				 manualcalculated_gcv,coal_sulphuradb,Mn2O3,P2O5,TiO2,SrO,psd_size5,psd_size10,psd_size20,psd_size30,
							          				 psd_size40,psd_size45,psd_size50,Quartz,xrf_sum,lc,lime,BaO,Na_Eq,LS,r_90,r_212,f_silica,r_60,r_45,r_30,r_20,r_10,r_3,
							          				 avg_1d_kn,avg_1d_mpa,avg_3d_kn,avg_3d_mpa,avg_7d_kn,avg_7d_mpa,avg_28d_kn,avg_28d_mpa,ALKALI_SO3,SO3_ALKAI,EXCESS_SO3,C3S_C2S,
							          				 ALKALI_AS_NA2O,HOR,MM,BF,pi_percentage,slag_percentage,drying_shrinkage,cement_temp,ni_bs,loss_on_ignition_kf,loss_on_ignition_hm,
							          				 lightweight,psd_size3,psd_size90,psd_size60,ash_percentage,psd_bet_3and30,psd_above_212,psd_above_30,psd_above_45,psd_above_50,psd_above_90,
							          				 psd_below_20,psd_below_5,lrcr_avg_10d_mpa,lrcr_avg_28d_mpa,blaine_time,ball_meal_so3,smpl_qty_received,moisture,volatile_moisture,
							          				 inherient_moisture,free_moisture,GCV_Airdrybasis,GCV_Asreceivedbasis,asreceivedbasis_freemoisture, asreceivedbasis_totalmoisture, 
							          				airdrybasis_inherientmoisture,airdrybasis_volatilemoisture,airdrybasis_ash ,airdrybasis_sulphur, purity,carbon ,nitrogen,r2o3,   
							          				Fluorine,at_cl,flashpoint,na2o3,cr2o3, Chloride_content,co2,c_id,noof_cubes_1d,noof_cubes_3d,noof_cubes_7d,noof_cubes_28d,planned_brdays,
							          				psd_id,lrcr_avg_10d_kn,lrcr_avg_28d_kn,lrcr_noof_cubes_10d,lrcr_noof_cubes_28d,rack_no,doc_no,smplreceived_time,afr_smpl_id,
							          				Integer.parseInt(smpljson.getString("smpl_id")), Integer.parseInt(smpljson.getString("p_id")));
							          						           
															        
							          		 
							          		 
							          		 
										        response_error.put("status_code", "0");
									            response_error.put("message", "Smpl_collection Data updated on cloud sucessfully"); 
								             }catch(Exception e) {
								    						System.out.println("error "+e);
															response_error.put("status_code", "1");
															response_error.put("message", "Fail to update Smpl_collection data on cloud");
										                }
					 
						  }
				   	
				   
				 }catch(Exception e)
				 {
					 System.out.println(e);
				 }
				 
				 
				  response_msg.put("status",response_error);
				  return response_msg.toString();
			}
			
			
			 //********** API For send mst_smpl_collection data(from cloud to sap)******************
			/*@PostMapping(value="/cloud_to_sap/send_smplData",produces ={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
			public ResponseEntity<List<Smpl_collection>> send_smplCollectionData(@Validated @RequestBody String data, BindingResult bindingResult)
			{
				
				 List<Smpl_collection> smpldata = new ArrayList<Smpl_collection>();
				 try
				    {
					 	 JSONObject jsnobject = new JSONObject(data);
						 JSONArray jsonarr1 = jsnobject.getJSONArray("request_data");
					 	 for (int icount = 0; icount< jsonarr1.length(); icount++)
						  {
							  
							  JSONObject smpljson = jsonarr1.getJSONObject(icount);
							  Integer plantcode=Integer.parseInt(smpljson.getString("plant_code"));
							  Integer udcode=Integer.parseInt(smpljson.getString("ud_code"));
							  
							  if(udcode==1)
							  {
								//********** select data from ud1 table************
								  List<UD1> uddata=ud1repo.select_UD1data(plantcode);
								  for(int jcon=0;jcon<uddata.size();jcon++)
								  {
									  //********** select data from mst_smpl_collection table ************
									  List<Smpl_collection> smpldata1 = new ArrayList<Smpl_collection>();
									  smpldata1= smplcollrepo.select_smpldataByID(uddata.get(jcon).getPlant_id(), uddata.get(jcon).getSmpl_id(),uddata.get(jcon).getGrn());
									  smpldata.addAll(smpldata1);
								  }
							  }
							  if(udcode==2)
							  {
								//********** select data from ud2 table************
								  List<UD2> uddata=ud2repo.select_UD2data(plantcode);
								  for(int jcon=0;jcon<uddata.size();jcon++)
								  {
									  //********** select data from mst_smpl_collection table ************
									  List<Smpl_collection> smpldata1 = new ArrayList<Smpl_collection>();
									  smpldata1= smplcollrepo.select_smpldataByID(uddata.get(jcon).getPlant_id(), uddata.get(jcon).getSmpl_id(),uddata.get(jcon).getGrn());
									  smpldata.addAll(smpldata1);
								 }
							  }
							  if(udcode==3)
							  {
								//********** select data from ud3 table************
								  List<UD3> uddata=ud3repo.select_UD3data(plantcode);
								  for(int jcon=0;jcon<uddata.size();jcon++)
								  {
									  //********** select data from mst_smpl_collection table ************
									  List<Smpl_collection> smpldata1 = new ArrayList<Smpl_collection>();
									  smpldata1= smplcollrepo.select_smpldataByID(uddata.get(jcon).getPlant_id(), uddata.get(jcon).getSmpl_id(),uddata.get(jcon).getGrn());
									  smpldata.addAll(smpldata1);
								  }
							  }
							  
						  }//end of outer for loop
				 
				    }catch(Exception e)
						  {
							 System.out.println(e);   	
						  }
				 
				  return new ResponseEntity<>(smpldata, HttpStatus.OK);
			}
			*/
						
			//***************** API For Update Smpl Collection Result table ************************
			@PostMapping("/elims_to_cloud/elims_collection_Data")
			public String smplData(@Validated @RequestBody String request_data, BindingResult bindingResult) 
					{
						  JSONObject response_msg=new JSONObject();
						  JSONObject response_error=new JSONObject();
						try
						{
						LOGGER.info("Request to Update Sample Collection Data on Cloud "+request_data);
						  JSONObject jsnobject = new JSONObject(request_data);
						  JSONArray jsonarr1 = jsnobject.getJSONArray("request_data");
						  JSONArray jsonRespArray=new JSONArray();
						  
						  
						  
						  for (int icount = 0; icount< jsonarr1.length(); icount++)
						  {
							  JSONObject smpl_data_json = jsonarr1.getJSONObject(icount);
							 // double blaine=Double.parseDouble(smpl_data_json.getString("blaine"));
							  
							  JSONObject jsonRespObj=new JSONObject();
							  
							  try
							  {
							  
								  List<Smpl_collection>  getSmplIdDataCount=smplcollrepo.getSmplIdDataCount(Integer.parseInt(smpl_data_json.getString("smpl_id")));
								  if(getSmplIdDataCount.size()>0)
								  {
							  smplcollrepo.updatesmplCollectionData(Integer.parseInt(smpl_data_json.getString("smpl_id")), Integer.parseInt(smpl_data_json.getString("p_id")), 
									   	Double.parseDouble(smpl_data_json.getString("sio2")), 
                                        Double.parseDouble(smpl_data_json.getString("al2o3")),
                                        Double.parseDouble(smpl_data_json.getString("fe2o3")),
                                        Double.parseDouble(smpl_data_json.getString("cao")),
                                        Double.parseDouble(smpl_data_json.getString("mgo")),
                                        Double.parseDouble(smpl_data_json.getString("so3")),
                                        Double.parseDouble(smpl_data_json.getString("na2o")),
                                        Double.parseDouble(smpl_data_json.getString("k2o")),
                                        Double.parseDouble(smpl_data_json.getString("cl")),
                                        Double.parseDouble(smpl_data_json.getString("tio2")),
                                        Double.parseDouble(smpl_data_json.getString("p2o5")),
                                        Double.parseDouble(smpl_data_json.getString("loi")),
                                        Double.parseDouble(smpl_data_json.getString("xrf_sum")),
                                        Double.parseDouble(smpl_data_json.getString("lsf")),
                                        Double.parseDouble(smpl_data_json.getString("sm")),
                                        Double.parseDouble(smpl_data_json.getString("am")),
                                        Double.parseDouble(smpl_data_json.getString("bf")),
                                        Double.parseDouble(smpl_data_json.getString("na_eq")),
                                        Double.parseDouble(smpl_data_json.getString("r_90")),
                                        Double.parseDouble(smpl_data_json.getString("r_212")),
                                        Double.parseDouble(smpl_data_json.getString("quartz")),
                                        Double.parseDouble(smpl_data_json.getString("lime")),
                                        Double.parseDouble(smpl_data_json.getString("lc")),
                                        Double.parseDouble(smpl_data_json.getString("alkali_so3")),
                                        Double.parseDouble(smpl_data_json.getString("so3_alkai")),
                                        Double.parseDouble(smpl_data_json.getString("mm")),
                                        Double.parseDouble(smpl_data_json.getString("c3s")),
                                        Double.parseDouble(smpl_data_json.getString("c2s")),
                                        Double.parseDouble(smpl_data_json.getString("c3a")),
                                        Double.parseDouble(smpl_data_json.getString("c4af")),
                                        Double.parseDouble(smpl_data_json.getString("excess_so3")),
                                        Double.parseDouble(smpl_data_json.getString("hor")),
                                        Double.parseDouble(smpl_data_json.getString("lightweight")),
                                        Double.parseDouble(smpl_data_json.getString("loss_on_ignition_kf")),
                                        Double.parseDouble(smpl_data_json.getString("loss_on_ignition_hm")),
                                       smpl_data_json.getString("degree_of_calci")
																	  
									  );
							  
							  			jsonRespObj.put("smpl_id", smpl_data_json.getString("smpl_id").toString());
							  			
							  			jsonRespArray.put(jsonRespObj);
								  }
							  }
							  catch(Exception ex)
							  {
								  System.out.println(ex.getMessage());
								  
							  }
						  }	
						  response_error.put("status_code", "0");
						  response_error.put("message", "Sample Collection Data Updated sucessfully");
						  
							   
						  response_msg.put("response", jsonRespArray);
						  response_msg.put("status",response_error);
						  
						  LOGGER.info("Response to Update Sample Collection Data on Cloud "+response_msg.toString());
						  
						  
						}
						catch(Exception ex)
						{
							System.out.println(ex.getMessage());
							response_error.put("status_code", "1");
							response_error.put("message", "Sample Collection Data Fail to Update");
							response_msg.put("status",response_error);
							LOGGER.error("Error to Update Sample Collection Data on Cloud "+ex.getMessage());
							
						}
						  return response_msg.toString();
					}
					
					
			//***************** API For Add Smpl Collection table ************************
					@PostMapping("/elims_to_cloud/elims_collection_Data_add")
					public String addSmplData(@Validated @RequestBody String request_data, BindingResult bindingResult) 
					{
						  JSONObject response_msg=new JSONObject();
						  JSONObject response_error=new JSONObject();
						try
						{
							LOGGER.info("Request to Insert Sample Collection Data on Cloud "+request_data);
						  JSONObject jsnobject = new JSONObject(request_data);
						  JSONArray jsonarr1 = jsnobject.getJSONArray("request_data");
						  JSONArray jsonRespArray=new JSONArray();
						  
						  
						  for (int icount = 0; icount< jsonarr1.length(); icount++)
						  {
							  JSONObject smpl_data_json = jsonarr1.getJSONObject(icount);
							  
							  JSONObject jsonRespObj=new JSONObject();					 
							  
							  try
							  {
								  Date date_collection=new SimpleDateFormat("yyyy/MM/ddd").parse(smpl_data_json.getString("smpl_collected_dt"));
								  Date date_casting=null;
								  if(!smpl_data_json.getString("smpl_casting_dt").matches(""))
								  {
								  	  date_casting=new SimpleDateFormat("yyyy/MM/ddd").parse(smpl_data_json.getString("smpl_casting_dt"));
								  }
								  
								  smplcollrepo.insertesmplCollectionData(Integer.parseInt(smpl_data_json.getString("smpl_id")),date_collection,date_casting,Double.parseDouble(smpl_data_json.getString("smpl_qty")), Integer.parseInt(smpl_data_json.getString("p_id")),Integer.parseInt(smpl_data_json.getString("ctype_id")),Integer.parseInt(smpl_data_json.getString("sect_id")) );
								  jsonRespObj.put("smpl_id", smpl_data_json.getString("smpl_id").toString());
						  		
						  		  jsonRespArray.put(jsonRespObj);
								  
							  }
							  catch(Exception ex)
							  {
								  
								  
							  }
						  }	
						  response_error.put("status_code", "0");
						  response_error.put("message", "Sample Collection Data Inserted sucessfully");
						  
						  response_msg.put("response", jsonRespArray);
						  response_msg.put("status",response_error);
						  
						  LOGGER.info("Response to Insert Sample Collection Data on Cloud "+response_msg.toString());
						}
						catch(Exception ex)
						{
							response_error.put("status_code", "1");
							response_error.put("message", "Sample Collection Data Fail to Insert");
							response_msg.put("status",response_error);
							LOGGER.error("Error to Insert Sample Collection Data on Cloud "+response_msg.toString());
							
						}
						  return response_msg.toString();
					}
			
			
			
			
}
