/**
 * Encapsulates task Deadline.
 *
 * @author limzk126
 * @version Level-4
 */
public class Deadline extends Task{
    protected String by;

    Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}