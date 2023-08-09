package module7_Streams.Task7;

public interface IMessage<T> {
    String getFrom();
    String getTo();
    T getContent();
}
