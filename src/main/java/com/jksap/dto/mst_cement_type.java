package com.jksap.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity

public class mst_cement_type {
	
	

	@Id
	@Column(name="ctype_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ctype_id;
	
	
	private Integer seq_no,dayone_min, dayone_max, daythree_min, daythree_max, dayseven_min, dayseven_max, 
    daytwenty_min, daytwenty_max, color_min, color_max, blaine_min, blaine_max, bomb_min, bomb_max, p_id;
	
	private String ctype_name,report_yn,short_name,ref_id, auto_registerto_elims;
	
	 private Boolean assigned;
	
	private  Double  lsf_min, lsf_max, sm_min, sm_max, am_min, 
    am_max, mgo_min, mgo_max, k2o_min, k2o_max, fcao_min, fcao_max, c3s_min, c3s_max, c2s_min, c2s_max, ir_min, ir_max, r212_max, r212_min, c3s_c2s_min, 
    c3s_c2s_max, c3a_min, c3a_max, cao_max, cao_min, fe2o3_min, fe2o3_max, r45_min, r45_max, lime_max, lime_min, ncv_max, ncv_min, r_90_max, r_90_min, 
     active, sio2_min, sio2_max, al2o3_min, al2o3_max, tio2_min, tio2_max, p2o5_min, p2o5_max, loi_min, loi_max, sum_min, sum_max, naeq_min, 
    naeq_max, fsilica_min, fsilica_max, bf_min, bf_max, lc_min, lc_max, as_min, as_max, sa_min, sa_max, mm_min, mm_max, c4af_min, c4af_max, exso3_min, 
    exso3_max, hor_min, hor_max, ltwt_min, ltwt_max, nibs_min, nibs_max, nc_min, nc_max, autoclv_min, autoclv_max, ist_min, ist_max, fst_min, fst_max, pi_min, 
    sio2_target, al2o3_target, fe2o3_target, cao_target, mgo_target, so3_target, tio2_target, sum_target, lime_target, naeq_target, ir_target, als_target, sla_target, 
    als_min, als_max, sla_max, sla_min, lsf_target, sm_target, am_target, mm_target, c3s_target, c2s_target, c3a_target, c4af_target, ex_so3_target, c3s_c2s_target, 
    hor_target, nibs_target, blaine_target, r45_target, ac_min, ac_max, ac_target, nc_target, lc_target, lst_target, fst_target, day1_target, day3_target, day7_target, 
    day28_target, r90_target, r212_target, r40_target, r30_target, r30_min, r30_max, r20_target, r20_min, r20_max, r10_target, r10_min, r10_max, r3_target, r3_min, 
    r3_max, r33_target, r33_min, r33_max, ds_min, ds_max, pi_max, pitarget, ds_target, flyash_min, flyash_max, flyash_target, slag_min, slag_max, slag_target, 
    f_silica_min, f_silica_max, f_silica_target, ncv_target, color_target, r40_min, r40_max, loi_kf_min, loi_kf_max, loi_kf_target, loi_hm_min, loi_hm_max, loi_hm_target,
     ash_min, ash_max, ash_target, cmt_temp_min, cmt_temp_max, cmt_temp_target, psd_bet_3and30_min, psd_bet_3and30_max, psd_bet_3and30_target, 
    psd_above_30_min, psd_above_30_max, psd_above_30_target, psd_above_45_min, psd_above_45_max, psd_above_45_target, psd_above_50_min, 
    psd_above_50_max, psd_above_50_target, psd_above_90_min, psd_above_90_max, psd_above_90_target, psd_below_20_min, psd_below_20_max, 
    psd_below_20_target, psd_below_5_min, psd_below_5_max, psd_below_5_target, psd_above_212_min, psd_above_212_max, psd_above_212_target, lrcr10_min;
	
	private Double   lrcr10_max, lrcr10_target, lrcr28_min, lrcr28_max, lrcr28_target, alkaliso3_min, alkaliso3_max, alkaliso3_target, so3alkai_min, so3alkai_max, so3alkai_target, 
    ltwt_target, ballmillso3_min, ballmillso3_max, ballmillso3_target, liquid_min, liquid_max, liquid_target, bf_target, moisture_min, moisture_max, moisture_target, 
    volatile_moisture_min, volatile_moisture_max, volatile_moisture_target, inherient_moisture_min, inherient_moisture_max, inherient_moisture_target, 
    free_moisture_min, free_moisture_max, free_moisture_target, r2o3_min, r2o3_max, r2o3_target, purity_min, purity_max, purity_target, mn2o3_min, mn2o3_max, 
    mn2o3_target, cl_min, cl_max, cl_target, sulphur_min, sulphur_max, sulphur_target, so3_max, so3_min, na2o_max, na2o_min, na2o_target, k2o_target, 
    p2o5_target, loi_target, bomb_cal_target, degreecalci_min, degreecalci_max, degreecalci_target, gcv_airdrybasis_min, gcv_airdrybasis_max, 
    gcv_airdrybasis_target, gcv_asreceivedbasis_min, gcv_asreceivedbasis_max, gcv_asreceivedbasis_target, arb_freemoisture_min, arb_freemoisture_max, 
    arb_freemoisture_target, arb_totalmoisture_min, arb_totalmoisture_max, arb_totalmoisture_target, adb_inherientmoisture_min, adb_inherientmoisture_max, 
    adb_inherientmoisture_target, adb_volatilemoisture_min, adb_volatilemoisture_max, adb_volatilemoisture_target, adb_ash_min, adb_ash_max, adb_ash_target, 
    adb_sulphur_min, adb_sulphur_max, adb_sulphur_target;

	public mst_cement_type()
	{}
	
	
	public mst_cement_type(Integer ctype_id, Integer seq_no, Integer dayone_min, Integer dayone_max,
			Integer daythree_min, Integer daythree_max, Integer dayseven_min, Integer dayseven_max,
			Integer daytwenty_min, Integer daytwenty_max, Integer color_min, Integer color_max, Integer blaine_min,
			Integer blaine_max, Integer bomb_min, Integer bomb_max, Integer p_id, String ctype_name, String report_yn,
			String short_name, String ref_id, String auto_registerto_elims, Boolean assigned, Double lsf_min,
			Double lsf_max, Double sm_min, Double sm_max, Double am_min, Double am_max, Double mgo_min, Double mgo_max,
			Double k2o_min, Double k2o_max, Double fcao_min, Double fcao_max, Double c3s_min, Double c3s_max,
			Double c2s_min, Double c2s_max, Double ir_min, Double ir_max, Double r212_max, Double r212_min,
			Double c3s_c2s_min, Double c3s_c2s_max, Double c3a_min, Double c3a_max, Double cao_max, Double cao_min,
			Double fe2o3_min, Double fe2o3_max, Double r45_min, Double r45_max, Double lime_max, Double lime_min,
			Double ncv_max, Double ncv_min, Double r_90_max, Double r_90_min, Double active, Double sio2_min,
			Double sio2_max, Double al2o3_min, Double al2o3_max, Double tio2_min, Double tio2_max, Double p2o5_min,
			Double p2o5_max, Double loi_min, Double loi_max, Double sum_min, Double sum_max, Double naeq_min,
			Double naeq_max, Double fsilica_min, Double fsilica_max, Double bf_min, Double bf_max, Double lc_min,
			Double lc_max, Double as_min, Double as_max, Double sa_min, Double sa_max, Double mm_min, Double mm_max,
			Double c4af_min, Double c4af_max, Double exso3_min, Double exso3_max, Double hor_min, Double hor_max,
			Double ltwt_min, Double ltwt_max, Double nibs_min, Double nibs_max, Double nc_min, Double nc_max,
			Double autoclv_min, Double autoclv_max, Double ist_min, Double ist_max, Double fst_min, Double fst_max,
			Double pi_min, Double sio2_target, Double al2o3_target, Double fe2o3_target, Double cao_target,
			Double mgo_target, Double so3_target, Double tio2_target, Double sum_target, Double lime_target,
			Double naeq_target, Double ir_target, Double als_target, Double sla_target, Double als_min, Double als_max,
			Double sla_max, Double sla_min, Double lsf_target, Double sm_target, Double am_target, Double mm_target,
			Double c3s_target, Double c2s_target, Double c3a_target, Double c4af_target, Double ex_so3_target,
			Double c3s_c2s_target, Double hor_target, Double nibs_target, Double blaine_target, Double r45_target,
			Double ac_min, Double ac_max, Double ac_target, Double nc_target, Double lc_target, Double lst_target,
			Double fst_target, Double day1_target, Double day3_target, Double day7_target, Double day28_target,
			Double r90_target, Double r212_target, Double r40_target, Double r30_target, Double r30_min, Double r30_max,
			Double r20_target, Double r20_min, Double r20_max, Double r10_target, Double r10_min, Double r10_max,
			Double r3_target, Double r3_min, Double r3_max, Double r33_target, Double r33_min, Double r33_max,
			Double ds_min, Double ds_max, Double pi_max, Double pitarget, Double ds_target, Double flyash_min,
			Double flyash_max, Double flyash_target, Double slag_min, Double slag_max, Double slag_target,
			Double f_silica_min, Double f_silica_max, Double f_silica_target, Double ncv_target, Double color_target,
			Double r40_min, Double r40_max, Double loi_kf_min, Double loi_kf_max, Double loi_kf_target,
			Double loi_hm_min, Double loi_hm_max, Double loi_hm_target, Double ash_min, Double ash_max,
			Double ash_target, Double cmt_temp_min, Double cmt_temp_max, Double cmt_temp_target,
			Double psd_bet_3and30_min, Double psd_bet_3and30_max, Double psd_bet_3and30_target, Double psd_above_30_min,
			Double psd_above_30_max, Double psd_above_30_target, Double psd_above_45_min, Double psd_above_45_max,
			Double psd_above_45_target, Double psd_above_50_min, Double psd_above_50_max, Double psd_above_50_target,
			Double psd_above_90_min, Double psd_above_90_max, Double psd_above_90_target, Double psd_below_20_min,
			Double psd_below_20_max, Double psd_below_20_target, Double psd_below_5_min, Double psd_below_5_max,
			Double psd_below_5_target, Double psd_above_212_min, Double psd_above_212_max, Double psd_above_212_target,
			Double lrcr10_min, Double lrcr10_max, Double lrcr10_target, Double lrcr28_min, Double lrcr28_max,
			Double lrcr28_target, Double alkaliso3_min, Double alkaliso3_max, Double alkaliso3_target,
			Double so3alkai_min, Double so3alkai_max, Double so3alkai_target, Double ltwt_target,
			Double ballmillso3_min, Double ballmillso3_max, Double ballmillso3_target, Double liquid_min,
			Double liquid_max, Double liquid_target, Double bf_target, Double moisture_min, Double moisture_max,
			Double moisture_target, Double volatile_moisture_min, Double volatile_moisture_max,
			Double volatile_moisture_target, Double inherient_moisture_min, Double inherient_moisture_max,
			Double inherient_moisture_target, Double free_moisture_min, Double free_moisture_max,
			Double free_moisture_target, Double r2o3_min, Double r2o3_max, Double r2o3_target) {
		super();
		this.ctype_id = ctype_id;
		this.seq_no = seq_no;
		this.dayone_min = dayone_min;
		this.dayone_max = dayone_max;
		this.daythree_min = daythree_min;
		this.daythree_max = daythree_max;
		this.dayseven_min = dayseven_min;
		this.dayseven_max = dayseven_max;
		this.daytwenty_min = daytwenty_min;
		this.daytwenty_max = daytwenty_max;
		this.color_min = color_min;
		this.color_max = color_max;
		this.blaine_min = blaine_min;
		this.blaine_max = blaine_max;
		this.bomb_min = bomb_min;
		this.bomb_max = bomb_max;
		this.p_id = p_id;
		this.ctype_name = ctype_name;
		this.report_yn = report_yn;
		this.short_name = short_name;
		this.ref_id = ref_id;
		this.auto_registerto_elims = auto_registerto_elims;
		this.assigned = assigned;
		this.lsf_min = lsf_min;
		this.lsf_max = lsf_max;
		this.sm_min = sm_min;
		this.sm_max = sm_max;
		this.am_min = am_min;
		this.am_max = am_max;
		this.mgo_min = mgo_min;
		this.mgo_max = mgo_max;
		this.k2o_min = k2o_min;
		this.k2o_max = k2o_max;
		this.fcao_min = fcao_min;
		this.fcao_max = fcao_max;
		this.c3s_min = c3s_min;
		this.c3s_max = c3s_max;
		this.c2s_min = c2s_min;
		this.c2s_max = c2s_max;
		this.ir_min = ir_min;
		this.ir_max = ir_max;
		this.r212_max = r212_max;
		this.r212_min = r212_min;
		this.c3s_c2s_min = c3s_c2s_min;
		this.c3s_c2s_max = c3s_c2s_max;
		this.c3a_min = c3a_min;
		this.c3a_max = c3a_max;
		this.cao_max = cao_max;
		this.cao_min = cao_min;
		this.fe2o3_min = fe2o3_min;
		this.fe2o3_max = fe2o3_max;
		this.r45_min = r45_min;
		this.r45_max = r45_max;
		this.lime_max = lime_max;
		this.lime_min = lime_min;
		this.ncv_max = ncv_max;
		this.ncv_min = ncv_min;
		this.r_90_max = r_90_max;
		this.r_90_min = r_90_min;
		this.active = active;
		this.sio2_min = sio2_min;
		this.sio2_max = sio2_max;
		this.al2o3_min = al2o3_min;
		this.al2o3_max = al2o3_max;
		this.tio2_min = tio2_min;
		this.tio2_max = tio2_max;
		this.p2o5_min = p2o5_min;
		this.p2o5_max = p2o5_max;
		this.loi_min = loi_min;
		this.loi_max = loi_max;
		this.sum_min = sum_min;
		this.sum_max = sum_max;
		this.naeq_min = naeq_min;
		this.naeq_max = naeq_max;
		this.fsilica_min = fsilica_min;
		this.fsilica_max = fsilica_max;
		this.bf_min = bf_min;
		this.bf_max = bf_max;
		this.lc_min = lc_min;
		this.lc_max = lc_max;
		this.as_min = as_min;
		this.as_max = as_max;
		this.sa_min = sa_min;
		this.sa_max = sa_max;
		this.mm_min = mm_min;
		this.mm_max = mm_max;
		this.c4af_min = c4af_min;
		this.c4af_max = c4af_max;
		this.exso3_min = exso3_min;
		this.exso3_max = exso3_max;
		this.hor_min = hor_min;
		this.hor_max = hor_max;
		this.ltwt_min = ltwt_min;
		this.ltwt_max = ltwt_max;
		this.nibs_min = nibs_min;
		this.nibs_max = nibs_max;
		this.nc_min = nc_min;
		this.nc_max = nc_max;
		this.autoclv_min = autoclv_min;
		this.autoclv_max = autoclv_max;
		this.ist_min = ist_min;
		this.ist_max = ist_max;
		this.fst_min = fst_min;
		this.fst_max = fst_max;
		this.pi_min = pi_min;
		this.sio2_target = sio2_target;
		this.al2o3_target = al2o3_target;
		this.fe2o3_target = fe2o3_target;
		this.cao_target = cao_target;
		this.mgo_target = mgo_target;
		this.so3_target = so3_target;
		this.tio2_target = tio2_target;
		this.sum_target = sum_target;
		this.lime_target = lime_target;
		this.naeq_target = naeq_target;
		this.ir_target = ir_target;
		this.als_target = als_target;
		this.sla_target = sla_target;
		this.als_min = als_min;
		this.als_max = als_max;
		this.sla_max = sla_max;
		this.sla_min = sla_min;
		this.lsf_target = lsf_target;
		this.sm_target = sm_target;
		this.am_target = am_target;
		this.mm_target = mm_target;
		this.c3s_target = c3s_target;
		this.c2s_target = c2s_target;
		this.c3a_target = c3a_target;
		this.c4af_target = c4af_target;
		this.ex_so3_target = ex_so3_target;
		this.c3s_c2s_target = c3s_c2s_target;
		this.hor_target = hor_target;
		this.nibs_target = nibs_target;
		this.blaine_target = blaine_target;
		this.r45_target = r45_target;
		this.ac_min = ac_min;
		this.ac_max = ac_max;
		this.ac_target = ac_target;
		this.nc_target = nc_target;
		this.lc_target = lc_target;
		this.lst_target = lst_target;
		this.fst_target = fst_target;
		this.day1_target = day1_target;
		this.day3_target = day3_target;
		this.day7_target = day7_target;
		this.day28_target = day28_target;
		this.r90_target = r90_target;
		this.r212_target = r212_target;
		this.r40_target = r40_target;
		this.r30_target = r30_target;
		this.r30_min = r30_min;
		this.r30_max = r30_max;
		this.r20_target = r20_target;
		this.r20_min = r20_min;
		this.r20_max = r20_max;
		this.r10_target = r10_target;
		this.r10_min = r10_min;
		this.r10_max = r10_max;
		this.r3_target = r3_target;
		this.r3_min = r3_min;
		this.r3_max = r3_max;
		this.r33_target = r33_target;
		this.r33_min = r33_min;
		this.r33_max = r33_max;
		this.ds_min = ds_min;
		this.ds_max = ds_max;
		this.pi_max = pi_max;
		this.pitarget = pitarget;
		this.ds_target = ds_target;
		this.flyash_min = flyash_min;
		this.flyash_max = flyash_max;
		this.flyash_target = flyash_target;
		this.slag_min = slag_min;
		this.slag_max = slag_max;
		this.slag_target = slag_target;
		this.f_silica_min = f_silica_min;
		this.f_silica_max = f_silica_max;
		this.f_silica_target = f_silica_target;
		this.ncv_target = ncv_target;
		this.color_target = color_target;
		this.r40_min = r40_min;
		this.r40_max = r40_max;
		this.loi_kf_min = loi_kf_min;
		this.loi_kf_max = loi_kf_max;
		this.loi_kf_target = loi_kf_target;
		this.loi_hm_min = loi_hm_min;
		this.loi_hm_max = loi_hm_max;
		this.loi_hm_target = loi_hm_target;
		this.ash_min = ash_min;
		this.ash_max = ash_max;
		this.ash_target = ash_target;
		this.cmt_temp_min = cmt_temp_min;
		this.cmt_temp_max = cmt_temp_max;
		this.cmt_temp_target = cmt_temp_target;
		this.psd_bet_3and30_min = psd_bet_3and30_min;
		this.psd_bet_3and30_max = psd_bet_3and30_max;
		this.psd_bet_3and30_target = psd_bet_3and30_target;
		this.psd_above_30_min = psd_above_30_min;
		this.psd_above_30_max = psd_above_30_max;
		this.psd_above_30_target = psd_above_30_target;
		this.psd_above_45_min = psd_above_45_min;
		this.psd_above_45_max = psd_above_45_max;
		this.psd_above_45_target = psd_above_45_target;
		this.psd_above_50_min = psd_above_50_min;
		this.psd_above_50_max = psd_above_50_max;
		this.psd_above_50_target = psd_above_50_target;
		this.psd_above_90_min = psd_above_90_min;
		this.psd_above_90_max = psd_above_90_max;
		this.psd_above_90_target = psd_above_90_target;
		this.psd_below_20_min = psd_below_20_min;
		this.psd_below_20_max = psd_below_20_max;
		this.psd_below_20_target = psd_below_20_target;
		this.psd_below_5_min = psd_below_5_min;
		this.psd_below_5_max = psd_below_5_max;
		this.psd_below_5_target = psd_below_5_target;
		this.psd_above_212_min = psd_above_212_min;
		this.psd_above_212_max = psd_above_212_max;
		this.psd_above_212_target = psd_above_212_target;
		this.lrcr10_min = lrcr10_min;
		this.lrcr10_max = lrcr10_max;
		this.lrcr10_target = lrcr10_target;
		this.lrcr28_min = lrcr28_min;
		this.lrcr28_max = lrcr28_max;
		this.lrcr28_target = lrcr28_target;
		this.alkaliso3_min = alkaliso3_min;
		this.alkaliso3_max = alkaliso3_max;
		this.alkaliso3_target = alkaliso3_target;
		this.so3alkai_min = so3alkai_min;
		this.so3alkai_max = so3alkai_max;
		this.so3alkai_target = so3alkai_target;
		this.ltwt_target = ltwt_target;
		this.ballmillso3_min = ballmillso3_min;
		this.ballmillso3_max = ballmillso3_max;
		this.ballmillso3_target = ballmillso3_target;
		this.liquid_min = liquid_min;
		this.liquid_max = liquid_max;
		this.liquid_target = liquid_target;
		this.bf_target = bf_target;
		this.moisture_min = moisture_min;
		this.moisture_max = moisture_max;
		this.moisture_target = moisture_target;
		this.volatile_moisture_min = volatile_moisture_min;
		this.volatile_moisture_max = volatile_moisture_max;
		this.volatile_moisture_target = volatile_moisture_target;
		this.inherient_moisture_min = inherient_moisture_min;
		this.inherient_moisture_max = inherient_moisture_max;
		this.inherient_moisture_target = inherient_moisture_target;
		this.free_moisture_min = free_moisture_min;
		this.free_moisture_max = free_moisture_max;
		this.free_moisture_target = free_moisture_target;
		this.r2o3_min = r2o3_min;
		this.r2o3_max = r2o3_max;
		this.r2o3_target = r2o3_target;
	
	}
	
	public mst_cement_type(Double purity_min,
			Double purity_max, Double purity_target, Double mn2o3_min, Double mn2o3_max, Double mn2o3_target,
			Double cl_min, Double cl_max, Double cl_target, Double sulphur_min, Double sulphur_max,
			Double sulphur_target, Double so3_max, Double so3_min, Double na2o_max, Double na2o_min, Double na2o_target,
			Double k2o_target, Double p2o5_target, Double loi_target, Double bomb_cal_target, Double degreecalci_min,
			Double degreecalci_max, Double degreecalci_target, Double gcv_airdrybasis_min, Double gcv_airdrybasis_max,
			Double gcv_airdrybasis_target, Double gcv_asreceivedbasis_min, Double gcv_asreceivedbasis_max,
			Double gcv_asreceivedbasis_target, Double arb_freemoisture_min, Double arb_freemoisture_max,
			Double arb_freemoisture_target, Double arb_totalmoisture_min, Double arb_totalmoisture_max,
			Double arb_totalmoisture_target, Double adb_inherientmoisture_min, Double adb_inherientmoisture_max,
			Double adb_inherientmoisture_target, Double adb_volatilemoisture_min, Double adb_volatilemoisture_max,
			Double adb_volatilemoisture_target, Double adb_ash_min, Double adb_ash_max, Double adb_ash_target,
			Double adb_sulphur_min, Double adb_sulphur_max, Double adb_sulphur_target)
	{
		super();
		this.purity_min = purity_min;
		this.purity_max = purity_max;
		this.purity_target = purity_target;
		this.mn2o3_min = mn2o3_min;
		this.mn2o3_max = mn2o3_max;
		this.mn2o3_target = mn2o3_target;
		this.cl_min = cl_min;
		this.cl_max = cl_max;
		this.cl_target = cl_target;
		this.sulphur_min = sulphur_min;
		this.sulphur_max = sulphur_max;
		this.sulphur_target = sulphur_target;
		this.so3_max = so3_max;
		this.so3_min = so3_min;
		this.na2o_max = na2o_max;
		this.na2o_min = na2o_min;
		this.na2o_target = na2o_target;
		this.k2o_target = k2o_target;
		this.p2o5_target = p2o5_target;
		this.loi_target = loi_target;
		this.bomb_cal_target = bomb_cal_target;
		this.degreecalci_min = degreecalci_min;
		this.degreecalci_max = degreecalci_max;
		this.degreecalci_target = degreecalci_target;
		this.gcv_airdrybasis_min = gcv_airdrybasis_min;
		this.gcv_airdrybasis_max = gcv_airdrybasis_max;
		this.gcv_airdrybasis_target = gcv_airdrybasis_target;
		this.gcv_asreceivedbasis_min = gcv_asreceivedbasis_min;
		this.gcv_asreceivedbasis_max = gcv_asreceivedbasis_max;
		this.gcv_asreceivedbasis_target = gcv_asreceivedbasis_target;
		this.arb_freemoisture_min = arb_freemoisture_min;
		this.arb_freemoisture_max = arb_freemoisture_max;
		this.arb_freemoisture_target = arb_freemoisture_target;
		this.arb_totalmoisture_min = arb_totalmoisture_min;
		this.arb_totalmoisture_max = arb_totalmoisture_max;
		this.arb_totalmoisture_target = arb_totalmoisture_target;
		this.adb_inherientmoisture_min = adb_inherientmoisture_min;
		this.adb_inherientmoisture_max = adb_inherientmoisture_max;
		this.adb_inherientmoisture_target = adb_inherientmoisture_target;
		this.adb_volatilemoisture_min = adb_volatilemoisture_min;
		this.adb_volatilemoisture_max = adb_volatilemoisture_max;
		this.adb_volatilemoisture_target = adb_volatilemoisture_target;
		this.adb_ash_min = adb_ash_min;
		this.adb_ash_max = adb_ash_max;
		this.adb_ash_target = adb_ash_target;
		this.adb_sulphur_min = adb_sulphur_min;
		this.adb_sulphur_max = adb_sulphur_max;
		this.adb_sulphur_target = adb_sulphur_target;
		
	}


	public Integer getCtype_id() {
		return ctype_id;
	}


	public void setCtype_id(Integer ctype_id) {
		this.ctype_id = ctype_id;
	}


	public Integer getSeq_no() {
		return seq_no;
	}


	public void setSeq_no(Integer seq_no) {
		this.seq_no = seq_no;
	}


	public Integer getDayone_min() {
		return dayone_min;
	}


	public void setDayone_min(Integer dayone_min) {
		this.dayone_min = dayone_min;
	}


	public Integer getDayone_max() {
		return dayone_max;
	}


	public void setDayone_max(Integer dayone_max) {
		this.dayone_max = dayone_max;
	}


	public Integer getDaythree_min() {
		return daythree_min;
	}


	public void setDaythree_min(Integer daythree_min) {
		this.daythree_min = daythree_min;
	}


	public Integer getDaythree_max() {
		return daythree_max;
	}


	public void setDaythree_max(Integer daythree_max) {
		this.daythree_max = daythree_max;
	}


	public Integer getDayseven_min() {
		return dayseven_min;
	}


	public void setDayseven_min(Integer dayseven_min) {
		this.dayseven_min = dayseven_min;
	}


	public Integer getDayseven_max() {
		return dayseven_max;
	}


	public void setDayseven_max(Integer dayseven_max) {
		this.dayseven_max = dayseven_max;
	}


	public Integer getDaytwenty_min() {
		return daytwenty_min;
	}


	public void setDaytwenty_min(Integer daytwenty_min) {
		this.daytwenty_min = daytwenty_min;
	}


	public Integer getDaytwenty_max() {
		return daytwenty_max;
	}


	public void setDaytwenty_max(Integer daytwenty_max) {
		this.daytwenty_max = daytwenty_max;
	}


	public Integer getColor_min() {
		return color_min;
	}


	public void setColor_min(Integer color_min) {
		this.color_min = color_min;
	}


	public Integer getColor_max() {
		return color_max;
	}


	public void setColor_max(Integer color_max) {
		this.color_max = color_max;
	}


	public Integer getBlaine_min() {
		return blaine_min;
	}


	public void setBlaine_min(Integer blaine_min) {
		this.blaine_min = blaine_min;
	}


	public Integer getBlaine_max() {
		return blaine_max;
	}


	public void setBlaine_max(Integer blaine_max) {
		this.blaine_max = blaine_max;
	}


	public Integer getBomb_min() {
		return bomb_min;
	}


	public void setBomb_min(Integer bomb_min) {
		this.bomb_min = bomb_min;
	}


	public Integer getBomb_max() {
		return bomb_max;
	}


	public void setBomb_max(Integer bomb_max) {
		this.bomb_max = bomb_max;
	}


	public Integer getP_id() {
		return p_id;
	}


	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}


	public String getCtype_name() {
		return ctype_name;
	}


	public void setCtype_name(String ctype_name) {
		this.ctype_name = ctype_name;
	}


	public String getReport_yn() {
		return report_yn;
	}


	public void setReport_yn(String report_yn) {
		this.report_yn = report_yn;
	}


	public String getShort_name() {
		return short_name;
	}


	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}


	public String getRef_id() {
		return ref_id;
	}


	public void setRef_id(String ref_id) {
		this.ref_id = ref_id;
	}


	public String getAuto_registerto_elims() {
		return auto_registerto_elims;
	}


	public void setAuto_registerto_elims(String auto_registerto_elims) {
		this.auto_registerto_elims = auto_registerto_elims;
	}


	public Boolean getAssigned() {
		return assigned;
	}


	public void setAssigned(Boolean assigned) {
		this.assigned = assigned;
	}


	public Double getLsf_min() {
		return lsf_min;
	}


	public void setLsf_min(Double lsf_min) {
		this.lsf_min = lsf_min;
	}


	public Double getLsf_max() {
		return lsf_max;
	}


	public void setLsf_max(Double lsf_max) {
		this.lsf_max = lsf_max;
	}


	public Double getSm_min() {
		return sm_min;
	}


	public void setSm_min(Double sm_min) {
		this.sm_min = sm_min;
	}


	public Double getSm_max() {
		return sm_max;
	}


	public void setSm_max(Double sm_max) {
		this.sm_max = sm_max;
	}


	public Double getAm_min() {
		return am_min;
	}


	public void setAm_min(Double am_min) {
		this.am_min = am_min;
	}


	public Double getAm_max() {
		return am_max;
	}


	public void setAm_max(Double am_max) {
		this.am_max = am_max;
	}


	public Double getMgo_min() {
		return mgo_min;
	}


	public void setMgo_min(Double mgo_min) {
		this.mgo_min = mgo_min;
	}


	public Double getMgo_max() {
		return mgo_max;
	}


	public void setMgo_max(Double mgo_max) {
		this.mgo_max = mgo_max;
	}


	public Double getK2o_min() {
		return k2o_min;
	}


	public void setK2o_min(Double k2o_min) {
		this.k2o_min = k2o_min;
	}


	public Double getK2o_max() {
		return k2o_max;
	}


	public void setK2o_max(Double k2o_max) {
		this.k2o_max = k2o_max;
	}


	public Double getFcao_min() {
		return fcao_min;
	}


	public void setFcao_min(Double fcao_min) {
		this.fcao_min = fcao_min;
	}


	public Double getFcao_max() {
		return fcao_max;
	}


	public void setFcao_max(Double fcao_max) {
		this.fcao_max = fcao_max;
	}


	public Double getC3s_min() {
		return c3s_min;
	}


	public void setC3s_min(Double c3s_min) {
		this.c3s_min = c3s_min;
	}


	public Double getC3s_max() {
		return c3s_max;
	}


	public void setC3s_max(Double c3s_max) {
		this.c3s_max = c3s_max;
	}


	public Double getC2s_min() {
		return c2s_min;
	}


	public void setC2s_min(Double c2s_min) {
		this.c2s_min = c2s_min;
	}


	public Double getC2s_max() {
		return c2s_max;
	}


	public void setC2s_max(Double c2s_max) {
		this.c2s_max = c2s_max;
	}


	public Double getIr_min() {
		return ir_min;
	}


	public void setIr_min(Double ir_min) {
		this.ir_min = ir_min;
	}


	public Double getIr_max() {
		return ir_max;
	}


	public void setIr_max(Double ir_max) {
		this.ir_max = ir_max;
	}


	public Double getR212_max() {
		return r212_max;
	}


	public void setR212_max(Double r212_max) {
		this.r212_max = r212_max;
	}


	public Double getR212_min() {
		return r212_min;
	}


	public void setR212_min(Double r212_min) {
		this.r212_min = r212_min;
	}


	public Double getC3s_c2s_min() {
		return c3s_c2s_min;
	}


	public void setC3s_c2s_min(Double c3s_c2s_min) {
		this.c3s_c2s_min = c3s_c2s_min;
	}


	public Double getC3s_c2s_max() {
		return c3s_c2s_max;
	}


	public void setC3s_c2s_max(Double c3s_c2s_max) {
		this.c3s_c2s_max = c3s_c2s_max;
	}


	public Double getC3a_min() {
		return c3a_min;
	}


	public void setC3a_min(Double c3a_min) {
		this.c3a_min = c3a_min;
	}


	public Double getC3a_max() {
		return c3a_max;
	}


	public void setC3a_max(Double c3a_max) {
		this.c3a_max = c3a_max;
	}


	public Double getCao_max() {
		return cao_max;
	}


	public void setCao_max(Double cao_max) {
		this.cao_max = cao_max;
	}


	public Double getCao_min() {
		return cao_min;
	}


	public void setCao_min(Double cao_min) {
		this.cao_min = cao_min;
	}


	public Double getFe2o3_min() {
		return fe2o3_min;
	}


	public void setFe2o3_min(Double fe2o3_min) {
		this.fe2o3_min = fe2o3_min;
	}


	public Double getFe2o3_max() {
		return fe2o3_max;
	}


	public void setFe2o3_max(Double fe2o3_max) {
		this.fe2o3_max = fe2o3_max;
	}


	public Double getR45_min() {
		return r45_min;
	}


	public void setR45_min(Double r45_min) {
		this.r45_min = r45_min;
	}


	public Double getR45_max() {
		return r45_max;
	}


	public void setR45_max(Double r45_max) {
		this.r45_max = r45_max;
	}


	public Double getLime_max() {
		return lime_max;
	}


	public void setLime_max(Double lime_max) {
		this.lime_max = lime_max;
	}


	public Double getLime_min() {
		return lime_min;
	}


	public void setLime_min(Double lime_min) {
		this.lime_min = lime_min;
	}


	public Double getNcv_max() {
		return ncv_max;
	}


	public void setNcv_max(Double ncv_max) {
		this.ncv_max = ncv_max;
	}


	public Double getNcv_min() {
		return ncv_min;
	}


	public void setNcv_min(Double ncv_min) {
		this.ncv_min = ncv_min;
	}


	public Double getR_90_max() {
		return r_90_max;
	}


	public void setR_90_max(Double r_90_max) {
		this.r_90_max = r_90_max;
	}


	public Double getR_90_min() {
		return r_90_min;
	}


	public void setR_90_min(Double r_90_min) {
		this.r_90_min = r_90_min;
	}


	public Double getActive() {
		return active;
	}


	public void setActive(Double active) {
		this.active = active;
	}


	public Double getSio2_min() {
		return sio2_min;
	}


	public void setSio2_min(Double sio2_min) {
		this.sio2_min = sio2_min;
	}


	public Double getSio2_max() {
		return sio2_max;
	}


	public void setSio2_max(Double sio2_max) {
		this.sio2_max = sio2_max;
	}


	public Double getAl2o3_min() {
		return al2o3_min;
	}


	public void setAl2o3_min(Double al2o3_min) {
		this.al2o3_min = al2o3_min;
	}


	public Double getAl2o3_max() {
		return al2o3_max;
	}


	public void setAl2o3_max(Double al2o3_max) {
		this.al2o3_max = al2o3_max;
	}


	public Double getTio2_min() {
		return tio2_min;
	}


	public void setTio2_min(Double tio2_min) {
		this.tio2_min = tio2_min;
	}


	public Double getTio2_max() {
		return tio2_max;
	}


	public void setTio2_max(Double tio2_max) {
		this.tio2_max = tio2_max;
	}


	public Double getP2o5_min() {
		return p2o5_min;
	}


	public void setP2o5_min(Double p2o5_min) {
		this.p2o5_min = p2o5_min;
	}


	public Double getP2o5_max() {
		return p2o5_max;
	}


	public void setP2o5_max(Double p2o5_max) {
		this.p2o5_max = p2o5_max;
	}


	public Double getLoi_min() {
		return loi_min;
	}


	public void setLoi_min(Double loi_min) {
		this.loi_min = loi_min;
	}


	public Double getLoi_max() {
		return loi_max;
	}


	public void setLoi_max(Double loi_max) {
		this.loi_max = loi_max;
	}


	public Double getSum_min() {
		return sum_min;
	}


	public void setSum_min(Double sum_min) {
		this.sum_min = sum_min;
	}


	public Double getSum_max() {
		return sum_max;
	}


	public void setSum_max(Double sum_max) {
		this.sum_max = sum_max;
	}


	public Double getNaeq_min() {
		return naeq_min;
	}


	public void setNaeq_min(Double naeq_min) {
		this.naeq_min = naeq_min;
	}


	public Double getNaeq_max() {
		return naeq_max;
	}


	public void setNaeq_max(Double naeq_max) {
		this.naeq_max = naeq_max;
	}


	public Double getFsilica_min() {
		return fsilica_min;
	}


	public void setFsilica_min(Double fsilica_min) {
		this.fsilica_min = fsilica_min;
	}


	public Double getFsilica_max() {
		return fsilica_max;
	}


	public void setFsilica_max(Double fsilica_max) {
		this.fsilica_max = fsilica_max;
	}


	public Double getBf_min() {
		return bf_min;
	}


	public void setBf_min(Double bf_min) {
		this.bf_min = bf_min;
	}


	public Double getBf_max() {
		return bf_max;
	}


	public void setBf_max(Double bf_max) {
		this.bf_max = bf_max;
	}


	public Double getLc_min() {
		return lc_min;
	}


	public void setLc_min(Double lc_min) {
		this.lc_min = lc_min;
	}


	public Double getLc_max() {
		return lc_max;
	}


	public void setLc_max(Double lc_max) {
		this.lc_max = lc_max;
	}


	public Double getAs_min() {
		return as_min;
	}


	public void setAs_min(Double as_min) {
		this.as_min = as_min;
	}


	public Double getAs_max() {
		return as_max;
	}


	public void setAs_max(Double as_max) {
		this.as_max = as_max;
	}


	public Double getSa_min() {
		return sa_min;
	}


	public void setSa_min(Double sa_min) {
		this.sa_min = sa_min;
	}


	public Double getSa_max() {
		return sa_max;
	}


	public void setSa_max(Double sa_max) {
		this.sa_max = sa_max;
	}


	public Double getMm_min() {
		return mm_min;
	}


	public void setMm_min(Double mm_min) {
		this.mm_min = mm_min;
	}


	public Double getMm_max() {
		return mm_max;
	}


	public void setMm_max(Double mm_max) {
		this.mm_max = mm_max;
	}


	public Double getC4af_min() {
		return c4af_min;
	}


	public void setC4af_min(Double c4af_min) {
		this.c4af_min = c4af_min;
	}


	public Double getC4af_max() {
		return c4af_max;
	}


	public void setC4af_max(Double c4af_max) {
		this.c4af_max = c4af_max;
	}


	public Double getExso3_min() {
		return exso3_min;
	}


	public void setExso3_min(Double exso3_min) {
		this.exso3_min = exso3_min;
	}


	public Double getExso3_max() {
		return exso3_max;
	}


	public void setExso3_max(Double exso3_max) {
		this.exso3_max = exso3_max;
	}


	public Double getHor_min() {
		return hor_min;
	}


	public void setHor_min(Double hor_min) {
		this.hor_min = hor_min;
	}


	public Double getHor_max() {
		return hor_max;
	}


	public void setHor_max(Double hor_max) {
		this.hor_max = hor_max;
	}


	public Double getLtwt_min() {
		return ltwt_min;
	}


	public void setLtwt_min(Double ltwt_min) {
		this.ltwt_min = ltwt_min;
	}


	public Double getLtwt_max() {
		return ltwt_max;
	}


	public void setLtwt_max(Double ltwt_max) {
		this.ltwt_max = ltwt_max;
	}


	public Double getNibs_min() {
		return nibs_min;
	}


	public void setNibs_min(Double nibs_min) {
		this.nibs_min = nibs_min;
	}


	public Double getNibs_max() {
		return nibs_max;
	}


	public void setNibs_max(Double nibs_max) {
		this.nibs_max = nibs_max;
	}


	public Double getNc_min() {
		return nc_min;
	}


	public void setNc_min(Double nc_min) {
		this.nc_min = nc_min;
	}


	public Double getNc_max() {
		return nc_max;
	}


	public void setNc_max(Double nc_max) {
		this.nc_max = nc_max;
	}


	public Double getAutoclv_min() {
		return autoclv_min;
	}


	public void setAutoclv_min(Double autoclv_min) {
		this.autoclv_min = autoclv_min;
	}


	public Double getAutoclv_max() {
		return autoclv_max;
	}


	public void setAutoclv_max(Double autoclv_max) {
		this.autoclv_max = autoclv_max;
	}


	public Double getIst_min() {
		return ist_min;
	}


	public void setIst_min(Double ist_min) {
		this.ist_min = ist_min;
	}


	public Double getIst_max() {
		return ist_max;
	}


	public void setIst_max(Double ist_max) {
		this.ist_max = ist_max;
	}


	public Double getFst_min() {
		return fst_min;
	}


	public void setFst_min(Double fst_min) {
		this.fst_min = fst_min;
	}


	public Double getFst_max() {
		return fst_max;
	}


	public void setFst_max(Double fst_max) {
		this.fst_max = fst_max;
	}


	public Double getPi_min() {
		return pi_min;
	}


	public void setPi_min(Double pi_min) {
		this.pi_min = pi_min;
	}


	public Double getSio2_target() {
		return sio2_target;
	}


	public void setSio2_target(Double sio2_target) {
		this.sio2_target = sio2_target;
	}


	public Double getAl2o3_target() {
		return al2o3_target;
	}


	public void setAl2o3_target(Double al2o3_target) {
		this.al2o3_target = al2o3_target;
	}


	public Double getFe2o3_target() {
		return fe2o3_target;
	}


	public void setFe2o3_target(Double fe2o3_target) {
		this.fe2o3_target = fe2o3_target;
	}


	public Double getCao_target() {
		return cao_target;
	}


	public void setCao_target(Double cao_target) {
		this.cao_target = cao_target;
	}


	public Double getMgo_target() {
		return mgo_target;
	}


	public void setMgo_target(Double mgo_target) {
		this.mgo_target = mgo_target;
	}


	public Double getSo3_target() {
		return so3_target;
	}


	public void setSo3_target(Double so3_target) {
		this.so3_target = so3_target;
	}


	public Double getTio2_target() {
		return tio2_target;
	}


	public void setTio2_target(Double tio2_target) {
		this.tio2_target = tio2_target;
	}


	public Double getSum_target() {
		return sum_target;
	}


	public void setSum_target(Double sum_target) {
		this.sum_target = sum_target;
	}


	public Double getLime_target() {
		return lime_target;
	}


	public void setLime_target(Double lime_target) {
		this.lime_target = lime_target;
	}


	public Double getNaeq_target() {
		return naeq_target;
	}


	public void setNaeq_target(Double naeq_target) {
		this.naeq_target = naeq_target;
	}


	public Double getIr_target() {
		return ir_target;
	}


	public void setIr_target(Double ir_target) {
		this.ir_target = ir_target;
	}


	public Double getAls_target() {
		return als_target;
	}


	public void setAls_target(Double als_target) {
		this.als_target = als_target;
	}


	public Double getSla_target() {
		return sla_target;
	}


	public void setSla_target(Double sla_target) {
		this.sla_target = sla_target;
	}


	public Double getAls_min() {
		return als_min;
	}


	public void setAls_min(Double als_min) {
		this.als_min = als_min;
	}


	public Double getAls_max() {
		return als_max;
	}


	public void setAls_max(Double als_max) {
		this.als_max = als_max;
	}


	public Double getSla_max() {
		return sla_max;
	}


	public void setSla_max(Double sla_max) {
		this.sla_max = sla_max;
	}


	public Double getSla_min() {
		return sla_min;
	}


	public void setSla_min(Double sla_min) {
		this.sla_min = sla_min;
	}


	public Double getLsf_target() {
		return lsf_target;
	}


	public void setLsf_target(Double lsf_target) {
		this.lsf_target = lsf_target;
	}


	public Double getSm_target() {
		return sm_target;
	}


	public void setSm_target(Double sm_target) {
		this.sm_target = sm_target;
	}


	public Double getAm_target() {
		return am_target;
	}


	public void setAm_target(Double am_target) {
		this.am_target = am_target;
	}


	public Double getMm_target() {
		return mm_target;
	}


	public void setMm_target(Double mm_target) {
		this.mm_target = mm_target;
	}


	public Double getC3s_target() {
		return c3s_target;
	}


	public void setC3s_target(Double c3s_target) {
		this.c3s_target = c3s_target;
	}


	public Double getC2s_target() {
		return c2s_target;
	}


	public void setC2s_target(Double c2s_target) {
		this.c2s_target = c2s_target;
	}


	public Double getC3a_target() {
		return c3a_target;
	}


	public void setC3a_target(Double c3a_target) {
		this.c3a_target = c3a_target;
	}


	public Double getC4af_target() {
		return c4af_target;
	}


	public void setC4af_target(Double c4af_target) {
		this.c4af_target = c4af_target;
	}


	public Double getEx_so3_target() {
		return ex_so3_target;
	}


	public void setEx_so3_target(Double ex_so3_target) {
		this.ex_so3_target = ex_so3_target;
	}


	public Double getC3s_c2s_target() {
		return c3s_c2s_target;
	}


	public void setC3s_c2s_target(Double c3s_c2s_target) {
		this.c3s_c2s_target = c3s_c2s_target;
	}


	public Double getHor_target() {
		return hor_target;
	}


	public void setHor_target(Double hor_target) {
		this.hor_target = hor_target;
	}


	public Double getNibs_target() {
		return nibs_target;
	}


	public void setNibs_target(Double nibs_target) {
		this.nibs_target = nibs_target;
	}


	public Double getBlaine_target() {
		return blaine_target;
	}


	public void setBlaine_target(Double blaine_target) {
		this.blaine_target = blaine_target;
	}


	public Double getR45_target() {
		return r45_target;
	}


	public void setR45_target(Double r45_target) {
		this.r45_target = r45_target;
	}


	public Double getAc_min() {
		return ac_min;
	}


	public void setAc_min(Double ac_min) {
		this.ac_min = ac_min;
	}


	public Double getAc_max() {
		return ac_max;
	}


	public void setAc_max(Double ac_max) {
		this.ac_max = ac_max;
	}


	public Double getAc_target() {
		return ac_target;
	}


	public void setAc_target(Double ac_target) {
		this.ac_target = ac_target;
	}


	public Double getNc_target() {
		return nc_target;
	}


	public void setNc_target(Double nc_target) {
		this.nc_target = nc_target;
	}


	public Double getLc_target() {
		return lc_target;
	}


	public void setLc_target(Double lc_target) {
		this.lc_target = lc_target;
	}


	public Double getLst_target() {
		return lst_target;
	}


	public void setLst_target(Double lst_target) {
		this.lst_target = lst_target;
	}


	public Double getFst_target() {
		return fst_target;
	}


	public void setFst_target(Double fst_target) {
		this.fst_target = fst_target;
	}


	public Double getDay1_target() {
		return day1_target;
	}


	public void setDay1_target(Double day1_target) {
		this.day1_target = day1_target;
	}


	public Double getDay3_target() {
		return day3_target;
	}


	public void setDay3_target(Double day3_target) {
		this.day3_target = day3_target;
	}


	public Double getDay7_target() {
		return day7_target;
	}


	public void setDay7_target(Double day7_target) {
		this.day7_target = day7_target;
	}


	public Double getDay28_target() {
		return day28_target;
	}


	public void setDay28_target(Double day28_target) {
		this.day28_target = day28_target;
	}


	public Double getR90_target() {
		return r90_target;
	}


	public void setR90_target(Double r90_target) {
		this.r90_target = r90_target;
	}


	public Double getR212_target() {
		return r212_target;
	}


	public void setR212_target(Double r212_target) {
		this.r212_target = r212_target;
	}


	public Double getR40_target() {
		return r40_target;
	}


	public void setR40_target(Double r40_target) {
		this.r40_target = r40_target;
	}


	public Double getR30_target() {
		return r30_target;
	}


	public void setR30_target(Double r30_target) {
		this.r30_target = r30_target;
	}


	public Double getR30_min() {
		return r30_min;
	}


	public void setR30_min(Double r30_min) {
		this.r30_min = r30_min;
	}


	public Double getR30_max() {
		return r30_max;
	}


	public void setR30_max(Double r30_max) {
		this.r30_max = r30_max;
	}


	public Double getR20_target() {
		return r20_target;
	}


	public void setR20_target(Double r20_target) {
		this.r20_target = r20_target;
	}


	public Double getR20_min() {
		return r20_min;
	}


	public void setR20_min(Double r20_min) {
		this.r20_min = r20_min;
	}


	public Double getR20_max() {
		return r20_max;
	}


	public void setR20_max(Double r20_max) {
		this.r20_max = r20_max;
	}


	public Double getR10_target() {
		return r10_target;
	}


	public void setR10_target(Double r10_target) {
		this.r10_target = r10_target;
	}


	public Double getR10_min() {
		return r10_min;
	}


	public void setR10_min(Double r10_min) {
		this.r10_min = r10_min;
	}


	public Double getR10_max() {
		return r10_max;
	}


	public void setR10_max(Double r10_max) {
		this.r10_max = r10_max;
	}


	public Double getR3_target() {
		return r3_target;
	}


	public void setR3_target(Double r3_target) {
		this.r3_target = r3_target;
	}


	public Double getR3_min() {
		return r3_min;
	}


	public void setR3_min(Double r3_min) {
		this.r3_min = r3_min;
	}


	public Double getR3_max() {
		return r3_max;
	}


	public void setR3_max(Double r3_max) {
		this.r3_max = r3_max;
	}


	public Double getR33_target() {
		return r33_target;
	}


	public void setR33_target(Double r33_target) {
		this.r33_target = r33_target;
	}


	public Double getR33_min() {
		return r33_min;
	}


	public void setR33_min(Double r33_min) {
		this.r33_min = r33_min;
	}


	public Double getR33_max() {
		return r33_max;
	}


	public void setR33_max(Double r33_max) {
		this.r33_max = r33_max;
	}


	public Double getDs_min() {
		return ds_min;
	}


	public void setDs_min(Double ds_min) {
		this.ds_min = ds_min;
	}


	public Double getDs_max() {
		return ds_max;
	}


	public void setDs_max(Double ds_max) {
		this.ds_max = ds_max;
	}


	public Double getPi_max() {
		return pi_max;
	}


	public void setPi_max(Double pi_max) {
		this.pi_max = pi_max;
	}


	public Double getPitarget() {
		return pitarget;
	}


	public void setPitarget(Double pitarget) {
		this.pitarget = pitarget;
	}


	public Double getDs_target() {
		return ds_target;
	}


	public void setDs_target(Double ds_target) {
		this.ds_target = ds_target;
	}


	public Double getFlyash_min() {
		return flyash_min;
	}


	public void setFlyash_min(Double flyash_min) {
		this.flyash_min = flyash_min;
	}


	public Double getFlyash_max() {
		return flyash_max;
	}


	public void setFlyash_max(Double flyash_max) {
		this.flyash_max = flyash_max;
	}


	public Double getFlyash_target() {
		return flyash_target;
	}


	public void setFlyash_target(Double flyash_target) {
		this.flyash_target = flyash_target;
	}


	public Double getSlag_min() {
		return slag_min;
	}


	public void setSlag_min(Double slag_min) {
		this.slag_min = slag_min;
	}


	public Double getSlag_max() {
		return slag_max;
	}


	public void setSlag_max(Double slag_max) {
		this.slag_max = slag_max;
	}


	public Double getSlag_target() {
		return slag_target;
	}


	public void setSlag_target(Double slag_target) {
		this.slag_target = slag_target;
	}


	public Double getF_silica_min() {
		return f_silica_min;
	}


	public void setF_silica_min(Double f_silica_min) {
		this.f_silica_min = f_silica_min;
	}


	public Double getF_silica_max() {
		return f_silica_max;
	}


	public void setF_silica_max(Double f_silica_max) {
		this.f_silica_max = f_silica_max;
	}


	public Double getF_silica_target() {
		return f_silica_target;
	}


	public void setF_silica_target(Double f_silica_target) {
		this.f_silica_target = f_silica_target;
	}


	public Double getNcv_target() {
		return ncv_target;
	}


	public void setNcv_target(Double ncv_target) {
		this.ncv_target = ncv_target;
	}


	public Double getColor_target() {
		return color_target;
	}


	public void setColor_target(Double color_target) {
		this.color_target = color_target;
	}


	public Double getR40_min() {
		return r40_min;
	}


	public void setR40_min(Double r40_min) {
		this.r40_min = r40_min;
	}


	public Double getR40_max() {
		return r40_max;
	}


	public void setR40_max(Double r40_max) {
		this.r40_max = r40_max;
	}


	public Double getLoi_kf_min() {
		return loi_kf_min;
	}


	public void setLoi_kf_min(Double loi_kf_min) {
		this.loi_kf_min = loi_kf_min;
	}


	public Double getLoi_kf_max() {
		return loi_kf_max;
	}


	public void setLoi_kf_max(Double loi_kf_max) {
		this.loi_kf_max = loi_kf_max;
	}


	public Double getLoi_kf_target() {
		return loi_kf_target;
	}


	public void setLoi_kf_target(Double loi_kf_target) {
		this.loi_kf_target = loi_kf_target;
	}


	public Double getLoi_hm_min() {
		return loi_hm_min;
	}


	public void setLoi_hm_min(Double loi_hm_min) {
		this.loi_hm_min = loi_hm_min;
	}


	public Double getLoi_hm_max() {
		return loi_hm_max;
	}


	public void setLoi_hm_max(Double loi_hm_max) {
		this.loi_hm_max = loi_hm_max;
	}


	public Double getLoi_hm_target() {
		return loi_hm_target;
	}


	public void setLoi_hm_target(Double loi_hm_target) {
		this.loi_hm_target = loi_hm_target;
	}


	public Double getAsh_min() {
		return ash_min;
	}


	public void setAsh_min(Double ash_min) {
		this.ash_min = ash_min;
	}


	public Double getAsh_max() {
		return ash_max;
	}


	public void setAsh_max(Double ash_max) {
		this.ash_max = ash_max;
	}


	public Double getAsh_target() {
		return ash_target;
	}


	public void setAsh_target(Double ash_target) {
		this.ash_target = ash_target;
	}


	public Double getCmt_temp_min() {
		return cmt_temp_min;
	}


	public void setCmt_temp_min(Double cmt_temp_min) {
		this.cmt_temp_min = cmt_temp_min;
	}


	public Double getCmt_temp_max() {
		return cmt_temp_max;
	}


	public void setCmt_temp_max(Double cmt_temp_max) {
		this.cmt_temp_max = cmt_temp_max;
	}


	public Double getCmt_temp_target() {
		return cmt_temp_target;
	}


	public void setCmt_temp_target(Double cmt_temp_target) {
		this.cmt_temp_target = cmt_temp_target;
	}


	public Double getPsd_bet_3and30_min() {
		return psd_bet_3and30_min;
	}


	public void setPsd_bet_3and30_min(Double psd_bet_3and30_min) {
		this.psd_bet_3and30_min = psd_bet_3and30_min;
	}


	public Double getPsd_bet_3and30_max() {
		return psd_bet_3and30_max;
	}


	public void setPsd_bet_3and30_max(Double psd_bet_3and30_max) {
		this.psd_bet_3and30_max = psd_bet_3and30_max;
	}


	public Double getPsd_bet_3and30_target() {
		return psd_bet_3and30_target;
	}


	public void setPsd_bet_3and30_target(Double psd_bet_3and30_target) {
		this.psd_bet_3and30_target = psd_bet_3and30_target;
	}


	public Double getPsd_above_30_min() {
		return psd_above_30_min;
	}


	public void setPsd_above_30_min(Double psd_above_30_min) {
		this.psd_above_30_min = psd_above_30_min;
	}


	public Double getPsd_above_30_max() {
		return psd_above_30_max;
	}


	public void setPsd_above_30_max(Double psd_above_30_max) {
		this.psd_above_30_max = psd_above_30_max;
	}


	public Double getPsd_above_30_target() {
		return psd_above_30_target;
	}


	public void setPsd_above_30_target(Double psd_above_30_target) {
		this.psd_above_30_target = psd_above_30_target;
	}


	public Double getPsd_above_45_min() {
		return psd_above_45_min;
	}


	public void setPsd_above_45_min(Double psd_above_45_min) {
		this.psd_above_45_min = psd_above_45_min;
	}


	public Double getPsd_above_45_max() {
		return psd_above_45_max;
	}


	public void setPsd_above_45_max(Double psd_above_45_max) {
		this.psd_above_45_max = psd_above_45_max;
	}


	public Double getPsd_above_45_target() {
		return psd_above_45_target;
	}


	public void setPsd_above_45_target(Double psd_above_45_target) {
		this.psd_above_45_target = psd_above_45_target;
	}


	public Double getPsd_above_50_min() {
		return psd_above_50_min;
	}


	public void setPsd_above_50_min(Double psd_above_50_min) {
		this.psd_above_50_min = psd_above_50_min;
	}


	public Double getPsd_above_50_max() {
		return psd_above_50_max;
	}


	public void setPsd_above_50_max(Double psd_above_50_max) {
		this.psd_above_50_max = psd_above_50_max;
	}


	public Double getPsd_above_50_target() {
		return psd_above_50_target;
	}


	public void setPsd_above_50_target(Double psd_above_50_target) {
		this.psd_above_50_target = psd_above_50_target;
	}


	public Double getPsd_above_90_min() {
		return psd_above_90_min;
	}


	public void setPsd_above_90_min(Double psd_above_90_min) {
		this.psd_above_90_min = psd_above_90_min;
	}


	public Double getPsd_above_90_max() {
		return psd_above_90_max;
	}


	public void setPsd_above_90_max(Double psd_above_90_max) {
		this.psd_above_90_max = psd_above_90_max;
	}


	public Double getPsd_above_90_target() {
		return psd_above_90_target;
	}


	public void setPsd_above_90_target(Double psd_above_90_target) {
		this.psd_above_90_target = psd_above_90_target;
	}


	public Double getPsd_below_20_min() {
		return psd_below_20_min;
	}


	public void setPsd_below_20_min(Double psd_below_20_min) {
		this.psd_below_20_min = psd_below_20_min;
	}


	public Double getPsd_below_20_max() {
		return psd_below_20_max;
	}


	public void setPsd_below_20_max(Double psd_below_20_max) {
		this.psd_below_20_max = psd_below_20_max;
	}


	public Double getPsd_below_20_target() {
		return psd_below_20_target;
	}


	public void setPsd_below_20_target(Double psd_below_20_target) {
		this.psd_below_20_target = psd_below_20_target;
	}


	public Double getPsd_below_5_min() {
		return psd_below_5_min;
	}


	public void setPsd_below_5_min(Double psd_below_5_min) {
		this.psd_below_5_min = psd_below_5_min;
	}


	public Double getPsd_below_5_max() {
		return psd_below_5_max;
	}


	public void setPsd_below_5_max(Double psd_below_5_max) {
		this.psd_below_5_max = psd_below_5_max;
	}


	public Double getPsd_below_5_target() {
		return psd_below_5_target;
	}


	public void setPsd_below_5_target(Double psd_below_5_target) {
		this.psd_below_5_target = psd_below_5_target;
	}


	public Double getPsd_above_212_min() {
		return psd_above_212_min;
	}


	public void setPsd_above_212_min(Double psd_above_212_min) {
		this.psd_above_212_min = psd_above_212_min;
	}


	public Double getPsd_above_212_max() {
		return psd_above_212_max;
	}


	public void setPsd_above_212_max(Double psd_above_212_max) {
		this.psd_above_212_max = psd_above_212_max;
	}


	public Double getPsd_above_212_target() {
		return psd_above_212_target;
	}


	public void setPsd_above_212_target(Double psd_above_212_target) {
		this.psd_above_212_target = psd_above_212_target;
	}


	public Double getLrcr10_min() {
		return lrcr10_min;
	}


	public void setLrcr10_min(Double lrcr10_min) {
		this.lrcr10_min = lrcr10_min;
	}


	public Double getLrcr10_max() {
		return lrcr10_max;
	}


	public void setLrcr10_max(Double lrcr10_max) {
		this.lrcr10_max = lrcr10_max;
	}


	public Double getLrcr10_target() {
		return lrcr10_target;
	}


	public void setLrcr10_target(Double lrcr10_target) {
		this.lrcr10_target = lrcr10_target;
	}


	public Double getLrcr28_min() {
		return lrcr28_min;
	}


	public void setLrcr28_min(Double lrcr28_min) {
		this.lrcr28_min = lrcr28_min;
	}


	public Double getLrcr28_max() {
		return lrcr28_max;
	}


	public void setLrcr28_max(Double lrcr28_max) {
		this.lrcr28_max = lrcr28_max;
	}


	public Double getLrcr28_target() {
		return lrcr28_target;
	}


	public void setLrcr28_target(Double lrcr28_target) {
		this.lrcr28_target = lrcr28_target;
	}


	public Double getAlkaliso3_min() {
		return alkaliso3_min;
	}


	public void setAlkaliso3_min(Double alkaliso3_min) {
		this.alkaliso3_min = alkaliso3_min;
	}


	public Double getAlkaliso3_max() {
		return alkaliso3_max;
	}


	public void setAlkaliso3_max(Double alkaliso3_max) {
		this.alkaliso3_max = alkaliso3_max;
	}


	public Double getAlkaliso3_target() {
		return alkaliso3_target;
	}


	public void setAlkaliso3_target(Double alkaliso3_target) {
		this.alkaliso3_target = alkaliso3_target;
	}


	public Double getSo3alkai_min() {
		return so3alkai_min;
	}


	public void setSo3alkai_min(Double so3alkai_min) {
		this.so3alkai_min = so3alkai_min;
	}


	public Double getSo3alkai_max() {
		return so3alkai_max;
	}


	public void setSo3alkai_max(Double so3alkai_max) {
		this.so3alkai_max = so3alkai_max;
	}


	public Double getSo3alkai_target() {
		return so3alkai_target;
	}


	public void setSo3alkai_target(Double so3alkai_target) {
		this.so3alkai_target = so3alkai_target;
	}


	public Double getLtwt_target() {
		return ltwt_target;
	}


	public void setLtwt_target(Double ltwt_target) {
		this.ltwt_target = ltwt_target;
	}


	public Double getBallmillso3_min() {
		return ballmillso3_min;
	}


	public void setBallmillso3_min(Double ballmillso3_min) {
		this.ballmillso3_min = ballmillso3_min;
	}


	public Double getBallmillso3_max() {
		return ballmillso3_max;
	}


	public void setBallmillso3_max(Double ballmillso3_max) {
		this.ballmillso3_max = ballmillso3_max;
	}


	public Double getBallmillso3_target() {
		return ballmillso3_target;
	}


	public void setBallmillso3_target(Double ballmillso3_target) {
		this.ballmillso3_target = ballmillso3_target;
	}


	public Double getLiquid_min() {
		return liquid_min;
	}


	public void setLiquid_min(Double liquid_min) {
		this.liquid_min = liquid_min;
	}


	public Double getLiquid_max() {
		return liquid_max;
	}


	public void setLiquid_max(Double liquid_max) {
		this.liquid_max = liquid_max;
	}


	public Double getLiquid_target() {
		return liquid_target;
	}


	public void setLiquid_target(Double liquid_target) {
		this.liquid_target = liquid_target;
	}


	public Double getBf_target() {
		return bf_target;
	}


	public void setBf_target(Double bf_target) {
		this.bf_target = bf_target;
	}


	public Double getMoisture_min() {
		return moisture_min;
	}


	public void setMoisture_min(Double moisture_min) {
		this.moisture_min = moisture_min;
	}


	public Double getMoisture_max() {
		return moisture_max;
	}


	public void setMoisture_max(Double moisture_max) {
		this.moisture_max = moisture_max;
	}


	public Double getMoisture_target() {
		return moisture_target;
	}


	public void setMoisture_target(Double moisture_target) {
		this.moisture_target = moisture_target;
	}


	public Double getVolatile_moisture_min() {
		return volatile_moisture_min;
	}


	public void setVolatile_moisture_min(Double volatile_moisture_min) {
		this.volatile_moisture_min = volatile_moisture_min;
	}


	public Double getVolatile_moisture_max() {
		return volatile_moisture_max;
	}


	public void setVolatile_moisture_max(Double volatile_moisture_max) {
		this.volatile_moisture_max = volatile_moisture_max;
	}


	public Double getVolatile_moisture_target() {
		return volatile_moisture_target;
	}


	public void setVolatile_moisture_target(Double volatile_moisture_target) {
		this.volatile_moisture_target = volatile_moisture_target;
	}


	public Double getInherient_moisture_min() {
		return inherient_moisture_min;
	}


	public void setInherient_moisture_min(Double inherient_moisture_min) {
		this.inherient_moisture_min = inherient_moisture_min;
	}


	public Double getInherient_moisture_max() {
		return inherient_moisture_max;
	}


	public void setInherient_moisture_max(Double inherient_moisture_max) {
		this.inherient_moisture_max = inherient_moisture_max;
	}


	public Double getInherient_moisture_target() {
		return inherient_moisture_target;
	}


	public void setInherient_moisture_target(Double inherient_moisture_target) {
		this.inherient_moisture_target = inherient_moisture_target;
	}


	public Double getFree_moisture_min() {
		return free_moisture_min;
	}


	public void setFree_moisture_min(Double free_moisture_min) {
		this.free_moisture_min = free_moisture_min;
	}


	public Double getFree_moisture_max() {
		return free_moisture_max;
	}


	public void setFree_moisture_max(Double free_moisture_max) {
		this.free_moisture_max = free_moisture_max;
	}


	public Double getFree_moisture_target() {
		return free_moisture_target;
	}


	public void setFree_moisture_target(Double free_moisture_target) {
		this.free_moisture_target = free_moisture_target;
	}


	public Double getR2o3_min() {
		return r2o3_min;
	}


	public void setR2o3_min(Double r2o3_min) {
		this.r2o3_min = r2o3_min;
	}


	public Double getR2o3_max() {
		return r2o3_max;
	}


	public void setR2o3_max(Double r2o3_max) {
		this.r2o3_max = r2o3_max;
	}


	public Double getR2o3_target() {
		return r2o3_target;
	}


	public void setR2o3_target(Double r2o3_target) {
		this.r2o3_target = r2o3_target;
	}


	public Double getPurity_min() {
		return purity_min;
	}


	public void setPurity_min(Double purity_min) {
		this.purity_min = purity_min;
	}


	public Double getPurity_max() {
		return purity_max;
	}


	public void setPurity_max(Double purity_max) {
		this.purity_max = purity_max;
	}


	public Double getPurity_target() {
		return purity_target;
	}


	public void setPurity_target(Double purity_target) {
		this.purity_target = purity_target;
	}


	public Double getMn2o3_min() {
		return mn2o3_min;
	}


	public void setMn2o3_min(Double mn2o3_min) {
		this.mn2o3_min = mn2o3_min;
	}


	public Double getMn2o3_max() {
		return mn2o3_max;
	}


	public void setMn2o3_max(Double mn2o3_max) {
		this.mn2o3_max = mn2o3_max;
	}


	public Double getMn2o3_target() {
		return mn2o3_target;
	}


	public void setMn2o3_target(Double mn2o3_target) {
		this.mn2o3_target = mn2o3_target;
	}


	public Double getCl_min() {
		return cl_min;
	}


	public void setCl_min(Double cl_min) {
		this.cl_min = cl_min;
	}


	public Double getCl_max() {
		return cl_max;
	}


	public void setCl_max(Double cl_max) {
		this.cl_max = cl_max;
	}


	public Double getCl_target() {
		return cl_target;
	}


	public void setCl_target(Double cl_target) {
		this.cl_target = cl_target;
	}


	public Double getSulphur_min() {
		return sulphur_min;
	}


	public void setSulphur_min(Double sulphur_min) {
		this.sulphur_min = sulphur_min;
	}


	public Double getSulphur_max() {
		return sulphur_max;
	}


	public void setSulphur_max(Double sulphur_max) {
		this.sulphur_max = sulphur_max;
	}


	public Double getSulphur_target() {
		return sulphur_target;
	}


	public void setSulphur_target(Double sulphur_target) {
		this.sulphur_target = sulphur_target;
	}


	public Double getSo3_max() {
		return so3_max;
	}


	public void setSo3_max(Double so3_max) {
		this.so3_max = so3_max;
	}


	public Double getSo3_min() {
		return so3_min;
	}


	public void setSo3_min(Double so3_min) {
		this.so3_min = so3_min;
	}


	public Double getNa2o_max() {
		return na2o_max;
	}


	public void setNa2o_max(Double na2o_max) {
		this.na2o_max = na2o_max;
	}


	public Double getNa2o_min() {
		return na2o_min;
	}


	public void setNa2o_min(Double na2o_min) {
		this.na2o_min = na2o_min;
	}


	public Double getNa2o_target() {
		return na2o_target;
	}


	public void setNa2o_target(Double na2o_target) {
		this.na2o_target = na2o_target;
	}


	public Double getK2o_target() {
		return k2o_target;
	}


	public void setK2o_target(Double k2o_target) {
		this.k2o_target = k2o_target;
	}


	public Double getP2o5_target() {
		return p2o5_target;
	}


	public void setP2o5_target(Double p2o5_target) {
		this.p2o5_target = p2o5_target;
	}


	public Double getLoi_target() {
		return loi_target;
	}


	public void setLoi_target(Double loi_target) {
		this.loi_target = loi_target;
	}


	public Double getBomb_cal_target() {
		return bomb_cal_target;
	}


	public void setBomb_cal_target(Double bomb_cal_target) {
		this.bomb_cal_target = bomb_cal_target;
	}


	public Double getDegreecalci_min() {
		return degreecalci_min;
	}


	public void setDegreecalci_min(Double degreecalci_min) {
		this.degreecalci_min = degreecalci_min;
	}


	public Double getDegreecalci_max() {
		return degreecalci_max;
	}


	public void setDegreecalci_max(Double degreecalci_max) {
		this.degreecalci_max = degreecalci_max;
	}


	public Double getDegreecalci_target() {
		return degreecalci_target;
	}


	public void setDegreecalci_target(Double degreecalci_target) {
		this.degreecalci_target = degreecalci_target;
	}


	public Double getGcv_airdrybasis_min() {
		return gcv_airdrybasis_min;
	}


	public void setGcv_airdrybasis_min(Double gcv_airdrybasis_min) {
		this.gcv_airdrybasis_min = gcv_airdrybasis_min;
	}


	public Double getGcv_airdrybasis_max() {
		return gcv_airdrybasis_max;
	}


	public void setGcv_airdrybasis_max(Double gcv_airdrybasis_max) {
		this.gcv_airdrybasis_max = gcv_airdrybasis_max;
	}


	public Double getGcv_airdrybasis_target() {
		return gcv_airdrybasis_target;
	}


	public void setGcv_airdrybasis_target(Double gcv_airdrybasis_target) {
		this.gcv_airdrybasis_target = gcv_airdrybasis_target;
	}


	public Double getGcv_asreceivedbasis_min() {
		return gcv_asreceivedbasis_min;
	}


	public void setGcv_asreceivedbasis_min(Double gcv_asreceivedbasis_min) {
		this.gcv_asreceivedbasis_min = gcv_asreceivedbasis_min;
	}


	public Double getGcv_asreceivedbasis_max() {
		return gcv_asreceivedbasis_max;
	}


	public void setGcv_asreceivedbasis_max(Double gcv_asreceivedbasis_max) {
		this.gcv_asreceivedbasis_max = gcv_asreceivedbasis_max;
	}


	public Double getGcv_asreceivedbasis_target() {
		return gcv_asreceivedbasis_target;
	}


	public void setGcv_asreceivedbasis_target(Double gcv_asreceivedbasis_target) {
		this.gcv_asreceivedbasis_target = gcv_asreceivedbasis_target;
	}


	public Double getArb_freemoisture_min() {
		return arb_freemoisture_min;
	}


	public void setArb_freemoisture_min(Double arb_freemoisture_min) {
		this.arb_freemoisture_min = arb_freemoisture_min;
	}


	public Double getArb_freemoisture_max() {
		return arb_freemoisture_max;
	}


	public void setArb_freemoisture_max(Double arb_freemoisture_max) {
		this.arb_freemoisture_max = arb_freemoisture_max;
	}


	public Double getArb_freemoisture_target() {
		return arb_freemoisture_target;
	}


	public void setArb_freemoisture_target(Double arb_freemoisture_target) {
		this.arb_freemoisture_target = arb_freemoisture_target;
	}


	public Double getArb_totalmoisture_min() {
		return arb_totalmoisture_min;
	}


	public void setArb_totalmoisture_min(Double arb_totalmoisture_min) {
		this.arb_totalmoisture_min = arb_totalmoisture_min;
	}


	public Double getArb_totalmoisture_max() {
		return arb_totalmoisture_max;
	}


	public void setArb_totalmoisture_max(Double arb_totalmoisture_max) {
		this.arb_totalmoisture_max = arb_totalmoisture_max;
	}


	public Double getArb_totalmoisture_target() {
		return arb_totalmoisture_target;
	}


	public void setArb_totalmoisture_target(Double arb_totalmoisture_target) {
		this.arb_totalmoisture_target = arb_totalmoisture_target;
	}


	public Double getAdb_inherientmoisture_min() {
		return adb_inherientmoisture_min;
	}


	public void setAdb_inherientmoisture_min(Double adb_inherientmoisture_min) {
		this.adb_inherientmoisture_min = adb_inherientmoisture_min;
	}


	public Double getAdb_inherientmoisture_max() {
		return adb_inherientmoisture_max;
	}


	public void setAdb_inherientmoisture_max(Double adb_inherientmoisture_max) {
		this.adb_inherientmoisture_max = adb_inherientmoisture_max;
	}


	public Double getAdb_inherientmoisture_target() {
		return adb_inherientmoisture_target;
	}


	public void setAdb_inherientmoisture_target(Double adb_inherientmoisture_target) {
		this.adb_inherientmoisture_target = adb_inherientmoisture_target;
	}


	public Double getAdb_volatilemoisture_min() {
		return adb_volatilemoisture_min;
	}


	public void setAdb_volatilemoisture_min(Double adb_volatilemoisture_min) {
		this.adb_volatilemoisture_min = adb_volatilemoisture_min;
	}


	public Double getAdb_volatilemoisture_max() {
		return adb_volatilemoisture_max;
	}


	public void setAdb_volatilemoisture_max(Double adb_volatilemoisture_max) {
		this.adb_volatilemoisture_max = adb_volatilemoisture_max;
	}


	public Double getAdb_volatilemoisture_target() {
		return adb_volatilemoisture_target;
	}


	public void setAdb_volatilemoisture_target(Double adb_volatilemoisture_target) {
		this.adb_volatilemoisture_target = adb_volatilemoisture_target;
	}


	public Double getAdb_ash_min() {
		return adb_ash_min;
	}


	public void setAdb_ash_min(Double adb_ash_min) {
		this.adb_ash_min = adb_ash_min;
	}


	public Double getAdb_ash_max() {
		return adb_ash_max;
	}


	public void setAdb_ash_max(Double adb_ash_max) {
		this.adb_ash_max = adb_ash_max;
	}


	public Double getAdb_ash_target() {
		return adb_ash_target;
	}


	public void setAdb_ash_target(Double adb_ash_target) {
		this.adb_ash_target = adb_ash_target;
	}


	public Double getAdb_sulphur_min() {
		return adb_sulphur_min;
	}


	public void setAdb_sulphur_min(Double adb_sulphur_min) {
		this.adb_sulphur_min = adb_sulphur_min;
	}


	public Double getAdb_sulphur_max() {
		return adb_sulphur_max;
	}


	public void setAdb_sulphur_max(Double adb_sulphur_max) {
		this.adb_sulphur_max = adb_sulphur_max;
	}


	public Double getAdb_sulphur_target() {
		return adb_sulphur_target;
	}


	public void setAdb_sulphur_target(Double adb_sulphur_target) {
		this.adb_sulphur_target = adb_sulphur_target;
	}

	
	
	

	
	

	
	
	

}
