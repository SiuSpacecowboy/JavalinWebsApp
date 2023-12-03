@import dto.UserPage
@import util.NameRoutes
@param UserPage page

@template.layout.page(
header = null,
content = @`
    @if(page.getFlash() != null)
        <div class="alert alert-success alert-dismissible fade show" role="alert">
            <strong>${page.getFlash()} (｡- .•)!</strong>
            <button type="button" class="btn-close" data-dismiss="alert" aria-label="Close">
            </button>
        </div>
    @endif
    <h3><p  style="color:rgb(255, 255, 255)">Id: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getId()}.</span></p></h3>
    <h3><p  style="color:rgb(255, 255, 255)">Name: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getFirstName()}.</span></p></h3>
    <h3><p  style="color:rgb(255, 255, 255)">Surname: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getLastName()}.</span></p></h3>
    <h3><p  style="color:rgb(255, 255, 255)">Email: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getEmail()}.</span></p></h3>
    <h3><p  style="color:rgb(255, 255, 255)">Password: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getPassword()}.</span></p></h3>
    <h3><p  style="color:rgb(255, 255, 255)">Token: <span class="fst-italic" style="color:rgb(0, 206, 209)">${page.getUser().getToken()}.</span></p></h3>
`,
footer = @`
    <footer>
        <h1><a style="color:rgb(255, 225, 0)" href="${NameRoutes.editUserPath(String.valueOf(page.getUser().getId()))}">Edit user</a></h1>
        <h4><form action="${NameRoutes.userDeletePath(String.valueOf(page.getUser().getId()))}" method="post">
                <input type="submit" value="Delete User">
            </form></h4>
        <br>
        <h2><a href="${NameRoutes.allUsersPath()}">To All users page</a></h2>
        <h2><a href="${NameRoutes.startPath()}">Home page</a></h2>
        <br>
        <h2><a style="color:rgb(255, 19, 147)" href="https://github.com/SiuSpacecowboy">My github</a></h2>
    </footer>
`
)