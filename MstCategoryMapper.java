package jp.co.internous.nova.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.nova.model.domain.MstCategory;

/**
 * mst_categoryにアクセスするDAO
 * @author teraaki3
 *
 */
@Mapper
public interface MstCategoryMapper {
	
	/**
	 * カテゴリ情報を取得する
	 * @return カテゴリ情報リスト
	 */
	@Select("SELECT * FROM mst_category")
	List<MstCategory>find();
}