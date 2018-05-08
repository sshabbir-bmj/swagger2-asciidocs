package com.bmj.contentmapper.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author SSHABBIR
 *
 */
public class CreateModuleDto {

    @NotNull(message = "notNull.ContentMappingDTO.elucidatId")
    @ApiModelProperty(value = "unique translation elucidat id")
    private String elucidatId;

    @NotNull(message = "notNull.ContentMappingDTO.moduleId")
    @Digits(integer = 10, fraction = 0, message = "format.ContentMappingDTO.moduleId")
    @ApiModelProperty(value = "module id used for all language variants")
    private int moduleId;

    public CreateModuleDto() {
    }

    public CreateModuleDto(String elucidatId, int moduleId) {
	this.elucidatId = elucidatId;
	this.moduleId = moduleId;
    }

    public String getElucidatId() {
        return elucidatId;
    }

    public void setElucidatId(String elucidatId) {
        this.elucidatId = elucidatId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }
}
