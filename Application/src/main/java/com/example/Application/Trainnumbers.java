package com.example.Application;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Trainnumbers {
@Id
private int no;
private int c2t;
private int c2m;
private int c2s;
private int m2t;
private int m2s;
private int m2c;
private int t2c;
private int t2m;
private int t2s;
private int s2c;
private int s2t;
private int s2m;
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public int getC2t() {
	return c2t;
}
public void setC2t(int c2t) {
	this.c2t = c2t;
}
public int getC2m() {
	return c2m;
}
public void setC2m(int c2m) {
	this.c2m = c2m;
}
public int getC2s() {
	return c2s;
}
public void setC2s(int c2s) {
	this.c2s = c2s;
}
public int getM2t() {
	return m2t;
}
public void setM2t(int m2t) {
	this.m2t = m2t;
}
public int getM2s() {
	return m2s;
}
public void setM2s(int m2s) {
	this.m2s = m2s;
}
public int getM2c() {
	return m2c;
}
public void setM2c(int m2c) {
	this.m2c = m2c;
}
public int getT2c() {
	return t2c;
}
public void setT2c(int t2c) {
	this.t2c = t2c;
}
public int getT2m() {
	return t2m;
}
public void setT2m(int t2m) {
	this.t2m = t2m;
}
public int getT2s() {
	return t2s;
}
public void setT2s(int t2s) {
	this.t2s = t2s;
}
public int getS2c() {
	return s2c;
}
public void setS2c(int s2c) {
	this.s2c = s2c;
}
public int getS2t() {
	return s2t;
}
public void setS2t(int s2t) {
	this.s2t = s2t;
}
public int getS2m() {
	return s2m;
}
public void setS2m(int s2m) {
	this.s2m = s2m;
}


}
