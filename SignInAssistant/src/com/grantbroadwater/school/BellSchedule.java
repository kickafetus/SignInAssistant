package com.grantbroadwater.school;

import java.util.ArrayList;
import java.util.Collection;

public class BellSchedule {

	ArrayList<ClassPeriod> schedule;

	public BellSchedule() {
		super();
		this.setSchedule(new ArrayList<ClassPeriod>());
	}
	
	public BellSchedule(Collection<? extends ClassPeriod> c){
		this();
		this.addAll(c);
	}
	
	public ArrayList<ClassPeriod> getSchedule() {
		return schedule;
	}

	public void setSchedule(Collection<? extends ClassPeriod> c) {
		schedule.clear();
		this.addAll(c);
	}

	public int size() {
		return schedule.size();
	}

	public boolean isEmpty() {
		return schedule.isEmpty();
	}

	public boolean contains(Object o) {
		return schedule.contains(o);
	}

	public int indexOf(Object o) {
		return schedule.indexOf(o);
	}

	public ClassPeriod get(int index) {
		return schedule.get(index);
	}

	public ClassPeriod set(int index, ClassPeriod element) {
		return schedule.set(index, element);
	}

	public boolean add(ClassPeriod e) {
		return schedule.add(e);
	}

	public void add(int index, ClassPeriod element) {
		schedule.add(index, element);
	}

	public ClassPeriod remove(int index) {
		return schedule.remove(index);
	}

	public boolean remove(Object o) {
		return schedule.remove(o);
	}

	public boolean addAll(Collection<? extends ClassPeriod> c) {
		return schedule.addAll(c);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((schedule == null) ? 0 : schedule.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BellSchedule))
			return false;
		BellSchedule other = (BellSchedule) obj;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BellSchedule [schedule=" + schedule + "]";
	}
	
	
	
}