package q5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: ListeningExecutorService.java */
/* JADX INFO: loaded from: classes10.dex */
public interface k extends ExecutorService {
    <T> i<T> submit(Callable<T> callable);
}
