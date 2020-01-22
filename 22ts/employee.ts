export 
class employee
{
    id:number;
    name:string;
    dob:Date;
    constructor(id:number,name:string,dob:Date)
    {
        this.id=id;
        this.name=name;
        this.dob=dob;
    }
}
    let Employee=new employee(101,'anu',new Date());
    console.log('date of birth:'+Employee.dob);
