import java.util.Scanner;

public class Pd1 {
  static int x, y, z;
  static String iniDir;
  static String[] commands = new String[5];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the commands: ");

    for (int i = 0; i < commands.length; i++) {
      commands[i] = sc.next();
    }

    System.out.println("Enter Starting Position:");

    x = sc.nextInt();
    y = sc.nextInt();
    z = sc.nextInt();

    System.out.println("Enter the Initial Direction:");
    iniDir = sc.next();

    for (int i = 0; i < commands.length; i++) {
      if (commands[i].equals("f")) {
        move_forward();
      } else if (commands[i].equals("b")) {
        move_backward();
      } else if (commands[i].equals("l")) {
        turn_left();
      } else if (commands[i].equals("r")) {
        turn_right();
      } else if (commands[i].equals("u")) {
        turn_up();
      } else if (commands[i].equals("d")) {
        turn_down();
      }
    }

    System.out.println("Final Position: " + x + " " + y + " " + z);
    System.out.println("Final Direction: " + iniDir);

    sc.close();
  }

  public static void move_forward() {
    // System.out.println("Moving Forward");
    if (iniDir.equals("N")) {
      y++;
    } else if (iniDir.equals("S")) {
      y--;
    } else if (iniDir.equals("E")) {
      x++;
    } else if (iniDir.equals("W")) {
      x--;
    } else if (iniDir.equals("U")) {
      z++;
    } else if (iniDir.equals("D")) {
      z--;
    }
  }

  public static void move_backward() {
    // System.out.println("Moving Forward");
    if (iniDir.equals("N")) {
      y--;
    } else if (iniDir.equals("S")) {
      y++;
    } else if (iniDir.equals("E")) {
      x--;
    } else if (iniDir.equals("W")) {
      x++;
    } else if (iniDir.equals("U")) {
      z--;
    } else if (iniDir.equals("D")) {
      z++;
    }
  }

  public static void turn_up() {
    String[] directions = { "N", "E", "S", "W", "D" };
    for (String dir : directions) {
      if (dir.equals(iniDir)) {
        iniDir = "U";
      }
    }
  }

  public static void turn_down() {
    String[] directions = { "N", "E", "S", "W", "U" };
    for (String dir : directions) {
      if (dir.equals(iniDir)) {
        iniDir = "D";
      }
    }
  }

  public static void turn_left() {
    if (iniDir.equals("N")) {
      iniDir = "W";
    } else if (iniDir.equals("W")) {
      iniDir = "S";
    } else if (iniDir.equals("S")) {
      iniDir = "E";
    } else if (iniDir.equals("E")) {
      iniDir = "N";
    } else if (iniDir.equals("U")) {
      iniDir = "N";
    } else if (iniDir.equals("D")) {
      iniDir = "S";
    }
  }

  public static void turn_right() {
    if (iniDir.equals("N")) {
      iniDir = "E";
    } else if (iniDir.equals("E")) {
      iniDir = "S";
    } else if (iniDir.equals("S")) {
      iniDir = "W";
    } else if (iniDir.equals("W")) {
      iniDir = "N";
    } else if (iniDir.equals("U")) {
      iniDir = "S";
    } else if (iniDir.equals("D")) {
      iniDir = "N";
    }
  }
}