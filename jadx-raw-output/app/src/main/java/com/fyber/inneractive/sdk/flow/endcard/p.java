package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes.dex */
public final class p extends u {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15419l;

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final boolean f() {
        return false;
    }

    public final void b(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        if (TextUtils.isEmpty(this.f15429e) || TextUtils.isEmpty(this.f15418k)) {
            return;
        }
        if (this.f15430f || !this.f15432h.compareAndSet(false, true)) {
            IAlog.a("%sisWebLoaded: %s, mFmpEndCardPrepareInProgress: %s", this.f15355a, Boolean.valueOf(this.f15430f), Boolean.valueOf(this.f15432h.get()));
        } else {
            a(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final q d() {
        b bVar = this.f15356b;
        return new q(bVar.f15359c.f15756e, (o) bVar);
    }

    public p(o oVar) {
        String str;
        super(oVar);
        com.fyber.inneractive.sdk.model.vast.o oVar2 = oVar.f15359c.f15756e.f15877f;
        if (oVar2 != null) {
            str = oVar2.f15928a;
        } else {
            str = null;
        }
        this.f15417j = str;
    }
}
