<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.service.impl;

import org.springframework.stereotype.Service;
import ${basepackage}.${subpackage}.service.${className}Service;
import ${basepackage}.${subpackage}.dao.${className}Dao;
import ${basepackage}.${subpackage}.entity.${className}Entity;

/**
 * 服务层接口实现
 * @author lujp
 * @date <#if now??>- ${now?string('yyyy-MM-dd')}</#if>
 */
@Service
public class ${className}ServiceImpl extends BaseServiceImpl<${className}Dao, ${className}Entity> implements ${className}Service {
	

}
