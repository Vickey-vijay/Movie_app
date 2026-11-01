package com.google.android.exoplayer2.offline;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: DownloadManager.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Requirements f19404l = new Requirements(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j4.a.c f19406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet<InterfaceC0178a> f19407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<h4.a> f19414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j4.a f19415k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadManager.java */
    public interface InterfaceC0178a {
        default void a(a aVar, Requirements requirements, int i10) {
        }

        default void b(a aVar, boolean z10) {
        }
    }

    public void k() {
        o(true);
    }

    public void n() {
        o(false);
    }

    public void a(DownloadRequest downloadRequest, int i10) {
        this.f19408d++;
        throw null;
    }

    public void b(InterfaceC0178a interfaceC0178a) {
        this.f19407c.add(interfaceC0178a);
    }

    public List<h4.a> c() {
        return this.f19414j;
    }

    public boolean d() {
        return this.f19411g;
    }

    public Requirements e() {
        return this.f19415k.f();
    }

    public boolean f() {
        return this.f19409e == 0 && this.f19408d == 0;
    }

    public boolean g() {
        return this.f19410f;
    }

    public boolean h() {
        return this.f19413i;
    }

    public final void i() {
        Iterator<InterfaceC0178a> it = this.f19407c.iterator();
        while (it.hasNext()) {
            it.next().b(this, this.f19413i);
        }
    }

    public void l() {
        this.f19408d++;
        throw null;
    }

    public void m(String str) {
        this.f19408d++;
        throw null;
    }

    public final void o(boolean z10) {
        if (this.f19411g == z10) {
            return;
        }
        this.f19411g = z10;
        this.f19408d++;
        throw null;
    }

    public void p(Requirements requirements) {
        if (requirements.equals(this.f19415k.f())) {
            return;
        }
        this.f19415k.j();
        j4.a aVar = new j4.a(this.f19405a, this.f19406b, requirements);
        this.f19415k = aVar;
        j(this.f19415k, aVar.i());
    }

    public void q(@Nullable String str, int i10) {
        this.f19408d++;
        throw null;
    }

    public final boolean r() {
        boolean z10;
        if (!this.f19411g && this.f19412h != 0) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f19414j.size()) {
                    z10 = false;
                    break;
                }
                if (this.f19414j.get(i10).f53697a == 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        } else {
            z10 = false;
            break;
        }
        boolean z11 = this.f19413i != z10;
        this.f19413i = z10;
        return z11;
    }

    public final void j(j4.a aVar, int i10) {
        Requirements requirementsF = aVar.f();
        if (this.f19412h == i10) {
            boolean zR = r();
            Iterator<InterfaceC0178a> it = this.f19407c.iterator();
            while (it.hasNext()) {
                it.next().a(this, requirementsF, i10);
            }
            if (zR) {
                i();
                return;
            }
            return;
        }
        this.f19412h = i10;
        this.f19408d++;
        throw null;
    }
}
