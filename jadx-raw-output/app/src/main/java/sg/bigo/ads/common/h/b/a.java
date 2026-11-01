package sg.bigo.ads.common.h.b;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f69702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f69703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f69704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f69705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f69707f;

    public a(@NonNull sg.bigo.ads.common.h.a aVar) {
        this.f69703b = aVar;
        this.f69702a = aVar.f69659a;
    }

    public final void a(long j10) {
        this.f69703b.f69667i = j10;
    }

    public final void b(long j10) {
        this.f69703b.f69665g = j10;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f69702a.equals(aVar.f69702a) && this.f69703b.f69662d.equals(aVar.f69703b.f69662d) && this.f69703b.f69661c.equals(aVar.f69703b.f69661c);
    }

    public String toString() {
        return this.f69703b.toString();
    }
}
