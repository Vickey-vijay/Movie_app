package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17454b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != e.class) {
            return false;
        }
        e eVar = (e) obj;
        return TextUtils.equals(this.f17453a, eVar.f17453a) && this.f17454b == eVar.f17454b;
    }

    public final int hashCode() {
        String str = this.f17453a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f17454b ? 1231 : 1237);
    }

    public e(boolean z10, String str) {
        this.f17453a = str;
        this.f17454b = z10;
    }
}
