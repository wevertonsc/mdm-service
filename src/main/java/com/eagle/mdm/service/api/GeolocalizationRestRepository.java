package com.eagle.mdm.service.api;

import com.eagle.mdm.service.entity.Geolocalization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(
        path = "geololization",
        collectionResourceRel = "geolocalization"
)
public interface GeolocalizationRestRepository  extends CrudRepository<Geolocalization, UUID>,
        PagingAndSortingRepository<Geolocalization, UUID> {
}
