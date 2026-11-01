package sk;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LockFreeLinkedListNode f71994a;

    public String toString() {
        return "Removed[" + this.f71994a + ']';
    }

    public x(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f71994a = lockFreeLinkedListNode;
    }
}
