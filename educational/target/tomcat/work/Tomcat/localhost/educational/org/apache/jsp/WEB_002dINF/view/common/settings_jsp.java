/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-05-25 01:59:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class settings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!-- use EL-Expression-->\n");
      out.write("\n");
      out.write("<!-- use JSTL -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>用户信息管理页面</title>\n");
      out.write("    <!-- 引入CSS -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/themes/default/easyui.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/themes/icon.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/css/demo.css\">\n");
      out.write("    <!-- 设置CSS样式\t -->\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .table th {\n");
      out.write("            font-weight: bold\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .table th, .table td {\n");
      out.write("            padding: 8px;\n");
      out.write("            line-height: 20px\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .table td {\n");
      out.write("            text-align: left\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .table-border th, .table-border td {\n");
      out.write("            border-bottom: 1px solid #ddd\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .table-bordered th, .table-bordered td {\n");
      out.write("            border-left: 1px solid #ddd\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .table-striped tbody > tr:nth-child(odd) > td, .table-striped tbody > tr:nth-child(odd) > th {\n");
      out.write("            background-color: #f9f9f9\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <!-- 引入JS -->\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/jquery.easyui.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\"\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/js/validateExtends.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function () {\n");
      out.write("            //修改密码窗口\n");
      out.write("            $(\"#passwordDialog\").dialog({\n");
      out.write("                title: \"修改密码窗口\",\n");
      out.write("                width: 400,\n");
      out.write("                height: 300,\n");
      out.write("                iconCls: \"icon-house\",\n");
      out.write("                modal: true,\n");
      out.write("                collapsible: false,\n");
      out.write("                minimizable: false,\n");
      out.write("                maximizable: false,\n");
      out.write("                draggable: true,\n");
      out.write("                closed: true,\n");
      out.write("                buttons: [\n");
      out.write("                    {\n");
      out.write("                        text: '提交',\n");
      out.write("                        iconCls: 'icon-edit',\n");
      out.write("                        handler: function () {\n");
      out.write("                            var validate = $(\"#editPassword\").form(\"validate\");\n");
      out.write("                            if (!validate) {\n");
      out.write("                                $.messager.alert(\"消息提醒\", \"请检查你输入的数据哟!\", \"warning\");\n");
      out.write("                            } else {\n");
      out.write("                                var data = $(\"#editPassword\").serialize();\n");
      out.write("                                $.ajax({\n");
      out.write("                                    type: \"post\",\n");
      out.write("                                    url: \"editPassword?t=\" + new Date().getTime(),\n");
      out.write("                                    data: data,\n");
      out.write("                                    success: function (data) {\n");
      out.write("                                        if (data.success) {\n");
      out.write("                                            $.messager.alert(\"消息提醒\", \"修改成功! 你的账户将会在3秒后注销~\", \"info\");\n");
      out.write("                                            setTimeout(function () {\n");
      out.write("                                                top.location.href = \"../system/loginOut\";\n");
      out.write("                                            }, 3000);\n");
      out.write("                                        } else {\n");
      out.write("                                            $.messager.alert(\"消息提醒\", data.msg, \"error\")\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    {\n");
      out.write("                        text: '重置',\n");
      out.write("                        iconCls: 'icon-reload',\n");
      out.write("                        handler: function () {\n");
      out.write("                            $(\"#old_password\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#new_password\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#re_password\").textbox('setValue', \"\");\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                ]\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //设置修改密码窗口\n");
      out.write("            $(\"#editDialog\").dialog({\n");
      out.write("                title: \"修改密码\",\n");
      out.write("                width: 500,\n");
      out.write("                height: 400,\n");
      out.write("                fit: true,\n");
      out.write("                modal: false,\n");
      out.write("                noheader: true,\n");
      out.write("                collapsible: false,\n");
      out.write("                minimizable: false,\n");
      out.write("                maximizable: false,\n");
      out.write("                draggable: true,\n");
      out.write("                closed: false,\n");
      out.write("                toolbar: [\n");
      out.write("                    {\n");
      out.write("                        text: '修改密码',\n");
      out.write("                        plain: true,\n");
      out.write("                        iconCls: 'icon-password',\n");
      out.write("                        handler: function () {\n");
      out.write("                            $(\"#passwordDialog\").dialog(\"open\");\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                ]\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"editDialog\" style=\"padding: 20px;\"></div>\n");
      out.write("\n");
      out.write("<!-- 修改密码窗口 -->\n");
      out.write("<div id=\"passwordDialog\" style=\"padding: 20px\">\n");
      out.write("    <form id=\"editPassword\" action=\"#\" style=\"padding-left: 20px;padding-top: 15px\">\n");
      out.write("        <table cellpadding=\"8\">\n");
      out.write("            <tr>\n");
      out.write("                <td>原密码</td>\n");
      out.write("                <td>\n");
      out.write("                    <input id=\"old_password\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\" type=\"password\"\n");
      out.write("                           name=\"oldPassword\" data-options=\"required:true, missingMessage:'请输入原密码哟~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>新密码</td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"hidden\" name=\"account\"/>\n");
      out.write("                    <input id=\"new_password\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\" type=\"password\"\n");
      out.write("                           validType=\"password\" name=\"newPassword\"\n");
      out.write("                           data-options=\"required:true, missingMessage:'请输入新密码~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>新密码</td>\n");
      out.write("                <td><input id=\"re_password\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\" type=\"password\"\n");
      out.write("                           validType=\"equals['#new_password']\"\n");
      out.write("                           data-options=\"required:true, missingMessage:'请再次输入密码哟~'\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
