package pk;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface p<E> {
    Object L(rj.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar);

    void a(CancellationException cancellationException);

    Object e(rj.c<? super E> cVar);

    f<E> iterator();

    Object q();
}
