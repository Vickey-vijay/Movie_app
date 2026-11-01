package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4397ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57342a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57343b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57344c = 1;

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f57342a;
        }
        if (ck.p.e(bool, Boolean.FALSE)) {
            return this.f57343b;
        }
        if (ck.p.e(bool, Boolean.TRUE)) {
            return this.f57344c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Boolean a(int i10) {
        if (i10 == this.f57343b) {
            return Boolean.FALSE;
        }
        if (i10 == this.f57344c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
