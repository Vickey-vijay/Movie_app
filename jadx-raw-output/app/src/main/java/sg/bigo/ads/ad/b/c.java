package sg.bigo.ads.ad.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.f.a.j;
import sg.bigo.ads.core.f.a.k;
import sg.bigo.ads.core.f.a.l;
import sg.bigo.ads.core.f.a.n;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes4.dex */
public class c extends sg.bigo.ads.ad.b.b {

    @Nullable
    public sg.bigo.ads.core.player.c I;

    @Nullable
    public p J;
    public boolean K;
    public b L;
    private sg.bigo.ads.core.player.b.a O;
    private Pair<Boolean, Boolean> P;
    private AtomicBoolean Q;
    private final a R;
    private f S;
    private final sg.bigo.ads.core.g.c T;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.c$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f67422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sg.bigo.ads.api.b.d.a f67423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sg.bigo.ads.core.a.a f67424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sg.bigo.ads.api.core.b f67425d;

        public AnonymousClass4(int i10, sg.bigo.ads.api.b.d.a aVar, sg.bigo.ads.core.a.a aVar2, sg.bigo.ads.api.core.b bVar) {
            this.f67422a = i10;
            this.f67423b = aVar;
            this.f67424c = aVar2;
            this.f67425d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f67422a != 0) {
                c.this.B();
                this.f67423b.a(c.this, 1006, this.f67422a, "Invalid media video.");
                return;
            }
            c.this.A();
            c cVar = c.this;
            p pVar = cVar.J;
            if (!c.a(cVar, (int) ((pVar != null ? pVar.f71478s : 0L) / 1000))) {
                this.f67423b.a(c.this, 1032, 1402, "Invalid video duration.");
                return;
            }
            c.this.O = new sg.bigo.ads.core.player.b.a() { // from class: sg.bigo.ads.ad.b.c.4.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                    if (c.this.Q.get() || AnonymousClass4.this.f67424c.bg() == 3 || AnonymousClass4.this.f67424c.bh() != null) {
                        sg.bigo.ads.common.t.a.a(0, 3, "onResourceDownloadBackup", "downloading or backup img is ready, stop to download img");
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "onResourceDownloadBackup", "begin to download backup img");
                    c.this.Q.set(true);
                    final Pair<Boolean, Boolean> pairG = c.this.G();
                    ArrayList arrayList = new ArrayList();
                    if (((Boolean) pairG.first).booleanValue()) {
                        arrayList.add(AnonymousClass4.this.f67424c.bq().f71390b);
                    }
                    String strAT = ((sg.bigo.ads.core.a.a) c.this.f()).aT();
                    if (!TextUtils.isEmpty(strAT) && URLUtil.isNetworkUrl(strAT)) {
                        arrayList.add(AnonymousClass4.this.f67424c.aT());
                    }
                    if (arrayList.size() == 0 && !((Boolean) pairG.second).booleanValue()) {
                        AnonymousClass4.this.f67424c.k(0);
                        return;
                    }
                    AnonymousClass4.this.f67424c.k(3);
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    sg.bigo.ads.common.p.e.a(c.this.f67537b.f69380e, arrayList, anonymousClass4.f67424c.al(), new g() { // from class: sg.bigo.ads.ad.b.c.4.1.1
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i10, @NonNull String str, String str2) {
                            AnonymousClass4.this.f67424c.k(1);
                            if (((Boolean) pairG.second).booleanValue()) {
                                VideoController videoController = c.this.getVideoController();
                                if (videoController == null || videoController.getLoadHTMLCallback() == null) {
                                    AnonymousClass4.this.f67424c.bj();
                                } else {
                                    videoController.getLoadHTMLCallback().a();
                                }
                            }
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                            AnonymousClass4.this.f67424c.k(2);
                            AnonymousClass4.this.f67424c.a(new Pair<>(bitmap, fVar.f69885e));
                            VideoController videoController = c.this.getVideoController();
                            if (videoController != null) {
                                videoController.notifyBackupResourceReady();
                            }
                        }
                    });
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i10) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    final c cVar2 = c.this;
                    final sg.bigo.ads.core.a.a aVar = anonymousClass4.f67424c;
                    if (!cVar2.J() && !cVar2.M && aVar != null && aVar.aR()) {
                        cVar2.M = true;
                        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.d.1

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ sg.bigo.ads.core.a.a f67433a;

                            public AnonymousClass1() {
                                aVar = aVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    String strB = o.b(d.this.f67537b.f69380e, aVar.aN());
                                    if (TextUtils.isEmpty(strB)) {
                                        return;
                                    }
                                    File file = new File(URI.create(strB));
                                    if (!file.exists() || file.length() <= 0) {
                                        return;
                                    }
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                                    d.this.A = sg.bigo.ads.common.w.b.a(bitmapDecodeFile);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                    c.this.a("is_cache", Boolean.valueOf(i10 == 0));
                    AnonymousClass4.this.f67424c.ba();
                    c.a(c.this);
                    c cVar3 = c.this;
                    if (cVar3.f67540e || cVar3.f67541f) {
                        return;
                    }
                    c.b(cVar3, i10);
                    AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                    anonymousClass5.f67423b.a(c.this);
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.common.h.a aVar) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    c cVar2 = c.this;
                    if (cVar2.f67540e || cVar2.f67541f) {
                        return;
                    }
                    anonymousClass4.f67424c.h(2);
                    if (AnonymousClass4.this.f67425d.x() != 1) {
                        AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                        anonymousClass5.f67423b.a(c.this, aVar.d(), IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.", true);
                    } else if (AnonymousClass4.this.f67424c.bh() != null || aVar.d()) {
                        AnonymousClass4 anonymousClass6 = AnonymousClass4.this;
                        anonymousClass6.f67423b.a(c.this);
                    } else {
                        sg.bigo.ads.core.d.b.a(AnonymousClass4.this.f67424c, aVar.f69660b, str, 0L, aVar.f69665g / 1024, 2, "video", aVar.f69673o);
                        AnonymousClass4 anonymousClass7 = AnonymousClass4.this;
                        anonymousClass7.f67423b.a(c.this, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.");
                    }
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i10) {
                    sg.bigo.ads.core.a.a aVar;
                    int i11;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    c cVar2 = c.this;
                    if (cVar2.f67540e || cVar2.f67541f) {
                        return;
                    }
                    if (anonymousClass4.f67424c.aO()) {
                        aVar = AnonymousClass4.this.f67424c;
                        i11 = 3;
                    } else {
                        aVar = AnonymousClass4.this.f67424c;
                        i11 = 4;
                    }
                    aVar.h(i11);
                    AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                    anonymousClass5.f67423b.a(c.this, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, i10, "Failed to download media video.");
                }
            };
            sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
            c cVar2 = c.this;
            bVarA.a(cVar2.f67537b.f69380e, this.f67424c, cVar2.O);
        }
    }

    public class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public AdInteractionListener f67430a;

        public a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f67430a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            AdInteractionListener adInteractionListener = this.f67430a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClosed();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            if (this.f67430a != null) {
                if (adError.getCode() == 2002 && c.this.p()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "don't call onAdError when video has impressed");
                } else {
                    this.f67430a.onAdError(adError);
                }
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            AdInteractionListener adInteractionListener = this.f67430a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            AdInteractionListener adInteractionListener = this.f67430a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdOpened();
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public c(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        this.Q = new AtomicBoolean(false);
        this.R = new a();
        this.T = new sg.bigo.ads.core.g.c() { // from class: sg.bigo.ads.ad.b.c.1
            @Override // sg.bigo.ads.core.g.c
            public final void a(String str, @Nullable Object obj, @Nullable int[] iArr) {
                c.a(c.this, str, obj, iArr);
            }

            @Override // sg.bigo.ads.core.g.c
            public final void a(String str, @Nullable int[] iArr) {
                c.a(c.this, str, iArr);
            }
        };
    }

    public static /* synthetic */ int a(c cVar, String str) {
        if (q.a((CharSequence) str)) {
            return 10074;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) cVar.f();
        k kVarH = cVar.H();
        p pVarA = kVarH.a(cVar.f67537b.f69380e, str);
        int i10 = kVarH.f71439a;
        String str2 = kVarH.f71441c;
        long j10 = kVarH.f71440b;
        if (i.f69318a.n().a(9) && URLUtil.isHttpUrl(str2)) {
            sg.bigo.ads.core.d.b.a(aVar, i10, str2, j10, 10076, "Invalid http url");
            return 10076;
        }
        if (pVarA != null && pVarA.f71473n != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pVarA.f71473n.f71416c.hashCode());
            pVarA.f71474o = sb2.toString();
            cVar.I = new sg.bigo.ads.core.player.c(cVar.f67537b.f69380e, pVarA, cVar.f67539d);
            aVar.a(pVarA);
            cVar.J = pVarA;
            cVar.G();
            sg.bigo.ads.core.d.b.a(aVar, i10, j10);
            return 0;
        }
        sg.bigo.ads.core.f.a.e eVar = kVarH.f71442d;
        List<n> list = kVarH.f71443e;
        if (eVar == null) {
            return 10075;
        }
        int i11 = eVar.f71423a;
        if (i11 != 10062) {
        }
        Context context = cVar.f67537b.f69380e;
        sg.bigo.ads.core.f.a.f fVar = sg.bigo.ads.core.f.a.f.XML_PARSING_ERROR;
        sg.bigo.ads.core.player.c.a(context, list);
        sg.bigo.ads.core.d.b.a(aVar, i10, str2, j10, i11, eVar.f71424b);
        return i11;
    }

    public static /* synthetic */ void a(c cVar) {
        VideoController videoController = cVar.getVideoController();
        if (videoController != null) {
            videoController.notifyResourceReady();
        }
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
    public static /* synthetic */ void a(c cVar, String str, Object obj, int[] iArr) {
        sg.bigo.ads.api.b.d.a<T> aVar;
        sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) cVar.f();
        str.hashCode();
        switch (str) {
            case "AdLoaded":
                f fVar = cVar.S;
                if (fVar != null && (aVar = fVar.f67442e) != 0) {
                    aVar.a(fVar.f67438a);
                    break;
                }
                break;
            case "AdVideoThirdQuartile":
                sg.bigo.ads.core.player.c cVar2 = cVar.I;
                if (cVar2 != null) {
                    Iterator<Integer> it = cVar2.f71897j.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        if (75 >= iIntValue) {
                            if (iIntValue == 75) {
                                sg.bigo.ads.core.c.b bVar = cVar2.f71893f;
                                if (bVar != null) {
                                    bVar.a(sg.bigo.ads.core.c.b.EnumC0733b.f71211c);
                                }
                                iIntValue = 5;
                            }
                            sg.bigo.ads.core.player.c.a(aVar2, iIntValue);
                            it.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoMidpoint":
                sg.bigo.ads.core.player.c cVar3 = cVar.I;
                if (cVar3 != null) {
                    Iterator<Integer> it2 = cVar3.f71897j.iterator();
                    while (it2.hasNext()) {
                        int iIntValue2 = it2.next().intValue();
                        if (50 >= iIntValue2) {
                            if (iIntValue2 == 50) {
                                sg.bigo.ads.core.c.b bVar2 = cVar3.f71893f;
                                if (bVar2 != null) {
                                    bVar2.a(sg.bigo.ads.core.c.b.EnumC0733b.f71210b);
                                }
                                iIntValue2 = 4;
                            }
                            sg.bigo.ads.core.player.c.a(aVar2, iIntValue2);
                            it2.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoFirstQuartile":
                sg.bigo.ads.core.player.c cVar4 = cVar.I;
                if (cVar4 != null) {
                    Iterator<Integer> it3 = cVar4.f71897j.iterator();
                    while (it3.hasNext()) {
                        int iIntValue3 = it3.next().intValue();
                        if (25 >= iIntValue3) {
                            if (iIntValue3 == 25) {
                                sg.bigo.ads.core.c.b bVar3 = cVar4.f71893f;
                                if (bVar3 != null) {
                                    bVar3.a(sg.bigo.ads.core.c.b.EnumC0733b.f71209a);
                                }
                                iIntValue3 = 3;
                            }
                            sg.bigo.ads.core.player.c.a(aVar2, iIntValue3);
                            it3.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVPAIDClickThru":
                if (iArr != null && iArr.length > 0) {
                    cVar.b(obj instanceof sg.bigo.ads.common.i ? (sg.bigo.ads.common.i) obj : null, 12, 5);
                    break;
                }
                break;
            case "AdError":
                f fVar2 = cVar.S;
                if (fVar2 != null) {
                    String str2 = obj instanceof String ? (String) obj : "VPAID error";
                    sg.bigo.ads.api.b.d.a<T> aVar3 = fVar2.f67442e;
                    if (aVar3 != 0) {
                        aVar3.a(fVar2.f67438a, 1006, 10222, str2);
                    }
                    break;
                }
                break;
            case "AdVPAIDImpression":
                f fVar3 = cVar.S;
                if (fVar3 != null && fVar3.a()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "vpaid impression method");
                    super.a_();
                    break;
                }
                break;
            case "AdVideoStart":
                sg.bigo.ads.core.player.c cVar5 = cVar.I;
                if (cVar5 != null) {
                    Iterator<Integer> it4 = cVar5.f71897j.iterator();
                    while (it4.hasNext()) {
                        int iIntValue4 = it4.next().intValue();
                        if (iIntValue4 <= 0) {
                            if (iIntValue4 == 0) {
                                sg.bigo.ads.core.c.b bVar4 = cVar5.f71893f;
                                if (bVar4 != null) {
                                    bVar4.a(cVar5.f71888a.f71478s, cVar5.f71894g ? 0.0f : 1.0f);
                                }
                                iIntValue4 = 2;
                            }
                            sg.bigo.ads.core.player.c.a(aVar2, iIntValue4);
                            it4.remove();
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    public static /* synthetic */ void a(c cVar, String str, int[] iArr) {
        VideoController.d progressChangeListener;
        VideoController.a backupLoadCallback;
        byte b10;
        byte b11;
        VideoController videoController = cVar.getVideoController();
        VideoController.VideoLifeCallback videoLifeCallback = null;
        if (videoController != null) {
            videoLifeCallback = videoController.getVideoLifeCallback();
            progressChangeListener = videoController.getProgressChangeListener();
            backupLoadCallback = videoController.getBackupLoadCallback();
        } else {
            progressChangeListener = null;
            backupLoadCallback = null;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) cVar.f();
        str.hashCode();
        switch (str.hashCode()) {
            case -2104076401:
                if (!str.equals("AdClosed")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1928311131:
                if (!str.equals("AdBackupImgReady")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1844074968:
                if (!str.equals("AdLoaded")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -799585545:
                if (!str.equals("AdVideoBuffered")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 123005777:
                if (!str.equals("AdVideoComplete")) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 227130189:
                if (!str.equals("AdVolumeChange")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 479049069:
                if (!str.equals("AdSkipped")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 488344453:
                if (!str.equals("AdError")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 739506502:
                if (!str.equals("AdVideoPaused")) {
                    b10 = -1;
                } else {
                    b11 = 8;
                    b10 = b11;
                }
                break;
            case 858456394:
                if (!str.equals("AdVideoStart")) {
                    b10 = -1;
                } else {
                    b11 = 9;
                    b10 = b11;
                }
                break;
            case 982656138:
                if (!str.equals("AdVideoBuffering")) {
                    b10 = -1;
                } else {
                    b11 = 10;
                    b10 = b11;
                }
                break;
            case 1099014402:
                if (!str.equals("AdVideoTooLate")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 1746498326:
                if (!str.equals("AdVideoPlaying")) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case 1766207024:
                if (!str.equals("AdRemainingTimeChange")) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                sg.bigo.ads.core.player.c cVar2 = cVar.I;
                if (cVar2 != null) {
                    cVar2.a(cVar2.f71888a.f71464e, "va_close");
                }
                break;
            case 1:
                if (backupLoadCallback != null) {
                    backupLoadCallback.i(((iArr == null || iArr.length <= 0) ? 0 : iArr[0]) != 0);
                }
                break;
            case 2:
                sg.bigo.ads.core.player.c cVar3 = cVar.I;
                if (cVar3 != null) {
                    cVar3.f71890c = true;
                }
                break;
            case 3:
                if (videoLifeCallback instanceof VideoController.b) {
                    ((VideoController.b) videoLifeCallback).b();
                }
                break;
            case 4:
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoEnd();
                }
                sg.bigo.ads.core.player.c cVar4 = cVar.I;
                if (cVar4 != null) {
                    cVar4.a(cVar4.f71888a.f71463d, "va_comp");
                    cVar4.a(cVar4.f71888a.f71461b, "va_prog1");
                    cVar4.a(cVar4.f71888a.f71462c, "va_prog2");
                    if (!cVar4.f71896i) {
                        cVar4.f71896i = true;
                        sg.bigo.ads.core.player.c.a(aVar, 6);
                        sg.bigo.ads.core.c.b bVar = cVar4.f71893f;
                        if (bVar != null) {
                            bVar.a(sg.bigo.ads.core.c.b.EnumC0733b.f71212d);
                        }
                    }
                }
                if (cVar.e(aVar.x()) && videoController != null) {
                    videoController.play();
                    break;
                }
                break;
            case 5:
                if (iArr != null && iArr.length > 0) {
                    int i10 = iArr[0];
                    if (videoLifeCallback != null) {
                        videoLifeCallback.onMuteChange(i10 == 0);
                    }
                    sg.bigo.ads.core.player.c cVar5 = cVar.I;
                    if (cVar5 != null) {
                        sg.bigo.ads.core.player.c.a(aVar, i10 != 0 ? 17 : 7);
                        p pVar = cVar5.f71888a;
                        if (pVar != null) {
                            Iterator<j> it = pVar.f71466g.iterator();
                            while (it.hasNext()) {
                                j next = it.next();
                                if ((i10 == 0 && next.f71437a) || (i10 == 100 && !next.f71437a)) {
                                    cVar5.a(next, "va_mst");
                                    it.remove();
                                }
                            }
                        }
                        cVar5.f71894g = i10 / 100 == 0;
                        sg.bigo.ads.core.c.b bVar2 = cVar5.f71893f;
                        if (bVar2 != null) {
                            float f10 = i10 / 100.0f;
                            MediaEvents mediaEvents = bVar2.f71196a;
                            if (mediaEvents != null && bVar2.f71197b) {
                                mediaEvents.volumeChange(f10);
                                bVar2.a("video volume change: ".concat(String.valueOf(f10)));
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                sg.bigo.ads.core.player.c cVar6 = cVar.I;
                if (cVar6 != null) {
                    cVar6.a(cVar6.f71888a.f71465f, "va_skip");
                    sg.bigo.ads.core.c.b bVar3 = cVar6.f71893f;
                    if (bVar3 != null) {
                        bVar3.b(sg.bigo.ads.core.c.b.a.f71207e);
                    }
                }
                break;
            case 7:
            case 11:
                sg.bigo.ads.core.player.c cVar7 = cVar.I;
                if (cVar7 != null) {
                    String str2 = sg.bigo.ads.core.f.a.f.GENERAL_LINEAR_AD_ERROR.f71432g;
                    ArrayList<n> arrayList = cVar7.f71888a.f71470k;
                    if (arrayList != null) {
                        Iterator<n> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            n next2 = it2.next();
                            String str3 = next2.f71455b;
                            if (q.a((CharSequence) str3) || (next2.f71456c && !next2.f71457d)) {
                                sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
                            } else {
                                String strA = sg.bigo.ads.core.player.c.a(str3);
                                String strA2 = q.a((CharSequence) strA) ? "" : q.a(strA, "[ERRORCODE]", str2, false);
                                next2.f71456c = true;
                                if (!q.a((CharSequence) strA2)) {
                                    cVar7.f71892e.a(cVar7.f71895h, "va_err", strA2, "bigoad");
                                    sg.bigo.ads.common.t.a.a(0, 3, "VASTController", "Send track info, action: va_err, url: ".concat(String.valueOf(strA2)));
                                }
                            }
                            it2.remove();
                        }
                    }
                    sg.bigo.ads.core.player.c.a(aVar, 16);
                    if (iArr != null) {
                        super.a(2002, 0, "Video error: " + iArr[0], false);
                        b bVar4 = cVar.L;
                        if (bVar4 != null) {
                            bVar4.a("Video error: " + iArr[0]);
                        }
                    }
                }
                break;
            case 8:
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoPause();
                }
                sg.bigo.ads.core.player.c cVar8 = cVar.I;
                if (cVar8 != null) {
                    cVar8.f71891d = true;
                    Iterator<n> it3 = cVar8.f71888a.f71467h.iterator();
                    while (it3.hasNext()) {
                        cVar8.a(it3.next(), "va_pau");
                    }
                    sg.bigo.ads.core.c.b bVar5 = cVar8.f71893f;
                    if (bVar5 != null) {
                        bVar5.b(sg.bigo.ads.core.c.b.a.f71203a);
                    }
                }
                break;
            case 9:
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoStart();
                }
                break;
            case 10:
                if (videoLifeCallback instanceof VideoController.b) {
                    ((VideoController.b) videoLifeCallback).a();
                }
                break;
            case 12:
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoPlay();
                }
                sg.bigo.ads.core.player.c cVar9 = cVar.I;
                if (cVar9 != null && cVar9.f71891d) {
                    cVar9.f71891d = false;
                    Iterator<n> it4 = cVar9.f71888a.f71468i.iterator();
                    while (it4.hasNext()) {
                        cVar9.a(it4.next(), "va_res");
                    }
                    sg.bigo.ads.core.c.b bVar6 = cVar9.f71893f;
                    if (bVar6 != null) {
                        bVar6.b(sg.bigo.ads.core.c.b.a.f71204b);
                    }
                    break;
                }
                break;
            case 13:
                if (iArr != null && iArr.length > 2) {
                    sg.bigo.ads.core.player.c cVar10 = cVar.I;
                    if (cVar10 != null && iArr.length > 2) {
                        int i11 = iArr[0];
                        int i12 = iArr[2];
                        Iterator<l> it5 = cVar10.f71888a.f71461b.iterator();
                        while (it5.hasNext()) {
                            l next3 = it5.next();
                            if (i12 >= next3.f71452a) {
                                cVar10.a(next3, "va_prog1");
                                it5.remove();
                            }
                        }
                        Iterator<sg.bigo.ads.core.f.a.c> it6 = cVar10.f71888a.f71462c.iterator();
                        while (it6.hasNext()) {
                            sg.bigo.ads.core.f.a.c next4 = it6.next();
                            if (i11 >= next4.f71421a) {
                                cVar10.a(next4, "va_prog2");
                                it6.remove();
                            }
                        }
                        Iterator<Integer> it7 = cVar10.f71898k.iterator();
                        while (it7.hasNext()) {
                            int iIntValue = it7.next().intValue();
                            if (i11 >= iIntValue) {
                                if (iIntValue == 2000) {
                                    iIntValue = 11;
                                } else if (iIntValue == 3000) {
                                    iIntValue = 12;
                                } else if (iIntValue == 5000) {
                                    iIntValue = 13;
                                } else if (iIntValue == 8000) {
                                    iIntValue = 14;
                                } else if (iIntValue == 10000) {
                                    iIntValue = 15;
                                }
                                sg.bigo.ads.core.player.c.a(aVar, iIntValue);
                                it7.remove();
                            }
                        }
                        Iterator<Integer> it8 = cVar10.f71897j.iterator();
                        while (it8.hasNext()) {
                            int iIntValue2 = it8.next().intValue();
                            if (i12 >= iIntValue2) {
                                if (iIntValue2 == 0) {
                                    sg.bigo.ads.core.c.b bVar7 = cVar10.f71893f;
                                    if (bVar7 != null) {
                                        bVar7.a(cVar10.f71888a.f71478s, cVar10.f71894g ? 0.0f : 1.0f);
                                    }
                                    iIntValue2 = 2;
                                } else if (iIntValue2 == 25) {
                                    sg.bigo.ads.core.c.b bVar8 = cVar10.f71893f;
                                    if (bVar8 != null) {
                                        bVar8.a(sg.bigo.ads.core.c.b.EnumC0733b.f71209a);
                                    }
                                    iIntValue2 = 3;
                                } else if (iIntValue2 == 50) {
                                    sg.bigo.ads.core.c.b bVar9 = cVar10.f71893f;
                                    if (bVar9 != null) {
                                        bVar9.a(sg.bigo.ads.core.c.b.EnumC0733b.f71210b);
                                    }
                                    iIntValue2 = 4;
                                } else if (iIntValue2 == 75) {
                                    sg.bigo.ads.core.c.b bVar10 = cVar10.f71893f;
                                    if (bVar10 != null) {
                                        bVar10.a(sg.bigo.ads.core.c.b.EnumC0733b.f71211c);
                                    }
                                    iIntValue2 = 5;
                                }
                                sg.bigo.ads.core.player.c.a(aVar, iIntValue2);
                                it8.remove();
                            }
                        }
                    }
                    if (progressChangeListener != null) {
                        progressChangeListener.a(iArr[0], iArr[1]);
                    }
                    break;
                }
                break;
        }
    }

    public static /* synthetic */ boolean a(c cVar, int i10) {
        return ((sg.bigo.ads.core.a.a) cVar.f()).x() != 4 || i10 >= 5;
    }

    public static /* synthetic */ void b(c cVar, int i10) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) cVar.f();
        int i11 = 1;
        if (i10 != 0) {
            if (i10 != 1) {
                i11 = i10 != 2 ? 0 : 3;
            } else {
                i11 = 4;
            }
        }
        aVar.h(i11);
    }

    @Override // sg.bigo.ads.ad.b.b
    public final List<sg.bigo.ads.core.c.a> D() {
        List<sg.bigo.ads.core.c.a> list;
        p pVar = this.J;
        return (pVar == null || (list = pVar.C) == null || list.size() <= 0) ? super.D() : list;
    }

    @Override // sg.bigo.ads.ad.b.b
    public final boolean F() {
        return ((sg.bigo.ads.core.a.a) f()).aR();
    }

    public final Pair<Boolean, Boolean> G() {
        boolean z10;
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        Pair<Boolean, Boolean> pair = this.P;
        if (pair != null) {
            return pair;
        }
        p pVar = this.J;
        boolean z11 = false;
        if (pVar != null) {
            z10 = false;
            for (sg.bigo.ads.core.f.a.a aVar2 : pVar.A) {
                if (aVar2 != null) {
                    sg.bigo.ads.core.f.a.a.C0736a c0736aA = sg.bigo.ads.core.f.a.a.a(aVar2.f71388b);
                    if (!z11 && c0736aA != null && c0736aA.a()) {
                        aVar.a(c0736aA);
                        z11 = true;
                    }
                    sg.bigo.ads.core.f.a.a.C0736a c0736aA2 = sg.bigo.ads.core.f.a.a.a(aVar2.f71387a);
                    if (!z10 && c0736aA2 != null && c0736aA2.a()) {
                        aVar.b(c0736aA2);
                        z10 = true;
                    }
                }
            }
        } else {
            z10 = false;
        }
        Pair<Boolean, Boolean> pair2 = new Pair<>(Boolean.valueOf(z11), Boolean.valueOf(z10));
        this.P = pair2;
        return pair2;
    }

    @NonNull
    public k H() {
        int iG = this.f67537b.f69377b.g();
        h hVar = i.f69318a;
        return new k(iG, (hVar == null || hVar.r() == null) ? 0 : hVar.r().a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
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
    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public final void a(Point point, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        super.a(point, i10, i11, dVar);
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != 0) {
            cVar.a((sg.bigo.ads.api.core.b) f());
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable ImageView imageView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i10, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, imageView, adOptionsView, list, i10, viewArr);
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            cVar.f71893f = ((sg.bigo.ads.ad.b.b) this).C;
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public void a(@Nullable MediaView mediaView) {
        f fVar;
        if (this.J == null || mediaView == null) {
            return;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (!aVar.aS() || (fVar = this.S) == null) {
            mediaView.a(aVar, this.J, this.T);
            a(mediaView.getVideoController(), this.f67537b.f69377b.i());
            return;
        }
        boolean zI = this.f67537b.f69377b.i();
        if (fVar.f67441d != null) {
            mediaView.a(fVar.f67445h);
            VideoController videoController = mediaView.getVideoController();
            if (videoController != null) {
                videoController.mute(zI);
            }
        }
    }

    public void a(VideoController videoController, boolean z10) {
        if (videoController != null) {
            videoController.mute(z10);
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public void a(@NonNull final sg.bigo.ads.api.b.d.a<NativeAd> aVar, int i10) {
        sg.bigo.ads.api.a.j jVarN;
        final sg.bigo.ads.api.core.b bVar = this.f67537b.f69376a;
        if (!(bVar instanceof sg.bigo.ads.core.a.a)) {
            aVar.a(this, 1030, 1400, "NativeVideo with invalid AdData class type.");
            return;
        }
        sg.bigo.ads.api.core.n.c cVarAy = ((sg.bigo.ads.core.a.a) bVar).ay();
        if (cVarAy == null) {
            aVar.a(this, 1031, 1401, "Missing media video.");
            return;
        }
        final String strC = cVarAy.c();
        h hVar = i.f69318a;
        if (hVar == null || (jVarN = hVar.n()) == null || !jVarN.a(14)) {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(aVar, bVar, c.a(c.this, strC), false);
                }
            });
        } else {
            sg.bigo.ads.common.u.a.e.f().execute(new Runnable() { // from class: sg.bigo.ads.ad.b.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(aVar, bVar, c.a(c.this, strC), true);
                }
            });
        }
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
    public void a(@NonNull sg.bigo.ads.api.b.d.a<NativeAd> aVar, @NonNull sg.bigo.ads.api.core.b bVar, int i10, boolean z10) {
        m mVarE;
        sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) f();
        if (!aVar2.aS()) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(i10, aVar, aVar2, bVar);
            if (z10) {
                sg.bigo.ads.common.n.d.a(1, anonymousClass4);
                return;
            } else {
                anonymousClass4.run();
                return;
            }
        }
        this.f69342ac.f69414a = aVar2.bs();
        f fVar = new f(this.f67537b.f69380e, this.T, aVar2, this.J, aVar, this);
        this.S = fVar;
        int iX = fVar.f67440c.x();
        boolean z11 = false;
        if (iX != 1 && iX != 2 && (iX == 3 || iX == 4 || (iX == 12 ? !((mVarE = fVar.f67440c.e()) == null || 6 != mVarE.a("video_play_page.ad_component_layout", 1)) : iX == 20))) {
            z11 = true;
        }
        if (!z11) {
            fVar.f67442e.a(fVar.f67438a, 1006, 10066, "Failed to support VPAID.");
            return;
        }
        f.AnonymousClass1 anonymousClass1 = new f.AnonymousClass1(i10);
        if (z10) {
            sg.bigo.ads.common.n.d.a(1, anonymousClass1);
        } else {
            anonymousClass1.run();
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void a_() {
        f fVar = this.S;
        if (fVar == null || !fVar.a()) {
            super.a_();
            sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "BIGOAds impression method");
        }
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        VideoController videoController = getVideoController();
        if (videoController != null) {
            videoController.setVideoLifeCallback(null);
        }
        super.destroyInMainThread();
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            if (cVar.f71890c && !cVar.f71889b) {
                cVar.f71889b = true;
            }
            p pVar = cVar.f71888a;
            if (pVar != null) {
                Iterator<n> it = pVar.f71471l.iterator();
                while (it.hasNext()) {
                    cVar.a(it.next(), "va_des");
                }
            }
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "destroy");
            cVar.f71893f = null;
        }
        f fVar = this.S;
        if (fVar != null) {
            sg.bigo.ads.core.player.b.d dVar = fVar.f67445h;
            if (dVar != null) {
                u.b(dVar);
                fVar.f67445h.d();
                fVar.f67445h = null;
            }
            fVar.f67438a = null;
            fVar.f67440c = null;
            fVar.f67444g = null;
            fVar.f67441d = null;
            this.S = null;
        }
        this.O = null;
    }

    public boolean e(int i10) {
        return (sg.bigo.ads.api.core.a.e(i10) && this.f67537b.f69377b.h()) || (this instanceof sg.bigo.ads.ad.b.a.b) || this.K;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.api.NativeAd
    public NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.VIDEO;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.api.NativeAd
    @Nullable
    public VideoController getVideoController() {
        MediaView mediaView = ((sg.bigo.ads.ad.b.b) this).E;
        if (mediaView != null) {
            return mediaView.getVideoController();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public void h() {
        super.h();
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            if (!cVar.f71889b) {
                cVar.f71889b = true;
            }
            sg.bigo.ads.core.player.c.a(aVar, 1);
            Iterator<n> it = cVar.f71888a.f71460a.iterator();
            while (it.hasNext()) {
                cVar.a(it.next(), "va_show", aVar);
            }
        }
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    @CallSuper
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(this.R);
        this.R.f67430a = adInteractionListener;
    }
}
