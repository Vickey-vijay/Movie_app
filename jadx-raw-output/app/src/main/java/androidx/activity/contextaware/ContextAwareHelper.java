package androidx.activity.contextaware;

import android.content.Context;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: ContextAwareHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ContextAwareHelper {
    private volatile Context context;
    private final Set<OnContextAvailableListener> listeners = new CopyOnWriteArraySet();

    public final void clearAvailableContext() {
        this.context = null;
    }

    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        p.j(onContextAvailableListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = this.context;
        if (context != null) {
            onContextAvailableListener.onContextAvailable(context);
        }
        this.listeners.add(onContextAvailableListener);
    }

    public final void dispatchOnContextAvailable(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
        Iterator<OnContextAvailableListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    public final Context peekAvailableContext() {
        return this.context;
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        p.j(onContextAvailableListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listeners.remove(onContextAvailableListener);
    }
}
