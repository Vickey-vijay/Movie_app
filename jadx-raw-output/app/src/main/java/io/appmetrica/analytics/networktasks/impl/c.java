package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;
import ck.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58243a;

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri uri = Uri.parse(str);
        return p.e("http", uri.getScheme()) ? uri.buildUpon().scheme("https").build().toString() : str;
    }

    public c(String str) {
        this.f58243a = a(str);
    }
}
