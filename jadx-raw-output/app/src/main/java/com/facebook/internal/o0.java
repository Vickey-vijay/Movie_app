package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.common.R$drawable;
import com.facebook.common.R$string;
import com.facebook.common.R$style;
import com.facebook.login.LoginTargetApp;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: WebDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 e2\u00020\u0001:\u0006f),.7=B\u0019\b\u0014\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b[\u0010\\B!\b\u0012\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010+\u001a\u00020\u001d\u0012\u0006\u0010]\u001a\u00020\u0002¢\u0006\u0004\b[\u0010^B?\b\u0012\u0012\u0006\u0010Z\u001a\u00020Y\u0012\b\u0010_\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010`\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010]\u001a\u00020\u0002\u0012\u0006\u0010b\u001a\u00020a\u0012\b\u0010c\u001a\u0004\u0018\u00010-¢\u0006\u0004\b[\u0010dJ(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0003J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0014J\b\u0010\u0014\u001a\u00020\tH\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0004J\u0012\u0010!\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0017J\u0006\u0010\"\u001a\u00020\tJ\u0012\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0004J\u0012\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010%H\u0004J\b\u0010(\u001a\u00020\tH\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u0010;\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010K\u001a\b\u0018\u00010HR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010P\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010MR$\u0010U\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010OR\u0018\u0010X\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006g"}, d2 = {"Lcom/facebook/internal/o0;", "Landroid/app/Dialog;", "", "screenSize", "", "density", "noPaddingSize", "maxPaddingSize", "q", "Lmj/r;", "o", VastAttributes.MARGIN, "C", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "dismiss", "onStart", "onStop", "onDetachedFromWindow", "onAttachedToWindow", "Landroid/view/WindowManager$LayoutParams;", "params", "onWindowAttributesChanged", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "expectedRedirectUrl", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "urlString", "w", VastAttributes.HORIZONTAL_POSITION, "values", "z", "", "error", VastAttributes.VERTICAL_POSITION, "cancel", "b", "Ljava/lang/String;", "url", "c", "Lcom/facebook/internal/o0$e;", "d", "Lcom/facebook/internal/o0$e;", "getOnCompleteListener", "()Lcom/facebook/internal/o0$e;", "B", "(Lcom/facebook/internal/o0$e;)V", "onCompleteListener", "Landroid/webkit/WebView;", "<set-?>", "e", "Landroid/webkit/WebView;", "r", "()Landroid/webkit/WebView;", "webView", "Landroid/app/ProgressDialog;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/app/ProgressDialog;", "spinner", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "crossImageView", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "contentFrameLayout", "Lcom/facebook/internal/o0$f;", "i", "Lcom/facebook/internal/o0$f;", "uploadTask", "j", "Z", "t", "()Z", "isListenerCalled", CampaignEx.JSON_KEY_AD_K, "isDetached", "l", "u", "isPageFinished", InneractiveMediationDefs.GENDER_MALE, "Landroid/view/WindowManager$LayoutParams;", "windowParams", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "theme", "(Landroid/content/Context;Ljava/lang/String;I)V", "action", "parameters", "Lcom/facebook/login/LoginTargetApp;", "targetApp", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/login/LoginTargetApp;Lcom/facebook/internal/o0$e;)V", "n", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class o0 extends Dialog {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f14448o = R$style.com_facebook_activity_theme;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile int f14449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static d f14450q;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String expectedRedirectUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public e onCompleteListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public WebView webView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ProgressDialog spinner;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ImageView crossImageView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public FrameLayout contentFrameLayout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public f uploadTask;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isListenerCalled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isDetached;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isPageFinished;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public WindowManager.LayoutParams windowParams;

    /* JADX INFO: compiled from: WebDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b%\u0010&B-\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b%\u0010'J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001d\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010#¨\u0006("}, d2 = {"Lcom/facebook/internal/o0$a;", "", "Lcom/facebook/internal/o0$e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "g", "Lcom/facebook/internal/o0;", "a", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "action", "Landroid/os/Bundle;", "parameters", "Lmj/r;", "b", "<set-?>", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "applicationId", "", "d", "I", InneractiveMediationDefs.GENDER_FEMALE, "()I", "theme", "e", "Lcom/facebook/internal/o0$e;", "()Lcom/facebook/internal/o0$e;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "Lcom/facebook/AccessToken;", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public String applicationId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public String action;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int theme;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public e listener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public Bundle parameters;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public AccessToken accessToken;

        public a(Context context, String str, Bundle bundle) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(str, "action");
            AccessToken.Companion companion = AccessToken.INSTANCE;
            this.accessToken = companion.e();
            if (!companion.g()) {
                String strF = j0.F(context);
                if (strF == null) {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.applicationId = strF;
            }
            b(context, str, bundle);
        }

        public o0 a() {
            AccessToken accessToken = this.accessToken;
            if (accessToken != null) {
                Bundle bundle = this.parameters;
                if (bundle != null) {
                    bundle.putString("app_id", accessToken == null ? null : accessToken.getApplicationId());
                }
                Bundle bundle2 = this.parameters;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.accessToken;
                    bundle2.putString("access_token", accessToken2 != null ? accessToken2.getToken() : null);
                }
            } else {
                Bundle bundle3 = this.parameters;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.applicationId);
                }
            }
            Companion companion = o0.INSTANCE;
            Context context = this.context;
            if (context != null) {
                return companion.c(context, this.action, this.parameters, this.theme, this.listener);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final void b(Context context, String str, Bundle bundle) {
            this.context = context;
            this.action = str;
            if (bundle != null) {
                this.parameters = bundle;
            } else {
                this.parameters = new Bundle();
            }
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Bundle getParameters() {
            return this.parameters;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getTheme() {
            return this.theme;
        }

        public final a g(e listener) {
            this.listener = listener;
            return this;
        }

        public final Context getContext() {
            return this.context;
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(str2, "action");
            this.applicationId = k0.l(str == null ? j0.F(context) : str, "applicationId");
            b(context, str2, bundle);
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.o0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WebDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0005J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J>\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\b\u0010\u0013\u001a\u00020\nH\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0016¨\u0006-"}, d2 = {"Lcom/facebook/internal/o0$b;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", "b", "", "action", "Landroid/os/Bundle;", "parameters", "", "theme", "Lcom/facebook/internal/o0$e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/internal/o0;", "c", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "d", "a", "e", "API_EC_DIALOG_CANCEL", "I", "BACKGROUND_GRAY", "DEFAULT_THEME", "", "DISABLE_SSL_CHECK_FOR_TESTING", "Z", "DISPLAY_TOUCH", "Ljava/lang/String;", "LOG_TAG", "MAX_PADDING_SCREEN_HEIGHT", "MAX_PADDING_SCREEN_WIDTH", "", "MIN_SCALE_FACTOR", "D", "NO_PADDING_SCREEN_HEIGHT", "NO_PADDING_SCREEN_WIDTH", "PLATFORM_DIALOG_PATH_REGEX", "Lcom/facebook/internal/o0$d;", "initCallback", "Lcom/facebook/internal/o0$d;", "webDialogTheme", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final void b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && o0.f14449p == 0) {
                    e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final o0 c(Context context, String action, Bundle parameters, int theme, e listener) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            o0.s(context);
            return new o0(context, action, parameters, theme, LoginTargetApp.FACEBOOK, listener, null);
        }

        public final o0 d(Context context, String action, Bundle parameters, int theme, LoginTargetApp targetApp, e listener) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(targetApp, "targetApp");
            o0.s(context);
            return new o0(context, action, parameters, theme, targetApp, listener, null);
        }

        public final void e(int i10) {
            if (i10 == 0) {
                i10 = o0.f14448o;
            }
            o0.f14449p = i10;
        }

        public final int a() {
            k0.m();
            return o0.f14449p;
        }
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J \u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0019"}, d2 = {"Lcom/facebook/internal/o0$c;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "url", "", "shouldOverrideUrlLoading", "", IronSourceConstants.EVENTS_ERROR_CODE, UnifiedMediationParams.KEY_DESCRIPTION, "failingUrl", "Lmj/r;", "onReceivedError", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "onPageFinished", "<init>", "(Lcom/facebook/internal/o0;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public final class c extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0 f14470a;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p11, "com.facebook");
            p10.startActivity(p11);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("com.facebook", view, url);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("com.facebook", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse("com.facebook", view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Logger.d("Facebook|SafeDK: Execution> Lcom/facebook/internal/o0$c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_o0$c_shouldOverrideUrlLoading_4a0802f8d93072593392e5b60146d919 = safedk_o0$c_shouldOverrideUrlLoading_4a0802f8d93072593392e5b60146d919(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.facebook", view, url, zSafedk_o0$c_shouldOverrideUrlLoading_4a0802f8d93072593392e5b60146d919);
            return zSafedk_o0$c_shouldOverrideUrlLoading_4a0802f8d93072593392e5b60146d919;
        }

        public c(o0 o0Var) {
            ck.p.j(o0Var, "this$0");
            this.f14470a = o0Var;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ck.p.j(str, "url");
            super.onPageFinished(webView, str);
            if (!this.f14470a.isDetached && (progressDialog = this.f14470a.spinner) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f14470a.contentFrameLayout;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webView2 = this.f14470a.getWebView();
            if (webView2 != null) {
                webView2.setVisibility(0);
            }
            ImageView imageView = this.f14470a.crossImageView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f14470a.isPageFinished = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ck.p.j(str, "url");
            j0 j0Var = j0.f14425a;
            j0.e0("FacebookSDK.WebDialog", ck.p.s("Webview loading URL: ", str));
            super.onPageStarted(webView, str, bitmap);
            if (this.f14470a.isDetached || (progressDialog = this.f14470a.spinner) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
            ck.p.j(str2, "failingUrl");
            super.onReceivedError(webView, i10, str, str2);
            this.f14470a.y(new FacebookDialogException(str, i10, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ck.p.j(sslErrorHandler, "handler");
            ck.p.j(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.f14470a.y(new FacebookDialogException(null, -11, null));
        }

        public boolean safedk_o0$c_shouldOverrideUrlLoading_4a0802f8d93072593392e5b60146d919(WebView p10, String p11) {
            int i10;
            ck.p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ck.p.j(p11, "url");
            j0 j0Var = j0.f14425a;
            j0.e0("FacebookSDK.WebDialog", ck.p.s("Redirect URL: ", p11));
            Uri uri = Uri.parse(p11);
            boolean z10 = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
            if (!lk.x.R(p11, this.f14470a.expectedRedirectUrl, false, 2, null)) {
                if (lk.x.R(p11, "fbconnect://cancel", false, 2, null)) {
                    this.f14470a.cancel();
                    return true;
                }
                if (z10 || lk.a0.X(p11, "touch", false, 2, null)) {
                    return false;
                }
                try {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f14470a.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(p11)));
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
            Bundle bundleW = this.f14470a.w(p11);
            String p12 = bundleW.getString("error");
            if (p12 == null) {
                p12 = bundleW.getString("error_type");
            }
            String string = bundleW.getString("error_msg");
            if (string == null) {
                string = bundleW.getString("error_message");
            }
            if (string == null) {
                string = bundleW.getString("error_description");
            }
            String string2 = bundleW.getString("error_code");
            if (string2 == null || j0.X(string2)) {
                i10 = -1;
            } else {
                try {
                    i10 = Integer.parseInt(string2);
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
            }
            if (j0.X(p12) && j0.X(string) && i10 == -1) {
                this.f14470a.z(bundleW);
            } else if ((p12 == null || !(ck.p.e(p12, "access_denied") || ck.p.e(p12, "OAuthAccessDeniedException"))) && i10 != 4201) {
                this.f14470a.y(new FacebookServiceException(new FacebookRequestError(i10, p12, string), string));
            } else {
                this.f14470a.cancel();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/o0$d;", "", "Landroid/webkit/WebView;", "webView", "Lmj/r;", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface d {
        void a(WebView webView);
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/facebook/internal/o0$e;", "", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "Lmj/r;", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface e {
        void a(Bundle bundle, FacebookException facebookException);
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0001B\u0019\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003\"\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\t2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R$\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00130\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/facebook/internal/o0$f;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "", "p0", "b", "([Ljava/lang/Void;)[Ljava/lang/String;", "results", "Lmj/r;", "d", "([Ljava/lang/String;)V", "a", "Ljava/lang/String;", "action", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "parameters", "Ljava/lang/Exception;", "Lkotlin/Exception;", "c", "[Ljava/lang/Exception;", com.safedk.android.analytics.reporters.b.f44680a, "<init>", "(Lcom/facebook/internal/o0;Ljava/lang/String;Landroid/os/Bundle;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public final class f extends AsyncTask<Void, Void, String[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String action;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Bundle parameters;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Exception[] exceptions;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o0 f14474d;

        public f(o0 o0Var, String str, Bundle bundle) {
            ck.p.j(o0Var, "this$0");
            ck.p.j(str, "action");
            ck.p.j(bundle, "parameters");
            this.f14474d = o0Var;
            this.action = str;
            this.parameters = bundle;
            this.exceptions = new Exception[0];
        }

        public static final void c(String[] strArr, int i10, f fVar, CountDownLatch countDownLatch, q1.z zVar) {
            ck.p.j(strArr, "$results");
            ck.p.j(fVar, "this$0");
            ck.p.j(countDownLatch, "$latch");
            ck.p.j(zVar, "response");
            try {
                FacebookRequestError error = zVar.getError();
                String str = "Error staging photo.";
                if (error != null) {
                    String strE = error.e();
                    if (strE != null) {
                        str = strE;
                    }
                    throw new FacebookGraphResponseException(zVar, str);
                }
                JSONObject graphObject = zVar.getGraphObject();
                if (graphObject == null) {
                    throw new FacebookException("Error staging photo.");
                }
                String strOptString = graphObject.optString(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
                if (strOptString == null) {
                    throw new FacebookException("Error staging photo.");
                }
                strArr[i10] = strOptString;
                countDownLatch.countDown();
            } catch (Exception e10) {
                fVar.exceptions[i10] = e10;
            }
        }

        public String[] b(Void... p10) {
            if (i2.a.d(this)) {
                return null;
            }
            try {
                if (i2.a.d(this)) {
                    return null;
                }
                try {
                    ck.p.j(p10, "p0");
                    String[] stringArray = this.parameters.getStringArray(C3426d4.i.I0);
                    if (stringArray == null) {
                        return null;
                    }
                    final String[] strArr = new String[stringArray.length];
                    this.exceptions = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    AccessToken accessTokenE = AccessToken.INSTANCE.e();
                    final int i10 = 0;
                    try {
                        int length = stringArray.length - 1;
                        if (length >= 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                if (isCancelled()) {
                                    Iterator it = concurrentLinkedQueue.iterator();
                                    while (it.hasNext()) {
                                        ((q1.x) it.next()).cancel(true);
                                    }
                                    return null;
                                }
                                Uri uri = Uri.parse(stringArray[i10]);
                                if (j0.Z(uri)) {
                                    strArr[i10] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    GraphRequest.b bVar = new GraphRequest.b() { // from class: com.facebook.internal.p0
                                        @Override // com.facebook.GraphRequest.b
                                        public final void b(q1.z zVar) {
                                            o0.f.c(strArr, i10, this, countDownLatch, zVar);
                                        }
                                    };
                                    o2.a aVar = o2.a.f64946a;
                                    ck.p.i(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
                                    concurrentLinkedQueue.add(o2.a.a(accessTokenE, uri, bVar).l());
                                }
                                if (i11 <= length) {
                                    i10 = i11;
                                }
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((q1.x) it2.next()).cancel(true);
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    i2.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                i2.a.b(th3, this);
                return null;
            }
        }

        public void d(String[] results) {
            if (i2.a.d(this)) {
                return;
            }
            try {
                if (!i2.a.d(this)) {
                    try {
                        ProgressDialog progressDialog = this.f14474d.spinner;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                        }
                        Exception[] excArr = this.exceptions;
                        int i10 = 0;
                        int length = excArr.length;
                        while (i10 < length) {
                            Exception exc = excArr[i10];
                            i10++;
                            if (exc != null) {
                                this.f14474d.y(exc);
                                return;
                            }
                        }
                        if (results == null) {
                            this.f14474d.y(new FacebookException("Failed to stage photos for web dialog"));
                            return;
                        }
                        List listF = nj.l.f(results);
                        if (listF.contains(null)) {
                            this.f14474d.y(new FacebookException("Failed to stage photos for web dialog"));
                            return;
                        }
                        j0 j0Var = j0.f14425a;
                        j0.k0(this.parameters, C3426d4.i.I0, new JSONArray((Collection) listF));
                        this.f14474d.url = j0.g(g0.b(), q1.t.w() + "/dialog/" + this.action, this.parameters).toString();
                        ImageView imageView = this.f14474d.crossImageView;
                        if (imageView != null) {
                            this.f14474d.C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    } catch (Throwable th2) {
                        i2.a.b(th2, this);
                    }
                }
            } catch (Throwable th3) {
                i2.a.b(th3, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (i2.a.d(this)) {
                return null;
            }
            try {
                if (i2.a.d(this)) {
                    return null;
                }
                try {
                    return b(voidArr);
                } catch (Throwable th2) {
                    i2.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                i2.a.b(th3, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (i2.a.d(this)) {
                return;
            }
            try {
                if (i2.a.d(this)) {
                    return;
                }
                try {
                    d(strArr);
                } catch (Throwable th2) {
                    i2.a.b(th2, this);
                }
            } catch (Throwable th3) {
                i2.a.b(th3, this);
            }
        }
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(Context context, String str) {
        this(context, str, INSTANCE.a());
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "url");
    }

    public /* synthetic */ o0(Context context, String str, Bundle bundle, int i10, LoginTargetApp loginTargetApp, e eVar, ck.i iVar) {
        this(context, str, bundle, i10, loginTargetApp, eVar);
    }

    public static final void s(Context context) {
        INSTANCE.b(context);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.isDetached = false;
        j0 j0Var = j0.f14425a;
        Context context = getContext();
        ck.p.i(context, GAMConfig.KEY_CONTEXT);
        if (j0.i0(context) && (layoutParams = this.windowParams) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.windowParams;
                j0.e0("FacebookSDK.WebDialog", ck.p.s("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.isDetached = true;
        super.onDetachedFromWindow();
    }

    public final int q(int screenSize, float density, int noPaddingSize, int maxPaddingSize) {
        int i10 = (int) (screenSize / density);
        double d10 = 0.5d;
        if (i10 <= noPaddingSize) {
            d10 = 1.0d;
        } else if (i10 < maxPaddingSize) {
            d10 = 0.5d + ((((double) (maxPaddingSize - i10)) / ((double) (maxPaddingSize - noPaddingSize))) * 0.5d);
        }
        return (int) (((double) screenSize) * d10);
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/facebook/internal/o0$h", "Landroid/webkit/WebView;", "", "hasWindowFocus", "Lmj/r;", "onWindowFocusChanged", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class h extends WebView {
        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent me2) {
            DetectTouchUtils.viewOnTouch("com.facebook", this, me2);
            return super.dispatchTouchEvent(me2);
        }

        @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }

        public h(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    public o0(Context context, String str, int i10) {
        super(context, i10 == 0 ? INSTANCE.a() : i10);
        this.expectedRedirectUrl = "fbconnect://success";
        this.url = str;
    }

    public static final void p(o0 o0Var, View view) {
        ck.p.j(o0Var, "this$0");
        o0Var.cancel();
    }

    public static final void v(o0 o0Var, DialogInterface dialogInterface) {
        ck.p.j(o0Var, "this$0");
        o0Var.cancel();
    }

    public final void A(String str) {
        ck.p.j(str, "expectedRedirectUrl");
        this.expectedRedirectUrl = str;
    }

    public final void B(e eVar) {
        this.onCompleteListener = eVar;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void C(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.webView = new h(getContext());
        d dVar = f14450q;
        if (dVar != null) {
            dVar.a(getWebView());
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.webView;
        if (webView3 != null) {
            webView3.setWebViewClient(new c(this));
        }
        WebView webView4 = this.webView;
        WebSettings settings = webView4 == null ? null : webView4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.webView;
        if (webView5 != null) {
            String str = this.url;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView5.loadUrl(str);
        }
        WebView webView6 = this.webView;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.webView;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.webView;
        WebSettings settings2 = webView8 == null ? null : webView8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.webView;
        WebSettings settings3 = webView9 != null ? webView9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView10 = this.webView;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.webView;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.webView;
        if (webView12 != null) {
            webView12.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.m0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return o0.D(view, motionEvent);
                }
            });
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.webView);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        y(new FacebookOperationCanceledException());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.isDetached && (progressDialog = this.spinner) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void o() {
        ImageView imageView = new ImageView(getContext());
        this.crossImageView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.p(this.f14445b, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(R$drawable.com_facebook_close);
        ImageView imageView2 = this.crossImageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.crossImageView;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        ck.p.j(event, "event");
        if (keyCode == 4) {
            WebView webView = this.webView;
            if (webView != null) {
                if (ck.p.e(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.webView;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Dialog
    public void onStop() {
        f fVar = this.uploadTask;
        if (fVar != null) {
            fVar.cancel(true);
            ProgressDialog progressDialog = this.spinner;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        ck.p.j(layoutParams, "params");
        if (layoutParams.token == null) {
            this.windowParams = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsListenerCalled() {
        return this.isListenerCalled;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsPageFinished() {
        return this.isPageFinished;
    }

    public final void y(Throwable th2) {
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        FacebookException facebookException = th2 instanceof FacebookException ? (FacebookException) th2 : new FacebookException(th2);
        e eVar = this.onCompleteListener;
        if (eVar != null) {
            eVar.a(null, facebookException);
        }
        dismiss();
    }

    public final void z(Bundle bundle) {
        e eVar = this.onCompleteListener;
        if (eVar == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        if (eVar != null) {
            eVar.a(bundle, null);
        }
        dismiss();
    }

    public static final boolean D(View view, MotionEvent motionEvent) {
        if (!view.hasFocus()) {
            view.requestFocus();
            return false;
        }
        return false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.spinner = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.spinner;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R$string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.spinner;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.spinner;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.l0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    o0.v(this.f14438b, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.contentFrameLayout = new FrameLayout(getContext());
        x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        o();
        if (this.url != null) {
            ImageView imageView = this.crossImageView;
            if (imageView != null) {
                C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.contentFrameLayout;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.app.Dialog
    public void onStart() {
        AsyncTask.Status status;
        super.onStart();
        f fVar = this.uploadTask;
        if (fVar != null) {
            if (fVar == null) {
                status = null;
            } else {
                status = fVar.getStatus();
            }
            if (status == AsyncTask.Status.PENDING) {
                f fVar2 = this.uploadTask;
                if (fVar2 != null) {
                    fVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.spinner;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        x();
    }

    @VisibleForTesting(otherwise = 4)
    public Bundle w(String urlString) {
        Uri uri = Uri.parse(urlString);
        j0 j0Var = j0.f14425a;
        Bundle bundleJ0 = j0.j0(uri.getQuery());
        bundleJ0.putAll(j0.j0(uri.getFragment()));
        return bundleJ0;
    }

    public final void x() {
        int i10;
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i11 = displayMetrics.widthPixels;
            int i12 = displayMetrics.heightPixels;
            if (i11 < i12) {
                i10 = i11;
            } else {
                i10 = i12;
            }
            if (i11 < i12) {
                i11 = i12;
            }
            int iMin = Math.min(q(i10, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
            int iMin2 = Math.min(q(i11, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
            Window window = getWindow();
            if (window != null) {
                window.setLayout(iMin, iMin2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public o0(Context context, String str, Bundle bundle, int i10, LoginTargetApp loginTargetApp, e eVar) {
        Uri uriG;
        super(context, i10 == 0 ? INSTANCE.a() : i10);
        this.expectedRedirectUrl = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = j0.R(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.expectedRedirectUrl = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", q1.t.m());
        ck.w wVar = ck.w.f6066a;
        String str3 = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{q1.t.B()}, 1));
        ck.p.i(str3, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", str3);
        this.onCompleteListener = eVar;
        if (ck.p.e(str, AppLovinEventTypes.USER_SHARED_LINK) && bundle.containsKey(C3426d4.i.I0)) {
            this.uploadTask = new f(this, str, bundle);
            return;
        }
        if (g.$EnumSwitchMapping$0[loginTargetApp.ordinal()] == 1) {
            uriG = j0.g(g0.k(), "oauth/authorize", bundle);
        } else {
            uriG = j0.g(g0.b(), q1.t.w() + "/dialog/" + ((Object) str), bundle);
        }
        this.url = uriG.toString();
    }
}
