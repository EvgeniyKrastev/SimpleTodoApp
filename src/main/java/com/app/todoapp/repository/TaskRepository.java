package com.app.todoapp.repository;

import com.app.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository it's used to connect app to DB and do CRUD. Task - entity, Long - primary key type.
public interface TaskRepository extends JpaRepository<Task, Long> {
}
