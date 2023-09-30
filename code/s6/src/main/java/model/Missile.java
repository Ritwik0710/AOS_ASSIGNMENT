package model;

public class Missile {
public Missile() {
		super();
	}
int x;
int y;
int time;
int type;
public Missile(int x, int y, int time, int type) {
	super();
	this.x = x;
	this.y = y;
	this.time = time;
	this.type = type;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int getTime() {
	return time;
}
public void setTime(int time) {
	this.time = time;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}

}
