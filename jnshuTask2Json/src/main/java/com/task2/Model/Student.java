package com.task2.Model;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/5/11 15:49
 * @Version 1.0
 **/

public class Student {
    private long id;
    private String name;
    private long qq;
    private String type;
    private String start_time;
    private String school;
    private long student_id;
    private String link;
    private String wish;
    private String bro;
    private String way;
    private Date create_time;
    private Date update_time;

    public Student(long id, String name, long qq, String type, String start_time, String school, long student_id, String link, String wish, String bro, String way, Date create_time, Date update_time) {
        this.id = id;
        this.name = name;
        this.qq = qq;
        this.type = type;
        this.start_time = start_time;
        this.school = school;
        this.student_id = student_id;
        this.link = link;
        this.wish = wish;
        this.bro = bro;
        this.way = way;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQq() {
        return qq;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getBro() {
        return bro;
    }

    public void setBro(String bro) {
        this.bro = bro;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}