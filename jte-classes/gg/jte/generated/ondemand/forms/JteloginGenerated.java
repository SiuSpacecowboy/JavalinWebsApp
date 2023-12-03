package gg.jte.generated.ondemand.forms;
import util.NameRoutes;
import dto.User;
public final class JteloginGenerated {
	public static final String JTE_NAME = "forms/log-in.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,58,58,58,60,60,60,64,64,68,68,68,68,68,68,68,68,68,78,78,82,82,85,85,85,85,85,85,85,85,85,89,89,89,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, User user) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html>\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\r\n          rel=\"stylesheet\"\r\n          integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\r\n          crossorigin=\"anonymous\">\r\n    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n    <title>Log in</title>\r\n    <style>\r\n       .message {\r\n    left: 81%;\r\n    top: 104.5%;\r\n    margin-left: -25%;\r\n    position: absolute;\r\n    margin-top: -25%;\r\n}\r\nform {\r\n    left      : 50%;\r\n    top       : 50%;\r\n    position  : absolute;\r\n    transform : translate(-50%, -50%);\r\n}\r\n   .stroke {\r\n    text-shadow: white 1px 1px 0, white -1px -1px 0,\r\n                 white -1px 1px 0, white 1px -1px 0;\r\n   }\r\n   .bottom {\r\n    top    : 66%;\r\n    left      : 36%;\r\n    position  : absolute;\r\n    }\r\n    .mvp1 {\r\n    font-size : 60px;\r\n }\r\n    table {\r\n    border-collapse: separate;\r\n    border-spacing: 90px;\r\n    }\r\n .stroke-double {\r\n    text-shadow: black 1.5px 1.5px 0, black -1.5px -1.5px 0,\r\n    black -1.5px 1.5px 0, black 1.5px -1.5px 0;\r\n  }\r\n  </style>\r\n</head>\r\n<div class=\"bg-image\"\r\n     style=\"\r\n    background-image: url('https://bipbap.ru/wp-content/uploads/2017/04/Nature___Sundown_Intense_red_clouds_at_sunset__HDR_Photos_107420_.jpg');\r\n    height: 100vh;\r\n  \">\r\n    ");
		if (user.getFlash() != null) {
			jteOutput.writeContent("\r\n    <div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\r\n        <strong>");
			jteOutput.setContext("strong", null);
			jteOutput.writeUserContent(user.getFlash());
			jteOutput.writeContent("</strong>\r\n        <button type=\"button\" class=\"btn-close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n        </button>\r\n    </div>\r\n    ");
		}
		jteOutput.writeContent("\r\n<form action=\"/sessions\" method=\"post\">\r\n        <label class=\"form-label\">\r\n            <p class=\"stroke\"><strong>name</strong></p>\r\n            <input type=\"text\" class=\"form-control\" required name=\"firstname\"");
		var __jte_html_attribute_0 = user.getFirstName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n        </label>\r\n    <div>\r\n        <label class=\"form-label\">\r\n            <p class=\"stroke\"><strong>Password Or Token</strong></p>\r\n            <input type=\"password\" class=\"form-control\" required name=\"password\"/>\r\n        </label>\r\n    </div>\r\n    <input type=\"submit\" class=\"btn btn-primary\" value=\"Log in\" />\r\n</form>\r\n");
		if (user.getPassword() == null && user.getFirstName() != null) {
			jteOutput.writeContent("\r\n    <div class=\"message stroke\">\r\n        <li style=\"color:rgb(208, 0, 0)\"><strong>Wrong username or password!</strong></li>\r\n    </div>\r\n");
		}
		jteOutput.writeContent("\r\n        <table border=\"0\">\r\n            <tr class=\"bottom stroke-double mvp1\">\r\n                <th><a style=\"color:rgb(224, 255, 255)\"");
		var __jte_html_attribute_1 = NameRoutes.startPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">To home page</a></th>\r\n            </tr>\r\n        </table>\r\n</div>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		User user = (User)params.get("user");
		render(jteOutput, jteHtmlInterceptor, user);
	}
}
