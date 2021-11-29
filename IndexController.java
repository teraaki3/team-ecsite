package jp.co.internous.nova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.nova.model.domain.MstCategory;
import jp.co.internous.nova.model.domain.MstProduct;
import jp.co.internous.nova.model.form.SearchForm;
import jp.co.internous.nova.model.mapper.MstCategoryMapper;
import jp.co.internous.nova.model.mapper.MstProductMapper;
import jp.co.internous.nova.model.session.LoginSession;

/**
 * 商品検索に関する処理を行うコントローラー
 * @author teraaki3
 *
 */
@Controller
@RequestMapping("/nova")
public class IndexController {
	
	@Autowired
	private MstCategoryMapper mstCategoryMapper;
	
	@Autowired
	private MstProductMapper mstProductMapper;
	
	@Autowired
	private LoginSession loginSession;
	
	/**
	*トップページを初期表示する
	* @Param m 画面表示用オブジェクト
	* @return トップページ
	*/
	@RequestMapping("/")
	public String index(Model m) {
		
		if(!loginSession.isLogined() && loginSession.getTmpUserId() == 0) {
			int tmpUserId=(int)(Math.random() * 1000000000 * -1);
			//仮ユーザーIDが9桁になるまで10倍する
			while(tmpUserId > -100000000) {
					tmpUserId *= 10;
			}
			loginSession.setTmpUserId(tmpUserId);
		}
		
		//カテゴリを取得
		List<MstCategory>categories = mstCategoryMapper.find();
		
		//商品情報を取得
		List<MstProduct>products = mstProductMapper.find();
		
		m.addAttribute("categories",categories);
		m.addAttribute("selected",0);
		m.addAttribute("products",products);
		//page_header.htmlでsessionの変数を表示させているため、loginSessionも画面に送る。
		m.addAttribute("loginSession",loginSession);
		return "index";
	}
	
	/**
	*検索処理をおこなう
	*@param f 検索フォーム
	*@param m 画面表示用オブジェクト
	*@return トップページ
	*/
	@RequestMapping("/searchItem")
	public String index(SearchForm f,Model m) {
		List<MstProduct>products = null;
		
		String keywords = f.getKeywords().replaceAll("　"," ").replaceAll("\\s{2,}", " ").trim();
		if(f.getCategory() == 0) {
			//カテゴリー未選択の状態
			products = mstProductMapper.findByProductName(keywords.split(" "));
		} else {
			products = mstProductMapper.findByCategoryAndProductName(f.getCategory(),keywords.split(" "));
		}
		
		List<MstCategory>categories = mstCategoryMapper.find();
		m.addAttribute("keywords",keywords);
		m.addAttribute("selected",f.getCategory());
		m.addAttribute("categories",categories);
		m.addAttribute("products",products);
		//page_header.htmlでsessionの変数を表示させているため、loginSessionも画面に送る。
		m.addAttribute("loginSession",loginSession);
		
		return "index";
	}
}
