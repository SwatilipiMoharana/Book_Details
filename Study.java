package swatitest;
class Books{
	String name;
	int totPage;
	String color;
	Books(String name,int totPage,String color){
		this.name=name;
		this.totPage=totPage;
		this.color=color;
	}
	public String displayAll(){
		return "name:"+name+"\t"+"totPage:"+totPage+"\t"+"color:"+color;
	}
}
public class Study {

	public static void main(String[] args) {
		Books Odia=new Books("Odia",300,"blue");
		Books Math=new Books("Math",400,"white");
		Books Eng=new Books("Eng",200,"green");
		System.out.println(Odia.displayAll());
		System.out.println(Math.displayAll());
		System.out.println(Eng.displayAll());
	}

}
