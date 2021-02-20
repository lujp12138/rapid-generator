<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.${subpackage}.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lujp.xx1admin.base.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 实体类
 * @author lujp
 * @date <#if now??>- ${now?string('yyyy-MM-dd')}</#if>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("${table.sqlName}")
public class ${className}Entity extends BaseEntity {

	<#list table.columns as column>
	<#if column.sqlName!='id'
			&&column.sqlName!='create_user_id'
			&&column.sqlName!='create_user_name'
			&&column.sqlName!='create_time'
			&&column.sqlName!='update_user_id'
			&&column.sqlName!='update_user_name'
			&&column.sqlName!='update_time'
			&&column.sqlName!='remark'
			&&column.sqlName!='version'>
	/**
	 * ${column.columnAlias}
	 */
	private ${column.simpleJavaType} ${column.columnNameLower};

	</#if>
	</#list>
}