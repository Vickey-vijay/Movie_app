package t1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import lk.x;
import q1.t;

/* JADX INFO: compiled from: CodelessMatcher.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0003\u000b\u000f\u0013B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R&\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019RF\u0010\u001f\u001a4\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001bj\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\""}, d2 = {"Lt1/g;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lmj/r;", "e", "h", InneractiveMediationDefs.GENDER_FEMALE, "i", "g", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "uiThreadHandler", "", "b", "Ljava/util/Set;", "activitiesSet", "Lt1/g$c;", "c", "viewMatchers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "d", "Ljava/util/HashSet;", "listenerSet", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "activityToListenerMap", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f72133g = g.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static g f72134h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Set<Activity> activitiesSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Set<c> viewMatchers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public HashSet<String> listenerSet;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final HashMap<Integer, HashSet<String>> activityToListenerMap;

    /* JADX INFO: renamed from: t1.g$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CodelessMatcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lt1/g$a;", "", "Lt1/g;", "a", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Landroid/os/Bundle;", "b", "", "CURRENT_CLASS_NAME", "Ljava/lang/String;", "PARENT_CLASS_NAME", "kotlin.jvm.PlatformType", "TAG", "codelessMatcher", "Lt1/g;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final synchronized g a() {
            g gVarB;
            if (g.b() == null) {
                g.d(new g(null));
            }
            gVarB = g.b();
            if (gVarB == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return gVarB;
        }

        @UiThread
        public final Bundle b(EventBinding mapping, View rootView, View hostView) {
            List<u1.a> listC;
            List<b> listA;
            p.j(rootView, "rootView");
            p.j(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (mapping != null && (listC = mapping.c()) != null) {
                for (u1.a aVar : listC) {
                    if (aVar.getValue() != null) {
                        if (aVar.getValue().length() > 0) {
                            bundle.putString(aVar.getName(), aVar.getValue());
                        }
                    }
                    if (aVar.b().size() > 0) {
                        if (p.e(aVar.getPathType(), "relative")) {
                            c.Companion companion = c.INSTANCE;
                            List<PathComponent> listB = aVar.b();
                            String simpleName = hostView.getClass().getSimpleName();
                            p.i(simpleName, "hostView.javaClass.simpleName");
                            listA = companion.a(mapping, hostView, listB, 0, -1, simpleName);
                        } else {
                            c.Companion companion2 = c.INSTANCE;
                            List<PathComponent> listB2 = aVar.b();
                            String simpleName2 = rootView.getClass().getSimpleName();
                            p.i(simpleName2, "rootView.javaClass.simpleName");
                            listA = companion2.a(mapping, rootView, listB2, 0, -1, simpleName2);
                        }
                        for (b bVar : listA) {
                            if (bVar.a() != null) {
                                u1.d dVar = u1.d.f72518a;
                                String strK = u1.d.k(bVar.a());
                                if (strK.length() > 0) {
                                    bundle.putString(aVar.getName(), strK);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    /* JADX INFO: compiled from: CodelessMatcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lt1/g$b;", "", "Landroid/view/View;", "a", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "viewMapKey", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final WeakReference<View> view;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String viewMapKey;

        public b(View view, String str) {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            p.j(str, "viewMapKey");
            this.view = new WeakReference<>(view);
            this.viewMapKey = str;
        }

        public final View a() {
            WeakReference<View> weakReference = this.view;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getViewMapKey() {
            return this.viewMapKey;
        }
    }

    /* JADX INFO: compiled from: CodelessMatcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0010B9\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f\u0012\u0006\u0010#\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0002J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"¨\u0006&"}, d2 = {"Lt1/g$c;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Ljava/lang/Runnable;", "Lmj/r;", "run", "onGlobalLayout", "onScrollChanged", "g", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", InneractiveMediationDefs.GENDER_FEMALE, "Lt1/g$b;", "matchedView", "a", "c", "d", "e", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "", "Ljava/util/List;", "eventBindings", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "listenerSet", "Ljava/lang/String;", "activityName", "<init>", "(Landroid/view/View;Landroid/os/Handler;Ljava/util/HashSet;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @UiThread
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final WeakReference<View> rootView;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public List<EventBinding> eventBindings;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final Handler handler;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final HashSet<String> listenerSet;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final String activityName;

        /* JADX INFO: renamed from: t1.g$c$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CodelessMatcher.kt */
        @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¨\u0006\u0019"}, d2 = {"Lt1/g$c$a;", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "path", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "index", "", "mapKey", "Lt1/g$b;", "a", "targetView", "pathElement", "", "c", "Landroid/view/ViewGroup;", "viewGroup", "b", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final List<b> a(EventBinding mapping, View view, List<PathComponent> path, int level, int index, String mapKey) {
                List<View> listB;
                int size;
                List<View> listB2;
                int size2;
                p.j(path, "path");
                p.j(mapKey, "mapKey");
                String str = mapKey + '.' + index;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (level >= path.size()) {
                    arrayList.add(new b(view, str));
                } else {
                    PathComponent pathComponent = path.get(level);
                    if (p.e(pathComponent.getClassName(), "..")) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (size = (listB = b((ViewGroup) parent)).size()) > 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                arrayList.addAll(a(mapping, listB.get(i10), path, level + 1, i10, str));
                                if (i11 >= size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        return arrayList;
                    }
                    if (p.e(pathComponent.getClassName(), ".")) {
                        arrayList.add(new b(view, str));
                        return arrayList;
                    }
                    if (!c(view, pathComponent, index)) {
                        return arrayList;
                    }
                    if (level == path.size() - 1) {
                        arrayList.add(new b(view, str));
                    }
                }
                if ((view instanceof ViewGroup) && (size2 = (listB2 = b((ViewGroup) view)).size()) > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        arrayList.addAll(a(mapping, listB2.get(i12), path, level + 1, i12, str));
                        if (i13 >= size2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
                return arrayList;
            }

            public final List<View> b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            p.i(childAt, "child");
                            arrayList.add(childAt);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
            
                if (ck.p.e(r9.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean c(android.view.View r9, com.facebook.appevents.codeless.internal.PathComponent r10, int r11) {
                /*
                    Method dump skipped, instruction units count: 321
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t1.g.c.Companion.c(android.view.View, com.facebook.appevents.codeless.internal.PathComponent, int):boolean");
            }
        }

        public c(View view, Handler handler, HashSet<String> hashSet, String str) {
            p.j(handler, "handler");
            p.j(hashSet, "listenerSet");
            p.j(str, "activityName");
            this.rootView = new WeakReference<>(view);
            this.handler = handler;
            this.listenerSet = hashSet;
            this.activityName = str;
            handler.postDelayed(this, 200L);
        }

        public final void a(b bVar, View view, EventBinding eventBinding) {
            if (eventBinding == null) {
                return;
            }
            try {
                View viewA = bVar.a();
                if (viewA == null) {
                    return;
                }
                View viewA2 = u1.d.a(viewA);
                if (viewA2 != null && u1.d.f72518a.p(viewA, viewA2)) {
                    e(bVar, view, eventBinding);
                    return;
                }
                String name = viewA.getClass().getName();
                p.i(name, "view.javaClass.name");
                if (x.R(name, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(viewA instanceof AdapterView)) {
                    c(bVar, view, eventBinding);
                } else if (viewA instanceof ListView) {
                    d(bVar, view, eventBinding);
                }
            } catch (Exception e10) {
                j0 j0Var = j0.f14425a;
                j0.d0(g.c(), e10);
            }
        }

        public final void f(EventBinding eventBinding, View view) {
            if (eventBinding == null || view == null) {
                return;
            }
            String activityName = eventBinding.getActivityName();
            if ((activityName == null || activityName.length() == 0) || p.e(eventBinding.getActivityName(), this.activityName)) {
                List<PathComponent> listD = eventBinding.d();
                if (listD.size() > 25) {
                    return;
                }
                Iterator<b> it = INSTANCE.a(eventBinding, view, listD, 0, -1, this.activityName).iterator();
                while (it.hasNext()) {
                    a(it.next(), view, eventBinding);
                }
            }
        }

        public final void g() {
            List<EventBinding> list = this.eventBindings;
            if (list == null || this.rootView.get() == null) {
                return;
            }
            int i10 = 0;
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                f(list.get(i10), this.rootView.get());
                if (i11 > size) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0027  */
        public final void c(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            View viewA = bVar.a();
            if (viewA == null) {
                return;
            }
            String viewMapKey = bVar.getViewMapKey();
            View.OnClickListener onClickListenerG = u1.d.g(viewA);
            if (onClickListenerG instanceof t1.b.a) {
                if (onClickListenerG != null) {
                    if (((t1.b.a) onClickListenerG).getSupportCodelessLogging()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
            } else {
                z10 = false;
            }
            if (!this.listenerSet.contains(viewMapKey) && !z10) {
                viewA.setOnClickListener(t1.b.b(eventBinding, view, viewA));
                this.listenerSet.add(viewMapKey);
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0029  */
        public final void d(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            String viewMapKey = bVar.getViewMapKey();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof t1.b.C0749b) {
                if (onItemClickListener != null) {
                    if (((t1.b.C0749b) onItemClickListener).getSupportCodelessLogging()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
            } else {
                z10 = false;
            }
            if (!this.listenerSet.contains(viewMapKey) && !z10) {
                adapterView.setOnItemClickListener(t1.b.c(eventBinding, view, adapterView));
                this.listenerSet.add(viewMapKey);
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0027  */
        public final void e(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            View viewA = bVar.a();
            if (viewA == null) {
                return;
            }
            String viewMapKey = bVar.getViewMapKey();
            View.OnTouchListener onTouchListenerH = u1.d.h(viewA);
            if (onTouchListenerH instanceof h.a) {
                if (onTouchListenerH != null) {
                    if (((h.a) onTouchListenerH).getSupportCodelessLogging()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
            } else {
                z10 = false;
            }
            if (!this.listenerSet.contains(viewMapKey) && !z10) {
                viewA.setOnTouchListener(h.a(eventBinding, view, viewA));
                this.listenerSet.add(viewMapKey);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            g();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            g();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (i2.a.d(this)) {
                return;
            }
            try {
                if (i2.a.d(this)) {
                    return;
                }
                try {
                    q qVarF = FetchedAppSettingsManager.f(t.m());
                    if (qVarF != null && qVarF.getCodelessEventsEnabled()) {
                        List<EventBinding> listB = EventBinding.INSTANCE.b(qVarF.getEventBindings());
                        this.eventBindings = listB;
                        if (listB == null || (view = this.rootView.get()) == null) {
                            return;
                        }
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        g();
                    }
                } catch (Throwable th2) {
                    i2.a.b(th2, this);
                }
            } catch (Throwable th3) {
                i2.a.b(th3, this);
            }
        }
    }

    public g() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        p.i(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.activitiesSet = setNewSetFromMap;
        this.viewMatchers = new LinkedHashSet();
        this.listenerSet = new HashSet<>();
        this.activityToListenerMap = new HashMap<>();
    }

    public /* synthetic */ g(ck.i iVar) {
        this();
    }

    public static final /* synthetic */ g b() {
        if (i2.a.d(g.class)) {
            return null;
        }
        try {
            return f72134h;
        } catch (Throwable th2) {
            i2.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (i2.a.d(g.class)) {
            return null;
        }
        try {
            return f72133g;
        } catch (Throwable th2) {
            i2.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (i2.a.d(g.class)) {
            return;
        }
        try {
            f72134h = gVar;
        } catch (Throwable th2) {
            i2.a.b(th2, g.class);
        }
    }

    public static final void j(g gVar) {
        if (i2.a.d(g.class)) {
            return;
        }
        try {
            p.j(gVar, "this$0");
            gVar.g();
        } catch (Throwable th2) {
            i2.a.b(th2, g.class);
        }
    }

    @UiThread
    public final void e(Activity activity) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (com.facebook.internal.x.b()) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.activitiesSet.add(activity);
                this.listenerSet.clear();
                HashSet<String> hashSet = this.activityToListenerMap.get(Integer.valueOf(activity.hashCode()));
                if (hashSet != null) {
                    this.listenerSet = hashSet;
                }
                i();
                return;
            }
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    @UiThread
    public final void f(Activity activity) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activityToListenerMap.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void g() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            for (Activity activity : this.activitiesSet) {
                if (activity != null) {
                    View viewE = y1.g.e(activity);
                    String simpleName = activity.getClass().getSimpleName();
                    Handler handler = this.uiThreadHandler;
                    HashSet<String> hashSet = this.listenerSet;
                    p.i(simpleName, "activityName");
                    this.viewMatchers.add(new c(viewE, handler, hashSet, simpleName));
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    @UiThread
    public final void h(Activity activity) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (com.facebook.internal.x.b()) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.activitiesSet.remove(activity);
                this.viewMatchers.clear();
                this.activityToListenerMap.put(Integer.valueOf(activity.hashCode()), (HashSet) this.listenerSet.clone());
                this.listenerSet.clear();
                return;
            }
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void i() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.uiThreadHandler.post(new Runnable() { // from class: t1.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.j(this.f72131b);
                    }
                });
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
