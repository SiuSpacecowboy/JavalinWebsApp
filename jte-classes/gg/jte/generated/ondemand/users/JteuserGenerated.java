package gg.jte.generated.ondemand.users;
import dto.UserPage;
import util.NameRoutes;
public final class JteuserGenerated {
	public static final String JTE_NAME = "users/user.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,8,8,9,9,11,11,11,15,15,16,16,16,17,17,17,18,18,18,19,19,19,20,20,20,21,21,21,22,22,22,22,24,24,24,24,24,24,24,24,24,25,25,25,25,25,25,25,25,25,29,29,29,29,29,29,29,29,29,30,30,30,30,30,30,30,30,30,34,34,34,34,34,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, null, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    ");
				if (page.getFlash() != null) {
					jteOutput.writeContent("\r\n        <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\r\n            <strong>");
					jteOutput.setContext("strong", null);
					jteOutput.writeUserContent(page.getFlash());
					jteOutput.writeContent(" (｡- .•)!</strong>\r\n            <button type=\"button\" class=\"btn-close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n            </button>\r\n        </div>\r\n    ");
				}
				jteOutput.writeContent("\r\n    <h3><p  style=\"color:rgb(255, 255, 255)\">Id: <span class=\"fst-italic\" style=\"color:rgb(0, 206, 209)\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(page.getUser().getId());
				jteOutput.writeContent(".</span></p></h3>\r\n    <h3><p  style=\"color:rgb(255, 255, 255)\">Name: <span class=\"fst-italic\" style=\"color:rgb(0, 206, 209)\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(page.getUser().getFirstName());
				jteOutput.writeContent(".</span></p></h3>\r\n    <h3><p  style=\"color:rgb(255, 255, 255)\">Surname: <span class=\"fst-italic\" style=\"color:rgb(0, 206, 209)\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(page.getUser().getLastName());
				jteOutput.writeContent(".</span></p></h3>\r\n    <h3><p  style=\"color:rgb(255, 255, 255)\">Email: <span class=\"fst-italic\" style=\"color:rgb(0, 206, 209)\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(page.getUser().getEmail());
				jteOutput.writeContent(".</span></p></h3>\r\n    <h3><p  style=\"color:rgb(255, 255, 255)\">Password: <span class=\"fst-italic\" style=\"color:rgb(0, 206, 209)\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(page.getUser().getPassword());
				jteOutput.writeContent(".</span></p></h3>\r\n    <h3><p  style=\"color:rgb(255, 255, 255)\">Token: <span class=\"fst-italic\" style=\"color:rgb(0, 206, 209)\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(page.getUser().getToken());
				jteOutput.writeContent(".</span></p></h3>\r\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <footer>\r\n        <h1><a style=\"color:rgb(255, 225, 0)\"");
				var __jte_html_attribute_0 = NameRoutes.editUserPath(String.valueOf(page.getUser().getId()));
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Edit user</a></h1>\r\n        <h4><form");
				var __jte_html_attribute_1 = NameRoutes.userDeletePath(String.valueOf(page.getUser().getId()));
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\r\n                <input type=\"submit\" value=\"Delete User\">\r\n            </form></h4>\r\n        <br>\r\n        <h2><a");
				var __jte_html_attribute_2 = NameRoutes.allUsersPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">To All users page</a></h2>\r\n        <h2><a");
				var __jte_html_attribute_3 = NameRoutes.startPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Home page</a></h2>\r\n        <br>\r\n        <h2><a style=\"color:rgb(255, 19, 147)\" href=\"https://github.com/SiuSpacecowboy\">My github</a></h2>\r\n    </footer>\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPage page = (UserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
