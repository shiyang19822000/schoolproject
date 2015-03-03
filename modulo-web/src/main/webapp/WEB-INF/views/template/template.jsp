<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "DTD/xhtml1-strict.dtd">
<html>
<head>
    <%--<link rel="stylesheet" href="css/style.css" type="text/css" />--%>
</head>

<body>
<div class="header">
    <tiles:insertAttribute name="header" />
</div>
<%--<div class="menu">
    <tiles:insertAttribute name="menu" />
</div>--%>
<div class="body">
    <tiles:insertAttribute name="body" />
</div>
<%--<div class="footer">
    <tiles:insertAttribute name="footer" />
</div>--%>
</body>
</html>
