package com.dq.easy.cloud.module.common.generator.code.java.pojo.bo.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.easy.cloud.module.basic.service.DqBaseService;
import com.dq.easy.cloud.module.common.generator.code.base.config.database.DqDatabaseAbstactConfig;
import com.dq.easy.cloud.module.common.generator.code.base.constant.DqCodeGenerateConstant.DqClassCommentEndWith;
import com.dq.easy.cloud.module.common.generator.code.base.constant.DqCodeGenerateConstant.DqClassNameEndWith;
import com.dq.easy.cloud.module.common.generator.code.base.constant.DqCodeGenerateConstant.DqIgnoreField.DqModifierMappingEnum;
import com.dq.easy.cloud.module.common.generator.code.base.constant.DqCodeGenerateConstant.DqSubModuleDefaultPackageName;
import com.dq.easy.cloud.module.common.generator.code.base.pojo.desc.DqTemplateDesc;
import com.dq.easy.cloud.module.common.generator.code.base.pojo.rule.DqGenerateRule;
import com.dq.easy.cloud.module.common.generator.code.java.desc.DqJavaContentBaseDesc;
import com.dq.easy.cloud.module.common.generator.code.java.desc.DqJavaFieldContentDesc;
import com.dq.easy.cloud.module.common.generator.code.java.desc.DqJavaModifierDesc;
import com.dq.easy.cloud.module.common.generator.code.java.desc.anno.DqJavaAnnotationDesc;
import com.dq.easy.cloud.module.common.generator.code.java.desc.anno.DqJavaAnnotationParamDesc;
import com.dq.easy.cloud.module.common.generator.code.java.pojo.bo.DqGenerateJavaBaseBO;
import com.dq.easy.cloud.module.common.generator.code.java.pojo.dto.DqGenerateJavaBaseDTO;
import com.dq.easy.cloud.module.common.string.utils.DqStringUtils;

/**
 * 
 * <p>
 * 生成业务逻辑类
 * </p>
 *
 *
 * @author daiqi 创建时间 2018年3月27日 上午9:54:03
 */
public class DqGenerateJavaServiceImplBO extends DqGenerateJavaBaseBO {

	public DqGenerateJavaServiceImplBO(DqGenerateJavaBaseDTO generateJavaBaseDTO, DqDatabaseAbstactConfig dataBaseConfig,
			DqTemplateDesc templateDesc, DqGenerateRule generateRule) {
		super(generateJavaBaseDTO, dataBaseConfig, templateDesc, generateRule);

	}

	@Override
	protected List<DqJavaAnnotationDesc> getClassAnnotations() {
		List<DqJavaAnnotationDesc> annotationDescs = new ArrayList<>();
		DqJavaAnnotationDesc serviceAnnotation = new DqJavaAnnotationDesc();
		serviceAnnotation.setName(Service.class.getSimpleName());
		serviceAnnotation.setSimpleClassType(Service.class.getSimpleName());
		serviceAnnotation.setFullClassType(Service.class.getName());

		List<DqJavaAnnotationParamDesc> serviceAnnotationParamDescs = new ArrayList<>();
		String value = DqStringUtils.uncapitalize(generateJavaBaseDTO.getClassBodyName() + DqClassNameEndWith.DAO_INF);
		serviceAnnotationParamDescs.add(new DqJavaAnnotationParamDesc("value", value));
		serviceAnnotation.setParams(serviceAnnotationParamDescs);

		annotationDescs.add(serviceAnnotation);
		return annotationDescs;
	}

	@Override
	protected DqJavaContentBaseDesc getExtendsParentClass() {
		DqJavaContentBaseDesc extendsParentClass = new DqJavaContentBaseDesc();
		extendsParentClass.setName(DqBaseService.class.getSimpleName());
		extendsParentClass.setSimpleClassType(DqBaseService.class.getSimpleName());
		extendsParentClass.setFullClassType(DqBaseService.class.getName());
		return extendsParentClass;
	}

	@Override
	protected String getClassNameEndWith() {
		return DqClassNameEndWith.SERVICE_IMPL;
	}

	@Override
	public DqGenerateJavaBaseBO buildJavaClassContentOtherData() {
		super.buildFields(getFieldContentDescs());
		return this;
	}

	private List<DqJavaFieldContentDesc> getFieldContentDescs() {
		List<DqJavaFieldContentDesc> fieldContentDescs = new ArrayList<>();
		DqJavaFieldContentDesc fieldContentDesc = new DqJavaFieldContentDesc();
		fieldContentDesc.setComment(javaClassContentDesc.getComment() + DqClassCommentEndWith.DAO_INF);
//		设置属性注解
		List<DqJavaAnnotationDesc> annotationDescs = new ArrayList<>();
		DqJavaAnnotationDesc annotationDesc = new DqJavaAnnotationDesc();
		annotationDesc.setName(Autowired.class.getSimpleName());
		annotationDesc.setSimpleClassType(Autowired.class.getSimpleName());
		annotationDesc.setFullClassType(Autowired.class.getName());
		annotationDescs.add(annotationDesc);
		fieldContentDesc.setAnnotations(annotationDescs);
		
//		设置属性的modifiers
		List<DqJavaModifierDesc> modifiers = new ArrayList<>();
		DqJavaModifierDesc modifierDesc = new DqJavaModifierDesc(DqModifierMappingEnum.PRIVATE);
		modifiers.add(modifierDesc);
		fieldContentDesc.setModifiers(modifiers);
//		设置属性名称和类型
		String daoName = super.generateJavaBaseDTO.getClassBodyName() + DqClassNameEndWith.DAO_INF;
		fieldContentDesc.setName(daoName);
		fieldContentDesc.setSimpleClassType(daoName);
		fieldContentDesc.setPackageName(getFullPackageName(DqSubModuleDefaultPackageName.DAO_INF));
		fieldContentDesc.buildFullClassType();
		
		fieldContentDescs.add(fieldContentDesc);

		return fieldContentDescs;
	}

	@Override
	protected String getClassComment() {
		return super.getClassComment() + DqClassCommentEndWith.SERVICE_IMPL;
	}
}
