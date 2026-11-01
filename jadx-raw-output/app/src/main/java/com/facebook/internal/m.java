package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.safedk.android.internal.SafeDKWebAppInterface;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FacebookWebFallbackDialog.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B!\b\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/m;", "Lcom/facebook/internal/o0;", "", "url", "Landroid/os/Bundle;", "w", "Lmj/r;", "cancel", "", "r", "Z", "waitingForDialogToClose", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "expectedRedirectUrl", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "s", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class m extends o0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f14440t = m.class.getName();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean waitingForDialogToClose;

    /* JADX INFO: renamed from: com.facebook.internal.m$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FacebookWebFallbackDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\n \f*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/m$a;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "url", "expectedRedirectUrl", "Lcom/facebook/internal/m;", "a", "", "OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS", "I", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final m a(Context context, String url, String expectedRedirectUrl) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(url, "url");
            ck.p.j(expectedRedirectUrl, "expectedRedirectUrl");
            o0.s(context);
            return new m(context, url, expectedRedirectUrl, null);
        }
    }

    public m(Context context, String str, String str2) {
        super(context, str);
        A(str2);
    }

    public /* synthetic */ m(Context context, String str, String str2, ck.i iVar) {
        this(context, str, str2);
    }

    public static final void F(m mVar) {
        ck.p.j(mVar, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.o0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webView = getWebView();
        if (getIsPageFinished() && !getIsListenerCalled() && webView != null && webView.isShown()) {
            if (this.waitingForDialogToClose) {
                return;
            }
            this.waitingForDialogToClose = true;
            webView.loadUrl(ck.p.s(SafeDKWebAppInterface.f44738f, "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.F(this.f14437b);
                }
            }, 1500L);
            return;
        }
        super.cancel();
    }

    @Override // com.facebook.internal.o0
    public Bundle w(String url) {
        Uri uri = Uri.parse(url);
        j0 j0Var = j0.f14425a;
        Bundle bundleJ0 = j0.j0(uri.getQuery());
        String string = bundleJ0.getString("bridge_args");
        bundleJ0.remove("bridge_args");
        if (!j0.X(string)) {
            try {
                bundleJ0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.a(new JSONObject(string)));
            } catch (JSONException e10) {
                j0 j0Var2 = j0.f14425a;
                j0.f0(f14440t, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = bundleJ0.getString("method_results");
        bundleJ0.remove("method_results");
        if (!j0.X(string2)) {
            try {
                bundleJ0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.a(new JSONObject(string2)));
            } catch (JSONException e11) {
                j0 j0Var3 = j0.f14425a;
                j0.f0(f14440t, "Unable to parse bridge_args JSON", e11);
            }
        }
        bundleJ0.remove("version");
        bundleJ0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", d0.u());
        return bundleJ0;
    }
}
