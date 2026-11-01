package androidx.tracing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(29)
final class TraceApi29Impl {
    public static void setCounter(@NonNull String str, int i10) {
        android.os.Trace.setCounter(str, i10);
    }

    private TraceApi29Impl() {
    }

    public static void beginAsyncSection(@NonNull String str, int i10) {
        android.os.Trace.beginAsyncSection(str, i10);
    }

    public static void endAsyncSection(@NonNull String str, int i10) {
        android.os.Trace.endAsyncSection(str, i10);
    }
}
