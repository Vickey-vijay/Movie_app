package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Xg extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo f56161b;

    public Xg(@NonNull Y4 y10) {
        this(y10, y10.u());
    }

    public Xg(Y4 y10, yo yoVar) {
        super(y10);
        this.f56161b = yoVar;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        Y4 y10 = this.f55865a;
        if (this.f56161b.c()) {
            return false;
        }
        if (!this.f56161b.d()) {
            C4342l9 c4342l9 = y10.f56212n;
            c4342l9.f57182c.b(Q5.a(q10, EnumC4112cb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        yo yoVar = this.f56161b;
        synchronized (yoVar) {
            zo zoVar = yoVar.f58037a;
            zoVar.a(zoVar.a().put("first_event_done", true));
        }
        return false;
    }
}
