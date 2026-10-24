package ru.gr05503.application;

import ru.gr05503.domain.Task;
import ru.gr05503.domain.TaskFilter;

public class AllTasksFilter implements TaskFilter {
    @Override
    public boolean matches(Task task) {
        return true;
    }
}
