package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class rt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f82422a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f82423b = new ArrayList();

    public final void a(s61 s61Var) {
        synchronized (this.f82422a) {
            this.f82423b.add(s61Var);
        }
    }
}
