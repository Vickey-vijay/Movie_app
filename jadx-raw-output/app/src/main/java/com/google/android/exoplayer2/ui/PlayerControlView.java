package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewPropertyAnimatorListener;
import chuangyuan.ycj.videolibrary.R$drawable;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$string;
import chuangyuan.ycj.videolibrary.R$styleable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import g5.k0;
import g5.x;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import k3.e0;
import k3.g;
import k3.k;
import k3.m0;
import k3.n0;
import k3.v0;

/* JADX INFO: loaded from: classes6.dex */
public class PlayerControlView extends FrameLayout {
    public final String A;
    public final String B;
    public final String C;

    @DrawableRes
    public int D;
    public final AppCompatCheckBox E;
    public final TextView F;
    public final TextView G;
    public final View H;
    public final View I;
    public View J;
    public View K;
    public View L;
    public s.a.InterfaceC0634a M;
    public d5.b N;
    public final CopyOnWriteArraySet<s.a.b> O;
    public n0 P;
    public k3.f Q;
    public f R;

    @Nullable
    public m0 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f19956a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f19957b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f19958b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f19959c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f19960c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f19961d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f19962d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f19963e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f19964e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f19965f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f19966f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f19967g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long[] f19968g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f19969h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean[] f19970h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f19971i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long[] f19972i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f19973j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean[] f19974j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f19975k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Runnable f19976k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f19977l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Runnable f19978l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f19979m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public d f19980m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f19981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f19982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f19983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f19984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.a f19985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.a f19986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StringBuilder f19987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Formatter f19988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v0.b f19989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v0.c f19990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Drawable f19991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Drawable f19992y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Drawable f19993z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlayerControlView.this.Z();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlayerControlView.this.T();
        }
    }

    public class c implements ViewPropertyAnimatorListener {
        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(View view) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
        }

        public c() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (view != null) {
                PlayerControlView.this.E();
            }
        }
    }

    public interface d {
        void a(int i10);
    }

    public final class e extends n0.a implements com.google.android.exoplayer2.ui.a.InterfaceC0187a, View.OnClickListener {
        public e() {
        }

        public /* synthetic */ e(PlayerControlView playerControlView, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.ui.a.InterfaceC0187a
        public void d(com.google.android.exoplayer2.ui.a aVar, long j10, boolean z10) {
            PlayerControlView.this.W = false;
            if (!z10 && PlayerControlView.this.P != null && aVar.a()) {
                PlayerControlView.this.Q(j10);
            }
            PlayerControlView.this.F();
        }

        @Override // com.google.android.exoplayer2.ui.a.InterfaceC0187a
        public void e(com.google.android.exoplayer2.ui.a aVar, long j10) {
            if (PlayerControlView.this.f19983p != null) {
                PlayerControlView.this.f19983p.setText(k0.V(PlayerControlView.this.f19987t, PlayerControlView.this.f19988u, j10));
            }
            if (PlayerControlView.this.f19984q != null) {
                PlayerControlView.this.f19984q.setText(k0.V(PlayerControlView.this.f19987t, PlayerControlView.this.f19988u, j10));
            }
        }

        @Override // com.google.android.exoplayer2.ui.a.InterfaceC0187a
        public void f(com.google.android.exoplayer2.ui.a aVar, long j10) {
            if (PlayerControlView.this.N != null) {
                PlayerControlView.this.N.a(j10);
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.removeCallbacks(playerControlView.f19978l0);
            PlayerControlView.this.W = true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.P != null) {
                if (playerControlView.f19961d == view) {
                    PlayerControlView.this.P.next();
                } else if (PlayerControlView.this.f19959c == view) {
                    PlayerControlView.this.P.previous();
                } else if (PlayerControlView.this.f19973j == view) {
                    PlayerControlView.this.C();
                } else if (PlayerControlView.this.f19975k == view) {
                    PlayerControlView.this.N();
                } else {
                    PlayerControlView playerControlView2 = PlayerControlView.this;
                    if (playerControlView2.f19965f == view) {
                        if (playerControlView2.P.getPlaybackState() == 1) {
                            if (PlayerControlView.this.S != null) {
                                PlayerControlView.this.S.preparePlayback();
                            }
                        } else if (PlayerControlView.this.P.getPlaybackState() == 4) {
                            PlayerControlView playerControlView3 = PlayerControlView.this;
                            k3.f fVar = playerControlView3.Q;
                            n0 n0Var = playerControlView3.P;
                            fVar.c(n0Var, n0Var.getCurrentWindowIndex(), -9223372036854775807L);
                        }
                        PlayerControlView playerControlView4 = PlayerControlView.this;
                        playerControlView4.Q.d(playerControlView4.P, true);
                        PlayerControlView.this.z(2);
                    } else if (playerControlView2.f19967g == view) {
                        if (playerControlView2.P.getPlaybackState() == 1) {
                            if (PlayerControlView.this.S != null) {
                                PlayerControlView.this.S.preparePlayback();
                            }
                        } else if (PlayerControlView.this.P.getPlaybackState() == 4) {
                            PlayerControlView playerControlView5 = PlayerControlView.this;
                            k3.f fVar2 = playerControlView5.Q;
                            n0 n0Var2 = playerControlView5.P;
                            fVar2.c(n0Var2, n0Var2.getCurrentWindowIndex(), -9223372036854775807L);
                        }
                        PlayerControlView playerControlView6 = PlayerControlView.this;
                        playerControlView6.Q.d(playerControlView6.P, true);
                        PlayerControlView.this.z(2);
                    } else if (playerControlView2.f19969h == view) {
                        PlayerControlView playerControlView7 = PlayerControlView.this;
                        playerControlView7.Q.d(playerControlView7.P, false);
                        PlayerControlView.this.z(1);
                    } else if (PlayerControlView.this.f19971i == view) {
                        PlayerControlView playerControlView8 = PlayerControlView.this;
                        playerControlView8.Q.d(playerControlView8.P, false);
                        PlayerControlView.this.z(1);
                    } else if (PlayerControlView.this.f19977l == view) {
                        PlayerControlView playerControlView9 = PlayerControlView.this;
                        k3.f fVar3 = playerControlView9.Q;
                        n0 n0Var3 = playerControlView9.P;
                        fVar3.b(n0Var3, x.a(n0Var3.getRepeatMode(), PlayerControlView.this.f19962d0));
                    } else if (PlayerControlView.this.f19979m == view) {
                        PlayerControlView playerControlView10 = PlayerControlView.this;
                        k3.f fVar4 = playerControlView10.Q;
                        n0 n0Var4 = playerControlView10.P;
                        fVar4.a(n0Var4, !n0Var4.getShuffleModeEnabled());
                    }
                }
            }
            PlayerControlView.this.F();
        }

        @Override // k3.n0.b
        public void onPlayerStateChanged(boolean z10, int i10) {
            Activity activityN = s.e.n(PlayerControlView.this.getContext());
            if (activityN == null) {
                return;
            }
            if (z10) {
                activityN.getWindow().addFlags(128);
            } else {
                activityN.getWindow().clearFlags(128);
            }
            PlayerControlView.this.Y();
            PlayerControlView.this.Z();
        }

        @Override // k3.n0.b
        public void onPositionDiscontinuity(int i10) {
            PlayerControlView.this.X();
            PlayerControlView.this.Z();
        }

        @Override // k3.n0.b
        public void onRepeatModeChanged(int i10) {
            PlayerControlView.this.a0();
            PlayerControlView.this.X();
        }

        @Override // k3.n0.b
        public void onShuffleModeEnabledChanged(boolean z10) {
            PlayerControlView.this.b0();
            PlayerControlView.this.X();
        }

        @Override // k3.n0.a, k3.n0.b
        public void t(v0 v0Var, Object obj, int i10) {
            PlayerControlView.this.X();
            PlayerControlView.this.c0();
            PlayerControlView.this.Z();
        }
    }

    public interface f {
        void onVisibilityChange(int i10);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean H(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    static {
        e0.a("goog.exo.ui");
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public static int D(TypedArray typedArray, int i10) {
        return typedArray.getInt(R$styleable.PlayerControlView_repeat_toggle_modes, i10);
    }

    public final void C() {
        if (this.f19958b0 <= 0) {
            return;
        }
        long duration = this.P.getDuration();
        long currentPosition = this.P.getCurrentPosition() + ((long) this.f19958b0);
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        P(currentPosition);
    }

    public final void F() {
        removeCallbacks(this.f19978l0);
        if (this.f19960c0 <= 0) {
            this.f19966f0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = this.f19960c0;
        this.f19966f0 = jUptimeMillis + ((long) i10);
        if (this.T) {
            postDelayed(this.f19978l0, i10);
        }
    }

    public boolean I() {
        n0 n0Var = this.P;
        return (n0Var == null || n0Var.getPlaybackState() == 4 || this.P.getPlaybackState() == 1 || !this.P.getPlayWhenReady()) ? false : true;
    }

    public void K() {
        View view = this.J;
        if (view != null && view.animate() != null) {
            this.J.animate().cancel();
        }
        View view2 = this.L;
        if (view2 != null && view2.animate() != null) {
            this.L.animate().cancel();
        }
        View view3 = this.H;
        if (view3 != null && view3.animate() != null) {
            this.H.animate().cancel();
        }
        View view4 = this.I;
        if (view4 != null && view4.animate() != null) {
            this.I.animate().cancel();
        }
        View view5 = this.K;
        if (view5 == null || view5.animate() == null) {
            return;
        }
        this.K.animate().cancel();
    }

    public void L(@NonNull s.a.b bVar) {
        this.O.remove(bVar);
    }

    public void N() {
        if (this.f19956a0 <= 0) {
            return;
        }
        P(Math.max(this.P.getCurrentPosition() - ((long) this.f19956a0), 0L));
    }

    public final void O(int i10, long j10) {
        if (this.Q.c(this.P, i10, j10)) {
            return;
        }
        Z();
    }

    public final void P(long j10) {
        O(this.P.getCurrentWindowIndex(), j10);
    }

    public final void Q(long j10) {
        int currentWindowIndex;
        v0 currentTimeline = this.P.getCurrentTimeline();
        if (this.V && !currentTimeline.q()) {
            int iP = currentTimeline.p();
            currentWindowIndex = 0;
            while (true) {
                long jC = currentTimeline.n(currentWindowIndex, this.f19990w).c();
                if (j10 < jC) {
                    break;
                }
                if (currentWindowIndex == iP - 1) {
                    j10 = jC;
                    break;
                } else {
                    j10 -= jC;
                    currentWindowIndex++;
                }
            }
        } else {
            currentWindowIndex = this.P.getCurrentWindowIndex();
        }
        O(currentWindowIndex, j10);
    }

    public final void R(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? 1.0f : 0.3f);
        view.setVisibility(0);
    }

    public void S() {
        if (this.G == null || this.H == null) {
            return;
        }
        s.a.InterfaceC0634a interfaceC0634a = this.M;
        if (interfaceC0634a != null) {
            interfaceC0634a.a(true);
        }
        z(3);
        s.a.a(this.J).setListener(null).start();
        s.a.a(this.H).start();
        if (this.f19963e.booleanValue()) {
            s.a.b(this.K).start();
        }
        View view = this.L;
        if (view != null) {
            s.a.a(view).start();
        }
        View view2 = this.I;
        if (view2 != null) {
            s.a.a(view2).setListener(null).start();
        }
    }

    public void T() {
        if (this.G == null || this.H == null) {
            E();
            return;
        }
        s.a.InterfaceC0634a interfaceC0634a = this.M;
        if (interfaceC0634a != null) {
            interfaceC0634a.a(false);
        }
        s.a.d(this.H, true).start();
        View view = this.K;
        if (view != null) {
            s.a.e(view).start();
        }
        View view2 = this.I;
        if (view2 != null) {
            s.a.d(view2, true).start();
        }
        View view3 = this.L;
        if (view3 != null) {
            s.a.d(view3, false).start();
        }
        z(3);
        s.a.d(this.J, false).setListener(new c()).start();
    }

    public final void Z() {
        long j10;
        long bufferedPosition;
        long j11;
        int i10;
        long contentPosition;
        v0.c cVar;
        int i11;
        if (this.T) {
            n0 n0Var = this.P;
            long j12 = 0;
            boolean z10 = true;
            if (n0Var != null) {
                v0 currentTimeline = n0Var.getCurrentTimeline();
                if (currentTimeline.q()) {
                    j11 = 0;
                    i10 = 0;
                } else {
                    int currentWindowIndex = this.P.getCurrentWindowIndex();
                    boolean z11 = this.V;
                    int i12 = z11 ? 0 : currentWindowIndex;
                    int iP = z11 ? currentTimeline.p() - 1 : currentWindowIndex;
                    long j13 = 0;
                    j11 = 0;
                    i10 = 0;
                    while (i12 <= iP) {
                        if (i12 == currentWindowIndex) {
                            j11 = j13;
                        }
                        currentTimeline.n(i12, this.f19990w);
                        v0.c cVar2 = this.f19990w;
                        int i13 = iP;
                        if (cVar2.f62344l == -9223372036854775807L) {
                            g5.a.f(this.V ^ z10);
                            break;
                        }
                        int i14 = cVar2.f62341i;
                        while (true) {
                            cVar = this.f19990w;
                            if (i14 <= cVar.f62342j) {
                                currentTimeline.f(i14, this.f19989v);
                                int iC = this.f19989v.c();
                                int i15 = 0;
                                while (i15 < iC) {
                                    long jF = this.f19989v.f(i15);
                                    if (jF == Long.MIN_VALUE) {
                                        i11 = currentWindowIndex;
                                        long j14 = this.f19989v.f62329d;
                                        if (j14 != -9223372036854775807L) {
                                            jF = j14;
                                        }
                                        i15++;
                                        currentWindowIndex = i11;
                                    } else {
                                        i11 = currentWindowIndex;
                                    }
                                    long jM = jF + this.f19989v.m();
                                    if (jM >= 0 && jM <= this.f19990w.f62344l) {
                                        long[] jArr = this.f19968g0;
                                        if (i10 == jArr.length) {
                                            int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                            this.f19968g0 = Arrays.copyOf(jArr, length);
                                            this.f19970h0 = Arrays.copyOf(this.f19970h0, length);
                                        }
                                        this.f19968g0[i10] = k.b(j13 + jM);
                                        this.f19970h0[i10] = this.f19989v.n(i15);
                                        i10++;
                                    }
                                    i15++;
                                    currentWindowIndex = i11;
                                }
                                i14++;
                            }
                        }
                        j13 += cVar.f62344l;
                        i12++;
                        iP = i13;
                        currentWindowIndex = currentWindowIndex;
                        z10 = true;
                    }
                    j12 = j13;
                }
                long jB = k.b(j12);
                long jB2 = k.b(j11);
                if (this.P.isPlayingAd()) {
                    contentPosition = jB2 + this.P.getContentPosition();
                    bufferedPosition = contentPosition;
                } else {
                    long currentPosition = this.P.getCurrentPosition() + jB2;
                    bufferedPosition = jB2 + this.P.getBufferedPosition();
                    contentPosition = currentPosition;
                }
                Iterator<s.a.b> it = this.O.iterator();
                while (it.hasNext()) {
                    it.next().b(contentPosition, bufferedPosition, jB);
                }
                if (this.f19985r != null) {
                    int length2 = this.f19972i0.length;
                    int i16 = i10 + length2;
                    long[] jArr2 = this.f19968g0;
                    if (i16 > jArr2.length) {
                        this.f19968g0 = Arrays.copyOf(jArr2, i16);
                        this.f19970h0 = Arrays.copyOf(this.f19970h0, i16);
                    }
                    System.arraycopy(this.f19972i0, 0, this.f19968g0, i10, length2);
                    System.arraycopy(this.f19974j0, 0, this.f19970h0, i10, length2);
                    this.f19985r.setAdGroupTimesMs(this.f19968g0, this.f19970h0, i16);
                    com.google.android.exoplayer2.ui.a aVar = this.f19986s;
                    if (aVar != null) {
                        aVar.setAdGroupTimesMs(this.f19968g0, this.f19970h0, i16);
                    }
                }
                j10 = jB;
                j12 = contentPosition;
            } else {
                j10 = 0;
                bufferedPosition = 0;
            }
            d5.b bVar = this.N;
            if (bVar != null) {
                bVar.a(j12);
            }
            TextView textView = this.f19981n;
            if (textView != null) {
                textView.setText(k0.V(this.f19987t, this.f19988u, j10));
            }
            TextView textView2 = this.f19982o;
            if (textView2 != null) {
                textView2.setText(k0.V(this.f19987t, this.f19988u, j10));
            }
            TextView textView3 = this.f19983p;
            if (textView3 != null && !this.W) {
                textView3.setText(k0.V(this.f19987t, this.f19988u, j12));
            }
            TextView textView4 = this.f19984q;
            if (textView4 != null && !this.W) {
                textView4.setText(k0.V(this.f19987t, this.f19988u, j12));
            }
            com.google.android.exoplayer2.ui.a aVar2 = this.f19985r;
            if (aVar2 != null) {
                aVar2.setPosition(j12);
                this.f19985r.setBufferedPosition(bufferedPosition);
                this.f19985r.setDuration(j10);
            }
            com.google.android.exoplayer2.ui.a aVar3 = this.f19986s;
            if (aVar3 != null) {
                aVar3.setPosition(j12);
                this.f19986s.setBufferedPosition(bufferedPosition);
                this.f19986s.setDuration(j10);
            }
            removeCallbacks(this.f19976k0);
            n0 n0Var2 = this.P;
            int playbackState = n0Var2 == null ? 1 : n0Var2.getPlaybackState();
            if (playbackState == 1 || playbackState == 4) {
                return;
            }
            postDelayed(this.f19976k0, 1000L);
        }
    }

    public final void c0() {
        n0 n0Var = this.P;
        if (n0Var == null) {
            return;
        }
        this.V = this.U && A(n0Var.getCurrentTimeline(), this.f19990w);
    }

    public View getExoControllerTop() {
        return this.J;
    }

    public AppCompatCheckBox getExoFullscreen() {
        return this.E;
    }

    public View getExo_controller_top_status() {
        return this.L;
    }

    public int getIcFullscreenSelector() {
        return this.D;
    }

    public View getPlayButton() {
        return this.f19965f;
    }

    public View getPlayButton1() {
        return this.f19967g;
    }

    public boolean getShowShuffleButton() {
        return this.f19964e0;
    }

    public int getShowTimeoutMs() {
        return this.f19960c0;
    }

    public TextView getSwitchText() {
        return this.F;
    }

    public com.google.android.exoplayer2.ui.a getTimeBar() {
        return this.f19985r;
    }

    public com.google.android.exoplayer2.ui.a getTimeBar1() {
        return this.f19986s;
    }

    public void setAnimatorListener(s.a.InterfaceC0634a interfaceC0634a) {
        this.M = interfaceC0634a;
    }

    public void setCallBack(d dVar) {
        this.f19980m0 = dVar;
    }

    public void setControlDispatcher(@Nullable k3.f fVar) {
        if (fVar == null) {
            fVar = new g();
        }
        this.Q = fVar;
    }

    public void setFastForwardIncrementMs(int i10) {
        this.f19958b0 = i10;
        X();
    }

    public void setFullscreenStyle(@DrawableRes int i10) {
        this.D = i10;
        if (getExoFullscreen() != null) {
            getExoFullscreen().setButtonDrawable(i10);
        }
    }

    public void setPlayTimeListener(d5.b bVar) {
        this.N = bVar;
    }

    public void setPlaybackPreparer(@Nullable m0 m0Var) {
        this.S = m0Var;
    }

    public void setPlayer(n0 n0Var) {
        n0 n0Var2 = this.P;
        if (n0Var2 == n0Var) {
            return;
        }
        if (n0Var2 != null) {
            n0Var2.f(this.f19957b);
        }
        this.P = n0Var;
        if (n0Var != null) {
            n0Var.d(this.f19957b);
        }
        W();
    }

    public void setRepeatToggleModes(int i10) {
        this.f19962d0 = i10;
        n0 n0Var = this.P;
        if (n0Var != null) {
            int repeatMode = n0Var.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.Q.b(this.P, 0);
                return;
            }
            if (i10 == 1 && repeatMode == 2) {
                this.Q.b(this.P, 1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.Q.b(this.P, 2);
            }
        }
    }

    public void setRewindIncrementMs(int i10) {
        this.f19956a0 = i10;
        X();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.U = z10;
        c0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f19964e0 = z10;
        b0();
    }

    public void setShowTimeoutMs(int i10) {
        this.f19960c0 = i10;
        if (J()) {
            F();
        }
    }

    public void setTitle(@NonNull String str) {
        this.G.setText(str);
    }

    public void setVisibilityListener(f fVar) {
        this.R = fVar;
    }

    public void y(@NonNull s.a.b bVar) {
        this.O.add(bVar);
    }

    public void z(int i10) {
        d dVar = this.f19980m0;
        if (dVar != null) {
            dVar.a(i10);
        }
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        this.f19963e = Boolean.FALSE;
        this.D = R$drawable.ic_fullscreen_selector;
        this.f19976k0 = new a();
        this.f19978l0 = new b();
        this.O = new CopyOnWriteArraySet<>();
        int resourceId = R$layout.exo_player_control_view;
        this.f19956a0 = 5000;
        this.f19958b0 = 5000;
        this.f19960c0 = 5000;
        this.f19962d0 = 0;
        this.f19966f0 = -9223372036854775807L;
        this.f19964e0 = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.PlayerControlView, 0, 0);
            try {
                this.f19956a0 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerControlView_rewind_increment, this.f19956a0);
                this.f19958b0 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerControlView_fastforward_increment, this.f19958b0);
                this.f19960c0 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerControlView_show_timeout, this.f19960c0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.PlayerControlView_controller_layout_id, resourceId);
                this.f19962d0 = D(typedArrayObtainStyledAttributes, this.f19962d0);
                this.f19964e0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerControlView_show_shuffle_button, this.f19964e0);
                this.D = typedArrayObtainStyledAttributes.getResourceId(R$styleable.PlayerControlView_player_fullscreen_image_selector, this.D);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f19989v = new v0.b();
        this.f19990w = new v0.c();
        StringBuilder sb2 = new StringBuilder();
        this.f19987t = sb2;
        this.f19988u = new Formatter(sb2, Locale.getDefault());
        this.f19968g0 = new long[0];
        this.f19970h0 = new boolean[0];
        this.f19972i0 = new long[0];
        this.f19974j0 = new boolean[0];
        e eVar = new e(this, null);
        this.f19957b = eVar;
        this.Q = new g();
        LayoutInflater.from(context).inflate(resourceId, this).setVisibility(8);
        setDescendantFocusability(262144);
        this.f19981n = (TextView) findViewById(R$id.exo_duration);
        this.f19982o = (TextView) findViewById(R$id.exo_duration1);
        this.f19983p = (TextView) findViewById(R$id.exo_position);
        this.f19984q = (TextView) findViewById(R$id.exo_position1);
        com.google.android.exoplayer2.ui.a aVar = (com.google.android.exoplayer2.ui.a) findViewById(R$id.exo_progress);
        this.f19985r = aVar;
        com.google.android.exoplayer2.ui.a aVar2 = (com.google.android.exoplayer2.ui.a) findViewById(R$id.exo_progress1);
        this.f19986s = aVar2;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(R$id.exo_video_fullscreen);
        this.E = appCompatCheckBox;
        this.F = (TextView) findViewById(R$id.exo_video_switch);
        TextView textView = (TextView) findViewById(R$id.exo_controls_title);
        this.G = textView;
        this.H = findViewById(R$id.exo_controller_bottom);
        this.I = findViewById(R$id.exo_controller_bottom1);
        this.J = findViewById(R$id.exo_controller_top);
        this.K = findViewById(R$id.exo_controller_center_view);
        this.L = findViewById(R$id.exo_controller_top_status);
        if (this.J == null) {
            this.J = textView;
        }
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setButtonDrawable(this.D);
            if (s.e.m(getContext())) {
                appCompatCheckBox.setVisibility(8);
            }
        }
        if (aVar != null) {
            aVar.b(eVar);
        }
        if (aVar2 != null) {
            aVar2.b(eVar);
        }
        View viewFindViewById = findViewById(R$id.exo_play);
        this.f19965f = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.exo_play1);
        this.f19967g = viewFindViewById2;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(eVar);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(eVar);
        }
        View viewFindViewById3 = findViewById(R$id.exo_pause);
        this.f19969h = viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.exo_pause1);
        this.f19971i = viewFindViewById4;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(eVar);
        }
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(eVar);
        }
        View viewFindViewById5 = findViewById(R$id.exo_prev);
        this.f19959c = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(eVar);
        }
        View viewFindViewById6 = findViewById(R$id.exo_next);
        this.f19961d = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(eVar);
        }
        View viewFindViewById7 = findViewById(R$id.exo_rew);
        this.f19975k = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(eVar);
        }
        View viewFindViewById8 = findViewById(R$id.exo_ffwd);
        this.f19973j = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(eVar);
        }
        ImageView imageView = (ImageView) findViewById(R$id.exo_repeat_toggle);
        this.f19977l = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(eVar);
        }
        View viewFindViewById9 = findViewById(R$id.exo_shuffle);
        this.f19979m = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(eVar);
        }
        Resources resources = context.getResources();
        this.f19991x = resources.getDrawable(R$drawable.exo_controls_repeat_off);
        this.f19992y = resources.getDrawable(R$drawable.exo_controls_repeat_one);
        this.f19993z = resources.getDrawable(R$drawable.exo_controls_repeat_all);
        this.A = resources.getString(R$string.exo_controls_repeat_off_description);
        this.B = resources.getString(R$string.exo_controls_repeat_one_description);
        this.C = resources.getString(R$string.exo_controls_repeat_all_description);
    }

    public static boolean A(v0 v0Var, v0.c cVar) {
        if (v0Var.p() > 100) {
            return false;
        }
        int iP = v0Var.p();
        for (int i10 = 0; i10 < iP; i10++) {
            if (v0Var.n(i10, cVar).f62344l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public boolean B(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.P == null || !H(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                C();
            } else if (keyCode == 89) {
                N();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode != 85) {
                    if (keyCode != 87) {
                        if (keyCode != 88) {
                            if (keyCode != 126) {
                                if (keyCode == 127) {
                                    this.Q.d(this.P, false);
                                }
                            } else {
                                this.Q.d(this.P, true);
                            }
                        } else {
                            n0 n0Var = this.P;
                            if (n0Var != null) {
                                n0Var.previous();
                            }
                        }
                    } else {
                        n0 n0Var2 = this.P;
                        if (n0Var2 != null) {
                            n0Var2.next();
                        }
                    }
                } else {
                    k3.f fVar = this.Q;
                    n0 n0Var3 = this.P;
                    fVar.d(n0Var3, !n0Var3.getPlayWhenReady());
                }
            }
        }
        return true;
    }

    public void E() {
        if (J()) {
            setVisibility(8);
            f fVar = this.R;
            if (fVar != null) {
                fVar.onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.f19978l0);
            this.f19966f0 = -9223372036854775807L;
        }
    }

    public void G() {
        if (J()) {
            setVisibility(8);
            removeCallbacks(this.f19976k0);
            removeCallbacks(this.f19978l0);
            this.f19966f0 = -9223372036854775807L;
        }
    }

    public boolean J() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void M() {
        View view;
        View view2;
        View view3;
        View view4;
        boolean zI = I();
        if (!zI && (view4 = this.f19965f) != null) {
            view4.requestFocus();
            return;
        }
        if (!zI && (view3 = this.f19967g) != null) {
            view3.requestFocus();
            return;
        }
        if (zI && (view2 = this.f19969h) != null) {
            view2.requestFocus();
        } else if (zI && (view = this.f19971i) != null) {
            view.requestFocus();
        }
    }

    public void U() {
        if (!J()) {
            setVisibility(0);
            f fVar = this.R;
            if (fVar != null) {
                fVar.onVisibilityChange(getVisibility());
            }
            W();
            M();
        }
        F();
    }

    public void V() {
        W();
        M();
        this.Q.d(this.P, false);
        removeCallbacks(this.f19976k0);
        removeCallbacks(this.f19978l0);
        this.G.setAlpha(1.0f);
        this.G.setTranslationY(0.0f);
        if (!J()) {
            setVisibility(0);
        }
    }

    public void W() {
        Y();
        X();
        a0();
        b0();
        Z();
    }

    public final void X() {
        v0 currentTimeline;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (J() && this.T) {
            n0 n0Var = this.P;
            if (n0Var != null) {
                currentTimeline = n0Var.getCurrentTimeline();
            } else {
                currentTimeline = null;
            }
            boolean z15 = true;
            if (currentTimeline != null && !currentTimeline.q()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.P.isPlayingAd()) {
                currentTimeline.n(this.P.getCurrentWindowIndex(), this.f19990w);
                v0.c cVar = this.f19990w;
                z12 = cVar.f62338f;
                if (!z12 && cVar.f62339g && this.P.getPreviousWindowIndex() == -1) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!this.f19990w.f62339g && this.P.getNextWindowIndex() == -1) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
            }
            R(z11, this.f19959c);
            R(z13, this.f19961d);
            if (this.f19958b0 > 0 && z12) {
                z14 = true;
            } else {
                z14 = false;
            }
            R(z14, this.f19973j);
            if (this.f19956a0 <= 0 || !z12) {
                z15 = false;
            }
            R(z15, this.f19975k);
            com.google.android.exoplayer2.ui.a aVar = this.f19985r;
            if (aVar != null) {
                aVar.setEnabled(z12);
            }
            com.google.android.exoplayer2.ui.a aVar2 = this.f19986s;
            if (aVar2 != null) {
                aVar2.setEnabled(z12);
            }
        }
    }

    public void Y() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        if (J() && this.T) {
            boolean zI = I();
            View view = this.f19965f;
            int i13 = 8;
            boolean z14 = true;
            if (view != null) {
                if (zI && view.isFocused()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z10 = z13 | false;
                View view2 = this.f19965f;
                if (zI) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                view2.setVisibility(i12);
            } else {
                z10 = false;
            }
            View view3 = this.f19967g;
            if (view3 != null) {
                if (zI && view3.isFocused()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 |= z12;
                View view4 = this.f19967g;
                if (zI) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                view4.setVisibility(i11);
            }
            View view5 = this.f19969h;
            if (view5 != null) {
                if (!zI && view5.isFocused()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z10 |= z11;
                View view6 = this.f19969h;
                if (!zI) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                view6.setVisibility(i10);
            }
            View view7 = this.f19971i;
            if (view7 != null) {
                if (zI || !view7.isFocused()) {
                    z14 = false;
                }
                z10 |= z14;
                View view8 = this.f19971i;
                if (zI) {
                    i13 = 0;
                }
                view8.setVisibility(i13);
            }
            if (z10) {
                M();
            }
        }
    }

    public final void a0() {
        ImageView imageView;
        if (J() && this.T && (imageView = this.f19977l) != null) {
            if (this.f19962d0 == 0) {
                imageView.setVisibility(8);
                return;
            }
            if (this.P == null) {
                R(false, imageView);
                return;
            }
            R(true, imageView);
            int repeatMode = this.P.getRepeatMode();
            if (repeatMode != 0) {
                if (repeatMode != 1) {
                    if (repeatMode == 2) {
                        this.f19977l.setImageDrawable(this.f19993z);
                        this.f19977l.setContentDescription(this.C);
                    }
                } else {
                    this.f19977l.setImageDrawable(this.f19992y);
                    this.f19977l.setContentDescription(this.B);
                }
            } else {
                this.f19977l.setImageDrawable(this.f19991x);
                this.f19977l.setContentDescription(this.A);
            }
            this.f19977l.setVisibility(0);
        }
    }

    public final void b0() {
        View view;
        float f10;
        if (J() && this.T && (view = this.f19979m) != null) {
            if (!this.f19964e0) {
                view.setVisibility(8);
                return;
            }
            n0 n0Var = this.P;
            if (n0Var == null) {
                R(false, view);
                return;
            }
            if (n0Var.getShuffleModeEnabled()) {
                f10 = 1.0f;
            } else {
                f10 = 0.3f;
            }
            view.setAlpha(f10);
            this.f19979m.setEnabled(true);
            this.f19979m.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!B(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        long j10 = this.f19966f0;
        if (j10 != -9223372036854775807L) {
            long jUptimeMillis = j10 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                E();
            } else {
                postDelayed(this.f19978l0, jUptimeMillis);
            }
        } else if (J()) {
            F();
        }
        W();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        removeCallbacks(this.f19976k0);
        removeCallbacks(this.f19978l0);
        K();
    }

    public void setFull(boolean z10) {
        this.f19963e = Boolean.valueOf(z10);
    }
}
