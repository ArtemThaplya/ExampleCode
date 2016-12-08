package generics.interfaces;

import java.util.List;

public interface Excecutor<Car> {

    // �������� ���� �� ����������. ��������� ����� ����� �������� ����� ����� getValidResults().
    // ������� ������� ���� ��� ��� ������ ����� execute()
    void addTask(Task task);

    // �������� ���� �� ���������� � ��������� ����������. ��������� ����� ����� ������� � ValidResults ���� validator.isValid ������ true ��� ����� ����������
    // ��������� ����� ����� ������� � InvalidResults ���� validator.isValid ������ false ��� ����� ����������
    // ������� ������� ���� ��� ��� ������ ����� execute()
    void addTask(Task task, Validator validator);

    // ��������� ��� ���������� �����
    void execute();

    // �������� �������� ����������. ������� ������� ���� �� ��� ������ ����� execute()
    List<Car> getValidResults();

    // �������� ���������� ����������. ������� ������� ���� �� ��� ������ ����� execute()
    List<Car> getInvalidResults();
}
