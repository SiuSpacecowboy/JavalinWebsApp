package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,36,36,36,37,37,37,38,38,40,40,40,42,42,43,43,43,44,44,48,48,48,2,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content header, Content content, Content footer) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\r\n          rel=\"stylesheet\"\r\n          integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\r\n          crossorigin=\"anonymous\">\r\n    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n    <title>Good App!</title>\r\n    <style>\r\n    .stroke-black {\r\n    text-shadow: black 1.2px 1.2px 0, black -1.2px -1.52px 0,\r\n    black -1.2px 1.2px 0, black 1.2px -1.2px 0;\r\n  }\r\n    </style>\r\n</head>\r\n<div\r\n        class=\"bg-image\"\r\n        style=\"\r\n    background-image: url('https://w.forfun.com/fetch/62/62ac006e6597171f63964562ae49132c.jpeg');\r\n    height: 100vh;\r\n  \"\r\n>\r\n<body>\r\n");
		if (header != null) {
			jteOutput.writeContent("\r\n    ");
			jteOutput.setContext("body", null);
			jteOutput.writeUserContent(header);
			jteOutput.writeContent("\r\n");
		}
		jteOutput.writeContent("\r\n<div>\r\n    ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n</div>\r\n");
		if (footer != null) {
			jteOutput.writeContent("\r\n    ");
			jteOutput.setContext("body", null);
			jteOutput.writeUserContent(footer);
			jteOutput.writeContent("\r\n");
		}
		jteOutput.writeContent("\r\n</body>\r\n</div>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content header = (Content)params.get("header");
		Content content = (Content)params.get("content");
		Content footer = (Content)params.get("footer");
		render(jteOutput, jteHtmlInterceptor, header, content, footer);
	}
}
