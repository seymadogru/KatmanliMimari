package core.logger;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Konsola loglama yapılmıştır.");
    }
}
