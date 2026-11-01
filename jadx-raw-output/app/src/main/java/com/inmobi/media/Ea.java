package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.C3426d4;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class Ea {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f22576b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f22577a;

    public static void a(Ea ea2, String str, boolean z10) {
        ck.p.j(str, C3426d4.i.W);
        SharedPreferences.Editor editorEdit = ea2.f22577a.edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public Ea(Context context, String str) {
        this.f22577a = context.getSharedPreferences(str, 0);
    }

    public final boolean a(String str) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str, C3426d4.i.W);
        if (!this.f22577a.contains(str)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f22577a.edit();
        editorEdit.remove(str);
        editorEdit.apply();
        return true;
    }

    public final void a(String str, String str2, boolean z10) {
        ck.p.j(str, C3426d4.i.W);
        SharedPreferences.Editor editorEdit = this.f22577a.edit();
        editorEdit.putString(str, str2);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String str, int i10, boolean z10) {
        ck.p.j(str, C3426d4.i.W);
        SharedPreferences.Editor editorEdit = this.f22577a.edit();
        editorEdit.putInt(str, i10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String str, long j10, boolean z10) {
        ck.p.j(str, C3426d4.i.W);
        SharedPreferences.Editor editorEdit = this.f22577a.edit();
        editorEdit.putLong(str, j10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
