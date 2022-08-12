public class TaskList {
    private Task[] lst = new Task[100];
    private int idx = 0;

    public static final String markMsg = "Nice! I've marked this task as done:";
    public static final String unmarkMsg = "OK, I've marked this task as not done yet:";
    public static final String list = "Here are the tasks in your list:";

    public void addTask(Task t) {
        lst[idx] = t;
        idx++;
        System.out.println("-------------------------");
        System.out.println("added:" + t.toString());
        System.out.println("-------------------------");
    }

    public void markTask(int i) {
        lst[i - 1].setMarked();
        printMessage(true, i);
    }

    public void unmarkTask(int i) {
        lst[i - 1].setUnmarked();
        printMessage(false, i);
    }

    public void printMessage(boolean mark, int i) {
        System.out.println("-------------------------");
        System.out.println(mark ? markMsg : unmarkMsg);
        System.out.println(lst[i - 1].toString());
        System.out.println("-------------------------");
    }

    public void printList() {
        System.out.println("-------------------------");
        System.out.println(list);
        for (int i = 0; i < idx; i++) {
            System.out.println((i + 1) + "." + lst[i].toString());
        }
        System.out.println("-------------------------");
    }

}
