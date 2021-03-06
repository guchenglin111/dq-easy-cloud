package com.dq.easy.cloud.module.common.generator.code.base.constant;

import java.lang.reflect.Modifier;

import com.dq.easy.cloud.module.basic.utils.DqBaseUtils;
import com.dq.easy.cloud.module.common.string.constant.DqStringConstant.DqSymbol;
import com.dq.easy.cloud.module.common.string.utils.DqStringUtils;

/**
 * 
 * <p>
 *  代码生成常量类
 * </p>
 *
 * <pre>
 *  说明：代码生成组件所需要的常量
 *  约定：
 *  命名规范：
 *  使用示例：
 * </pre>
 *
 * @author daiqi
 * 创建时间    2018年3月21日 下午4:46:23
 */
public class DqCodeGenerateConstant {
	
	/**
	 * 
	 * <p>
	 * 代码项目常量类
	 * </p>
	 *
	 * @author daiqi
	 * 创建时间    2018年3月22日 下午5:28:11
	 */
	public static class DqCodeProject {
		/** 项目根路径---基础路径---System.getProperty("user.dir") */
		public static final String PROJECT_ROOT_BASE_PATH_DEFAULT = System.getProperty("user.dir") ;
	}
	
	/** 子模块默认的包名 */
	public static class DqSubModuleDefaultPackageName {
		public static final String POJO_DO = "pojo.entity";
		public static final String POJO_DTO = "pojo.dto";
		public static final String POJO_BO = "pojo.bo";
		public static final String POJO_QUERY = "pojo.query";
		public static final String DAO_INF = "dao";
		public static final String DAO_IMPL = "dao.impl";
		public static final String SERVICE_INF = "srvice";
		public static final String SERVICE_IMPL = "srvice.impl";
		public static final String LOGIC_INF = "logic";
		public static final String LOGIC_IMPL = "logic.impl";
		public static final String CONTROLLER = "controller";
		public static final String ERROR_CODE = "constant.error";
	}
	/**
	 * 
	 * <p>
	 * 类名简称
	 * </p>
	 *
	 * @author daiqi
	 * 创建时间    2018年3月23日 下午1:55:37
	 */
	public static class DqClassNameSimple {
		/** 类名简称---原始类型---byte */
		public static final String BYTE_ORIGINAL = "byte";
		/** 类名简称---原始类型---short */
		public static final String SHORT_ORIGINAL = "short";
		/** 类名简称---原始类型---int */
		public static final String INT_ORIGINAL = "int";
		/** 类名简称---原始类型---long */
		public static final String LONG_ORIGINAL = "long";
		/** 类名简称---原始类型---float */
		public static final String FLOAT_ORIGINAL = "float";
		/** 类名简称---原始类型---double */
		public static final String DOUBLE_ORIGINAL = "double";
		/** 类名简称---原始类型---boolean */
		public static final String BOOLEAN_ORIGINAL = "boolean";
		/** 类名简称---原始类型---char */
		public static final String CHAR_ORIGINAL = "char";
		/** 类名简称---包装类型---Byte */
		public static final String BYTE_PACK = "Byte";
		/** 类名简称---包装类型---Short */
		public static final String SHORT_PACK = "Short";
		/** 类名简称---包装类型---Integer */
		public static final String INT_PACK = "Integer";
		/** 类名简称---包装类型---Long */
		public static final String LONG_PACK = "Long";
		/** 类名简称---包装类型---Float */
		public static final String FLOAT_PACK = "Float";
		/** 类名简称---包装类型---Double */
		public static final String DOUBLE_PACK = "Double";
		/** 类名简称---包装类型---Boolean */
		public static final String BOOLEAN_PACK = "Boolean";
		/** 类名简称---包装类型---Character */
		public static final String CHAR_PACK = "Character";
		
		/** 类名简称---引用类型---String */
		public static final String STRING = "String";
		/** 类名简称---引用类型---BigDecimal */
		public static final String BIGDECIMAL = "BigDecimal";
		/** 类名简称---引用类型---Date */
		public static final String DATE = "Date";
		/** 类名简称---引用类型---byte [] */
		public static final String BYTE_ARRAY = "byte []";
	}
	
	public static class DqTemplateName {
		public static final String POJO_DO = "POJO_DO.ftl";
		public static final String POJO_DTO = "POJO_DTO.ftl";
		public static final String POJO_BO = "POJO_BO.ftl";
		public static final String POJO_QUERY = "POJO_QUERY.ftl";
		public static final String DAO_INF = "DAO_INF.ftl";
		public static final String DAO_IMPL = "DAO_IMPL.ftl";
		public static final String SERVICE_INF = "SERVICE_INF.ftl";
		public static final String SERVICE_IMPL = "SERVICE_IMPL.ftl";
		public static final String LOGIC_INF = "LOGIC_INF.ftl";
		public static final String LOGIC_IMPL = "LOGIC_IMPL.ftl";
		public static final String CONTROLLER = "CONTROLLER.ftl";
		public static final String ANNOTATION = "ANNOTATION.ftl";
		public static final String ASPECT = "ASPECT.ftl";
		public static final String CONFIG = "CONFIG.ftl";
		public static final String HANDLER = "HANDLER.ftl";
		public static final String PROXY = "PROXY.ftl";
		public static final String UTIL = "UTIL.ftl";
		public static final String COMMON = "COMMON.ftl";
		public static final String ERROR_CODE = "																																																																									QQQQQQQQQQQQQQQQQQQQ				QQQ																																																																																																																																																																																										.ftl";
	}
	
	
	/**
	 * 
	 * <p>
	 * 源代码路径常量类
	 * </p>
	 * 
	 * @author daiqi
	 * 创建时间    2018年3月23日 上午9:49:23
	 */
	public static class DqSourceCodeRelativePath {
		/** 源代码路径---java---src\\main\\java */
		public static final String JAVA = "src\\main\\java";
		/** 源代码路径---资源路径---src\\main\\resources */
		public static final String RESOURCES = "src\\main\\resources";
	}
	
	/** 注释结尾 */
	public static class DqClassCommentEndWith {
		public static final String POJO_DO = "持久化类";
		public static final String POJO_DTO = "数据传输类";
		public static final String POJO_BO = "业务逻辑类";
		public static final String POJO_QUERY = "查询类";
		public static final String DAO_INF = "数据处理接口";
		public static final String DAO_IMPL = "数据处理实现类";
		public static final String SERVICE_INF = "服务接口";
		public static final String SERVICE_IMPL = "服务实现类";
		public static final String LOGIC_INF = "业务逻辑接口";
		public static final String LOGIC_IMPL = "业务逻辑实现类";
		public static final String CONTROLLER = "控制转发类";
		public static final String ERROR_CODE = "错误代码枚举";
	}
	
	/** 类名结尾 */
	public static class DqClassNameEndWith {
		public static final String POJO_DO = "Entity";
		public static final String POJO_DTO = "DTO";
		public static final String POJO_BO = "BO";
		public static final String POJO_QUERY = "Query";
		public static final String DAO_INF = "DAO";
		public static final String DAO_IMPL = "DAOImpl";
		public static final String SERVICE_INF = "Service";
		public static final String SERVICE_IMPL = "ServiceImpl";
		public static final String LOGIC_INF = "Logic";
		public static final String LOGIC_IMPL = "LogicImpl";
		public static final String CONTROLLER = "Controller";
		public static final String ERROR_CODE = "ErrorCodeEnum";
	}
	/**
	 * 
	 * <p>
	 * 字段名标签常量
	 * </p>
	 *
	 * @author daiqi
	 * 创建时间    2018年3月22日 下午5:28:11
	 */
	public static class DqColumnLabel {
		/** 数据库表的字段名标签---字段名---COLUMN_NAME */
		public static final String COLUMN_NAME = "COLUMN_NAME";
		/** 数据库表的字段名标签---字段的类型名称---TYPE_NAME */
		public static final String TYPE_NAME = "TYPE_NAME";
		/** 数据库表的字段名标签---字段的备注---COLUMN_NAME */
		public static final String REMARKS = "REMARKS";
	}
	
	/**
	 * 
	 * <p>
	 * 方法类型枚举
	 * </p>
	 *
	 * @author daiqi
	 * 创建时间    2018年3月26日 上午11:56:31
	 */
	public static enum DqMethodTypeEnum {
		/** 方法类型枚举---其他方法--- -1 */
		OTHER(-1, "other"),
		/** 方法类型枚举---get---1 */
		GET(1, "get"),
		/** 方法类型枚举---set---2 */
		SET(2, "set"),
		/** 方法类型枚举---build---3 */
		BUILD(3, "build")
		;
		
		private Integer type;
		private String typeDesc;
		private DqMethodTypeEnum(Integer type, String typeDesc) {
			this.type = type;
			this.typeDesc = typeDesc;
		}
		public Integer getType() {
			return type;
		}
		public String getTypeDesc() {
			return typeDesc;
		}
		
		public static boolean isGet(Integer type) {
			if (GET.getType().equals(type)) {
				return true;
			}
			return false;
		}
		public static boolean isSet(Integer type) {
			if (SET.getType().equals(type)) {
				return true;
			}
			return false;
		}
		public static boolean isBuild(Integer type) {
			if (BUILD.getType().equals(type)) {
				return true;
			}
			return false;
		}
	}
	
	/**
	 * 
	 * <p>
	 * 忽略生成的属性
	 * </p>
	 *
	 * @author daiqi
	 * 创建时间    2018年3月21日 下午7:44:25
	 */
	public static class DqIgnoreField{
		/** 忽略属性---id属性---id */
		public static final String ID = "id";
		/** 忽略属性---创建时间属性---createDate */
//		public static final String CREATE_DATE = "createdate";
		/** 忽略属性---更新时间属性---updateDate */
		public static final String UPDATE_DATE = "updatedate";
		/** 忽略属性---版本属性---version */
		public static final String VERSION = "version";
		/** 忽略属性---创建者属性---createBy */
		public static final String CREATE_BY = "createby";
		/** 忽略属性---更新者属性---updateBy */
		public static final String UPDATE_BY = "updateby";
		/** 忽略属性---删除属性---isDeleted */
		public static final String IS_DELETED = "isdeleted";
		/** 忽略属性---备注属性---remark */
		public static final String REMARK = "remark";
		/** 忽略属性---available属性---available */
		public static final String AVAILABLE = "available";
		
		/**
		 * 
		 * <p>
		 * 是否是忽略的属性
		 * </p>
		 *
		 * @param fieldName : String : 属性名称
		 * @return true
		 * @author daiqi 创建时间 2018年3月21日 下午8:37:59
		 */
		public static final boolean isIgnoreField(String fieldName) {
//			移除下划线的小写字符串
			String rmOnderLineLowerCaseStr = DqStringUtils.lowerCase(DqStringUtils.replace(fieldName, DqSymbol.UNDER_LINE, DqStringUtils.EMPTY));
			return DqBaseUtils.isExistConstantValue(DqIgnoreField.class, rmOnderLineLowerCaseStr);
		}
		
		/**
		 * 修饰符映射美剧类
		 * @author daiqi
		 * @date 2018年3月24日 上午1:25:14
		 */
		public static enum DqModifierMappingEnum {
			ABSTRACT(Modifier.ABSTRACT, "abstract"),
			FINAL(Modifier.FINAL, "final"),
			INTERFACE(Modifier.INTERFACE, "interface"),
			NATIVE(Modifier.NATIVE, "native"),
			PRIVATE(Modifier.PRIVATE, "private"),
			PROTECTED(Modifier.PROTECTED, "protected"),
			PUBLIC(Modifier.PUBLIC, "public"),
			STATIC(Modifier.STATIC, "static"),
			STRICT(Modifier.STRICT, "strict"),
			SYNCHRONIZED(Modifier.SYNCHRONIZED, "synchronized"),
			TRANSIENT(Modifier.TRANSIENT, "transient"),
			VOLATILE(Modifier.VOLATILE, "volatile"),
			ENUM(0x00004000, "enum"),
			CLASS(0x00004020, "class");
			;
			
			private int modifier;
			private String modifierDesc;
			private DqModifierMappingEnum(int modifier, String modifierDesc){
				this.modifier = modifier;
				this.modifierDesc = modifierDesc;
			}
			public int getModifier() {
				return modifier;
			}
			public String getModifierDesc() {
				return modifierDesc;
			}
			
		}
	}
}
