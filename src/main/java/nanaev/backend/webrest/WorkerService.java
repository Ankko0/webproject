package nanaev.backend.webrest;

import net.bytebuddy.dynamic.DynamicType;
import org.hibernate.Session;
import org.springframework.data.util.Optionals;


import java.util.List;
import java.util.Optional;


public class WorkerService {
    private WorkerRepo workerRepo;





    public Optional<Worker> getById(Long id)
    {

        Optional<Worker> worker1;
        worker1 = workerRepo.findById(id);

        return  worker1;
    }
}
