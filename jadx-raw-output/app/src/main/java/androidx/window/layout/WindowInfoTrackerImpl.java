package androidx.window.layout;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import bk.p;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import qk.e;

/* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lqk/c;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "Landroidx/window/layout/WindowMetricsCalculator;", "windowMetricsCalculator", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroidx/window/layout/WindowBackend;", "windowBackend", "Landroidx/window/layout/WindowBackend;", "<init>", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/WindowBackend;)V", VastTagName.COMPANION, "window_release"}, k = 1, mv = {1, 6, 0})
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1, reason: invalid class name */
    /* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lqk/d;", "Landroidx/window/layout/WindowLayoutInfo;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @tj.d(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<qk.d<? super WindowLayoutInfo>, rj.c<? super r>, Object> {
        public final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, rj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = WindowInfoTrackerImpl.this.new AnonymousClass1(this.$activity, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(qk.d<? super WindowLayoutInfo> dVar, rj.c<? super r> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m46invokeSuspend$lambda0(pk.d dVar, WindowLayoutInfo windowLayoutInfo) {
            ck.p.i(windowLayoutInfo, "info");
            dVar.n(windowLayoutInfo);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0073  */
        /* JADX WARN: Code duplicated, block: B:23:0x007e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0064, B:21:0x0076, B:23:0x007e), top: B:35:0x0064 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x0092 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:35:0x0064). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = sj.a.f()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L39
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.L$2
                pk.f r1 = (pk.f) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                qk.d r5 = (qk.d) r5
                kotlin.c.b(r10)     // Catch: java.lang.Throwable -> La3
                r10 = r5
                goto L63
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.L$2
                pk.f r1 = (pk.f) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                qk.d r5 = (qk.d) r5
                kotlin.c.b(r10)     // Catch: java.lang.Throwable -> La3
                r6 = r5
                r5 = r9
                goto L76
            L39:
                kotlin.c.b(r10)
                java.lang.Object r10 = r9.L$0
                qk.d r10 = (qk.d) r10
                r1 = 10
                kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                r5 = 4
                r6 = 0
                pk.d r1 = pk.g.b(r1, r4, r6, r5, r6)
                androidx.window.layout.d r4 = new androidx.window.layout.d
                r4.<init>()
                androidx.window.layout.WindowInfoTrackerImpl r5 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
                android.app.Activity r6 = r9.$activity
                androidx.media3.exoplayer.dash.offline.a r7 = new androidx.media3.exoplayer.dash.offline.a
                r7.<init>()
                r5.registerLayoutChangeCallback(r6, r7, r4)
                pk.f r1 = r1.iterator()     // Catch: java.lang.Throwable -> La3
            L63:
                r5 = r9
            L64:
                r5.L$0 = r10     // Catch: java.lang.Throwable -> La1
                r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
                r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
                r5.label = r3     // Catch: java.lang.Throwable -> La1
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> La1
                if (r6 != r0) goto L73
                return r0
            L73:
                r8 = r6
                r6 = r10
                r10 = r8
            L76:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La1
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La1
                if (r10 == 0) goto L95
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> La1
                androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> La1
                r5.L$0 = r6     // Catch: java.lang.Throwable -> La1
                r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
                r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
                r5.label = r2     // Catch: java.lang.Throwable -> La1
                java.lang.Object r10 = r6.emit(r10, r5)     // Catch: java.lang.Throwable -> La1
                if (r10 != r0) goto L93
                return r0
            L93:
                r10 = r6
                goto L64
            L95:
                androidx.window.layout.WindowInfoTrackerImpl r10 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
                r10.unregisterLayoutChangeCallback(r4)
                mj.r r10 = mj.r.f64562a
                return r10
            La1:
                r10 = move-exception
                goto La5
            La3:
                r10 = move-exception
                r5 = r9
            La5:
                androidx.window.layout.WindowInfoTrackerImpl r0 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
                r0.unregisterLayoutChangeCallback(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public qk.c<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        return e.t(new AnonymousClass1(activity, null));
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        ck.p.j(windowMetricsCalculator, "windowMetricsCalculator");
        ck.p.j(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }
}
