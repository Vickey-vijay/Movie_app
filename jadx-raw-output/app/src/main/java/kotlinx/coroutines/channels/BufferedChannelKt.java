package kotlinx.coroutines.channels;

import bk.q;
import jk.g;
import kotlin.coroutines.d;
import mj.r;
import nk.l;
import pk.i;
import sk.d0;
import sk.g0;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class BufferedChannelKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i<Object> f63057a = new i<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f63058b = g0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f63059c = g0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f63060d = new d0("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f63061e = new d0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d0 f63062f = new d0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d0 f63063g = new d0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d0 f63064h = new d0("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d0 f63065i = new d0("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d0 f63066j = new d0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d0 f63067k = new d0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d0 f63068l = new d0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d0 f63069m = new d0("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d0 f63070n = new d0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d0 f63071o = new d0("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d0 f63072p = new d0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d0 f63073q = new d0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d0 f63074r = new d0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d0 f63075s = new d0("NO_CLOSE_CAUSE");

    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(l<? super T> lVar, T t10, q<? super Throwable, ? super T, ? super d, r> qVar) {
        Object objR = lVar.r(t10, null, qVar);
        if (objR == null) {
            return false;
        }
        lVar.x(objR);
        return true;
    }

    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    public static /* synthetic */ boolean C(l lVar, Object obj, q qVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            qVar = null;
        }
        return B(lVar, obj, qVar);
    }

    public static final <E> i<E> x(long j10, i<E> iVar) {
        return new i<>(j10, iVar, iVar.y(), 0);
    }

    public static final <E> g<i<E>> y() {
        return BufferedChannelKt$createSegmentFunction$1.INSTANCE;
    }

    public static final d0 z() {
        return f63068l;
    }
}
