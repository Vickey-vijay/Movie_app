package androidx.activity.contextaware;

import android.content.Context;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface ContextAware {
    void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener);

    Context peekAvailableContext();

    void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener);
}
