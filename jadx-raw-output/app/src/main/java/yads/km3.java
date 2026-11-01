package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class km3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f79477c = lm3.f79855a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f79478a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79479b = false;

    public final synchronized void a(String str, long j10) {
        if (this.f79479b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f79478a.add(new jm3(str, j10, SystemClock.elapsedRealtime()));
    }

    public final void finalize() {
        if (this.f79479b) {
            return;
        }
        a();
        boolean z10 = ad1.f75480a;
    }

    public final synchronized void a() {
        long j10;
        this.f79479b = true;
        if (this.f79478a.size() == 0) {
            j10 = 0;
        } else {
            long j11 = ((jm3) this.f79478a.get(0)).f79128a;
            ArrayList arrayList = this.f79478a;
            j10 = ((jm3) arrayList.get(arrayList.size() - 1)).f79128a - j11;
        }
        if (j10 <= 0) {
            return;
        }
        long j12 = ((jm3) this.f79478a.get(0)).f79128a;
        boolean z10 = ad1.f75480a;
        Iterator it = this.f79478a.iterator();
        while (it.hasNext()) {
            long j13 = ((jm3) it.next()).f79128a;
            boolean z11 = ad1.f75480a;
        }
    }
}
