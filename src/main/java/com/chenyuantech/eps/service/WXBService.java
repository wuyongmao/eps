package com.chenyuantech.eps.service;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.PMN;
import com.chenyuantech.eps.bean.SHD;
import com.chenyuantech.eps.bean.WXB;
import com.chenyuantech.eps.bean.WXBExample;
import com.chenyuantech.eps.dao.WXBMapper;
import com.chenyuantech.eps.dao.WXB_ExtMapper;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class WXBService {

	@Autowired
	private WXBMapper WXBMapper;

	@Autowired
	private WXB_ExtMapper wxb_ExtMapper;
	@Autowired
	private WXBExample wxbExample;

	@Autowired
	private SHDService shdService;

	@Autowired
	private PMNService pmnService;

	// 新增
	public boolean insertWXB(WXB record) throws Exception {
		return WXBMapper.insertSelective(record) > 0 ? true : false;

	}

	public Msg insertimpWxb(List<WXB> ws, String pmmud02) {
		WXB w = null;
		boolean b = true;
		String WXB05 = "";
		List<PMN> pmns = null;
		PMN pmn = null;
		for (int i = 0; i < ws.size(); i++) {
			w = ws.get(i);

			if (w.getWXB01() == null) {
				return Msg.fail((i + 1) + "单号不可为空");
			}
			if (w.getWXB02() == null) {
				return Msg.fail((i + 1) + "项次不可为空");
			}
			if (w.getWXB09() == null) {
				return Msg.fail((i + 1) + "毛重不可为空");
			}

			pmns = pmnService.getpPmn(w.getWXB01(), w.getWXB02());

			if (pmns.size() > 0) {
				pmn = pmns.get(0);
				w.setWXB15(pmn.getPMN04());
				w.setWXB14(pmn.getPMN07());
				if ((pmn.getPMN04().substring(0, 2).equalsIgnoreCase("40")
						|| pmn.getPMN04().substring(0, 2).equalsIgnoreCase("50") || pmn.getPMN04().substring(0, 2)
						.equalsIgnoreCase("46")) == false) {

					if (w.getWXB04() == null) {
						return Msg.fail("单号/项次：" + w.getWXB01() + "/" + w.getWXB02() +":缸号不可为空");
					} else {
						if (w.getWXB04().trim().equals("")) {
							return Msg.fail("单号/项次：" + w.getWXB01() + "/" + w.getWXB02() +":缸号不可为空");
						}

					}
					if (w.getWXB08() == null) {
						return Msg.fail("单号/项次：" + w.getWXB01() + "/" + w.getWXB02() +":毛重不可为空");
					} else {

					}

				}

			} else {
				return Msg.fail("单号/项次：" + w.getWXB01() + "/" + w.getWXB02() + "不存在");
			}

		}
		for (int i = 0; i < ws.size(); i++) {
			w = ws.get(i);
			WXB05 = this.getWXB05(pmmud02);
			w.setWXB05(WXB05);
			if (WXB05 != null) {
				b = b && WXBMapper.insertSelective(w) > 0;
			}

		}
		if (b) {
			return Msg.success();
		} else {
			return Msg.fail();
		}

	}

	// 查询单据是否副料
	public boolean getcountFL(WXB wxb) throws Exception {
		return wxb_ExtMapper.getcountFL(wxb.getWXB01(), wxb.getWXB02()) > 0;

	}

	// 查询单据是否存在
	public boolean getcountPMN(WXB wxb) throws Exception {
		return wxb_ExtMapper.getcountPMN(wxb.getWXB01(), wxb.getWXB02()) > 0;

	}

	public BigDecimal getSumWxbSizeByWXB05(String WXB05) {
		return wxb_ExtMapper.getSumWxbSizeByWXB05(WXB05);
	}

	public boolean updateWXB03(String[] WXB05s, SHD shd) {
		boolean flag = false;
		if (shdService.insertSHD(shd)) {
			for (String WXB05 : WXB05s) {
				// System.out.println("----------WXB05:"+WXB05);
				flag = wxb_ExtMapper.updateWXB03ByWXB05(shd.getSHD01(), WXB05) > 0 || flag;
			}

		}
		return flag;

	}

	// 根据主键修改
	public boolean updateWXB(WXB record) {

		return WXBMapper.updateByPrimaryKeySelective(record) > 0 ? true : false;

	}

	// 删除
	public boolean deleteWXB(String WXB05) {
		return WXBMapper.deleteByPrimaryKey(WXB05) > 0 ? true : false;

	}

	public boolean exitshd(String WXB05) {
		wxbExample.clear();
		wxbExample.createCriteria().andWXB05EqualTo(WXB05).andWXB03IsNotNull();
		return WXBMapper.selectByExample(wxbExample).size() == 0;
	}

	// 查询所有
	public List<WXB> findAll() {
		return WXBMapper.selectByExample(null);

	}

	// 根据主键查询
	public WXB findByPrimaryKey(WXB key) {

		return WXBMapper.selectByPrimaryKey(key.getWXB05());

	}

	/**
	 * 根据采购单号和项次查询所有记录
	 * 
	 * @param WXB01
	 *            采购单号
	 * @param WXB02
	 *            项次
	 * @return
	 */
	public List<WXB> getWXB(String WXB01, Integer WXB02) {
		wxbExample.clear();

		wxbExample.createCriteria().andWXB01EqualTo(WXB01).andWXB02EqualTo(WXB02);

		return WXBMapper.selectByExample(wxbExample);

	}

	/**
	 * 根据采购单号和项次查询所有记录
	 * 
	 * @param PMN01
	 *            采购单号
	 * @param PMN02
	 *            项次
	 * @return
	 */
	public List<LinkedHashMap<String, Object>> getWXB2(String PMN01, Integer PMN02, String WXB03, String WXB04,
			String WXB05, String WXB11, String ISSH, String sort, String PMMUD02, String ROLE) {

		return wxb_ExtMapper.selectWXBByPMN01PMN02(PMN01, PMN02, WXB03, WXB04, WXB05, WXB11,ISSH,sort, PMMUD02, ROLE);


	}

	/**
	 * 查询单条外箱标记录
	 * 
	 * @param WXB05
	 * @return
	 */
	public List<LinkedHashMap<String, Object>> getWXBByWXB05(String WXB05) {

		return wxb_ExtMapper.getWXBByWXB05(WXB05);

	}

	/**
	 * 查询多条外箱标记录
	 * 
	 * @param WXB05
	 * @return
	 */
	public List<LinkedHashMap<String, Object>> getWXBByWXB05s(String[] WXB05) {

		return wxb_ExtMapper.getWXBByWXB05s(WXB05);

	}

	/**
	 * 查询多条外箱标记录(导入的)
	 * 
	 * @param WXB05
	 * @return
	 */
	public List<LinkedHashMap<String, Object>> getWXBByWXB05s2(String[] WXB05) {

		return wxb_ExtMapper.getWXBByWXB05s2(WXB05);

	}

	public List<LinkedHashMap<String, Object>> selectWXBByWXB05T(String WXB05, String WXB11) {

		return wxb_ExtMapper.selectWXBByWXB05T(WXB05, WXB11);

	}

	/**
	 * 查询多条外箱标记录
	 * 
	 * @param WXB05
	 * @return
	 */
	public int getCountPmm02(String[] WXB01) {

		return wxb_ExtMapper.getCountPmm02(WXB01);

	}

	/**
	 * 
	 * 
	 * @param WXB05
	 * @return
	 */
	public List<LinkedHashMap<String, Object>> getSHDList(String PMMUD02, String ROLE) {

		return wxb_ExtMapper.getSHDList(PMMUD02, ROLE);

	}

	/**
	 * 查询送货单
	 * 
	 * @param SHD01
	 * @return
	 */
	public List<LinkedHashMap<String, Object>> getWXBBySHD01(String SHD01) {

		return wxb_ExtMapper.getWXBSHD(SHD01);

	}

	/**
	 * 获取外箱标编码
	 * 
	 * @return
	 */
	public String getWXB05(String PMMUD02) {
		return wxb_ExtMapper.getWXB05(PMMUD02);
	}

	/**
	 * 获取送货单编码
	 * 
	 * @return
	 */
	public String getWXB03(String PMMUD02) {
		return wxb_ExtMapper.getWXB03(PMMUD02);
	}

}
