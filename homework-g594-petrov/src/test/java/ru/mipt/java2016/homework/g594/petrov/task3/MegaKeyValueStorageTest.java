package ru.mipt.java2016.homework.g594.petrov.task3;

import ru.mipt.java2016.homework.base.task2.KeyValueStorage;
import ru.mipt.java2016.homework.base.task2.MalformedDataException;
import ru.mipt.java2016.homework.tests.task2.Student;
import ru.mipt.java2016.homework.tests.task2.StudentKey;
import ru.mipt.java2016.homework.tests.task3.KeyValueStoragePerformanceTest;

/**
 * Created by philipp on 16.11.16.
 */

public class MegaKeyValueStorageTest extends KeyValueStoragePerformanceTest {
    @Override
    protected KeyValueStorage<String, String> buildStringsStorage(String path) throws MalformedDataException {
        return new MegaKeyValueStorage<>(path, "{String:String}", new SerializeString(), new SerializeString());
    }

    @Override
    protected KeyValueStorage<Integer, Double> buildNumbersStorage(String path) throws MalformedDataException {
        return new MegaKeyValueStorage<>(path, "{Integer:Double}", new SerializeInteger(), new SerializeDouble());
    }

    @Override
    protected KeyValueStorage<StudentKey, Student> buildPojoStorage(String path) throws MalformedDataException {
        return new MegaKeyValueStorage<>(path, "{Student:StudentKey}", new SerializeStudentKey(), new SerializeStudent());
    }
}
