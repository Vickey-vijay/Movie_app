package z4;

import g5.k0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f implements t4.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f86307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f86308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, e> f86309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, c> f86310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f86311f;

    @Override // t4.e
    public List<t4.b> getCues(long j10) {
        return this.f86307b.h(j10, this.f86309d, this.f86310e, this.f86311f);
    }

    @Override // t4.e
    public long getEventTime(int i10) {
        return this.f86308c[i10];
    }

    @Override // t4.e
    public int getEventTimeCount() {
        return this.f86308c.length;
    }

    @Override // t4.e
    public int getNextEventTimeIndex(long j10) {
        int iE = k0.e(this.f86308c, j10, false, false);
        if (iE < this.f86308c.length) {
            return iE;
        }
        return -1;
    }

    public f(b bVar, Map<String, e> map, Map<String, c> map2, Map<String, String> map3) {
        Map<String, e> mapEmptyMap;
        this.f86307b = bVar;
        this.f86310e = map2;
        this.f86311f = map3;
        if (map != null) {
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.f86309d = mapEmptyMap;
        this.f86308c = bVar.j();
    }
}
