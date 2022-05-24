package com.knoldus.group.repository;
import com.knoldus.group.model.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface GroupRepository extends JpaRepository<GroupModel, Integer> {
    @Query(value = "select * from group_model where id = ?1", nativeQuery = true)
    GroupModel fetchGroup(int id);
}
