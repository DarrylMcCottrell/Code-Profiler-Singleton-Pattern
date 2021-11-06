//this is an exception used by the Profiler to indicate what kind of error occurred while starting/stoppping timers
public class CodeProfilerException extends Exception{
    
    public CodeProfilerException(){
        super();
    }
    public CodeProfilerException(String message){
        super(message);
    }
}