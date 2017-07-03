package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface ICitiesBiz{
	public boolean addCities(Cities cities);
	public boolean removeCities(int id);
	public boolean modifyCities(Cities cities);
	public Cities getCities(int id);
	public List<Cities> findCities();
}