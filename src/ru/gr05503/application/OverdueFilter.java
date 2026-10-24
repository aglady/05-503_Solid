package ru.gr05503.application;

import ru.gr05503.domain.Task;
import ru.gr05503.domain.TaskFilter;

import java.time.LocalDate;

public class OverdueFilter implements TaskFilter {
    @Override
    public boolean matches(Task task) {
        // SHOTGUN: та же проверка просрочки, что в сервисе и в окне
        return !task.isDone() && task.getDeadline().isBefore(LocalDate.now());
    }
}
