package generics.interfaces;

public interface Task<Car> {
    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    Car getResult();
}
