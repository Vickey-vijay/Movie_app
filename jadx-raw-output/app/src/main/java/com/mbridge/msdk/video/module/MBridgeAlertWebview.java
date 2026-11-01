package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.listener.b;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.videocommon.download.d;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {
    private String P;

    public class a extends b {
        public a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            String str;
            super.a(webView, i10);
            q0.b("MBridgeAlertWebview", "readyState  :  " + i10);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            if (!mBridgeAlertWebview.f38886u) {
                boolean z10 = true;
                if (i10 != 1) {
                    z10 = false;
                }
                mBridgeAlertWebview.f38885t = z10;
                if (z10) {
                    str = "readyState state is " + i10;
                } else {
                    str = "";
                }
                String str2 = str;
                MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
                j.a(mBridgeAlertWebview2.f38830a, mBridgeAlertWebview2.f38831b, mBridgeAlertWebview2.P, MBridgeAlertWebview.this.unitId, i10, str2, 1);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("MBridgeAlertWebview", "finish+" + str);
            f.a().a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("MBridgeAlertWebview", "onReceivedError");
            if (!MBridgeAlertWebview.this.f38886u) {
                q0.a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
                MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                j.a(mBridgeAlertWebview.f38830a, mBridgeAlertWebview.f38831b, mBridgeAlertWebview.P, MBridgeAlertWebview.this.unitId, 2, str, 1);
                MBridgeAlertWebview.this.f38886u = true;
            }
        }
    }

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public RelativeLayout.LayoutParams getContentLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public String getURL() {
        if (TextUtils.isEmpty(this.unitId)) {
            return "";
        }
        String strC = com.mbridge.msdk.videocommon.setting.b.b().a(c.n().b(), this.unitId, false).c();
        this.P = strC;
        return !TextUtils.isEmpty(strC) ? d.a().a(this.P) : "";
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f38879n;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        j.a(this.f38830a, this.f38831b, this.P, this.unitId, 2, 1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (this.f38834e && this.f38831b != null && !TextUtils.isEmpty(url)) {
            com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f38831b);
            aVar.a(this.f38831b.getAppName());
            this.f38881p.setDownloadListener(aVar);
            this.f38881p.setCampaignId(this.f38831b.getId());
            setCloseVisible(8);
            this.f38881p.setApiManagerJSFactory(bVar);
            this.f38881p.setWebViewListener(new a());
            setHtmlSource(com.mbridge.msdk.videocommon.download.f.a().a(url));
            this.f38885t = false;
            if (TextUtils.isEmpty(this.f38884s)) {
                q0.a(MBridgeBaseView.TAG, "load url:" + url);
                MintegralNetworkBridge.webviewLoadUrl(this.f38881p, url);
            } else {
                q0.a(MBridgeBaseView.TAG, "load html...");
                MintegralNetworkBridge.webviewLoadDataWithBaseURL(this.f38881p, url, this.f38884s, "text/html", "UTF-8", null);
            }
            this.f38881p.setBackgroundColor(0);
            setBackgroundColor(0);
            return;
        }
        this.notifyListener.a(101, "");
    }
}
