package BehavioralDesignPatten.CommandPattern;

public class LightOnCommand {
    Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    public void execute()
    {
        light.on();
    }

}
