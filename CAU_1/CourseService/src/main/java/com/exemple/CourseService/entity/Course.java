package com.exemple.CourseService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EducationDB")
@Getter
@Setter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue
    private Long SubId;
    private String Name;
    private double Price;
    private String Description;

    public Course(String name, double price, String description) {
        this.Name = name;
        this.Price = price;
        this.Description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "SubId=" + SubId +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Description='" + Description + '\'' +
                '}';
    }
}
