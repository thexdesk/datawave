package datawave.query.tables;

import datawave.query.config.ShardQueryConfiguration;
import datawave.webservice.query.QueryImpl;

public class ShardQueryLogicCheckpoint implements QueryCheckpoint {
    private static final long serialVersionUID = 4836494030049460326L;

    QueryImpl query;
    ShardQueryConfiguration config;

    @Override
    public QueryImpl getQuery() {
        return query;
    }

    @Override
    public ShardQueryConfiguration getConfig() {
        return config;
    }
}
