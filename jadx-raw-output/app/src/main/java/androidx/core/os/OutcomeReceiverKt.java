package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(31)
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(rj.c<? super R> cVar) {
        return new ContinuationOutcomeReceiver(cVar);
    }
}
