package sa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.ui.mine.share.ExtensionShareActivity;
import com.pp.hls;
import com.safedk.android.utils.Logger;
import com.wangxiong.sdk.view.RewardVideoLoader;

/* JADX INFO: compiled from: PopUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class a0 {

    /* JADX INFO: compiled from: PopUtil.java */
    public class a implements ta.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ gb.d f67053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Handler f67054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ta.h f67055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f67056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f67057h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f67058i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f67059j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int[] f67060k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Activity f67061l;

        /* JADX INFO: renamed from: sa.a0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PopUtil.java */
        public class RunnableC0639a implements Runnable {
            public RunnableC0639a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                tl.a.a().b(new x9.e(a.this.f67056g, false));
                a aVar = a.this;
                if (aVar.f67060k[0] == 1) {
                    aVar.f67061l.setRequestedOrientation(0);
                    a.this.f67061l.getWindow().getDecorView().setSystemUiVisibility(0);
                }
            }
        }

        public a(boolean[] zArr, boolean[] zArr2, boolean[] zArr3, gb.d dVar, Handler handler, ta.h hVar, boolean z10, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11, int[] iArr, Activity activity) {
            this.f67050a = zArr;
            this.f67051b = zArr2;
            this.f67052c = zArr3;
            this.f67053d = dVar;
            this.f67054e = handler;
            this.f67055f = hVar;
            this.f67056g = z10;
            this.f67057h = adInfoDetailEntry;
            this.f67058i = i10;
            this.f67059j = i11;
            this.f67060k = iArr;
            this.f67061l = activity;
        }

        @Override // ta.i
        public void a(String str, String str2) {
            if (this.f67051b[0]) {
                this.f67053d.f53324d.stop();
                this.f67053d.dismiss();
            }
            this.f67054e.removeCallbacksAndMessages(null);
            ta.h hVar = this.f67055f;
            if (hVar != null) {
                hVar.a();
            }
            this.f67061l.runOnUiThread(new RunnableC0639a());
            if (this.f67056g) {
                sa.c.c(1, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 13, this.f67057h.getAd_id(), 0, this.f67058i, this.f67059j);
            } else {
                sa.c.c(1, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 4, this.f67057h.getAd_id(), 0, this.f67058i, this.f67059j);
            }
            sa.c.b("adposition:4 Ad_source_id:" + this.f67057h.getAd_source_id() + " +s:" + str + " s1:" + str2);
        }

        @Override // ta.i
        public void b() {
            if (this.f67056g) {
                sa.c.c(3, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 13, this.f67057h.getAd_id(), 1, this.f67058i, this.f67059j);
            } else {
                sa.c.c(3, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 4, this.f67057h.getAd_id(), 1, this.f67058i, this.f67059j);
            }
        }

        @Override // ta.i
        public void d() {
            this.f67050a[0] = true;
            if (this.f67051b[0] && !this.f67052c[0]) {
                AnimationDrawable animationDrawable = this.f67053d.f53324d;
                if (animationDrawable != null) {
                    animationDrawable.stop();
                }
                this.f67053d.dismiss();
                this.f67054e.removeCallbacksAndMessages(null);
                ta.h hVar = this.f67055f;
                if (hVar != null) {
                    hVar.f72318b.showAd();
                }
            }
            if (this.f67056g) {
                sa.c.c(4, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 13, this.f67057h.getAd_id(), 1, this.f67058i, this.f67059j);
            } else {
                sa.c.c(4, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 4, this.f67057h.getAd_id(), 1, this.f67058i, this.f67059j);
            }
            Log.e("wangyi", "激励视频广告收到数据");
        }

        @Override // ta.i
        public void onAdShow() {
            if (this.f67056g) {
                sa.c.c(2, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 13, this.f67057h.getAd_id(), 1, this.f67058i, this.f67059j);
            } else {
                sa.c.c(2, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 4, this.f67057h.getAd_id(), 1, this.f67058i, this.f67059j);
            }
            Log.e("wangyi", "激励视频广告展示");
        }

        @Override // ta.i
        public void c() {
            Log.e("wangyi", "激励视频广告关闭");
            o0.Q0(o0.H() + 1);
            tl.a.a().b(new x9.e(this.f67056g, true));
            tl.a.a().b(new x9.c());
            o0.D0(1);
            o0.i1(0L);
            if (this.f67060k[0] == 1) {
                this.f67061l.setRequestedOrientation(0);
                this.f67061l.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            if (this.f67056g) {
                AdNumShowDao.getInstance().updatePlayCenterTdNum(AdNumShowDao.getInstance().getNum(52) + 1);
                sa.c.c(5, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 13, this.f67057h.getAd_id(), 1, this.f67058i, this.f67059j);
            } else {
                AdNumShowDao.getInstance().updatePlayTdNum(AdNumShowDao.getInstance().getNum(8) + 1);
                sa.c.c(5, this.f67057h.getAd_type(), this.f67057h.getAd_source_id(), 4, this.f67057h.getAd_id(), 1, this.f67058i, this.f67059j);
            }
            ta.h hVar = this.f67055f;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f67063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int[] f67064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f67066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f67067f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f67068g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ta.h f67069h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67070i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67071j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ gb.d f67072k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f67073l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Handler f67074m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67075n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f67076o;

        /* JADX INFO: compiled from: PopUtil.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                gb.d dVar;
                b bVar = b.this;
                bVar.f67071j[0] = true;
                if (!bVar.f67075n[0]) {
                    if (bVar.f67070i[0] && (dVar = bVar.f67072k) != null && dVar.isShowing()) {
                        b.this.f67072k.f53324d.stop();
                        b.this.f67072k.dismiss();
                    }
                    ta.h hVar = b.this.f67069h;
                    if (hVar != null) {
                        hVar.a();
                    }
                    b.this.f67074m.removeCallbacksAndMessages(null);
                    tl.a.a().b(new x9.e(b.this.f67076o, false));
                    b bVar2 = b.this;
                    if (bVar2.f67064c[0] == 1) {
                        bVar2.f67063b.setRequestedOrientation(0);
                        b.this.f67063b.getWindow().getDecorView().setSystemUiVisibility(0);
                    }
                    b bVar3 = b.this;
                    if (bVar3.f67076o) {
                        int ad_type = bVar3.f67066e.getAd_type();
                        int ad_source_id = b.this.f67066e.getAd_source_id();
                        int ad_id = b.this.f67066e.getAd_id();
                        b bVar4 = b.this;
                        sa.c.c(6, ad_type, ad_source_id, 13, ad_id, 1, bVar4.f67067f, bVar4.f67068g);
                    } else {
                        int ad_type2 = bVar3.f67066e.getAd_type();
                        int ad_source_id2 = b.this.f67066e.getAd_source_id();
                        int ad_id2 = b.this.f67066e.getAd_id();
                        b bVar5 = b.this;
                        sa.c.c(6, ad_type2, ad_source_id2, 4, ad_id2, 1, bVar5.f67067f, bVar5.f67068g);
                    }
                }
                gb.d dVar2 = b.this.f67072k;
                if (dVar2 == null || !dVar2.isShowing()) {
                    return;
                }
                b.this.f67072k.f53324d.stop();
                b.this.f67072k.dismiss();
            }
        }

        public b(Activity activity, int[] iArr, String str, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11, ta.h hVar, boolean[] zArr, boolean[] zArr2, gb.d dVar, int i12, Handler handler, boolean[] zArr3, boolean z10) {
            this.f67063b = activity;
            this.f67064c = iArr;
            this.f67065d = str;
            this.f67066e = adInfoDetailEntry;
            this.f67067f = i10;
            this.f67068g = i11;
            this.f67069h = hVar;
            this.f67070i = zArr;
            this.f67071j = zArr2;
            this.f67072k = dVar;
            this.f67073l = i12;
            this.f67074m = handler;
            this.f67075n = zArr3;
            this.f67076o = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (s.e.k(this.f67063b)) {
                this.f67064c[0] = 1;
                this.f67063b.setRequestedOrientation(1);
            }
            if (!em.o.b(this.f67065d)) {
                new hls().exec("preload_mp4", this.f67065d, "0");
            }
            sa.c.c(7, this.f67066e.getAd_type(), this.f67066e.getAd_source_id(), 4, this.f67066e.getAd_id(), 0, this.f67067f, this.f67068g);
            RewardVideoLoader rewardVideoLoader = this.f67069h.f72318b;
            if (rewardVideoLoader != null) {
                rewardVideoLoader.loadAd();
            }
            this.f67070i[0] = true;
            this.f67071j[0] = false;
            this.f67072k.showAtLocation(view, 0, 0, 0);
            this.f67072k.f53324d.start();
            AdNumShowDao.getInstance().updatePlayIndex(this.f67073l);
            this.f67074m.postDelayed(new a(), 10000L);
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f67078b;

        public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            p10.startActivity(p11);
        }

        public c(Activity activity) {
            this.f67078b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f67078b, new Intent(this.f67078b, (Class<?>) ExtensionShareActivity.class));
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class d implements ta.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Handler f67082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ gb.c f67083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ta.h f67084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f67085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f67086h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f67087i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67088j;

        public d(boolean[] zArr, boolean[] zArr2, boolean[] zArr3, Handler handler, gb.c cVar, ta.h hVar, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11, boolean[] zArr4) {
            this.f67079a = zArr;
            this.f67080b = zArr2;
            this.f67081c = zArr3;
            this.f67082d = handler;
            this.f67083e = cVar;
            this.f67084f = hVar;
            this.f67085g = adInfoDetailEntry;
            this.f67086h = i10;
            this.f67087i = i11;
            this.f67088j = zArr4;
        }

        @Override // ta.i
        public void a(String str, String str2) {
            gb.c cVar = this.f67083e;
            if ((cVar == null || !cVar.f53314i.isRunning()) && !this.f67088j[0]) {
                if (o0.E() == 1) {
                    o0.N0(0);
                    Toast.makeText(em.r.a(), em.r.a().getResources().getString(R.string.str_download_ad_result, o0.e() + ""), 0).show();
                    o0.M0(o0.D() + o0.e());
                } else {
                    Toast.makeText(em.r.a(), em.r.a().getResources().getString(R.string.str_fail), 0).show();
                    o0.N0(o0.E() + 1);
                }
                this.f67083e.dismiss();
            }
            ta.h hVar = this.f67084f;
            if (hVar != null) {
                hVar.a();
            }
            sa.c.c(1, this.f67085g.getAd_type(), this.f67085g.getAd_source_id(), 5, this.f67085g.getAd_id(), 0, this.f67086h, this.f67087i);
            sa.c.b("adposition:5 Ad_source_id:" + this.f67085g.getAd_source_id() + " +s:" + str + " s1:" + str2);
        }

        @Override // ta.i
        public void b() {
            sa.c.c(3, this.f67085g.getAd_type(), this.f67085g.getAd_source_id(), 5, this.f67085g.getAd_id(), 1, this.f67086h, this.f67087i);
        }

        @Override // ta.i
        public void d() {
            this.f67079a[0] = true;
            if (this.f67080b[0] && !this.f67081c[0]) {
                this.f67082d.removeCallbacksAndMessages(null);
                AnimationDrawable animationDrawable = this.f67083e.f53314i;
                if (animationDrawable != null) {
                    animationDrawable.stop();
                }
                if (this.f67083e.isShowing()) {
                    this.f67084f.f72318b.showAd();
                    this.f67084f.f72318b = null;
                    this.f67083e.dismiss();
                }
            }
            sa.c.c(4, this.f67085g.getAd_type(), this.f67085g.getAd_source_id(), 5, this.f67085g.getAd_id(), 1, this.f67086h, this.f67087i);
        }

        @Override // ta.i
        public void c() {
            o0.M0(o0.D() + o0.e());
            Toast.makeText(em.r.a(), em.r.a().getResources().getString(R.string.str_download_ad_result, o0.e() + ""), 0).show();
            AdNumShowDao.getInstance().updateDownloadTdNum(AdNumShowDao.getInstance().getNum(10) + 1);
            Log.i("wangyi", "激励视频广告关闭");
            ta.h hVar = this.f67084f;
            if (hVar != null) {
                hVar.a();
            }
            sa.c.c(5, this.f67085g.getAd_type(), this.f67085g.getAd_source_id(), 5, this.f67085g.getAd_id(), 1, this.f67086h, this.f67087i);
        }

        @Override // ta.i
        public void onAdShow() {
            Log.i("wangyi", "onAdShow");
            sa.c.c(2, this.f67085g.getAd_type(), this.f67085g.getAd_source_id(), 5, this.f67085g.getAd_id(), 1, this.f67086h, this.f67087i);
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class e implements gb.c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ta.h f67090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ gb.c f67091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Handler f67093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67094f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67095g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f67096h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f67097i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f67098j;

        /* JADX INFO: compiled from: PopUtil.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f67094f[0] = true;
                eVar.f67095g[0] = true;
                if (!eVar.f67089a[0]) {
                    int ad_type = eVar.f67096h.getAd_type();
                    int ad_source_id = e.this.f67096h.getAd_source_id();
                    int ad_id = e.this.f67096h.getAd_id();
                    e eVar2 = e.this;
                    sa.c.c(6, ad_type, ad_source_id, 5, ad_id, 1, eVar2.f67097i, eVar2.f67098j);
                    if (o0.E() == 1) {
                        o0.N0(0);
                        Toast.makeText(em.r.a(), em.r.a().getResources().getString(R.string.str_download_ad_result, o0.e() + ""), 0).show();
                        o0.M0(o0.D() + o0.e());
                    } else {
                        o0.N0(o0.E() + 1);
                    }
                }
                gb.c cVar = e.this.f67091c;
                if (cVar != null && cVar.isShowing()) {
                    AnimationDrawable animationDrawable = e.this.f67091c.f53314i;
                    if (animationDrawable != null) {
                        animationDrawable.stop();
                    }
                    e.this.f67091c.dismiss();
                }
                ta.h hVar = e.this.f67090b;
                if (hVar != null) {
                    hVar.a();
                }
                Handler handler = e.this.f67093e;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            }
        }

        public e(boolean[] zArr, ta.h hVar, gb.c cVar, boolean[] zArr2, Handler handler, boolean[] zArr3, boolean[] zArr4, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11) {
            this.f67089a = zArr;
            this.f67090b = hVar;
            this.f67091c = cVar;
            this.f67092d = zArr2;
            this.f67093e = handler;
            this.f67094f = zArr3;
            this.f67095g = zArr4;
            this.f67096h = adInfoDetailEntry;
            this.f67097i = i10;
            this.f67098j = i11;
        }

        @Override // gb.c.d
        public void a(boolean z10, RelativeLayout relativeLayout, LinearLayout linearLayout, Context context) {
            if (this.f67089a[0]) {
                if (this.f67090b.f72318b != null) {
                    this.f67091c.dismiss();
                    this.f67090b.f72318b.showAd();
                    this.f67090b.f72318b = null;
                    return;
                }
                return;
            }
            this.f67092d[0] = true;
            linearLayout.setVisibility(0);
            relativeLayout.setVisibility(8);
            AnimationDrawable animationDrawable = this.f67091c.f53314i;
            if (animationDrawable != null) {
                animationDrawable.start();
            }
            this.f67093e.postDelayed(new a(), 10000L);
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class f implements ta.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Handler f67103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ hb.a f67104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ta.h f67105f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f67106g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f67107h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f67108i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Activity f67109j;

        /* JADX INFO: compiled from: PopUtil.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                tl.a.a().b(new x9.b());
            }
        }

        public f(boolean[] zArr, boolean[] zArr2, boolean[] zArr3, Handler handler, hb.a aVar, ta.h hVar, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11, Activity activity) {
            this.f67100a = zArr;
            this.f67101b = zArr2;
            this.f67102c = zArr3;
            this.f67103d = handler;
            this.f67104e = aVar;
            this.f67105f = hVar;
            this.f67106g = adInfoDetailEntry;
            this.f67107h = i10;
            this.f67108i = i11;
            this.f67109j = activity;
        }

        @Override // ta.i
        public void a(String str, String str2) {
            if (this.f67101b[0]) {
                this.f67104e.f53828i.stop();
                this.f67104e.dismiss();
            }
            ta.h hVar = this.f67105f;
            if (hVar != null) {
                hVar.a();
            }
            this.f67109j.runOnUiThread(new a());
            ta.h hVar2 = this.f67105f;
            if (hVar2 != null) {
                hVar2.a();
            }
            sa.c.c(1, this.f67106g.getAd_type(), this.f67106g.getAd_source_id(), 21, this.f67106g.getAd_id(), 0, this.f67107h, this.f67108i);
            sa.c.b("adposition:21 Ad_source_id:" + this.f67106g.getAd_source_id() + " +s:" + str + " s1:" + str2);
        }

        @Override // ta.i
        public void b() {
            sa.c.c(3, this.f67106g.getAd_type(), this.f67106g.getAd_source_id(), 21, this.f67106g.getAd_id(), 1, this.f67107h, this.f67108i);
        }

        @Override // ta.i
        public void d() {
            this.f67100a[0] = true;
            if (this.f67101b[0] && !this.f67102c[0]) {
                this.f67103d.removeCallbacksAndMessages(null);
                AnimationDrawable animationDrawable = this.f67104e.f53828i;
                if (animationDrawable != null) {
                    animationDrawable.stop();
                }
                if (this.f67104e.isShowing()) {
                    this.f67105f.f72318b.showAd();
                    this.f67105f.f72318b = null;
                    this.f67104e.dismiss();
                }
            }
            sa.c.c(4, this.f67106g.getAd_type(), this.f67106g.getAd_source_id(), 21, this.f67106g.getAd_id(), 1, this.f67107h, this.f67108i);
        }

        @Override // ta.i
        public void c() {
            tl.a.a().b(new x9.b());
            AdNumShowDao.getInstance().updateClingRewardWxNum(AdNumShowDao.getInstance().getNum(109) + 1);
            Log.i("wangyi", "激励视频广告关闭");
            ta.h hVar = this.f67105f;
            if (hVar != null) {
                hVar.a();
            }
            sa.c.c(5, this.f67106g.getAd_type(), this.f67106g.getAd_source_id(), 21, this.f67106g.getAd_id(), 1, this.f67107h, this.f67108i);
        }

        @Override // ta.i
        public void onAdShow() {
            Log.i("wangyi", "onAdShow");
            sa.c.c(2, this.f67106g.getAd_type(), this.f67106g.getAd_source_id(), 21, this.f67106g.getAd_id(), 1, this.f67107h, this.f67108i);
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class g implements hb.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ta.h f67112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hb.a f67113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Handler f67115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean[] f67117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f67118h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f67119i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f67120j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f67121k;

        /* JADX INFO: compiled from: PopUtil.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: sa.a0$g$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: PopUtil.java */
            public class RunnableC0640a implements Runnable {
                public RunnableC0640a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    tl.a.a().b(new x9.b());
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                gVar.f67116f[0] = true;
                gVar.f67117g[0] = true;
                gVar.f67118h.runOnUiThread(new RunnableC0640a());
                hb.a aVar = g.this.f67113c;
                if (aVar != null && aVar.isShowing()) {
                    AnimationDrawable animationDrawable = g.this.f67113c.f53828i;
                    if (animationDrawable != null) {
                        animationDrawable.stop();
                    }
                    g.this.f67113c.dismiss();
                }
                ta.h hVar = g.this.f67112b;
                if (hVar != null) {
                    hVar.a();
                }
                Handler handler = g.this.f67115e;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                int ad_type = g.this.f67119i.getAd_type();
                int ad_source_id = g.this.f67119i.getAd_source_id();
                int ad_id = g.this.f67119i.getAd_id();
                g gVar2 = g.this;
                sa.c.c(6, ad_type, ad_source_id, 21, ad_id, 1, gVar2.f67120j, gVar2.f67121k);
            }
        }

        public g(boolean[] zArr, ta.h hVar, hb.a aVar, boolean[] zArr2, Handler handler, boolean[] zArr3, boolean[] zArr4, Activity activity, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11) {
            this.f67111a = zArr;
            this.f67112b = hVar;
            this.f67113c = aVar;
            this.f67114d = zArr2;
            this.f67115e = handler;
            this.f67116f = zArr3;
            this.f67117g = zArr4;
            this.f67118h = activity;
            this.f67119i = adInfoDetailEntry;
            this.f67120j = i10;
            this.f67121k = i11;
        }

        @Override // hb.a.d
        public void a(boolean z10, RelativeLayout relativeLayout, LinearLayout linearLayout, Context context) {
            if (this.f67111a[0]) {
                if (this.f67112b.f72318b != null) {
                    this.f67113c.dismiss();
                    this.f67112b.f72318b.showAd();
                    this.f67112b.f72318b = null;
                    return;
                }
                return;
            }
            this.f67114d[0] = true;
            linearLayout.setVisibility(0);
            relativeLayout.setVisibility(8);
            AnimationDrawable animationDrawable = this.f67113c.f53828i;
            if (animationDrawable != null) {
                animationDrawable.start();
            }
            this.f67115e.postDelayed(new a(), 10000L);
        }
    }

    public static void a(ta.h hVar, View view, AdInfoDetailEntry adInfoDetailEntry, gb.c cVar, Context context, int i10, int i11) {
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        boolean[] zArr3 = new boolean[1];
        boolean[] zArr4 = new boolean[1];
        Handler handler = new Handler();
        cVar.showAtLocation(view, 0, 0, 0);
        hVar.b(new d(zArr, zArr2, zArr3, handler, cVar, hVar, adInfoDetailEntry, i10, i11, zArr4));
        RewardVideoLoader rewardVideoLoader = hVar.f72318b;
        if (rewardVideoLoader != null) {
            rewardVideoLoader.loadAd();
            sa.c.c(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 5, adInfoDetailEntry.getAd_id(), 1, i10, i11);
        }
        cVar.d(new e(zArr, hVar, cVar, zArr2, handler, zArr4, zArr3, adInfoDetailEntry, i10, i11));
    }

    public static void b(ta.h hVar, View view, AdInfoDetailEntry adInfoDetailEntry, hb.a aVar, Activity activity, int i10, int i11) {
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        boolean[] zArr3 = new boolean[1];
        boolean[] zArr4 = new boolean[1];
        Handler handler = new Handler();
        aVar.showAtLocation(view, 0, 0, 0);
        hVar.b(new f(zArr, zArr2, zArr3, handler, aVar, hVar, adInfoDetailEntry, i10, i11, activity));
        RewardVideoLoader rewardVideoLoader = hVar.f72318b;
        if (rewardVideoLoader != null) {
            rewardVideoLoader.loadAd();
            sa.c.c(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 21, adInfoDetailEntry.getAd_id(), 0, i10, i11);
        }
        aVar.d(new g(zArr, hVar, aVar, zArr2, handler, zArr4, zArr3, activity, adInfoDetailEntry, i10, i11));
    }

    public static void c(boolean z10, ta.h hVar, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, int i12, String str) {
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        boolean[] zArr3 = new boolean[1];
        int[] iArr = {0};
        videoPlayerView.e(0);
        gb.d dVar = new gb.d(activity);
        hVar.b(new a(zArr, zArr2, zArr3, dVar, handler, hVar, z10, adInfoDetailEntry, i10, i11, iArr, activity));
        activity.findViewById(R.id.iv_ad_click_player).setOnClickListener(new b(activity, iArr, str, adInfoDetailEntry, i10, i11, hVar, zArr2, zArr3, dVar, i12, handler, zArr, z10));
        activity.findViewById(R.id.iv_ad_share_click_player).setOnClickListener(new c(activity));
    }
}
