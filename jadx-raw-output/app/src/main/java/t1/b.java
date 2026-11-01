package t1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import ck.p;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import q1.t;

/* JADX INFO: compiled from: CodelessLoggingEventListener.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0015\bB\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lt1/b;", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Lt1/b$a;", "b", "Landroid/widget/AdapterView;", "Lt1/b$b;", "c", "Lmj/r;", "d", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "Landroid/os/Bundle;", "parameters", InneractiveMediationDefs.GENDER_FEMALE, "(Landroid/os/Bundle;)V", "<init>", "()V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f72109a = new b();

    /* JADX INFO: compiled from: CodelessLoggingEventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lt1/b$a;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lmj/r;", "onClick", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "b", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "hostView", "d", "rootView", "e", "Landroid/view/View$OnClickListener;", "existingOnClickListener", "", InneractiveMediationDefs.GENDER_FEMALE, "Z", "a", "()Z", "setSupportCodelessLogging", "(Z)V", "supportCodelessLogging", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public EventBinding mapping;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public WeakReference<View> hostView;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public WeakReference<View> rootView;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public View.OnClickListener existingOnClickListener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean supportCodelessLogging;

        public a(EventBinding eventBinding, View view, View view2) {
            p.j(eventBinding, "mapping");
            p.j(view, "rootView");
            p.j(view2, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            this.existingOnClickListener = u1.d.g(view2);
            this.supportCodelessLogging = true;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (i2.a.d(this)) {
                return;
            }
            try {
                if (i2.a.d(this)) {
                    return;
                }
                try {
                    p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    View.OnClickListener onClickListener = this.existingOnClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = this.rootView.get();
                    View view3 = this.hostView.get();
                    if (view2 != null && view3 != null) {
                        b bVar = b.f72109a;
                        b.d(this.mapping, view2, view3);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    i2.a.b(th2, this);
                    return;
                }
                i2.a.b(th, this);
            } catch (Throwable th3) {
                i2.a.b(th3, this);
            }
        }
    }

    /* JADX INFO: renamed from: t1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CodelessLoggingEventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b!\u0010\"J.\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lt1/b$b;", "Landroid/widget/AdapterView$OnItemClickListener;", "Landroid/widget/AdapterView;", "parent", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", C3426d4.i.L, "", "id", "Lmj/r;", "onItemClick", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "b", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "hostView", "d", "rootView", "e", "Landroid/widget/AdapterView$OnItemClickListener;", "existingOnItemClickListener", "", InneractiveMediationDefs.GENDER_FEMALE, "Z", "a", "()Z", "setSupportCodelessLogging", "(Z)V", "supportCodelessLogging", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/widget/AdapterView;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class C0749b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public EventBinding mapping;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public WeakReference<AdapterView<?>> hostView;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public WeakReference<View> rootView;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public AdapterView.OnItemClickListener existingOnItemClickListener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean supportCodelessLogging;

        public C0749b(EventBinding eventBinding, View view, AdapterView<?> adapterView) {
            p.j(eventBinding, "mapping");
            p.j(view, "rootView");
            p.j(adapterView, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(adapterView);
            this.rootView = new WeakReference<>(view);
            this.existingOnItemClickListener = adapterView.getOnItemClickListener();
            this.supportCodelessLogging = true;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            AdapterView.OnItemClickListener onItemClickListener = this.existingOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = this.rootView.get();
            AdapterView<?> adapterView2 = this.hostView.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            b bVar = b.f72109a;
            b.d(this.mapping, view2, adapterView2);
        }
    }

    public static final a b(EventBinding mapping, View rootView, View hostView) {
        if (i2.a.d(b.class)) {
            return null;
        }
        try {
            p.j(mapping, "mapping");
            p.j(rootView, "rootView");
            p.j(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
            return null;
        }
    }

    public static final C0749b c(EventBinding mapping, View rootView, AdapterView<?> hostView) {
        if (i2.a.d(b.class)) {
            return null;
        }
        try {
            p.j(mapping, "mapping");
            p.j(rootView, "rootView");
            p.j(hostView, "hostView");
            return new C0749b(mapping, rootView, hostView);
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
            return null;
        }
    }

    public static final void d(EventBinding mapping, View rootView, View hostView) {
        if (i2.a.d(b.class)) {
            return;
        }
        try {
            p.j(mapping, "mapping");
            p.j(rootView, "rootView");
            p.j(hostView, "hostView");
            final String str = mapping.getCom.ironsource.d4.i.j0 java.lang.String();
            final Bundle bundleB = g.INSTANCE.b(mapping, rootView, hostView);
            f72109a.f(bundleB);
            t.t().execute(new Runnable() { // from class: t1.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.e(str, bundleB);
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
        }
    }

    public static final void e(String str, Bundle bundle) {
        if (i2.a.d(b.class)) {
            return;
        }
        try {
            p.j(str, "$eventName");
            p.j(bundle, "$parameters");
            AppEventsLogger.INSTANCE.g(t.l()).c(str, bundle);
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
        }
    }

    public final void f(Bundle parameters) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            p.j(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", y1.g.g(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
