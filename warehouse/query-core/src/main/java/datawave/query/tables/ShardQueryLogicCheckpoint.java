package datawave.query.tables;

import datawave.query.config.ShardQueryConfiguration;
import datawave.webservice.query.logic.QueryCheckpoint;

public class ShardQueryLogicCheckpoint implements QueryCheckpoint {
    private static final long serialVersionUID = 4836494030049460326L;
    
    ShardQueryConfiguration config;
    
    @Override
    public ShardQueryConfiguration getConfig() {
        return config;
    }
}
