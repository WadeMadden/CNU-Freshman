/*Wade Madden and Brianna Salley
/
/This program creates the source code of an HTML file.
/A user inputs a title and three paragraphs which are then output within 
/the HTML source code.
*/
import java.util.Scanner;

public class ToHTML {
	public static void main(String [] args){
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("> java ToHTML\n"+
	"This program creates html code\n"+
	"Enter the title of your webpage->");
	String title = keyboard.nextLine();
	System.out.println("Enter your first paragraph->");
	String paragraph1 = keyboard.nextLine();
	System.out.println("Enter your second paragraph->");
	String paragraph2 = keyboard.nextLine();
	System.out.println("Enter your third paragraph->");
	String paragraph3 = keyboard.nextLine();
	System.out.println("Here is your html file:");
	System.out.println("<!doctype html>\n"+
	"<html lang=\"en\">\n"+
	"<head>\n"+
	"<meta charset=\"utf-8\">\n"+
	"<title>"+title+"</title>\n"+
	"</head>\n"+
	"<body>\n"+
	"<p>"+paragraph1+"</p>\n"+
	"<p>"+paragraph2+"</p>\n"+
	"<p>"+paragraph3+"</p>\n"+
	"</body>\n"+
	"</html>");

	}

}
