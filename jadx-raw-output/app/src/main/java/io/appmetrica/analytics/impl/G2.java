package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class G2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gf f55258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fa f55259b;

    public final boolean a(@NonNull Q5 q10, @NonNull F2 f10) {
        Iterator it = ((W8) this.f55258a.a(q10.f55776d)).f56079a.iterator();
        while (it.hasNext()) {
            if (f10.a(it.next(), q10)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting(otherwise = 5)
    public final Gf b() {
        return this.f55258a;
    }

    public G2(Gf gf2, Fa fa2) {
        this.f55258a = gf2;
        this.f55259b = fa2;
    }

    public final Fa a() {
        return this.f55259b;
    }
}
