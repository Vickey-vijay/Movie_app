package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PrefetchVastAdTagUri extends VastAdTagUri {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43941b = "PrefetchVastAdTagUri";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43942c = "\\[[\\s\\S].*?\\]";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f43943d;

    public PrefetchVastAdTagUri(String uri) {
        super(uri);
        this.f43943d = a(uri);
        Logger.d(f43941b, "Prefetch URI, unique parts: " + Arrays.toString(this.f43943d));
    }

    private String[] a(String str) {
        return str != null ? str.split(f43942c) : new String[0];
    }

    private boolean b(String str) {
        int iIndexOf;
        for (String str2 : this.f43943d) {
            if (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(str2)) < 0) {
                return false;
            }
            str = str.substring(str2.length() + iIndexOf);
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri
    public boolean equals(Object obj) {
        return b(obj.toString());
    }
}
