
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EJERCICIO 03</title>
        <script>
            function calcular(){
                var numero;
                
                numero= window.document.form.txtnumero.value;
                if(numero==''){
                    alert("Ingrese el numero");
                    window.document.form.txtnumero.focus();
                    return;
                }else{
                    window.document.form.action="<%=request.getContextPath()%>/LogicaServlet";
                   window.document.form.method="GET";
                   window.document.form.submit();
                }
            }
        </script>
    </head>
    <body>
    <center>
        <form name="form">
            <table>
                <tr>
                    <td>Colegio:</td>
                    <td>
                    <select name="opciones">
                        <option value="0">PARTICULAR</option>
                        <option value="1">NACIONAL</option>
                    </select>
                    </td> 
                </tr>
                <tr>
                    <td>Instituto:</td>
                    <td>
                    <select name="opciones1">
                        <option value="0">IDAT</option>
                        <option value="1">CIBERTEC</option>
                        <option value="2">SISE</option>
                    </select>
                    </td>
                </tr>
                <tr>
                    <td>Cuota:</td>
                    <td><input type="text" name="txtnumero"</td>
                </tr>
                <tr>
                    <td><input type="button" name="btnprocesar" value="Procesar" onclick="calcular()"></td>
                </tr>
            </table>
            <textarea rows="10" cols="50">
            <% 
             
               out.print(request.getAttribute("mensaje1"));
             
            %>
            <%
                
               out.print(request.getAttribute("mensaje2"));
               
                
            %>
            <%
                
               out.print(request.getAttribute("mensaje3"));
               
                
            %>
            <%
                
               out.print(request.getAttribute("mensaje4"));
               
                
            %>
            <%
                
               out.print(request.getAttribute("mensaje5"));
               
                
            %>
            </textarea>
        </form>
    </center>
    </body>
</html>
