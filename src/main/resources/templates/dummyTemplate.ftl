${fruit} is good. You should eat <#if fruitCount gt 0>fruits<#else>fruit.</#if>
<#-- Comment to be ignored -->
<#switch color>
<#case "blue">
I love ${color} <#break>
<#case "red">
meh <#break>
<"default">
all's fine man
</#switch>

<#list users as x>
    ${x}
</#list>