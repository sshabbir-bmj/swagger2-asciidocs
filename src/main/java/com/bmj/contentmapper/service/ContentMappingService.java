package com.bmj.contentmapper.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.bmj.contentmapper.entity.ContentMapping;
import com.bmj.contentmapper.repository.ContentMappingRepository;

/**
 * @author SSHABBIR
 *
 */
@Component("contentMappingService")
@Transactional
public class ContentMappingService {

    private final ContentMappingRepository contentMappingRepository;

    public ContentMappingService(ContentMappingRepository contentMappingRepository) {
	this.contentMappingRepository = contentMappingRepository;
    }

    public ContentMapping save(ContentMapping contentMapping) {
	return contentMappingRepository.save(contentMapping);
    }

}
