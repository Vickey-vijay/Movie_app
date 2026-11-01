package on;

import java.util.LinkedHashMap;
import java.util.Map;
import un.l;
import xn.d;

/* JADX INFO: compiled from: GENASubscription.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<S extends l> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S f65458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f65461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public org.fourthline.cling.model.types.b f65462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, d<S>> f65463g;

    public a(S s10) {
        this.f65460d = 1800;
        this.f65463g = new LinkedHashMap();
        this.f65458b = s10;
    }

    public synchronized org.fourthline.cling.model.types.b A() {
        return this.f65462f;
    }

    public synchronized Map<String, d<S>> E() {
        return this.f65463g;
    }

    public synchronized int G() {
        return this.f65460d;
    }

    public synchronized S H() {
        return this.f65458b;
    }

    public synchronized String I() {
        return this.f65459c;
    }

    public synchronized void J(int i10) {
        this.f65461e = i10;
    }

    public synchronized void K(String str) {
        this.f65459c = str;
    }

    public abstract void b();

    public abstract void h();

    public synchronized int t() {
        return this.f65461e;
    }

    public String toString() {
        return "(GENASubscription, SID: " + I() + ", SEQUENCE: " + A() + ")";
    }

    public a(S s10, int i10) {
        this(s10);
        this.f65460d = i10;
    }
}
