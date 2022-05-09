/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin,Point end) {
    this.begin= begin;
    this.end= end;
    }
    
    public Line(int x1,int y1,int x2,int y2){
       this.begin =  new Point(x1, y1);
       this.end = new Point(x2, y2);
       
    }
    
    
    public double getLength() {
		return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
	}
    
    
}
