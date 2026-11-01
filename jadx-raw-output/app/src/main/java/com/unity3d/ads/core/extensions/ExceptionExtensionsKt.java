package com.unity3d.ads.core.extensions;

import ck.p;
import com.unity3d.services.SDKErrorHandler;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.sequences.SequencesKt___SequencesKt;
import lk.a0;
import yj.b;

/* JADX INFO: compiled from: ExceptionExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExceptionExtensionsKt {
    public static final String getShortenedStackTrace(Throwable th2, int i10) {
        p.j(th2, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th2.printStackTrace(printWriter);
                    String string = stringWriter.toString();
                    p.i(string, "stringWriter.toString()");
                    String strI = SequencesKt___SequencesKt.I(SequencesKt___SequencesKt.Q(a0.t0(a0.k1(string).toString()), i10), "\n", null, null, 0, null, null, 62, null);
                    b.a(printWriter, null);
                    b.a(stringWriter, null);
                    return strI;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        b.a(printWriter, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    b.a(stringWriter, th5);
                    throw th6;
                }
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 15;
        }
        return getShortenedStackTrace(th2, i10);
    }

    public static final String retrieveUnityCrashValue(Throwable th2) {
        StackTraceElement stackTraceElement;
        boolean zX;
        String className;
        p.j(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        p.i(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            stackTraceElement = null;
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i10];
            if (stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null) {
                zX = false;
            } else {
                p.i(className, "className");
                zX = a0.X(className, SDKErrorHandler.UNITY_PACKAGE, false, 2, null);
            }
            if (zX) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i10++;
        }
        if (stackTraceElement == null) {
            return "unknown";
        }
        String fileName = stackTraceElement.getFileName();
        if (fileName == null) {
            fileName = "unknown";
        } else {
            p.i(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
        }
        String str = fileName + '_' + stackTraceElement.getLineNumber();
        return str != null ? str : "unknown";
    }
}
