package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends n implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71421a;

    public c(@NonNull String str, int i10) {
        super(str);
        this.f71421a = i10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull c cVar) {
        return this.f71421a - cVar.f71421a;
    }

    @Override // sg.bigo.ads.core.f.a.n
    public final String toString() {
        return "{\"Content\":\"" + this.f71455b + "\",\"pro_ms\":\"" + this.f71421a + "\"}";
    }
}
