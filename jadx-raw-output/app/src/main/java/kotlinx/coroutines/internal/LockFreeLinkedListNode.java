package kotlinx.coroutines.internal;

import androidx.concurrent.futures.a;
import ck.p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import nk.m0;
import sk.n;
import sk.x;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes8.dex */
public class LockFreeLinkedListNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63173b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63174c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63175d = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final void f(int i10) {
        c(new n(i10), i10);
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return m0.a(this.receiver);
            }
        } + '@' + m0.b(this);
    }

    public final boolean c(LockFreeLinkedListNode lockFreeLinkedListNode, int i10) {
        LockFreeLinkedListNode lockFreeLinkedListNodeL;
        do {
            lockFreeLinkedListNodeL = l();
            if (lockFreeLinkedListNodeL instanceof n) {
                if ((((n) lockFreeLinkedListNodeL).f71970e & i10) == 0 && lockFreeLinkedListNodeL.c(lockFreeLinkedListNode, i10)) {
                    return true;
                }
                return false;
            }
        } while (!lockFreeLinkedListNodeL.d(lockFreeLinkedListNode, this));
        return true;
    }

    public final boolean d(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
        f63174c.set(lockFreeLinkedListNode, this);
        f63173b.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        if (!a.a(f63173b, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            return false;
        }
        lockFreeLinkedListNode.i(lockFreeLinkedListNode2);
        return true;
    }

    public final boolean e(LockFreeLinkedListNode lockFreeLinkedListNode) {
        f63174c.set(lockFreeLinkedListNode, this);
        f63173b.set(lockFreeLinkedListNode, this);
        while (j() == this) {
            if (a.a(f63173b, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.i(this);
                return true;
            }
        }
        return false;
    }

    public final LockFreeLinkedListNode g() {
        Object obj;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) f63174c.get(this);
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    obj = f63173b.get(lockFreeLinkedListNode2);
                    if (obj == this) {
                        if (lockFreeLinkedListNode == lockFreeLinkedListNode2) {
                            return lockFreeLinkedListNode2;
                        }
                        if (!a.a(f63174c, this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                            break;
                        }
                        return lockFreeLinkedListNode2;
                    }
                    if (p()) {
                        return null;
                    }
                    if (obj instanceof x) {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) f63174c.get(lockFreeLinkedListNode2);
                    } else {
                        p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                    }
                }
                if (!a.a(f63173b, lockFreeLinkedListNode3, lockFreeLinkedListNode2, ((x) obj).f71994a)) {
                    break;
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    public final LockFreeLinkedListNode h(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.p()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) f63174c.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    public final void i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63174c;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (j() != lockFreeLinkedListNode) {
                return;
            }
        } while (!a.a(f63174c, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (p()) {
            lockFreeLinkedListNode.g();
        }
    }

    public final Object j() {
        return f63173b.get(this);
    }

    public final LockFreeLinkedListNode k() {
        x xVar;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object objJ = j();
        if (objJ instanceof x) {
            xVar = (x) objJ;
        } else {
            xVar = null;
        }
        if (xVar == null || (lockFreeLinkedListNode = xVar.f71994a) == null) {
            p.h(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            return (LockFreeLinkedListNode) objJ;
        }
        return lockFreeLinkedListNode;
    }

    public final LockFreeLinkedListNode l() {
        LockFreeLinkedListNode lockFreeLinkedListNodeG = g();
        if (lockFreeLinkedListNodeG == null) {
            return h((LockFreeLinkedListNode) f63174c.get(this));
        }
        return lockFreeLinkedListNodeG;
    }

    public boolean p() {
        return j() instanceof x;
    }

    public boolean q() {
        if (r() == null) {
            return true;
        }
        return false;
    }

    public final LockFreeLinkedListNode r() {
        Object objJ;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            objJ = j();
            if (objJ instanceof x) {
                return ((x) objJ).f71994a;
            }
            if (objJ == this) {
                return (LockFreeLinkedListNode) objJ;
            }
            p.h(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objJ;
        } while (!a.a(f63173b, this, objJ, lockFreeLinkedListNode.s()));
        lockFreeLinkedListNode.g();
        return null;
    }

    public final x s() {
        x xVar = (x) f63175d.get(this);
        if (xVar == null) {
            x xVar2 = new x(this);
            f63175d.set(this, xVar2);
            return xVar2;
        }
        return xVar;
    }
}
