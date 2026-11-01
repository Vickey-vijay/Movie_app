package ej;

import ii.e;
import ii.h;
import ii.k;
import ii.r;
import ii.s;
import ii.t;
import ii.u;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import oi.c;
import oi.g;
import oi.o;
import qo.b;

/* JADX INFO: compiled from: RxJavaPlugins.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile g<? super Throwable> f52636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile o<? super Runnable, ? extends Runnable> f52637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile o<? super Callable<s>, ? extends s> f52638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile o<? super Callable<s>, ? extends s> f52639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile o<? super Callable<s>, ? extends s> f52640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile o<? super Callable<s>, ? extends s> f52641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile o<? super s, ? extends s> f52642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile o<? super s, ? extends s> f52643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile o<? super e, ? extends e> f52644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile o<? super k, ? extends k> f52645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile o<? super cj.a, ? extends cj.a> f52646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile o<? super ii.g, ? extends ii.g> f52647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile o<? super t, ? extends t> f52648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile o<? super ii.a, ? extends ii.a> f52649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile c<? super e, ? super b, ? extends b> f52650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile c<? super ii.g, ? super h, ? extends h> f52651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile c<? super k, ? super r, ? extends r> f52652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile c<? super t, ? super u, ? extends u> f52653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile c<? super ii.a, ? super ii.b, ? extends ii.b> f52654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile oi.e f52655t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile boolean f52656u;

    public static s e(Callable<s> callable) {
        qi.a.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<s>, ? extends s> oVar = f52638c;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static s f(Callable<s> callable) {
        qi.a.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<s>, ? extends s> oVar = f52640e;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static s g(Callable<s> callable) {
        qi.a.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<s>, ? extends s> oVar = f52641f;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static s h(Callable<s> callable) {
        qi.a.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<s>, ? extends s> oVar = f52639d;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static boolean i(Throwable th2) {
        return (th2 instanceof OnErrorNotImplementedException) || (th2 instanceof MissingBackpressureException) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof CompositeException);
    }

    public static boolean j() {
        return f52656u;
    }

    public static <T> cj.a<T> k(cj.a<T> aVar) {
        o<? super cj.a, ? extends cj.a> oVar = f52646k;
        return oVar != null ? (cj.a) b(oVar, aVar) : aVar;
    }

    public static ii.a l(ii.a aVar) {
        o<? super ii.a, ? extends ii.a> oVar = f52649n;
        return oVar != null ? (ii.a) b(oVar, aVar) : aVar;
    }

    public static <T> e<T> m(e<T> eVar) {
        o<? super e, ? extends e> oVar = f52644i;
        return oVar != null ? (e) b(oVar, eVar) : eVar;
    }

    public static <T> ii.g<T> n(ii.g<T> gVar) {
        o<? super ii.g, ? extends ii.g> oVar = f52647l;
        return oVar != null ? (ii.g) b(oVar, gVar) : gVar;
    }

    public static <T> k<T> o(k<T> kVar) {
        o<? super k, ? extends k> oVar = f52645j;
        return oVar != null ? (k) b(oVar, kVar) : kVar;
    }

    public static <T> t<T> p(t<T> tVar) {
        o<? super t, ? extends t> oVar = f52648m;
        return oVar != null ? (t) b(oVar, tVar) : tVar;
    }

    public static boolean q() {
        oi.e eVar = f52655t;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.a();
        } catch (Throwable th2) {
            throw ExceptionHelper.d(th2);
        }
    }

    public static s r(s sVar) {
        o<? super s, ? extends s> oVar = f52642g;
        return oVar == null ? sVar : (s) b(oVar, sVar);
    }

    public static void s(Throwable th2) {
        g<? super Throwable> gVar = f52636a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th2)) {
            th2 = new UndeliverableException(th2);
        }
        if (gVar != null) {
            try {
                gVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                A(th3);
            }
        }
        th2.printStackTrace();
        A(th2);
    }

    public static s t(s sVar) {
        o<? super s, ? extends s> oVar = f52643h;
        return oVar == null ? sVar : (s) b(oVar, sVar);
    }

    public static Runnable u(Runnable runnable) {
        qi.a.e(runnable, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = f52637b;
        return oVar == null ? runnable : (Runnable) b(oVar, runnable);
    }

    public static ii.b v(ii.a aVar, ii.b bVar) {
        c<? super ii.a, ? super ii.b, ? extends ii.b> cVar = f52654s;
        return cVar != null ? (ii.b) a(cVar, aVar, bVar) : bVar;
    }

    public static <T> h<? super T> w(ii.g<T> gVar, h<? super T> hVar) {
        c<? super ii.g, ? super h, ? extends h> cVar = f52651p;
        return cVar != null ? (h) a(cVar, gVar, hVar) : hVar;
    }

    public static <T> r<? super T> x(k<T> kVar, r<? super T> rVar) {
        c<? super k, ? super r, ? extends r> cVar = f52652q;
        return cVar != null ? (r) a(cVar, kVar, rVar) : rVar;
    }

    public static <T> u<? super T> y(t<T> tVar, u<? super T> uVar) {
        c<? super t, ? super u, ? extends u> cVar = f52653r;
        return cVar != null ? (u) a(cVar, tVar, uVar) : uVar;
    }

    public static <T> b<? super T> z(e<T> eVar, b<? super T> bVar) {
        c<? super e, ? super b, ? extends b> cVar = f52650o;
        return cVar != null ? (b) a(cVar, eVar, bVar) : bVar;
    }

    public static void A(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    public static <T, U, R> R a(c<T, U, R> cVar, T t10, U u10) {
        try {
            return cVar.apply(t10, u10);
        } catch (Throwable th2) {
            throw ExceptionHelper.d(th2);
        }
    }

    public static <T, R> R b(o<T, R> oVar, T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th2) {
            throw ExceptionHelper.d(th2);
        }
    }

    public static s c(o<? super Callable<s>, ? extends s> oVar, Callable<s> callable) {
        return (s) qi.a.e(b(oVar, callable), "Scheduler Callable result can't be null");
    }

    public static s d(Callable<s> callable) {
        try {
            return (s) qi.a.e(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw ExceptionHelper.d(th2);
        }
    }
}
