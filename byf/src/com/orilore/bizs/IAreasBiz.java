package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IAreasBiz{
	public boolean addAreas(Areas areas);
	public boolean removeAreas(int id);
	public boolean modifyAreas(Areas areas);
	public Areas getAreas(int id);
	public List<Areas> findAreas();
}