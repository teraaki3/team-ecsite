package jp.co.internous.nova.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.nova.model.domain.MstProduct;

/**
 * mst_productにアクセスするDAO
 * @author teraaki3
 *
 */
@Mapper
public interface MstProductMapper {
	
	/**
	 * 商品情報を取得をする
	 * @return 商品情報リスト
	 */
	@Select("SELECT * FROM mst_Product")
	List<MstProduct>find();
	
	/**
	 * キーワードを条件に商品情報を取得する
	 * @return 商品情報リスト
	 */
	List<MstProduct>findByProductName(@Param("keywords")String [] keywords);
	
	/**
	 * カテゴリとキーワードを条件に商品情報を取得
	 * @return 商品情報リスト
	 */
	List<MstProduct>findByCategoryAndProductName(@Param("category")int category,@Param("keywords")String[] keywords);
	
	/**
	 * 商品IDを条件に商品情報を取得する
	 * @param id 商品情報ID
	 * @return 商品情報
	 */
	@Select("SELECT * FROM mst_product WHERE id = #{id}")
	MstProduct findById(@Param("id")int id);
}