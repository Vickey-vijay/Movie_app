package androidx.core.util;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: PlatformConsumer.kt */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(24)
public final class ConsumerKt {
    @RequiresApi(24)
    public static final <T> java.util.function.Consumer<T> asConsumer(rj.c<? super T> cVar) {
        return new ContinuationConsumer(cVar);
    }
}
