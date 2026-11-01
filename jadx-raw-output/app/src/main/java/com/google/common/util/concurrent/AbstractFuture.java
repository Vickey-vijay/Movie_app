package com.google.common.util.concurrent;

import com.google.j2objc.annotations.ReflectionSupport;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import m5.l;
import m5.o;
import q5.m;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
public abstract class AbstractFuture<V> extends r5.a implements q5.i<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f20653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q5.h f20654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f20655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f20656h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f20657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f20658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile k f20659d;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2);

        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture<?> abstractFuture, k kVar, k kVar2);

        public abstract d d(AbstractFuture<?> abstractFuture, d dVar);

        public abstract k e(AbstractFuture<?> abstractFuture, k kVar);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f20662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f20663d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f20665b;

        static {
            if (AbstractFuture.f20653e) {
                f20663d = null;
                f20662c = null;
            } else {
                f20663d = new c(false, null);
                f20662c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f20664a = z10;
            this.f20665b = th2;
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, Thread> f20670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, k> f20671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, k> f20672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, d> f20673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f20674e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f20670a = atomicReferenceFieldUpdater;
            this.f20671b = atomicReferenceFieldUpdater2;
            this.f20672c = atomicReferenceFieldUpdater3;
            this.f20673d = atomicReferenceFieldUpdater4;
            this.f20674e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            return androidx.concurrent.futures.a.a(this.f20673d, abstractFuture, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return androidx.concurrent.futures.a.a(this.f20674e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean c(AbstractFuture<?> abstractFuture, k kVar, k kVar2) {
            return androidx.concurrent.futures.a.a(this.f20672c, abstractFuture, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public d d(AbstractFuture<?> abstractFuture, d dVar) {
            return this.f20673d.getAndSet(abstractFuture, dVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public k e(AbstractFuture<?> abstractFuture, k kVar) {
            return this.f20672c.getAndSet(abstractFuture, kVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void f(k kVar, k kVar2) {
            this.f20671b.lazySet(kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void g(k kVar, Thread thread) {
            this.f20670a.lazySet(kVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractFuture<V> f20675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q5.i<? extends V> f20676c;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20675b.f20657b != this) {
                return;
            }
            if (AbstractFuture.f20655g.b(this.f20675b, this, AbstractFuture.w(this.f20676c))) {
                AbstractFuture.s(this.f20675b, false);
            }
        }

        public f(AbstractFuture<V> abstractFuture, q5.i<? extends V> iVar) {
            this.f20675b = abstractFuture;
            this.f20676c = iVar;
        }
    }

    public static final class g extends b {
        public g() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f20658c != dVar) {
                    return false;
                }
                abstractFuture.f20658c = dVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f20657b != obj) {
                    return false;
                }
                abstractFuture.f20657b = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean c(AbstractFuture<?> abstractFuture, k kVar, k kVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f20659d != kVar) {
                    return false;
                }
                abstractFuture.f20659d = kVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public d d(AbstractFuture<?> abstractFuture, d dVar) {
            d dVar2;
            synchronized (abstractFuture) {
                dVar2 = abstractFuture.f20658c;
                if (dVar2 != dVar) {
                    abstractFuture.f20658c = dVar;
                }
            }
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public k e(AbstractFuture<?> abstractFuture, k kVar) {
            k kVar2;
            synchronized (abstractFuture) {
                kVar2 = abstractFuture.f20659d;
                if (kVar2 != kVar) {
                    abstractFuture.f20659d = kVar;
                }
            }
            return kVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void f(k kVar, k kVar2) {
            kVar.f20685b = kVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void g(k kVar, Thread thread) {
            kVar.f20684a = thread;
        }
    }

    public interface h<V> extends q5.i<V> {
    }

    public static abstract class i<V> extends AbstractFuture<V> implements h<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, q5.i
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    public static final class j extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f20677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f20678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f20679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f20680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f20681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f20682f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        public j() {
            super();
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f20679c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("d"));
                f20678b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("c"));
                f20680d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                f20681e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                f20682f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                f20677a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            return com.google.android.gms.internal.ads.i.a(f20677a, abstractFuture, f20678b, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return com.google.android.gms.internal.ads.i.a(f20677a, abstractFuture, f20680d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public boolean c(AbstractFuture<?> abstractFuture, k kVar, k kVar2) {
            return com.google.android.gms.internal.ads.i.a(f20677a, abstractFuture, f20679c, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void f(k kVar, k kVar2) {
            f20677a.putObject(kVar, f20682f, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public void g(k kVar, Thread thread) {
            f20677a.putObject(kVar, f20681e, thread);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public d d(AbstractFuture<?> abstractFuture, d dVar) {
            d dVar2;
            do {
                dVar2 = abstractFuture.f20658c;
                if (dVar == dVar2) {
                    return dVar2;
                }
            } while (!a(abstractFuture, dVar2, dVar));
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        public k e(AbstractFuture<?> abstractFuture, k kVar) {
            k kVar2;
            do {
                kVar2 = abstractFuture.f20659d;
                if (kVar == kVar2) {
                    return kVar2;
                }
            } while (!c(abstractFuture, kVar2, kVar));
            return kVar2;
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f20683c = new k(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f20684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile k f20685b;

        public k(boolean z10) {
        }

        public void b() {
            Thread thread = this.f20684a;
            if (thread != null) {
                this.f20684a = null;
                LockSupport.unpark(thread);
            }
        }

        public k() {
            AbstractFuture.f20655g.g(this, Thread.currentThread());
        }

        public void a(k kVar) {
            AbstractFuture.f20655g.f(this, kVar);
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
    public static void s(AbstractFuture<?> abstractFuture, boolean z10) {
        d dVar = null;
        while (true) {
            abstractFuture.B();
            if (z10) {
                abstractFuture.y();
                z10 = false;
            }
            abstractFuture.n();
            d dVarR = abstractFuture.r(dVar);
            while (dVarR != null) {
                dVar = dVarR.f20669c;
                Runnable runnable = dVarR.f20667a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof f) {
                    f fVar = (f) runnable2;
                    abstractFuture = fVar.f20675b;
                    if (abstractFuture.f20657b == fVar) {
                        if (f20655g.b(abstractFuture, fVar, w(fVar.f20676c))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVarR.f20668b;
                    Objects.requireNonNull(executor);
                    u(runnable2, executor);
                }
                dVarR = dVar;
            }
            return;
        }
    }

    public static <V> V x(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public final void C(k kVar) {
        kVar.f20684a = null;
        while (true) {
            k kVar2 = this.f20659d;
            if (kVar2 == k.f20683c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f20685b;
                if (kVar2.f20684a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f20685b = kVar4;
                    if (kVar3.f20684a == null) {
                    }
                } else if (!f20655g.c(this, kVar2, kVar4)) {
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f20657b;
        if ((obj != null) && (!(obj instanceof f))) {
            return v(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.f20659d;
            if (kVar != k.f20683c) {
                k kVar2 = new k();
                while (true) {
                    kVar2.a(kVar);
                    if (f20655g.c(this, kVar, kVar2)) {
                        do {
                            m.a(this, nanos);
                            if (Thread.interrupted()) {
                                C(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f20657b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return v(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        C(kVar2);
                        break;
                    }
                    kVar = this.f20659d;
                    if (kVar == k.f20683c) {
                    }
                }
            }
            Object obj3 = this.f20657b;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f20657b;
            if ((obj4 != null) && (!(obj4 instanceof f))) {
                return v(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + Z7.f27998r + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + Z7.f27998r + lowerCase;
                if (z10) {
                    str3 = str3 + StringUtils.COMMA;
                }
                str2 = str3 + Z7.f27998r;
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    public void n() {
    }

    public void y() {
    }

    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Failure f20660b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f20661a;

        public Failure(Throwable th2) {
            this.f20661a = (Throwable) l.m(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.AbstractFuture$a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    static {
        boolean z10;
        b gVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.ironsource.mediationsdk.metadata.a.f29886h));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f20653e = z10;
        f20654f = new q5.h(AbstractFuture.class);
        ?? r10 = 0;
        r10 = 0;
        try {
            gVar = new j();
            e = null;
        } catch (Error | Exception e10) {
            e = e10;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, k.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
            } catch (Error | Exception e11) {
                gVar = new g();
                r10 = e11;
            }
        }
        f20655g = gVar;
        if (r10 != 0) {
            q5.h hVar = f20654f;
            Logger loggerA = hVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", e);
            hVar.a().log(level, "SafeAtomicHelper is broken!", r10);
        }
        f20656h = new Object();
    }

    public static CancellationException q(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object w(q5.i<?> iVar) {
        Throwable thA;
        if (iVar instanceof h) {
            Object cVar = ((AbstractFuture) iVar).f20657b;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f20664a) {
                    cVar = cVar2.f20665b != null ? new c(false, cVar2.f20665b) : c.f20663d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((iVar instanceof r5.a) && (thA = r5.b.a((r5.a) iVar)) != null) {
            return new Failure(thA);
        }
        boolean zIsCancelled = iVar.isCancelled();
        if ((!f20653e) && zIsCancelled) {
            c cVar3 = c.f20663d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objX = x(iVar);
            if (!zIsCancelled) {
                return objX == null ? f20656h : objX;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + iVar));
        } catch (Error e10) {
            e = e10;
            return new Failure(e);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + iVar, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new Failure(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + iVar, e12));
        } catch (Exception e13) {
            e = e13;
            return new Failure(e);
        }
    }

    public final void B() {
        for (k kVarE = f20655g.e(this, k.f20683c); kVarE != null; kVarE = kVarE.f20685b) {
            kVarE.b();
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
    public boolean D(V v10) {
        if (v10 == null) {
            v10 = (V) f20656h;
        }
        if (!f20655g.b(this, null, v10)) {
            return false;
        }
        s(this, false);
        return true;
    }

    public boolean F(Throwable th2) {
        if (!f20655g.b(this, null, new Failure((Throwable) l.m(th2)))) {
            return false;
        }
        s(this, false);
        return true;
    }

    public final boolean H() {
        Object obj = this.f20657b;
        return (obj instanceof c) && ((c) obj).f20664a;
    }

    @Override // r5.a
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f20657b;
        if (obj instanceof Failure) {
            return ((Failure) obj).f20661a;
        }
        return null;
    }

    @Override // q5.i
    public void addListener(Runnable runnable, Executor executor) {
        d dVar;
        l.n(runnable, "Runnable was null.");
        l.n(executor, "Executor was null.");
        if (!isDone() && (dVar = this.f20658c) != d.f20666d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f20669c = dVar;
                if (f20655g.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f20658c;
                }
            } while (dVar != d.f20666d);
        }
        u(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f20657b;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f20653e) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f20662c : c.f20663d;
            Objects.requireNonNull(cVar);
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f20655g.b(abstractFuture, obj, cVar)) {
                s(abstractFuture, z10);
                if (!(obj instanceof f)) {
                    return true;
                }
                q5.i<? extends V> iVar = ((f) obj).f20676c;
                if (!(iVar instanceof h)) {
                    iVar.cancel(z10);
                    return true;
                }
                abstractFuture = (AbstractFuture) iVar;
                obj = abstractFuture.f20657b;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f20657b;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f20657b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f20657b;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final void l(StringBuilder sb2) {
        try {
            Object objX = x(this);
            sb2.append("SUCCESS, result=[");
            o(sb2, objX);
            sb2.append(C3426d4.j.f28588e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(C3426d4.j.f28588e);
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    public final void o(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public final void p(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    public final d r(d dVar) {
        d dVar2 = dVar;
        d dVarD = f20655g.d(this, d.f20666d);
        while (dVarD != null) {
            d dVar3 = dVarD.f20669c;
            dVarD.f20669c = dVar2;
            dVar2 = dVarD;
            dVarD = dVar3;
        }
        return dVar2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            l(sb2);
        } else {
            m(sb2);
        }
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V v(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw q("Task was cancelled.", ((c) obj).f20665b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f20661a);
        }
        return obj == f20656h ? (V) q5.l.b() : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String z() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f20666d = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f20667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f20668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f20669c;

        public d(Runnable runnable, Executor executor) {
            this.f20667a = runnable;
            this.f20668b = executor;
        }

        public d() {
            this.f20667a = null;
            this.f20668b = null;
        }
    }

    public static void u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f20654f.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public boolean G(q5.i<? extends V> iVar) {
        Failure failure;
        l.m(iVar);
        Object obj = this.f20657b;
        if (obj == null) {
            if (iVar.isDone()) {
                if (!f20655g.b(this, null, w(iVar))) {
                    return false;
                }
                s(this, false);
                return true;
            }
            f fVar = new f(this, iVar);
            if (f20655g.b(this, null, fVar)) {
                try {
                    iVar.addListener(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Error | Exception unused) {
                        failure = Failure.f20660b;
                    }
                    f20655g.b(this, fVar, failure);
                }
                return true;
            }
            obj = this.f20657b;
        }
        if (obj instanceof c) {
            iVar.cancel(((c) obj).f20664a);
        }
        return false;
    }

    public final void m(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f20657b;
        if (obj instanceof f) {
            sb2.append(", setFuture=[");
            p(sb2, ((f) obj).f20676c);
            sb2.append(C3426d4.j.f28588e);
        } else {
            try {
                strA = o.a(z());
            } catch (Exception | StackOverflowError e10) {
                strA = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strA != null) {
                sb2.append(", info=[");
                sb2.append(strA);
                sb2.append(C3426d4.j.f28588e);
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            l(sb2);
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f20657b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return v(obj2);
            }
            k kVar = this.f20659d;
            if (kVar != k.f20683c) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (f20655g.c(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f20657b;
                            } else {
                                C(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return v(obj);
                    }
                    kVar = this.f20659d;
                } while (kVar != k.f20683c);
            }
            Object obj3 = this.f20657b;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        throw new InterruptedException();
    }
}
