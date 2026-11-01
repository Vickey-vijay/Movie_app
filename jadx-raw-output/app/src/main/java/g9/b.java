package g9;

import e9.f;

/* JADX INFO: compiled from: DeviceManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e9.b f53200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c9.b f53201b = new c9.b();

    @Override // g9.c
    public f a() {
        return this.f53200a;
    }

    @Override // g9.c
    public void destroy() {
        if (h9.c.a(this.f53201b)) {
            this.f53201b.a();
        }
    }
}
