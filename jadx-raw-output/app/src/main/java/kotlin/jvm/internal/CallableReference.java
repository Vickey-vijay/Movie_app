package kotlin.jvm.internal;

import ck.s;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import jk.b;
import jk.f;
import jk.n;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CallableReference implements b, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f62999b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient b reflected;
    private final String signature;

    public static class NoReceiver implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NoReceiver f62999b = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f62999b;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    public abstract b computeReflected();

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    public b compute() {
        b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? s.c(cls) : s.b(cls);
    }

    public String getSignature() {
        return this.signature;
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // jk.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // jk.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @Override // jk.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // jk.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public b getReflected() {
        b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // jk.b
    public n getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // jk.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // jk.b
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // jk.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // jk.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // jk.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // jk.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
