package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes7.dex */
public class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f7616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f7617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7618c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h4 h4Var = (h4) obj;
        View view = this.f7616a;
        if (view == null ? h4Var.f7616a != null : !view.equals(h4Var.f7616a)) {
            return false;
        }
        if (this.f7617b != h4Var.f7617b) {
            return false;
        }
        String str = this.f7618c;
        String str2 = h4Var.f7618c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public String a() {
        return this.f7618c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f7617b;
    }

    public View c() {
        return this.f7616a;
    }

    public int hashCode() {
        View view = this.f7616a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f7617b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f7618c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public h4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f7616a = view;
        this.f7617b = friendlyObstructionPurpose;
        this.f7618c = str;
    }
}
