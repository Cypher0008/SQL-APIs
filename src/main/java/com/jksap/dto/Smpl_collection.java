package com.jksap.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="mst_smpl_collection")
public class Smpl_collection {

	
	@Id
	@Column(name="smpl_id")
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer smpl_id;
	
	private String smpl_no,flyash_range,tga_batch_name,lims_id,created,degree_of_calci, ts_blaine, ts_color, ts_xrf,
					ts_ctm_1day, ts_ctm_3day, ts_bcal,pass_fail,
				    ts_ctm_7day, ts_ctm_28day, ts_lrcr_10day, ts_lrcr_28day,posted_to_Server,gate_entry_no,grn;
	
	private Date smpl_casting_dt,smpl_collected_dt,blaine_test_datetime, 
                 colorindex_test_datetime, xrf_test_datetime,bombcal_test_datetime,tga_test_datetime,mb_test_datetime,
                 mw1_test_datetime, mw2_test_datetime,airmwt1_test_datetime,airmwt2_test_datetime, airmwt3_test_datetime,
                 psd_test_datetime,smpl_casting_dt_3, smpl_casting_dt_7, smpl_casting_dt_28,lrcr_smpl_casting_dt_10, 
                 lrcr_smpl_casting_dt_28,rack_dt,kft_test_datetime,  at_test_datetime,  fp_test_datetime,cba_test_datetime,grn_date;
	
	private Double smpl_qty, smpl_breath, smpl_height, smpl_width,blaine, colorindex,CaO, SiO2, Al2O3, Fe2O3, MgO,
	               SO3, K2O, Na2O, Cl,xrf_total, LSF, SM, AM, bombcal_gcv_gross, ti_o_2, p2_os, loi, p_sum, ir, r_fourtyfive,
	               nc, le_chatellier, autoclave, setting_time_initial, setting_time_final, c3s, c2s, c3a, c4af, liquid, sulphur,
	               fcao, tga_moisture_std, tga_volatile_std, tga_volatile_dry_std, tga_ash_std, tga_ash_dry_std, 
	               tga_fix_carbon_std, tga_fix_carbon_dry_std, ncv, hydrogen, mwt1, mwt2, mwt3, mb_value, airmwt1, airmwt2,
	               airmwt3,total_moisture, airmb_value,manualcalculated_gcv, coal_sulphuradb, Mn2O3, P2O5, TiO2, SrO,
	               psd_size5, psd_size10, psd_size20, 
	               psd_size30, psd_size40, psd_size45, psd_size50, Quartz, xrf_sum, lc, lime,BaO, Na_Eq, LS, r_90, r_212, 
	               f_silica, r_60,r_45, r_30, r_20, r_10, r_3, avg_1d_kn, avg_1d_mpa, avg_3d_kn, 
	               avg_3d_mpa, avg_7d_kn, avg_7d_mpa, avg_28d_kn, avg_28d_mpa,ALKALI_SO3, SO3_ALKAI, EXCESS_SO3, C3S_C2S, ALKALI_AS_NA2O, 
	               HOR, MM, BF, pi_percentage, slag_percentage, drying_shrinkage, cement_temp, ni_bs, loss_on_ignition_kf,
	               loss_on_ignition_hm,lightweight, psd_size3, psd_size90, psd_size60, ash_percentage, psd_bet_3and30, psd_above_212, 
	               psd_above_30, psd_above_45, psd_above_50, psd_above_90, psd_below_20, psd_below_5,lrcr_avg_10d_mpa,lrcr_avg_28d_mpa,
	               blaine_time,ball_meal_so3,smpl_qty_received, moisture, volatile_moisture, inherient_moisture, free_moisture, 
	               GCV_Airdrybasis, GCV_Asreceivedbasis,asreceivedbasis_freemoisture, asreceivedbasis_totalmoisture, airdrybasis_inherientmoisture, airdrybasis_volatilemoisture, airdrybasis_ash, airdrybasis_sulphur, purity, 
	               carbon, nitrogen, r2o3, Fluorine,at_cl,flashpoint,na2o3,cr2o3, Chloride_content, co2;
	
	private Integer p_id, c_id, ctype_id, mst_region_id,supplier_id,createdby_user_id, sect_id,noof_cubes_1d, 
	                 noof_cubes_3d, noof_cubes_7d, noof_cubes_28d, planned_brdays,psd_id,lrcr_avg_10d_kn,lrcr_avg_28d_kn,
	                 lrcr_noof_cubes_10d, lrcr_noof_cubes_28d,source_id, rack_no, doc_no,smplreceived_time,afr_smpl_id;
	
	
	
	public Smpl_collection() {
		
	                         }
	
	public Smpl_collection(Integer smpl_id,Date smpl_collected_dt,Integer p_id,Integer ctype_id, Integer supplier_id,Integer sect_id,Integer source_id,String gate_entry_no) {
		super();
		this.smpl_id = smpl_id;
		this.smpl_collected_dt = smpl_collected_dt;
		this.p_id = p_id;
		this.ctype_id = ctype_id;
		this.supplier_id = supplier_id;
		this.sect_id = sect_id;
		this.source_id = source_id;
		this.gate_entry_no = gate_entry_no;
		
	}

	public Smpl_collection(Integer smpl_id, String smpl_no, String flyash_range, String tga_batch_name, String lims_id,
			String created, String degree_of_calci, String ts_blaine, String ts_color, String ts_xrf,
			String ts_ctm_1day, String ts_ctm_3day, String ts_bcal, String pass_fail, String ts_ctm_7day,
			String ts_ctm_28day, String ts_lrcr_10day, String ts_lrcr_28day, String posted_to_Server,
			String gate_entry_no, String grn, Date smpl_casting_dt, Date smpl_collected_dt, Date blaine_test_datetime,
			Date colorindex_test_datetime, Date xrf_test_datetime, Date bombcal_test_datetime, Date tga_test_datetime,
			Date mb_test_datetime, Date mw1_test_datetime, Date mw2_test_datetime, Date airmwt1_test_datetime,
			Date airmwt2_test_datetime, Date airmwt3_test_datetime, Date psd_test_datetime, Date smpl_casting_dt_3,
			Date smpl_casting_dt_7, Date smpl_casting_dt_28, Date lrcr_smpl_casting_dt_10, Date lrcr_smpl_casting_dt_28,
			Date rack_dt, Date kft_test_datetime, Date at_test_datetime, Date fp_test_datetime, Date cba_test_datetime,
			Date grn_date, Double smpl_qty, Double smpl_breath, Double smpl_height, Double smpl_width, Double blaine,
			Double colorindex, Double caO, Double siO2, Double al2o3, Double fe2o3, Double mgO, Double sO3, Double k2o,
			Double na2o, Double cl, Double xrf_total, Double lSF, Double sM, Double aM, Double bombcal_gcv_gross,
			Double ti_o_2, Double p2_os, Double loi, Double p_sum, Double ir, Double r_fourtyfive, Double nc,
			Double le_chatellier, Double autoclave, Double setting_time_initial, Double setting_time_final, Double c3s,
			Double c2s, Double c3a, Double c4af, Double liquid, Double sulphur, Double fcao, Double tga_moisture_std,
			Double tga_volatile_std, Double tga_volatile_dry_std, Double tga_ash_std, Double tga_ash_dry_std,
			Double tga_fix_carbon_std, Double tga_fix_carbon_dry_std, Double ncv, Double hydrogen, Double mwt1,
			Double mwt2, Double mwt3, Double mb_value, Double airmwt1, Double airmwt2, Double airmwt3,
			Double total_moisture, Double airmb_value, Double manualcalculated_gcv, Double coal_sulphuradb,
			Double mn2o3, Double p2o5, Double tiO2, Double srO, Double psd_size5, Double psd_size10, Double psd_size20,
			Double psd_size30, Double psd_size40, Double psd_size45, Double psd_size50, Double quartz, Double xrf_sum,
			Double lc, Double lime, Double baO, Double na_Eq, Double lS, Double r_90, Double r_212, Double f_silica,
			Double r_60, Double r_45, Double r_30, Double r_20, Double r_10, Double r_3, Double avg_1d_kn,
			Double avg_1d_mpa, Double avg_3d_kn, Double avg_3d_mpa, Double avg_7d_kn, Double avg_7d_mpa,
			Double avg_28d_kn, Double avg_28d_mpa, Double aLKALI_SO3, Double sO3_ALKAI, Double eXCESS_SO3,
			Double c3s_C2S, Double aLKALI_AS_NA2O, Double hOR, Double mM, Double bF, Double pi_percentage,
			Double slag_percentage, Double drying_shrinkage, Double cement_temp, Double ni_bs,
			Double loss_on_ignition_kf, Double loss_on_ignition_hm, Double lightweight, Double psd_size3,
			Double psd_size90, Double psd_size60, Double ash_percentage, Double psd_bet_3and30, Double psd_above_212,
			Double psd_above_30, Double psd_above_45, Double psd_above_50, Double psd_above_90, Double psd_below_20,
			Double psd_below_5, Double lrcr_avg_10d_mpa, Double lrcr_avg_28d_mpa, Double blaine_time,
			Double ball_meal_so3, Double smpl_qty_received, Double moisture, Double volatile_moisture,
			Double inherient_moisture, Double free_moisture, Double gCV_Airdrybasis, Double gCV_Asreceivedbasis,
			Double asreceivedbasis_freemoisture, Double asreceivedbasis_totalmoisture,
			Double airdrybasis_inherientmoisture, Double airdrybasis_volatilemoisture, Double airdrybasis_ash,
			Double airdrybasis_sulphur, Double purity, Double carbon, Double nitrogen, Double r2o3, Double fluorine,
			Double at_cl, Double flashpoint, Double na2o3, Double cr2o3, Double chloride_content, Double co2,
			Integer p_id, Integer c_id, Integer ctype_id, Integer mst_region_id, Integer supplier_id,
			Integer createdby_user_id, Integer sect_id, Integer noof_cubes_1d, Integer noof_cubes_3d,
			Integer noof_cubes_7d, Integer noof_cubes_28d, Integer planned_brdays, Integer psd_id,
			Integer lrcr_avg_10d_kn, Integer lrcr_avg_28d_kn, Integer lrcr_noof_cubes_10d, Integer lrcr_noof_cubes_28d,
			Integer source_id, Integer rack_no, Integer doc_no, Integer smplreceived_time, Integer afr_smpl_id) {
		super();
		this.smpl_id = smpl_id;
		this.smpl_no = smpl_no;
		this.flyash_range = flyash_range;
		this.tga_batch_name = tga_batch_name;
		this.lims_id = lims_id;
		this.created = created;
		this.degree_of_calci = degree_of_calci;
		this.ts_blaine = ts_blaine;
		this.ts_color = ts_color;
		this.ts_xrf = ts_xrf;
		this.ts_ctm_1day = ts_ctm_1day;
		this.ts_ctm_3day = ts_ctm_3day;
		this.ts_bcal = ts_bcal;
		this.pass_fail = pass_fail;
		this.ts_ctm_7day = ts_ctm_7day;
		this.ts_ctm_28day = ts_ctm_28day;
		this.ts_lrcr_10day = ts_lrcr_10day;
		this.ts_lrcr_28day = ts_lrcr_28day;
		this.posted_to_Server = posted_to_Server;
		this.gate_entry_no = gate_entry_no;
		this.grn = grn;
		this.smpl_casting_dt = smpl_casting_dt;
		this.smpl_collected_dt = smpl_collected_dt;
		this.blaine_test_datetime = blaine_test_datetime;
		this.colorindex_test_datetime = colorindex_test_datetime;
		this.xrf_test_datetime = xrf_test_datetime;
		this.bombcal_test_datetime = bombcal_test_datetime;
		this.tga_test_datetime = tga_test_datetime;
		this.mb_test_datetime = mb_test_datetime;
		this.mw1_test_datetime = mw1_test_datetime;
		this.mw2_test_datetime = mw2_test_datetime;
		this.airmwt1_test_datetime = airmwt1_test_datetime;
		this.airmwt2_test_datetime = airmwt2_test_datetime;
		this.airmwt3_test_datetime = airmwt3_test_datetime;
		this.psd_test_datetime = psd_test_datetime;
		this.smpl_casting_dt_3 = smpl_casting_dt_3;
		this.smpl_casting_dt_7 = smpl_casting_dt_7;
		this.smpl_casting_dt_28 = smpl_casting_dt_28;
		this.lrcr_smpl_casting_dt_10 = lrcr_smpl_casting_dt_10;
		this.lrcr_smpl_casting_dt_28 = lrcr_smpl_casting_dt_28;
		this.rack_dt = rack_dt;
		this.kft_test_datetime = kft_test_datetime;
		this.at_test_datetime = at_test_datetime;
		this.fp_test_datetime = fp_test_datetime;
		this.cba_test_datetime = cba_test_datetime;
		this.grn_date = grn_date;
		this.smpl_qty = smpl_qty;
		this.smpl_breath = smpl_breath;
		this.smpl_height = smpl_height;
		this.smpl_width = smpl_width;
		this.blaine = blaine;
		this.colorindex = colorindex;
		CaO = caO;
		SiO2 = siO2;
		Al2O3 = al2o3;
		Fe2O3 = fe2o3;
		MgO = mgO;
		SO3 = sO3;
		K2O = k2o;
		Na2O = na2o;
		Cl = cl;
		this.xrf_total = xrf_total;
		LSF = lSF;
		SM = sM;
		AM = aM;
		this.bombcal_gcv_gross = bombcal_gcv_gross;
		this.ti_o_2 = ti_o_2;
		this.p2_os = p2_os;
		this.loi = loi;
		this.p_sum = p_sum;
		this.ir = ir;
		this.r_fourtyfive = r_fourtyfive;
		this.nc = nc;
		this.le_chatellier = le_chatellier;
		this.autoclave = autoclave;
		this.setting_time_initial = setting_time_initial;
		this.setting_time_final = setting_time_final;
		this.c3s = c3s;
		this.c2s = c2s;
		this.c3a = c3a;
		this.c4af = c4af;
		this.liquid = liquid;
		this.sulphur = sulphur;
		this.fcao = fcao;
		this.tga_moisture_std = tga_moisture_std;
		this.tga_volatile_std = tga_volatile_std;
		this.tga_volatile_dry_std = tga_volatile_dry_std;
		this.tga_ash_std = tga_ash_std;
		this.tga_ash_dry_std = tga_ash_dry_std;
		this.tga_fix_carbon_std = tga_fix_carbon_std;
		this.tga_fix_carbon_dry_std = tga_fix_carbon_dry_std;
		this.ncv = ncv;
		this.hydrogen = hydrogen;
		this.mwt1 = mwt1;
		this.mwt2 = mwt2;
		this.mwt3 = mwt3;
		this.mb_value = mb_value;
		this.airmwt1 = airmwt1;
		this.airmwt2 = airmwt2;
		this.airmwt3 = airmwt3;
		this.total_moisture = total_moisture;
		this.airmb_value = airmb_value;
		this.manualcalculated_gcv = manualcalculated_gcv;
		this.coal_sulphuradb = coal_sulphuradb;
		Mn2O3 = mn2o3;
		P2O5 = p2o5;
		TiO2 = tiO2;
		SrO = srO;
		this.psd_size5 = psd_size5;
		this.psd_size10 = psd_size10;
		this.psd_size20 = psd_size20;
		this.psd_size30 = psd_size30;
		this.psd_size40 = psd_size40;
		this.psd_size45 = psd_size45;
		this.psd_size50 = psd_size50;
		Quartz = quartz;
		this.xrf_sum = xrf_sum;
		this.lc = lc;
		this.lime = lime;
		BaO = baO;
		Na_Eq = na_Eq;
		LS = lS;
		this.r_90 = r_90;
		this.r_212 = r_212;
		this.f_silica = f_silica;
		this.r_60 = r_60;
		this.r_45 = r_45;
		this.r_30 = r_30;
		this.r_20 = r_20;
		this.r_10 = r_10;
		this.r_3 = r_3;
		this.avg_1d_kn = avg_1d_kn;
		this.avg_1d_mpa = avg_1d_mpa;
		this.avg_3d_kn = avg_3d_kn;
		this.avg_3d_mpa = avg_3d_mpa;
		this.avg_7d_kn = avg_7d_kn;
		this.avg_7d_mpa = avg_7d_mpa;
		this.avg_28d_kn = avg_28d_kn;
		this.avg_28d_mpa = avg_28d_mpa;
		ALKALI_SO3 = aLKALI_SO3;
		SO3_ALKAI = sO3_ALKAI;
		EXCESS_SO3 = eXCESS_SO3;
		C3S_C2S = c3s_C2S;
		ALKALI_AS_NA2O = aLKALI_AS_NA2O;
		HOR = hOR;
		MM = mM;
		BF = bF;
		this.pi_percentage = pi_percentage;
		this.slag_percentage = slag_percentage;
		this.drying_shrinkage = drying_shrinkage;
		this.cement_temp = cement_temp;
		this.ni_bs = ni_bs;
		this.loss_on_ignition_kf = loss_on_ignition_kf;
		this.loss_on_ignition_hm = loss_on_ignition_hm;
		this.lightweight = lightweight;
		this.psd_size3 = psd_size3;
		this.psd_size90 = psd_size90;
		this.psd_size60 = psd_size60;
		this.ash_percentage = ash_percentage;
		this.psd_bet_3and30 = psd_bet_3and30;
		this.psd_above_212 = psd_above_212;
		this.psd_above_30 = psd_above_30;
		this.psd_above_45 = psd_above_45;
		this.psd_above_50 = psd_above_50;
		this.psd_above_90 = psd_above_90;
		this.psd_below_20 = psd_below_20;
		this.psd_below_5 = psd_below_5;
		this.lrcr_avg_10d_mpa = lrcr_avg_10d_mpa;
		this.lrcr_avg_28d_mpa = lrcr_avg_28d_mpa;
		this.blaine_time = blaine_time;
		this.ball_meal_so3 = ball_meal_so3;
		this.smpl_qty_received = smpl_qty_received;
		this.moisture = moisture;
		this.volatile_moisture = volatile_moisture;
		this.inherient_moisture = inherient_moisture;
		this.free_moisture = free_moisture;
		GCV_Airdrybasis = gCV_Airdrybasis;
		GCV_Asreceivedbasis = gCV_Asreceivedbasis;
		this.asreceivedbasis_freemoisture = asreceivedbasis_freemoisture;
		this.asreceivedbasis_totalmoisture = asreceivedbasis_totalmoisture;
		this.airdrybasis_inherientmoisture = airdrybasis_inherientmoisture;
		this.airdrybasis_volatilemoisture = airdrybasis_volatilemoisture;
		this.airdrybasis_ash = airdrybasis_ash;
		this.airdrybasis_sulphur = airdrybasis_sulphur;
		this.purity = purity;
		this.carbon = carbon;
		this.nitrogen = nitrogen;
		this.r2o3 = r2o3;
		Fluorine = fluorine;
		this.at_cl = at_cl;
		this.flashpoint = flashpoint;
		this.na2o3 = na2o3;
		this.cr2o3 = cr2o3;
		Chloride_content = chloride_content;
		this.co2 = co2;
		this.p_id = p_id;
		this.c_id = c_id;
		this.ctype_id = ctype_id;
		this.mst_region_id = mst_region_id;
		this.supplier_id = supplier_id;
		this.createdby_user_id = createdby_user_id;
		this.sect_id = sect_id;
		this.noof_cubes_1d = noof_cubes_1d;
		this.noof_cubes_3d = noof_cubes_3d;
		this.noof_cubes_7d = noof_cubes_7d;
		this.noof_cubes_28d = noof_cubes_28d;
		this.planned_brdays = planned_brdays;
		this.psd_id = psd_id;
		this.lrcr_avg_10d_kn = lrcr_avg_10d_kn;
		this.lrcr_avg_28d_kn = lrcr_avg_28d_kn;
		this.lrcr_noof_cubes_10d = lrcr_noof_cubes_10d;
		this.lrcr_noof_cubes_28d = lrcr_noof_cubes_28d;
		this.source_id = source_id;
		this.rack_no = rack_no;
		this.doc_no = doc_no;
		this.smplreceived_time = smplreceived_time;
		this.afr_smpl_id = afr_smpl_id;
	}

	/**
	 * @return the smpl_id
	 */
	public Integer getSmpl_id() {
		return smpl_id;
	}

	/**
	 * @param smpl_id the smpl_id to set
	 */
	public void setSmpl_id(Integer smpl_id) {
		this.smpl_id = smpl_id;
	}

	/**
	 * @return the smpl_no
	 */
	public String getSmpl_no() {
		return smpl_no;
	}

	/**
	 * @param smpl_no the smpl_no to set
	 */
	public void setSmpl_no(String smpl_no) {
		this.smpl_no = smpl_no;
	}

	/**
	 * @return the flyash_range
	 */
	public String getFlyash_range() {
		return flyash_range;
	}

	/**
	 * @param flyash_range the flyash_range to set
	 */
	public void setFlyash_range(String flyash_range) {
		this.flyash_range = flyash_range;
	}

	/**
	 * @return the tga_batch_name
	 */
	public String getTga_batch_name() {
		return tga_batch_name;
	}

	/**
	 * @param tga_batch_name the tga_batch_name to set
	 */
	public void setTga_batch_name(String tga_batch_name) {
		this.tga_batch_name = tga_batch_name;
	}

	/**
	 * @return the lims_id
	 */
	public String getLims_id() {
		return lims_id;
	}

	/**
	 * @param lims_id the lims_id to set
	 */
	public void setLims_id(String lims_id) {
		this.lims_id = lims_id;
	}

	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * @return the degree_of_calci
	 */
	public String getDegree_of_calci() {
		return degree_of_calci;
	}

	/**
	 * @param degree_of_calci the degree_of_calci to set
	 */
	public void setDegree_of_calci(String degree_of_calci) {
		this.degree_of_calci = degree_of_calci;
	}

	/**
	 * @return the ts_blaine
	 */
	public String getTs_blaine() {
		return ts_blaine;
	}

	/**
	 * @param ts_blaine the ts_blaine to set
	 */
	public void setTs_blaine(String ts_blaine) {
		this.ts_blaine = ts_blaine;
	}

	/**
	 * @return the ts_color
	 */
	public String getTs_color() {
		return ts_color;
	}

	/**
	 * @param ts_color the ts_color to set
	 */
	public void setTs_color(String ts_color) {
		this.ts_color = ts_color;
	}

	/**
	 * @return the ts_xrf
	 */
	public String getTs_xrf() {
		return ts_xrf;
	}

	/**
	 * @param ts_xrf the ts_xrf to set
	 */
	public void setTs_xrf(String ts_xrf) {
		this.ts_xrf = ts_xrf;
	}

	/**
	 * @return the ts_ctm_1day
	 */
	public String getTs_ctm_1day() {
		return ts_ctm_1day;
	}

	/**
	 * @param ts_ctm_1day the ts_ctm_1day to set
	 */
	public void setTs_ctm_1day(String ts_ctm_1day) {
		this.ts_ctm_1day = ts_ctm_1day;
	}

	/**
	 * @return the ts_ctm_3day
	 */
	public String getTs_ctm_3day() {
		return ts_ctm_3day;
	}

	/**
	 * @param ts_ctm_3day the ts_ctm_3day to set
	 */
	public void setTs_ctm_3day(String ts_ctm_3day) {
		this.ts_ctm_3day = ts_ctm_3day;
	}

	/**
	 * @return the ts_bcal
	 */
	public String getTs_bcal() {
		return ts_bcal;
	}

	/**
	 * @param ts_bcal the ts_bcal to set
	 */
	public void setTs_bcal(String ts_bcal) {
		this.ts_bcal = ts_bcal;
	}

	/**
	 * @return the pass_fail
	 */
	public String getPass_fail() {
		return pass_fail;
	}

	/**
	 * @param pass_fail the pass_fail to set
	 */
	public void setPass_fail(String pass_fail) {
		this.pass_fail = pass_fail;
	}

	/**
	 * @return the ts_ctm_7day
	 */
	public String getTs_ctm_7day() {
		return ts_ctm_7day;
	}

	/**
	 * @param ts_ctm_7day the ts_ctm_7day to set
	 */
	public void setTs_ctm_7day(String ts_ctm_7day) {
		this.ts_ctm_7day = ts_ctm_7day;
	}

	/**
	 * @return the ts_ctm_28day
	 */
	public String getTs_ctm_28day() {
		return ts_ctm_28day;
	}

	/**
	 * @param ts_ctm_28day the ts_ctm_28day to set
	 */
	public void setTs_ctm_28day(String ts_ctm_28day) {
		this.ts_ctm_28day = ts_ctm_28day;
	}

	/**
	 * @return the ts_lrcr_10day
	 */
	public String getTs_lrcr_10day() {
		return ts_lrcr_10day;
	}

	/**
	 * @param ts_lrcr_10day the ts_lrcr_10day to set
	 */
	public void setTs_lrcr_10day(String ts_lrcr_10day) {
		this.ts_lrcr_10day = ts_lrcr_10day;
	}

	/**
	 * @return the ts_lrcr_28day
	 */
	public String getTs_lrcr_28day() {
		return ts_lrcr_28day;
	}

	/**
	 * @param ts_lrcr_28day the ts_lrcr_28day to set
	 */
	public void setTs_lrcr_28day(String ts_lrcr_28day) {
		this.ts_lrcr_28day = ts_lrcr_28day;
	}

	/**
	 * @return the posted_to_Server
	 */
	public String getPosted_to_Server() {
		return posted_to_Server;
	}

	/**
	 * @param posted_to_Server the posted_to_Server to set
	 */
	public void setPosted_to_Server(String posted_to_Server) {
		this.posted_to_Server = posted_to_Server;
	}

	/**
	 * @return the gate_entry_no
	 */
	public String getGate_entry_no() {
		return gate_entry_no;
	}

	/**
	 * @param gate_entry_no the gate_entry_no to set
	 */
	public void setGate_entry_no(String gate_entry_no) {
		this.gate_entry_no = gate_entry_no;
	}

	/**
	 * @return the grn
	 */
	public String getGrn() {
		return grn;
	}

	/**
	 * @param grn the grn to set
	 */
	public void setGrn(String grn) {
		this.grn = grn;
	}

	/**
	 * @return the smpl_casting_dt
	 */
	public Date getSmpl_casting_dt() {
		return smpl_casting_dt;
	}

	/**
	 * @param smpl_casting_dt the smpl_casting_dt to set
	 */
	public void setSmpl_casting_dt(Date smpl_casting_dt) {
		this.smpl_casting_dt = smpl_casting_dt;
	}

	/**
	 * @return the smpl_collected_dt
	 */
	public Date getSmpl_collected_dt() {
		return smpl_collected_dt;
	}

	/**
	 * @param smpl_collected_dt the smpl_collected_dt to set
	 */
	public void setSmpl_collected_dt(Date smpl_collected_dt) {
		this.smpl_collected_dt = smpl_collected_dt;
	}

	/**
	 * @return the blaine_test_datetime
	 */
	public Date getBlaine_test_datetime() {
		return blaine_test_datetime;
	}

	/**
	 * @param blaine_test_datetime the blaine_test_datetime to set
	 */
	public void setBlaine_test_datetime(Date blaine_test_datetime) {
		this.blaine_test_datetime = blaine_test_datetime;
	}

	/**
	 * @return the colorindex_test_datetime
	 */
	public Date getColorindex_test_datetime() {
		return colorindex_test_datetime;
	}

	/**
	 * @param colorindex_test_datetime the colorindex_test_datetime to set
	 */
	public void setColorindex_test_datetime(Date colorindex_test_datetime) {
		this.colorindex_test_datetime = colorindex_test_datetime;
	}

	/**
	 * @return the xrf_test_datetime
	 */
	public Date getXrf_test_datetime() {
		return xrf_test_datetime;
	}

	/**
	 * @param xrf_test_datetime the xrf_test_datetime to set
	 */
	public void setXrf_test_datetime(Date xrf_test_datetime) {
		this.xrf_test_datetime = xrf_test_datetime;
	}

	/**
	 * @return the bombcal_test_datetime
	 */
	public Date getBombcal_test_datetime() {
		return bombcal_test_datetime;
	}

	/**
	 * @param bombcal_test_datetime the bombcal_test_datetime to set
	 */
	public void setBombcal_test_datetime(Date bombcal_test_datetime) {
		this.bombcal_test_datetime = bombcal_test_datetime;
	}

	/**
	 * @return the tga_test_datetime
	 */
	public Date getTga_test_datetime() {
		return tga_test_datetime;
	}

	/**
	 * @param tga_test_datetime the tga_test_datetime to set
	 */
	public void setTga_test_datetime(Date tga_test_datetime) {
		this.tga_test_datetime = tga_test_datetime;
	}

	/**
	 * @return the mb_test_datetime
	 */
	public Date getMb_test_datetime() {
		return mb_test_datetime;
	}

	/**
	 * @param mb_test_datetime the mb_test_datetime to set
	 */
	public void setMb_test_datetime(Date mb_test_datetime) {
		this.mb_test_datetime = mb_test_datetime;
	}

	/**
	 * @return the mw1_test_datetime
	 */
	public Date getMw1_test_datetime() {
		return mw1_test_datetime;
	}

	/**
	 * @param mw1_test_datetime the mw1_test_datetime to set
	 */
	public void setMw1_test_datetime(Date mw1_test_datetime) {
		this.mw1_test_datetime = mw1_test_datetime;
	}

	/**
	 * @return the mw2_test_datetime
	 */
	public Date getMw2_test_datetime() {
		return mw2_test_datetime;
	}

	/**
	 * @param mw2_test_datetime the mw2_test_datetime to set
	 */
	public void setMw2_test_datetime(Date mw2_test_datetime) {
		this.mw2_test_datetime = mw2_test_datetime;
	}

	/**
	 * @return the airmwt1_test_datetime
	 */
	public Date getAirmwt1_test_datetime() {
		return airmwt1_test_datetime;
	}

	/**
	 * @param airmwt1_test_datetime the airmwt1_test_datetime to set
	 */
	public void setAirmwt1_test_datetime(Date airmwt1_test_datetime) {
		this.airmwt1_test_datetime = airmwt1_test_datetime;
	}

	/**
	 * @return the airmwt2_test_datetime
	 */
	public Date getAirmwt2_test_datetime() {
		return airmwt2_test_datetime;
	}

	/**
	 * @param airmwt2_test_datetime the airmwt2_test_datetime to set
	 */
	public void setAirmwt2_test_datetime(Date airmwt2_test_datetime) {
		this.airmwt2_test_datetime = airmwt2_test_datetime;
	}

	/**
	 * @return the airmwt3_test_datetime
	 */
	public Date getAirmwt3_test_datetime() {
		return airmwt3_test_datetime;
	}

	/**
	 * @param airmwt3_test_datetime the airmwt3_test_datetime to set
	 */
	public void setAirmwt3_test_datetime(Date airmwt3_test_datetime) {
		this.airmwt3_test_datetime = airmwt3_test_datetime;
	}

	/**
	 * @return the psd_test_datetime
	 */
	public Date getPsd_test_datetime() {
		return psd_test_datetime;
	}

	/**
	 * @param psd_test_datetime the psd_test_datetime to set
	 */
	public void setPsd_test_datetime(Date psd_test_datetime) {
		this.psd_test_datetime = psd_test_datetime;
	}

	/**
	 * @return the smpl_casting_dt_3
	 */
	public Date getSmpl_casting_dt_3() {
		return smpl_casting_dt_3;
	}

	/**
	 * @param smpl_casting_dt_3 the smpl_casting_dt_3 to set
	 */
	public void setSmpl_casting_dt_3(Date smpl_casting_dt_3) {
		this.smpl_casting_dt_3 = smpl_casting_dt_3;
	}

	/**
	 * @return the smpl_casting_dt_7
	 */
	public Date getSmpl_casting_dt_7() {
		return smpl_casting_dt_7;
	}

	/**
	 * @param smpl_casting_dt_7 the smpl_casting_dt_7 to set
	 */
	public void setSmpl_casting_dt_7(Date smpl_casting_dt_7) {
		this.smpl_casting_dt_7 = smpl_casting_dt_7;
	}

	/**
	 * @return the smpl_casting_dt_28
	 */
	public Date getSmpl_casting_dt_28() {
		return smpl_casting_dt_28;
	}

	/**
	 * @param smpl_casting_dt_28 the smpl_casting_dt_28 to set
	 */
	public void setSmpl_casting_dt_28(Date smpl_casting_dt_28) {
		this.smpl_casting_dt_28 = smpl_casting_dt_28;
	}

	/**
	 * @return the lrcr_smpl_casting_dt_10
	 */
	public Date getLrcr_smpl_casting_dt_10() {
		return lrcr_smpl_casting_dt_10;
	}

	/**
	 * @param lrcr_smpl_casting_dt_10 the lrcr_smpl_casting_dt_10 to set
	 */
	public void setLrcr_smpl_casting_dt_10(Date lrcr_smpl_casting_dt_10) {
		this.lrcr_smpl_casting_dt_10 = lrcr_smpl_casting_dt_10;
	}

	/**
	 * @return the lrcr_smpl_casting_dt_28
	 */
	public Date getLrcr_smpl_casting_dt_28() {
		return lrcr_smpl_casting_dt_28;
	}

	/**
	 * @param lrcr_smpl_casting_dt_28 the lrcr_smpl_casting_dt_28 to set
	 */
	public void setLrcr_smpl_casting_dt_28(Date lrcr_smpl_casting_dt_28) {
		this.lrcr_smpl_casting_dt_28 = lrcr_smpl_casting_dt_28;
	}

	/**
	 * @return the rack_dt
	 */
	public Date getRack_dt() {
		return rack_dt;
	}

	/**
	 * @param rack_dt the rack_dt to set
	 */
	public void setRack_dt(Date rack_dt) {
		this.rack_dt = rack_dt;
	}

	/**
	 * @return the kft_test_datetime
	 */
	public Date getKft_test_datetime() {
		return kft_test_datetime;
	}

	/**
	 * @param kft_test_datetime the kft_test_datetime to set
	 */
	public void setKft_test_datetime(Date kft_test_datetime) {
		this.kft_test_datetime = kft_test_datetime;
	}

	/**
	 * @return the at_test_datetime
	 */
	public Date getAt_test_datetime() {
		return at_test_datetime;
	}

	/**
	 * @param at_test_datetime the at_test_datetime to set
	 */
	public void setAt_test_datetime(Date at_test_datetime) {
		this.at_test_datetime = at_test_datetime;
	}

	/**
	 * @return the fp_test_datetime
	 */
	public Date getFp_test_datetime() {
		return fp_test_datetime;
	}

	/**
	 * @param fp_test_datetime the fp_test_datetime to set
	 */
	public void setFp_test_datetime(Date fp_test_datetime) {
		this.fp_test_datetime = fp_test_datetime;
	}

	/**
	 * @return the cba_test_datetime
	 */
	public Date getCba_test_datetime() {
		return cba_test_datetime;
	}

	/**
	 * @param cba_test_datetime the cba_test_datetime to set
	 */
	public void setCba_test_datetime(Date cba_test_datetime) {
		this.cba_test_datetime = cba_test_datetime;
	}

	/**
	 * @return the grn_date
	 */
	public Date getGrn_date() {
		return grn_date;
	}

	/**
	 * @param grn_date the grn_date to set
	 */
	public void setGrn_date(Date grn_date) {
		this.grn_date = grn_date;
	}

	/**
	 * @return the smpl_qty
	 */
	public Double getSmpl_qty() {
		return smpl_qty;
	}

	/**
	 * @param smpl_qty the smpl_qty to set
	 */
	public void setSmpl_qty(Double smpl_qty) {
		this.smpl_qty = smpl_qty;
	}

	/**
	 * @return the smpl_breath
	 */
	public Double getSmpl_breath() {
		return smpl_breath;
	}

	/**
	 * @param smpl_breath the smpl_breath to set
	 */
	public void setSmpl_breath(Double smpl_breath) {
		this.smpl_breath = smpl_breath;
	}

	/**
	 * @return the smpl_height
	 */
	public Double getSmpl_height() {
		return smpl_height;
	}

	/**
	 * @param smpl_height the smpl_height to set
	 */
	public void setSmpl_height(Double smpl_height) {
		this.smpl_height = smpl_height;
	}

	/**
	 * @return the smpl_width
	 */
	public Double getSmpl_width() {
		return smpl_width;
	}

	/**
	 * @param smpl_width the smpl_width to set
	 */
	public void setSmpl_width(Double smpl_width) {
		this.smpl_width = smpl_width;
	}

	/**
	 * @return the blaine
	 */
	public Double getBlaine() {
		return blaine;
	}

	/**
	 * @param blaine the blaine to set
	 */
	public void setBlaine(Double blaine) {
		this.blaine = blaine;
	}

	/**
	 * @return the colorindex
	 */
	public Double getColorindex() {
		return colorindex;
	}

	/**
	 * @param colorindex the colorindex to set
	 */
	public void setColorindex(Double colorindex) {
		this.colorindex = colorindex;
	}

	/**
	 * @return the caO
	 */
	public Double getCaO() {
		return CaO;
	}

	/**
	 * @param caO the caO to set
	 */
	public void setCaO(Double caO) {
		CaO = caO;
	}

	/**
	 * @return the siO2
	 */
	public Double getSiO2() {
		return SiO2;
	}

	/**
	 * @param siO2 the siO2 to set
	 */
	public void setSiO2(Double siO2) {
		SiO2 = siO2;
	}

	/**
	 * @return the al2O3
	 */
	public Double getAl2O3() {
		return Al2O3;
	}

	/**
	 * @param al2o3 the al2O3 to set
	 */
	public void setAl2O3(Double al2o3) {
		Al2O3 = al2o3;
	}

	/**
	 * @return the fe2O3
	 */
	public Double getFe2O3() {
		return Fe2O3;
	}

	/**
	 * @param fe2o3 the fe2O3 to set
	 */
	public void setFe2O3(Double fe2o3) {
		Fe2O3 = fe2o3;
	}

	/**
	 * @return the mgO
	 */
	public Double getMgO() {
		return MgO;
	}

	/**
	 * @param mgO the mgO to set
	 */
	public void setMgO(Double mgO) {
		MgO = mgO;
	}

	/**
	 * @return the sO3
	 */
	public Double getSO3() {
		return SO3;
	}

	/**
	 * @param sO3 the sO3 to set
	 */
	public void setSO3(Double sO3) {
		SO3 = sO3;
	}

	/**
	 * @return the k2O
	 */
	public Double getK2O() {
		return K2O;
	}

	/**
	 * @param k2o the k2O to set
	 */
	public void setK2O(Double k2o) {
		K2O = k2o;
	}

	/**
	 * @return the na2O
	 */
	public Double getNa2O() {
		return Na2O;
	}

	/**
	 * @param na2o the na2O to set
	 */
	public void setNa2O(Double na2o) {
		Na2O = na2o;
	}

	/**
	 * @return the cl
	 */
	public Double getCl() {
		return Cl;
	}

	/**
	 * @param cl the cl to set
	 */
	public void setCl(Double cl) {
		Cl = cl;
	}

	/**
	 * @return the xrf_total
	 */
	public Double getXrf_total() {
		return xrf_total;
	}

	/**
	 * @param xrf_total the xrf_total to set
	 */
	public void setXrf_total(Double xrf_total) {
		this.xrf_total = xrf_total;
	}

	/**
	 * @return the lSF
	 */
	public Double getLSF() {
		return LSF;
	}

	/**
	 * @param lSF the lSF to set
	 */
	public void setLSF(Double lSF) {
		LSF = lSF;
	}

	/**
	 * @return the sM
	 */
	public Double getSM() {
		return SM;
	}

	/**
	 * @param sM the sM to set
	 */
	public void setSM(Double sM) {
		SM = sM;
	}

	/**
	 * @return the aM
	 */
	public Double getAM() {
		return AM;
	}

	/**
	 * @param aM the aM to set
	 */
	public void setAM(Double aM) {
		AM = aM;
	}

	/**
	 * @return the bombcal_gcv_gross
	 */
	public Double getBombcal_gcv_gross() {
		return bombcal_gcv_gross;
	}

	/**
	 * @param bombcal_gcv_gross the bombcal_gcv_gross to set
	 */
	public void setBombcal_gcv_gross(Double bombcal_gcv_gross) {
		this.bombcal_gcv_gross = bombcal_gcv_gross;
	}

	/**
	 * @return the ti_o_2
	 */
	public Double getTi_o_2() {
		return ti_o_2;
	}

	/**
	 * @param ti_o_2 the ti_o_2 to set
	 */
	public void setTi_o_2(Double ti_o_2) {
		this.ti_o_2 = ti_o_2;
	}

	/**
	 * @return the p2_os
	 */
	public Double getP2_os() {
		return p2_os;
	}

	/**
	 * @param p2_os the p2_os to set
	 */
	public void setP2_os(Double p2_os) {
		this.p2_os = p2_os;
	}

	/**
	 * @return the loi
	 */
	public Double getLoi() {
		return loi;
	}

	/**
	 * @param loi the loi to set
	 */
	public void setLoi(Double loi) {
		this.loi = loi;
	}

	/**
	 * @return the p_sum
	 */
	public Double getP_sum() {
		return p_sum;
	}

	/**
	 * @param p_sum the p_sum to set
	 */
	public void setP_sum(Double p_sum) {
		this.p_sum = p_sum;
	}

	/**
	 * @return the ir
	 */
	public Double getIr() {
		return ir;
	}

	/**
	 * @param ir the ir to set
	 */
	public void setIr(Double ir) {
		this.ir = ir;
	}

	/**
	 * @return the r_fourtyfive
	 */
	public Double getR_fourtyfive() {
		return r_fourtyfive;
	}

	/**
	 * @param r_fourtyfive the r_fourtyfive to set
	 */
	public void setR_fourtyfive(Double r_fourtyfive) {
		this.r_fourtyfive = r_fourtyfive;
	}

	/**
	 * @return the nc
	 */
	public Double getNc() {
		return nc;
	}

	/**
	 * @param nc the nc to set
	 */
	public void setNc(Double nc) {
		this.nc = nc;
	}

	/**
	 * @return the le_chatellier
	 */
	public Double getLe_chatellier() {
		return le_chatellier;
	}

	/**
	 * @param le_chatellier the le_chatellier to set
	 */
	public void setLe_chatellier(Double le_chatellier) {
		this.le_chatellier = le_chatellier;
	}

	/**
	 * @return the autoclave
	 */
	public Double getAutoclave() {
		return autoclave;
	}

	/**
	 * @param autoclave the autoclave to set
	 */
	public void setAutoclave(Double autoclave) {
		this.autoclave = autoclave;
	}

	/**
	 * @return the setting_time_initial
	 */
	public Double getSetting_time_initial() {
		return setting_time_initial;
	}

	/**
	 * @param setting_time_initial the setting_time_initial to set
	 */
	public void setSetting_time_initial(Double setting_time_initial) {
		this.setting_time_initial = setting_time_initial;
	}

	/**
	 * @return the setting_time_final
	 */
	public Double getSetting_time_final() {
		return setting_time_final;
	}

	/**
	 * @param setting_time_final the setting_time_final to set
	 */
	public void setSetting_time_final(Double setting_time_final) {
		this.setting_time_final = setting_time_final;
	}

	/**
	 * @return the c3s
	 */
	public Double getC3s() {
		return c3s;
	}

	/**
	 * @param c3s the c3s to set
	 */
	public void setC3s(Double c3s) {
		this.c3s = c3s;
	}

	/**
	 * @return the c2s
	 */
	public Double getC2s() {
		return c2s;
	}

	/**
	 * @param c2s the c2s to set
	 */
	public void setC2s(Double c2s) {
		this.c2s = c2s;
	}

	/**
	 * @return the c3a
	 */
	public Double getC3a() {
		return c3a;
	}

	/**
	 * @param c3a the c3a to set
	 */
	public void setC3a(Double c3a) {
		this.c3a = c3a;
	}

	/**
	 * @return the c4af
	 */
	public Double getC4af() {
		return c4af;
	}

	/**
	 * @param c4af the c4af to set
	 */
	public void setC4af(Double c4af) {
		this.c4af = c4af;
	}

	/**
	 * @return the liquid
	 */
	public Double getLiquid() {
		return liquid;
	}

	/**
	 * @param liquid the liquid to set
	 */
	public void setLiquid(Double liquid) {
		this.liquid = liquid;
	}

	/**
	 * @return the sulphur
	 */
	public Double getSulphur() {
		return sulphur;
	}

	/**
	 * @param sulphur the sulphur to set
	 */
	public void setSulphur(Double sulphur) {
		this.sulphur = sulphur;
	}

	/**
	 * @return the fcao
	 */
	public Double getFcao() {
		return fcao;
	}

	/**
	 * @param fcao the fcao to set
	 */
	public void setFcao(Double fcao) {
		this.fcao = fcao;
	}

	/**
	 * @return the tga_moisture_std
	 */
	public Double getTga_moisture_std() {
		return tga_moisture_std;
	}

	/**
	 * @param tga_moisture_std the tga_moisture_std to set
	 */
	public void setTga_moisture_std(Double tga_moisture_std) {
		this.tga_moisture_std = tga_moisture_std;
	}

	/**
	 * @return the tga_volatile_std
	 */
	public Double getTga_volatile_std() {
		return tga_volatile_std;
	}

	/**
	 * @param tga_volatile_std the tga_volatile_std to set
	 */
	public void setTga_volatile_std(Double tga_volatile_std) {
		this.tga_volatile_std = tga_volatile_std;
	}

	/**
	 * @return the tga_volatile_dry_std
	 */
	public Double getTga_volatile_dry_std() {
		return tga_volatile_dry_std;
	}

	/**
	 * @param tga_volatile_dry_std the tga_volatile_dry_std to set
	 */
	public void setTga_volatile_dry_std(Double tga_volatile_dry_std) {
		this.tga_volatile_dry_std = tga_volatile_dry_std;
	}

	/**
	 * @return the tga_ash_std
	 */
	public Double getTga_ash_std() {
		return tga_ash_std;
	}

	/**
	 * @param tga_ash_std the tga_ash_std to set
	 */
	public void setTga_ash_std(Double tga_ash_std) {
		this.tga_ash_std = tga_ash_std;
	}

	/**
	 * @return the tga_ash_dry_std
	 */
	public Double getTga_ash_dry_std() {
		return tga_ash_dry_std;
	}

	/**
	 * @param tga_ash_dry_std the tga_ash_dry_std to set
	 */
	public void setTga_ash_dry_std(Double tga_ash_dry_std) {
		this.tga_ash_dry_std = tga_ash_dry_std;
	}

	/**
	 * @return the tga_fix_carbon_std
	 */
	public Double getTga_fix_carbon_std() {
		return tga_fix_carbon_std;
	}

	/**
	 * @param tga_fix_carbon_std the tga_fix_carbon_std to set
	 */
	public void setTga_fix_carbon_std(Double tga_fix_carbon_std) {
		this.tga_fix_carbon_std = tga_fix_carbon_std;
	}

	/**
	 * @return the tga_fix_carbon_dry_std
	 */
	public Double getTga_fix_carbon_dry_std() {
		return tga_fix_carbon_dry_std;
	}

	/**
	 * @param tga_fix_carbon_dry_std the tga_fix_carbon_dry_std to set
	 */
	public void setTga_fix_carbon_dry_std(Double tga_fix_carbon_dry_std) {
		this.tga_fix_carbon_dry_std = tga_fix_carbon_dry_std;
	}

	/**
	 * @return the ncv
	 */
	public Double getNcv() {
		return ncv;
	}

	/**
	 * @param ncv the ncv to set
	 */
	public void setNcv(Double ncv) {
		this.ncv = ncv;
	}

	/**
	 * @return the hydrogen
	 */
	public Double getHydrogen() {
		return hydrogen;
	}

	/**
	 * @param hydrogen the hydrogen to set
	 */
	public void setHydrogen(Double hydrogen) {
		this.hydrogen = hydrogen;
	}

	/**
	 * @return the mwt1
	 */
	public Double getMwt1() {
		return mwt1;
	}

	/**
	 * @param mwt1 the mwt1 to set
	 */
	public void setMwt1(Double mwt1) {
		this.mwt1 = mwt1;
	}

	/**
	 * @return the mwt2
	 */
	public Double getMwt2() {
		return mwt2;
	}

	/**
	 * @param mwt2 the mwt2 to set
	 */
	public void setMwt2(Double mwt2) {
		this.mwt2 = mwt2;
	}

	/**
	 * @return the mwt3
	 */
	public Double getMwt3() {
		return mwt3;
	}

	/**
	 * @param mwt3 the mwt3 to set
	 */
	public void setMwt3(Double mwt3) {
		this.mwt3 = mwt3;
	}

	/**
	 * @return the mb_value
	 */
	public Double getMb_value() {
		return mb_value;
	}

	/**
	 * @param mb_value the mb_value to set
	 */
	public void setMb_value(Double mb_value) {
		this.mb_value = mb_value;
	}

	/**
	 * @return the airmwt1
	 */
	public Double getAirmwt1() {
		return airmwt1;
	}

	/**
	 * @param airmwt1 the airmwt1 to set
	 */
	public void setAirmwt1(Double airmwt1) {
		this.airmwt1 = airmwt1;
	}

	/**
	 * @return the airmwt2
	 */
	public Double getAirmwt2() {
		return airmwt2;
	}

	/**
	 * @param airmwt2 the airmwt2 to set
	 */
	public void setAirmwt2(Double airmwt2) {
		this.airmwt2 = airmwt2;
	}

	/**
	 * @return the airmwt3
	 */
	public Double getAirmwt3() {
		return airmwt3;
	}

	/**
	 * @param airmwt3 the airmwt3 to set
	 */
	public void setAirmwt3(Double airmwt3) {
		this.airmwt3 = airmwt3;
	}

	/**
	 * @return the total_moisture
	 */
	public Double getTotal_moisture() {
		return total_moisture;
	}

	/**
	 * @param total_moisture the total_moisture to set
	 */
	public void setTotal_moisture(Double total_moisture) {
		this.total_moisture = total_moisture;
	}

	/**
	 * @return the airmb_value
	 */
	public Double getAirmb_value() {
		return airmb_value;
	}

	/**
	 * @param airmb_value the airmb_value to set
	 */
	public void setAirmb_value(Double airmb_value) {
		this.airmb_value = airmb_value;
	}

	/**
	 * @return the manualcalculated_gcv
	 */
	public Double getManualcalculated_gcv() {
		return manualcalculated_gcv;
	}

	/**
	 * @param manualcalculated_gcv the manualcalculated_gcv to set
	 */
	public void setManualcalculated_gcv(Double manualcalculated_gcv) {
		this.manualcalculated_gcv = manualcalculated_gcv;
	}

	/**
	 * @return the coal_sulphuradb
	 */
	public Double getCoal_sulphuradb() {
		return coal_sulphuradb;
	}

	/**
	 * @param coal_sulphuradb the coal_sulphuradb to set
	 */
	public void setCoal_sulphuradb(Double coal_sulphuradb) {
		this.coal_sulphuradb = coal_sulphuradb;
	}

	/**
	 * @return the mn2O3
	 */
	public Double getMn2O3() {
		return Mn2O3;
	}

	/**
	 * @param mn2o3 the mn2O3 to set
	 */
	public void setMn2O3(Double mn2o3) {
		Mn2O3 = mn2o3;
	}

	/**
	 * @return the p2O5
	 */
	public Double getP2O5() {
		return P2O5;
	}

	/**
	 * @param p2o5 the p2O5 to set
	 */
	public void setP2O5(Double p2o5) {
		P2O5 = p2o5;
	}

	/**
	 * @return the tiO2
	 */
	public Double getTiO2() {
		return TiO2;
	}

	/**
	 * @param tiO2 the tiO2 to set
	 */
	public void setTiO2(Double tiO2) {
		TiO2 = tiO2;
	}

	/**
	 * @return the srO
	 */
	public Double getSrO() {
		return SrO;
	}

	/**
	 * @param srO the srO to set
	 */
	public void setSrO(Double srO) {
		SrO = srO;
	}

	/**
	 * @return the psd_size5
	 */
	public Double getPsd_size5() {
		return psd_size5;
	}

	/**
	 * @param psd_size5 the psd_size5 to set
	 */
	public void setPsd_size5(Double psd_size5) {
		this.psd_size5 = psd_size5;
	}

	/**
	 * @return the psd_size10
	 */
	public Double getPsd_size10() {
		return psd_size10;
	}

	/**
	 * @param psd_size10 the psd_size10 to set
	 */
	public void setPsd_size10(Double psd_size10) {
		this.psd_size10 = psd_size10;
	}

	/**
	 * @return the psd_size20
	 */
	public Double getPsd_size20() {
		return psd_size20;
	}

	/**
	 * @param psd_size20 the psd_size20 to set
	 */
	public void setPsd_size20(Double psd_size20) {
		this.psd_size20 = psd_size20;
	}

	/**
	 * @return the psd_size30
	 */
	public Double getPsd_size30() {
		return psd_size30;
	}

	/**
	 * @param psd_size30 the psd_size30 to set
	 */
	public void setPsd_size30(Double psd_size30) {
		this.psd_size30 = psd_size30;
	}

	/**
	 * @return the psd_size40
	 */
	public Double getPsd_size40() {
		return psd_size40;
	}

	/**
	 * @param psd_size40 the psd_size40 to set
	 */
	public void setPsd_size40(Double psd_size40) {
		this.psd_size40 = psd_size40;
	}

	/**
	 * @return the psd_size45
	 */
	public Double getPsd_size45() {
		return psd_size45;
	}

	/**
	 * @param psd_size45 the psd_size45 to set
	 */
	public void setPsd_size45(Double psd_size45) {
		this.psd_size45 = psd_size45;
	}

	/**
	 * @return the psd_size50
	 */
	public Double getPsd_size50() {
		return psd_size50;
	}

	/**
	 * @param psd_size50 the psd_size50 to set
	 */
	public void setPsd_size50(Double psd_size50) {
		this.psd_size50 = psd_size50;
	}

	/**
	 * @return the quartz
	 */
	public Double getQuartz() {
		return Quartz;
	}

	/**
	 * @param quartz the quartz to set
	 */
	public void setQuartz(Double quartz) {
		Quartz = quartz;
	}

	/**
	 * @return the xrf_sum
	 */
	public Double getXrf_sum() {
		return xrf_sum;
	}

	/**
	 * @param xrf_sum the xrf_sum to set
	 */
	public void setXrf_sum(Double xrf_sum) {
		this.xrf_sum = xrf_sum;
	}

	/**
	 * @return the lc
	 */
	public Double getLc() {
		return lc;
	}

	/**
	 * @param lc the lc to set
	 */
	public void setLc(Double lc) {
		this.lc = lc;
	}

	/**
	 * @return the lime
	 */
	public Double getLime() {
		return lime;
	}

	/**
	 * @param lime the lime to set
	 */
	public void setLime(Double lime) {
		this.lime = lime;
	}

	/**
	 * @return the baO
	 */
	public Double getBaO() {
		return BaO;
	}

	/**
	 * @param baO the baO to set
	 */
	public void setBaO(Double baO) {
		BaO = baO;
	}

	/**
	 * @return the na_Eq
	 */
	public Double getNa_Eq() {
		return Na_Eq;
	}

	/**
	 * @param na_Eq the na_Eq to set
	 */
	public void setNa_Eq(Double na_Eq) {
		Na_Eq = na_Eq;
	}

	/**
	 * @return the lS
	 */
	public Double getLS() {
		return LS;
	}

	/**
	 * @param lS the lS to set
	 */
	public void setLS(Double lS) {
		LS = lS;
	}

	/**
	 * @return the r_90
	 */
	public Double getR_90() {
		return r_90;
	}

	/**
	 * @param r_90 the r_90 to set
	 */
	public void setR_90(Double r_90) {
		this.r_90 = r_90;
	}

	/**
	 * @return the r_212
	 */
	public Double getR_212() {
		return r_212;
	}

	/**
	 * @param r_212 the r_212 to set
	 */
	public void setR_212(Double r_212) {
		this.r_212 = r_212;
	}

	/**
	 * @return the f_silica
	 */
	public Double getF_silica() {
		return f_silica;
	}

	/**
	 * @param f_silica the f_silica to set
	 */
	public void setF_silica(Double f_silica) {
		this.f_silica = f_silica;
	}

	/**
	 * @return the r_60
	 */
	public Double getR_60() {
		return r_60;
	}

	/**
	 * @param r_60 the r_60 to set
	 */
	public void setR_60(Double r_60) {
		this.r_60 = r_60;
	}

	/**
	 * @return the r_45
	 */
	public Double getR_45() {
		return r_45;
	}

	/**
	 * @param r_45 the r_45 to set
	 */
	public void setR_45(Double r_45) {
		this.r_45 = r_45;
	}

	/**
	 * @return the r_30
	 */
	public Double getR_30() {
		return r_30;
	}

	/**
	 * @param r_30 the r_30 to set
	 */
	public void setR_30(Double r_30) {
		this.r_30 = r_30;
	}

	/**
	 * @return the r_20
	 */
	public Double getR_20() {
		return r_20;
	}

	/**
	 * @param r_20 the r_20 to set
	 */
	public void setR_20(Double r_20) {
		this.r_20 = r_20;
	}

	/**
	 * @return the r_10
	 */
	public Double getR_10() {
		return r_10;
	}

	/**
	 * @param r_10 the r_10 to set
	 */
	public void setR_10(Double r_10) {
		this.r_10 = r_10;
	}

	/**
	 * @return the r_3
	 */
	public Double getR_3() {
		return r_3;
	}

	/**
	 * @param r_3 the r_3 to set
	 */
	public void setR_3(Double r_3) {
		this.r_3 = r_3;
	}

	/**
	 * @return the avg_1d_kn
	 */
	public Double getAvg_1d_kn() {
		return avg_1d_kn;
	}

	/**
	 * @param avg_1d_kn the avg_1d_kn to set
	 */
	public void setAvg_1d_kn(Double avg_1d_kn) {
		this.avg_1d_kn = avg_1d_kn;
	}

	/**
	 * @return the avg_1d_mpa
	 */
	public Double getAvg_1d_mpa() {
		return avg_1d_mpa;
	}

	/**
	 * @param avg_1d_mpa the avg_1d_mpa to set
	 */
	public void setAvg_1d_mpa(Double avg_1d_mpa) {
		this.avg_1d_mpa = avg_1d_mpa;
	}

	/**
	 * @return the avg_3d_kn
	 */
	public Double getAvg_3d_kn() {
		return avg_3d_kn;
	}

	/**
	 * @param avg_3d_kn the avg_3d_kn to set
	 */
	public void setAvg_3d_kn(Double avg_3d_kn) {
		this.avg_3d_kn = avg_3d_kn;
	}

	/**
	 * @return the avg_3d_mpa
	 */
	public Double getAvg_3d_mpa() {
		return avg_3d_mpa;
	}

	/**
	 * @param avg_3d_mpa the avg_3d_mpa to set
	 */
	public void setAvg_3d_mpa(Double avg_3d_mpa) {
		this.avg_3d_mpa = avg_3d_mpa;
	}

	/**
	 * @return the avg_7d_kn
	 */
	public Double getAvg_7d_kn() {
		return avg_7d_kn;
	}

	/**
	 * @param avg_7d_kn the avg_7d_kn to set
	 */
	public void setAvg_7d_kn(Double avg_7d_kn) {
		this.avg_7d_kn = avg_7d_kn;
	}

	/**
	 * @return the avg_7d_mpa
	 */
	public Double getAvg_7d_mpa() {
		return avg_7d_mpa;
	}

	/**
	 * @param avg_7d_mpa the avg_7d_mpa to set
	 */
	public void setAvg_7d_mpa(Double avg_7d_mpa) {
		this.avg_7d_mpa = avg_7d_mpa;
	}

	/**
	 * @return the avg_28d_kn
	 */
	public Double getAvg_28d_kn() {
		return avg_28d_kn;
	}

	/**
	 * @param avg_28d_kn the avg_28d_kn to set
	 */
	public void setAvg_28d_kn(Double avg_28d_kn) {
		this.avg_28d_kn = avg_28d_kn;
	}

	/**
	 * @return the avg_28d_mpa
	 */
	public Double getAvg_28d_mpa() {
		return avg_28d_mpa;
	}

	/**
	 * @param avg_28d_mpa the avg_28d_mpa to set
	 */
	public void setAvg_28d_mpa(Double avg_28d_mpa) {
		this.avg_28d_mpa = avg_28d_mpa;
	}

	/**
	 * @return the aLKALI_SO3
	 */
	public Double getALKALI_SO3() {
		return ALKALI_SO3;
	}

	/**
	 * @param aLKALI_SO3 the aLKALI_SO3 to set
	 */
	public void setALKALI_SO3(Double aLKALI_SO3) {
		ALKALI_SO3 = aLKALI_SO3;
	}

	/**
	 * @return the sO3_ALKAI
	 */
	public Double getSO3_ALKAI() {
		return SO3_ALKAI;
	}

	/**
	 * @param sO3_ALKAI the sO3_ALKAI to set
	 */
	public void setSO3_ALKAI(Double sO3_ALKAI) {
		SO3_ALKAI = sO3_ALKAI;
	}

	/**
	 * @return the eXCESS_SO3
	 */
	public Double getEXCESS_SO3() {
		return EXCESS_SO3;
	}

	/**
	 * @param eXCESS_SO3 the eXCESS_SO3 to set
	 */
	public void setEXCESS_SO3(Double eXCESS_SO3) {
		EXCESS_SO3 = eXCESS_SO3;
	}

	/**
	 * @return the c3S_C2S
	 */
	public Double getC3S_C2S() {
		return C3S_C2S;
	}

	/**
	 * @param c3s_C2S the c3S_C2S to set
	 */
	public void setC3S_C2S(Double c3s_C2S) {
		C3S_C2S = c3s_C2S;
	}

	/**
	 * @return the aLKALI_AS_NA2O
	 */
	public Double getALKALI_AS_NA2O() {
		return ALKALI_AS_NA2O;
	}

	/**
	 * @param aLKALI_AS_NA2O the aLKALI_AS_NA2O to set
	 */
	public void setALKALI_AS_NA2O(Double aLKALI_AS_NA2O) {
		ALKALI_AS_NA2O = aLKALI_AS_NA2O;
	}

	/**
	 * @return the hOR
	 */
	public Double getHOR() {
		return HOR;
	}

	/**
	 * @param hOR the hOR to set
	 */
	public void setHOR(Double hOR) {
		HOR = hOR;
	}

	/**
	 * @return the mM
	 */
	public Double getMM() {
		return MM;
	}

	/**
	 * @param mM the mM to set
	 */
	public void setMM(Double mM) {
		MM = mM;
	}

	/**
	 * @return the bF
	 */
	public Double getBF() {
		return BF;
	}

	/**
	 * @param bF the bF to set
	 */
	public void setBF(Double bF) {
		BF = bF;
	}

	/**
	 * @return the pi_percentage
	 */
	public Double getPi_percentage() {
		return pi_percentage;
	}

	/**
	 * @param pi_percentage the pi_percentage to set
	 */
	public void setPi_percentage(Double pi_percentage) {
		this.pi_percentage = pi_percentage;
	}

	/**
	 * @return the slag_percentage
	 */
	public Double getSlag_percentage() {
		return slag_percentage;
	}

	/**
	 * @param slag_percentage the slag_percentage to set
	 */
	public void setSlag_percentage(Double slag_percentage) {
		this.slag_percentage = slag_percentage;
	}

	/**
	 * @return the drying_shrinkage
	 */
	public Double getDrying_shrinkage() {
		return drying_shrinkage;
	}

	/**
	 * @param drying_shrinkage the drying_shrinkage to set
	 */
	public void setDrying_shrinkage(Double drying_shrinkage) {
		this.drying_shrinkage = drying_shrinkage;
	}

	/**
	 * @return the cement_temp
	 */
	public Double getCement_temp() {
		return cement_temp;
	}

	/**
	 * @param cement_temp the cement_temp to set
	 */
	public void setCement_temp(Double cement_temp) {
		this.cement_temp = cement_temp;
	}

	/**
	 * @return the ni_bs
	 */
	public Double getNi_bs() {
		return ni_bs;
	}

	/**
	 * @param ni_bs the ni_bs to set
	 */
	public void setNi_bs(Double ni_bs) {
		this.ni_bs = ni_bs;
	}

	/**
	 * @return the loss_on_ignition_kf
	 */
	public Double getLoss_on_ignition_kf() {
		return loss_on_ignition_kf;
	}

	/**
	 * @param loss_on_ignition_kf the loss_on_ignition_kf to set
	 */
	public void setLoss_on_ignition_kf(Double loss_on_ignition_kf) {
		this.loss_on_ignition_kf = loss_on_ignition_kf;
	}

	/**
	 * @return the loss_on_ignition_hm
	 */
	public Double getLoss_on_ignition_hm() {
		return loss_on_ignition_hm;
	}

	/**
	 * @param loss_on_ignition_hm the loss_on_ignition_hm to set
	 */
	public void setLoss_on_ignition_hm(Double loss_on_ignition_hm) {
		this.loss_on_ignition_hm = loss_on_ignition_hm;
	}

	/**
	 * @return the lightweight
	 */
	public Double getLightweight() {
		return lightweight;
	}

	/**
	 * @param lightweight the lightweight to set
	 */
	public void setLightweight(Double lightweight) {
		this.lightweight = lightweight;
	}

	/**
	 * @return the psd_size3
	 */
	public Double getPsd_size3() {
		return psd_size3;
	}

	/**
	 * @param psd_size3 the psd_size3 to set
	 */
	public void setPsd_size3(Double psd_size3) {
		this.psd_size3 = psd_size3;
	}

	/**
	 * @return the psd_size90
	 */
	public Double getPsd_size90() {
		return psd_size90;
	}

	/**
	 * @param psd_size90 the psd_size90 to set
	 */
	public void setPsd_size90(Double psd_size90) {
		this.psd_size90 = psd_size90;
	}

	/**
	 * @return the psd_size60
	 */
	public Double getPsd_size60() {
		return psd_size60;
	}

	/**
	 * @param psd_size60 the psd_size60 to set
	 */
	public void setPsd_size60(Double psd_size60) {
		this.psd_size60 = psd_size60;
	}

	/**
	 * @return the ash_percentage
	 */
	public Double getAsh_percentage() {
		return ash_percentage;
	}

	/**
	 * @param ash_percentage the ash_percentage to set
	 */
	public void setAsh_percentage(Double ash_percentage) {
		this.ash_percentage = ash_percentage;
	}

	/**
	 * @return the psd_bet_3and30
	 */
	public Double getPsd_bet_3and30() {
		return psd_bet_3and30;
	}

	/**
	 * @param psd_bet_3and30 the psd_bet_3and30 to set
	 */
	public void setPsd_bet_3and30(Double psd_bet_3and30) {
		this.psd_bet_3and30 = psd_bet_3and30;
	}

	/**
	 * @return the psd_above_212
	 */
	public Double getPsd_above_212() {
		return psd_above_212;
	}

	/**
	 * @param psd_above_212 the psd_above_212 to set
	 */
	public void setPsd_above_212(Double psd_above_212) {
		this.psd_above_212 = psd_above_212;
	}

	/**
	 * @return the psd_above_30
	 */
	public Double getPsd_above_30() {
		return psd_above_30;
	}

	/**
	 * @param psd_above_30 the psd_above_30 to set
	 */
	public void setPsd_above_30(Double psd_above_30) {
		this.psd_above_30 = psd_above_30;
	}

	/**
	 * @return the psd_above_45
	 */
	public Double getPsd_above_45() {
		return psd_above_45;
	}

	/**
	 * @param psd_above_45 the psd_above_45 to set
	 */
	public void setPsd_above_45(Double psd_above_45) {
		this.psd_above_45 = psd_above_45;
	}

	/**
	 * @return the psd_above_50
	 */
	public Double getPsd_above_50() {
		return psd_above_50;
	}

	/**
	 * @param psd_above_50 the psd_above_50 to set
	 */
	public void setPsd_above_50(Double psd_above_50) {
		this.psd_above_50 = psd_above_50;
	}

	/**
	 * @return the psd_above_90
	 */
	public Double getPsd_above_90() {
		return psd_above_90;
	}

	/**
	 * @param psd_above_90 the psd_above_90 to set
	 */
	public void setPsd_above_90(Double psd_above_90) {
		this.psd_above_90 = psd_above_90;
	}

	/**
	 * @return the psd_below_20
	 */
	public Double getPsd_below_20() {
		return psd_below_20;
	}

	/**
	 * @param psd_below_20 the psd_below_20 to set
	 */
	public void setPsd_below_20(Double psd_below_20) {
		this.psd_below_20 = psd_below_20;
	}

	/**
	 * @return the psd_below_5
	 */
	public Double getPsd_below_5() {
		return psd_below_5;
	}

	/**
	 * @param psd_below_5 the psd_below_5 to set
	 */
	public void setPsd_below_5(Double psd_below_5) {
		this.psd_below_5 = psd_below_5;
	}

	/**
	 * @return the lrcr_avg_10d_mpa
	 */
	public Double getLrcr_avg_10d_mpa() {
		return lrcr_avg_10d_mpa;
	}

	/**
	 * @param lrcr_avg_10d_mpa the lrcr_avg_10d_mpa to set
	 */
	public void setLrcr_avg_10d_mpa(Double lrcr_avg_10d_mpa) {
		this.lrcr_avg_10d_mpa = lrcr_avg_10d_mpa;
	}

	/**
	 * @return the lrcr_avg_28d_mpa
	 */
	public Double getLrcr_avg_28d_mpa() {
		return lrcr_avg_28d_mpa;
	}

	/**
	 * @param lrcr_avg_28d_mpa the lrcr_avg_28d_mpa to set
	 */
	public void setLrcr_avg_28d_mpa(Double lrcr_avg_28d_mpa) {
		this.lrcr_avg_28d_mpa = lrcr_avg_28d_mpa;
	}

	/**
	 * @return the blaine_time
	 */
	public Double getBlaine_time() {
		return blaine_time;
	}

	/**
	 * @param blaine_time the blaine_time to set
	 */
	public void setBlaine_time(Double blaine_time) {
		this.blaine_time = blaine_time;
	}

	/**
	 * @return the ball_meal_so3
	 */
	public Double getBall_meal_so3() {
		return ball_meal_so3;
	}

	/**
	 * @param ball_meal_so3 the ball_meal_so3 to set
	 */
	public void setBall_meal_so3(Double ball_meal_so3) {
		this.ball_meal_so3 = ball_meal_so3;
	}

	/**
	 * @return the smpl_qty_received
	 */
	public Double getSmpl_qty_received() {
		return smpl_qty_received;
	}

	/**
	 * @param smpl_qty_received the smpl_qty_received to set
	 */
	public void setSmpl_qty_received(Double smpl_qty_received) {
		this.smpl_qty_received = smpl_qty_received;
	}

	/**
	 * @return the moisture
	 */
	public Double getMoisture() {
		return moisture;
	}

	/**
	 * @param moisture the moisture to set
	 */
	public void setMoisture(Double moisture) {
		this.moisture = moisture;
	}

	/**
	 * @return the volatile_moisture
	 */
	public Double getVolatile_moisture() {
		return volatile_moisture;
	}

	/**
	 * @param volatile_moisture the volatile_moisture to set
	 */
	public void setVolatile_moisture(Double volatile_moisture) {
		this.volatile_moisture = volatile_moisture;
	}

	/**
	 * @return the inherient_moisture
	 */
	public Double getInherient_moisture() {
		return inherient_moisture;
	}

	/**
	 * @param inherient_moisture the inherient_moisture to set
	 */
	public void setInherient_moisture(Double inherient_moisture) {
		this.inherient_moisture = inherient_moisture;
	}

	/**
	 * @return the free_moisture
	 */
	public Double getFree_moisture() {
		return free_moisture;
	}

	/**
	 * @param free_moisture the free_moisture to set
	 */
	public void setFree_moisture(Double free_moisture) {
		this.free_moisture = free_moisture;
	}

	/**
	 * @return the gCV_Airdrybasis
	 */
	public Double getGCV_Airdrybasis() {
		return GCV_Airdrybasis;
	}

	/**
	 * @param gCV_Airdrybasis the gCV_Airdrybasis to set
	 */
	public void setGCV_Airdrybasis(Double gCV_Airdrybasis) {
		GCV_Airdrybasis = gCV_Airdrybasis;
	}

	/**
	 * @return the gCV_Asreceivedbasis
	 */
	public Double getGCV_Asreceivedbasis() {
		return GCV_Asreceivedbasis;
	}

	/**
	 * @param gCV_Asreceivedbasis the gCV_Asreceivedbasis to set
	 */
	public void setGCV_Asreceivedbasis(Double gCV_Asreceivedbasis) {
		GCV_Asreceivedbasis = gCV_Asreceivedbasis;
	}

	/**
	 * @return the asreceivedbasis_freemoisture
	 */
	public Double getAsreceivedbasis_freemoisture() {
		return asreceivedbasis_freemoisture;
	}

	/**
	 * @param asreceivedbasis_freemoisture the asreceivedbasis_freemoisture to set
	 */
	public void setAsreceivedbasis_freemoisture(Double asreceivedbasis_freemoisture) {
		this.asreceivedbasis_freemoisture = asreceivedbasis_freemoisture;
	}

	/**
	 * @return the asreceivedbasis_totalmoisture
	 */
	public Double getAsreceivedbasis_totalmoisture() {
		return asreceivedbasis_totalmoisture;
	}

	/**
	 * @param asreceivedbasis_totalmoisture the asreceivedbasis_totalmoisture to set
	 */
	public void setAsreceivedbasis_totalmoisture(Double asreceivedbasis_totalmoisture) {
		this.asreceivedbasis_totalmoisture = asreceivedbasis_totalmoisture;
	}

	/**
	 * @return the airdrybasis_inherientmoisture
	 */
	public Double getAirdrybasis_inherientmoisture() {
		return airdrybasis_inherientmoisture;
	}

	/**
	 * @param airdrybasis_inherientmoisture the airdrybasis_inherientmoisture to set
	 */
	public void setAirdrybasis_inherientmoisture(Double airdrybasis_inherientmoisture) {
		this.airdrybasis_inherientmoisture = airdrybasis_inherientmoisture;
	}

	/**
	 * @return the airdrybasis_volatilemoisture
	 */
	public Double getAirdrybasis_volatilemoisture() {
		return airdrybasis_volatilemoisture;
	}

	/**
	 * @param airdrybasis_volatilemoisture the airdrybasis_volatilemoisture to set
	 */
	public void setAirdrybasis_volatilemoisture(Double airdrybasis_volatilemoisture) {
		this.airdrybasis_volatilemoisture = airdrybasis_volatilemoisture;
	}

	/**
	 * @return the airdrybasis_ash
	 */
	public Double getAirdrybasis_ash() {
		return airdrybasis_ash;
	}

	/**
	 * @param airdrybasis_ash the airdrybasis_ash to set
	 */
	public void setAirdrybasis_ash(Double airdrybasis_ash) {
		this.airdrybasis_ash = airdrybasis_ash;
	}

	/**
	 * @return the airdrybasis_sulphur
	 */
	public Double getAirdrybasis_sulphur() {
		return airdrybasis_sulphur;
	}

	/**
	 * @param airdrybasis_sulphur the airdrybasis_sulphur to set
	 */
	public void setAirdrybasis_sulphur(Double airdrybasis_sulphur) {
		this.airdrybasis_sulphur = airdrybasis_sulphur;
	}

	/**
	 * @return the purity
	 */
	public Double getPurity() {
		return purity;
	}

	/**
	 * @param purity the purity to set
	 */
	public void setPurity(Double purity) {
		this.purity = purity;
	}

	/**
	 * @return the carbon
	 */
	public Double getCarbon() {
		return carbon;
	}

	/**
	 * @param carbon the carbon to set
	 */
	public void setCarbon(Double carbon) {
		this.carbon = carbon;
	}

	/**
	 * @return the nitrogen
	 */
	public Double getNitrogen() {
		return nitrogen;
	}

	/**
	 * @param nitrogen the nitrogen to set
	 */
	public void setNitrogen(Double nitrogen) {
		this.nitrogen = nitrogen;
	}

	/**
	 * @return the r2o3
	 */
	public Double getR2o3() {
		return r2o3;
	}

	/**
	 * @param r2o3 the r2o3 to set
	 */
	public void setR2o3(Double r2o3) {
		this.r2o3 = r2o3;
	}

	/**
	 * @return the fluorine
	 */
	public Double getFluorine() {
		return Fluorine;
	}

	/**
	 * @param fluorine the fluorine to set
	 */
	public void setFluorine(Double fluorine) {
		Fluorine = fluorine;
	}

	/**
	 * @return the at_cl
	 */
	public Double getAt_cl() {
		return at_cl;
	}

	/**
	 * @param at_cl the at_cl to set
	 */
	public void setAt_cl(Double at_cl) {
		this.at_cl = at_cl;
	}

	/**
	 * @return the flashpoint
	 */
	public Double getFlashpoint() {
		return flashpoint;
	}

	/**
	 * @param flashpoint the flashpoint to set
	 */
	public void setFlashpoint(Double flashpoint) {
		this.flashpoint = flashpoint;
	}

	/**
	 * @return the na2o3
	 */
	public Double getNa2o3() {
		return na2o3;
	}

	/**
	 * @param na2o3 the na2o3 to set
	 */
	public void setNa2o3(Double na2o3) {
		this.na2o3 = na2o3;
	}

	/**
	 * @return the cr2o3
	 */
	public Double getCr2o3() {
		return cr2o3;
	}

	/**
	 * @param cr2o3 the cr2o3 to set
	 */
	public void setCr2o3(Double cr2o3) {
		this.cr2o3 = cr2o3;
	}

	/**
	 * @return the chloride_content
	 */
	public Double getChloride_content() {
		return Chloride_content;
	}

	/**
	 * @param chloride_content the chloride_content to set
	 */
	public void setChloride_content(Double chloride_content) {
		Chloride_content = chloride_content;
	}

	/**
	 * @return the co2
	 */
	public Double getCo2() {
		return co2;
	}

	/**
	 * @param co2 the co2 to set
	 */
	public void setCo2(Double co2) {
		this.co2 = co2;
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
	 * @return the c_id
	 */
	public Integer getC_id() {
		return c_id;
	}

	/**
	 * @param c_id the c_id to set
	 */
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
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
	 * @return the mst_region_id
	 */
	public Integer getMst_region_id() {
		return mst_region_id;
	}

	/**
	 * @param mst_region_id the mst_region_id to set
	 */
	public void setMst_region_id(Integer mst_region_id) {
		this.mst_region_id = mst_region_id;
	}

	/**
	 * @return the supplier_id
	 */
	public Integer getSupplier_id() {
		return supplier_id;
	}

	/**
	 * @param supplier_id the supplier_id to set
	 */
	public void setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
	}

	/**
	 * @return the createdby_user_id
	 */
	public Integer getCreatedby_user_id() {
		return createdby_user_id;
	}

	/**
	 * @param createdby_user_id the createdby_user_id to set
	 */
	public void setCreatedby_user_id(Integer createdby_user_id) {
		this.createdby_user_id = createdby_user_id;
	}

	/**
	 * @return the sect_id
	 */
	public Integer getSect_id() {
		return sect_id;
	}

	/**
	 * @param sect_id the sect_id to set
	 */
	public void setSect_id(Integer sect_id) {
		this.sect_id = sect_id;
	}

	/**
	 * @return the noof_cubes_1d
	 */
	public Integer getNoof_cubes_1d() {
		return noof_cubes_1d;
	}

	/**
	 * @param noof_cubes_1d the noof_cubes_1d to set
	 */
	public void setNoof_cubes_1d(Integer noof_cubes_1d) {
		this.noof_cubes_1d = noof_cubes_1d;
	}

	/**
	 * @return the noof_cubes_3d
	 */
	public Integer getNoof_cubes_3d() {
		return noof_cubes_3d;
	}

	/**
	 * @param noof_cubes_3d the noof_cubes_3d to set
	 */
	public void setNoof_cubes_3d(Integer noof_cubes_3d) {
		this.noof_cubes_3d = noof_cubes_3d;
	}

	/**
	 * @return the noof_cubes_7d
	 */
	public Integer getNoof_cubes_7d() {
		return noof_cubes_7d;
	}

	/**
	 * @param noof_cubes_7d the noof_cubes_7d to set
	 */
	public void setNoof_cubes_7d(Integer noof_cubes_7d) {
		this.noof_cubes_7d = noof_cubes_7d;
	}

	/**
	 * @return the noof_cubes_28d
	 */
	public Integer getNoof_cubes_28d() {
		return noof_cubes_28d;
	}

	/**
	 * @param noof_cubes_28d the noof_cubes_28d to set
	 */
	public void setNoof_cubes_28d(Integer noof_cubes_28d) {
		this.noof_cubes_28d = noof_cubes_28d;
	}

	/**
	 * @return the planned_brdays
	 */
	public Integer getPlanned_brdays() {
		return planned_brdays;
	}

	/**
	 * @param planned_brdays the planned_brdays to set
	 */
	public void setPlanned_brdays(Integer planned_brdays) {
		this.planned_brdays = planned_brdays;
	}

	/**
	 * @return the psd_id
	 */
	public Integer getPsd_id() {
		return psd_id;
	}

	/**
	 * @param psd_id the psd_id to set
	 */
	public void setPsd_id(Integer psd_id) {
		this.psd_id = psd_id;
	}

	/**
	 * @return the lrcr_avg_10d_kn
	 */
	public Integer getLrcr_avg_10d_kn() {
		return lrcr_avg_10d_kn;
	}

	/**
	 * @param lrcr_avg_10d_kn the lrcr_avg_10d_kn to set
	 */
	public void setLrcr_avg_10d_kn(Integer lrcr_avg_10d_kn) {
		this.lrcr_avg_10d_kn = lrcr_avg_10d_kn;
	}

	/**
	 * @return the lrcr_avg_28d_kn
	 */
	public Integer getLrcr_avg_28d_kn() {
		return lrcr_avg_28d_kn;
	}

	/**
	 * @param lrcr_avg_28d_kn the lrcr_avg_28d_kn to set
	 */
	public void setLrcr_avg_28d_kn(Integer lrcr_avg_28d_kn) {
		this.lrcr_avg_28d_kn = lrcr_avg_28d_kn;
	}

	/**
	 * @return the lrcr_noof_cubes_10d
	 */
	public Integer getLrcr_noof_cubes_10d() {
		return lrcr_noof_cubes_10d;
	}

	/**
	 * @param lrcr_noof_cubes_10d the lrcr_noof_cubes_10d to set
	 */
	public void setLrcr_noof_cubes_10d(Integer lrcr_noof_cubes_10d) {
		this.lrcr_noof_cubes_10d = lrcr_noof_cubes_10d;
	}

	/**
	 * @return the lrcr_noof_cubes_28d
	 */
	public Integer getLrcr_noof_cubes_28d() {
		return lrcr_noof_cubes_28d;
	}

	/**
	 * @param lrcr_noof_cubes_28d the lrcr_noof_cubes_28d to set
	 */
	public void setLrcr_noof_cubes_28d(Integer lrcr_noof_cubes_28d) {
		this.lrcr_noof_cubes_28d = lrcr_noof_cubes_28d;
	}

	/**
	 * @return the source_id
	 */
	public Integer getSource_id() {
		return source_id;
	}

	/**
	 * @param source_id the source_id to set
	 */
	public void setSource_id(Integer source_id) {
		this.source_id = source_id;
	}

	/**
	 * @return the rack_no
	 */
	public Integer getRack_no() {
		return rack_no;
	}

	/**
	 * @param rack_no the rack_no to set
	 */
	public void setRack_no(Integer rack_no) {
		this.rack_no = rack_no;
	}

	/**
	 * @return the doc_no
	 */
	public Integer getDoc_no() {
		return doc_no;
	}

	/**
	 * @param doc_no the doc_no to set
	 */
	public void setDoc_no(Integer doc_no) {
		this.doc_no = doc_no;
	}

	/**
	 * @return the smplreceived_time
	 */
	public Integer getSmplreceived_time() {
		return smplreceived_time;
	}

	/**
	 * @param smplreceived_time the smplreceived_time to set
	 */
	public void setSmplreceived_time(Integer smplreceived_time) {
		this.smplreceived_time = smplreceived_time;
	}

	/**
	 * @return the afr_smpl_id
	 */
	public Integer getAfr_smpl_id() {
		return afr_smpl_id;
	}

	/**
	 * @param afr_smpl_id the afr_smpl_id to set
	 */
	public void setAfr_smpl_id(Integer afr_smpl_id) {
		this.afr_smpl_id = afr_smpl_id;
	}


	             
	
	
    

}
