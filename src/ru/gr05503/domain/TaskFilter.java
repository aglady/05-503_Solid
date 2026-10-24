package ru.gr05503.domain;

public interface TaskFilter {
    boolean matches(Task task);
}
