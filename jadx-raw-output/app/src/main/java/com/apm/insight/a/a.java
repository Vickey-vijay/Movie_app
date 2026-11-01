package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* JADX INFO: compiled from: AlogUploadManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements ICrashCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f6231d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f6232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile i.a f6233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile i.a f6234c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f6235e = false;

    public static a a() {
        if (f6231d == null) {
            synchronized (a.class) {
                if (f6231d == null) {
                    f6231d = new a();
                }
            }
        }
        return f6231d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    private a() {
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f6232a = str;
        this.f6233b = aVar;
        this.f6234c = aVar2;
        if (this.f6235e) {
            return;
        }
        this.f6235e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
