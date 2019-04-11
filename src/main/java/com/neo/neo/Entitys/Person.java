package com.neo.neo.Entitys;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by hx on 2019-04-11.
 */
@NodeEntity // 声明节点类
public class Person {
    @Id // Neo4j会分配的ID（节点唯一标识 当前类中有效）
//    @GeneratedValue
    private Long id;
    private String name;
    private String phone;
    private String sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
