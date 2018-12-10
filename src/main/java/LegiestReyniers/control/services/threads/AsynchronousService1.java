package LegiestReyniers.control.services.threads;

import LegiestReyniers.support.TrackStationThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;


@Service
public class AsynchronousService1 {

    @Autowired
    private TaskExecutor taskExecutor;

    @Autowired
    private ApplicationContext applicationContext;

    public void executeAsynchronously() {
        TrackStationThread myThread = applicationContext.getBean(TrackStationThread.class);
        taskExecutor.execute(myThread);
    }
}
