package com.chenyuantech.eps.utils;

import java.util.Map;

public class MapObjetTool {  
      
    public static Object mapToObject(Map<String , Object> map, Class<?> beanClass) throws Exception {    
        if (map == null)  
            return null;  
  
        Object obj = beanClass.newInstance();  
  
        org.apache.commons.beanutils.BeanUtils.populate(obj, map);  
  
        return obj;  
    }    
      
    public static Map<String , Object> objectToMap(Object obj) {  
        if(obj == null)  
            return null;   
  
        return new org.apache.commons.beanutils.BeanMap(obj);  
    }    
      
}  