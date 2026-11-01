package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeSet f17706a = new TreeSet(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17707b;

    public final void a(l lVar, long j10) {
        while (this.f17707b + j10 > 10485760) {
            try {
                g gVar = (g) this.f17706a.first();
                synchronized (lVar) {
                    try {
                        lVar.a(gVar, true);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (a unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[ORIG_RETURN, RETURN] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        long j10 = gVar.f17694f;
        long j11 = gVar2.f17694f;
        if (j10 - j11 != 0) {
            if (j10 < j11) {
                return -1;
            }
            return 1;
        }
        if (!gVar.f17689a.equals(gVar2.f17689a)) {
            return gVar.f17689a.compareTo(gVar2.f17689a);
        }
        long j12 = gVar.f17690b - gVar2.f17690b;
        if (j12 == 0) {
            return 0;
        }
        if (j12 < 0) {
            return -1;
        }
        return 1;
    }
}
