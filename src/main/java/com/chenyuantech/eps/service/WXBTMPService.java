package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chenyuantech.eps.bean.WXB;
import com.chenyuantech.eps.bean.WXBSIZE;
import com.chenyuantech.eps.bean.WXBTMP;
import com.chenyuantech.eps.dao.WXBSIZEMapper;
import com.chenyuantech.eps.dao.WXBSIZETMP_ExtMapper;
import com.chenyuantech.eps.dao.WXBTMPMapper;
import com.chenyuantech.eps.dao.WXBTMP_ExtMapper;
import com.chenyuantech.eps.dao.WXB_ExtMapper;
import com.chenyuantech.eps.utils.MapObjetTool;

//@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
@Service
public class WXBTMPService {

	@Autowired
	WXBTMPMapper wxbtmpMapper;

	@Autowired
	WXBTMP_ExtMapper wxbtmp_ExtMapper;

	@Autowired
	WXBService wxbService;

	@Autowired
	WXBSIZEMapper wxbsizeMapper;
	@Autowired
	WXBSIZETMP_ExtMapper  wxbsizetmp_ExtMapper;
	private List<LinkedHashMap<String, Object>> lists = null;

	@Autowired
	private WXB_ExtMapper wxb_ExtMapper;

	public boolean insertWXBTMP(WXBTMP wxbtmp) {
		return wxbtmpMapper.insertSelective(wxbtmp) > 0;

	}

	public String getWXB15ByWXB05T(String WXB05T) {

		return wxbtmp_ExtMapper.getWXB15ByWXB05T(WXB05T);
	}

	public boolean updateWXBTMP(WXBTMP wxbtmp) {
		return wxbtmpMapper.updateByPrimaryKeySelective(wxbtmp) > 0;

	}

	public boolean deleteWXBTMP(String k) {
		return wxbtmpMapper.deleteByPrimaryKey(k) > 0;

	}

	public WXBTMP getWXBTMPbyPk(String WXB05T) {
		return wxbtmp_ExtMapper.selectWXBTMPByUnqueK(WXB05T);
	}

	public WXBTMP getWXBTMPbyPk2(String WXB05T) {
		return wxbtmp_ExtMapper.selectWXBTMPByUnqueK2(WXB05T);
	}

	public List<LinkedHashMap<String, Object>> get(WXBTMP wxbtmp,String WXB11) {
		return wxbtmp_ExtMapper.selectWXBTMPByParam(wxbtmp,WXB11);
	}

	public String getWXB05T(String PMMUD02) {
		return wxbtmp_ExtMapper.getWXB05T(PMMUD02);
	}

	public boolean confirmdata(String[] wxbls) {
		WXB w1;
		WXBTMP wt1;
		boolean b = false;
		String wxb05;
		WXBSIZE wxbsize;
		for (String WXB05T : wxbls) {
			try {
				wt1 = this.getWXBTMPbyPk2(WXB05T);
				w1 = new WXB();
				if (wt1 == null) {
					continue;
				}
				wxb05 = wxb_ExtMapper.getWXB05("CY0001");
				if (wxb05 == null) {
					continue;
				}

				b = this.updatewxbtmp(wt1.getWXB05T(), wxb05);
				if (b) {
					w1.setWXB01("-");
					w1.setWXB02(0);
					w1.setWXB04(wt1.getWXB04());
					w1.setWXB05(wxb05); 
					w1.setWXB08(wt1.getWXB08());
					w1.setWXB09(wt1.getWXB09());
					w1.setWXB10(wt1.getWXB10());
					w1.setWXB15(wt1.getWXB15());
					wxbService.insertWXB(w1);
					if (wt1.getWSIZE().equalsIgnoreCase("Y")) {
						
						lists=wxbsizetmp_ExtMapper.getWXBSIZETMP(WXB05T);
						for (LinkedHashMap<String, Object> ln : lists) {
							wxbsize = (WXBSIZE) MapObjetTool.mapToObject(ln,
									WXBSIZE.class);
							wxbsize.setWXB05(wxb05); 

							if (wxbsize != null) {
								
								b = wxbsizeMapper.insertSelective(wxbsize) > 0;
								if(b)
								{
									b =wxbsizetmp_ExtMapper.updateWXBTMPSIZE2(WXB05T, wxb05)>0;
								}
							}

						}

					}

				}
			} catch (Exception e) {
				return false;
			}

		}
		return b;
	}

	public boolean updatewxbtmp(String WXB05T, String WXB05) {

		return wxbtmp_ExtMapper.updatewxbtmp(WXB05, WXB05T) > 0;
	}

}
