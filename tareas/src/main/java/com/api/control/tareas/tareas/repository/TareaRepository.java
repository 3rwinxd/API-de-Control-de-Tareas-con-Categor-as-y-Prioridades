package com.api.control.tareas.tareas.repository;
import com.api.control.tareas.tareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
