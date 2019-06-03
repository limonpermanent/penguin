package com.limon.commerce_pg.zk_pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;

/**
 * @author： ym
 * @description: zk
 * @date: Created in 11:19 AM 2019/6/2
 * @modified By:
 */
@SpringBootApplication
public class ZkApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZkApplication.class, args);
    }
}
