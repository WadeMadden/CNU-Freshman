
/*Wade Madden and Nora Seigle
/
/This program creates the source code of an HTML file.
/A user inputs a title and three paragraphs and then is prompted to choose
/how they would like to format each paragraph. Then the html source code is
/printed out.
*/
import java.util.Scanner;

public class P2 {
	public static void main(String [] args){

	Scanner keyboard = new Scanner(System.in);
	System.err.println("> java ToHTML\n"+
	"This program creates html code. You will enter a title and three\n"+
	"paragraphs.\n"+
	"For each paragraph, you will enter formatting. Enter b for bold, i for\n"+
	"italics or n for none.\n"+
	"Enter the title of your webpage->");
	String title = keyboard.nextLine();
	System.err.println("Enter your first paragraph->");
	String paragraph1 = keyboard.nextLine();

	System.err.println("Enter the format for your first paragraph->");
	String forma1 = keyboard.nextLine();
	char format1 = forma1.charAt(0);

	System.err.println("Enter your second paragraph->");
	String paragraph2 = keyboard.nextLine();

	System.err.println("Enter the format for your second paragraph->");
	String forma2 = keyboard.nextLine();
	char format2 = forma2.charAt(0);

	System.err.println("Enter your third paragraph->");
	String paragraph3 = keyboard.nextLine();


	System.err.println("Enter the format for your third paragraph->");
	String forma3 = keyboard.nextLine();
	char format3 = forma3.charAt(0);

	System.err.println("Here is your html file:");
	System.out.println("<!doctype html>\n"+
	"<html lang=\"en\">\n"+
	"<head>\n"+
	"<meta charset=\"utf-8\">\n"+
	"<title>"+title+"</title>\n"+
	"</head>\n"+
	"<body>");
	if((format1 == 'b')||(format1 == 'B'))
	{
		System.out.println("<p><b>"+paragraph1+"</b></p>");
	}
	else if((format1 == 'i')||(format1 == 'I'))
	{
		System.out.println("<p><i>"+paragraph1+"</i></p>");
	}
	else
	{
		System.out.println("<p>"+paragraph1+"</p>");
	}

	if((format2 == 'b')||(format2 == 'B'))
	{
		System.out.println("<p><b>"+paragraph2+"</b></p>");
	}
	else if((format2 == 'i')||(format2 == 'I'))
	{
		System.out.println("<p><i>"+paragraph2+"</i></p>");
	}
	else
	{
		System.out.println("<p>"+paragraph2+"</p>");
	}


	if((format3 == 'b')||(format3 == 'B'))
	{
		System.out.println("<p><b>"+paragraph3+"</b></p>");
	}
		else if((format3 == 'i')||(format3 == 'I'))
	{
		System.out.println("<p><i>"+paragraph3+"</i></p>");
	}
		else
	{
		System.out.println("<p>"+paragraph3+"</p>");
	}


	System.out.println("</body>\n"+
	"</html>");

	}

}
