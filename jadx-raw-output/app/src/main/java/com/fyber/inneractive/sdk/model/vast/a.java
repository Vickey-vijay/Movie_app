package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15870d;

    public a(String str, String str2, String str3) {
        String strTrim;
        String strTrim2;
        boolean z10;
        if (str != null) {
            strTrim = str.trim();
        } else {
            strTrim = null;
        }
        this.f15867a = strTrim;
        if (str2 != null) {
            strTrim2 = str2.trim();
        } else {
            strTrim2 = null;
        }
        this.f15868b = strTrim2;
        String strTrim3 = str3 != null ? str3.trim() : null;
        this.f15869c = strTrim3;
        if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2) && !TextUtils.isEmpty(strTrim3) && strTrim3.contains("[TIME]")) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15870d = z10;
    }
}
