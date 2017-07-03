package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IProvincesBiz{
	public boolean addProvinces(Provinces provinces);
	public boolean removeProvinces(int id);
	public boolean modifyProvinces(Provinces provinces);
	public Provinces getProvinces(int id);
	public List<Provinces> findProvinces();
}