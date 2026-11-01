package com.inmobi.media;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes7.dex */
public final class Kn implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jn f23029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2734aj f23030b;

    public Kn(Jn jn2, C2734aj c2734aj) {
        ck.p.j(jn2, "visibilityConfig");
        ck.p.j(c2734aj, "simpleViewHolder");
        this.f23029a = jn2;
        this.f23030b = c2734aj;
    }

    @Override // com.inmobi.media.Nn
    public final Mn a() {
        C2900h5 c2900h5 = this.f23030b.f24007a;
        Rect rect = new Rect();
        if (!c2900h5.getGlobalVisibleRect(rect)) {
            return Mn.HIDDEN;
        }
        Jn jn2 = this.f23029a;
        return (Un.a(c2900h5, rect, jn2.f22968a, jn2.f22969b) && Un.a(c2900h5, rect, this.f23029a.f22968a, this.f23030b.f24008b)) ? Mn.VISIBLE : Mn.HIDDEN;
    }
}
