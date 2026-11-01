package t1;

import android.view.MotionEvent;
import android.view.View;
import ck.p;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: RCTCodelessLoggingEventListener.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lt1/h;", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Lt1/h$a;", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f72148a = new h();

    /* JADX INFO: compiled from: RCTCodelessLoggingEventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lt1/h$a;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/MotionEvent;", "motionEvent", "", "onTouch", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "b", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "hostView", "d", "rootView", "e", "Landroid/view/View$OnTouchListener;", "existingOnTouchListener", InneractiveMediationDefs.GENDER_FEMALE, "Z", "a", "()Z", "setSupportCodelessLogging", "(Z)V", "supportCodelessLogging", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final EventBinding mapping;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final WeakReference<View> hostView;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final WeakReference<View> rootView;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final View.OnTouchListener existingOnTouchListener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean supportCodelessLogging;

        public a(EventBinding eventBinding, View view, View view2) {
            p.j(eventBinding, "mapping");
            p.j(view, "rootView");
            p.j(view2, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            this.existingOnTouchListener = u1.d.h(view2);
            this.supportCodelessLogging = true;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            p.j(motionEvent, "motionEvent");
            View view2 = this.rootView.get();
            View view3 = this.hostView.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                b bVar = b.f72109a;
                b.d(this.mapping, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.existingOnTouchListener;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    public static final a a(EventBinding mapping, View rootView, View hostView) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            p.j(mapping, "mapping");
            p.j(rootView, "rootView");
            p.j(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }
}
