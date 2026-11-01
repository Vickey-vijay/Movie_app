package com.ironsource;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f26896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26897c;

    public Je(String str, List<String> list, boolean z10) {
        this.f26895a = str;
        this.f26896b = list;
        this.f26897c = z10;
    }

    public final boolean a() {
        if (this.f26897c) {
            List<String> list = this.f26896b;
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.f26895a;
                    if (str2 != null && lk.x.R(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
        } else {
            List<String> list2 = this.f26896b;
            if (list2 != null && !list2.isEmpty()) {
                for (String str3 : list2) {
                    String str4 = this.f26895a;
                    if (str4 != null && lk.a0.X(str4, str3, false, 2, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String b() {
        return this.f26895a;
    }

    public /* synthetic */ Je(String str, List list, boolean z10, int i10, ck.i iVar) {
        this(str, list, (i10 & 4) != 0 ? false : z10);
    }
}
