package com.chenyuantech.shiro.Realms.ShiroRealm;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class ShiroRealm extends AuthorizingRealm { 
	
	
	  
     /**
      * 授权 
      */
    @Override  
    protected AuthorizationInfo doGetAuthorizationInfo(  
            PrincipalCollection principals) {  
        String currentUsername = (String)super.getAvailablePrincipal(principals);   
          
//      List<String> roleList = new ArrayList<String>();    
//      List<String> permissionList = new ArrayList<String>();    
//      //从数据库中获取当前登录用户的详细信息    
//      User user = userService.getByUsername(currentUsername);    
//      if(null != user){    
//          //实体类User中包含有用户角色的实体类信息    
//          if(null!=user.getRoles() && user.getRoles().size()>0){    
//              //获取当前登录用户的角色    
//              for(Role role : user.getRoles()){    
//                  roleList.add(role.getName());    
//                  //实体类Role中包含有角色权限的实体类信息    
//                  if(null!=role.getPermissions() && role.getPermissions().size()>0){    
//                      //获取权限    
//                      for(Permission pmss : role.getPermissions()){    
//                          if(!StringUtils.isEmpty(pmss.getPermission())){    
//                              permissionList.add(pmss.getPermission());    
//                          }    
//                      }    
//                  }    
//              }    
//          }    
//      }else{    
//          throw new AuthorizationException();    
//      }    
//      //为当前用户设置角色和权限    
//      SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();    
//      simpleAuthorInfo.addRoles(roleList);    
//      simpleAuthorInfo.addStringPermissions(permissionList);   
          
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();  
          
        if(null!=currentUsername && currentUsername.equals("admin")){    
            //添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色      
            simpleAuthorInfo.addRole("admin");    
            //添加权限    
            simpleAuthorInfo.addStringPermission("admin:manage");    
            System.out.println("已为用户[admin]赋予了[admin]角色和[admin:manage]权限");    
            return simpleAuthorInfo;    
        }   
        return simpleAuthorInfo;    
      
        //若该方法什么都不做直接返回null的话,就会导致任何用户访问/admin/listUser.jsp时都会自动跳转到unauthorizedUrl指定的地址    
        //详见applicationContext.xml中的<bean id="shiroFilter">的配置    
//      return null;  
    }  
  
    /** 
     * 登录认证; 
     */  
    @Override  
    protected AuthenticationInfo doGetAuthenticationInfo(  
            AuthenticationToken authenticationToken) throws AuthenticationException {  
        //UsernamePasswordToken对象用来存放提交的登录信息  
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;  
        //查出是否有此用户  
     //   USERS user=userService.findByName(token.getUsername());  
//        System.out.println("========token.getUsername()========"+token.getUsername()+"  PWD:"+token.getPassword()+"======getName()===="+getName());
        
        if(token.getUsername()!=null){  
            //若存在，将此用户存放到登录认证info中  
            return new SimpleAuthenticationInfo(token.getUsername(), token.getPassword(), getName());  
        }  
        return null;  
    }
  
}
