package io.appmetrica.analytics.idsync.impl;

import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "none";
        }
        if (i10 == 2) {
            return "success";
        }
        if (i10 == 3) {
            return "incompatible_precondition";
        }
        if (i10 == 4) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i10) {
        if (i10 == 1) {
            return Constraint.NONE;
        }
        if (i10 == 2) {
            return "SUCCESS";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "FAILURE";
        }
        return "INCOMPATIBLE_PRECONDITION";
    }
}
