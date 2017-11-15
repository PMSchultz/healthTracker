package edu.cnm.deepdive.healthtracker.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

@DatabaseTable(tableName = "ALLERGY")

public class Allergy {

  //Links database table name to Allergy class
  @DatabaseField(columnName = "ALLERGY_ID", generatedId = true)
  private int id;

  @DatabaseField(columnName = "PATIENT_ID", canBeNull = false, foreign = true, foreignAutoRefresh = true)
  private Patient patient;

  @DatabaseField(columnName = "MEDICATION_ID",foreign = false, canBeNull = true)
  private String medAllergy;

  @DatabaseField(columnName = "FOOD_ALLERGY", canBeNull = true)
  private String foodAllergy;

  @DatabaseField(columnName = "SEASONAL_ALLERGY", canBeNull = true)
  private String seasonalAllergy;

  @DatabaseField(columnName = "ANIMAL_ALLERGY", canBeNull = true)
  private String animalAllergy;

  @DatabaseField(columnName = "LATEX_ALLERGY", canBeNull = true)
  private boolean latexAllergy;

  @DatabaseField(columnName = "NOTES", canBeNull = true)
  private String notes;

  public int getId() {
    return id;
  }

  public String getMedAllergy() {
    return medAllergy;
  }

  public void setMedAllergy(String medAllergy) {
    this.medAllergy = medAllergy;
  }

  public String getFoodAllergy() {
    return foodAllergy;
  }

  public void setFoodAllergy(String foodAllergy) {
    this.foodAllergy = foodAllergy;
  }

  public String getSeasonalAllergy() {
    return seasonalAllergy;
  }

  public void setSeasonalAllergy(String seasonalAllergy) {
    this.seasonalAllergy = seasonalAllergy;
  }

  public String getAnimalAllergy() {
    return animalAllergy;
  }

  public void setAnimalAllergy(String animalAllergy) {
    this.animalAllergy = animalAllergy;
  }

  public Boolean getLatexAllergy() {
    return latexAllergy;
  }

  public void setLatexAllergy(Boolean latexAllergy) {
    this.latexAllergy = latexAllergy;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  @Override
  public String toString() {
    return ((medAllergy!= null) ?  ("Medication Allergy: " + medAllergy + " ") : "") +
        ((foodAllergy != null) ?  ("Food Allergy: " + foodAllergy + " ") : "") +
        ((seasonalAllergy != null) ?  ("Seasonal Allergy: " + seasonalAllergy + " ") : "") +
        ((animalAllergy != null) ?  ("Animal Allergy: " + animalAllergy + " ") : " ") +
     ((latexAllergy ?  "Latex Allergy" : ""));
  }
  }

