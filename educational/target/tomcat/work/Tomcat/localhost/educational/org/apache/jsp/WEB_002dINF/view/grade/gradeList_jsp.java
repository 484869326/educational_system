/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-05-25 01:57:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.grade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gradeList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" content=\"#\">\n");
      out.write("    <title>年级信息管理页面</title>\n");
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
      out.write("/static/easyui/themes/locale/easyui-lang-zh_CN.js\"></script>\n");
      out.write("    <script type=\"text/javascript\"\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/js/validateExtends.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        //DOM加载完成后执行的回调函数\n");
      out.write("        $(function () {\n");
      out.write("            var table;\n");
      out.write("            //初始化datagrid\n");
      out.write("            $('#dataList').datagrid({\n");
      out.write("                iconCls: 'icon-more',//图标\n");
      out.write("                border: true,\n");
      out.write("                collapsible: false,//是否可折叠\n");
      out.write("                fit: true,//自动大小\n");
      out.write("                method: \"post\",\n");
      out.write("                url: \"getGradeList?t\" + new Date().getTime(),\n");
      out.write("                idField: 'id',\n");
      out.write("                singleSelect: false,//是否单选\n");
      out.write("                rownumbers: true,//行号\n");
      out.write("                pagination: true,//分页控件\n");
      out.write("                sortName: 'id',\n");
      out.write("                sortOrder: 'DESC',\n");
      out.write("                remoteSort: false,\n");
      out.write("                columns: [[\n");
      out.write("                    {field: 'chk', checkbox: true, width: 50},\n");
      out.write("                    {field: 'id', title: 'ID', width: 100, sortable: true},\n");
      out.write("                    {field: 'name', title: '年级名称', width: 150},\n");
      out.write("                    {field: 'manager', title: '年级主任', width: 150},\n");
      out.write("                    {field: 'email', title: '主任邮箱', width: 150},\n");
      out.write("                    {field: 'telephone', title: '主任电话', width: 150},\n");
      out.write("                    {field: 'introducation', title: '年级介绍', width: 300}\n");
      out.write("                ]],\n");
      out.write("                toolbar: \"#toolbar\"//工具栏\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //设置分页控件\n");
      out.write("            var p = $('#dataList').datagrid('getPager');\n");
      out.write("            $(p).pagination({\n");
      out.write("                pageSize: 10,//设置每页显示的记录条数,默认为10\n");
      out.write("                pageList: [10, 20, 30, 50, 100],//设置每页记录的条数\n");
      out.write("                beforePageText: '第',\n");
      out.write("                afterPageText: '页    共 {pages} 页',\n");
      out.write("                displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录'\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //信息添加按钮事件\n");
      out.write("            $(\"#add\").click(function () {\n");
      out.write("                table = $(\"#addTable\");\n");
      out.write("                $(\"#addTable\").form(\"clear\");//清空表单数据\n");
      out.write("                $(\"#addDialog\").dialog(\"open\");//打开添加窗口\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //信息修改按钮事件\n");
      out.write("            $(\"#edit\").click(function () {\n");
      out.write("                table = $(\"#editTable\");\n");
      out.write("                var selectRows = $(\"#dataList\").datagrid(\"getSelections\");\n");
      out.write("                if (selectRows.length !== 1) {\n");
      out.write("                    $.messager.alert(\"消息提醒\", \"请单条选择想要修改的数据哟!\", \"warning\");\n");
      out.write("                } else {\n");
      out.write("                    $(\"#editDialog\").dialog(\"open\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //信息删除按钮事件\n");
      out.write("            $(\"#delete\").click(function () {\n");
      out.write("                var selectRows = $(\"#dataList\").datagrid(\"getSelections\");//返回所有选中的行,当没有选中的记录时,将返回空数组\n");
      out.write("                var selectLength = selectRows.length;\n");
      out.write("                if (selectLength === 0) {\n");
      out.write("                    $.messager.alert(\"消息提醒\", \"请选择想要删除的数据哟!\", \"warning\");\n");
      out.write("                } else {\n");
      out.write("                    var ids = [];\n");
      out.write("                    $(selectRows).each(function (i, row) {\n");
      out.write("                        ids[i] = row.id;//将预删除行的id存储到数组中\n");
      out.write("                    });\n");
      out.write("                    $.messager.confirm(\"消息提醒\", \"删除后将无法恢复该年级信息! 确定继续?\", function (r) {\n");
      out.write("                        if (r) {\n");
      out.write("                            $.ajax({\n");
      out.write("                                type: \"post\",\n");
      out.write("                                url: \"deleteGrade?t\" + new Date().getTime(),\n");
      out.write("                                data: {ids: ids},\n");
      out.write("                                dataType: 'json',\n");
      out.write("                                success: function (data) {\n");
      out.write("                                    if (data.success) {\n");
      out.write("                                        $.messager.alert(\"消息提醒\", \"删除成功啦!\", \"info\");\n");
      out.write("                                        $(\"#dataList\").datagrid(\"reload\");//刷新表格\n");
      out.write("                                        $(\"#dataList\").datagrid(\"uncheckAll\");//取消勾选当前页所有的行\n");
      out.write("                                    } else {\n");
      out.write("                                        $.messager.alert(\"消息提醒\", \"服务器端发生异常! 删除失败!\", \"warning\");\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //设置添加年级信息窗口\n");
      out.write("            $(\"#addDialog\").dialog({\n");
      out.write("                title: \"添加年级信息窗口\",\n");
      out.write("                width: 430,\n");
      out.write("                height: 380,\n");
      out.write("                iconCls: \"icon-house\",\n");
      out.write("                modal: true,\n");
      out.write("                collapsible: false,\n");
      out.write("                minimizable: false,\n");
      out.write("                maximizable: false,\n");
      out.write("                draggable: true,\n");
      out.write("                closed: true,\n");
      out.write("                buttons: [\n");
      out.write("                    {\n");
      out.write("                        text: '添加',\n");
      out.write("                        plain: true,\n");
      out.write("                        iconCls: 'icon-add',\n");
      out.write("                        handler: function () {\n");
      out.write("                            var validate = $(\"#addForm\").form(\"validate\");\n");
      out.write("                            if (!validate) {\n");
      out.write("                                $.messager.alert(\"消息提醒\", \"请检查你输入的数据哟!\", \"warning\");\n");
      out.write("                            } else {\n");
      out.write("                                var data = $(\"#addForm\").serialize();//序列化表单信息\n");
      out.write("                                $.ajax({\n");
      out.write("                                    type: \"post\",\n");
      out.write("                                    url: \"addGrade?t\" + new Date().getTime(),\n");
      out.write("                                    data: data,\n");
      out.write("                                    dataType: 'json',\n");
      out.write("                                    success: function (data) {\n");
      out.write("                                        if (data.success) {\n");
      out.write("                                            $(\"#addDialog\").dialog(\"close\"); //关闭窗口\n");
      out.write("                                            $('#dataList').datagrid(\"reload\");//重新刷新页面数据\n");
      out.write("                                            $.messager.alert(\"消息提醒\", \"添加成功啦!\", \"info\");\n");
      out.write("                                        } else {\n");
      out.write("                                            $.messager.alert(\"消息提醒\", data.msg, \"warning\");\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    {\n");
      out.write("                        text: '重置',\n");
      out.write("                        plain: true,\n");
      out.write("                        iconCls: 'icon-reload',\n");
      out.write("                        handler: function () {\n");
      out.write("                            $(\"#add_name\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#add_manager\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#add_email\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#add_telephone\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#add_introduation\").textbox('setValue', \"\");\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                ]\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //设置编辑年级信息窗口\n");
      out.write("            $(\"#editDialog\").dialog({\n");
      out.write("                title: \"修改年级信息窗口\",\n");
      out.write("                width: 430,\n");
      out.write("                height: 380,\n");
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
      out.write("                        plain: true,\n");
      out.write("                        iconCls: 'icon-edit',\n");
      out.write("                        handler: function () {\n");
      out.write("                            var validate = $(\"#editForm\").form(\"validate\");\n");
      out.write("                            if (!validate) {\n");
      out.write("                                $.messager.alert(\"消息提醒\", \"请检查你输入的数据哟!\", \"warning\");\n");
      out.write("                            } else {\n");
      out.write("                                var data = $(\"#editForm\").serialize();//序列化表单信息\n");
      out.write("                                $.ajax({\n");
      out.write("                                    type: \"post\",\n");
      out.write("                                    url: \"editGrade?t=\" + new Date().getTime(),\n");
      out.write("                                    data: data,\n");
      out.write("                                    dataType: 'json',\n");
      out.write("                                    success: function (data) {\n");
      out.write("                                        if (data.success) {\n");
      out.write("                                            //关闭窗口\n");
      out.write("                                            $(\"#editDialog\").dialog(\"close\");\n");
      out.write("                                            //重新刷新页面数据\n");
      out.write("                                            $('#dataList').datagrid(\"reload\");\n");
      out.write("                                            $('#dataList').datagrid(\"uncheckAll\");\n");
      out.write("                                            //用户提示\n");
      out.write("                                            $.messager.alert(\"消息提醒\", \"修改成功啦!\", \"info\");\n");
      out.write("                                        } else {\n");
      out.write("                                            $.messager.alert(\"消息提醒\", data.msg, \"warning\");\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    {\n");
      out.write("                        text: '重置',\n");
      out.write("                        plain: true,\n");
      out.write("                        iconCls: 'icon-reload',\n");
      out.write("                        handler: function () {\n");
      out.write("                            $(\"#edit_name\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#edit_manager\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#edit_email\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#edit_telephone\").textbox('setValue', \"\");\n");
      out.write("                            $(\"#edit_introducation\").textbox('setValue', \"\");\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                ],\n");
      out.write("                //打开窗口前先初始化表单数据(表单回显)\n");
      out.write("                onBeforeOpen: function () {\n");
      out.write("                    var selectRow = $(\"#dataList\").datagrid(\"getSelected\");\n");
      out.write("                    $(\"#edit_id\").val(selectRow.id);//需根据id更新年级信息\n");
      out.write("                    $(\"#edit_name\").textbox('setValue', selectRow.name);\n");
      out.write("                    $(\"#edit_manager\").textbox('setValue', selectRow.manager);\n");
      out.write("                    $(\"#edit_email\").textbox('setValue', selectRow.email);\n");
      out.write("                    $(\"#edit_telephone\").textbox('setValue', selectRow.telephone);\n");
      out.write("                    $(\"#edit_introducation\").textbox('setValue', selectRow.introducation);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //年级名称搜索按钮的监听事件(将gradename返回给Controller)\n");
      out.write("            $(\"#search-btn\").click(function () {\n");
      out.write("                $('#dataList').datagrid('load', {\n");
      out.write("                    gradename: $('#search-gradename').val()//获取年级姓名\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- 年级信息列表 -->\n");
      out.write("<table id=\"dataList\" cellspacing=\"0\" cellpadding=\"0\"></table>\n");
      out.write("\n");
      out.write("<!-- 工具栏 -->\n");
      out.write("<div id=\"toolbar\">\n");
      out.write("    <div style=\"float: left;\"><a id=\"add\" href=\"javascript:\" class=\"easyui-linkbutton\"\n");
      out.write("                                 data-options=\"iconCls:'icon-add',plain:true\">添加</a></div>\n");
      out.write("    <div style=\"float: left;\" class=\"datagrid-btn-separator\"></div>\n");
      out.write("    <div style=\"float: left;\"><a id=\"edit\" href=\"javascript:\" class=\"easyui-linkbutton\"\n");
      out.write("                                 data-options=\"iconCls:'icon-edit',plain:true\">修改</a></div>\n");
      out.write("    <div style=\"float: left;\" class=\"datagrid-btn-separator\"></div>\n");
      out.write("    <div style=\"float: left;\"><a id=\"delete\" href=\"javascript:\" class=\"easyui-linkbutton\"\n");
      out.write("                                 data-options=\"iconCls:'icon-some-delete',plain:true\">删除</a></div>\n");
      out.write("    <!-- 年级名称搜索域 -->\n");
      out.write("    <div style=\"margin-left: 10px;\">\n");
      out.write("        <div style=\"float: left;\" class=\"datagrid-btn-separator\"></div>\n");
      out.write("        <a id=\"edit\" href=\"javascript:;\" class=\"easyui-linkbutton\"\n");
      out.write("           data-options=\"iconCls:'icon-grade',plain:true\">年级名称</a>\n");
      out.write("        <input id=\"search-gradename\" class=\"easyui-textbox\" name=\"gradename\"/>\n");
      out.write("        <a id=\"search-btn\" href=\"javascript:;\" class=\"easyui-linkbutton\"\n");
      out.write("           data-options=\"iconCls:'icon-search',plain:true\">搜索</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 信息添加窗口 -->\n");
      out.write("<div id=\"addDialog\" style=\"padding: 25px 0 0 55px;\">\n");
      out.write("    <form id=\"addForm\" method=\"post\" action=\"#\">\n");
      out.write("        <table id=\"addTable\" style=\"border-collapse:separate; border-spacing:0px 3px;\" cellpadding=\"6\">\n");
      out.write("            <tr>\n");
      out.write("                <td>年级名称</td>\n");
      out.write("                <td colspan=\"1\">\n");
      out.write("                    <input id=\"add_name\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\"\n");
      out.write("                           type=\"text\" name=\"name\" data-options=\"required:true, missingMessage:'请填写年级名称哟~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>年级主任</td>\n");
      out.write("                <td colspan=\"1\"><input id=\"add_manager\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\"\n");
      out.write("                                       type=\"text\" name=\"manager\"\n");
      out.write("                                       data-options=\"required:true, missingMessage:'请填写主任姓名哟~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>主任邮箱</td>\n");
      out.write("                <td colspan=\"1\"><input id=\"add_email\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\"\n");
      out.write("                                       type=\"text\" name=\"email\" validType=\"email\"\n");
      out.write("                                       data-options=\"required:true, missingMessage:'请填写邮箱地址哟~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>主任电话</td>\n");
      out.write("                <td colspan=\"4\"><input id=\"add_telephone\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\"\n");
      out.write("                                       type=\"text\" name=\"telephone\" validType=\"mobile\"\n");
      out.write("                                       data-options=\"required:true, missingMessage:'请填写联系方式哟~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>年级介绍</td>\n");
      out.write("                <td colspan=\"4\"><input id=\"add_introduation\" style=\"width: 200px; height: 60px;\" class=\"easyui-textbox\"\n");
      out.write("                                       type=\"text\" name=\"introducation\"\n");
      out.write("                                       data-options=\"multiline:true,required:true, missingMessage:'班级介绍不能为空呦~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 信息修改窗口 -->\n");
      out.write("<div id=\"editDialog\" style=\"padding: 20px 0 0 65px\">\n");
      out.write("    <form id=\"editForm\" method=\"post\" action=\"#\">\n");
      out.write("        <!-- 指定被修改信息的年级id -->\n");
      out.write("        <input type=\"hidden\" id=\"edit_id\" name=\"id\"/>\n");
      out.write("        <table id=\"editTable\" style=\"border-collapse:separate; border-spacing:0 3px;\" cellpadding=\"6\">\n");
      out.write("            <tr>\n");
      out.write("                <td>年级名称</td>\n");
      out.write("                <td><input id=\"edit_name\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\" type=\"text\"\n");
      out.write("                           name=\"name\" data-options=\"required:true, missingMessage:'请填写年级姓名哟~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>年级主任</td>\n");
      out.write("                <td colspan=\"4\"><input id=\"edit_manager\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\"\n");
      out.write("                                       type=\"text\" name=\"manager\"\n");
      out.write("                                       data-options=\"required:true, missingMessage:'请填写年级主任姓名哟~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>主任邮箱</td>\n");
      out.write("                <td colspan=\"4\"><input id=\"edit_email\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\"\n");
      out.write("                                       type=\"text\" name=\"email\" validType=\"email\"\n");
      out.write("                                       data-options=\"required:true, missingMessage:'请填写邮箱地址哟~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>主任电话</td>\n");
      out.write("                <td><input id=\"edit_telephone\" style=\"width: 200px; height: 30px;\" class=\"easyui-textbox\" type=\"text\"\n");
      out.write("                           name=\"telephone\" validType=\"mobile\"\n");
      out.write("                           data-options=\"required:true, missingMessage:'请填写联系方式哟~'\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>年级介绍</td>\n");
      out.write("                <td colspan=\"4\"><input id=\"edit_introducation\" style=\"width: 200px; height: 60px;\"\n");
      out.write("                                       class=\"easyui-textbox\"\n");
      out.write("                                       type=\"text\" name=\"introducation\"\n");
      out.write("                                       data-options=\"multiline:true,required:true, missingMessage:'班级介绍不能为空呦~'\"/>\n");
      out.write("                </td>\n");
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