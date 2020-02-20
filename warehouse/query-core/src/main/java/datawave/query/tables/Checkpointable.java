package datawave.query.tables;

import datawave.webservice.query.Query;
import org.apache.accumulo.core.client.Connector;

/**
 * Query logics that implement this interface are considered checkpointable in that the serializable query
 * checkpoint can be captured and the logic can be torn down.  Subsequently the query can be reconsituted
 * and reinitialized given the checkpoint to continue where it left off.
 */
public interface Checkpointable {
    /**
     * Capture the current query checkpoint.  After this call the query logic can be torn down and GC'ed.
     * @return the query checkpoint
     */
    QueryCheckpoint checkpoint();

    /**
     * Reinitialize this query logic given the provided checkpoint.  After calling this method, the
     * results iterator can be retrieved by calling getTransformIterator(checkpoint.getQuery()) and one can
     * continue getting results for this query.
     * @param checkpoint
     */
    void setupQuery(Connector connection, QueryCheckpoint checkpoint) throws Exception;
}
