class Animal
{
  private String name;
  private String color;
  
  public void setinfo(String name,String color)
  {
    this.name=name;
	this.color=color;
  }
  public void showinfo()
  {
    System.out.println("Name :"+name);
	System.out.println("Color :"+color);
  }
  
  public static void main(String args[])
  {
    Animal cow=new Animal();
    cow.setinfo("mohani","red");
    cow.showinfo();

    Animal dog=new Animal();
    dog.setinfo("Tomi","black");
    dog.showinfo();	
	
	Animal horse=new Animal();
	horse.setinfo("Jack","White");
	horse.showinfo();
	
  }
 };