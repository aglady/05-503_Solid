import ru.gr05503.application.TaskService;
import ru.gr05503.ui.TaskWindow;

void main() {
    TaskService service = new TaskService();
    new TaskWindow(service).setVisible(true);
}