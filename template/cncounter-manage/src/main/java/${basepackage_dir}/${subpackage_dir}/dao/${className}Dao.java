<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.dao;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ${basepackage}.${subpackage}.entity.${className}Entity;

/**
 * Dao层
 * @author lujp
 * @date <#if now??>- ${now?string('yyyy-MM-dd')}</#if>
 */
@Mapper
@Repository
public interface ${className}Dao extends BaseMapper<${className}Entity> {

}