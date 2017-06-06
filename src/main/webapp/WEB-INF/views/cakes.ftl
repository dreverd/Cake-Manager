<html>
<head>
	<title>Cakes</title>
</head>
<body>
	<style type="text/css">
	.tg  {border-collapse:collapse;border-spacing:0;border-color:#aabcfe;}
	.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#e8edff;}
	.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#039;background-color:#b9c9fe;}
	.tg .tg-baqh{text-align:center;vertical-align:top}
	.tg .tg-6k2t{background-color:#D2E4FC;vertical-align:top}
	.tg .tg-yw4l{vertical-align:top}
	</style>

	<table class="tg">
	  <tr>
	    <th class="tg-baqh" colspan="4">Cakes</th>
	  </tr>
	  <tr>
	    <td class="tg-6k2t">Title</td>
	    <td class="tg-6k2t">Description</td>
	    <td class="tg-6k2t">Image</td>
	    <td class="tg-6k2t">Num In Stock</td>
	  </tr>
     <#list model["cakes"] as cake>
	  <tr>
	    <td class="tg-yw4l">${cake.title}</td>
	    <td class="tg-yw4l">${cake.description}</td>
	    <td class="tg-lqy6"><img border="0" src="${cake.image}" width="75" height="50"></td>
	    <td class="tg-lqy6">${cake.cakeCount}</td>
	  </tr>
    </#list>
	</table>  
</body>
</html>
