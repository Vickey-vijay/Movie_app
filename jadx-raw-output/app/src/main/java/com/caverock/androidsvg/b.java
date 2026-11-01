package com.caverock.androidsvg;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: compiled from: SVGAndroidRenderer.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HashSet<String> f13944i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f13945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SVG f13947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f13948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Stack<h> f13949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Stack<SVG.h0> f13950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Stack<Matrix> f13951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CSSParser.m f13952h = null;

    /* JADX INFO: renamed from: com.caverock.androidsvg.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class C0164b implements SVG.w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13958c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f13963h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<c> f13956a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f13959d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f13960e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f13961f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13962g = -1;

        @Override // com.caverock.androidsvg.SVG.w
        public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f13960e = true;
            this.f13961f = false;
            c cVar = this.f13959d;
            b.h(cVar.f13965a, cVar.f13966b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f13961f = true;
            this.f13963h = false;
        }

        public C0164b(SVG.v vVar) {
            if (vVar == null) {
                return;
            }
            vVar.h(this);
            if (this.f13963h) {
                this.f13959d.b(this.f13956a.get(this.f13962g));
                this.f13956a.set(this.f13962g, this.f13959d);
                this.f13963h = false;
            }
            c cVar = this.f13959d;
            if (cVar != null) {
                this.f13956a.add(cVar);
            }
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f10, float f11) {
            if (this.f13963h) {
                this.f13959d.b(this.f13956a.get(this.f13962g));
                this.f13956a.set(this.f13962g, this.f13959d);
                this.f13963h = false;
            }
            c cVar = this.f13959d;
            if (cVar != null) {
                this.f13956a.add(cVar);
            }
            this.f13957b = f10;
            this.f13958c = f11;
            this.f13959d = b.this.new c(f10, f11, 0.0f, 0.0f);
            this.f13962g = this.f13956a.size();
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f10, float f11) {
            this.f13959d.a(f10, f11);
            this.f13956a.add(this.f13959d);
            b bVar = b.this;
            c cVar = this.f13959d;
            this.f13959d = bVar.new c(f10, f11, f10 - cVar.f13965a, f11 - cVar.f13966b);
            this.f13963h = false;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void c(float f10, float f11, float f12, float f13) {
            this.f13959d.a(f10, f11);
            this.f13956a.add(this.f13959d);
            this.f13959d = b.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f13963h = false;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            this.f13956a.add(this.f13959d);
            b(this.f13957b, this.f13958c);
            this.f13963h = true;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f13961f || this.f13960e) {
                this.f13959d.a(f10, f11);
                this.f13956a.add(this.f13959d);
                this.f13960e = false;
            }
            this.f13959d = b.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f13963h = false;
        }

        public List<c> f() {
            return this.f13956a;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f13965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f13968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f13969e = false;

        public c(float f10, float f11, float f12, float f13) {
            this.f13967c = 0.0f;
            this.f13968d = 0.0f;
            this.f13965a = f10;
            this.f13966b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f13967c = (float) (((double) f12) / dSqrt);
                this.f13968d = (float) (((double) f13) / dSqrt);
            }
        }

        public void a(float f10, float f11) {
            float f12 = f10 - this.f13965a;
            float f13 = f11 - this.f13966b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f13967c;
            if (f12 != (-f14) || f13 != (-this.f13968d)) {
                this.f13967c = f14 + f12;
                this.f13968d += f13;
            } else {
                this.f13969e = true;
                this.f13967c = -f13;
                this.f13968d = f12;
            }
        }

        public void b(c cVar) {
            float f10 = cVar.f13967c;
            float f11 = this.f13967c;
            if (f10 == (-f11)) {
                float f12 = cVar.f13968d;
                if (f12 == (-this.f13968d)) {
                    this.f13969e = true;
                    this.f13967c = -f12;
                    this.f13968d = cVar.f13967c;
                    return;
                }
            }
            this.f13967c = f11 + f10;
            this.f13968d += cVar.f13968d;
        }

        public String toString() {
            return "(" + this.f13965a + StringUtils.COMMA + this.f13966b + Z7.f27998r + this.f13967c + StringUtils.COMMA + this.f13968d + ")";
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class d implements SVG.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Path f13971a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13973c;

        @Override // com.caverock.androidsvg.SVG.w
        public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            b.h(this.f13972b, this.f13973c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f13972b = f13;
            this.f13973c = f14;
        }

        public d(SVG.v vVar) {
            if (vVar == null) {
                return;
            }
            vVar.h(this);
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f10, float f11) {
            this.f13971a.moveTo(f10, f11);
            this.f13972b = f10;
            this.f13973c = f11;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f10, float f11) {
            this.f13971a.lineTo(f10, f11);
            this.f13972b = f10;
            this.f13973c = f11;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void c(float f10, float f11, float f12, float f13) {
            this.f13971a.quadTo(f10, f11, f12, f13);
            this.f13972b = f12;
            this.f13973c = f13;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            this.f13971a.close();
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f13971a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f13972b = f14;
            this.f13973c = f15;
        }

        public Path f() {
            return this.f13971a;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Path f13975e;

        public e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f13975e = path;
        }

        @Override // com.caverock.androidsvg.b.f, com.caverock.androidsvg.b.j
        public void b(String str) {
            if (b.this.Y0()) {
                if (b.this.f13948d.f13985b) {
                    b.this.f13945a.drawTextOnPath(str, this.f13975e, this.f13977b, this.f13978c, b.this.f13948d.f13987d);
                }
                if (b.this.f13948d.f13986c) {
                    b.this.f13945a.drawTextOnPath(str, this.f13975e, this.f13977b, this.f13978c, b.this.f13948d.f13988e);
                }
            }
            this.f13977b += b.this.f13948d.f13987d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13978c;

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            b.y("TextSequence render", new Object[0]);
            if (b.this.Y0()) {
                if (b.this.f13948d.f13985b) {
                    b.this.f13945a.drawText(str, this.f13977b, this.f13978c, b.this.f13948d.f13987d);
                }
                if (b.this.f13948d.f13986c) {
                    b.this.f13945a.drawText(str, this.f13977b, this.f13978c, b.this.f13948d.f13988e);
                }
            }
            this.f13977b += b.this.f13948d.f13987d.measureText(str);
        }

        public f(float f10, float f11) {
            super(b.this, null);
            this.f13977b = f10;
            this.f13978c = f11;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f13982d;

        public g(float f10, float f11, Path path) {
            super(b.this, null);
            this.f13980b = f10;
            this.f13981c = f11;
            this.f13982d = path;
        }

        @Override // com.caverock.androidsvg.b.j
        public boolean a(SVG.w0 w0Var) {
            if (!(w0Var instanceof SVG.x0)) {
                return true;
            }
            b.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            if (b.this.Y0()) {
                Path path = new Path();
                b.this.f13948d.f13987d.getTextPath(str, 0, str.length(), this.f13980b, this.f13981c, path);
                this.f13982d.addPath(path);
            }
            this.f13980b += b.this.f13948d.f13987d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RectF f13995d;

        public i(float f10, float f11) {
            super(b.this, null);
            this.f13995d = new RectF();
            this.f13993b = f10;
            this.f13994c = f11;
        }

        @Override // com.caverock.androidsvg.b.j
        public boolean a(SVG.w0 w0Var) {
            if (!(w0Var instanceof SVG.x0)) {
                return true;
            }
            SVG.x0 x0Var = (SVG.x0) w0Var;
            SVG.l0 l0VarU = w0Var.f13834a.u(x0Var.f13887o);
            if (l0VarU == null) {
                b.F("TextPath path reference '%s' not found", x0Var.f13887o);
                return false;
            }
            SVG.u uVar = (SVG.u) l0VarU;
            Path pathF = b.this.new d(uVar.f13872o).f();
            Matrix matrix = uVar.f13828n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            RectF rectF = new RectF();
            pathF.computeBounds(rectF, true);
            this.f13995d.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            if (b.this.Y0()) {
                Rect rect = new Rect();
                b.this.f13948d.f13987d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f13993b, this.f13994c);
                this.f13995d.union(rectF);
            }
            this.f13993b += b.this.f13948d.f13987d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public abstract class j {
        public j() {
        }

        public boolean a(SVG.w0 w0Var) {
            return true;
        }

        public abstract void b(String str);

        public /* synthetic */ j(b bVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13998b;

        public k() {
            super(b.this, null);
            this.f13998b = 0.0f;
        }

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            this.f13998b += b.this.f13948d.f13987d.measureText(str);
        }

        public /* synthetic */ k(b bVar, a aVar) {
            this();
        }
    }

    public static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    public static void y(String str, Object... objArr) {
    }

    public final void B0(SVG.q0 q0Var) {
        y("Switch render", new Object[0]);
        W0(this.f13948d, q0Var);
        if (A()) {
            Matrix matrix = q0Var.f13833o;
            if (matrix != null) {
                this.f13945a.concat(matrix);
            }
            p(q0Var);
            boolean zM0 = m0();
            K0(q0Var);
            if (zM0) {
                j0(q0Var);
            }
            U0(q0Var);
        }
    }

    public final void C0(SVG.r0 r0Var, SVG.b bVar) {
        y("Symbol render", new Object[0]);
        if (bVar.f13777c == 0.0f || bVar.f13778d == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = r0Var.f13842o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f13707e;
        }
        W0(this.f13948d, r0Var);
        h hVar = this.f13948d;
        hVar.f13989f = bVar;
        if (!hVar.f13984a.f13747w.booleanValue()) {
            SVG.b bVar2 = this.f13948d.f13989f;
            O0(bVar2.f13775a, bVar2.f13776b, bVar2.f13777c, bVar2.f13778d);
        }
        SVG.b bVar3 = r0Var.f13854p;
        if (bVar3 != null) {
            this.f13945a.concat(o(this.f13948d.f13989f, bVar3, preserveAspectRatio));
            this.f13948d.f13990g = r0Var.f13854p;
        } else {
            Canvas canvas = this.f13945a;
            SVG.b bVar4 = this.f13948d.f13989f;
            canvas.translate(bVar4.f13775a, bVar4.f13776b);
        }
        boolean zM0 = m0();
        F0(r0Var, true);
        if (zM0) {
            j0(r0Var);
        }
        U0(r0Var);
    }

    public final float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    public final void D0(SVG.u0 u0Var) {
        y("Text render", new Object[0]);
        W0(this.f13948d, u0Var);
        if (A()) {
            Matrix matrix = u0Var.f13874s;
            if (matrix != null) {
                this.f13945a.concat(matrix);
            }
            List<SVG.o> list = u0Var.f13891o;
            float f10 = 0.0f;
            float fE = (list == null || list.size() == 0) ? 0.0f : u0Var.f13891o.get(0).e(this);
            List<SVG.o> list2 = u0Var.f13892p;
            float f11 = (list2 == null || list2.size() == 0) ? 0.0f : u0Var.f13892p.get(0).f(this);
            List<SVG.o> list3 = u0Var.f13893q;
            float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : u0Var.f13893q.get(0).e(this);
            List<SVG.o> list4 = u0Var.f13894r;
            if (list4 != null && list4.size() != 0) {
                f10 = u0Var.f13894r.get(0).f(this);
            }
            SVG.Style.TextAnchor textAnchorO = O();
            if (textAnchorO != SVG.Style.TextAnchor.Start) {
                float fN = n(u0Var);
                if (textAnchorO == SVG.Style.TextAnchor.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            if (u0Var.f13817h == null) {
                i iVar = new i(fE, f11);
                E(u0Var, iVar);
                RectF rectF = iVar.f13995d;
                u0Var.f13817h = new SVG.b(rectF.left, rectF.top, rectF.width(), iVar.f13995d.height());
            }
            U0(u0Var);
            r(u0Var);
            p(u0Var);
            boolean zM0 = m0();
            E(u0Var, new f(fE + fE2, f11 + f10));
            if (zM0) {
                j0(u0Var);
            }
        }
    }

    public final void E0(SVG.b1 b1Var) {
        y("Use render", new Object[0]);
        SVG.o oVar = b1Var.f13782s;
        if (oVar == null || !oVar.i()) {
            SVG.o oVar2 = b1Var.f13783t;
            if (oVar2 == null || !oVar2.i()) {
                W0(this.f13948d, b1Var);
                if (A()) {
                    SVG.l0 l0VarU = b1Var.f13834a.u(b1Var.f13779p);
                    if (l0VarU == null) {
                        F("Use reference '%s' not found", b1Var.f13779p);
                        return;
                    }
                    Matrix matrix = b1Var.f13833o;
                    if (matrix != null) {
                        this.f13945a.concat(matrix);
                    }
                    SVG.o oVar3 = b1Var.f13780q;
                    float fE = oVar3 != null ? oVar3.e(this) : 0.0f;
                    SVG.o oVar4 = b1Var.f13781r;
                    this.f13945a.translate(fE, oVar4 != null ? oVar4.f(this) : 0.0f);
                    p(b1Var);
                    boolean zM0 = m0();
                    i0(b1Var);
                    if (l0VarU instanceof SVG.d0) {
                        SVG.b bVarF0 = f0(null, null, b1Var.f13782s, b1Var.f13783t);
                        S0();
                        y0((SVG.d0) l0VarU, bVarF0);
                        R0();
                    } else if (l0VarU instanceof SVG.r0) {
                        SVG.o oVar5 = b1Var.f13782s;
                        if (oVar5 == null) {
                            oVar5 = new SVG.o(100.0f, SVG.Unit.percent);
                        }
                        SVG.o oVar6 = b1Var.f13783t;
                        if (oVar6 == null) {
                            oVar6 = new SVG.o(100.0f, SVG.Unit.percent);
                        }
                        SVG.b bVarF1 = f0(null, null, oVar5, oVar6);
                        S0();
                        C0((SVG.r0) l0VarU, bVarF1);
                        R0();
                    } else {
                        A0(l0VarU);
                    }
                    h0();
                    if (zM0) {
                        j0(b1Var);
                    }
                    U0(b1Var);
                }
            }
        }
    }

    public final void J0(SVG.r rVar, SVG.i0 i0Var, SVG.b bVar) {
        float fE;
        float f10;
        y("Mask render", new Object[0]);
        Boolean bool = rVar.f13861o;
        boolean z10 = true;
        if (bool != null && bool.booleanValue()) {
            SVG.o oVar = rVar.f13865s;
            fE = oVar != null ? oVar.e(this) : bVar.f13777c;
            SVG.o oVar2 = rVar.f13866t;
            f10 = oVar2 != null ? oVar2.f(this) : bVar.f13778d;
        } else {
            SVG.o oVar3 = rVar.f13865s;
            float fD = oVar3 != null ? oVar3.d(this, 1.0f) : 1.2f;
            SVG.o oVar4 = rVar.f13866t;
            float fD2 = oVar4 != null ? oVar4.d(this, 1.0f) : 1.2f;
            fE = fD * bVar.f13777c;
            f10 = fD2 * bVar.f13778d;
        }
        if (fE == 0.0f || f10 == 0.0f) {
            return;
        }
        S0();
        h hVarM = M(rVar);
        this.f13948d = hVarM;
        hVarM.f13984a.f13738n = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f13945a.save();
        Boolean bool2 = rVar.f13862p;
        if (bool2 != null && !bool2.booleanValue()) {
            z10 = false;
        }
        if (!z10) {
            this.f13945a.translate(bVar.f13775a, bVar.f13776b);
            this.f13945a.scale(bVar.f13777c, bVar.f13778d);
        }
        F0(rVar, false);
        this.f13945a.restore();
        if (zM0) {
            k0(i0Var, bVar);
        }
        R0();
    }

    public final void L0(SVG.x0 x0Var) {
        y("TextPath render", new Object[0]);
        W0(this.f13948d, x0Var);
        if (A() && Y0()) {
            SVG.l0 l0VarU = x0Var.f13834a.u(x0Var.f13887o);
            if (l0VarU == null) {
                F("TextPath reference '%s' not found", x0Var.f13887o);
                return;
            }
            SVG.u uVar = (SVG.u) l0VarU;
            Path pathF = new d(uVar.f13872o).f();
            Matrix matrix = uVar.f13828n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathF, false);
            SVG.o oVar = x0Var.f13888p;
            float fD = oVar != null ? oVar.d(this, pathMeasure.getLength()) : 0.0f;
            SVG.Style.TextAnchor textAnchorO = O();
            if (textAnchorO != SVG.Style.TextAnchor.Start) {
                float fN = n(x0Var);
                if (textAnchorO == SVG.Style.TextAnchor.Middle) {
                    fN /= 2.0f;
                }
                fD -= fN;
            }
            r((SVG.i0) x0Var.c());
            boolean zM0 = m0();
            E(x0Var, new e(pathF, fD, 0.0f));
            if (zM0) {
                j0(x0Var);
            }
        }
    }

    public final void O0(float f10, float f11, float f12, float f13) {
        float fE = f12 + f10;
        float f14 = f13 + f11;
        SVG.c cVar = this.f13948d.f13984a.f13748x;
        if (cVar != null) {
            f10 += cVar.f13787d.e(this);
            f11 += this.f13948d.f13984a.f13748x.f13784a.f(this);
            fE -= this.f13948d.f13984a.f13748x.f13785b.e(this);
            f14 -= this.f13948d.f13984a.f13748x.f13786c.f(this);
        }
        this.f13945a.clipRect(f10, f11, fE, f14);
    }

    public final void Q0(boolean z10, SVG.b0 b0Var) {
        if (z10) {
            if (W(b0Var.f13825e, 2147483648L)) {
                h hVar = this.f13948d;
                SVG.Style style = hVar.f13984a;
                SVG.m0 m0Var = b0Var.f13825e.I;
                style.f13727c = m0Var;
                hVar.f13985b = m0Var != null;
            }
            if (W(b0Var.f13825e, 4294967296L)) {
                this.f13948d.f13984a.f13729e = b0Var.f13825e.J;
            }
            if (W(b0Var.f13825e, 6442450944L)) {
                h hVar2 = this.f13948d;
                P0(hVar2, z10, hVar2.f13984a.f13727c);
                return;
            }
            return;
        }
        if (W(b0Var.f13825e, 2147483648L)) {
            h hVar3 = this.f13948d;
            SVG.Style style2 = hVar3.f13984a;
            SVG.m0 m0Var2 = b0Var.f13825e.I;
            style2.f13730f = m0Var2;
            hVar3.f13986c = m0Var2 != null;
        }
        if (W(b0Var.f13825e, 4294967296L)) {
            this.f13948d.f13984a.f13731g = b0Var.f13825e.J;
        }
        if (W(b0Var.f13825e, 6442450944L)) {
            h hVar4 = this.f13948d;
            P0(hVar4, z10, hVar4.f13984a.f13730f);
        }
    }

    public final SVG.b f0(SVG.o oVar, SVG.o oVar2, SVG.o oVar3, SVG.o oVar4) {
        float fE = oVar != null ? oVar.e(this) : 0.0f;
        float f10 = oVar2 != null ? oVar2.f(this) : 0.0f;
        SVG.b bVarS = S();
        return new SVG.b(fE, f10, oVar3 != null ? oVar3.e(this) : bVarS.f13777c, oVar4 != null ? oVar4.f(this) : bVarS.f13778d);
    }

    public final void l0(SVG.l0 l0Var, j jVar) {
        float f10;
        float f11;
        float fE;
        SVG.Style.TextAnchor textAnchorO;
        if (jVar.a((SVG.w0) l0Var)) {
            if (l0Var instanceof SVG.x0) {
                S0();
                L0((SVG.x0) l0Var);
                R0();
                return;
            }
            if (!(l0Var instanceof SVG.t0)) {
                if (l0Var instanceof SVG.s0) {
                    S0();
                    SVG.s0 s0Var = (SVG.s0) l0Var;
                    W0(this.f13948d, s0Var);
                    if (A()) {
                        r((SVG.i0) s0Var.c());
                        SVG.l0 l0VarU = l0Var.f13834a.u(s0Var.f13867o);
                        if (l0VarU == null || !(l0VarU instanceof SVG.w0)) {
                            F("Tref reference '%s' not found", s0Var.f13867o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((SVG.w0) l0VarU, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            SVG.t0 t0Var = (SVG.t0) l0Var;
            W0(this.f13948d, t0Var);
            if (A()) {
                List<SVG.o> list = t0Var.f13891o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float f12 = 0.0f;
                if (z11) {
                    float fE2 = !z10 ? ((f) jVar).f13977b : t0Var.f13891o.get(0).e(this);
                    List<SVG.o> list2 = t0Var.f13892p;
                    f11 = (list2 == null || list2.size() == 0) ? ((f) jVar).f13978c : t0Var.f13892p.get(0).f(this);
                    List<SVG.o> list3 = t0Var.f13893q;
                    fE = (list3 == null || list3.size() == 0) ? 0.0f : t0Var.f13893q.get(0).e(this);
                    List<SVG.o> list4 = t0Var.f13894r;
                    if (list4 != null && list4.size() != 0) {
                        f12 = t0Var.f13894r.get(0).f(this);
                    }
                    f10 = f12;
                    f12 = fE2;
                } else {
                    f10 = 0.0f;
                    f11 = 0.0f;
                    fE = 0.0f;
                }
                if (z10 && (textAnchorO = O()) != SVG.Style.TextAnchor.Start) {
                    float fN = n(t0Var);
                    if (textAnchorO == SVG.Style.TextAnchor.Middle) {
                        fN /= 2.0f;
                    }
                    f12 -= fN;
                }
                r((SVG.i0) t0Var.c());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f13977b = f12 + fE;
                    fVar.f13978c = f11 + f10;
                }
                boolean zM0 = m0();
                E(t0Var, jVar);
                if (zM0) {
                    j0(t0Var);
                }
            }
            R0();
        }
    }

    public final void o0(SVG.d dVar) {
        y("Circle render", new Object[0]);
        SVG.o oVar = dVar.f13791q;
        if (oVar == null || oVar.i()) {
            return;
        }
        W0(this.f13948d, dVar);
        if (A() && Y0()) {
            Matrix matrix = dVar.f13828n;
            if (matrix != null) {
                this.f13945a.concat(matrix);
            }
            Path pathY = Y(dVar);
            U0(dVar);
            r(dVar);
            p(dVar);
            boolean zM0 = m0();
            if (this.f13948d.f13985b) {
                B(dVar, pathY);
            }
            if (this.f13948d.f13986c) {
                C(pathY);
            }
            if (zM0) {
                j0(dVar);
            }
        }
    }

    public final void p0(SVG.i iVar) {
        y("Ellipse render", new Object[0]);
        SVG.o oVar = iVar.f13815q;
        if (oVar == null || iVar.f13816r == null || oVar.i() || iVar.f13816r.i()) {
            return;
        }
        W0(this.f13948d, iVar);
        if (A() && Y0()) {
            Matrix matrix = iVar.f13828n;
            if (matrix != null) {
                this.f13945a.concat(matrix);
            }
            Path pathZ = Z(iVar);
            U0(iVar);
            r(iVar);
            p(iVar);
            boolean zM0 = m0();
            if (this.f13948d.f13985b) {
                B(iVar, pathZ);
            }
            if (this.f13948d.f13986c) {
                C(pathZ);
            }
            if (zM0) {
                j0(iVar);
            }
        }
    }

    public final void q0(SVG.l lVar) {
        y("Group render", new Object[0]);
        W0(this.f13948d, lVar);
        if (A()) {
            Matrix matrix = lVar.f13833o;
            if (matrix != null) {
                this.f13945a.concat(matrix);
            }
            p(lVar);
            boolean zM0 = m0();
            F0(lVar, true);
            if (zM0) {
                j0(lVar);
            }
            U0(lVar);
        }
    }

    public final void r0(SVG.n nVar) {
        SVG.o oVar;
        String str;
        y("Image render", new Object[0]);
        SVG.o oVar2 = nVar.f13839s;
        if (oVar2 == null || oVar2.i() || (oVar = nVar.f13840t) == null || oVar.i() || (str = nVar.f13836p) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = nVar.f13842o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f13707e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            SVG.k();
            return;
        }
        SVG.b bVar = new SVG.b(0.0f, 0.0f, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f13948d, nVar);
        if (A() && Y0()) {
            Matrix matrix = nVar.f13841u;
            if (matrix != null) {
                this.f13945a.concat(matrix);
            }
            SVG.o oVar3 = nVar.f13837q;
            float fE = oVar3 != null ? oVar3.e(this) : 0.0f;
            SVG.o oVar4 = nVar.f13838r;
            this.f13948d.f13989f = new SVG.b(fE, oVar4 != null ? oVar4.f(this) : 0.0f, nVar.f13839s.e(this), nVar.f13840t.e(this));
            if (!this.f13948d.f13984a.f13747w.booleanValue()) {
                SVG.b bVar2 = this.f13948d.f13989f;
                O0(bVar2.f13775a, bVar2.f13776b, bVar2.f13777c, bVar2.f13778d);
            }
            nVar.f13817h = this.f13948d.f13989f;
            U0(nVar);
            p(nVar);
            boolean zM0 = m0();
            X0();
            this.f13945a.save();
            this.f13945a.concat(o(this.f13948d.f13989f, bVar, preserveAspectRatio));
            this.f13945a.drawBitmap(bitmapS, 0.0f, 0.0f, new Paint(this.f13948d.f13984a.N != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.f13945a.restore();
            if (zM0) {
                j0(nVar);
            }
        }
    }

    public final void s0(SVG.p pVar) {
        y("Line render", new Object[0]);
        W0(this.f13948d, pVar);
        if (A() && Y0() && this.f13948d.f13986c) {
            Matrix matrix = pVar.f13828n;
            if (matrix != null) {
                this.f13945a.concat(matrix);
            }
            Path pathA0 = a0(pVar);
            U0(pVar);
            r(pVar);
            p(pVar);
            boolean zM0 = m0();
            C(pathA0);
            I0(pVar);
            if (zM0) {
                j0(pVar);
            }
        }
    }

    public final void t0(SVG.u uVar) {
        y("Path render", new Object[0]);
        if (uVar.f13872o == null) {
            return;
        }
        W0(this.f13948d, uVar);
        if (A() && Y0()) {
            h hVar = this.f13948d;
            if (hVar.f13986c || hVar.f13985b) {
                Matrix matrix = uVar.f13828n;
                if (matrix != null) {
                    this.f13945a.concat(matrix);
                }
                Path pathF = new d(uVar.f13872o).f();
                if (uVar.f13817h == null) {
                    uVar.f13817h = m(pathF);
                }
                U0(uVar);
                r(uVar);
                p(uVar);
                boolean zM0 = m0();
                if (this.f13948d.f13985b) {
                    pathF.setFillType(U());
                    B(uVar, pathF);
                }
                if (this.f13948d.f13986c) {
                    C(pathF);
                }
                I0(uVar);
                if (zM0) {
                    j0(uVar);
                }
            }
        }
    }

    public final void u0(SVG.y yVar) {
        y("PolyLine render", new Object[0]);
        W0(this.f13948d, yVar);
        if (A() && Y0()) {
            h hVar = this.f13948d;
            if (hVar.f13986c || hVar.f13985b) {
                Matrix matrix = yVar.f13828n;
                if (matrix != null) {
                    this.f13945a.concat(matrix);
                }
                if (yVar.f13890o.length < 2) {
                    return;
                }
                Path pathB0 = b0(yVar);
                U0(yVar);
                pathB0.setFillType(U());
                r(yVar);
                p(yVar);
                boolean zM0 = m0();
                if (this.f13948d.f13985b) {
                    B(yVar, pathB0);
                }
                if (this.f13948d.f13986c) {
                    C(pathB0);
                }
                I0(yVar);
                if (zM0) {
                    j0(yVar);
                }
            }
        }
    }

    public final void v0(SVG.z zVar) {
        y("Polygon render", new Object[0]);
        W0(this.f13948d, zVar);
        if (A() && Y0()) {
            h hVar = this.f13948d;
            if (hVar.f13986c || hVar.f13985b) {
                Matrix matrix = zVar.f13828n;
                if (matrix != null) {
                    this.f13945a.concat(matrix);
                }
                if (zVar.f13890o.length < 2) {
                    return;
                }
                Path pathB0 = b0(zVar);
                U0(zVar);
                r(zVar);
                p(zVar);
                boolean zM0 = m0();
                if (this.f13948d.f13985b) {
                    B(zVar, pathB0);
                }
                if (this.f13948d.f13986c) {
                    C(pathB0);
                }
                I0(zVar);
                if (zM0) {
                    j0(zVar);
                }
            }
        }
    }

    public final void w0(SVG.a0 a0Var) {
        y("Rect render", new Object[0]);
        SVG.o oVar = a0Var.f13769q;
        if (oVar == null || a0Var.f13770r == null || oVar.i() || a0Var.f13770r.i()) {
            return;
        }
        W0(this.f13948d, a0Var);
        if (A() && Y0()) {
            Matrix matrix = a0Var.f13828n;
            if (matrix != null) {
                this.f13945a.concat(matrix);
            }
            Path pathC0 = c0(a0Var);
            U0(a0Var);
            r(a0Var);
            p(a0Var);
            boolean zM0 = m0();
            if (this.f13948d.f13985b) {
                B(a0Var, pathC0);
            }
            if (this.f13948d.f13986c) {
                C(pathC0);
            }
            if (zM0) {
                j0(a0Var);
            }
        }
    }

    public final void z0(SVG.d0 d0Var, SVG.b bVar, SVG.b bVar2, PreserveAspectRatio preserveAspectRatio) {
        y("Svg render", new Object[0]);
        if (bVar.f13777c == 0.0f || bVar.f13778d == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = d0Var.f13842o) == null) {
            preserveAspectRatio = PreserveAspectRatio.f13707e;
        }
        W0(this.f13948d, d0Var);
        if (A()) {
            h hVar = this.f13948d;
            hVar.f13989f = bVar;
            if (!hVar.f13984a.f13747w.booleanValue()) {
                SVG.b bVar3 = this.f13948d.f13989f;
                O0(bVar3.f13775a, bVar3.f13776b, bVar3.f13777c, bVar3.f13778d);
            }
            q(d0Var, this.f13948d.f13989f);
            if (bVar2 != null) {
                this.f13945a.concat(o(this.f13948d.f13989f, bVar2, preserveAspectRatio));
                this.f13948d.f13990g = d0Var.f13854p;
            } else {
                Canvas canvas = this.f13945a;
                SVG.b bVar4 = this.f13948d.f13989f;
                canvas.translate(bVar4.f13775a, bVar4.f13776b);
            }
            boolean zM0 = m0();
            X0();
            F0(d0Var, true);
            if (zM0) {
                j0(d0Var);
            }
            U0(d0Var);
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13955c;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            f13955c = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13955c[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13955c[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            f13954b = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13954b[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13954b[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            f13953a = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13953a[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13953a[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13953a[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13953a[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13953a[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13953a[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13953a[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static synchronized void V() {
        HashSet<String> hashSet = new HashSet<>();
        f13944i = hashSet;
        hashSet.add("Structure");
        f13944i.add("BasicStructure");
        f13944i.add("ConditionalProcessing");
        f13944i.add("Image");
        f13944i.add("Style");
        f13944i.add("ViewportAttribute");
        f13944i.add("Shape");
        f13944i.add("BasicText");
        f13944i.add("PaintAttribute");
        f13944i.add("BasicPaintAttribute");
        f13944i.add("OpacityAttribute");
        f13944i.add("BasicGraphicsAttribute");
        f13944i.add("Marker");
        f13944i.add("Gradient");
        f13944i.add("Pattern");
        f13944i.add("Clip");
        f13944i.add("BasicClip");
        f13944i.add("Mask");
        f13944i.add("View");
    }

    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, SVG.w wVar) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            wVar.b(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(((double) f14) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((double) (f10 - f15)) / 2.0d;
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = (dCos * d10) + (dSin * d11);
        double d13 = ((-dSin) * d10) + (d11 * dCos);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z10 == z11 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = d19 * Math.sqrt(d23);
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        float f17 = fAbs;
        float f18 = fAbs2;
        double d27 = dSqrt2 * (-((d25 * d12) / d24));
        double d28 = (((double) (f10 + f15)) / 2.0d) + ((dCos * d26) - (dSin * d27));
        double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double dV = ((d30 * d33) - (d31 * d32) >= 0.0d ? 1.0d : -1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z11 && dV > 0.0d) {
            dV -= 6.283185307179586d;
        } else if (z11 && dV < 0.0d) {
            dV += 6.283185307179586d;
        }
        float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(f17, f18);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrI);
        fArrI[fArrI.length - 2] = f15;
        fArrI[fArrI.length - 1] = f16;
        for (int i10 = 0; i10 < fArrI.length; i10 += 6) {
            wVar.d(fArrI[i10], fArrI[i10 + 1], fArrI[i10 + 2], fArrI[i10 + 3], fArrI[i10 + 4], fArrI[i10 + 5]);
        }
    }

    public static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    public static int x(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
    }

    public final boolean A() {
        Boolean bool = this.f13948d.f13984a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void A0(SVG.l0 l0Var) {
        if (l0Var instanceof SVG.s) {
            return;
        }
        S0();
        u(l0Var);
        if (l0Var instanceof SVG.d0) {
            x0((SVG.d0) l0Var);
        } else if (l0Var instanceof SVG.b1) {
            E0((SVG.b1) l0Var);
        } else if (l0Var instanceof SVG.q0) {
            B0((SVG.q0) l0Var);
        } else if (l0Var instanceof SVG.l) {
            q0((SVG.l) l0Var);
        } else if (l0Var instanceof SVG.n) {
            r0((SVG.n) l0Var);
        } else if (l0Var instanceof SVG.u) {
            t0((SVG.u) l0Var);
        } else if (l0Var instanceof SVG.a0) {
            w0((SVG.a0) l0Var);
        } else if (l0Var instanceof SVG.d) {
            o0((SVG.d) l0Var);
        } else if (l0Var instanceof SVG.i) {
            p0((SVG.i) l0Var);
        } else if (l0Var instanceof SVG.p) {
            s0((SVG.p) l0Var);
        } else if (l0Var instanceof SVG.z) {
            v0((SVG.z) l0Var);
        } else if (l0Var instanceof SVG.y) {
            u0((SVG.y) l0Var);
        } else if (l0Var instanceof SVG.u0) {
            D0((SVG.u0) l0Var);
        }
        R0();
    }

    public final void B(SVG.i0 i0Var, Path path) {
        SVG.m0 m0Var = this.f13948d.f13984a.f13727c;
        if (m0Var instanceof SVG.t) {
            SVG.l0 l0VarU = this.f13947c.u(((SVG.t) m0Var).f13869b);
            if (l0VarU instanceof SVG.x) {
                L(i0Var, path, (SVG.x) l0VarU);
                return;
            }
        }
        this.f13945a.drawPath(path, this.f13948d.f13987d);
    }

    public final void C(Path path) {
        h hVar = this.f13948d;
        if (hVar.f13984a.M != SVG.Style.VectorEffect.NonScalingStroke) {
            this.f13945a.drawPath(path, hVar.f13988e);
            return;
        }
        Matrix matrix = this.f13945a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f13945a.setMatrix(new Matrix());
        Shader shader = this.f13948d.f13988e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f13945a.drawPath(path2, this.f13948d.f13988e);
        this.f13945a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void F0(SVG.h0 h0Var, boolean z10) {
        if (z10) {
            i0(h0Var);
        }
        Iterator<SVG.l0> it = h0Var.k().iterator();
        while (it.hasNext()) {
            A0(it.next());
        }
        if (z10) {
            h0();
        }
    }

    public final void G(SVG.w0 w0Var, StringBuilder sb2) {
        Iterator<SVG.l0> it = w0Var.f13801i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            SVG.l0 next = it.next();
            if (next instanceof SVG.w0) {
                G((SVG.w0) next, sb2);
            } else if (next instanceof SVG.a1) {
                sb2.append(T0(((SVG.a1) next).f13773c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public void G0(SVG svg, com.caverock.androidsvg.a aVar) {
        SVG.b bVar;
        PreserveAspectRatio preserveAspectRatio;
        if (aVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f13947c = svg;
        SVG.d0 d0VarP = svg.p();
        if (d0VarP == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (aVar.e()) {
            SVG.j0 j0VarJ = this.f13947c.j(aVar.f13942e);
            if (j0VarJ == null || !(j0VarJ instanceof SVG.c1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", aVar.f13942e));
                return;
            }
            SVG.c1 c1Var = (SVG.c1) j0VarJ;
            bVar = c1Var.f13854p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", aVar.f13942e));
                return;
            }
            preserveAspectRatio = c1Var.f13842o;
        } else {
            bVar = aVar.f() ? aVar.f13941d : d0VarP.f13854p;
            preserveAspectRatio = aVar.c() ? aVar.f13939b : d0VarP.f13842o;
        }
        if (aVar.b()) {
            svg.a(aVar.f13938a);
        }
        if (aVar.d()) {
            CSSParser.m mVar = new CSSParser.m();
            this.f13952h = mVar;
            mVar.f13697a = svg.j(aVar.f13940c);
        }
        N0();
        u(d0VarP);
        S0();
        SVG.b bVar2 = new SVG.b(aVar.f13943f);
        SVG.o oVar = d0VarP.f13794s;
        if (oVar != null) {
            bVar2.f13777c = oVar.d(this, bVar2.f13777c);
        }
        SVG.o oVar2 = d0VarP.f13795t;
        if (oVar2 != null) {
            bVar2.f13778d = oVar2.d(this, bVar2.f13778d);
        }
        z0(d0VarP, bVar2, bVar, preserveAspectRatio);
        R0();
        if (aVar.b()) {
            svg.b();
        }
    }

    public final void H(SVG.j jVar, String str) {
        SVG.l0 l0VarU = jVar.f13834a.u(str);
        if (l0VarU == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(l0VarU instanceof SVG.j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (l0VarU == jVar) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.j jVar2 = (SVG.j) l0VarU;
        if (jVar.f13819i == null) {
            jVar.f13819i = jVar2.f13819i;
        }
        if (jVar.f13820j == null) {
            jVar.f13820j = jVar2.f13820j;
        }
        if (jVar.f13821k == null) {
            jVar.f13821k = jVar2.f13821k;
        }
        if (jVar.f13818h.isEmpty()) {
            jVar.f13818h = jVar2.f13818h;
        }
        try {
            if (jVar instanceof SVG.k0) {
                I((SVG.k0) jVar, (SVG.k0) l0VarU);
            } else {
                J((SVG.o0) jVar, (SVG.o0) l0VarU);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f13822l;
        if (str2 != null) {
            H(jVar, str2);
        }
    }

    public final void I(SVG.k0 k0Var, SVG.k0 k0Var2) {
        if (k0Var.f13829m == null) {
            k0Var.f13829m = k0Var2.f13829m;
        }
        if (k0Var.f13830n == null) {
            k0Var.f13830n = k0Var2.f13830n;
        }
        if (k0Var.f13831o == null) {
            k0Var.f13831o = k0Var2.f13831o;
        }
        if (k0Var.f13832p == null) {
            k0Var.f13832p = k0Var2.f13832p;
        }
    }

    public final void I0(SVG.k kVar) {
        SVG.q qVar;
        SVG.q qVar2;
        SVG.q qVar3;
        List<c> listK;
        int size;
        SVG.Style style = this.f13948d.f13984a;
        String str = style.f13749y;
        if (str == null && style.f13750z == null && style.A == null) {
            return;
        }
        if (str == null) {
            qVar = null;
        } else {
            SVG.l0 l0VarU = kVar.f13834a.u(str);
            if (l0VarU != null) {
                qVar = (SVG.q) l0VarU;
            } else {
                F("Marker reference '%s' not found", this.f13948d.f13984a.f13749y);
                qVar = null;
            }
        }
        String str2 = this.f13948d.f13984a.f13750z;
        if (str2 == null) {
            qVar2 = null;
        } else {
            SVG.l0 l0VarU2 = kVar.f13834a.u(str2);
            if (l0VarU2 != null) {
                qVar2 = (SVG.q) l0VarU2;
            } else {
                F("Marker reference '%s' not found", this.f13948d.f13984a.f13750z);
                qVar2 = null;
            }
        }
        String str3 = this.f13948d.f13984a.A;
        if (str3 == null) {
            qVar3 = null;
        } else {
            SVG.l0 l0VarU3 = kVar.f13834a.u(str3);
            if (l0VarU3 != null) {
                qVar3 = (SVG.q) l0VarU3;
            } else {
                F("Marker reference '%s' not found", this.f13948d.f13984a.A);
                qVar3 = null;
            }
        }
        if (kVar instanceof SVG.u) {
            listK = new C0164b(((SVG.u) kVar).f13872o).f();
        } else {
            listK = kVar instanceof SVG.p ? k((SVG.p) kVar) : l((SVG.y) kVar);
        }
        if (listK == null || (size = listK.size()) == 0) {
            return;
        }
        SVG.Style style2 = this.f13948d.f13984a;
        style2.A = null;
        style2.f13750z = null;
        style2.f13749y = null;
        if (qVar != null) {
            H0(qVar, listK.get(0));
        }
        if (qVar2 != null && listK.size() > 2) {
            c cVarN0 = listK.get(0);
            c cVar = listK.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = listK.get(i10);
                cVarN0 = cVar.f13969e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(qVar2, cVarN0);
                cVar = cVar2;
            }
        }
        if (qVar3 != null) {
            H0(qVar3, listK.get(size - 1));
        }
    }

    public final void J(SVG.o0 o0Var, SVG.o0 o0Var2) {
        if (o0Var.f13845m == null) {
            o0Var.f13845m = o0Var2.f13845m;
        }
        if (o0Var.f13846n == null) {
            o0Var.f13846n = o0Var2.f13846n;
        }
        if (o0Var.f13847o == null) {
            o0Var.f13847o = o0Var2.f13847o;
        }
        if (o0Var.f13848p == null) {
            o0Var.f13848p = o0Var2.f13848p;
        }
        if (o0Var.f13849q == null) {
            o0Var.f13849q = o0Var2.f13849q;
        }
    }

    public final void K(SVG.x xVar, String str) {
        SVG.l0 l0VarU = xVar.f13834a.u(str);
        if (l0VarU == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(l0VarU instanceof SVG.x)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (l0VarU == xVar) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.x xVar2 = (SVG.x) l0VarU;
        if (xVar.f13879q == null) {
            xVar.f13879q = xVar2.f13879q;
        }
        if (xVar.f13880r == null) {
            xVar.f13880r = xVar2.f13880r;
        }
        if (xVar.f13881s == null) {
            xVar.f13881s = xVar2.f13881s;
        }
        if (xVar.f13882t == null) {
            xVar.f13882t = xVar2.f13882t;
        }
        if (xVar.f13883u == null) {
            xVar.f13883u = xVar2.f13883u;
        }
        if (xVar.f13884v == null) {
            xVar.f13884v = xVar2.f13884v;
        }
        if (xVar.f13885w == null) {
            xVar.f13885w = xVar2.f13885w;
        }
        if (xVar.f13801i.isEmpty()) {
            xVar.f13801i = xVar2.f13801i;
        }
        if (xVar.f13854p == null) {
            xVar.f13854p = xVar2.f13854p;
        }
        if (xVar.f13842o == null) {
            xVar.f13842o = xVar2.f13842o;
        }
        String str2 = xVar2.f13886x;
        if (str2 != null) {
            K(xVar, str2);
        }
    }

    public final void L(SVG.i0 i0Var, Path path, SVG.x xVar) {
        float fE;
        float f10;
        float f11;
        float fE2;
        Boolean bool = xVar.f13879q;
        boolean z10 = bool != null && bool.booleanValue();
        String str = xVar.f13886x;
        if (str != null) {
            K(xVar, str);
        }
        if (z10) {
            SVG.o oVar = xVar.f13882t;
            fE = oVar != null ? oVar.e(this) : 0.0f;
            SVG.o oVar2 = xVar.f13883u;
            f11 = oVar2 != null ? oVar2.f(this) : 0.0f;
            SVG.o oVar3 = xVar.f13884v;
            fE2 = oVar3 != null ? oVar3.e(this) : 0.0f;
            SVG.o oVar4 = xVar.f13885w;
            f10 = oVar4 != null ? oVar4.f(this) : 0.0f;
        } else {
            SVG.o oVar5 = xVar.f13882t;
            float fD = oVar5 != null ? oVar5.d(this, 1.0f) : 0.0f;
            SVG.o oVar6 = xVar.f13883u;
            float fD2 = oVar6 != null ? oVar6.d(this, 1.0f) : 0.0f;
            SVG.o oVar7 = xVar.f13884v;
            float fD3 = oVar7 != null ? oVar7.d(this, 1.0f) : 0.0f;
            SVG.o oVar8 = xVar.f13885w;
            float fD4 = oVar8 != null ? oVar8.d(this, 1.0f) : 0.0f;
            SVG.b bVar = i0Var.f13817h;
            float f12 = bVar.f13775a;
            float f13 = bVar.f13777c;
            fE = (fD * f13) + f12;
            float f14 = bVar.f13776b;
            float f15 = bVar.f13778d;
            float f16 = fD3 * f13;
            f10 = fD4 * f15;
            f11 = (fD2 * f15) + f14;
            fE2 = f16;
        }
        if (fE2 == 0.0f || f10 == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = xVar.f13842o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f13707e;
        }
        S0();
        this.f13945a.clipPath(path);
        h hVar = new h();
        V0(hVar, SVG.Style.a());
        hVar.f13984a.f13747w = Boolean.FALSE;
        this.f13948d = N(xVar, hVar);
        SVG.b bVar2 = i0Var.f13817h;
        Matrix matrix = xVar.f13881s;
        if (matrix != null) {
            this.f13945a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (xVar.f13881s.invert(matrix2)) {
                SVG.b bVar3 = i0Var.f13817h;
                SVG.b bVar4 = i0Var.f13817h;
                SVG.b bVar5 = i0Var.f13817h;
                float[] fArr = {bVar3.f13775a, bVar3.f13776b, bVar3.b(), bVar4.f13776b, bVar4.b(), i0Var.f13817h.c(), bVar5.f13775a, bVar5.c()};
                matrix2.mapPoints(fArr);
                float f17 = fArr[0];
                float f18 = fArr[1];
                RectF rectF = new RectF(f17, f18, f17, f18);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f19 = fArr[i10];
                    if (f19 < rectF.left) {
                        rectF.left = f19;
                    }
                    if (f19 > rectF.right) {
                        rectF.right = f19;
                    }
                    float f20 = fArr[i10 + 1];
                    if (f20 < rectF.top) {
                        rectF.top = f20;
                    }
                    if (f20 > rectF.bottom) {
                        rectF.bottom = f20;
                    }
                }
                float f21 = rectF.left;
                float f22 = rectF.top;
                bVar2 = new SVG.b(f21, f22, rectF.right - f21, rectF.bottom - f22);
            }
        }
        float fFloor = fE + (((float) Math.floor((bVar2.f13775a - fE) / fE2)) * fE2);
        float fB = bVar2.b();
        float fC = bVar2.c();
        SVG.b bVar6 = new SVG.b(0.0f, 0.0f, fE2, f10);
        boolean zM0 = m0();
        for (float fFloor2 = f11 + (((float) Math.floor((bVar2.f13776b - f11) / f10)) * f10); fFloor2 < fC; fFloor2 += f10) {
            float f23 = fFloor;
            while (f23 < fB) {
                bVar6.f13775a = f23;
                bVar6.f13776b = fFloor2;
                S0();
                if (!this.f13948d.f13984a.f13747w.booleanValue()) {
                    O0(bVar6.f13775a, bVar6.f13776b, bVar6.f13777c, bVar6.f13778d);
                }
                SVG.b bVar7 = xVar.f13854p;
                if (bVar7 != null) {
                    this.f13945a.concat(o(bVar6, bVar7, preserveAspectRatio));
                } else {
                    Boolean bool2 = xVar.f13880r;
                    boolean z11 = bool2 == null || bool2.booleanValue();
                    this.f13945a.translate(f23, fFloor2);
                    if (!z11) {
                        Canvas canvas = this.f13945a;
                        SVG.b bVar8 = i0Var.f13817h;
                        canvas.scale(bVar8.f13777c, bVar8.f13778d);
                    }
                }
                Iterator<SVG.l0> it = xVar.f13801i.iterator();
                while (it.hasNext()) {
                    A0(it.next());
                }
                R0();
                f23 += fE2;
                fFloor = fFloor;
            }
        }
        if (zM0) {
            j0(xVar);
        }
        R0();
    }

    public final h M(SVG.l0 l0Var) {
        h hVar = new h();
        V0(hVar, SVG.Style.a());
        return N(l0Var, hVar);
    }

    public final boolean M0() {
        return this.f13948d.f13984a.f13738n.floatValue() < 1.0f || this.f13948d.f13984a.H != null;
    }

    public final h N(SVG.l0 l0Var, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (l0Var instanceof SVG.j0) {
                arrayList.add(0, (SVG.j0) l0Var);
            }
            Object obj = l0Var.f13835b;
            if (obj == null) {
                break;
            }
            l0Var = (SVG.l0) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0(hVar, (SVG.j0) it.next());
        }
        h hVar2 = this.f13948d;
        hVar.f13990g = hVar2.f13990g;
        hVar.f13989f = hVar2.f13989f;
        return hVar;
    }

    public final void N0() {
        this.f13948d = new h();
        this.f13949e = new Stack<>();
        V0(this.f13948d, SVG.Style.a());
        h hVar = this.f13948d;
        hVar.f13989f = null;
        hVar.f13991h = false;
        this.f13949e.push(new h(hVar));
        this.f13951g = new Stack<>();
        this.f13950f = new Stack<>();
    }

    public final SVG.Style.TextAnchor O() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.f13948d.f13984a;
        if (style.f13745u == SVG.Style.TextDirection.LTR || (textAnchor = style.f13746v) == SVG.Style.TextAnchor.Middle) {
            return style.f13746v;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    public final Path.FillType P() {
        SVG.Style.FillRule fillRule = this.f13948d.f13984a.G;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void P0(h hVar, boolean z10, SVG.m0 m0Var) {
        int i10;
        SVG.Style style = hVar.f13984a;
        float fFloatValue = (z10 ? style.f13729e : style.f13731g).floatValue();
        if (m0Var instanceof SVG.f) {
            i10 = ((SVG.f) m0Var).f13800b;
        } else if (!(m0Var instanceof SVG.g)) {
            return;
        } else {
            i10 = hVar.f13984a.f13739o.f13800b;
        }
        int iX = x(i10, fFloatValue);
        if (z10) {
            hVar.f13987d.setColor(iX);
        } else {
            hVar.f13988e.setColor(iX);
        }
    }

    public float Q() {
        return this.f13948d.f13987d.getTextSize();
    }

    public float R() {
        return this.f13948d.f13987d.getTextSize() / 2.0f;
    }

    public final void R0() {
        this.f13945a.restore();
        this.f13948d = this.f13949e.pop();
    }

    public SVG.b S() {
        h hVar = this.f13948d;
        SVG.b bVar = hVar.f13990g;
        return bVar != null ? bVar : hVar.f13989f;
    }

    public final void S0() {
        this.f13945a.save();
        this.f13949e.push(this.f13948d);
        this.f13948d = new h(this.f13948d);
    }

    public float T() {
        return this.f13946b;
    }

    public final String T0(String str, boolean z10, boolean z11) {
        if (this.f13948d.f13991h) {
            return str.replaceAll("[\\n\\t]", Z7.f27998r);
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", Z7.f27998r);
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", Z7.f27998r);
    }

    public final Path.FillType U() {
        SVG.Style.FillRule fillRule = this.f13948d.f13984a.f13728d;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void U0(SVG.i0 i0Var) {
        if (i0Var.f13835b == null || i0Var.f13817h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f13951g.peek().invert(matrix)) {
            SVG.b bVar = i0Var.f13817h;
            SVG.b bVar2 = i0Var.f13817h;
            SVG.b bVar3 = i0Var.f13817h;
            float[] fArr = {bVar.f13775a, bVar.f13776b, bVar.b(), bVar2.f13776b, bVar2.b(), i0Var.f13817h.c(), bVar3.f13775a, bVar3.c()};
            matrix.preConcat(this.f13945a.getMatrix());
            matrix.mapPoints(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
            RectF rectF = new RectF(f10, f11, f10, f11);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f12 = fArr[i10];
                if (f12 < rectF.left) {
                    rectF.left = f12;
                }
                if (f12 > rectF.right) {
                    rectF.right = f12;
                }
                float f13 = fArr[i10 + 1];
                if (f13 < rectF.top) {
                    rectF.top = f13;
                }
                if (f13 > rectF.bottom) {
                    rectF.bottom = f13;
                }
            }
            SVG.i0 i0Var2 = (SVG.i0) this.f13950f.peek();
            SVG.b bVar4 = i0Var2.f13817h;
            if (bVar4 == null) {
                i0Var2.f13817h = SVG.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.e(SVG.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    public final void V0(h hVar, SVG.Style style) {
        if (W(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            hVar.f13984a.f13739o = style.f13739o;
        }
        if (W(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            hVar.f13984a.f13738n = style.f13738n;
        }
        if (W(style, 1L)) {
            hVar.f13984a.f13727c = style.f13727c;
            SVG.m0 m0Var = style.f13727c;
            hVar.f13985b = (m0Var == null || m0Var == SVG.f.f13799d) ? false : true;
        }
        if (W(style, 4L)) {
            hVar.f13984a.f13729e = style.f13729e;
        }
        if (W(style, 6149L)) {
            P0(hVar, true, hVar.f13984a.f13727c);
        }
        if (W(style, 2L)) {
            hVar.f13984a.f13728d = style.f13728d;
        }
        if (W(style, 8L)) {
            hVar.f13984a.f13730f = style.f13730f;
            SVG.m0 m0Var2 = style.f13730f;
            hVar.f13986c = (m0Var2 == null || m0Var2 == SVG.f.f13799d) ? false : true;
        }
        if (W(style, 16L)) {
            hVar.f13984a.f13731g = style.f13731g;
        }
        if (W(style, 6168L)) {
            P0(hVar, false, hVar.f13984a.f13730f);
        }
        if (W(style, 34359738368L)) {
            hVar.f13984a.M = style.M;
        }
        if (W(style, 32L)) {
            SVG.Style style2 = hVar.f13984a;
            SVG.o oVar = style.f13732h;
            style2.f13732h = oVar;
            hVar.f13988e.setStrokeWidth(oVar.c(this));
        }
        if (W(style, 64L)) {
            hVar.f13984a.f13733i = style.f13733i;
            int i10 = a.f13954b[style.f13733i.ordinal()];
            if (i10 == 1) {
                hVar.f13988e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                hVar.f13988e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                hVar.f13988e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(style, 128L)) {
            hVar.f13984a.f13734j = style.f13734j;
            int i11 = a.f13955c[style.f13734j.ordinal()];
            if (i11 == 1) {
                hVar.f13988e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                hVar.f13988e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                hVar.f13988e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(style, 256L)) {
            hVar.f13984a.f13735k = style.f13735k;
            hVar.f13988e.setStrokeMiter(style.f13735k.floatValue());
        }
        if (W(style, 512L)) {
            hVar.f13984a.f13736l = style.f13736l;
        }
        if (W(style, 1024L)) {
            hVar.f13984a.f13737m = style.f13737m;
        }
        Typeface typefaceT = null;
        if (W(style, 1536L)) {
            SVG.o[] oVarArr = hVar.f13984a.f13736l;
            if (oVarArr == null) {
                hVar.f13988e.setPathEffect(null);
            } else {
                int length = oVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fC = hVar.f13984a.f13736l[i13 % length].c(this);
                    fArr[i13] = fC;
                    f10 += fC;
                }
                if (f10 == 0.0f) {
                    hVar.f13988e.setPathEffect(null);
                } else {
                    float fC2 = hVar.f13984a.f13737m.c(this);
                    if (fC2 < 0.0f) {
                        fC2 = (fC2 % f10) + f10;
                    }
                    hVar.f13988e.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (W(style, 16384L)) {
            float fQ = Q();
            hVar.f13984a.f13741q = style.f13741q;
            hVar.f13987d.setTextSize(style.f13741q.d(this, fQ));
            hVar.f13988e.setTextSize(style.f13741q.d(this, fQ));
        }
        if (W(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            hVar.f13984a.f13740p = style.f13740p;
        }
        if (W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.f13742r.intValue() == -1 && hVar.f13984a.f13742r.intValue() > 100) {
                SVG.Style style3 = hVar.f13984a;
                style3.f13742r = Integer.valueOf(style3.f13742r.intValue() - 100);
            } else if (style.f13742r.intValue() != 1 || hVar.f13984a.f13742r.intValue() >= 900) {
                hVar.f13984a.f13742r = style.f13742r;
            } else {
                SVG.Style style4 = hVar.f13984a;
                style4.f13742r = Integer.valueOf(style4.f13742r.intValue() + 100);
            }
        }
        if (W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            hVar.f13984a.f13743s = style.f13743s;
        }
        if (W(style, 106496L)) {
            if (hVar.f13984a.f13740p != null && this.f13947c != null) {
                SVG.k();
                for (String str : hVar.f13984a.f13740p) {
                    SVG.Style style5 = hVar.f13984a;
                    typefaceT = t(str, style5.f13742r, style5.f13743s);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                SVG.Style style6 = hVar.f13984a;
                typefaceT = t("serif", style6.f13742r, style6.f13743s);
            }
            hVar.f13987d.setTypeface(typefaceT);
            hVar.f13988e.setTypeface(typefaceT);
        }
        if (W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            hVar.f13984a.f13744t = style.f13744t;
            Paint paint = hVar.f13987d;
            SVG.Style.TextDecoration textDecoration = style.f13744t;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = hVar.f13987d;
            SVG.Style.TextDecoration textDecoration3 = style.f13744t;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            hVar.f13988e.setStrikeThruText(style.f13744t == textDecoration2);
            hVar.f13988e.setUnderlineText(style.f13744t == textDecoration4);
        }
        if (W(style, 68719476736L)) {
            hVar.f13984a.f13745u = style.f13745u;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            hVar.f13984a.f13746v = style.f13746v;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            hVar.f13984a.f13747w = style.f13747w;
        }
        if (W(style, 2097152L)) {
            hVar.f13984a.f13749y = style.f13749y;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            hVar.f13984a.f13750z = style.f13750z;
        }
        if (W(style, 8388608L)) {
            hVar.f13984a.A = style.A;
        }
        if (W(style, 16777216L)) {
            hVar.f13984a.B = style.B;
        }
        if (W(style, 33554432L)) {
            hVar.f13984a.C = style.C;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            hVar.f13984a.f13748x = style.f13748x;
        }
        if (W(style, 268435456L)) {
            hVar.f13984a.F = style.F;
        }
        if (W(style, 536870912L)) {
            hVar.f13984a.G = style.G;
        }
        if (W(style, 1073741824L)) {
            hVar.f13984a.H = style.H;
        }
        if (W(style, 67108864L)) {
            hVar.f13984a.D = style.D;
        }
        if (W(style, 134217728L)) {
            hVar.f13984a.E = style.E;
        }
        if (W(style, 8589934592L)) {
            hVar.f13984a.K = style.K;
        }
        if (W(style, 17179869184L)) {
            hVar.f13984a.L = style.L;
        }
        if (W(style, 137438953472L)) {
            hVar.f13984a.N = style.N;
        }
    }

    public final boolean W(SVG.Style style, long j10) {
        return (style.f13726b & j10) != 0;
    }

    public final void W0(h hVar, SVG.j0 j0Var) {
        hVar.f13984a.b(j0Var.f13835b == null);
        SVG.Style style = j0Var.f13825e;
        if (style != null) {
            V0(hVar, style);
        }
        if (this.f13947c.q()) {
            for (CSSParser.l lVar : this.f13947c.d()) {
                if (CSSParser.l(this.f13952h, lVar.f13694a, j0Var)) {
                    V0(hVar, lVar.f13695b);
                }
            }
        }
        SVG.Style style2 = j0Var.f13826f;
        if (style2 != null) {
            V0(hVar, style2);
        }
    }

    public final void X(boolean z10, SVG.b bVar, SVG.k0 k0Var) {
        float f10;
        float fD;
        float f11;
        float f12;
        String str = k0Var.f13822l;
        if (str != null) {
            H(k0Var, str);
        }
        Boolean bool = k0Var.f13819i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        h hVar = this.f13948d;
        Paint paint = z10 ? hVar.f13987d : hVar.f13988e;
        if (z11) {
            SVG.b bVarS = S();
            SVG.o oVar = k0Var.f13829m;
            float fE = oVar != null ? oVar.e(this) : 0.0f;
            SVG.o oVar2 = k0Var.f13830n;
            float f13 = oVar2 != null ? oVar2.f(this) : 0.0f;
            SVG.o oVar3 = k0Var.f13831o;
            float fE2 = oVar3 != null ? oVar3.e(this) : bVarS.f13777c;
            SVG.o oVar4 = k0Var.f13832p;
            f12 = fE2;
            f10 = fE;
            f11 = f13;
            fD = oVar4 != null ? oVar4.f(this) : 0.0f;
        } else {
            SVG.o oVar5 = k0Var.f13829m;
            float fD2 = oVar5 != null ? oVar5.d(this, 1.0f) : 0.0f;
            SVG.o oVar6 = k0Var.f13830n;
            float fD3 = oVar6 != null ? oVar6.d(this, 1.0f) : 0.0f;
            SVG.o oVar7 = k0Var.f13831o;
            float fD4 = oVar7 != null ? oVar7.d(this, 1.0f) : 1.0f;
            SVG.o oVar8 = k0Var.f13832p;
            f10 = fD2;
            fD = oVar8 != null ? oVar8.d(this, 1.0f) : 0.0f;
            f11 = fD3;
            f12 = fD4;
        }
        S0();
        this.f13948d = M(k0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f13775a, bVar.f13776b);
            matrix.preScale(bVar.f13777c, bVar.f13778d);
        }
        Matrix matrix2 = k0Var.f13820j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = k0Var.f13818h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f13948d.f13985b = false;
                return;
            } else {
                this.f13948d.f13986c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        float f14 = -1.0f;
        Iterator<SVG.l0> it = k0Var.f13818h.iterator();
        while (it.hasNext()) {
            SVG.c0 c0Var = (SVG.c0) it.next();
            Float f15 = c0Var.f13788h;
            float fFloatValue = f15 != null ? f15.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f14) {
                fArr[i10] = fFloatValue;
                f14 = fFloatValue;
            } else {
                fArr[i10] = f14;
            }
            S0();
            W0(this.f13948d, c0Var);
            SVG.Style style = this.f13948d.f13984a;
            SVG.f fVar = (SVG.f) style.D;
            if (fVar == null) {
                fVar = SVG.f.f13798c;
            }
            iArr[i10] = x(fVar.f13800b, style.E.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f12 && f11 == fD) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = k0Var.f13821k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f11, f12, fD, iArr, fArr, tileMode);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f13948d.f13984a.f13729e.floatValue()));
    }

    public final void X0() {
        int iX;
        SVG.Style style = this.f13948d.f13984a;
        SVG.m0 m0Var = style.K;
        if (m0Var instanceof SVG.f) {
            iX = ((SVG.f) m0Var).f13800b;
        } else if (!(m0Var instanceof SVG.g)) {
            return;
        } else {
            iX = style.f13739o.f13800b;
        }
        Float f10 = style.L;
        if (f10 != null) {
            iX = x(iX, f10.floatValue());
        }
        this.f13945a.drawColor(iX);
    }

    public final Path Y(SVG.d dVar) {
        SVG.o oVar = dVar.f13789o;
        float fE = oVar != null ? oVar.e(this) : 0.0f;
        SVG.o oVar2 = dVar.f13790p;
        float f10 = oVar2 != null ? oVar2.f(this) : 0.0f;
        float fC = dVar.f13791q.c(this);
        float f11 = fE - fC;
        float f12 = f10 - fC;
        float f13 = fE + fC;
        float f14 = f10 + fC;
        if (dVar.f13817h == null) {
            float f15 = 2.0f * fC;
            dVar.f13817h = new SVG.b(f11, f12, f15, f15);
        }
        float f16 = 0.5522848f * fC;
        Path path = new Path();
        path.moveTo(fE, f12);
        float f17 = fE + f16;
        float f18 = f10 - f16;
        path.cubicTo(f17, f12, f13, f18, f13, f10);
        float f19 = f10 + f16;
        path.cubicTo(f13, f19, f17, f14, fE, f14);
        float f20 = fE - f16;
        path.cubicTo(f20, f14, f11, f19, f11, f10);
        path.cubicTo(f11, f18, f20, f12, fE, f12);
        path.close();
        return path;
    }

    public final boolean Y0() {
        Boolean bool = this.f13948d.f13984a.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path Z(SVG.i iVar) {
        SVG.o oVar = iVar.f13813o;
        float fE = oVar != null ? oVar.e(this) : 0.0f;
        SVG.o oVar2 = iVar.f13814p;
        float f10 = oVar2 != null ? oVar2.f(this) : 0.0f;
        float fE2 = iVar.f13815q.e(this);
        float f11 = iVar.f13816r.f(this);
        float f12 = fE - fE2;
        float f13 = f10 - f11;
        float f14 = fE + fE2;
        float f15 = f10 + f11;
        if (iVar.f13817h == null) {
            iVar.f13817h = new SVG.b(f12, f13, fE2 * 2.0f, 2.0f * f11);
        }
        float f16 = fE2 * 0.5522848f;
        float f17 = 0.5522848f * f11;
        Path path = new Path();
        path.moveTo(fE, f13);
        float f18 = fE + f16;
        float f19 = f10 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, f10);
        float f20 = f17 + f10;
        path.cubicTo(f14, f20, f18, f15, fE, f15);
        float f21 = fE - f16;
        path.cubicTo(f21, f15, f12, f20, f12, f10);
        path.cubicTo(f12, f19, f21, f13, fE, f13);
        path.close();
        return path;
    }

    public final Path a0(SVG.p pVar) {
        SVG.o oVar = pVar.f13850o;
        float fE = oVar == null ? 0.0f : oVar.e(this);
        SVG.o oVar2 = pVar.f13851p;
        float f10 = oVar2 == null ? 0.0f : oVar2.f(this);
        SVG.o oVar3 = pVar.f13852q;
        float fE2 = oVar3 == null ? 0.0f : oVar3.e(this);
        SVG.o oVar4 = pVar.f13853r;
        float f11 = oVar4 != null ? oVar4.f(this) : 0.0f;
        if (pVar.f13817h == null) {
            pVar.f13817h = new SVG.b(Math.min(fE, fE2), Math.min(f10, f11), Math.abs(fE2 - fE), Math.abs(f11 - f10));
        }
        Path path = new Path();
        path.moveTo(fE, f10);
        path.lineTo(fE2, f11);
        return path;
    }

    public final Path b0(SVG.y yVar) {
        Path path = new Path();
        float[] fArr = yVar.f13890o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = yVar.f13890o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (yVar instanceof SVG.z) {
            path.close();
        }
        if (yVar.f13817h == null) {
            yVar.f13817h = m(path);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    public final Path c0(SVG.a0 a0Var) {
        float fE;
        float f10;
        float fMin;
        SVG.o oVar;
        float fE2;
        SVG.o oVar2;
        float f11;
        float fE3;
        float f12;
        float f13;
        float f14;
        Path path;
        Path path2;
        SVG.o oVar3 = a0Var.f13771s;
        if (oVar3 == null && a0Var.f13772t == null) {
            fE = 0.0f;
        } else {
            if (oVar3 != null) {
                if (a0Var.f13772t == null) {
                    fE = oVar3.e(this);
                } else {
                    fE = oVar3.e(this);
                    f10 = a0Var.f13772t.f(this);
                }
                fMin = Math.min(fE, a0Var.f13769q.e(this) / 2.0f);
                float fMin2 = Math.min(f10, a0Var.f13770r.f(this) / 2.0f);
                oVar = a0Var.f13767o;
                if (oVar != null) {
                    fE2 = oVar.e(this);
                } else {
                    fE2 = 0.0f;
                }
                oVar2 = a0Var.f13768p;
                if (oVar2 != null) {
                    f11 = oVar2.f(this);
                } else {
                    f11 = 0.0f;
                }
                fE3 = a0Var.f13769q.e(this);
                f12 = a0Var.f13770r.f(this);
                if (a0Var.f13817h == null) {
                    a0Var.f13817h = new SVG.b(fE2, f11, fE3, f12);
                }
                f13 = fE2 + fE3;
                f14 = f11 + f12;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path2 = path;
                    path2.moveTo(fE2, f11);
                    path2.lineTo(f13, f11);
                    path2.lineTo(f13, f14);
                    path2.lineTo(fE2, f14);
                    path2.lineTo(fE2, f11);
                } else {
                    float f15 = fMin * 0.5522848f;
                    float f16 = 0.5522848f * fMin2;
                    float f17 = f11 + fMin2;
                    path.moveTo(fE2, f17);
                    float f18 = f17 - f16;
                    float f19 = fE2 + fMin;
                    float f20 = f19 - f15;
                    path.cubicTo(fE2, f18, f20, f11, f19, f11);
                    float f21 = f13 - fMin;
                    path.lineTo(f21, f11);
                    float f22 = f21 + f15;
                    path.cubicTo(f22, f11, f13, f18, f13, f17);
                    float f23 = f14 - fMin2;
                    path.lineTo(f13, f23);
                    float f24 = f23 + f16;
                    path2 = path;
                    path.cubicTo(f13, f24, f22, f14, f21, f14);
                    path2.lineTo(f19, f14);
                    path2.cubicTo(f20, f14, fE2, f24, fE2, f23);
                    path2.lineTo(fE2, f17);
                }
                path2.close();
                return path2;
            }
            fE = a0Var.f13772t.f(this);
        }
        f10 = fE;
        fMin = Math.min(fE, a0Var.f13769q.e(this) / 2.0f);
        float fMin3 = Math.min(f10, a0Var.f13770r.f(this) / 2.0f);
        oVar = a0Var.f13767o;
        if (oVar != null) {
            fE2 = oVar.e(this);
        } else {
            fE2 = 0.0f;
        }
        oVar2 = a0Var.f13768p;
        if (oVar2 != null) {
            f11 = oVar2.f(this);
        } else {
            f11 = 0.0f;
        }
        fE3 = a0Var.f13769q.e(this);
        f12 = a0Var.f13770r.f(this);
        if (a0Var.f13817h == null) {
            a0Var.f13817h = new SVG.b(fE2, f11, fE3, f12);
        }
        f13 = fE2 + fE3;
        f14 = f11 + f12;
        path = new Path();
        if (fMin != 0.0f) {
            path2 = path;
            path2.moveTo(fE2, f11);
            path2.lineTo(f13, f11);
            path2.lineTo(f13, f14);
            path2.lineTo(fE2, f14);
            path2.lineTo(fE2, f11);
        } else {
            path2 = path;
            path2.moveTo(fE2, f11);
            path2.lineTo(f13, f11);
            path2.lineTo(f13, f14);
            path2.lineTo(fE2, f14);
            path2.lineTo(fE2, f11);
        }
        path2.close();
        return path2;
    }

    public final Path d0(SVG.u0 u0Var) {
        List<SVG.o> list = u0Var.f13891o;
        float f10 = 0.0f;
        float fE = (list == null || list.size() == 0) ? 0.0f : u0Var.f13891o.get(0).e(this);
        List<SVG.o> list2 = u0Var.f13892p;
        float f11 = (list2 == null || list2.size() == 0) ? 0.0f : u0Var.f13892p.get(0).f(this);
        List<SVG.o> list3 = u0Var.f13893q;
        float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : u0Var.f13893q.get(0).e(this);
        List<SVG.o> list4 = u0Var.f13894r;
        if (list4 != null && list4.size() != 0) {
            f10 = u0Var.f13894r.get(0).f(this);
        }
        if (this.f13948d.f13984a.f13746v != SVG.Style.TextAnchor.Start) {
            float fN = n(u0Var);
            if (this.f13948d.f13984a.f13746v == SVG.Style.TextAnchor.Middle) {
                fN /= 2.0f;
            }
            fE -= fN;
        }
        if (u0Var.f13817h == null) {
            i iVar = new i(fE, f11);
            E(u0Var, iVar);
            RectF rectF = iVar.f13995d;
            u0Var.f13817h = new SVG.b(rectF.left, rectF.top, rectF.width(), iVar.f13995d.height());
        }
        Path path = new Path();
        E(u0Var, new g(fE + fE2, f11 + f10, path));
        return path;
    }

    public final void e0(boolean z10, SVG.b bVar, SVG.o0 o0Var) {
        float f10;
        float fD;
        float f11;
        String str = o0Var.f13822l;
        if (str != null) {
            H(o0Var, str);
        }
        Boolean bool = o0Var.f13819i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        h hVar = this.f13948d;
        Paint paint = z10 ? hVar.f13987d : hVar.f13988e;
        if (z11) {
            SVG.o oVar = new SVG.o(50.0f, SVG.Unit.percent);
            SVG.o oVar2 = o0Var.f13845m;
            float fE = oVar2 != null ? oVar2.e(this) : oVar.e(this);
            SVG.o oVar3 = o0Var.f13846n;
            float f12 = oVar3 != null ? oVar3.f(this) : oVar.f(this);
            SVG.o oVar4 = o0Var.f13847o;
            fD = oVar4 != null ? oVar4.c(this) : oVar.c(this);
            f10 = fE;
            f11 = f12;
        } else {
            SVG.o oVar5 = o0Var.f13845m;
            float fD2 = oVar5 != null ? oVar5.d(this, 1.0f) : 0.5f;
            SVG.o oVar6 = o0Var.f13846n;
            float fD3 = oVar6 != null ? oVar6.d(this, 1.0f) : 0.5f;
            SVG.o oVar7 = o0Var.f13847o;
            f10 = fD2;
            fD = oVar7 != null ? oVar7.d(this, 1.0f) : 0.5f;
            f11 = fD3;
        }
        S0();
        this.f13948d = M(o0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f13775a, bVar.f13776b);
            matrix.preScale(bVar.f13777c, bVar.f13778d);
        }
        Matrix matrix2 = o0Var.f13820j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = o0Var.f13818h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f13948d.f13985b = false;
                return;
            } else {
                this.f13948d.f13986c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        float f13 = -1.0f;
        Iterator<SVG.l0> it = o0Var.f13818h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SVG.c0 c0Var = (SVG.c0) it.next();
            Float f14 = c0Var.f13788h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f13948d, c0Var);
            SVG.Style style = this.f13948d.f13984a;
            SVG.f fVar = (SVG.f) style.D;
            if (fVar == null) {
                fVar = SVG.f.f13798c;
            }
            iArr[i10] = x(fVar.f13800b, style.E.floatValue());
            i10++;
            R0();
        }
        if (fD == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = o0Var.f13821k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fD, iArr, fArr, tileMode);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f13948d.f13984a.f13729e.floatValue()));
    }

    @TargetApi(19)
    public final Path g0(SVG.i0 i0Var, boolean z10) {
        Path pathD0;
        Path pathJ;
        this.f13949e.push(this.f13948d);
        h hVar = new h(this.f13948d);
        this.f13948d = hVar;
        W0(hVar, i0Var);
        if (!A() || !Y0()) {
            this.f13948d = this.f13949e.pop();
            return null;
        }
        if (i0Var instanceof SVG.b1) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.b1 b1Var = (SVG.b1) i0Var;
            SVG.l0 l0VarU = i0Var.f13834a.u(b1Var.f13779p);
            if (l0VarU == null) {
                F("Use reference '%s' not found", b1Var.f13779p);
                this.f13948d = this.f13949e.pop();
                return null;
            }
            if (!(l0VarU instanceof SVG.i0)) {
                this.f13948d = this.f13949e.pop();
                return null;
            }
            pathD0 = g0((SVG.i0) l0VarU, false);
            if (pathD0 == null) {
                return null;
            }
            if (b1Var.f13817h == null) {
                b1Var.f13817h = m(pathD0);
            }
            Matrix matrix = b1Var.f13833o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (i0Var instanceof SVG.k) {
            SVG.k kVar = (SVG.k) i0Var;
            if (i0Var instanceof SVG.u) {
                pathD0 = new d(((SVG.u) i0Var).f13872o).f();
                if (i0Var.f13817h == null) {
                    i0Var.f13817h = m(pathD0);
                }
            } else if (i0Var instanceof SVG.a0) {
                pathD0 = c0((SVG.a0) i0Var);
            } else if (i0Var instanceof SVG.d) {
                pathD0 = Y((SVG.d) i0Var);
            } else if (i0Var instanceof SVG.i) {
                pathD0 = Z((SVG.i) i0Var);
            } else {
                pathD0 = i0Var instanceof SVG.y ? b0((SVG.y) i0Var) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (kVar.f13817h == null) {
                kVar.f13817h = m(pathD0);
            }
            Matrix matrix2 = kVar.f13828n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(i0Var instanceof SVG.u0)) {
                F("Invalid %s element found in clipPath definition", i0Var.n());
                return null;
            }
            SVG.u0 u0Var = (SVG.u0) i0Var;
            pathD0 = d0(u0Var);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = u0Var.f13874s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f13948d.f13984a.F != null && (pathJ = j(i0Var, i0Var.f13817h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f13948d = this.f13949e.pop();
        return pathD0;
    }

    public final void h0() {
        this.f13950f.pop();
        this.f13951g.pop();
    }

    public final void i0(SVG.h0 h0Var) {
        this.f13950f.push(h0Var);
        this.f13951g.push(this.f13945a.getMatrix());
    }

    @TargetApi(19)
    public final Path j(SVG.i0 i0Var, SVG.b bVar) {
        Path pathG0;
        SVG.l0 l0VarU = i0Var.f13834a.u(this.f13948d.f13984a.F);
        if (l0VarU == null) {
            F("ClipPath reference '%s' not found", this.f13948d.f13984a.F);
            return null;
        }
        SVG.e eVar = (SVG.e) l0VarU;
        this.f13949e.push(this.f13948d);
        this.f13948d = M(eVar);
        Boolean bool = eVar.f13797p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f13775a, bVar.f13776b);
            matrix.preScale(bVar.f13777c, bVar.f13778d);
        }
        Matrix matrix2 = eVar.f13833o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.l0 l0Var : eVar.f13801i) {
            if ((l0Var instanceof SVG.i0) && (pathG0 = g0((SVG.i0) l0Var, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f13948d.f13984a.F != null) {
            if (eVar.f13817h == null) {
                eVar.f13817h = m(path);
            }
            Path pathJ = j(eVar, eVar.f13817h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f13948d = this.f13949e.pop();
        return path;
    }

    public final void j0(SVG.i0 i0Var) {
        k0(i0Var, i0Var.f13817h);
    }

    public final List<c> k(SVG.p pVar) {
        SVG.o oVar = pVar.f13850o;
        float fE = oVar != null ? oVar.e(this) : 0.0f;
        SVG.o oVar2 = pVar.f13851p;
        float f10 = oVar2 != null ? oVar2.f(this) : 0.0f;
        SVG.o oVar3 = pVar.f13852q;
        float fE2 = oVar3 != null ? oVar3.e(this) : 0.0f;
        SVG.o oVar4 = pVar.f13853r;
        float f11 = oVar4 != null ? oVar4.f(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = fE2 - fE;
        float f13 = f11 - f10;
        arrayList.add(new c(fE, f10, f12, f13));
        arrayList.add(new c(fE2, f11, f12, f13));
        return arrayList;
    }

    public final void k0(SVG.i0 i0Var, SVG.b bVar) {
        if (this.f13948d.f13984a.H != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f13945a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f13945a.saveLayer(null, paint2, 31);
            SVG.r rVar = (SVG.r) this.f13947c.u(this.f13948d.f13984a.H);
            J0(rVar, i0Var, bVar);
            this.f13945a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f13945a.saveLayer(null, paint3, 31);
            J0(rVar, i0Var, bVar);
            this.f13945a.restore();
            this.f13945a.restore();
        }
        R0();
    }

    public final List<c> l(SVG.y yVar) {
        int length = yVar.f13890o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = yVar.f13890o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = yVar.f13890o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f13965a, f13 - cVar.f13966b);
            f11 = f13;
            f10 = f12;
        }
        if (yVar instanceof SVG.z) {
            float[] fArr3 = yVar.f13890o;
            float f14 = fArr3[0];
            if (f10 != f14) {
                float f15 = fArr3[1];
                if (f11 != f15) {
                    cVar.a(f14, f15);
                    arrayList.add(cVar);
                    c cVar2 = new c(f14, f15, f14 - cVar.f13965a, f15 - cVar.f13966b);
                    cVar2.b((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
        } else {
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final SVG.b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final float n(SVG.w0 w0Var) {
        k kVar = new k(this, null);
        E(w0Var, kVar);
        return kVar.f13998b;
    }

    public final c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f13967c, cVar2.f13968d, cVar2.f13965a - cVar.f13965a, cVar2.f13966b - cVar.f13966b);
        if (fD == 0.0f) {
            fD = D(cVar2.f13967c, cVar2.f13968d, cVar3.f13965a - cVar2.f13965a, cVar3.f13966b - cVar2.f13966b);
        }
        if (fD > 0.0f) {
            return cVar2;
        }
        if (fD == 0.0f && (cVar2.f13967c > 0.0f || cVar2.f13968d >= 0.0f)) {
            return cVar2;
        }
        cVar2.f13967c = -cVar2.f13967c;
        cVar2.f13968d = -cVar2.f13968d;
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix o(com.caverock.androidsvg.SVG.b r10, com.caverock.androidsvg.SVG.b r11, com.caverock.androidsvg.PreserveAspectRatio r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9b
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9b
        Lf:
            float r1 = r10.f13777c
            float r2 = r11.f13777c
            float r1 = r1 / r2
            float r2 = r10.f13778d
            float r3 = r11.f13778d
            float r2 = r2 / r3
            float r3 = r11.f13775a
            float r3 = -r3
            float r4 = r11.f13776b
            float r4 = -r4
            com.caverock.androidsvg.PreserveAspectRatio r5 = com.caverock.androidsvg.PreserveAspectRatio.f13706d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f13775a
            float r10 = r10.f13776b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = r12.b()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f13777c
            float r2 = r2 / r1
            float r5 = r10.f13778d
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.b.a.f13953a
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L62;
                case 2: goto L62;
                case 3: goto L62;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L67
        L5e:
            float r7 = r11.f13777c
            float r7 = r7 - r2
            goto L66
        L62:
            float r7 = r11.f13777c
            float r7 = r7 - r2
            float r7 = r7 / r8
        L66:
            float r3 = r3 - r7
        L67:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L89
            r2 = 3
            if (r12 == r2) goto L85
            r2 = 5
            if (r12 == r2) goto L89
            r2 = 6
            if (r12 == r2) goto L85
            r2 = 7
            if (r12 == r2) goto L89
            r2 = 8
            if (r12 == r2) goto L85
            goto L8e
        L85:
            float r11 = r11.f13778d
            float r11 = r11 - r5
            goto L8d
        L89:
            float r11 = r11.f13778d
            float r11 = r11 - r5
            float r11 = r11 / r8
        L8d:
            float r4 = r4 - r11
        L8e:
            float r11 = r10.f13775a
            float r10 = r10.f13776b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.b.o(com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    public final void p(SVG.i0 i0Var) {
        q(i0Var, i0Var.f13817h);
    }

    public final void q(SVG.i0 i0Var, SVG.b bVar) {
        Path pathJ;
        if (this.f13948d.f13984a.F == null || (pathJ = j(i0Var, bVar)) == null) {
            return;
        }
        this.f13945a.clipPath(pathJ);
    }

    public final void r(SVG.i0 i0Var) {
        SVG.m0 m0Var = this.f13948d.f13984a.f13727c;
        if (m0Var instanceof SVG.t) {
            z(true, i0Var.f13817h, (SVG.t) m0Var);
        }
        SVG.m0 m0Var2 = this.f13948d.f13984a.f13730f;
        if (m0Var2 instanceof SVG.t) {
            z(false, i0Var.f13817h, (SVG.t) m0Var2);
        }
    }

    public final Bitmap s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    public final Typeface t(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        int i10;
        boolean z10 = fontStyle == SVG.Style.FontStyle.Italic;
        if (num.intValue() > 500) {
            i10 = z10 ? 3 : 1;
        } else {
            i10 = z10 ? 2 : 0;
        }
        str.hashCode();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            default:
                return null;
        }
    }

    public final void u(SVG.l0 l0Var) {
        Boolean bool;
        if ((l0Var instanceof SVG.j0) && (bool = ((SVG.j0) l0Var).f13824d) != null) {
            this.f13948d.f13991h = bool.booleanValue();
        }
    }

    public final void x0(SVG.d0 d0Var) {
        z0(d0Var, f0(d0Var.f13792q, d0Var.f13793r, d0Var.f13794s, d0Var.f13795t), d0Var.f13854p, d0Var.f13842o);
    }

    public final void y0(SVG.d0 d0Var, SVG.b bVar) {
        z0(d0Var, bVar, d0Var.f13854p, d0Var.f13842o);
    }

    public final void z(boolean z10, SVG.b bVar, SVG.t tVar) {
        SVG.l0 l0VarU = this.f13947c.u(tVar.f13869b);
        if (l0VarU != null) {
            if (l0VarU instanceof SVG.k0) {
                X(z10, bVar, (SVG.k0) l0VarU);
                return;
            } else if (l0VarU instanceof SVG.o0) {
                e0(z10, bVar, (SVG.o0) l0VarU);
                return;
            } else {
                if (l0VarU instanceof SVG.b0) {
                    Q0(z10, (SVG.b0) l0VarU);
                    return;
                }
                return;
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = z10 ? "Fill" : "Stroke";
        objArr[1] = tVar.f13869b;
        F("%s reference '%s' not found", objArr);
        SVG.m0 m0Var = tVar.f13870c;
        if (m0Var != null) {
            P0(this.f13948d, z10, m0Var);
        } else if (z10) {
            this.f13948d.f13985b = false;
        } else {
            this.f13948d.f13986c = false;
        }
    }

    public b(Canvas canvas, float f10) {
        this.f13945a = canvas;
        this.f13946b = f10;
    }

    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static float[] i(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        for (int i11 = 0; i11 < iCeil; i11++) {
            double d14 = d10 + (((double) i11) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            int i12 = i10 + 1;
            fArr[i10] = (float) (dCos - (dSin * dSin2));
            int i13 = i12 + 1;
            fArr[i12] = (float) (dSin2 + (dCos * dSin));
            d12 = d12;
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            int i14 = i13 + 1;
            fArr[i13] = (float) ((dSin * dSin3) + dCos2);
            int i15 = i14 + 1;
            fArr[i14] = (float) (dSin3 - (dSin * dCos2));
            int i16 = i15 + 1;
            fArr[i15] = (float) dCos2;
            i10 = i16 + 1;
            fArr[i16] = (float) dSin3;
        }
        return fArr;
    }

    public final void E(SVG.w0 w0Var, j jVar) {
        if (!A()) {
            return;
        }
        Iterator<SVG.l0> it = w0Var.f13801i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            SVG.l0 next = it.next();
            if (next instanceof SVG.a1) {
                jVar.b(T0(((SVG.a1) next).f13773c, z10, !it.hasNext()));
            } else {
                l0(next, jVar);
            }
            z10 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        if (r7 != 8) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(com.caverock.androidsvg.SVG.q r12, com.caverock.androidsvg.b.c r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.b.H0(com.caverock.androidsvg.SVG$q, com.caverock.androidsvg.b$c):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(SVG.q0 q0Var) {
        Set<String> setF;
        String language = Locale.getDefault().getLanguage();
        SVG.k();
        for (SVG.l0 l0Var : q0Var.k()) {
            if (l0Var instanceof SVG.e0) {
                SVG.e0 e0Var = (SVG.e0) l0Var;
                if (e0Var.a() == null && ((setF = e0Var.f()) == null || (!setF.isEmpty() && setF.contains(language)))) {
                    Set<String> requiredFeatures = e0Var.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f13944i == null) {
                            V();
                        }
                        if (requiredFeatures.isEmpty() || !f13944i.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> setE = e0Var.e();
                    if (setE != null) {
                        setE.isEmpty();
                    } else {
                        Set<String> setM = e0Var.m();
                        if (setM != null) {
                            setM.isEmpty();
                        } else {
                            A0(l0Var);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final boolean m0() {
        SVG.l0 l0VarU;
        if (!M0()) {
            return false;
        }
        this.f13945a.saveLayerAlpha(null, w(this.f13948d.f13984a.f13738n.floatValue()), 31);
        this.f13949e.push(this.f13948d);
        h hVar = new h(this.f13948d);
        this.f13948d = hVar;
        String str = hVar.f13984a.H;
        if (str != null && ((l0VarU = this.f13947c.u(str)) == null || !(l0VarU instanceof SVG.r))) {
            F("Mask reference '%s' not found", this.f13948d.f13984a.H);
            this.f13948d.f13984a.H = null;
        }
        return true;
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SVG.Style f13984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f13987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f13988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SVG.b f13989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SVG.b f13990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f13991h;

        public h() {
            Paint paint = new Paint();
            this.f13987d = paint;
            paint.setFlags(193);
            this.f13987d.setHinting(0);
            this.f13987d.setStyle(Paint.Style.FILL);
            this.f13987d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f13988e = paint2;
            paint2.setFlags(193);
            this.f13988e.setHinting(0);
            this.f13988e.setStyle(Paint.Style.STROKE);
            this.f13988e.setTypeface(Typeface.DEFAULT);
            this.f13984a = SVG.Style.a();
        }

        public h(h hVar) {
            this.f13985b = hVar.f13985b;
            this.f13986c = hVar.f13986c;
            this.f13987d = new Paint(hVar.f13987d);
            this.f13988e = new Paint(hVar.f13988e);
            SVG.b bVar = hVar.f13989f;
            if (bVar != null) {
                this.f13989f = new SVG.b(bVar);
            }
            SVG.b bVar2 = hVar.f13990g;
            if (bVar2 != null) {
                this.f13990g = new SVG.b(bVar2);
            }
            this.f13991h = hVar.f13991h;
            try {
                this.f13984a = (SVG.Style) hVar.f13984a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f13984a = SVG.Style.a();
            }
        }
    }
}
