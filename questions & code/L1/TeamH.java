import java.util.Scanner;
import java.io.*;


public class TeamH_L1 {

	public static void main(String[] args) {
		Box xs = new Box();
		class Box{
			public int lenght;
			public int width;
			public int height;
			public int surface;
			public int volume;
			lenght = new Scanner(System.in).nextInt();
			System.out.println("input lenght:" +lenght);
			width = new Scanner(System.in).nextInt();
			System.out.println("input width:" +width);
			height = new Scanner(System.in).nextInt();
			System.out.println("input height:" +height);
			Box(){
			surface = lenght*width*2+lenght*height*2+height*width*2;
			System.out.println("資料輸入成功");
			volume = lenght*width*height;
			}
			
		}

		}

	}