package com.bmj.contentmapper.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bmj.contentmapper.entity.ContentMapping;
/**
 * @author SSHABBIR
 *
 */
@Repository
public interface ContentMappingRepository extends CrudRepository<ContentMapping, Long> {
}
