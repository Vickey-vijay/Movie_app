package yads;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ds0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gs0 f76790a;

    public ds0(gs0 gs0Var) {
        this.f76790a = gs0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Map map = this.f76790a.f77916e;
        gs0 gs0Var = this.f76790a;
        for (Map.Entry entry : map.entrySet()) {
            gs0Var.a((yt0) entry.getKey(), ((Number) entry.getValue()).intValue());
        }
        this.f76790a.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        gs0.access$unregisterTrackers(this.f76790a);
        Set setKeySet = this.f76790a.f77916e.keySet();
        gs0 gs0Var = this.f76790a;
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            gs0.access$unbindHolder(gs0Var, (yt0) it.next());
        }
    }
}
