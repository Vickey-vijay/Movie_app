package com.ironsource;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class Ce {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f26095b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ce f26094a = new Ce();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Be f26096c = Be.NOT_INIT;

    public final synchronized Be a() {
        return f26096c;
    }

    public final synchronized void a(Be be2) {
        ck.p.j(be2, "<set-?>");
        f26096c = be2;
    }

    public final Be b() {
        Boolean bool = f26095b;
        if (bool == null ? true : ck.p.e(bool, Boolean.FALSE)) {
            return Be.NOT_INIT;
        }
        if (ck.p.e(bool, Boolean.TRUE)) {
            return f26096c;
        }
        throw new NoWhenBranchMatchedException();
    }

    private Ce() {
    }

    public final void a(boolean z10) {
        f26095b = Boolean.valueOf(z10);
    }
}
