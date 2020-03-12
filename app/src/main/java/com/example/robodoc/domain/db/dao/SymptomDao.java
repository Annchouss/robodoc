package com.example.robodoc.domain.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.robodoc.models.Symptom;

import java.util.List;

@Dao
public interface SymptomDao {

    @Insert
    void insertAll(Symptom... symptoms);

    @Insert
    long insert(Symptom symptom);

    @Update
    void update(Symptom symptom);

    @Delete
    void delete(Symptom symptom);

    @Query("SELECT * FROM symptoms")
    List<Symptom> getAllSymptom();

    @Query("SELECT * FROM symptoms WHERE id = :id ")
    Symptom getById(long id);

    @Query("DELETE FROM symptoms  WHERE id = :id")
    void deleteById(long id);


}
