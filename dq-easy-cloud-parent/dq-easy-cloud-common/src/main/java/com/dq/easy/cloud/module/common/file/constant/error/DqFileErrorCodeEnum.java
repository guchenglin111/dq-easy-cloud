package com.dq.easy.cloud.module.common.file.constant.error;

import com.dq.easy.cloud.module.basic.constant.error.DqBaseErrorCodeInf;

/**
 * 文件错误代码类
 * @author daiqi
 * @date 2018年3月23日 下午11:56:44
 */
public enum DqFileErrorCodeEnum implements DqBaseErrorCodeInf{
	FILE_DIRECTORY_FULL_PATH_CANT_EMPTY("FILE_000001", "文件目录完整路径不能为空"),
	FILE_FULL_PATH_CANT_EMPTY("FILE_000002", "文件完整路径不能为空"),
	FILE_CANT_EMPTY("FILE_000003", "文件不能为空"),
	FILE_NAME_CANT_EMPTY("FILE_000004", "文件名称不能为空"),
	FILE_SUFFIX_CANT_EMPTY("FILE_000005", "文件后缀不能为空"),
	;

	private String errorCode;
	private String errorMsg;

	private DqFileErrorCodeEnum(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String getErrorCode() {
		return errorCode;
	}

	@Override
	public String getErrorMsg() {
		return errorMsg;
	}

}
