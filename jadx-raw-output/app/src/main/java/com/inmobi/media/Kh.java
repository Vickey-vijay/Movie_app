package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.inmobi.media.Kh;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes7.dex */
public class Kh extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23018a;

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.confirm();
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.confirm();
    }

    public Kh(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        this.f23018a = gestureDetectorOnGestureListenerC2785ci;
    }

    public static final void a(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i10) {
        callback.invoke(str, true, false);
    }

    public static final void b(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i10) {
        callback.invoke(str, false, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        ck.p.j(consoleMessage, "cm");
        String str = consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId();
        InterfaceC3028m9 interfaceC3028m9 = this.f23018a.f24162i;
        if (interfaceC3028m9 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
        ck.p.i(str2, "access$getTAG$cp(...)");
        ((C3053n9) interfaceC3028m9).c(str2, "Console message:" + str);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        ck.p.j(str, "origin");
        ck.p.j(callback, "callback");
        if (this.f23018a.f24186u.get() != null) {
            new AlertDialog.Builder((Context) this.f23018a.f24186u.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: b7.l2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.a(callback, str, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: b7.m2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.b(callback, str, dialogInterface, i10);
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(str, "url");
        ck.p.j(str2, "message");
        ck.p.j(jsResult, "result");
        InterfaceC3028m9 interfaceC3028m9 = this.f23018a.f24162i;
        if (interfaceC3028m9 != null) {
            String str3 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str3, "access$getTAG$cp(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "jsAlert called with: " + str2 + str);
        }
        if (!this.f23018a.a(jsResult)) {
            return true;
        }
        Activity fullScreenActivity = this.f23018a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setTitle(str).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: b7.k2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.a(jsResult, dialogInterface, i10);
                }
            }).setCancelable(false).create().show();
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(str, "url");
        ck.p.j(str2, "message");
        ck.p.j(jsResult, "result");
        InterfaceC3028m9 interfaceC3028m9 = this.f23018a.f24162i;
        if (interfaceC3028m9 != null) {
            String str3 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str3, "access$getTAG$cp(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "jsConfirm called with: " + str2 + str);
        }
        if (!this.f23018a.a(jsResult)) {
            return true;
        }
        if (this.f23018a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.f23018a.getFullScreenActivity()).setMessage(str2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: b7.i2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.b(jsResult, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: b7.j2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.c(jsResult, dialogInterface, i10);
                }
            }).create().show();
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(str, "url");
        ck.p.j(str2, "message");
        ck.p.j(str3, "defaultValue");
        ck.p.j(jsPromptResult, "result");
        InterfaceC3028m9 interfaceC3028m9 = this.f23018a.f24162i;
        if (interfaceC3028m9 != null) {
            String str4 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str4, "access$getTAG$cp(...)");
            ((C3053n9) interfaceC3028m9).a(str4, "jsPrompt called with: " + str2 + str);
        }
        if (!this.f23018a.a(jsPromptResult)) {
            return true;
        }
        if (this.f23018a.getFullScreenActivity() != null) {
            return false;
        }
        jsPromptResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23018a.f24162i;
        if (interfaceC3028m9 != null) {
            String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str, "access$getTAG$cp(...)");
            ((C3053n9) interfaceC3028m9).c(str, "webview progress changed - " + i10);
        }
        super.onProgressChanged(webView, i10);
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            ck.p.i(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
        return defaultVideoPoster;
    }
}
