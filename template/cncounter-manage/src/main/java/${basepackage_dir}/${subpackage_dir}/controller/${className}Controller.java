<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign classNameRest = className?replace("([a-z])([A-Z]+)","$1-$2","r")?lower_case>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.controller;

import org.springframework.stereotype.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import ${basepackage}.${subpackage}.entity.${className}Entity;
import ${basepackage}.${subpackage}.service.${className}Service;

/**
 * 控制器
 * @author lujp
 * @date <#if now??>- ${now?string('yyyy-MM-dd')}</#if>
 */
@RestController
public class ${className}Controller{

    @Autowired
    private ${className}Service ${classNameLower}Service;

    @ApiOperation("获取列表")
    @GetMapping("${baseUrl}/${classNameRest}s")
    public Result list(${className}Entity query){
		QueryResult<${className}Entity>result=${classNameLower}Service.listPage(query);
		return Result.success(result);
	}

    @ApiOperation("根据id获取详情")
    @GetMapping("${baseUrl}/${classNameRest}s/{id}")
    public AjaxResult info(@PathVariable("id") @ApiParam("id") String id){
		${className}Entity entity=${classNameLower}Service.getById(id);
		return Result.success(entity);
    }

    @ApiOperation("新增数据")
    @Transactional
    @PostMapping("${baseUrl}/${classNameRest}s")
    public AjaxResult add(@RequestBody ${className}Entity ${classNameLower}){
		EntityUtil.initBaseEntity(${classNameLower});
		${classNameLower}Service.save(${classNameLower});
		return Result.success(${classNameLower});
    }

    @ApiOperation("修改数据")
    @Transactional
    @PutMapping("${baseUrl}/${classNameRest}s")
    public AjaxResult update(@RequestBody ${className}Entity ${classNameLower}){
		EntityUtil.initUpdateEntity(${classNameLower});
		${classNameLower}Service.updateThrow(${classNameLower});
		return Result.success(${classNameLower});
    }

	@ApiOperation("根据id批量删除")
	@Transactional
	@DeleteMapping("${baseUrl}/${classNameRest}s")
	public AjaxResult deleteByIds(@RequestBody List<String> ids){

	}
}
