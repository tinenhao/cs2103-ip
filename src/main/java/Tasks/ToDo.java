package Tasks;

/**
 * ToDo class which inherits from Task
 */
public class ToDo extends Task {

    public ToDo(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
