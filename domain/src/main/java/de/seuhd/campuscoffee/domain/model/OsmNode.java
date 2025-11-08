package de.seuhd.campuscoffee.domain.model;

import lombok.Builder;
import org.jspecify.annotations.NonNull;

/**
 * Represents an OpenStreetMap node with relevant Point of Sale information.
 * This is the domain model for OSM data before it is converted to a POS object.
 *
 * @param nodeId The OpenStreetMap node ID.
 */
@Builder
public record OsmNode(@NonNull Long nodeId,
                      @NonNull Double latitude,
                      @NonNull Double longitude,
                      @Nullable String name,
                      @Nullable String amenity) {

    //  all relevant fields for POS objects.
}
