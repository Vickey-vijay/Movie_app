package i;

import android.view.View;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f54013b = -1.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1 f54014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0 f54015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f54016e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Double.compare(((b) obj).f54013b, this.f54013b);
    }

    public final String toString() {
        return "AdCacheData{revenue=" + this.f54013b + ", adLoader=" + this.f54014c + ", sliceLoader=" + this.f54015d + ", view=" + this.f54016e + '}';
    }
}
