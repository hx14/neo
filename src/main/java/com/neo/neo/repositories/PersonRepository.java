package com.neo.neo.repositories;


import com.neo.neo.Entitys.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * Created by hx on 2019-04-11.
 */

/**
 * springboot2.0之后使用Neo4jRepository,原来的GraphRepository被移除
 */
public interface PersonRepository extends Neo4jRepository<Person, Long> {
    Person findByName(@Param("name") String name);
    @Query("MATCH (t:Person) WHERE t.name =~ ('(?i).*'+{name}+'.*') RETURN t")
    Collection<Person> findByPersonName(@Param("name") String name);
}
