package BehavioralDesignPatten.CommandPattern;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command)
    {
        // set the command the remote will
        // execute
        slot = command;
    }

    public void buttonWasPressed()
    {
        slot.execute();
    }
}
