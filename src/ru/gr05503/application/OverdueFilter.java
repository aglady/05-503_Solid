package ru.gr05503.application;

import ru.gr05503.domain.Task;
import ru.gr05503.domain.TaskFilter;

import java.time.LocalDate;

public class OverdueFilter implements TaskFilter {
    @Override
    public boolean matches(Task task) {
        return task.isOverdue();
    }
}
