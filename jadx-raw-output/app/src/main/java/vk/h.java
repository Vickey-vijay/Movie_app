package vk;

import bk.q;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import mj.r;
import nk.l;
import sk.d0;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q<Object, Object, Object, Object> f73185a = a.f73191b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f73186b = new d0("STATE_REG");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f73187c = new d0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f73188d = new d0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f73189e = new d0("NO_RESULT");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d0 f73190f = new d0("PARAM_CLAUSE_0");

    /* JADX INFO: compiled from: Select.kt */
    public static final class a implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f73191b = new a();

        @Override // bk.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    public static final TrySelectDetailedResult a(int i10) {
        if (i10 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i10 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i10 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i10 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    public static final d0 i() {
        return f73190f;
    }

    public static final boolean j(l<? super r> lVar, q<? super Throwable, Object, ? super kotlin.coroutines.d, r> qVar) {
        Object objR = lVar.r(r.f64562a, null, qVar);
        if (objR == null) {
            return false;
        }
        lVar.x(objR);
        return true;
    }
}
