package androidx.customview.poolingcontainer;

import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.Metadata;
import nj.s;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lmj/r;", "addListener", "removeListener", "onRelease", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "<init>", "()V", "customview-poolingcontainer_release"}, k = 1, mv = {1, 6, 0})
final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener poolingContainerListener) {
        p.j(poolingContainerListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listeners.add(poolingContainerListener);
    }

    public final void onRelease() {
        for (int iM = s.m(this.listeners); -1 < iM; iM--) {
            this.listeners.get(iM).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener poolingContainerListener) {
        p.j(poolingContainerListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listeners.remove(poolingContainerListener);
    }
}
