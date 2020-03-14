package com.cts.main;
class Data {
    private String name;
    private int id;
    public String getName() {
        return this.name;
    }
    public int getId()
    {
    	return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
}
public class AccessMod {
	public static void main(String args[])
	{
		Data d=new Data();
		d.setName("veda");
		d.setId(1);
		System.out.println(d.getName());
		System.out.println(d.getId());
	}

}
