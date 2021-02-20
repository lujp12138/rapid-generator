<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.service;

import com.lujp.xx1admin.base.entity.BaseEntity;
import com.lujp.xx1admin.base.service.BaseService;
import ${basepackage}.${subpackage}.entity.${className};

/**
 * 服务层接口
 * @author lujp
 * @date <#if now??>- ${now?string('yyyy-MM-dd')}</#if>
 */
public interface ${className}Service extends BaseService<${className}Entity> {
	
}
