package com.jksap.dto;

import java.util.List;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

public interface Smpl_collection_repo extends JpaRepository<Smpl_collection, Integer>{


	//************ Select query for Cancel_gateEntryData *******************
	//@Query("SELECT b FROM Smpl_collection b,GrnDataInputCloud gd WHERE b.smpl_id=gd.elims_id and b.grn = :grn and b.smpl_id = :smpl_id and b.p_id = :p_id")
	//List<Smpl_collection> select_smpldataByID(@Param("p_id") Integer p_id,@Param("smpl_id") Integer smpl_id,@Param("grn") String grn);
	

	//************ update query for mst_smpl_collection *******************
    @Transactional
    @Modifying
	@Query("update Smpl_collection u set u.flyash_range = :flyash_range,u.tga_batch_name = :tga_batch_name,u.lims_id = :lims_id,u.degree_of_calci = :degree_of_calci,"
			+ "u.ts_blaine = :ts_blaine ,u.ts_color = :ts_color,u.ts_xrf =:ts_xrf ,u.ts_ctm_1day = :ts_ctm_1day,u.ts_ctm_3day =:ts_ctm_3day ,u.ts_bcal = :ts_bcal,u.pass_fail =:pass_fail,u.ts_ctm_7day=:ts_ctm_7day,u.ts_ctm_28day=:ts_ctm_28day,u.ts_lrcr_10day=:ts_lrcr_10day,u.ts_lrcr_28day=:ts_lrcr_28day,"
			+ "u.grn =:grn,u.smpl_casting_dt=:smpl_casting_dt,u.blaine_test_datetime =:blaine_test_datetime,u.colorindex_test_datetime= :colorindex_test_datetime,u.xrf_test_datetime=:xrf_test_datetime,u.bombcal_test_datetime=:bombcal_test_datetime,u.tga_test_datetime =:tga_test_datetime,u.mb_test_datetime =:mb_test_datetime,u.mw1_test_datetime=:mw1_test_datetime,"
			+ "u.mw2_test_datetime=:mw2_test_datetime,u.airmwt1_test_datetime=:airmwt1_test_datetime,u.airmwt2_test_datetime=:airmwt2_test_datetime,u.airmwt3_test_datetime =:airmwt3_test_datetime,u.psd_test_datetime=:psd_test_datetime,u.smpl_casting_dt_3=:smpl_casting_dt_3,u.smpl_casting_dt_7=:smpl_casting_dt_7,u.smpl_casting_dt_28=:smpl_casting_dt_28,"
			+ "u.lrcr_smpl_casting_dt_10=:lrcr_smpl_casting_dt_10,u.lrcr_smpl_casting_dt_28=:lrcr_smpl_casting_dt_28,u.rack_dt=:rack_dt,u.kft_test_datetime=:kft_test_datetime,u.at_test_datetime=:at_test_datetime,u.fp_test_datetime=:fp_test_datetime,u.cba_test_datetime=:cba_test_datetime,u.grn_date=:grn_date,u.smpl_qty=:smpl_qty,u.smpl_breath=:smpl_breath,"
			+ "u.smpl_height=:smpl_height,u.smpl_width=:smpl_width,u.blaine=:blaine,u.colorindex=:colorindex,u.CaO=:CaO,u.SiO2=:SiO2,u.Al2O3=:Al2O3,u.Fe2O3=:Fe2O3,u.MgO=:MgO,u.SO3 =:SO3,u.K2O=:K2O,u.Na2O=:Na2O,u.Cl=:Cl,u.xrf_total=:xrf_total,u.LSF=:LSF,u.SM=:SM,u.AM=:AM,u.bombcal_gcv_gross=:bombcal_gcv_gross,u.ti_o_2=:ti_o_2,"
			+ "u.p2_os=:p2_os,u.loi=:loi,u.p_sum=:p_sum,u.ir=:ir,u.r_fourtyfive=:r_fourtyfive,u.nc=:nc,u.le_chatellier=:le_chatellier,u.autoclave=:autoclave,u.setting_time_initial=:setting_time_initial,u.setting_time_final=:setting_time_final,u.c3s=:c3s,u.c2s=:c2s,u.c3a=:c3a,u.c4af=:c4af,u.liquid=:liquid,u.sulphur=:sulphur,u.fcao=:fcao,u.tga_moisture_std=:tga_moisture_std,u.tga_volatile_std=:tga_volatile_std,"
			+ "u.tga_volatile_dry_std=:tga_volatile_dry_std,u.tga_ash_std=:tga_ash_std,u.tga_ash_dry_std=:tga_ash_dry_std,u.tga_fix_carbon_std=:tga_fix_carbon_std,u.tga_fix_carbon_dry_std=:tga_fix_carbon_dry_std,u.ncv=:ncv,u.hydrogen=:hydrogen,u.mwt1=:mwt1,u.mwt2=:mwt2,u.mwt3=:mwt3,u.mb_value=:mb_value,u.airmwt1=:airmwt1,u.airmwt2=:airmwt2,u.airmwt3=:airmwt3,u.total_moisture=:total_moisture,u.airmb_value=:airmb_value,"
			+ "u.manualcalculated_gcv=:manualcalculated_gcv,u.coal_sulphuradb=:coal_sulphuradb,u.Mn2O3=:Mn2O3,u.P2O5=:P2O5,u.TiO2=:TiO2,u.SrO=:SrO,u.psd_size5=:psd_size5,u.psd_size10=:psd_size10,u.psd_size20=:psd_size20,u.psd_size30=:psd_size30,u.psd_size40=:psd_size40,u.psd_size45=:psd_size45,u.psd_size50=:psd_size50,u.Quartz=:Quartz,u.xrf_sum=:xrf_sum,u.lc=:lc,u.lime=:lime,u.BaO=:BaO,u.Na_Eq=:Na_Eq,u.LS=:LS,u.r_90=:r_90,u.r_212=:r_212,"
			+ "u.f_silica=:f_silica,u.r_60=:r_60,u.r_45=:r_45,u.r_30=:r_30,u.r_20=:r_20,u.r_10=:r_10,u.r_3=:r_3,u.avg_1d_kn=:avg_1d_kn,u.avg_1d_mpa=:avg_1d_mpa,u.avg_3d_kn=:avg_3d_kn,u.avg_3d_mpa=:avg_3d_mpa,u.avg_7d_kn=:avg_7d_kn,u.avg_7d_mpa=:avg_7d_mpa,u.avg_28d_kn=:avg_28d_kn,u.avg_28d_mpa=:avg_28d_mpa,"
			+ "u.ALKALI_SO3=:ALKALI_SO3,u.SO3_ALKAI=:SO3_ALKAI,u.EXCESS_SO3=:EXCESS_SO3,u.C3S_C2S=:C3S_C2S,u.ALKALI_AS_NA2O=:ALKALI_AS_NA2O,u.HOR=:HOR,u.MM=:MM,u.BF=:BF,u.pi_percentage=:pi_percentage,u.slag_percentage=:slag_percentage,u.drying_shrinkage=:drying_shrinkage,u.cement_temp=:cement_temp,u.ni_bs=:ni_bs,u.loss_on_ignition_kf=:loss_on_ignition_kf,u.loss_on_ignition_hm=:loss_on_ignition_hm,u.lightweight=:lightweight,u.psd_size3=:psd_size3,"
			+ "u.psd_size90=:psd_size90,u.psd_size60=:psd_size60,u.ash_percentage=:ash_percentage,u.psd_bet_3and30=:psd_bet_3and30,u.psd_above_212=:psd_above_212,u.psd_above_30=:psd_above_30,u.psd_above_45=:psd_above_45,u.psd_above_50=:psd_above_50,u.psd_above_90=:psd_above_90,u.psd_below_20=:psd_below_20,u.psd_below_5=:psd_below_5,u.lrcr_avg_10d_mpa=:lrcr_avg_10d_mpa,u.lrcr_avg_28d_mpa=:lrcr_avg_28d_mpa,"
			+ "u.blaine_time=:blaine_time,u.ball_meal_so3=:ball_meal_so3,u.smpl_qty_received=:smpl_qty_received,u.moisture=:moisture,u.volatile_moisture=:volatile_moisture,u.inherient_moisture=:inherient_moisture,u.free_moisture=:free_moisture,u.GCV_Airdrybasis=:GCV_Airdrybasis,u.GCV_Asreceivedbasis=:GCV_Asreceivedbasis,u.asreceivedbasis_freemoisture=:asreceivedbasis_freemoisture,u.asreceivedbasis_totalmoisture=:asreceivedbasis_totalmoisture,u.airdrybasis_inherientmoisture=:airdrybasis_inherientmoisture,"
	    	+ "u.airdrybasis_volatilemoisture=:airdrybasis_volatilemoisture,u.airdrybasis_ash=:airdrybasis_ash,u.airdrybasis_sulphur=:airdrybasis_sulphur,u.purity=:purity,u.carbon=:carbon,u.nitrogen=:nitrogen,u.r2o3=:r2o3,u.Fluorine=:Fluorine,u.at_cl=:at_cl,u.flashpoint=:flashpoint,u.na2o3=:na2o3,u.cr2o3=:cr2o3,"
			+ "u.Chloride_content=:Chloride_content,u.co2=:co2,u.c_id=:c_id,u.noof_cubes_1d=:noof_cubes_1d,u.noof_cubes_3d=:noof_cubes_3d,u.noof_cubes_7d=:noof_cubes_7d,u.noof_cubes_28d=:noof_cubes_28d,u.planned_brdays=:planned_brdays,u.psd_id=:psd_id,u.lrcr_avg_10d_kn=:lrcr_avg_10d_kn,u.lrcr_avg_28d_kn=:lrcr_avg_28d_kn,u.lrcr_noof_cubes_10d=:lrcr_noof_cubes_10d,u.lrcr_noof_cubes_28d=:lrcr_noof_cubes_28d,"
			+ "u.rack_no=:rack_no,u.doc_no=:doc_no,u.smplreceived_time=:smplreceived_time,u.afr_smpl_id=:afr_smpl_id"
			+ " where u.smpl_id = :smpl_id and u.p_id = :p_id")
    
	void update_smpl_Data(@Param("flyash_range") String flyash_range,@Param("tga_batch_name") String tga_batch_name,
			@Param("lims_id") String lims_id,@Param("degree_of_calci") String degree_of_calci,@Param("ts_blaine") String ts_blaine,@Param("ts_color") String ts_color,@Param("ts_xrf") String ts_xrf,@Param("ts_ctm_1day") String ts_ctm_1day,@Param("ts_ctm_3day") String ts_ctm_3day,@Param("ts_bcal") String ts_bcal,@Param("pass_fail") String pass_fail,@Param("ts_ctm_7day") String ts_ctm_7day,
			@Param("ts_ctm_28day") String ts_ctm_28day,@Param("ts_lrcr_10day") String ts_lrcr_10day,@Param("ts_lrcr_28day") String ts_lrcr_28day,@Param("grn") String grn,@Param("smpl_casting_dt") Date smpl_casting_dt,@Param("blaine_test_datetime") Date blaine_test_datetime,@Param("colorindex_test_datetime") Date colorindex_test_datetime,@Param("xrf_test_datetime") Date xrf_test_datetime,@Param("bombcal_test_datetime") Date bombcal_test_datetime,@Param("tga_test_datetime") Date tga_test_datetime,
			@Param("mb_test_datetime") Date mb_test_datetime,@Param("mw1_test_datetime") Date mw1_test_datetime,@Param("mw2_test_datetime") Date mw2_test_datetime,@Param("airmwt1_test_datetime") Date airmwt1_test_datetime,@Param("airmwt2_test_datetime") Date airmwt2_test_datetime,@Param("airmwt3_test_datetime") Date airmwt3_test_datetime,@Param("psd_test_datetime") Date psd_test_datetime,@Param("smpl_casting_dt_3") Date smpl_casting_dt_3,
			@Param("smpl_casting_dt_7") Date smpl_casting_dt_7,@Param("smpl_casting_dt_28") Date smpl_casting_dt_28,@Param("lrcr_smpl_casting_dt_10") Date lrcr_smpl_casting_dt_10,@Param("lrcr_smpl_casting_dt_28") Date lrcr_smpl_casting_dt_28,@Param("rack_dt") Date rack_dt,@Param("kft_test_datetime") Date kft_test_datetime,@Param("at_test_datetime") Date at_test_datetime,@Param("fp_test_datetime") Date fp_test_datetime,@Param("cba_test_datetime") Date cba_test_datetime,@Param("grn_date") Date grn_date,
			@Param("smpl_qty") Double smpl_qty,@Param("smpl_breath") Double smpl_breath,@Param("smpl_height") Double smpl_height,@Param("smpl_width") Double smpl_width,@Param("blaine") Double blaine,@Param("colorindex") Double colorindex,@Param("CaO") Double CaO,@Param("SiO2") Double SiO2,@Param("Al2O3") Double Al2O3,@Param("Fe2O3") Double Fe2O3,@Param("MgO") Double MgO,@Param("SO3") Double SO3,@Param("K2O") Double K2O,@Param("Na2O") Double Na2O,@Param("Cl") Double Cl,
			@Param("xrf_total") Double xrf_total,@Param("LSF") Double LSF,@Param("SM") Double SM,@Param("AM") Double AM,@Param("bombcal_gcv_gross") Double bombcal_gcv_gross,@Param("ti_o_2") Double ti_o_2,@Param("p2_os") Double p2_os,@Param("loi") Double loi,@Param("p_sum") Double p_sum,@Param("ir") Double ir,@Param("r_fourtyfive") Double r_fourtyfive,@Param("nc") Double nc,@Param("le_chatellier") Double le_chatellier,
			@Param("autoclave") Double autoclave,@Param("setting_time_initial") Double setting_time_initial,@Param("setting_time_final") Double setting_time_final,@Param("c3s") Double c3s,@Param("c2s") Double c2s,@Param("c3a") Double c3a,@Param("c4af") Double c4af,@Param("liquid") Double liquid,@Param("sulphur") Double sulphur,@Param("fcao") Double fcao,@Param("tga_moisture_std") Double tga_moisture_std,@Param("tga_volatile_std") Double tga_volatile_std,
			@Param("tga_volatile_dry_std") Double tga_volatile_dry_std,@Param("tga_ash_std") Double tga_ash_std,@Param("tga_ash_dry_std") Double tga_ash_dry_std,@Param("tga_fix_carbon_std") Double tga_fix_carbon_std, @Param("tga_fix_carbon_dry_std") Double tga_fix_carbon_dry_std,@Param("ncv") Double ncv,@Param("hydrogen") Double hydrogen,@Param("mwt1") Double mwt1,@Param("mwt2") Double mwt2,@Param("mwt3") Double mwt3,@Param("mb_value") Double mb_value,@Param("airmwt1") Double airmwt1,@Param("airmwt2") Double airmwt2,
			@Param("airmwt3") Double airmwt3,@Param("total_moisture") Double total_moisture,@Param("airmb_value") Double airmb_value,@Param("manualcalculated_gcv") Double manualcalculated_gcv,@Param("coal_sulphuradb") Double coal_sulphuradb,@Param("Mn2O3") Double Mn2O3,@Param("P2O5") Double P2O5,@Param("TiO2") Double TiO2,@Param("SrO") Double SrO,@Param("psd_size5") Double psd_size5,@Param("psd_size10") Double psd_size10,@Param("psd_size20") Double psd_size20,
			@Param("psd_size30") Double psd_size30,@Param("psd_size40") Double psd_size40,@Param("psd_size45") Double psd_size45,@Param("psd_size50") Double psd_size50,@Param("Quartz") Double Quartz,@Param("xrf_sum") Double xrf_sum,@Param("lc") Double lc,@Param("lime") Double lime,@Param("BaO") Double BaO,@Param("Na_Eq") Double Na_Eq,@Param("LS") Double LS,@Param("r_90") Double r_90,@Param("r_212") Double r_212,@Param("f_silica") Double f_silica,@Param("r_60") Double r_60,
			@Param("r_45") Double r_45,@Param("r_30") Double r_30,@Param("r_20") Double r_20,@Param("r_10") Double r_10,@Param("r_3") Double r_3,@Param("avg_1d_kn") Double avg_1d_kn,@Param("avg_1d_mpa") Double avg_1d_mpa,@Param("avg_3d_kn") Double avg_3d_kn,@Param("avg_3d_mpa") Double avg_3d_mpa,@Param("avg_7d_kn") Double avg_7d_kn,@Param("avg_7d_mpa") Double avg_7d_mpa,@Param("avg_28d_kn") Double avg_28d_kn,@Param("avg_28d_mpa") Double avg_28d_mpa,
			@Param("ALKALI_SO3") Double ALKALI_SO3,@Param("SO3_ALKAI") Double SO3_ALKAI,@Param("EXCESS_SO3") Double EXCESS_SO3,@Param("C3S_C2S") Double C3S_C2S,@Param("ALKALI_AS_NA2O") Double ALKALI_AS_NA2O,@Param("HOR") Double HOR,@Param("MM") Double MM,@Param("BF") Double BF,@Param("pi_percentage") Double pi_percentage,@Param("slag_percentage") Double slag_percentage,  @Param("drying_shrinkage") Double drying_shrinkage,@Param("cement_temp") Double cement_temp,@Param("ni_bs") Double ni_bs,@Param("loss_on_ignition_kf") Double loss_on_ignition_kf,
			@Param("loss_on_ignition_hm") Double loss_on_ignition_hm,@Param("lightweight") Double lightweight,@Param("psd_size3") Double psd_size3,@Param("psd_size90") Double psd_size90,
			@Param("psd_size60") Double psd_size60,@Param("ash_percentage") Double ash_percentage,@Param("psd_bet_3and30") Double psd_bet_3and30,@Param("psd_above_212") Double psd_above_212,@Param("psd_above_30") Double psd_above_30,@Param("psd_above_45") Double psd_above_45,@Param("psd_above_50") Double psd_above_50,@Param("psd_above_90") Double psd_above_90,@Param("psd_below_20") Double psd_below_20,@Param("psd_below_5") Double psd_below_5,@Param("lrcr_avg_10d_mpa") Double lrcr_avg_10d_mpa,
			@Param("lrcr_avg_28d_mpa") Double lrcr_avg_28d_mpa,@Param("blaine_time") Double blaine_time,@Param("ball_meal_so3") Double ball_meal_so3,@Param("smpl_qty_received") Double smpl_qty_received,@Param("moisture") Double moisture,@Param("volatile_moisture") Double volatile_moisture,@Param("inherient_moisture") Double inherient_moisture,@Param("free_moisture") Double free_moisture,@Param("GCV_Airdrybasis") Double GCV_Airdrybasis,@Param("GCV_Asreceivedbasis") Double GCV_Asreceivedbasis,
			@Param("asreceivedbasis_freemoisture") Double asreceivedbasis_freemoisture,@Param("asreceivedbasis_totalmoisture") Double asreceivedbasis_totalmoisture,@Param("airdrybasis_inherientmoisture") Double airdrybasis_inherientmoisture,
			@Param("airdrybasis_volatilemoisture") Double airdrybasis_volatilemoisture,	@Param("airdrybasis_ash") Double airdrybasis_ash,@Param("airdrybasis_sulphur") Double airdrybasis_sulphur,@Param("purity") Double purity,@Param("carbon") Double carbon,@Param("nitrogen") Double nitrogen,@Param("r2o3") Double r2o3,@Param("Fluorine") Double Fluorine,@Param("at_cl") Double at_cl,@Param("flashpoint") Double flashpoint,@Param("na2o3") Double na2o3,@Param("cr2o3") Double cr2o3,
			@Param("Chloride_content") Double Chloride_content,@Param("co2") Double co2,@Param("c_id") Integer c_id,@Param("noof_cubes_1d") Integer noof_cubes_1d,@Param("noof_cubes_3d") Integer noof_cubes_3d,@Param("noof_cubes_7d") Integer noof_cubes_7d,@Param("noof_cubes_28d") Integer noof_cubes_28d,@Param("planned_brdays") Integer planned_brdays,@Param("psd_id") Integer psd_id,@Param("lrcr_avg_10d_kn") Integer lrcr_avg_10d_kn,@Param("lrcr_avg_28d_kn") Integer lrcr_avg_28d_kn,@Param("lrcr_noof_cubes_10d") Integer lrcr_noof_cubes_10d,
			@Param("lrcr_noof_cubes_28d") Integer lrcr_noof_cubes_28d,@Param("rack_no") Integer rack_no,@Param("doc_no") Integer doc_no,@Param("smplreceived_time") Integer smplreceived_time,@Param("afr_smpl_id") Integer afr_smpl_id,
			@Param("smpl_id") Integer smpl_id, @Param("p_id") Integer p_id);
    
    
    @Transactional
    @Modifying
	@Query(" update Smpl_collection set " + 
			" sio2 = :sio2  ,al2o3 = :al2o3, " + 
			" fe2o3 = :fe2o3 ,cao = :cao, " + 
			" mgo = :mgo,so3 = :so3, " + 
			" na2o = :na2o,k2o = :k2o, " + 
			" cl = :cl,tio2 = :tio2, " + 
			" p2o5 = :p2o5,loi = :loi, " + 
			" xrf_sum = :xrf_sum,lsf = :lsf, " + 
			" sm = :sm,am = :am, " + 
			" bf = :bf,na_eq = :na_eq, " + 
			" r_90 = :r_90,r_212 = :r_212, " + 
			" quartz = :quartz,lime = :lime, " + 
			" lc = :lc,alkali_so3 = :alkali_so3, " + 
			" so3_alkai = :so3_alkai,mm = :mm, " + 
			" c3s = :c3s,c2s = :c2s, " + 
			" c3a = :c3a,c4af = :c4af, " + 
			" excess_so3 = :excess_so3,hor = :hor, " + 
			" lightweight = :lightweight,loss_on_ignition_kf = :loss_on_ignition_kf, " + 
			" loss_on_ignition_hm = :loss_on_ignition_hm,degree_of_calci = :degree_of_calci " + 
			" where smpl_id = :smpl_id and p_id = :p_id")
	void updatesmplCollectionData(@Param("smpl_id") Integer smpl_id,@Param("p_id") Integer p_id,
			@Param("sio2") Double sio2,@Param("al2o3") Double al2o3,
			@Param("fe2o3") Double fe2o3,@Param("cao") Double cao,
			@Param("mgo") Double mgo,@Param("so3") Double so3,
			@Param("na2o") Double na2o,@Param("k2o") Double k2o,
			@Param("cl") Double cl,@Param("tio2") Double tio2,
			@Param("p2o5") Double p2o5,@Param("loi") Double loi,
			@Param("xrf_sum") Double xrf_sum,@Param("lsf") Double lsf,
			@Param("sm") Double sm,@Param("am") Double am,
			@Param("bf") Double bf,@Param("na_eq") Double na_eq,
			@Param("r_90") Double r_90,@Param("r_212") Double r_212,
			@Param("quartz") Double quartz,@Param("lime") Double lime,
			@Param("lc") Double lc,@Param("alkali_so3") Double alkali_so3,
			@Param("so3_alkai") Double so3_alkai,@Param("mm") Double mm,
			@Param("c3s") Double c3s,@Param("c2s") Double c2s,
			@Param("c3a") Double c3a,@Param("c4af") Double c4af,
			@Param("excess_so3") Double excess_so3,@Param("hor") Double hor,
			@Param("lightweight") Double lightweight,@Param("loss_on_ignition_kf") Double loss_on_ignition_kf,
			@Param("loss_on_ignition_hm") Double loss_on_ignition_hm,@Param("degree_of_calci") String degree_of_calci
			);
    
    
    @Transactional
    @Modifying
	@Query(value ="insert into mst_smpl_collection(smpl_id,smpl_collected_dt,smpl_casting_dt,smpl_qty,p_id,ctype_id,sect_id) values(:smpl_id,:smpl_collected_dt,:smpl_casting_dt,:smpl_qty,:p_id,:ctype_id,:sect_id)", nativeQuery = true)
	void insertesmplCollectionData(@Param("smpl_id") Integer smpl_id,@Param("smpl_collected_dt") Date smpl_collected_dt,@Param("smpl_casting_dt") Date smpl_casting_dt,@Param("smpl_qty")  Double smpl_qty,@Param("p_id") Integer p_id,@Param("ctype_id") Integer ctype_id,@Param("sect_id") Integer sect_id);
    
    
    //************ Select query for check smpl_id  data available in  Table *******************
  	@Query("SELECT b FROM Smpl_collection b WHERE b.smpl_id = :smpl_id")
  	List<Smpl_collection> getSmplIdDataCount(@Param("smpl_id") Integer smpl_id);
  	
    
    
    
}
