package ru.gr05503.application;

import ru.gr05503.domain.Task;
import ru.gr05503.domain.TaskFilter;

public class HightPriorityFilter implements TaskFilter {
    @Override
    public boolean matches(Task task) {
        // PRIMITIVE: сравнение строки с "HIGH"
        return task.getPriority().equals("HIGH");
    }
}
