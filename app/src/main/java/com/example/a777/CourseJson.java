package com.example.a777;

public class CourseJson {
    private String id;
    private String name;
    private String code;
    private String categoryId;
    private String description;
    private String price;
    private String status;
    private String openDate;
    private String lastUpdateOn;
    private String level;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getName(){
        return this.name;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public String getCategoryId(){
        return this.categoryId;
    }
    public String getDescription(){
        return this.description;
    }
    @Override
    public String toString() {
        return "\n   课程名称："+this.name + "\n   code为：" + this.code + "\n   课程号：" + this.categoryId + "\n   课程描述：" + this.description;
    }
}
