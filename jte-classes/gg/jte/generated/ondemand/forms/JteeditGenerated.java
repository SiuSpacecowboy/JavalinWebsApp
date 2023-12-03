package gg.jte.generated.ondemand.forms;
import util.NameRoutes;
import dto.UserEditPageWithErrors;
public final class JteeditGenerated {
	public static final String JTE_NAME = "forms/edit.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,58,58,58,60,60,60,64,64,65,65,65,65,70,70,70,70,70,70,70,70,70,76,76,76,76,76,76,76,76,76,82,82,82,82,82,82,82,82,82,90,90,90,90,90,90,90,90,90,102,102,102,102,102,102,102,102,102,108,108,110,110,111,111,112,112,112,113,113,114,114,116,116,119,119,119,119,119,119,119,119,119,123,123,123,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserEditPageWithErrors errors) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html xmlns=\"http://www.w3.org/1999/html\">\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\r\n          rel=\"stylesheet\"\r\n          integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\r\n          crossorigin=\"anonymous\">\r\n    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n    <title>Edit User</title>\r\n    <style>\r\n   .message {\r\n    left: 94.5%;\r\n    top: 104.5%;\r\n    margin-left: -25%;\r\n    position: absolute;\r\n    margin-top: -25%;\r\n}\r\nform {\r\n    left      : 51%;\r\n    top       : 50%;\r\n    position  : absolute;\r\n    transform : translate(-50%, -50%);\r\n}\r\n   .stroke {\r\n    text-shadow: white 1px 1px 0, white -1px -1px 0,\r\n                 white -1px 1px 0, white 1px -1px 0;\r\n   }\r\n     .bottom {\r\n    top    : 69%;\r\n    left      : 35.43%;\r\n    position  : absolute;\r\n    }\r\n    .mvp1 {\r\n    font-size : 60px;\r\n }\r\n    table {\r\n    border-collapse: separate;\r\n    border-spacing: 90px;\r\n    }\r\n .stroke-double {\r\n    text-shadow: black 1.5px 1.5px 0, black -1.5px -1.5px 0,\r\n    black -1.5px 1.5px 0, black 1.5px -1.5px 0;\r\n  }\r\n  </style>\r\n</head>\r\n<div class=\"bg-image\"\r\n     style=\"\r\n    background-image: url('https://w.forfun.com/fetch/89/89e12fad16991e47402fe84aa6bf0c0c.jpeg');\r\n    height: 100vh;\r\n  \">\r\n    ");
		if (errors.getFlash() != null) {
			jteOutput.writeContent("\r\n        <div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\r\n            <strong>");
			jteOutput.setContext("strong", null);
			jteOutput.writeUserContent(errors.getFlash());
			jteOutput.writeContent("</strong>\r\n            <button type=\"button\" class=\"btn-close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n            </button>\r\n        </div>\r\n    ");
		}
		jteOutput.writeContent("\r\n<form action=\"/users/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(String.valueOf(errors.getId()));
		jteOutput.setContext("form", null);
		jteOutput.writeContent("\" method=\"post\">\r\n    <div class=\"row\">\r\n        <div class=\"col\">\r\n            <label class=\"form-label\">\r\n                <p class=\"stroke\"><strong>Name</strong></p>\r\n                <input type=\"text\" class=\"form-control\" required name=\"firstname\"");
		var __jte_html_attribute_0 = errors.getFirstName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n            </label>\r\n        </div>\r\n        <div class=\"col\">\r\n            <label class=\"form-label\">\r\n                <p class=\"stroke\"><strong>Surname</strong></p>\r\n                <input type=\"text\" class=\"form-control\" required name=\"lastname\"");
		var __jte_html_attribute_1 = errors.getLastName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n            </label>\r\n        </div>\r\n        <div class=\"col\">\r\n            <label class=\"form-label\">\r\n                <p class=\"stroke\"><strong>Email</strong></p>\r\n                <input type=\"email\" class=\"form-control\" required name=\"email\"");
		var __jte_html_attribute_2 = errors.getEmail();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_2);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n            </label>\r\n        </div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col\">\r\n            <label class=\"form-label\">\r\n                <p class=\"stroke\"><strong>Password(encrypted)</strong></p>\r\n                <input type=\"password\" class=\"form-control\" required name=\"password\"");
		var __jte_html_attribute_3 = errors.getPassword();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_3);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n            </label>\r\n        </div>\r\n        <div class=\"col-4\">\r\n            <label class=\"form-label\">\r\n                <p class=\"stroke\"><strong>Confirm(without encrypt)</strong></p>\r\n                <input type=\"password\" class=\"form-control\" required name=\"confirm\"/>\r\n            </label>\r\n        </div>\r\n        <div class=\"col\" hidden>\r\n            <label class=\"form-label\">\r\n                <p class=\"stroke\"><strong>Token</strong></p>\r\n                <input type=\"text\" class=\"form-control\" required name=\"token\"");
		var __jte_html_attribute_4 = errors.getToken();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_4);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n            </label>\r\n        </div>\r\n        <input type=\"submit\" class=\"btn btn-primary\" value=\"Edit\" />\r\n    </div>\r\n</form>\r\n");
		if (errors.getErrors() != null) {
			jteOutput.writeContent("\r\n    <div class=\"message\">\r\n        ");
			for (var values : errors.getErrors().values()) {
				jteOutput.writeContent("\r\n            ");
				for (var value : values) {
					jteOutput.writeContent("\r\n                <li  class=\"stroke\" style=\"color:rgb(208, 0, 0)\"><strong>");
					jteOutput.setContext("strong", null);
					jteOutput.writeUserContent(value.getMessage());
					jteOutput.writeContent("!!!</strong></li>\r\n            ");
				}
				jteOutput.writeContent("\r\n        ");
			}
			jteOutput.writeContent("\r\n    </div>\r\n");
		}
		jteOutput.writeContent("\r\n    <table border=\"0\">\r\n        <tr class=\"bottom  mvp1\">\r\n            <th><a class=\"stroke-double\" style=\"color:rgb(224, 255, 255)\"");
		var __jte_html_attribute_5 = NameRoutes.startPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_5);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">To home page</a></th>\r\n        </tr>\r\n    </table>\r\n</div>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserEditPageWithErrors errors = (UserEditPageWithErrors)params.get("errors");
		render(jteOutput, jteHtmlInterceptor, errors);
	}
}
