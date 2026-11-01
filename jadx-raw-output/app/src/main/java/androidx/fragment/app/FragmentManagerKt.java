package androidx.fragment.app;

import bk.l;
import ck.p;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: FragmentManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a.\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a8\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/FragmentManager;", "", "allowStateLoss", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lmj/r;", "body", "commit", "commitNow", "now", "transaction", "fragment-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class FragmentManagerKt {
    public static final void commit(FragmentManager fragmentManager, boolean z10, l<? super FragmentTransaction, r> lVar) {
        p.j(fragmentManager, "<this>");
        p.j(lVar, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        p.i(fragmentTransactionBeginTransaction, "beginTransaction()");
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        p.j(fragmentManager, "<this>");
        p.j(lVar, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        p.i(fragmentTransactionBeginTransaction, "beginTransaction()");
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static final void commitNow(FragmentManager fragmentManager, boolean z10, l<? super FragmentTransaction, r> lVar) {
        p.j(fragmentManager, "<this>");
        p.j(lVar, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        p.i(fragmentTransactionBeginTransaction, "beginTransaction()");
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        p.j(fragmentManager, "<this>");
        p.j(lVar, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        p.i(fragmentTransactionBeginTransaction, "beginTransaction()");
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static final void transaction(FragmentManager fragmentManager, boolean z10, boolean z11, l<? super FragmentTransaction, r> lVar) {
        p.j(fragmentManager, "<this>");
        p.j(lVar, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        p.i(fragmentTransactionBeginTransaction, "beginTransaction()");
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            if (z11) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z11) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z10, boolean z11, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        p.j(fragmentManager, "<this>");
        p.j(lVar, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        p.i(fragmentTransactionBeginTransaction, "beginTransaction()");
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            if (z11) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z11) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }
}
