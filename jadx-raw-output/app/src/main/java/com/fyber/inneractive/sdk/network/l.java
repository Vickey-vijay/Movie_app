package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f16041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f16042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16044f = new ArrayList();

    public l() {
    }

    public void a() {
        InputStream inputStream = this.f16041c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public l(FilterInputStream filterInputStream, int i10, String str, Map map, String str2) {
        this.f16041c = filterInputStream;
        this.f16039a = i10;
        this.f16040b = str;
        this.f16042d = map;
        this.f16043e = str2;
    }
}
