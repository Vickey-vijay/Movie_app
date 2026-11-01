package com.safedk.android.utils;

import android.widget.Toast;
import com.safedk.android.SafeDK;

/* JADX INFO: loaded from: classes10.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f45006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f45007b;

    public j(String str) {
        this(str, null);
    }

    public j(String str, String str2) {
        this.f45006a = str;
        this.f45007b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Toast.makeText(SafeDK.getInstance().l(), "SDK '" + this.f45006a + "' " + (this.f45007b == null ? "" : "Toggle '" + this.f45007b + "'") + " blocked by SafeDK", 0).show();
    }
}
