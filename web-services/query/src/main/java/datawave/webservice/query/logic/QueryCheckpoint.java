package datawave.webservice.query.logic;

import datawave.webservice.query.configuration.GenericQueryConfiguration;

import java.io.Serializable;

/**
 * A query checkpoint
 */
public interface QueryCheckpoint extends Serializable {
    /**
     * Get the query configuration.
     * 
     * @return the configuration
     */
    GenericQueryConfiguration getConfig();
}
