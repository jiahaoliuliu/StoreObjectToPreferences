package com.jiahaoliuliu.storeobjecttopreferences.model;

import java.util.List;

/**
 * Created by jliu on 01/10/14.
 */
public class SimpleModel {

    public enum SimpleEnum {
        FIRST_ENUM, SECOND_ENUM;
    }

    private String fieldString;
    private int fieldInteger;
    private SimpleEnum fieldSimpleEnum;
    private List<SimpleEnum> fieldListSimpleEnum;

    public SimpleModel() {}

    public SimpleModel(String fieldString, int fieldInteger, SimpleEnum fieldSimpleEnum, List<SimpleEnum> fieldListSimpleEnum) {
        this.fieldString = fieldString;
        this.fieldInteger = fieldInteger;
        this.fieldSimpleEnum = fieldSimpleEnum;
        this.fieldListSimpleEnum = fieldListSimpleEnum;
    }

    public String getFieldString() {
        return fieldString;
    }

    public void setFieldString(String fieldString) {
        this.fieldString = fieldString;
    }

    public int getFieldInteger() {
        return fieldInteger;
    }

    public void setFieldInteger(int fieldInteger) {
        this.fieldInteger = fieldInteger;
    }

    public SimpleEnum getFieldSimpleEnum() {
        return fieldSimpleEnum;
    }

    public void setFieldSimpleEnum(SimpleEnum fieldSimpleEnum) {
        this.fieldSimpleEnum = fieldSimpleEnum;
    }

    public List<SimpleEnum> getFieldListSimpleEnum() {
        return fieldListSimpleEnum;
    }

    public void setFieldListSimpleEnum(List<SimpleEnum> fieldListSimpleEnum) {
        this.fieldListSimpleEnum = fieldListSimpleEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || ((Object) this).getClass() != o.getClass()) return false;

        SimpleModel that = (SimpleModel) o;

        if (fieldInteger != that.fieldInteger) return false;
        if (fieldListSimpleEnum != null ? !fieldListSimpleEnum.equals(that.fieldListSimpleEnum) : that.fieldListSimpleEnum != null)
            return false;
        if (fieldSimpleEnum != that.fieldSimpleEnum) return false;
        if (fieldString != null ? !fieldString.equals(that.fieldString) : that.fieldString != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fieldString != null ? fieldString.hashCode() : 0;
        result = 31 * result + fieldInteger;
        result = 31 * result + (fieldSimpleEnum != null ? fieldSimpleEnum.hashCode() : 0);
        result = 31 * result + (fieldListSimpleEnum != null ? fieldListSimpleEnum.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SimpleModel{" +
                "fieldString='" + fieldString + '\'' +
                ", fieldInteger=" + fieldInteger +
                ", fieldSimpleEnum=" + fieldSimpleEnum +
                ", fieldListSimpleEnum=" + fieldListSimpleEnum +
                '}';
    }
}
