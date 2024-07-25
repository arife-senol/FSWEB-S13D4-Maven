package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
    public double distance(){
        return Math.sqrt(((x-0)*(x-0)+(y-0)*(y-0)));
    }
    public double distance(Point p){
        return Math.sqrt((this.getX()-p.getX())*(this.getX()-p.getX())+(y-p.getY())*(y-p.getY()));
    }

    public double distance(int a,int b){
        return Math.sqrt((this.getX()-a)*(this.getX()-a)+(this.getY()-b)*(this.getY()-b));
    }
}
