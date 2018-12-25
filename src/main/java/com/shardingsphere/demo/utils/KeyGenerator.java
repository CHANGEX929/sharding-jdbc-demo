package com.shardingsphere.demo.utils;

/**
 * @author Xie Chenxi
 * @date 2018-12-25 12:08
 */
public class KeyGenerator implements io.shardingsphere.core.keygen.KeyGenerator {

    SnowFlakeGenerator snowFlake = new SnowFlakeGenerator(2, 3);

    @Override
    public Number generateKey() {
        return snowFlake.createId();
    }
}
