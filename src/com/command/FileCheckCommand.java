package com.command;

public class FileCheckCommand implements Command{
    ProcessFile processFile ;
    public FileCheckCommand(ProcessFile processFile){
        this.processFile = processFile;
    }
    @Override
    public boolean execute() {
        return true;
    }
}
