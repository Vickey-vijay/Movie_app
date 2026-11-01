package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class Hb implements InterfaceC4309k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4387n4 f55296a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4309k2
    @Nullable
    public final C4228go a(@NonNull C4176eo c4176eo, @NonNull C4228go c4228go) {
        int i10 = c4176eo.f56701b;
        int i11 = this.f55296a.f57309a;
        if (i10 == i11) {
            if (((C4228go) ((HashMap) c4176eo.f56700a.get(c4228go.f56866b)).get(new String(c4228go.f56865a))) != null) {
                ((HashMap) c4176eo.f56700a.get(c4228go.f56866b)).put(new String(c4228go.f56865a), c4228go);
            }
        } else if (i10 < i11) {
            ((HashMap) c4176eo.f56700a.get(c4228go.f56866b)).put(new String(c4228go.f56865a), c4228go);
            c4176eo.f56701b++;
        }
        return c4228go;
    }

    public Hb(@NonNull C4387n4 c4387n4) {
        this.f55296a = c4387n4;
    }
}
