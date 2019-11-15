/**
*
*/
package game;

import java.util.Scanner;

/**
* @author gurdeep
*
*/
public class game {

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q1 = "What color are the apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
		String q2 = "What color are the grapes?\n" + "(a)green\n(b)Yellow\n(c)Blue\n";

		questions [] question = {
			new questions(q1, "a"),
			new questions(q2, "a")

		};
		takeTest(question);
	}
	public static void takeTest(questions[] question){
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);

		for(int i = 0;i<question.length;i++){
			System.out.println(question[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(question[i].answer)){
				score++;
			}
		}
		System.out.println("You got " + score + "/" + question.length);
	}


}
