package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.content.ContextCompat;
import com.inmobi.ads.R;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class R2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P2 f23422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ya f23423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2823e5 f23425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f23426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2849f5 f23427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f23429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f23430j;

    public final void a(Uri uri) {
        CustomTabsIntent.Builder builder;
        CustomTabsSession customTabsSessionNewSession;
        P2 p10 = this.f23422b;
        if (p10 != null) {
            try {
                builder = a(p10);
            } catch (Error e10) {
                e10.getMessage();
                C2823e5 c2823e5 = this.f23425e;
                CustomTabsSession customTabsSession = c2823e5.f24295d;
                if (customTabsSession == null) {
                    CustomTabsClient customTabsClient = c2823e5.f24292a;
                    customTabsSessionNewSession = customTabsClient != null ? customTabsClient.newSession(new C2798d5(c2823e5)) : null;
                    c2823e5.f24295d = customTabsSessionNewSession;
                    customTabsSession = customTabsSessionNewSession;
                }
                builder = new CustomTabsIntent.Builder(customTabsSession);
                builder.setUrlBarHidingEnabled(true);
            }
        } else {
            C2823e5 c2823e6 = this.f23425e;
            CustomTabsSession customTabsSession2 = c2823e6.f24295d;
            if (customTabsSession2 == null) {
                CustomTabsClient customTabsClient2 = c2823e6.f24292a;
                customTabsSessionNewSession = customTabsClient2 != null ? customTabsClient2.newSession(new C2798d5(c2823e6)) : null;
                c2823e6.f24295d = customTabsSessionNewSession;
                customTabsSession2 = customTabsSessionNewSession;
            }
            builder = new CustomTabsIntent.Builder(customTabsSession2);
            builder.setUrlBarHidingEnabled(true);
        }
        Context context = this.f23426f;
        CustomTabsIntent customTabsIntentBuild = builder.build();
        ck.p.i(customTabsIntentBuild, "build(...)");
        Rh rh2 = (Rh) this.f23429i.get();
        Ya ya2 = this.f23423c;
        Object obj = this.f23430j.get();
        ck.p.g(obj);
        AbstractC2746b5.a(context, customTabsIntentBuild, uri, rh2, ya2, (InterfaceC3061nh) obj, this.f23424d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    public R2(String str, P2 p10, Context context, Rh rh2, InterfaceC3061nh interfaceC3061nh, Ya ya2, String str2) {
        ck.p.j(str, "urlToLoad");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(interfaceC3061nh, "redirectionValidator");
        ck.p.j(str2, "api");
        this.f23421a = str;
        this.f23422b = p10;
        this.f23423c = ya2;
        this.f23424d = str2;
        C2823e5 c2823e5 = new C2823e5();
        this.f23425e = c2823e5;
        this.f23427g = new C2849f5(rh2, ya2);
        this.f23429i = new WeakReference(rh2);
        this.f23430j = new WeakReference(interfaceC3061nh);
        ck.p.j(this, "connectionCallback");
        c2823e5.f24294c = this;
        Context applicationContext = context.getApplicationContext();
        ck.p.i(applicationContext, "getApplicationContext(...)");
        this.f23426f = applicationContext;
        Ji.a(context, this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C2823e5 c2823e5 = this.f23425e;
        Context context = this.f23426f;
        c2823e5.getClass();
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        C2772c5 c2772c5 = c2823e5.f24293b;
        if (c2772c5 != null) {
            context.unbindService(c2772c5);
            c2823e5.f24292a = null;
        }
        c2823e5.f24293b = null;
        c2823e5.f24294c = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    public final CustomTabsIntent.Builder a(P2 p10) {
        Bitmap bitmap;
        C2823e5 c2823e5 = this.f23425e;
        CustomTabsSession customTabsSessionNewSession = c2823e5.f24295d;
        if (customTabsSessionNewSession == null) {
            CustomTabsClient customTabsClient = c2823e5.f24292a;
            customTabsSessionNewSession = customTabsClient != null ? customTabsClient.newSession(new C2798d5(c2823e5)) : null;
            c2823e5.f24295d = customTabsSessionNewSession;
        }
        CustomTabsIntent.Builder closeButtonPosition = new CustomTabsIntent.Builder(customTabsSessionNewSession).setCloseButtonPosition(2);
        ck.p.i(closeButtonPosition, "setCloseButtonPosition(...)");
        try {
            closeButtonPosition.setShareState(2);
            closeButtonPosition.setShowTitle(false);
            closeButtonPosition.setDownloadButtonEnabled(false);
            ck.p.g(closeButtonPosition.setBookmarksButtonEnabled(false));
        } catch (Error e10) {
            e10.getMessage();
        }
        if (p10.f23311b) {
            Context context = this.f23426f;
            int i10 = R.drawable.im_close_transparent;
            ck.p.j(context, "<this>");
            Drawable drawable = ContextCompat.getDrawable(context, i10);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                ck.p.i(bitmap, "getBitmap(...)");
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                ck.p.i(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = bitmapCreateBitmap;
            }
            closeButtonPosition.setCloseButtonIcon(bitmap);
        }
        L5 l5H = J5.h();
        Df dfA = Ef.a(J5.g());
        if (dfA != Df.LANDSCAPE && dfA != Df.REVERSE_LANDSCAPE) {
            closeButtonPosition.setInitialActivityHeightPx((int) (((int) (l5H.f23060b * p10.f23310a)) * l5H.f23061c), 2);
        } else {
            int i11 = (int) (l5H.f23059a * p10.f23310a);
            closeButtonPosition.setInitialActivityWidthPx((int) (i11 * l5H.f23061c));
            closeButtonPosition.setActivitySideSheetBreakpointDp(i11);
        }
        closeButtonPosition.setUrlBarHidingEnabled(true);
        return closeButtonPosition;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i10, int i11, int i12, int i13, int i14) throws JSONException {
        Rh rh2 = (Rh) this.f23429i.get();
        if (rh2 != null) {
            InterfaceC3028m9 interfaceC3028m9 = rh2.f23466a.f24162i;
            if (interfaceC3028m9 != null) {
                String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
                ck.p.i(str, "access$getTAG$cp(...)");
                ((C3053n9) interfaceC3028m9).a(str, "onCCTLayout");
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = rh2.f23466a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", "customTabLayout");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("left", F3.a(i10));
            jSONObject2.put("top", F3.a(i11));
            jSONObject2.put("right", F3.a(i12));
            jSONObject2.put("bottom", F3.a(i13));
            jSONObject2.put("state", i14);
            mj.r rVar = mj.r.f64562a;
            jSONObject.put("layout", jSONObject2);
            gestureDetectorOnGestureListenerC2785ci.b(jSONObject);
        }
    }
}
