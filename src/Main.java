import ru.gr05503.application.TaskService;
import ru.gr05503.domain.TaskRepository;
import ru.gr05503.infrastructure.InMemoryTaskRepository;
import ru.gr05503.ui.TaskWindow;

void main() {
    TaskRepository repository = new InMemoryTaskRepository();
    TaskService service = new TaskService(repository);
    new TaskWindow(service).setVisible(true);
}