package com.bmj.contentmapper.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author SSHABBIR
 *
 */
@ApiModel(value = "Message", description = "A message containing more info why the operation failed")
public class ErrorDto {
    @ApiModelProperty(value = "error message", readOnly = true)
    private String message;
    @ApiModelProperty(value = "exception message", readOnly = true)
    private String exception;

    public ErrorDto(String message, String exception) {
	this.message = message;
	this.setException(exception);
    }

    public ErrorDto(String message) {
	this.message = message;
    }

    public ErrorDto() {
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public String getException() {
	return exception;
    }

    public void setException(String exception) {
	this.exception = exception;
    }
}