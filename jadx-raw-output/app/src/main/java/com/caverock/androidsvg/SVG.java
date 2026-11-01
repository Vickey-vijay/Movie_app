package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SVG {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f13718g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f13719a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13720b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13721c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13722d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CSSParser.n f13723e = new CSSParser.n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, j0> f13724f = new HashMap();

    public enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    public static class Style implements Cloneable {
        public String A;
        public Boolean B;
        public Boolean C;
        public m0 D;
        public Float E;
        public String F;
        public FillRule G;
        public String H;
        public m0 I;
        public Float J;
        public m0 K;
        public Float L;
        public VectorEffect M;
        public RenderQuality N;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f13726b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m0 f13727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public FillRule f13728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Float f13729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public m0 f13730f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Float f13731g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public o f13732h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LineCap f13733i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LineJoin f13734j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Float f13735k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public o[] f13736l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public o f13737m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Float f13738n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public f f13739o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<String> f13740p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13741q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Integer f13742r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public FontStyle f13743s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextDecoration f13744t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextDirection f13745u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextAnchor f13746v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Boolean f13747w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public c f13748x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f13749y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f13750z;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        public static Style a() {
            Style style = new Style();
            style.f13726b = -1L;
            f fVar = f.f13798c;
            style.f13727c = fVar;
            FillRule fillRule = FillRule.NonZero;
            style.f13728d = fillRule;
            Float fValueOf = Float.valueOf(1.0f);
            style.f13729e = fValueOf;
            style.f13730f = null;
            style.f13731g = fValueOf;
            style.f13732h = new o(1.0f);
            style.f13733i = LineCap.Butt;
            style.f13734j = LineJoin.Miter;
            style.f13735k = Float.valueOf(4.0f);
            style.f13736l = null;
            style.f13737m = new o(0.0f);
            style.f13738n = fValueOf;
            style.f13739o = fVar;
            style.f13740p = null;
            style.f13741q = new o(12.0f, Unit.pt);
            style.f13742r = 400;
            style.f13743s = FontStyle.Normal;
            style.f13744t = TextDecoration.None;
            style.f13745u = TextDirection.LTR;
            style.f13746v = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.f13747w = bool;
            style.f13748x = null;
            style.f13749y = null;
            style.f13750z = null;
            style.A = null;
            style.B = bool;
            style.C = bool;
            style.D = fVar;
            style.E = fValueOf;
            style.F = null;
            style.G = fillRule;
            style.H = null;
            style.I = null;
            style.J = fValueOf;
            style.K = null;
            style.L = fValueOf;
            style.M = VectorEffect.None;
            style.N = RenderQuality.auto;
            return style;
        }

        public void b(boolean z10) {
            Boolean bool = Boolean.TRUE;
            this.B = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f13747w = bool;
            this.f13748x = null;
            this.F = null;
            this.f13738n = Float.valueOf(1.0f);
            this.D = f.f13798c;
            this.E = Float.valueOf(1.0f);
            this.H = null;
            this.I = null;
            this.J = Float.valueOf(1.0f);
            this.K = null;
            this.L = Float.valueOf(1.0f);
            this.M = VectorEffect.None;
        }

        public Object clone() throws CloneNotSupportedException {
            Style style = (Style) super.clone();
            o[] oVarArr = this.f13736l;
            if (oVarArr != null) {
                style.f13736l = (o[]) oVarArr.clone();
            }
            return style;
        }
    }

    public enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static class a0 extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f13767o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f13768p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13769q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f13770r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f13771s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f13772t;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "rect";
        }
    }

    public static class a1 extends l0 implements v0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f13773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z0 f13774d;

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.f13774d;
        }

        public String toString() {
            return "TextChild: '" + this.f13773c + "'";
        }

        public a1(String str) {
            this.f13773c = str;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f13775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f13778d;

        public b(float f10, float f11, float f12, float f13) {
            this.f13775a = f10;
            this.f13776b = f11;
            this.f13777c = f12;
            this.f13778d = f13;
        }

        public static b a(float f10, float f11, float f12, float f13) {
            return new b(f10, f11, f12 - f10, f13 - f11);
        }

        public float b() {
            return this.f13775a + this.f13777c;
        }

        public float c() {
            return this.f13776b + this.f13778d;
        }

        public RectF d() {
            return new RectF(this.f13775a, this.f13776b, b(), c());
        }

        public void e(b bVar) {
            float f10 = bVar.f13775a;
            if (f10 < this.f13775a) {
                this.f13775a = f10;
            }
            float f11 = bVar.f13776b;
            if (f11 < this.f13776b) {
                this.f13776b = f11;
            }
            if (bVar.b() > b()) {
                this.f13777c = bVar.b() - this.f13775a;
            }
            if (bVar.c() > c()) {
                this.f13778d = bVar.c() - this.f13776b;
            }
        }

        public String toString() {
            return C3426d4.j.f28586d + this.f13775a + Z7.f27998r + this.f13776b + Z7.f27998r + this.f13777c + Z7.f27998r + this.f13778d + C3426d4.j.f28588e;
        }

        public b(b bVar) {
            this.f13775a = bVar.f13775a;
            this.f13776b = bVar.f13776b;
            this.f13777c = bVar.f13777c;
            this.f13778d = bVar.f13778d;
        }
    }

    public static class b1 extends l {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f13779p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13780q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f13781r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f13782s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f13783t;

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "use";
        }
    }

    public static class c1 extends p0 implements s {
        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW;
        }
    }

    public static class d extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f13789o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f13790p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13791q;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "circle";
        }
    }

    public static class d0 extends p0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13792q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f13793r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f13794s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f13795t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f13796u;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "svg";
        }
    }

    public static class e extends l implements s {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f13797p;

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "clipPath";
        }
    }

    public interface e0 {
        String a();

        void b(Set<String> set);

        void d(Set<String> set);

        Set<String> e();

        Set<String> f();

        void g(Set<String> set);

        Set<String> getRequiredFeatures();

        void h(Set<String> set);

        void i(String str);

        Set<String> m();
    }

    public static abstract class f0 extends i0 implements h0, e0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<l0> f13801i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Set<String> f13802j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f13803k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f13804l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f13805m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set<String> f13806n = null;

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> f() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public String a() {
            return this.f13803k;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void b(Set<String> set) {
            this.f13806n = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void d(Set<String> set) {
            this.f13804l = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> e() {
            return this.f13805m;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void g(Set<String> set) {
            this.f13802j = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> getRequiredFeatures() {
            return this.f13802j;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void h(Set<String> set) {
            this.f13805m = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void i(String str) {
            this.f13803k = str;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> k() {
            return this.f13801i;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) throws SVGParseException {
            this.f13801i.add(l0Var);
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> m() {
            return this.f13806n;
        }
    }

    public static class g extends m0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static g f13807b = new g();

        public static g a() {
            return f13807b;
        }
    }

    public static abstract class g0 extends i0 implements e0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Set<String> f13808i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f13809j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Set<String> f13810k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f13811l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f13812m = null;

        @Override // com.caverock.androidsvg.SVG.e0
        public String a() {
            return this.f13809j;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void b(Set<String> set) {
            this.f13812m = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void d(Set<String> set) {
            this.f13810k = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> e() {
            return this.f13811l;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> f() {
            return this.f13810k;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void g(Set<String> set) {
            this.f13808i = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> getRequiredFeatures() {
            return this.f13808i;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void h(Set<String> set) {
            this.f13811l = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void i(String str) {
            this.f13809j = str;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> m() {
            return this.f13812m;
        }
    }

    public static class h extends l implements s {
        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "defs";
        }
    }

    public interface h0 {
        List<l0> k();

        void l(l0 l0Var) throws SVGParseException;
    }

    public static class i extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f13813o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f13814p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13815q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f13816r;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "ellipse";
        }
    }

    public static abstract class i0 extends j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f13817h = null;
    }

    public static abstract class j extends j0 implements h0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<l0> f13818h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f13819i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Matrix f13820j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public GradientSpread f13821k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f13822l;

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> k() {
            return this.f13818h;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) throws SVGParseException {
            if (l0Var instanceof c0) {
                this.f13818h.add(l0Var);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + l0Var + " elements.");
        }
    }

    public static abstract class k extends g0 implements m {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f13828n;

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.f13828n = matrix;
        }
    }

    public static class k0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public o f13829m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public o f13830n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f13831o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f13832p;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "linearGradient";
        }
    }

    public static class l extends f0 implements m {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Matrix f13833o;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "group";
        }

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.f13833o = matrix;
        }
    }

    public static class l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SVG f13834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h0 f13835b;

        public String n() {
            return "";
        }
    }

    public interface m {
        void j(Matrix matrix);
    }

    public static abstract class m0 implements Cloneable {
    }

    public static class n extends n0 implements m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f13836p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f13838r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f13839s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f13840t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Matrix f13841u;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "image";
        }

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.f13841u = matrix;
        }
    }

    public static abstract class n0 extends f0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public PreserveAspectRatio f13842o = null;
    }

    public static class o implements Cloneable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Unit f13844c;

        public o(float f10, Unit unit) {
            this.f13843b = f10;
            this.f13844c = unit;
        }

        public float a() {
            return this.f13843b;
        }

        public float b(float f10) {
            int i10 = a.f13766a[this.f13844c.ordinal()];
            if (i10 == 1) {
                return this.f13843b;
            }
            switch (i10) {
                case 4:
                    return this.f13843b * f10;
                case 5:
                    return (this.f13843b * f10) / 2.54f;
                case 6:
                    return (this.f13843b * f10) / 25.4f;
                case 7:
                    return (this.f13843b * f10) / 72.0f;
                case 8:
                    return (this.f13843b * f10) / 6.0f;
                default:
                    return this.f13843b;
            }
        }

        public float c(com.caverock.androidsvg.b bVar) {
            if (this.f13844c != Unit.percent) {
                return e(bVar);
            }
            b bVarS = bVar.S();
            if (bVarS == null) {
                return this.f13843b;
            }
            float f10 = bVarS.f13777c;
            float f11 = bVarS.f13778d;
            if (f10 == f11) {
                return (this.f13843b * f10) / 100.0f;
            }
            return (this.f13843b * ((float) (Math.sqrt((f10 * f10) + (f11 * f11)) / 1.414213562373095d))) / 100.0f;
        }

        public float d(com.caverock.androidsvg.b bVar, float f10) {
            return this.f13844c == Unit.percent ? (this.f13843b * f10) / 100.0f : e(bVar);
        }

        public float e(com.caverock.androidsvg.b bVar) {
            switch (a.f13766a[this.f13844c.ordinal()]) {
                case 1:
                    return this.f13843b;
                case 2:
                    return this.f13843b * bVar.Q();
                case 3:
                    return this.f13843b * bVar.R();
                case 4:
                    return this.f13843b * bVar.T();
                case 5:
                    return (this.f13843b * bVar.T()) / 2.54f;
                case 6:
                    return (this.f13843b * bVar.T()) / 25.4f;
                case 7:
                    return (this.f13843b * bVar.T()) / 72.0f;
                case 8:
                    return (this.f13843b * bVar.T()) / 6.0f;
                case 9:
                    b bVarS = bVar.S();
                    return bVarS == null ? this.f13843b : (this.f13843b * bVarS.f13777c) / 100.0f;
                default:
                    return this.f13843b;
            }
        }

        public float f(com.caverock.androidsvg.b bVar) {
            if (this.f13844c != Unit.percent) {
                return e(bVar);
            }
            b bVarS = bVar.S();
            return bVarS == null ? this.f13843b : (this.f13843b * bVarS.f13778d) / 100.0f;
        }

        public boolean g() {
            return this.f13843b < 0.0f;
        }

        public boolean i() {
            return this.f13843b == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f13843b) + this.f13844c;
        }

        public o(float f10) {
            this.f13843b = f10;
            this.f13844c = Unit.px;
        }
    }

    public static class o0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public o f13845m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public o f13846n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f13847o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f13848p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13849q;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "radialGradient";
        }
    }

    public static class p extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f13850o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f13851p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13852q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f13853r;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "line";
        }
    }

    public static abstract class p0 extends n0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b f13854p;
    }

    public static class q extends p0 implements s {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f13855q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f13856r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f13857s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f13858t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public o f13859u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Float f13860v;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "marker";
        }
    }

    public static class q0 extends l {
        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "switch";
        }
    }

    public static class r extends f0 implements s {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f13861o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f13862p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f13863q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f13864r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f13865s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f13866t;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "mask";
        }
    }

    public static class r0 extends p0 implements s {
        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "symbol";
        }
    }

    public interface s {
    }

    public static class s0 extends w0 implements v0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f13867o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public z0 f13868p;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "tref";
        }

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.f13868p;
        }

        public void o(z0 z0Var) {
            this.f13868p = z0Var;
        }
    }

    public static class t extends m0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m0 f13870c;

        public String toString() {
            return this.f13869b + Z7.f27998r + this.f13870c;
        }

        public t(String str, m0 m0Var) {
            this.f13869b = str;
            this.f13870c = m0Var;
        }
    }

    public static class t0 extends y0 implements v0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public z0 f13871s;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "tspan";
        }

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.f13871s;
        }

        public void o(z0 z0Var) {
            this.f13871s = z0Var;
        }
    }

    public static class u extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public v f13872o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Float f13873p;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "path";
        }
    }

    public static class u0 extends y0 implements z0, m {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f13874s;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "text";
        }

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.f13874s = matrix;
        }
    }

    public static class v implements w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13876b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13878d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f13875a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f13877c = new float[16];

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f13877c;
            int i10 = this.f13878d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            this.f13878d = i11 + 1;
            fArr[i11] = f11;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f13877c;
            int i10 = this.f13878d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            this.f13878d = i11 + 1;
            fArr[i11] = f11;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void c(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f13877c;
            int i10 = this.f13878d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            int i12 = i11 + 1;
            fArr[i11] = f11;
            int i13 = i12 + 1;
            fArr[i12] = f12;
            this.f13878d = i13 + 1;
            fArr[i13] = f13;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f13877c;
            int i10 = this.f13878d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            int i12 = i11 + 1;
            fArr[i11] = f11;
            int i13 = i12 + 1;
            fArr[i12] = f12;
            int i14 = i13 + 1;
            fArr[i13] = f13;
            int i15 = i14 + 1;
            fArr[i14] = f14;
            this.f13878d = i15 + 1;
            fArr[i15] = f15;
        }

        public void h(w wVar) {
            int i10;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f13876b; i12++) {
                byte b10 = this.f13875a[i12];
                if (b10 != 0) {
                    if (b10 == 1) {
                        float[] fArr = this.f13877c;
                        int i13 = i11 + 1;
                        i10 = i13 + 1;
                        wVar.b(fArr[i11], fArr[i13]);
                    } else if (b10 == 2) {
                        float[] fArr2 = this.f13877c;
                        int i14 = i11 + 1;
                        float f10 = fArr2[i11];
                        int i15 = i14 + 1;
                        float f11 = fArr2[i14];
                        int i16 = i15 + 1;
                        float f12 = fArr2[i15];
                        int i17 = i16 + 1;
                        float f13 = fArr2[i16];
                        int i18 = i17 + 1;
                        float f14 = fArr2[i17];
                        i11 = i18 + 1;
                        wVar.d(f10, f11, f12, f13, f14, fArr2[i18]);
                    } else if (b10 == 3) {
                        float[] fArr3 = this.f13877c;
                        int i19 = i11 + 1;
                        int i20 = i19 + 1;
                        int i21 = i20 + 1;
                        wVar.c(fArr3[i11], fArr3[i19], fArr3[i20], fArr3[i21]);
                        i11 = i21 + 1;
                    } else if (b10 != 8) {
                        boolean z10 = (b10 & 2) != 0;
                        boolean z11 = (b10 & 1) != 0;
                        float[] fArr4 = this.f13877c;
                        int i22 = i11 + 1;
                        float f15 = fArr4[i11];
                        int i23 = i22 + 1;
                        float f16 = fArr4[i22];
                        int i24 = i23 + 1;
                        float f17 = fArr4[i23];
                        int i25 = i24 + 1;
                        wVar.e(f15, f16, f17, z10, z11, fArr4[i24], fArr4[i25]);
                        i11 = i25 + 1;
                    } else {
                        wVar.close();
                    }
                } else {
                    float[] fArr5 = this.f13877c;
                    int i26 = i11 + 1;
                    i10 = i26 + 1;
                    wVar.a(fArr5[i11], fArr5[i26]);
                }
                i11 = i10;
            }
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            f((byte) 8);
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f13877c;
            int i10 = this.f13878d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            int i12 = i11 + 1;
            fArr[i11] = f11;
            int i13 = i12 + 1;
            fArr[i12] = f12;
            int i14 = i13 + 1;
            fArr[i13] = f13;
            this.f13878d = i14 + 1;
            fArr[i14] = f14;
        }

        public final void f(byte b10) {
            int i10 = this.f13876b;
            byte[] bArr = this.f13875a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f13875a = bArr2;
            }
            byte[] bArr3 = this.f13875a;
            int i11 = this.f13876b;
            this.f13876b = i11 + 1;
            bArr3[i11] = b10;
        }

        public final void g(int i10) {
            float[] fArr = this.f13877c;
            if (fArr.length < this.f13878d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f13877c = fArr2;
            }
        }

        public boolean i() {
            return this.f13876b == 0;
        }
    }

    public interface v0 {
        z0 c();
    }

    public interface w {
        void a(float f10, float f11);

        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13);

        void close();

        void d(float f10, float f11, float f12, float f13, float f14, float f15);

        void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);
    }

    public static abstract class w0 extends f0 {
        @Override // com.caverock.androidsvg.SVG.f0, com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) throws SVGParseException {
            if (l0Var instanceof v0) {
                this.f13801i.add(l0Var);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + l0Var + " elements.");
        }
    }

    public static class x extends p0 implements s {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f13879q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Boolean f13880r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f13881s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f13882t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public o f13883u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public o f13884v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public o f13885w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f13886x;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "pattern";
        }
    }

    public static class x0 extends w0 implements v0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f13887o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f13888p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public z0 f13889q;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "textPath";
        }

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.f13889q;
        }

        public void o(z0 z0Var) {
            this.f13889q = z0Var;
        }
    }

    public static class y extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float[] f13890o;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "polyline";
        }
    }

    public static abstract class y0 extends w0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<o> f13891o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<o> f13892p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List<o> f13893q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<o> f13894r;
    }

    public static class z extends y {
        @Override // com.caverock.androidsvg.SVG.y, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "polygon";
        }
    }

    public interface z0 {
    }

    public static e0.c k() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j0 i(h0 h0Var, String str) {
        j0 j0VarI;
        j0 j0Var = (j0) h0Var;
        if (str.equals(j0Var.f13823c)) {
            return j0Var;
        }
        for (Object obj : h0Var.k()) {
            if (obj instanceof j0) {
                j0 j0Var2 = (j0) obj;
                if (str.equals(j0Var2.f13823c)) {
                    return j0Var2;
                }
                if ((obj instanceof h0) && (j0VarI = i((h0) obj, str)) != null) {
                    return j0VarI;
                }
            }
        }
        return null;
    }

    public Picture r() {
        return t(null);
    }

    public l0 u(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return j(strC.substring(1));
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13766a;

        static {
            int[] iArr = new int[Unit.values().length];
            f13766a = iArr;
            try {
                iArr[Unit.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13766a[Unit.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13766a[Unit.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13766a[Unit.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13766a[Unit.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13766a[Unit.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13766a[Unit.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13766a[Unit.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13766a[Unit.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class b0 extends j0 implements h0 {
        @Override // com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "solidColor";
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> k() {
            return Collections.emptyList();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f13784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o f13785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f13786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o f13787d;

        public c(o oVar, o oVar2, o oVar3, o oVar4) {
            this.f13784a = oVar;
            this.f13785b = oVar2;
            this.f13786c = oVar3;
            this.f13787d = oVar4;
        }
    }

    public static class c0 extends j0 implements h0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f13788h;

        @Override // com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "stop";
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> k() {
            return Collections.emptyList();
        }
    }

    public static class f extends m0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f13798c = new f(ViewCompat.MEASURED_STATE_MASK);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f13799d = new f(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13800b;

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f13800b));
        }

        public f(int i10) {
            this.f13800b = i10;
        }
    }

    public static abstract class j0 extends l0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f13823c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f13824d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Style f13825e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Style f13826f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f13827g = null;

        public String toString() {
            return n();
        }
    }

    public static SVG l(InputStream inputStream) throws SVGParseException {
        return new SVGParser().z(inputStream, f13718g);
    }

    public static SVG n(Resources resources, int i10) throws SVGParseException {
        SVGParser sVGParser = new SVGParser();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i10);
        try {
            return sVGParser.z(inputStreamOpenRawResource, f13718g);
        } finally {
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static SVG o(String str) throws SVGParseException {
        return new SVGParser().z(new ByteArrayInputStream(str.getBytes()), f13718g);
    }

    public void a(CSSParser.n nVar) {
        this.f13723e.b(nVar);
    }

    public void b() {
        this.f13723e.e(CSSParser.Source.RenderOptions);
    }

    public final String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    public List<CSSParser.l> d() {
        return this.f13723e.c();
    }

    public final b e(float f10) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        float fB;
        Unit unit5;
        d0 d0Var = this.f13719a;
        o oVar = d0Var.f13794s;
        o oVar2 = d0Var.f13795t;
        if (oVar == null || oVar.i() || (unit = oVar.f13844c) == (unit2 = Unit.percent) || unit == (unit3 = Unit.em) || unit == (unit4 = Unit.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = oVar.b(f10);
        if (oVar2 == null) {
            b bVar = this.f13719a.f13854p;
            fB = bVar != null ? (bVar.f13778d * fB2) / bVar.f13777c : fB2;
        } else {
            if (oVar2.i() || (unit5 = oVar2.f13844c) == unit2 || unit5 == unit3 || unit5 == unit4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = oVar2.b(f10);
        }
        return new b(0.0f, 0.0f, fB2, fB);
    }

    public float f() {
        if (this.f13719a != null) {
            return e(this.f13722d).f13778d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        d0 d0Var = this.f13719a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = d0Var.f13854p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.f13719a != null) {
            return e(this.f13722d).f13777c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public j0 j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f13719a.f13823c)) {
            return this.f13719a;
        }
        if (this.f13724f.containsKey(str)) {
            return this.f13724f.get(str);
        }
        j0 j0VarI = i(this.f13719a, str);
        this.f13724f.put(str, j0VarI);
        return j0VarI;
    }

    public d0 p() {
        return this.f13719a;
    }

    public boolean q() {
        return !this.f13723e.d();
    }

    public Picture s(int i10, int i11, com.caverock.androidsvg.a aVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        if (aVar == null || aVar.f13943f == null) {
            aVar = aVar == null ? new com.caverock.androidsvg.a() : new com.caverock.androidsvg.a(aVar);
            aVar.h(0.0f, 0.0f, i10, i11);
        }
        new com.caverock.androidsvg.b(canvasBeginRecording, this.f13722d).G0(this, aVar);
        picture.endRecording();
        return picture;
    }

    public Picture t(com.caverock.androidsvg.a aVar) {
        o oVar;
        b bVar = (aVar == null || !aVar.f()) ? this.f13719a.f13854p : aVar.f13941d;
        if (aVar != null && aVar.g()) {
            return s((int) Math.ceil(aVar.f13943f.b()), (int) Math.ceil(aVar.f13943f.c()), aVar);
        }
        d0 d0Var = this.f13719a;
        o oVar2 = d0Var.f13794s;
        if (oVar2 != null) {
            Unit unit = oVar2.f13844c;
            Unit unit2 = Unit.percent;
            if (unit != unit2 && (oVar = d0Var.f13795t) != null && oVar.f13844c != unit2) {
                return s((int) Math.ceil(oVar2.b(this.f13722d)), (int) Math.ceil(this.f13719a.f13795t.b(this.f13722d)), aVar);
            }
        }
        if (oVar2 != null && bVar != null) {
            float fB = oVar2.b(this.f13722d);
            return s((int) Math.ceil(fB), (int) Math.ceil((bVar.f13778d * fB) / bVar.f13777c), aVar);
        }
        o oVar3 = d0Var.f13795t;
        if (oVar3 == null || bVar == null) {
            return s(512, 512, aVar);
        }
        float fB2 = oVar3.b(this.f13722d);
        return s((int) Math.ceil((bVar.f13777c * fB2) / bVar.f13778d), (int) Math.ceil(fB2), aVar);
    }

    public void v(String str) {
        this.f13721c = str;
    }

    public void w(float f10, float f11, float f12, float f13) {
        d0 d0Var = this.f13719a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        d0Var.f13854p = new b(f10, f11, f12, f13);
    }

    public void x(d0 d0Var) {
        this.f13719a = d0Var;
    }

    public void y(String str) {
        this.f13720b = str;
    }

    public static SVG m(Context context, int i10) throws SVGParseException {
        return n(context.getResources(), i10);
    }
}
