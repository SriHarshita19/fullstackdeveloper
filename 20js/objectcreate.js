var roles=
{
    type:"Admin",
    displayType:function()
    {
       console.log(this .type);
    }
}
var super_role = Object.create(roles); 
super_role.displayType();