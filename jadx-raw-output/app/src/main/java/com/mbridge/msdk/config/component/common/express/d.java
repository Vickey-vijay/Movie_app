package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.h;
import com.mbridge.msdk.config.component.common.express.operator.i;
import com.mbridge.msdk.config.component.common.express.operator.j;
import com.mbridge.msdk.config.component.common.express.operator.k;
import com.mbridge.msdk.config.component.common.express.operator.l;
import com.mbridge.msdk.config.component.common.express.operator.m;
import com.mbridge.msdk.config.component.common.express.operator.n;
import com.mbridge.msdk.config.component.common.express.operator.o;
import com.mbridge.msdk.config.component.common.express.operator.p;
import com.mbridge.msdk.config.component.common.express.operator.q;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* JADX INFO: compiled from: ExpressionOperator.java */
/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f32987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.c f32988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.d f32989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.f f32990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.e f32991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f32992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q f32993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f32994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f32995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f32996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.a f32997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.g f32998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i f32999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.b f33000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p f33001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final h f33002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n f33003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f33004r;

    public Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"") && str.replace("\\\"", "").split("\"").length == 2) {
            return str.substring(1, str.length() - 1);
        }
        q0.a("ExpressionOperator", "execute-expr: " + str);
        try {
            Object objA = new a().a(str).a(this, e.OTHER, aVar);
            return objA == null ? "" : objA;
        } catch (Exception e10) {
            q0.a("ExpressionOperator", "execute-e: " + e10.getMessage());
            return "";
        }
    }

    public d() {
        com.mbridge.msdk.config.component.common.express.operator.parts.c cVar = new com.mbridge.msdk.config.component.common.express.operator.parts.c();
        this.f32987a = cVar;
        this.f32988b = new com.mbridge.msdk.config.component.common.express.operator.c(cVar);
        this.f32989c = new com.mbridge.msdk.config.component.common.express.operator.d(cVar);
        this.f32990d = new com.mbridge.msdk.config.component.common.express.operator.f(cVar);
        this.f32991e = new com.mbridge.msdk.config.component.common.express.operator.e(cVar);
        this.f32992f = new o(cVar);
        this.f32993g = new q(cVar);
        this.f32994h = new m(cVar);
        this.f32995i = new k(cVar);
        this.f32996j = new j(cVar);
        this.f32997k = new com.mbridge.msdk.config.component.common.express.operator.a(cVar);
        this.f32998l = new com.mbridge.msdk.config.component.common.express.operator.g(cVar);
        this.f32999m = new i(cVar);
        this.f33000n = new com.mbridge.msdk.config.component.common.express.operator.b(cVar);
        this.f33001o = new p(cVar);
        this.f33002p = new h();
        this.f33003q = new n(cVar);
        this.f33004r = new l(cVar);
    }

    public Object a(Object obj, List<Object> list, String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        b bVar = new b();
        bVar.a(obj);
        bVar.a(list);
        bVar.a(str);
        return a(bVar, aVar);
    }

    private Object a(b bVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String strB = bVar.b();
        Object objA = bVar.a();
        List<Object> listC = bVar.c();
        try {
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB = this.f33004r.b(strB, objA, listC, aVar);
            if (aVarB.b()) {
                return aVarB.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA = this.f32991e.a(strB, objA, listC);
            if (aVarA.b()) {
                return aVarA.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA2 = this.f32990d.a(strB, objA, listC);
            if (aVarA2.b()) {
                return aVarA2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA3 = this.f32989c.a(strB, objA, listC);
            if (aVarA3.b()) {
                return aVarA3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA4 = this.f32992f.a(strB, objA, listC);
            if (aVarA4.b()) {
                return aVarA4.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA5 = this.f32999m.a(strB, objA, listC);
            if (aVarA5.b()) {
                return aVarA5.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA6 = this.f32995i.a(strB, objA, listC);
            if (aVarA6.b()) {
                return aVarA6.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA7 = this.f32993g.a(strB, objA, listC);
            if (aVarA7.b()) {
                return aVarA7.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarI = this.f32994h.i(strB, objA, listC);
            if (aVarI.b()) {
                return aVarI.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB2 = this.f32996j.b(strB, objA, listC);
            if (aVarB2.b()) {
                return aVarB2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA8 = this.f32997k.a(strB, objA, listC);
            if (aVarA8.b()) {
                return aVarA8.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA9 = this.f33001o.a(strB, objA, listC);
            if (aVarA9.b()) {
                return aVarA9.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA10 = this.f33003q.a(strB, objA, listC);
            if (aVarA10.b()) {
                return aVarA10.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB3 = this.f33002p.b(strB, objA, listC);
            if (aVarB3.b()) {
                return aVarB3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA11 = this.f32988b.a(strB, objA, listC);
            return aVarA11.b() ? aVarA11.a() : strB;
        } catch (Exception e10) {
            q0.b("ExpressionOperator", e10.getMessage(), e10);
            return null;
        }
    }
}
