package com.command;

public class AnamolyCheckCommand implements Command{
    ProcessFile processFile;
    public AnamolyCheckCommand(ProcessFile processFile){
        this.processFile = processFile;
    }
    @Override
    public boolean execute() {
        return true;
    }
}
