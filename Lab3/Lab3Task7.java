import java.util.Scanner;
class Lab3Task7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String lines[] = new String[1000];
        int x = 0;

        String line = sc.nextLine();

        while (!line.equals("*")) {
            lines[x] = line;
            x++;
            line = sc.nextLine();
        }
        for(int z = 0; z < x ; z++)
        {
            if(z == x/2)
            {
                if(x%2 == 0)
                {
                    System.out.println(lines[z-1]);
                }
            System.out.println(lines[z]);
        }
    }
    }
}
