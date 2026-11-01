package sg.bigo.ads.ad.interstitial;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAdView;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.AutoNextLineLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    @NonNull
    public final d A;

    @NonNull
    public final e B;
    public c C;

    @Nullable
    private final f F;

    @Nullable
    private Runnable G;

    @Nullable
    private Runnable H;

    @Nullable
    private View I;
    private int M;
    private long N;
    private boolean O;

    @Nullable
    private Runnable P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f68767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.b.b f68768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.api.core.b f68769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.api.a.m f68770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Runnable f68771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public FrameLayout f68772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public FrameLayout f68773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public AlertDialog f68774h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f68781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f68782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f68783q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f68785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<Integer> f68786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f68787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Runnable f68788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public Runnable f68789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Runnable f68790x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final a f68792z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f68775i = true;
    private boolean J = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f68776j = false;
    private boolean K = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f68777k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f68778l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f68779m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f68780n = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f68784r = 0;
    private long L = -1;

    @NonNull
    private final List<Runnable> Q = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final b f68791y = new b();
    public boolean D = false;
    public int E = 0;

    @SuppressLint({"ClickableViewAccessibility"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f68871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f68872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f68873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f68874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f68875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f68876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f68877h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f68878i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f68879j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f68880k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f68881l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public View f68882m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public View f68883n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public View f68884o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public p f68885p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        public final Map<View, sg.bigo.ads.core.adview.h> f68886q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NonNull
        public final sg.bigo.ads.core.adview.h f68887r;

        private a() {
            this.f68870a = 0;
            this.f68886q = new HashMap();
            this.f68887r = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.p.a.1
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i10, int i11, int i12, int i13, int i14, int i15) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Disable click by style config.");
                }
            };
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        public static /* synthetic */ View a(a aVar, View view, float f10, float f11) {
            ArrayList arrayList = new ArrayList();
            aVar.a(view, f10, f11, 0, new int[2], arrayList);
            if (arrayList.size() > 0) {
                return arrayList.get(arrayList.size() - 1);
            }
            return null;
        }

        private void a(View view, float f10, float f11, int i10, @NonNull int[] iArr, @NonNull List<View> list) {
            if (i10 > 10) {
                return;
            }
            int i11 = i10 + 1;
            if (view == null) {
                return;
            }
            view.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            if (f10 > i12 && f10 < i12 + view.getWidth() && f11 > i13 && f11 < i13 + view.getHeight() && (view.getTag() instanceof Integer) && this.f68886q.containsKey(view)) {
                list.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    a(viewGroup.getChildAt(i14), f10, f11, i11, iArr, list);
                }
            }
        }

        private void a(final sg.bigo.ads.ad.b.b bVar, @NonNull final View view, final int i10) {
            final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.p.a.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public boolean f68889a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f68890b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f68891c;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f68896h = 11;

                private View a(float f10) {
                    a aVar = a.this;
                    if (f10 < aVar.f68877h) {
                        return aVar.f68883n;
                    }
                    int i11 = aVar.f68875f;
                    if (i11 <= 0 || f10 <= aVar.f68879j - i11) {
                        return null;
                    }
                    return aVar.f68884o;
                }

                /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
                /* JADX WARN: Code duplicated, block: B:30:0x00be  */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean z10;
                    int i11;
                    int iIntValue;
                    String str;
                    if (motionEvent.getActionMasked() == 0) {
                        a.this.f68880k = motionEvent.getRawX();
                        a.this.f68881l = motionEvent.getRawY();
                        this.f68890b = view.getScrollX();
                        this.f68891c = view.getScrollY();
                        this.f68889a = false;
                        a aVar = a.this;
                        aVar.f68882m = a(aVar.f68881l);
                        a aVar2 = a.this;
                        if (aVar2.f68882m == null) {
                            aVar2.f68882m = a.a(aVar2, view, motionEvent.getRawX(), motionEvent.getRawY());
                        }
                        return !view.isScrollContainer();
                    }
                    if (motionEvent.getActionMasked() == 2) {
                        if (i10 == 3 && (Math.abs(motionEvent.getRawX() - a.this.f68880k) >= scaledTouchSlop || Math.abs(motionEvent.getRawY() - a.this.f68881l) >= scaledTouchSlop)) {
                            this.f68889a = true;
                        }
                    } else if (motionEvent.getActionMasked() == 1) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        View viewA = a(rawY);
                        if (viewA == null) {
                            viewA = a.a(a.this, view, motionEvent.getRawX(), motionEvent.getRawY());
                        }
                        int i12 = i10;
                        if (i12 == 2) {
                            if (a.this.f68882m == viewA) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else if (i12 == 3) {
                            a aVar3 = a.this;
                            if (aVar3.f68882m != viewA || this.f68889a || Math.abs(rawX - aVar3.f68880k) >= scaledTouchSlop || Math.abs(rawY - a.this.f68881l) >= scaledTouchSlop) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else if (viewA != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            sg.bigo.ads.core.adview.h hVarA = null;
                            a aVar4 = a.this;
                            if (viewA == aVar4.f68883n) {
                                viewA = view;
                                sg.bigo.ads.ad.b.b bVar2 = bVar;
                                hVarA = aVar4.a(bVar2, aVar4.f68878i ? bVar2 : aVar4.f68887r);
                                iIntValue = 24;
                                if (!a.this.f68878i) {
                                    str = "Forbid click by up area.";
                                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", str);
                                }
                                i11 = iIntValue;
                            } else {
                                if (viewA == aVar4.f68884o) {
                                    viewA = view;
                                    sg.bigo.ads.ad.b.b bVar3 = bVar;
                                    hVarA = aVar4.a(bVar3, aVar4.f68876g ? bVar3 : aVar4.f68887r);
                                    iIntValue = 25;
                                    if (!a.this.f68876g) {
                                        str = "Forbid click by below area.";
                                        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", str);
                                    }
                                } else {
                                    if (viewA != null) {
                                        hVarA = aVar4.f68886q.get(viewA);
                                        Object tag = viewA.getTag();
                                        if (tag instanceof Integer) {
                                            iIntValue = ((Integer) tag).intValue();
                                        }
                                    }
                                    i11 = 0;
                                }
                                i11 = iIntValue;
                            }
                            if (viewA != null) {
                                if (hVarA == null) {
                                    hVarA = a.this.f68887r;
                                }
                                sg.bigo.ads.core.adview.h hVar = hVarA;
                                int[] iArr = new int[2];
                                View view3 = view2;
                                view3.getLocationOnScreen(iArr);
                                View view4 = view;
                                int x10 = (int) motionEvent.getX();
                                int y10 = (int) motionEvent.getY();
                                a aVar5 = a.this;
                                int left = ((int) aVar5.f68880k) - iArr[0];
                                int i13 = ((int) aVar5.f68881l) - iArr[1];
                                int i14 = this.f68896h;
                                int i15 = 0;
                                int top2 = i13;
                                int top3 = y10;
                                int left2 = x10;
                                while (i15 < 100 && (view3.getParent() instanceof ViewGroup)) {
                                    i15++;
                                    if (view3 == view4 || (view3 instanceof NativeAdView)) {
                                        break;
                                    }
                                    left2 += view3.getLeft();
                                    left += view3.getLeft();
                                    top3 += view3.getTop();
                                    top2 += view3.getTop();
                                    view3 = (View) view3.getParent();
                                }
                                if (hVar != null) {
                                    hVar.a(left2, top3, left, top2, i14, i11);
                                }
                            }
                        }
                        if (Math.abs(rawX - a.this.f68880k) < scaledTouchSlop && Math.abs(rawY - a.this.f68881l) < scaledTouchSlop) {
                            return true;
                        }
                    }
                    return false;
                }
            });
        }

        private void a(sg.bigo.ads.ad.b.b bVar, @NonNull View view, @NonNull View view2, sg.bigo.ads.core.adview.h hVar, int i10) {
            if (hVar == null) {
                view2.setOnTouchListener(null);
            } else {
                a(bVar, view, i10);
            }
        }

        public final sg.bigo.ads.core.adview.h a(final sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.core.adview.h hVar) {
            return hVar == bVar ? new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.p.a.3
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i10, int i11, int i12, int i13, int i14, int i15) {
                    a.this.f68885p.f68779m = true;
                    bVar.a(i10, i11, i12, i13, i14, i15);
                }
            } : hVar;
        }

        public final void a(sg.bigo.ads.ad.b.b bVar, @NonNull View view, @NonNull View view2, int i10, @Nullable sg.bigo.ads.core.adview.h hVar) {
            if (view.getTag() != null) {
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Error that touch view exists another tag.");
            }
            view.setTag(R.id.content, "TouchView");
            view2.setTag(Integer.valueOf(i10));
            if (hVar != null) {
                this.f68886q.put(view2, hVar);
            }
            a(bVar, view, view2, hVar, this.f68870a);
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f68900a = false;

        public b() {
        }

        private void b(Runnable runnable) {
            p.b(p.this);
            sg.bigo.ads.common.n.d.a(2, runnable);
        }

        public final boolean a() {
            p pVar = p.this;
            if (pVar.f68775i && !this.f68900a) {
                this.f68900a = true;
                Runnable runnable = pVar.f68789w;
                if (runnable != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Show mid page due to close button pressed in main page.");
                    b(runnable);
                    return true;
                }
            }
            return false;
        }

        public final boolean a(@Nullable Runnable runnable) {
            Runnable runnable2;
            p pVar = p.this;
            if (pVar.f68775i && !this.f68900a) {
                this.f68900a = true;
                Runnable runnable3 = pVar.f68789w;
                if (runnable3 == null && (runnable2 = pVar.f68788v) != null) {
                    sg.bigo.ads.common.n.d.a(runnable2);
                    p pVar2 = p.this;
                    runnable3 = pVar2.f68788v;
                    pVar2.f68789w = runnable3;
                }
                if (runnable3 != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Show mid page due to video completion.");
                    p.this.f68790x = runnable;
                    b(runnable3);
                    return true;
                }
            }
            return false;
        }
    }

    public interface c {
        boolean a(Runnable runnable);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f68903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68904c;

        private d() {
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f68905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f68906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f68907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<Integer, Long> f68908d;

        private e() {
            this.f68908d = new HashMap();
        }

        public /* synthetic */ e(byte b10) {
            this();
        }

        public static int a(int i10, boolean z10) {
            if (i10 == 1) {
                return z10 ? 2 : 1;
            }
            if (i10 == 2) {
                return 4;
            }
            if (i10 == 3) {
                return 3;
            }
            if (i10 == 4) {
                return 5;
            }
            return i10 == 5 ? 6 : 0;
        }

        private static int a(@NonNull String str, int i10) {
            return (str + i10).hashCode();
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i10, String str, int i11) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iA = a(str, i11);
            if (this.f68908d.get(Integer.valueOf(iA)) == null) {
                this.f68908d.put(Integer.valueOf(iA), Long.valueOf(SystemClock.elapsedRealtime()));
                sg.bigo.ads.core.d.b.a(bVar, a(i10, false), 1, String.valueOf(iA), 0L, false, 0, (String) null);
            }
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i10, String str, int i11, int i12, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iA = a(str, i11);
            Long l10 = this.f68908d.get(Integer.valueOf(iA));
            if (l10 == null) {
                return;
            }
            sg.bigo.ads.core.d.b.a(bVar, a(i10, false), 6, String.valueOf(iA), SystemClock.elapsedRealtime() - l10.longValue(), true, i12, str2);
        }

        public final void a(sg.bigo.ads.api.core.b bVar, boolean z10, int i10, String str) {
            if (this.f68907c || this.f68905a <= 0) {
                return;
            }
            this.f68907c = true;
            sg.bigo.ads.core.d.b.a(bVar, a(1, z10), 4, (String) null, SystemClock.elapsedRealtime() - this.f68905a, true, i10, str);
        }

        public final void b(sg.bigo.ads.api.core.b bVar, int i10, String str, int i11) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iA = a(str, i11);
            Long l10 = this.f68908d.get(Integer.valueOf(iA));
            if (l10 == null) {
                return;
            }
            sg.bigo.ads.core.d.b.a(bVar, a(i10, false), 5, String.valueOf(iA), SystemClock.elapsedRealtime() - l10.longValue(), false, 0, (String) null);
        }
    }

    public p(Context context, @NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.core.b bVar2, sg.bigo.ads.api.a.m mVar, boolean z10, f fVar, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        byte b10 = 0;
        this.f68781o = false;
        this.f68792z = new a(b10);
        this.A = new d(b10);
        this.B = new e(b10);
        this.f68767a = context;
        this.f68768b = bVar;
        this.f68769c = bVar2;
        this.F = fVar;
        this.f68770d = mVar;
        this.f68781o = z10;
        this.f68771e = runnable;
        this.G = runnable2;
        this.H = runnable3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:105:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:122:0x0316  */
    /* JADX WARN: Code duplicated, block: B:134:0x037c  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:170:0x042e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0489  */
    /* JADX WARN: Code duplicated, block: B:188:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:190:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:191:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:194:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:196:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:197:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:201:0x04db  */
    /* JADX WARN: Code duplicated, block: B:202:0x04de  */
    /* JADX WARN: Code duplicated, block: B:204:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0116  */
    /* JADX WARN: Code duplicated, block: B:79:0x0118  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x026a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r49v0, types: [sg.bigo.ads.ad.interstitial.p] */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.ViewGroup] */
    @Nullable
    private View a(Context context, sg.bigo.ads.ad.b.b bVar, final sg.bigo.ads.api.core.b bVar2, boolean z10) {
        String strC;
        String strA;
        String strA2;
        String str;
        String[] strArr;
        String[] strArrD;
        String str2;
        int i10;
        View viewA;
        View viewFindViewById;
        String str3;
        TextView textView;
        TextView textView2;
        TextView textView3;
        View viewFindViewById2;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        View viewFindViewById3;
        TextView textView7;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        View viewFindViewById7;
        View viewFindViewById8;
        ViewGroup viewGroup;
        AutoNextLineLinearLayout autoNextLineLinearLayout;
        RoundedFrameLayout roundedFrameLayout;
        String str4;
        String str5;
        int iA;
        int i11;
        View view;
        a aVar;
        sg.bigo.ads.core.adview.h hVar;
        a aVar2;
        sg.bigo.ads.core.adview.h hVar2;
        a aVar3;
        sg.bigo.ads.core.adview.h hVar3;
        boolean z11;
        final String strB;
        String str6;
        View viewFindViewById9;
        sg.bigo.ads.api.core.n.a aVarAv;
        String strN = bVar2.n();
        if (TextUtils.isEmpty(strN)) {
            return null;
        }
        sg.bigo.ads.api.core.b.d dVarQ = bVar2.q();
        if (dVarQ != null) {
            strC = dVarQ.a();
            strA = dVarQ.b();
            strA2 = dVarQ.c();
            String strF = dVarQ.f();
            String[] strArrE = dVarQ.e();
            strArrD = dVarQ.d();
            strArr = strArrE;
            str = strF;
        } else {
            strC = null;
            strA = null;
            strA2 = null;
            str = null;
            strArr = null;
            strArrD = null;
        }
        boolean z12 = bVar2 instanceof sg.bigo.ads.core.a.a;
        if (z12) {
            sg.bigo.ads.core.a.a aVar4 = (sg.bigo.ads.core.a.a) bVar2;
            if ((TextUtils.isEmpty(strC) || !URLUtil.isNetworkUrl(strC)) && (aVarAv = aVar4.av()) != null) {
                strC = aVarAv.c();
            }
            if (TextUtils.isEmpty(strA)) {
                strA = aVar4.s();
            }
            if (TextUtils.isEmpty(strA2)) {
                strA2 = aVar4.t();
            }
            if (TextUtils.isEmpty(strC) || !URLUtil.isNetworkUrl(strC)) {
                if (aVar4.aR()) {
                    strC = sg.bigo.ads.common.o.b(context, aVar4.aN());
                } else {
                    String strAT = aVar4.aT();
                    if (!TextUtils.isEmpty(strAT) && URLUtil.isNetworkUrl(strAT)) {
                        strC = strAT;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(strA)) {
            strA = sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_title_default, new Object[0]);
        }
        String str7 = strA;
        if (TextUtils.isEmpty(strA2)) {
            strA2 = sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_description_default, new Object[0]);
        }
        String strC2 = (TextUtils.isEmpty(null) || sg.bigo.ads.common.utils.q.a() < 4.0f) ? sg.bigo.ads.ad.b.e.c(strN) : null;
        String strB2 = TextUtils.isEmpty(null) ? sg.bigo.ads.ad.b.e.b(strN) : null;
        String strA3 = TextUtils.isEmpty(null) ? sg.bigo.ads.ad.b.e.a(strN) : null;
        try {
            ?? r10 = this.f68781o;
            try {
                if (r10 != 0) {
                    if (z10) {
                        str2 = strA3;
                        try {
                            viewA = sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_interstitial_mid_page_native_view_landscape, null, false);
                        } catch (Throwable unused) {
                            return null;
                        }
                    } else {
                        str2 = strA3;
                        f fVar = this.F;
                        if (fVar == null || !fVar.f68410d) {
                            r10 = 0;
                            i10 = R.layout.bigo_ad_layout_interstitial_mid_page_native_fallback_view_landscape;
                        } else {
                            i10 = R.layout.bigo_ad_layout_interstitial_mid_page_native_fallback_view_download_info_landscape;
                            r10 = 0;
                        }
                    }
                    if (viewA == null) {
                        viewFindViewById = null;
                    } else {
                        viewFindViewById = viewA.findViewById(R.id.inter_mid_native_view);
                    }
                    if (viewFindViewById != null) {
                        return viewA;
                    }
                    final AdImageView adImageView = (AdImageView) viewFindViewById.findViewById(R.id.inter_iv_icon);
                    str3 = strB2;
                    textView = (TextView) viewFindViewById.findViewById(R.id.inter_tv_title);
                    textView2 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_desc);
                    textView3 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_desc_below);
                    TextView textView8 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_company_name);
                    viewFindViewById2 = viewFindViewById.findViewById(R.id.inter_ll_start_rate);
                    textView4 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_start_rate);
                    textView5 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_comment);
                    textView6 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_download_num);
                    viewFindViewById3 = viewFindViewById.findViewById(R.id.inter_tv_download_num_desc);
                    textView7 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_age);
                    viewFindViewById4 = viewFindViewById.findViewById(R.id.inter_iv_age);
                    viewFindViewById5 = viewFindViewById.findViewById(R.id.bigo_ad_btn_cta);
                    viewFindViewById6 = viewFindViewById.findViewById(R.id.bigo_ad_btn_cta_inner);
                    viewFindViewById7 = viewFindViewById.findViewById(R.id.inter_tv_gp_info_extra_about);
                    viewFindViewById8 = viewFindViewById.findViewById(R.id.inter_iv_gp_info_extra_arrow);
                    viewGroup = (ViewGroup) viewFindViewById.findViewById(R.id.inter_ll_media);
                    autoNextLineLinearLayout = (AutoNextLineLinearLayout) viewFindViewById.findViewById(R.id.inter_fbl_genre);
                    roundedFrameLayout = (RoundedFrameLayout) viewFindViewById.findViewById(R.id.inter_fl_icon);
                    str4 = strC2;
                    str5 = strA2;
                    if (roundedFrameLayout != null) {
                        roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context, 1));
                        roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.q.b("#05000000", -7829368));
                    }
                    iA = r.a(bVar, this.A.f68904c, null);
                    if (!z10 && (viewFindViewById9 = viewFindViewById.findViewById(R.id.inter_ll_native_extra)) != null) {
                        viewFindViewById9.setVisibility(0);
                    }
                    if (TextUtils.isEmpty(strC) && adImageView != null) {
                        adImageView.setIconTag(true);
                        adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        adImageView.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#FFE1E1E6", -7829368));
                        adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
                        final ArrayList arrayList = new ArrayList();
                        sg.bigo.ads.common.p.g gVar = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.4
                            @Override // sg.bigo.ads.common.p.g
                            public final void a(int i12, @NonNull String str8, String str9) {
                            }

                            @Override // sg.bigo.ads.common.p.g
                            public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar2) {
                                adImageView.setBackground(null);
                            }
                        };
                        adImageView.a(gVar);
                        arrayList.add(gVar);
                        a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                arrayList.clear();
                                adImageView.a();
                            }
                        });
                        adImageView.a(strC, bVar2.al());
                        a(viewFindViewById, adImageView, 1, bVar, bVar);
                    }
                    if (!TextUtils.isEmpty(str7) && textView != null) {
                        textView.setText(str7);
                        a(viewFindViewById, textView, 2, bVar, bVar);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        if (textView2 != null) {
                            textView2.setText(str5);
                            str6 = str5;
                            a(viewFindViewById, textView2, 6, bVar, bVar);
                        } else {
                            str6 = str5;
                        }
                        if (z10 && textView3 != null) {
                            textView3.setText(str6);
                            a(viewFindViewById, textView3, 6, bVar, bVar);
                        }
                    }
                    if (!TextUtils.isEmpty(str) || textView8 == null) {
                        i11 = iA;
                    } else {
                        textView8.setVisibility(0);
                        textView8.setText(str);
                        i11 = iA;
                        textView8.setTextColor(i11);
                        a(viewFindViewById, textView8, 26, bVar, bVar);
                    }
                    if (!TextUtils.isEmpty(str4) && textView4 != null) {
                        textView4.setText(str4);
                        a(viewFindViewById, textView4, 26, bVar, bVar);
                    }
                    if (viewFindViewById2 != null) {
                        a(viewFindViewById, viewFindViewById2, 26, bVar, bVar);
                    }
                    if (!TextUtils.isEmpty(str3) && str3 != null) {
                        textView5.setText(str3 + Z7.f27998r + sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_comment_num_text, new Object[0]));
                        a(viewFindViewById, textView5, 26, bVar, bVar);
                    }
                    if (!TextUtils.isEmpty(str2) && textView6 != null) {
                        textView6.setText(str2);
                        a(viewFindViewById, textView6, 26, bVar, bVar);
                    }
                    if (viewFindViewById3 != null) {
                        a(viewFindViewById, viewFindViewById3, 26, bVar, bVar);
                    }
                    if (!TextUtils.isEmpty("Everyone") && textView7 != null) {
                        textView7.setText("Everyone");
                        a(viewFindViewById, textView7, 26, bVar, bVar);
                    }
                    if (viewFindViewById4 != null) {
                        a(viewFindViewById, viewFindViewById4, 26, bVar, bVar);
                    }
                    if (viewFindViewById5 != null) {
                        if (viewFindViewById6 != null) {
                            viewFindViewById6.setBackgroundColor(i11);
                        }
                        a(viewFindViewById, viewFindViewById5, 7, bVar, bVar);
                    }
                    if (z10 && strArr != null && strArr.length > 0 && viewGroup != null) {
                        a(context, viewGroup, bVar, bVar2, strArr);
                    }
                    if (z10 && z12) {
                        view = viewFindViewById;
                        RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) view.findViewById(R.id.inter_ll_fallback_media);
                        if (roundedFrameLayout2 != null) {
                            roundedFrameLayout2.setVisibility(0);
                        }
                        final AdImageView adImageView2 = (AdImageView) view.findViewById(R.id.inter_iv_fallback_media);
                        if (adImageView2 != null) {
                            sg.bigo.ads.core.a.a aVar5 = (sg.bigo.ads.core.a.a) bVar2;
                            String strAT2 = aVar5.aT();
                            if (!TextUtils.isEmpty(strAT2) && URLUtil.isNetworkUrl(strAT2)) {
                                z11 = false;
                                strB = strAT2;
                            } else if (aVar5.aR()) {
                                strB = sg.bigo.ads.common.o.b(context, aVar5.aN());
                                if (TextUtils.isEmpty(strB)) {
                                    z11 = false;
                                    strB = null;
                                } else {
                                    z11 = true;
                                }
                            } else {
                                z11 = false;
                                strB = null;
                            }
                            if (!TextUtils.isEmpty(strB)) {
                                final ArrayList arrayList2 = new ArrayList();
                                if (!z11) {
                                    this.B.a(bVar2, 4, strB, -1);
                                }
                                sg.bigo.ads.common.p.g gVar2 = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.6
                                    @Override // sg.bigo.ads.common.p.g
                                    public final void a(int i12, @NonNull String str8, String str9) {
                                        p.this.B.a(bVar2, 4, strB, -1, i12, str8);
                                    }

                                    @Override // sg.bigo.ads.common.p.g
                                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar2) {
                                        p.this.B.b(bVar2, 4, strB, -1);
                                    }
                                };
                                adImageView2.a(gVar2);
                                arrayList2.add(gVar2);
                                a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        arrayList2.clear();
                                        adImageView2.a();
                                    }
                                });
                                roundedFrameLayout2.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context, 1));
                                roundedFrameLayout2.setStrokeColor(sg.bigo.ads.common.utils.q.b("#08000000", -7829368));
                                adImageView2.a(strB, bVar2.al());
                                a aVar6 = this.f68792z;
                                a(view, adImageView2, 5, bVar, aVar6.f68872c ? bVar : aVar6.f68887r);
                            }
                        }
                    } else {
                        view = viewFindViewById;
                    }
                    if (strArrD != null && strArrD.length > 0 && autoNextLineLinearLayout != null) {
                        a(context, view, bVar, autoNextLineLinearLayout, strArrD);
                    }
                    if (viewFindViewById7 != null) {
                        aVar3 = this.f68792z;
                        if (aVar3.f68871b) {
                            hVar3 = bVar;
                        } else {
                            hVar3 = aVar3.f68887r;
                        }
                        a(view, viewFindViewById7, 27, bVar, hVar3);
                    }
                    if (viewFindViewById8 != null) {
                        aVar2 = this.f68792z;
                        if (aVar2.f68871b) {
                            hVar2 = bVar;
                        } else {
                            hVar2 = aVar2.f68887r;
                        }
                        a(view, viewFindViewById8, 27, bVar, hVar2);
                    }
                    aVar = this.f68792z;
                    if (aVar.f68871b) {
                        hVar = bVar;
                    } else {
                        hVar = aVar.f68887r;
                    }
                    a(view, view, 18, bVar, hVar);
                    return viewA;
                }
                str2 = strA3;
                r10 = 0;
                i10 = R.layout.bigo_ad_layout_interstitial_mid_page_native_view;
                viewA = sg.bigo.ads.common.utils.a.a(context, i10, r10, false);
                if (viewA == null) {
                    viewFindViewById = null;
                } else {
                    viewFindViewById = viewA.findViewById(R.id.inter_mid_native_view);
                }
                if (viewFindViewById != null) {
                    return viewA;
                }
                final AdImageView adImageView3 = (AdImageView) viewFindViewById.findViewById(R.id.inter_iv_icon);
                str3 = strB2;
                textView = (TextView) viewFindViewById.findViewById(R.id.inter_tv_title);
                textView2 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_desc);
                textView3 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_desc_below);
                TextView textView9 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_company_name);
                viewFindViewById2 = viewFindViewById.findViewById(R.id.inter_ll_start_rate);
                textView4 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_start_rate);
                textView5 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_comment);
                textView6 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_download_num);
                viewFindViewById3 = viewFindViewById.findViewById(R.id.inter_tv_download_num_desc);
                textView7 = (TextView) viewFindViewById.findViewById(R.id.inter_tv_age);
                viewFindViewById4 = viewFindViewById.findViewById(R.id.inter_iv_age);
                viewFindViewById5 = viewFindViewById.findViewById(R.id.bigo_ad_btn_cta);
                viewFindViewById6 = viewFindViewById.findViewById(R.id.bigo_ad_btn_cta_inner);
                viewFindViewById7 = viewFindViewById.findViewById(R.id.inter_tv_gp_info_extra_about);
                viewFindViewById8 = viewFindViewById.findViewById(R.id.inter_iv_gp_info_extra_arrow);
                viewGroup = (ViewGroup) viewFindViewById.findViewById(R.id.inter_ll_media);
                autoNextLineLinearLayout = (AutoNextLineLinearLayout) viewFindViewById.findViewById(R.id.inter_fbl_genre);
                roundedFrameLayout = (RoundedFrameLayout) viewFindViewById.findViewById(R.id.inter_fl_icon);
                str4 = strC2;
                str5 = strA2;
                if (roundedFrameLayout != null) {
                    roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context, 1));
                    roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.q.b("#05000000", -7829368));
                }
                iA = r.a(bVar, this.A.f68904c, null);
                if (!z10) {
                }
                if (TextUtils.isEmpty(strC)) {
                }
                if (!TextUtils.isEmpty(str7)) {
                    textView.setText(str7);
                    a(viewFindViewById, textView, 2, bVar, bVar);
                }
                if (!TextUtils.isEmpty(str5)) {
                    if (textView2 != null) {
                        textView2.setText(str5);
                        str6 = str5;
                        a(viewFindViewById, textView2, 6, bVar, bVar);
                    } else {
                        str6 = str5;
                    }
                    if (z10) {
                        textView3.setText(str6);
                        a(viewFindViewById, textView3, 6, bVar, bVar);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    i11 = iA;
                } else {
                    i11 = iA;
                }
                if (!TextUtils.isEmpty(str4)) {
                    textView4.setText(str4);
                    a(viewFindViewById, textView4, 26, bVar, bVar);
                }
                if (viewFindViewById2 != null) {
                    a(viewFindViewById, viewFindViewById2, 26, bVar, bVar);
                }
                if (!TextUtils.isEmpty(str3)) {
                    textView5.setText(str3 + Z7.f27998r + sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_comment_num_text, new Object[0]));
                    a(viewFindViewById, textView5, 26, bVar, bVar);
                }
                if (!TextUtils.isEmpty(str2)) {
                    textView6.setText(str2);
                    a(viewFindViewById, textView6, 26, bVar, bVar);
                }
                if (viewFindViewById3 != null) {
                    a(viewFindViewById, viewFindViewById3, 26, bVar, bVar);
                }
                if (!TextUtils.isEmpty("Everyone")) {
                    textView7.setText("Everyone");
                    a(viewFindViewById, textView7, 26, bVar, bVar);
                }
                if (viewFindViewById4 != null) {
                    a(viewFindViewById, viewFindViewById4, 26, bVar, bVar);
                }
                if (viewFindViewById5 != null) {
                    if (viewFindViewById6 != null) {
                        viewFindViewById6.setBackgroundColor(i11);
                    }
                    a(viewFindViewById, viewFindViewById5, 7, bVar, bVar);
                }
                if (z10) {
                    a(context, viewGroup, bVar, bVar2, strArr);
                }
                if (z10) {
                    view = viewFindViewById;
                } else {
                    view = viewFindViewById;
                }
                if (strArrD != null) {
                    a(context, view, bVar, autoNextLineLinearLayout, strArrD);
                }
                if (viewFindViewById7 != null) {
                    aVar3 = this.f68792z;
                    if (aVar3.f68871b) {
                        hVar3 = bVar;
                    } else {
                        hVar3 = aVar3.f68887r;
                    }
                    a(view, viewFindViewById7, 27, bVar, hVar3);
                }
                if (viewFindViewById8 != null) {
                    aVar2 = this.f68792z;
                    if (aVar2.f68871b) {
                        hVar2 = bVar;
                    } else {
                        hVar2 = aVar2.f68887r;
                    }
                    a(view, viewFindViewById8, 27, bVar, hVar2);
                }
                aVar = this.f68792z;
                if (aVar.f68871b) {
                    hVar = bVar;
                } else {
                    hVar = aVar.f68887r;
                }
                a(view, view, 18, bVar, hVar);
                return viewA;
            } catch (Throwable unused2) {
                return r10;
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    @NonNull
    private FrameLayout a(@NonNull Context context, @NonNull View view, boolean z10) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        int i11 = this.A.f68903b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z10 ? -1 : -2);
        if (i11 == 1) {
            int iA = sg.bigo.ads.common.utils.e.a(context, 10);
            layoutParams.topMargin = iA;
            layoutParams.bottomMargin = iA;
            layoutParams.leftMargin = iA;
            layoutParams.rightMargin = iA;
            i10 = 17;
        } else {
            layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(context, 40);
            i10 = 80;
        }
        layoutParams.gravity = i10;
        frameLayout.addView(view, layoutParams);
        String str = this.f68768b.R().f69325g;
        if (sg.bigo.ads.common.utils.q.b((CharSequence) str)) {
            sg.bigo.ads.common.view.c.a(context, frameLayout, new sg.bigo.ads.common.view.c(context, str));
        }
        return frameLayout;
    }

    @NonNull
    private static LinearLayout a(Context context, View view, int i10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#F0F3F4", -7829368));
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.bigo_ad_btn_close);
        imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close_gray_light));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context, 24), sg.bigo.ads.common.utils.e.a(context, 24), 21);
        layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 20);
        frameLayout.addView(imageView, layoutParams);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, 48)));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, i10));
        return linearLayout;
    }

    private void a(@NonNull Context context, View view, sg.bigo.ads.ad.b.b bVar, @NonNull AutoNextLineLinearLayout autoNextLineLinearLayout, @NonNull String[] strArr) {
        for (String str : strArr) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    TextView textView = new TextView(context);
                    textView.setText(str);
                    textView.setTextColor(sg.bigo.ads.common.utils.q.b("#5F6367", -7829368));
                    textView.setTextSize(13.0f);
                    textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 5), sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 5));
                    textView.setGravity(17);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.q.b("#DBDDE0", -7829368));
                    gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 14));
                    textView.setBackground(gradientDrawable);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, sg.bigo.ads.common.utils.e.a(context, 28));
                    layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(context, 12);
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 12);
                    a(view, textView, 27, bVar, bVar);
                    autoNextLineLinearLayout.addView(textView, layoutParams);
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    private void a(@NonNull Context context, ViewGroup viewGroup, sg.bigo.ads.ad.b.b bVar, @NonNull final sg.bigo.ads.api.core.b bVar2, @NonNull String[] strArr) {
        String[] strArr2;
        ViewGroup viewGroup2;
        String[] strArr3 = strArr;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        final ArrayList arrayList = new ArrayList();
        int i10 = 0;
        ViewGroup viewGroup3 = linearLayout;
        while (i10 < strArr3.length) {
            final String str = strArr3[i10];
            if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                strArr2 = strArr3;
                viewGroup2 = viewGroup3;
            } else {
                final int iA = sg.bigo.ads.common.utils.e.a(context, 200);
                final RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context, 1));
                roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.q.b("#08000000", -7829368));
                final AdImageView adImageView = new AdImageView(context);
                adImageView.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#FFE1E1E6", -7829368));
                adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
                this.B.a(bVar2, 2, str, i10);
                ViewGroup viewGroup4 = viewGroup3;
                final int i11 = i10;
                sg.bigo.ads.common.p.g gVar = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.8
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i12, @NonNull String str2, String str3) {
                        p.this.B.a(bVar2, 2, str, i11, i12, str2);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        ViewGroup.LayoutParams layoutParams;
                        adImageView.setBackground(null);
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        if (width > 0 && height > 0 && (layoutParams = roundedFrameLayout.getLayoutParams()) != null) {
                            layoutParams.width = (width * iA) / height;
                        }
                        adImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        p.this.B.b(bVar2, 2, str, i11);
                    }
                };
                adImageView.a(gVar);
                arrayList.add(gVar);
                a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        adImageView.a();
                    }
                });
                adImageView.a(str, bVar2.al());
                roundedFrameLayout.addView(adImageView, new FrameLayout.LayoutParams(-1, -1));
                a aVar = this.f68792z;
                a(viewGroup, roundedFrameLayout, 5, bVar, aVar.f68872c ? bVar : aVar.f68887r);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context, 100), iA);
                layoutParams.leftMargin = i10 == 0 ? sg.bigo.ads.common.utils.e.a(context, 20) : sg.bigo.ads.common.utils.e.a(context, 12);
                strArr2 = strArr;
                if (i10 + 1 == strArr2.length) {
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 20);
                }
                viewGroup2 = viewGroup4;
                viewGroup2.addView(roundedFrameLayout, layoutParams);
            }
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.10
                @Override // java.lang.Runnable
                public final void run() {
                    arrayList.clear();
                }
            });
            i10++;
            strArr3 = strArr2;
            viewGroup3 = viewGroup2;
        }
        View view = viewGroup3;
        a aVar2 = this.f68792z;
        a(viewGroup, viewGroup, 18, bVar, aVar2.f68873d ? bVar : aVar2.f68887r);
        viewGroup.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull View view, @NonNull View view2, int i10, @NonNull sg.bigo.ads.ad.b.b bVar, @Nullable sg.bigo.ads.core.adview.h hVar) {
        a aVar = this.f68792z;
        aVar.a(bVar, view, view2, i10, aVar.a(bVar, hVar));
    }

    private void a(@NonNull Runnable runnable) {
        this.Q.add(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(p pVar, final Context context, final sg.bigo.ads.ad.b.b bVar, final sg.bigo.ads.api.core.b bVar2) {
        p pVar2;
        String[] strArrE;
        String strConcat;
        boolean z10;
        sg.bigo.ads.core.h.e eVarA;
        p pVar3 = pVar;
        int i10 = 0;
        int i11 = 0;
        while (!pVar3.J) {
            if (i11 > 10) {
                pVar3.a(bVar2);
                return;
            }
            int i12 = pVar3.M;
            List<Integer> list = pVar3.f68786t;
            if (list == null || i12 >= list.size()) {
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Failed to retrieve render way for index: " + i12 + ".");
                pVar3.a(bVar2);
                return;
            }
            Integer num = list.get(i12);
            pVar3.M++;
            int iIntValue = num.intValue();
            View viewA = null;
            if (iIntValue == 1) {
                sg.bigo.ads.common.t.a.a(i10, 3, "InterstitialMidPageRenderer", "Start to render web view for mid page.");
                String strO = bVar2.o();
                if (TextUtils.isEmpty(strO) || !URLUtil.isNetworkUrl(strO)) {
                    strO = null;
                }
                if (TextUtils.isEmpty(strO)) {
                    String strN = bVar2.n();
                    if (TextUtils.isEmpty(strN)) {
                        strConcat = strO;
                        z10 = i10;
                    } else {
                        strConcat = "https://play.google.com/store/apps/details?id=".concat(String.valueOf(strN));
                        z10 = 1;
                    }
                } else {
                    strConcat = strO;
                    z10 = i10;
                }
                if (TextUtils.isEmpty(strConcat) || (eVarA = sg.bigo.ads.core.h.e.a(context)) == null) {
                    pVar2 = pVar3;
                    i11 = i11;
                } else {
                    pVar.a(eVarA, eVarA, 28, bVar, bVar);
                    final boolean z11 = z10;
                    eVarA.setWebViewClient(new sg.bigo.ads.core.h.d() { // from class: sg.bigo.ads.ad.interstitial.p.13

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public boolean f68808a = false;

                        @Override // sg.bigo.ads.core.h.d
                        public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                            sg.bigo.ads.core.d.b.a(3002, 10105, "[MidPage] The render process was gone.");
                            if (this.f68808a) {
                                return;
                            }
                            this.f68808a = true;
                            p.a(p.this, context, bVar, bVar2, 1);
                            p.this.B.a(bVar2, z11, -1, "onRenderProcessGone");
                        }

                        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
                        public final void onPageFinished(WebView webView, String str) {
                            super.onPageFinished(webView, str);
                            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "onPageFinished  ".concat(String.valueOf(str)));
                            if (this.f68808a) {
                                return;
                            }
                            this.f68808a = true;
                            p.this.a(1, z11);
                            e eVar = p.this.B;
                            sg.bigo.ads.api.core.b bVar3 = bVar2;
                            boolean z12 = z11;
                            if (eVar.f68906b || eVar.f68905a <= 0) {
                                return;
                            }
                            eVar.f68906b = true;
                            sg.bigo.ads.core.d.b.a(bVar3, e.a(1, z12), 3, (String) null, SystemClock.elapsedRealtime() - eVar.f68905a, false, 0, (String) null);
                        }

                        @Override // android.webkit.WebViewClient
                        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                            super.onPageStarted(webView, str, bitmap);
                            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "onPageStarted ".concat(String.valueOf(str)));
                        }

                        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
                        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            e eVar;
                            sg.bigo.ads.api.core.b bVar3;
                            int i13;
                            boolean z12;
                            super.onReceivedError(webView, webResourceRequest, webResourceError);
                            String string = "onReceivedError";
                            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "onReceivedError");
                            if (this.f68808a) {
                                return;
                            }
                            this.f68808a = true;
                            p.a(p.this, context, bVar, bVar2, 1);
                            if (webResourceError == null) {
                                eVar = p.this.B;
                                bVar3 = bVar2;
                                z12 = z11;
                                i13 = -1;
                            } else {
                                CharSequence description = webResourceError.getDescription();
                                e eVar2 = p.this.B;
                                sg.bigo.ads.api.core.b bVar4 = bVar2;
                                boolean z13 = z11;
                                int errorCode = webResourceError.getErrorCode();
                                string = description == null ? "null" : description.toString();
                                eVar = eVar2;
                                bVar3 = bVar4;
                                i13 = errorCode;
                                z12 = z13;
                            }
                            eVar.a(bVar3, z12, i13, string);
                        }

                        @Override // android.webkit.WebViewClient
                        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                            return true;
                        }
                    });
                    e eVar = pVar3.B;
                    if (eVar.f68905a <= 0) {
                        eVar.f68905a = SystemClock.elapsedRealtime();
                        sg.bigo.ads.core.d.b.a(bVar2, e.a(1, z10), 1, (String) null, 0L, false, 0, (String) null);
                    }
                    eVarA.loadUrl(strConcat);
                    viewA = a(context, eVarA, -2);
                    pVar2 = pVar3;
                }
            } else {
                i11 = i11;
                if (iIntValue == 2) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Start to render native view for mid page.");
                    sg.bigo.ads.api.core.b.d dVarQ = bVar2.q();
                    if (dVarQ != null && (strArrE = dVarQ.e()) != null && strArrE.length > 0 && (viewA = pVar3.a(context, bVar, bVar2, true)) != null) {
                        pVar3.a(2, false);
                    }
                    pVar2 = pVar3;
                } else if (iIntValue == 3) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Start to render image view for mid page.");
                    final String strP = bVar2.p();
                    if (TextUtils.isEmpty(strP) || !URLUtil.isNetworkUrl(strP)) {
                        pVar2 = pVar;
                    } else {
                        final ImageView imageView = new ImageView(context);
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.setBackgroundColor(-1);
                        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1, 17));
                        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                        roundedFrameLayout.setId(R.id.bigo_ad_btn_close);
                        roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 12));
                        View view = new View(context);
                        view.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#33000000", -7829368));
                        roundedFrameLayout.addView(view, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context, 24), sg.bigo.ads.common.utils.e.a(context, 24), 17));
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setBackground(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close));
                        roundedFrameLayout.addView(imageView2, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 12), 17));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context, 24), sg.bigo.ads.common.utils.e.a(context, 24), 53);
                        layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(context, 18);
                        layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 22);
                        frameLayout.addView(roundedFrameLayout, layoutParams);
                        final FrameLayout frameLayoutB = pVar3.b(context, frameLayout, true);
                        final FrameLayout frameLayout2 = new FrameLayout(context);
                        frameLayout2.addView(frameLayoutB, new FrameLayout.LayoutParams(-1, -2, pVar3.A.f68903b != 1 ? 80 : 17));
                        pVar3.B.a(bVar2, 3, strP, 100);
                        sg.bigo.ads.common.p.e.a(bVar.f67537b.f69380e, strP, bVar2.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.11
                            @Override // sg.bigo.ads.common.p.g
                            public final void a(int i13, @NonNull String str, String str2) {
                                p.a(p.this, context, bVar, bVar2, 2);
                                p.this.B.a(bVar2, 3, strP, 100, i13, str);
                            }

                            @Override // sg.bigo.ads.common.p.g
                            public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                                final int width = bitmap.getWidth();
                                final int height = bitmap.getHeight();
                                frameLayout2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.11.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i13;
                                        int i14;
                                        int width2 = frameLayout2.getWidth();
                                        int height2 = frameLayout2.getHeight();
                                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                                        if (width2 <= 0 || height2 <= 0 || (i13 = width) <= 0 || (i14 = height) <= 0) {
                                            layoutParams2.width = -1;
                                            layoutParams2.height = -1;
                                            return;
                                        }
                                        if ((i13 * 1.0f) / i14 > (width2 * 1.0f) / height2) {
                                            layoutParams2.width = width2;
                                            layoutParams2.height = (width2 * i14) / i13;
                                        } else {
                                            layoutParams2.width = (i13 * height2) / i14;
                                            layoutParams2.height = height2;
                                        }
                                        imageView.requestLayout();
                                    }
                                });
                                imageView.setImageBitmap(bitmap);
                                p pVar4 = p.this;
                                FrameLayout frameLayout3 = frameLayoutB;
                                ImageView imageView3 = imageView;
                                sg.bigo.ads.ad.b.b bVar3 = bVar;
                                a aVar = pVar4.f68792z;
                                pVar4.a(frameLayout3, imageView3, 5, bVar3, aVar.f68872c ? bVar3 : aVar.f68887r);
                                p pVar5 = p.this;
                                FrameLayout frameLayout4 = frameLayoutB;
                                sg.bigo.ads.ad.b.b bVar4 = bVar;
                                a aVar2 = pVar5.f68792z;
                                pVar5.a(frameLayout4, frameLayout4, 18, bVar4, aVar2.f68873d ? bVar4 : aVar2.f68887r);
                                p.this.a(3, false);
                                p.this.B.b(bVar2, 3, strP, 100);
                            }
                        });
                        pVar2 = pVar;
                        viewA = frameLayout2;
                    }
                } else if (iIntValue == 4) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Start to render fallback view for mid page.");
                    pVar2 = pVar;
                    viewA = pVar2.a(context, bVar, bVar2, false);
                    if (viewA != null) {
                        pVar2.a(4, false);
                    }
                } else {
                    pVar2 = pVar;
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Error content view id.");
                }
            }
            if (viewA != null) {
                pVar2.I = viewA;
                return;
            } else {
                i11++;
                pVar3 = pVar2;
                i10 = 0;
            }
        }
        sg.bigo.ads.common.t.a.a(i10, 3, "InterstitialMidPageRenderer", "Failed to retrieve render way for already.");
    }

    public static /* synthetic */ void a(p pVar, final Context context, final sg.bigo.ads.ad.b.b bVar, final sg.bigo.ads.api.core.b bVar2, int i10) {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Notify mid page content view render failed, try next render way.");
        pVar.f68784r = i10;
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.15
            @Override // java.lang.Runnable
            public final void run() {
                p.a(p.this, context, bVar, bVar2);
            }
        });
    }

    @UiThread
    private void a(sg.bigo.ads.api.core.b bVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "All render way failed.");
        this.f68776j = true;
        sg.bigo.ads.core.d.b.a(bVar, "0", e.a(this.f68783q, this.f68782p), this.f68784r);
        e();
    }

    public static /* synthetic */ boolean a(p pVar) {
        String str;
        String str2;
        final Context context = pVar.f68767a;
        final sg.bigo.ads.ad.b.b bVar = pVar.f68768b;
        final sg.bigo.ads.api.core.b bVar2 = pVar.f68769c;
        if (pVar.a(context, bVar, bVar2, pVar.f68770d)) {
            final int i10 = pVar.f68783q;
            final boolean z10 = pVar.f68782p;
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Try show mid page.");
            View view = pVar.I;
            boolean z11 = pVar.J;
            boolean z12 = pVar.f68776j;
            if (z11 && view != null) {
                StringBuilder sb2 = new StringBuilder("Show mid page content, render way: ");
                if (i10 == 1) {
                    str2 = "WEB_VIEW";
                } else if (i10 == 2) {
                    str2 = "NATIVE";
                } else if (i10 == 3) {
                    str2 = "IMAGE";
                } else if (i10 != 4) {
                    str2 = i10 != 5 ? "UNKNOWN" : "LOADING";
                } else {
                    str2 = "FALLBACK";
                }
                sb2.append(str2);
                sb2.append(".");
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", sb2.toString());
                if (pVar.j()) {
                    boolean z13 = pVar.f68783q == 3;
                    final FrameLayout frameLayoutA = pVar.a(context, pVar.b(context, view, z13), z13);
                    pVar.K = true;
                    if (bVar2 instanceof sg.bigo.ads.core.a.a) {
                        ((sg.bigo.ads.core.a.a) bVar2).g(e.a(i10, z10));
                    }
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.18
                        @Override // java.lang.Runnable
                        public final void run() {
                            p pVar2 = p.this;
                            Context context2 = context;
                            sg.bigo.ads.ad.b.b bVar3 = bVar;
                            sg.bigo.ads.api.core.b bVar4 = bVar2;
                            FrameLayout frameLayout = frameLayoutA;
                            if (!pVar2.f68778l) {
                                pVar2.a(context2, bVar3, bVar4, frameLayout);
                                pVar2.f68772f = frameLayout;
                                return;
                            }
                            FrameLayout frameLayout2 = pVar2.f68773g;
                            if (frameLayout2 != null) {
                                frameLayout2.removeAllViews();
                                pVar2.a(frameLayout);
                                frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                            }
                            pVar2.f68772f = frameLayout2;
                            pVar2.f68778l = false;
                            if ((bVar4 instanceof sg.bigo.ads.core.a.a) && pVar2.f68785s == 0) {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                pVar2.f68785s = jElapsedRealtime;
                                ((sg.bigo.ads.core.a.a) bVar4).b(jElapsedRealtime);
                            }
                            sg.bigo.ads.core.d.b.a(bVar4, "1", e.a(pVar2.f68783q, pVar2.f68782p), pVar2.f68784r);
                        }
                    });
                }
                return true;
            }
            if (z12) {
                str = "Failed to show mid page due to unavailable.";
            } else {
                if (!z11 && view != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Show mid page loading.");
                    if (pVar.j()) {
                        final FrameLayout frameLayout = new FrameLayout(context);
                        View viewA = sg.bigo.ads.common.utils.a.a(context, pVar.f68781o ? R.layout.bigo_ad_layout_interstitial_mid_page_loading_view_landscape : R.layout.bigo_ad_layout_interstitial_mid_page_loading_view, null, false);
                        if (viewA != null) {
                            pVar.f68778l = true;
                            FrameLayout frameLayoutA2 = pVar.a(context, (View) pVar.b(context, a(context, viewA, -1), true), true);
                            frameLayout.addView(frameLayoutA2, new FrameLayout.LayoutParams(-1, -1));
                            a aVar = pVar.f68792z;
                            pVar.a(viewA, viewA, 18, bVar, aVar.f68871b ? bVar : aVar.f68887r);
                            a aVar2 = pVar.f68792z;
                            pVar.a(frameLayoutA2, frameLayoutA2, 18, bVar, aVar2.f68871b ? bVar : aVar2.f68887r);
                            pVar.f68773g = frameLayout;
                            if (bVar2 instanceof sg.bigo.ads.core.a.a) {
                                ((sg.bigo.ads.core.a.a) bVar2).g(6);
                            }
                            pVar.f68783q = 5;
                            sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    p.this.a(context, bVar, bVar2, frameLayout);
                                }
                            });
                        }
                    }
                    return true;
                }
                str = "Failed to show mid page due to unknown reason.";
            }
            sg.bigo.ads.common.t.a.a(0, "InterstitialMidPageRenderer", str);
        }
        return false;
    }

    @NonNull
    private FrameLayout b(@NonNull Context context, @NonNull View view, boolean z10) {
        int i10 = this.A.f68903b;
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
        if (i10 == 1) {
            roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 12));
        } else {
            roundedFrameLayout.a(sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 0), sg.bigo.ads.common.utils.e.a(context, 0));
        }
        roundedFrameLayout.addView(view, new FrameLayout.LayoutParams(-1, z10 ? -1 : -2));
        return roundedFrameLayout;
    }

    public static /* synthetic */ void b(p pVar) {
        pVar.f68788v = null;
        pVar.f68789w = null;
    }

    private void i() {
        Runnable runnable;
        if (this.f68791y.f68900a) {
            if ((this.K || this.f68778l) && this.f68780n && (runnable = this.H) != null) {
                runnable.run();
                this.H = null;
            }
        }
    }

    private boolean j() {
        return (!this.f68775i || this.K || this.f68777k) ? false : true;
    }

    public final void a() {
        if (this.P != null || this.L <= 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.12
            @Override // java.lang.Runnable
            public final void run() {
                p pVar = p.this;
                pVar.f68776j = true;
                pVar.h();
            }
        };
        this.P = runnable;
        sg.bigo.ads.common.n.d.a(2, runnable, this.L);
    }

    public final void a(int i10, boolean z10) {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Notify mid page content view rendered.");
        this.J = true;
        this.f68783q = i10;
        this.f68782p = z10;
        if (this.f68778l) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Loading page is showing, turn to show mid page.");
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.14
                @Override // java.lang.Runnable
                public final void run() {
                    p.a(p.this);
                }
            });
        }
    }

    public final void a(long j10) {
        Runnable runnable = this.f68788v;
        this.N = SystemClock.elapsedRealtime();
        sg.bigo.ads.common.n.d.a(runnable);
        sg.bigo.ads.common.n.d.a(2, runnable, j10);
    }

    @UiThread
    public final void a(@NonNull final Context context, @NonNull final sg.bigo.ads.ad.b.b bVar, final sg.bigo.ads.api.core.b bVar2, @NonNull final FrameLayout frameLayout) {
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.22
            @Override // java.lang.Runnable
            public final void run() {
                p pVar = p.this;
                pVar.D = false;
                boolean zA = pVar.a(frameLayout);
                if (bVar2 instanceof sg.bigo.ads.core.a.a) {
                    p pVar2 = p.this;
                    if (pVar2.f68785s == 0) {
                        pVar2.f68785s = SystemClock.elapsedRealtime();
                        ((sg.bigo.ads.core.a.a) bVar2).b(p.this.f68785s);
                    }
                }
                sg.bigo.ads.api.core.b bVar3 = bVar2;
                p pVar3 = p.this;
                sg.bigo.ads.core.d.b.a(bVar3, "1", e.a(pVar3.f68783q, pVar3.f68782p), p.this.f68784r);
                Context context2 = context;
                if (context2 instanceof Activity) {
                    Activity activity = (Activity) context2;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                }
                AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setCancelable(!zA).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: sg.bigo.ads.ad.interstitial.p.22.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        p pVar4 = p.this;
                        pVar4.f68777k = true;
                        pVar4.f68778l = false;
                    }
                }).create();
                alertDialogCreate.requestWindowFeature(1);
                alertDialogCreate.show();
                Window window = alertDialogCreate.getWindow();
                window.getDecorView().setPadding(0, 0, 0, 0);
                window.setGravity(17);
                window.setContentView(frameLayout);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                window.setAttributes(attributes);
                p.this.f68774h = alertDialogCreate;
                frameLayout.setVisibility(4);
                frameLayout.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.22.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass22 anonymousClass22 = AnonymousClass22.this;
                        int i10 = p.this.A.f68903b;
                        frameLayout.setVisibility(0);
                        if (i10 == 1) {
                            sg.bigo.ads.ad.interstitial.c.d(frameLayout);
                        } else {
                            sg.bigo.ads.ad.interstitial.c.a(frameLayout, 400L, new sg.bigo.ads.common.utils.b.d());
                        }
                    }
                });
                p pVar4 = p.this;
                Runnable runnable2 = pVar4.f68771e;
                if (runnable2 != null) {
                    runnable2.run();
                    pVar4.f68771e = null;
                    pVar4.f68780n = true;
                }
            }
        };
        c cVar = this.C;
        if (cVar != null) {
            this.D = cVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    public final boolean a(Context context, sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.core.b bVar2, sg.bigo.ads.api.a.m mVar) {
        String str;
        if (context == null) {
            str = "Invalid context.";
        } else if (bVar == null) {
            str = "Invalid native ad.";
        } else if (bVar2 == null) {
            str = "Invalid adData.";
        } else if (mVar == null) {
            str = "Invalid style config.";
        } else {
            if (!this.K) {
                return true;
            }
            str = "Mid page has been shown.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", str);
        return false;
    }

    @UiThread
    public final boolean a(@NonNull FrameLayout frameLayout) {
        int iA;
        final View viewFindViewById = frameLayout.findViewById(R.id.bigo_ad_btn_cta);
        if (viewFindViewById != null && this.f68792z.f68874e) {
            sg.bigo.ads.ad.interstitial.c.e(viewFindViewById);
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.2
                @Override // java.lang.Runnable
                public final void run() {
                    viewFindViewById.clearAnimation();
                }
            });
        }
        final View viewFindViewById2 = frameLayout.findViewById(R.id.bigo_ad_btn_close);
        if (viewFindViewById2 == null) {
            return false;
        }
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.p.19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.e();
            }
        });
        sg.bigo.ads.api.a.m mVar = this.f68770d;
        if (mVar != null) {
            iA = mVar.a("mid_page.force_staying_time");
            if (iA < 0 || iA > 5) {
                iA = 3;
            }
        } else {
            iA = 0;
        }
        if (iA == 0) {
            viewFindViewById2.setVisibility(0);
            return true;
        }
        viewFindViewById2.setVisibility(4);
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.20
            @Override // java.lang.Runnable
            public final void run() {
                viewFindViewById2.setVisibility(0);
            }
        }, iA * 1000);
        return true;
    }

    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Disable mid page.");
        this.f68775i = false;
    }

    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page resume.");
        sg.bigo.ads.api.a.m mVar = this.f68770d;
        boolean z10 = mVar != null && mVar.a("endpage.is_endpage", 1) == 0 && !this.f68770d.c("layer.is_show_layer") && -1 == this.E;
        if (this.f68779m && !z10) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Dismiss page after click.");
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.16
                @Override // java.lang.Runnable
                public final void run() {
                    p.this.f();
                }
            });
        } else {
            if (!this.O || this.f68787u <= 0 || this.f68788v == null) {
                return;
            }
            this.O = false;
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Resume show task for " + this.f68787u + " ms.");
            a(this.f68787u);
        }
    }

    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page pause.");
        Runnable runnable = this.f68788v;
        if (this.O || this.f68787u <= 0 || runnable == null) {
            return;
        }
        this.O = true;
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Pause show task.");
        sg.bigo.ads.common.n.d.a(runnable);
        this.f68787u -= SystemClock.elapsedRealtime() - this.N;
    }

    public final void e() {
        int i10 = this.A.f68903b;
        final FrameLayout frameLayout = this.f68778l ? this.f68773g : this.f68772f;
        if (frameLayout == null) {
            f();
            return;
        }
        sg.bigo.ads.common.utils.b.d dVar = new sg.bigo.ads.common.utils.b.d() { // from class: sg.bigo.ads.ad.interstitial.p.17
            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                frameLayout.clearAnimation();
                frameLayout.setVisibility(8);
                p.this.f();
            }
        };
        if (i10 == 1) {
            sg.bigo.ads.ad.interstitial.c.c(frameLayout, dVar);
        } else {
            sg.bigo.ads.ad.interstitial.c.b(frameLayout, dVar);
        }
    }

    public final void f() {
        if (this.f68774h != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Dismiss mid page.");
            this.f68774h.dismiss();
            this.f68774h = null;
            g();
            i();
        }
        h();
    }

    public final void g() {
        Runnable runnable;
        if (!this.f68780n || (runnable = this.G) == null) {
            return;
        }
        runnable.run();
        this.f68771e = null;
    }

    public final void h() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page clean unused resource.");
        Iterator<Runnable> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.Q.clear();
        Runnable runnable = this.f68788v;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.a(runnable);
        }
        Runnable runnable2 = this.P;
        if (runnable2 != null) {
            sg.bigo.ads.common.n.d.a(runnable2);
        }
        this.f68788v = null;
        this.f68789w = null;
        this.f68777k = true;
        this.f68772f = null;
    }
}
