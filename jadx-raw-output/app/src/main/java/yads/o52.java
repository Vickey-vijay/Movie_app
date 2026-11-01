package yads;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes7.dex */
public final class o52 {
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    public static if3 a(Throwable th2) {
        if3 if3Var;
        if3 if3Var2;
        boolean z10;
        if (th2 instanceof be2) {
            Throwable cause = th2.getCause();
            if (cause == null || !(((z10 = cause instanceof MediaCodec.CodecException)) || (cause instanceof IllegalStateException) || (cause instanceof IllegalArgumentException))) {
                if3Var2 = null;
            } else {
                StackTraceElement[] stackTrace = cause.getStackTrace();
                if ((!(stackTrace.length == 0)) && stackTrace[0].isNativeMethod() && ck.p.e(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                    String methodName = stackTrace[0].getMethodName();
                    if (methodName == null) {
                        methodName = "";
                    }
                    if (ck.p.e(methodName, "native_dequeueOutputBuffer")) {
                        if3Var2 = if3.f78626b;
                    } else if (ck.p.e(methodName, "native_dequeueInputBuffer")) {
                        if3Var2 = if3.f78627c;
                    } else if (ck.p.e(methodName, "native_stop")) {
                        if3Var2 = if3.f78628d;
                    } else if (ck.p.e(methodName, "native_setSurface")) {
                        if3Var2 = if3.f78629e;
                    } else if (ck.p.e(methodName, "releaseOutputBuffer")) {
                        if3Var2 = if3.f78630f;
                    } else if (ck.p.e(methodName, "native_queueSecureInputBuffer")) {
                        if3Var2 = if3.f78631g;
                    } else if (z10) {
                        if3Var2 = if3.f78632h;
                    } else {
                        if3Var2 = null;
                    }
                } else {
                    if3Var2 = null;
                }
            }
            if (if3Var2 != null) {
                return if3Var2;
            }
            Throwable cause2 = th2.getCause();
            if3 if3VarA = cause2 != null ? a(cause2) : null;
            if (if3VarA != null) {
                return if3VarA;
            }
            if3Var = if3.E;
        } else if (th2 instanceof f31) {
            if3Var = if3.f78634j;
        } else if (th2 instanceof rk1) {
            if3Var = if3.f78635k;
        } else if (th2 instanceof lk1) {
            if3Var = if3.f78636l;
        } else if (th2 instanceof zo) {
            if3Var = if3.f78638n;
        } else if (th2 instanceof MediaCodec.CryptoException) {
            if3Var = if3.f78639o;
        } else if (th2 instanceof lk0) {
            Throwable cause3 = ((lk0) th2).getCause();
            if (cause3 == null) {
                if3Var = if3.f78641q;
            } else if ((cause3 instanceof MediaDrmResetException) || (cause3 instanceof ResourceBusyException)) {
                if3Var = if3.f78640p;
            } else {
                if3Var = ((cause3 instanceof MediaCodec.CryptoException) || (cause3 instanceof le1)) ? if3.f78639o : if3.f78641q;
            }
        } else if (th2 instanceof s11) {
            int i10 = ((s11) th2).f82491e;
            if (i10 == 401) {
                if3Var = if3.f78643s;
            } else if (i10 == 403) {
                if3Var = if3.f78644t;
            } else {
                if3Var = i10 == 404 ? if3.f78645u : if3.f78646v;
            }
        } else if (th2 instanceof q11) {
            if3Var = ((q11) th2).getCause() instanceof SSLHandshakeException ? if3.f78647w : if3.f78648x;
        } else if (th2 instanceof ob2) {
            if3Var = if3.f78649y;
        } else if (th2 instanceof eg1) {
            if3Var = if3.f78650z;
        } else if ((th2 instanceof el) || (th2 instanceof fl)) {
            if3Var = if3.A;
        } else if (th2 instanceof t43) {
            if3Var = if3.B;
        } else {
            if3Var = ((th2 instanceof kr) || (th2 instanceof or)) ? if3.C : if3.F;
        }
        return if3Var;
    }
}
