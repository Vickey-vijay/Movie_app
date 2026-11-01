package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CampaignEx f32558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MBNativeAdvancedView f32559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.advanced.middle.d f32560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.mbridge.msdk.click.a f32561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.c f32562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32563g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f32565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f32567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MBridgeIds f32568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32569m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32557a = "NativeAdvancedShowManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32564h = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f32570n = new ViewOnClickListenerC0297a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f32571o = new b(Looper.getMainLooper());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.a f32572p = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class ViewOnClickListenerC0297a implements View.OnClickListener {
        public ViewOnClickListenerC0297a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f32563g) {
                a.this.a(1);
            }
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            CampaignEx campaignEx;
            MBNativeAdvancedView mBNativeAdvancedView;
            MBNativeAdvancedWebview advancedNativeWebview;
            super.handleMessage(message);
            if (message.what != 2 || (campaignEx = a.this.f32558b) == null || !campaignEx.isActiveOm() || (mBNativeAdvancedView = a.this.f32559c) == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null) {
                return;
            }
            try {
                AdSession adSession = advancedNativeWebview.getAdSession();
                if (adSession != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                    q0.a("OMSDK", "adSession.impressionOccurred()");
                }
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = a.this.f32558b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = a.this.f32558b.getRequestIdNotice();
                    String id2 = a.this.f32558b.getId();
                    new h(advancedNativeWebview.getContext()).a(requestId, requestIdNotice, id2, a.this.f32566j, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class c implements com.mbridge.msdk.advanced.middle.a {
        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(CampaignEx campaignEx) {
            a.this.a(campaignEx, false, "");
        }

        public c() {
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(int i10) {
            q0.b(a.this.f32557a, "resetCountdown" + i10);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void close() {
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void toggleCloseBtn(int i10) {
            a.this.f32564h = i10;
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f32559c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f32559c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.setVisibility(8);
            }
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10) {
            a aVar = a.this;
            if (aVar.f32560d != null) {
                aVar.f32569m = z10;
                if (z10) {
                    a aVar2 = a.this;
                    aVar2.f32560d.f(aVar2.f32568l);
                } else {
                    a aVar3 = a.this;
                    aVar3.f32560d.a(aVar3.f32568l);
                }
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10, String str) {
            try {
                if (a.this.f32560d != null) {
                    if (TextUtils.isEmpty(str)) {
                        a aVar = a.this;
                        aVar.f32560d.b(aVar.f32568l);
                        a aVar2 = a.this;
                        aVar2.f32560d.d(aVar2.f32568l);
                    } else {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(a.this.f32558b));
                        campaignWithBackData.setClickTempSource(2);
                        campaignWithBackData.setClickType(2);
                        campaignWithBackData.setTriggerClickSource(2);
                        campaignWithBackData.setClickURL(str);
                        a.this.a(campaignWithBackData, z10, str);
                    }
                }
            } catch (Exception e10) {
                q0.b(a.this.f32557a, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class d implements com.mbridge.msdk.foundation.feedback.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MBNativeAdvancedView f32576a;

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            a.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f32557a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f32576a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        public d(MBNativeAdvancedView mBNativeAdvancedView) {
            this.f32576a = mBNativeAdvancedView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f32557a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f32576a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f32557a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f32576a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MBNativeAdvancedView f32579b;

        public e(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView) {
            this.f32578a = campaignEx;
            this.f32579b = mBNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f32578a, this.f32579b, false);
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f32581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32582b;

        public f(Context context, CampaignEx campaignEx) {
            this.f32581a = context;
            this.f32582b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a(g.a(this.f32581a)).b(this.f32582b.getId());
            } catch (Exception unused) {
                q0.b(a.this.f32557a, "campain can't insert db");
            }
        }
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public String c() {
        CampaignEx campaignEx = this.f32558b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f32558b.getRequestId();
    }

    private void h() {
        if (this.f32558b.isReport()) {
            return;
        }
        a(this.f32558b);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32558b, this.f32566j);
        com.mbridge.msdk.advanced.middle.d dVar = this.f32560d;
        if (dVar != null) {
            dVar.e(this.f32568l);
        }
    }

    private void i() {
        CampaignEx campaignEx;
        MBNativeAdvancedView mBNativeAdvancedView = this.f32559c;
        if (mBNativeAdvancedView == null || (campaignEx = this.f32558b) == null) {
            return;
        }
        mBNativeAdvancedView.setAdChoiceCampaign(campaignEx);
    }

    public void e() {
        MBNativeAdvancedWebview advancedNativeWebview;
        MBNativeAdvancedView mBNativeAdvancedView = this.f32559c;
        if (mBNativeAdvancedView == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) advancedNativeWebview, "onViewDisappeared", "");
    }

    public void f() {
        MBNativeAdvancedWebview advancedNativeWebview;
        if (this.f32559c == null || com.mbridge.msdk.foundation.feedback.b.f34851f || (advancedNativeWebview = this.f32559c.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.advanced.signal.a.a(advancedNativeWebview, "onViewAppeared", "");
    }

    public void g() {
        if (this.f32560d != null) {
            this.f32560d = null;
        }
        if (this.f32572p != null) {
            this.f32572p = null;
        }
        if (this.f32570n != null) {
            this.f32570n = null;
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f32559c;
        if (mBNativeAdvancedView != null) {
            MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
            this.f32559c.destroy();
        }
        if (this.f32562f != null) {
            this.f32562f = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f32566j);
    }

    public a(Context context, String str, String str2) {
        this.f32566j = str2;
        this.f32567k = str;
        this.f32568l = new MBridgeIds(str, str2);
        if (this.f32565i == null) {
            ImageView imageView = new ImageView(context);
            this.f32565i = imageView;
            imageView.setPadding(v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f));
            d();
        }
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, it.next(), false, true);
                }
            } catch (Throwable th2) {
                q0.b(this.f32557a, th2.getMessage());
            }
        }
    }

    private void d() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f32565i.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f32565i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(v0.a(contextD, 29.0f), v0.a(contextD, 16.0f));
        }
        this.f32565i.setLayoutParams(layoutParams);
        this.f32565i.setImageResource(contextD.getResources().getIdentifier("mbridge_native_advanced_close_icon", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
    }

    public com.mbridge.msdk.advanced.middle.a b() {
        return this.f32572p;
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f32917n);
            } catch (Throwable th2) {
                q0.b(this.f32557a, th2.getMessage());
            }
        }
    }

    public void a(com.mbridge.msdk.advanced.middle.c cVar) {
        this.f32562f = cVar;
    }

    public void a(com.mbridge.msdk.advanced.middle.d dVar) {
        this.f32560d = dVar;
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f32558b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public void a(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, boolean z10) {
        MBNativeAdvancedWebview advancedNativeWebview;
        View viewA;
        if (mBNativeAdvancedView == null) {
            return;
        }
        this.f32558b = campaignEx;
        this.f32559c = mBNativeAdvancedView;
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f32566j, new d(mBNativeAdvancedView));
        if (campaignEx.isMraid() && com.mbridge.msdk.foundation.feedback.b.b().a() && (viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f32566j)) != null) {
            RelativeLayout.LayoutParams layoutParams = null;
            try {
                layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f34850e, com.mbridge.msdk.foundation.feedback.b.f34849d);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewA);
            }
            mBNativeAdvancedView.addView(viewA, layoutParams);
        }
        a(this.f32563g);
        com.mbridge.msdk.advanced.signal.b advancedNativeSignalCommunicationImpl = mBNativeAdvancedView.getAdvancedNativeSignalCommunicationImpl();
        campaignEx.setLocalRequestId(campaignEx.getCurrentLocalRid());
        List<CampaignEx> arrayList = new ArrayList<>();
        arrayList.add(campaignEx);
        if (advancedNativeSignalCommunicationImpl == null) {
            advancedNativeSignalCommunicationImpl = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), this.f32567k, this.f32566j);
            advancedNativeSignalCommunicationImpl.a(arrayList);
        }
        advancedNativeSignalCommunicationImpl.a(this.f32563g ? 1 : 0);
        advancedNativeSignalCommunicationImpl.a(this.f32572p);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(advancedNativeSignalCommunicationImpl);
        b1.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (campaignEx.isHasMBTplMark() || !this.f32563g) {
            this.f32565i.setVisibility(8);
        }
        a(this.f32565i);
        mBNativeAdvancedView.setCloseView(this.f32565i);
        if (mBNativeAdvancedView.getVisibility() != 0) {
            mBNativeAdvancedView.setVisibility(0);
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getImpReportType());
        if (this.f32562f == null || !lVarA.a() || this.f32562f.d() == null || this.f32562f.d().getAlpha() < 0.5f || this.f32562f.d().getVisibility() != 0 || this.f32569m) {
            if (z10) {
                mBNativeAdvancedView.postDelayed(new e(campaignEx, mBNativeAdvancedView), 200L);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        mBNativeAdvancedView.show();
        com.mbridge.msdk.foundation.controller.c.n().a(mBNativeAdvancedView.getContext());
        campaignEx.setCampaignUnitId(this.f32566j);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f32566j, campaignEx);
        CampaignEx campaignEx2 = this.f32558b;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), advancedNativeWebview, advancedNativeWebview.getUrl(), this.f32558b);
                if (adSessionA != null) {
                    advancedNativeWebview.setAdSession(adSessionA);
                    adSessionA.registerAdView(advancedNativeWebview);
                    adSessionA.start();
                    q0.a("OMSDK", "adSession.start()");
                }
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx3 = this.f32558b;
                if (campaignEx3 != null) {
                    String requestId = campaignEx3.getRequestId();
                    String requestIdNotice = this.f32558b.getRequestIdNotice();
                    String id2 = this.f32558b.getId();
                    new h(com.mbridge.msdk.foundation.controller.c.n().d()).a(requestId, requestIdNotice, id2, this.f32566j, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        h();
        if (campaignEx.isMraid()) {
            i();
        }
        int i10 = this.f32564h;
        if (i10 != -1) {
            mBNativeAdvancedView.changeCloseBtnState(i10);
        }
        com.mbridge.msdk.advanced.manager.d.b(this.f32566j);
        com.mbridge.msdk.advanced.common.c.b(this.f32567k + this.f32566j + campaignEx.getRequestId());
        this.f32571o.sendEmptyMessageDelayed(2, 1000L);
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32558b.getMaitve(), this.f32558b.getMaitve_src());
    }

    private void a(CampaignEx campaignEx) {
        boolean z10 = true;
        if (campaignEx.isHasMBTplMark()) {
            z10 = false;
        } else {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f32566j);
            campaignEx.setReport(true);
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f32566j, campaignEx, "h5_native");
        }
        if (z10) {
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f32566j);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f32566j);
        }
    }

    public void a(boolean z10) {
        this.f32563g = z10;
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f32570n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        com.mbridge.msdk.advanced.middle.d dVar = this.f32560d;
        if (dVar != null) {
            dVar.c(this.f32568l);
            this.f32560d = null;
            com.mbridge.msdk.advanced.report.a.a(this.f32566j, this.f32558b);
        }
        com.mbridge.msdk.advanced.report.a.a(this.f32566j, i10, this.f32558b);
        MBNativeAdvancedView mBNativeAdvancedView = this.f32559c;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.setVisibility(8);
            e();
            MBNativeAdvancedWebview advancedNativeWebview = this.f32559c.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
        }
        Handler handler = this.f32571o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new f(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f32916m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}
