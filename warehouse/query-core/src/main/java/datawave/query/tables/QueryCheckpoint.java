package datawave.query.tables;

import datawave.webservice.query.Query;
import datawave.webservice.query.configuration.GenericQueryConfiguration;

import java.io.Serializable;

/**
 * A query checkpoint
 */
public interface QueryCheckpoint extends Serializable {
    /**
     * Get the query for this checkpoint.
     * @return the query
     */
    Query getQuery();

    /**
     * Get the query configuration.
     * @return the configuration
     */
    GenericQueryConfiguration getConfig();
}
