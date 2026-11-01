package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class zx extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f85637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy f85639d;

    public zx(cy cyVar, int i10) {
        this.f85639d = cyVar;
        this.f85637b = cyVar.b(i10);
        this.f85638c = i10;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f85637b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map mapA = this.f85639d.a();
        if (mapA != null) {
            return mapA.get(this.f85637b);
        }
        int i10 = this.f85638c;
        if (i10 == -1 || i10 >= this.f85639d.size() || !l92.a(this.f85637b, this.f85639d.b(this.f85638c))) {
            this.f85638c = this.f85639d.a(this.f85637b);
        }
        int i11 = this.f85638c;
        if (i11 == -1) {
            return null;
        }
        return this.f85639d.c(i11);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapA = this.f85639d.a();
        if (mapA != null) {
            return mapA.put(this.f85637b, obj);
        }
        int i10 = this.f85638c;
        if (i10 == -1 || i10 >= this.f85639d.size() || !l92.a(this.f85637b, this.f85639d.b(this.f85638c))) {
            this.f85638c = this.f85639d.a(this.f85637b);
        }
        int i11 = this.f85638c;
        if (i11 == -1) {
            this.f85639d.put(this.f85637b, obj);
            return null;
        }
        Object objC = this.f85639d.c(i11);
        this.f85639d.a(this.f85638c, obj);
        return objC;
    }
}
