package androidx.core.util;

/* JADX INFO: compiled from: AndroidXConsumer.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(rj.c<? super T> cVar) {
        return new AndroidXContinuationConsumer(cVar);
    }
}
