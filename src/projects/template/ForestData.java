package projects.template;

import java.util.HashSet;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import projects.template.nodes.messages.thirdStepMessageComplete;
import projects.template.nodes.nodeImplementations.NodeP;
import sinalgo.tools.Tools;

public class ForestData {

	private int parent;
	private int child;
	private int ID;
	private int color;
	private int nextColor;
	private int counter;
	private int forestNumber;
	public HashSet<Integer> Lv;
	public HashSet<Integer> children;
	
	public ForestData(int id,int parent) {
		this.parent=parent;
		this.ID = id;
		this.child = 0;
		this.color=id;
		this.Lv = new HashSet<Integer>();
		this.children = new HashSet<Integer>();
	}
	
	
	public ForestData(int id) {
		this.ID = id;
		this.child = 0;
		this.color=id;
		this.Lv = new HashSet<Integer>();
		this.children = new HashSet<Integer>();
	}


	public int getID() {
		return ID;
	}
	
	public int getChild() {
		return child;
	}
	
	
	
	public int getParent() {
		return parent;
	}
	
	public void setChild(int child) {
		this.child = child;
	}
	
	public void setParent(int parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "parent: " + this.parent + " parent color: " + 
				((parent!=0) ? ((NodeP)Tools.getNodeByID(this.parent)).colorByForestId(forestNumber) : -1)
				+ " me: " + this.ID +  " my color : " + this.color 
				+ " child: " + this.children.toString();
				
	}
	
	public void setNextColor(int nextColor) {
		counter++;
		this.nextColor = nextColor;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}

	public int getNextColor() {
		return nextColor;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int getForestNumber() {
		return forestNumber;
	}
	
	public void setForestNumber(int forestNumber) {
		this.forestNumber = forestNumber;
	}


	public void addChild(int child) {
		this.children.add(child);
	}
	
	
}
