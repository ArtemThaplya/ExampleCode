package generics.interfaces;

public interface Task<Car> {
    // ������ ��������� ���� �� ����������
    void execute();

    // ���������� ��������� ����������
    Car getResult();
}
