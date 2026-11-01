package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.a.j;
import sg.bigo.ads.common.l;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements sg.bigo.ads.common.f, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70372a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70373b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70374c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70375d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70376e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f70377f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f70378g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sg.bigo.ads.api.a.h f70379h;

    public d(sg.bigo.ads.api.a.h hVar) {
        this.f70379h = hVar;
    }

    private boolean a(int i10) {
        sg.bigo.ads.api.a.h hVar = this.f70379h;
        j jVarN = hVar != null ? hVar.n() : null;
        if (jVarN != null) {
            return jVarN.a(i10);
        }
        return false;
    }

    @Override // sg.bigo.ads.common.l
    public final int a() {
        return this.f70372a;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeInt(this.f70372a);
            parcel.writeInt(this.f70373b);
            parcel.writeInt(this.f70374c);
            parcel.writeInt(this.f70375d);
            parcel.writeInt(this.f70376e);
            parcel.writeInt(this.f70377f);
            parcel.writeInt(this.f70378g);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f70372a = n.a(parcel, 3);
        this.f70373b = n.a(parcel, 2);
        this.f70374c = n.a(parcel, 12);
        this.f70375d = n.a(parcel, 3);
        this.f70376e = n.a(parcel, 3);
        this.f70377f = n.a(parcel, 10);
        this.f70378g = n.a(parcel, 5);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean b() {
        return a(13);
    }

    @Override // sg.bigo.ads.common.l
    public final int c() {
        return this.f70373b;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean d() {
        return a(13);
    }

    @Override // sg.bigo.ads.common.l
    public final int e() {
        return this.f70374c;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean f() {
        return a(10);
    }

    @Override // sg.bigo.ads.common.l
    public final int g() {
        return this.f70375d;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean h() {
        return a(11);
    }

    @Override // sg.bigo.ads.common.l
    public final int i() {
        return this.f70376e;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean j() {
        return a(12);
    }

    @Override // sg.bigo.ads.common.l
    public final int k() {
        return this.f70377f;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean l() {
        return a(11);
    }

    @Override // sg.bigo.ads.common.l
    public final int m() {
        return this.f70378g;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean n() {
        return a(12);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean o() {
        return a(18);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean p() {
        return a(13);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
