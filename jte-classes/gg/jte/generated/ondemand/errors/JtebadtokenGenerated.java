package gg.jte.generated.ondemand.errors;
import util.NameRoutes;
public final class JtebadtokenGenerated {
	public static final String JTE_NAME = "errors/bad-token.jte";
	public static final int[] JTE_LINE_INFO = {0,0,64,64,64,64,64,64,64,64,64,64,64,64,64,65,65,65,65,65,65,65,65,65,66,66,66,66,66,66,66,66,66,67,67,67,67,67,67,67,67,67,73,73,73,73,73,73};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\r\n          rel=\"stylesheet\"\r\n          integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\r\n          crossorigin=\"anonymous\">\r\n    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n    <title>Wrong!</title>\r\n    <style>\r\n    table {\r\n    border-collapse: separate;\r\n    border-spacing: 90px;\r\n    }\r\n.first {\r\n    top       : 19%;\r\n    left      : 23%;\r\n    position  : absolute;\r\n    }\r\n.second {\r\n    top       : 39%;\r\n    left      : 12%;\r\n    position  : absolute;\r\n    }\r\n.bottom {\r\n    top       : 70%;\r\n    left      : 1%;\r\n    position  : absolute;\r\n    }\r\n.mvp {\r\n    font-size : 128px;\r\n }\r\n.mvp1 {\r\n    font-size : 85px;\r\n }\r\n .mvp2 {\r\n    font-size : 53px;\r\n }\r\n.stroke-black {\r\n    text-shadow: black 3px 3px 0, black -3px -3px 0,\r\n    black -3px 3px 0, black 3px -3px 0;\r\n  }\r\n    </style>\r\n</head>\r\n<div class=\"bg-image\"\r\n     style=\"\r\n    background-image: url('https://7themes.su/_ph/30/557454947.jpg');\r\n    height: 99.1vh;\r\n  \"\r\n>\r\n    <div class=\"stroke-black\">\r\n        <h1><p class=\"mvp first\" style=\"color:rgb(245, 245, 245)\">TRY HARDER!!!</p></h1>\r\n        <h5><p class=\"mvp1 second\" style=\"color:rgb(255, 0, 32)\">Invalid token, enter correct one (๑•̀ᗝ•́)૭</p></h5>\r\n    </div>\r\n    <table border=\"0\">\r\n        <tr class=\"bottom stroke-black\">\r\n            <th><a class=\"mvp2 col\" style=\"color:rgb(240, 230, 140)\"");
		var __jte_html_attribute_0 = NameRoutes.buildSessionsPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">Log In</a></th>\r\n            <th><a class=\"mvp2 col\" style=\"color:rgb(0, 191, 255)\"");
		var __jte_html_attribute_1 = NameRoutes.allUsersPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">To All users page</a></th>\r\n            <th><a class=\"mvp2 col\" style=\"color:rgb(0, 191, 255)\"");
		var __jte_html_attribute_2 = NameRoutes.buildUserPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_2);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">Create new User</a></th>\r\n            <th><a class=\"mvp2 col\"");
		var __jte_html_attribute_3 = NameRoutes.startPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_3);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">To home page</a></th>\r\n        </tr>\r\n    </table>\r\n</div>\r\n</html>\r\n\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
