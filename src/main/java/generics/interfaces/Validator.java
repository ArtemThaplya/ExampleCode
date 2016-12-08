package generics.interfaces;


public interface Validator<Task> {
    boolean isValid(Task result);
}
