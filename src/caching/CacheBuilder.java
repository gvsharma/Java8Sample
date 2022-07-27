package caching;

import caching.lru.LRUCache;
import caching.lru.LRUImpl;

class CacheBuilder {


    private static Cache cache;


    //methods

//    public CacheBuilder builder() {
//
//    }

    private EvicationType evictionType;

    public static void setCachePolicy(EvicationType evictionType) {
        //LRU, LFU etc implmentation
        if(evictionType.equals(CachePolicies.LRU)) {
            //
//            cache = new LRUImpl();
        }
    }

    public static CacheBuilder build() {
        return new CacheBuilder();
    }


}
