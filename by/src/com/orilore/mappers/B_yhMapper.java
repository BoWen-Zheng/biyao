package com.orilore.mappers;
import java.util.List;
import java.util.Map;

import com.orilore.model.*;
public interface B_yhMapper{
	public void insert(B_yh bean);
	public B_yh selectOne(int id);
	public void delete(int id);
	public List<B_yh> select();
	public void update(B_yh bean);
	public B_yh selectforname(Map map);
}