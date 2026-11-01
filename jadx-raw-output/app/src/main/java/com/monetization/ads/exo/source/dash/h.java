package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import yads.ib3;
import yads.pb2;
import yads.r30;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements pb2 {
    @Override // yads.pb2
    public final Object a(Uri uri, r30 r30Var) {
        return Long.valueOf(ib3.f(new BufferedReader(new InputStreamReader(r30Var)).readLine()));
    }
}
