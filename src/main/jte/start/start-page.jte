@import util.NameRoutes
@import dto.UserPage
@param UserPage page

@template.layout.page(
header = null,
content = @`
    @if(page.getFlash() != null)
        <div class="alert alert-success alert-dismissible fade show" role="alert">
            <strong>${page.getFlash()}(｡- .•)!</strong>
            <button type="button" class="btn-close" data-dismiss="alert" aria-label="Close">
            </button>
        </div>
    @endif
    @if(page.getUser() != null)
        <div>
        <h1><p style="color:rgb(255, 69, 0)">Welcome to the site, ${page.getUser().getFirstName().toUpperCase()}</p></h1>
        <h2><p style="color:rgb(240, 230, 140)">To Unlogin, please delete cookie JSESSIONID from browser | This cookie response for all sessions.</p></h2>
        <h3><form action="/sessions/delete" method="post">
                <input type="submit" value="Another Unlogin">
            </form></h3>
        <br>
        </div>
    @else
        <div>
        <h1><p style="color:rgb(255, 69, 0)">Welcome to the site, Please log in</p></h1>
        <h2><a style="color:rgb(240, 230, 140)" href="/sessions/build">Log in</a></h2>
        </div>
    @endif
`,
footer = @`
    <div>
    <h2><a style="color:rgb(0, 191, 255)" href="${NameRoutes.allUsersPath()}">To All users page</a></h2>
    <h2><a style="color:rgb(0, 191, 255)" href="${NameRoutes.buildUserPath()}">Create new User</a></h2>
    <br>
    <h2><a class="stroke-black" style="color:rgb(127, 255, 212)" href="https://github.com/SiuSpacecowboy">My github</a></h2>
    </div>
    <%--FindByTerm--%>
    <%--FindById--%>
`
)