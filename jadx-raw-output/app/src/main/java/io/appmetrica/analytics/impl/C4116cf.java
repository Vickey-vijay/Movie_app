package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4116cf implements InterfaceC4125co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56515a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4125co, bk.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4142df> mo1invoke(List<? extends C4142df> list, C4497rf c4497rf) {
        C4142df c4142df = new C4142df(c4497rf.f57602a, c4497rf.f57603b, c4497rf.f57606e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C4142df) it.next()).f56595c == c4497rf.f57606e) {
                    if (c4142df.f56595c == T7.f55911c && this.f56515a) {
                        return nj.b0.z0(list, c4142df);
                    }
                    return null;
                }
            }
        }
        return nj.b0.z0(list, c4142df);
    }

    public C4116cf(C4167ef c4167ef) {
        boolean z10;
        List<C4142df> list = c4167ef.f56669b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C4142df) it.next()).f56595c == T7.f55911c) {
                    z10 = false;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        this.f56515a = z10;
    }
}
