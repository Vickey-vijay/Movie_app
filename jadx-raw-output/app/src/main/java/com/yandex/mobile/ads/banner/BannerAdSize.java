package com.yandex.mobile.ads.banner;

import android.content.Context;
import ck.i;
import ck.p;
import yads.a03;
import yads.nv0;
import yads.wi2;
import yads.zz2;

/* JADX INFO: loaded from: classes9.dex */
public final class BannerAdSize extends wi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50957a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a03 f50958b;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }

        public final BannerAdSize fixedSize(Context context, int i10, int i11) {
            return new BannerAdSize(new nv0(i10, i11, zz2.f85664c, null));
        }

        public final BannerAdSize inlineSize(Context context, int i10, int i11) {
            return new BannerAdSize(new nv0(i10, i11, zz2.f85665d, null));
        }
    }

    public static final BannerAdSize fixedSize(Context context, int i10, int i11) {
        return f50957a.fixedSize(context, i10, i11);
    }

    public static final BannerAdSize inlineSize(Context context, int i10, int i11) {
        return f50957a.inlineSize(context, i10, i11);
    }

    public final a03 a() {
        return this.f50958b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(BannerAdSize.class, obj.getClass())) {
            return false;
        }
        return p.e(this.f50958b, ((BannerAdSize) obj).f50958b);
    }

    public final int getHeight() {
        return this.f50958b.getHeight();
    }

    public final int getWidth() {
        return this.f50958b.getWidth();
    }

    public int hashCode() {
        return this.f50958b.hashCode();
    }

    public String toString() {
        return this.f50958b.toString();
    }

    public BannerAdSize(a03 a03Var) {
        this.f50958b = a03Var;
    }
}
