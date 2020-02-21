package datawave.webservice.query.logic;

import datawave.webservice.query.configuration.GenericQueryConfiguration;
import org.apache.accumulo.core.client.Connector;

/**
 * Query logics that implement this interface are considered checkpointable in that the serializable query checkpoint can be captured and the logic can be torn
 * down. Subsequently the query can be reconsituted and reinitialized given the checkpoint to continue where it left off.
 */
public interface Checkpointable {
    /**
     * Capture the current query checkpoint. After this call the query logic can be torn down and GC'ed.
     * 
     * @return the query checkpoint
     */
    QueryCheckpoint checkpoint();
    
    /**
     * Reinitialize the logic with the given checkpoint.
     * 
     * @param connection
     *            The accumulo connector
     * @param checkpoint
     *            The query checkpoint returned by checkpoint()
     * @throws Exception
     *             upon failure
     */
    GenericQueryConfiguration initialize(Connector connection, QueryCheckpoint checkpoint) throws Exception;
}
