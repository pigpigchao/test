<%@ page language="java" pageEncoding="UTF-8"%>
   <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
   <html>
   <head>
   <style>
   #myDiv {
       position: absolute;
       left: 50%;
       top: 50%;
      margin-left: -200px;
      margin-top: -50px;
  }
  .mouseOver{
      background-color: #708090;
      color:#FFFAFA;
  }
  
  .mouseOut{
      background-color: #FFFAFA;
      color:#000000;
  }
  </style>
  </head>
  <body>
      <div id="myDiv">
          <input type="text" size="50" id="keyword" onkeyup="getMoreContents()" onfocus="getMoreContents()" 
          onblur="clearContent()"/>
          <input type="button" value="搜索一下" width="50px" />
          <div id="popDiv">
              <table id="content_table" bgcolor="#FFFAFA" border="0"
                  cellspacing="0" cellpadding="0">
                  <tbody id="content_table_body">
                      <!-- 动态数据在这里显示 -->
  
                  </tbody>
              </table>
          </div>
      </div>
  </body>
  
  <script type="text/javascript">
      function getMoreContents() {
          var keyword = document.getElementById("keyword").value;
          if (keyword == "") {
              clearContent();
              return;
          } else {
              var ajax = new XMLHttpRequest();
              var url = "SearchServlet?keyword=" + keyword;
              ajax.open("GET", url, true);
              ajax.send(null);
              ajax.onreadystatechange = function() {
                  if (ajax.readyState == 4) {
                      if (ajax.status == 200) {
                          var result = ajax.responseText;
                          insertContent(result);
                      }
                  }
              }
          }
      }
      function insertContent(content) {
          clearContent();
          setLocation();
          var json = JSON.parse(content);
          var len = json.length;
          for (var i = 0; i < len; i++) {
              var value = json[i];
              var tr = document.createElement("tr");
              var td = document.createElement("td");
              td.setAttribute("bgcolor", "#FFFAFA");
              td.setAttribute("border", "0");
              td.onmouseover = function() {
                  this.className = 'mouseOver';
              };
              td.onmouseout = function() {
                  this.className = 'mouseOut';
              };
              td.onclick = function() {
                  // document.getElementById("keyword").value=this.;
              };
              var text = document.createTextNode(value);
              td.appendChild(text);
              tr.appendChild(td);
              document.getElementById("content_table_body").appendChild(tr);
          }
  
      }
  
      function clearContent() {
          var popNode = document.getElementById("popDiv");
          popNode.style.border = "none";
          var contentNode = document.getElementById("content_table_body");
          var len = contentNode.childNodes.length;
          for (var i = len - 1; i >= 0; i--) {
              contentNode.removeChild(contentNode.childNodes[i]);
          }
      }
      function setLocation(){
          var inputNode = document.getElementById("keyword");
         var width = inputNode.offsetWidth;
         var left = inputNode["offsetLeft"];
         var top = inputNode.offsetHeight+inputNode["offsetTop"];
         var popNode = document.getElementById("popDiv");
         popNode.style.border = "gray 0.5px solid";
         popNode.style.width = width+"px";
         popNode.style.top = top+"px";
         popNode.style.left = left+"px";
         document.getElementById("content_table").style.width=width+"px";
         
     }
     
 </script>
 </html>