package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3784xa;
import org.json.JSONArray;

/* JADX INFO: compiled from: CrashCallbackWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOOMCallback f6237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICrashCallback f6238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6239c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f6239c = str;
        this.f6238b = iCrashCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable Throwable th2, @Nullable Thread thread, long j10, JSONArray jSONArray) {
        if (this.f6237a == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", C3784xa.f31580b), this.f6239c)) {
                this.f6237a.onCrash(crashType, th2, thread, j10);
            }
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable Throwable th2, @Nullable Thread thread, long j10) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f6239c = str;
        this.f6237a = iOOMCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.f6238b == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", C3784xa.f31580b), this.f6239c)) {
                this.f6238b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        d dVarA;
        if (this.f6238b == null || (dVarA = d.a(this.f6239c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f6238b.onCrash(crashType, str, null);
    }
}
