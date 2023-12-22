package com.eagle.mdm.service.api;


import com.eagle.mdm.service.entity.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.UUID;
@RepositoryRestResource(
        path = "permissions",
        collectionResourceRel = "permissions"
)
public interface PermissionRestRepository extends CrudRepository <Permission, UUID>,
        PagingAndSortingRepository <Permission, UUID> {
}
