package com.entity.view;

import com.entity.KechengCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng_collection")
public class KechengCollectionView extends KechengCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String kechengCollectionValue;



		//级联表 kecheng
			/**
			* 资源标题
			*/
			private String kechengName;
			/**
			* 资源类型
			*/
			private Integer kechengTypes;
				/**
				* 资源类型的值
				*/
				private String kechengValue;
			/**
			* 资源图片
			*/
			private String kechengPhoto;
			/**
			* 资源视频
			*/
			private String kechengVideo;
			/**
			* 文件下载
			*/
			private String kechengFile;
			/**
			* 资源详情
			*/
			private String kechengContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;

	public KechengCollectionView() {

	}

	public KechengCollectionView(KechengCollectionEntity kechengCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, kechengCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getKechengCollectionValue() {
				return kechengCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setKechengCollectionValue(String kechengCollectionValue) {
				this.kechengCollectionValue = kechengCollectionValue;
			}










				//级联表的get和set kecheng

					/**
					* 获取： 资源标题
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 资源标题
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 资源类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 资源类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 资源类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 资源类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取： 资源图片
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 资源图片
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}

					/**
					* 获取： 资源视频
					*/
					public String getKechengVideo() {
						return kechengVideo;
					}
					/**
					* 设置： 资源视频
					*/
					public void setKechengVideo(String kechengVideo) {
						this.kechengVideo = kechengVideo;
					}

					/**
					* 获取： 文件下载
					*/
					public String getKechengFile() {
						return kechengFile;
					}
					/**
					* 设置： 文件下载
					*/
					public void setKechengFile(String kechengFile) {
						this.kechengFile = kechengFile;
					}

					/**
					* 获取： 资源详情
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 资源详情
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}













				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
