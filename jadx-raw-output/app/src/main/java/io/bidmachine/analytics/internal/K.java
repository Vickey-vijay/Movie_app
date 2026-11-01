package io.bidmachine.analytics.internal;

import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\tJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0006\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tR'\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lio/bidmachine/analytics/internal/K;", "", "", "", "args", "Ljava/io/InputStream;", "a", "(Ljava/util/List;)Ljava/io/InputStream;", "Lmj/r;", "()V", "Lkotlin/Result;", "Ljava/lang/Object;", IconCompat.EXTRA_OBJ, "b", "Ljava/lang/String;", "processBuilder", "c", "start", "d", "getInputStream", "e", "destroy", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object obj;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String processBuilder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String start;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String getInputStream;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String destroy;

    /* JADX WARN: Code duplicated, block: B:15:0x006c  */
    public final InputStream a(List<String> args) {
        Object objM3458constructorimpl;
        Object objM3458constructorimpl2;
        Object objInvoke;
        try {
            Result.a aVar = Result.Companion;
            Class<?> cls = Class.forName(s0.a(this.processBuilder));
            objM3458constructorimpl = Result.m3458constructorimpl(cls.getMethod(s0.a(this.start), new Class[0]).invoke(cls.getConstructor(List.class).newInstance(nj.b0.O0(args)), new Object[0]));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        this.obj = objM3458constructorimpl;
        if (!Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            objM3458constructorimpl2 = Result.m3458constructorimpl(objM3458constructorimpl);
        } else if (objM3458constructorimpl != null) {
            try {
                Method method = objM3458constructorimpl.getClass().getMethod(s0.a(this.getInputStream), new Class[0]);
                if (method != null) {
                    objInvoke = method.invoke(objM3458constructorimpl, new Object[0]);
                } else {
                    objInvoke = null;
                }
                objM3458constructorimpl2 = Result.m3458constructorimpl((InputStream) objInvoke);
            } catch (Throwable th3) {
                Result.a aVar3 = Result.Companion;
                objM3458constructorimpl = kotlin.c.a(th3);
                objM3458constructorimpl2 = Result.m3458constructorimpl(objM3458constructorimpl);
            }
        } else {
            objInvoke = null;
            objM3458constructorimpl2 = Result.m3458constructorimpl((InputStream) objInvoke);
        }
        return (InputStream) (Result.m3463isFailureimpl(objM3458constructorimpl2) ? null : objM3458constructorimpl2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    public final void a() {
        Object objInvoke;
        Object objA = this.obj;
        if (Result.m3464isSuccessimpl(objA)) {
            if (objA != null) {
                try {
                    Method method = objA.getClass().getMethod(s0.a(this.destroy), new Class[0]);
                    if (method != null) {
                        objInvoke = method.invoke(objA, new Object[0]);
                    } else {
                        objInvoke = null;
                    }
                } catch (Throwable th2) {
                    Result.a aVar = Result.Companion;
                    objA = kotlin.c.a(th2);
                }
            } else {
                objInvoke = null;
            }
            Result.m3458constructorimpl(objInvoke);
            return;
        }
        Result.m3458constructorimpl(objA);
    }

    public K() {
        Result.a aVar = Result.Companion;
        this.obj = Result.m3458constructorimpl(kotlin.c.a(new NullPointerException()));
        this.processBuilder = "amF2YS5sYW5nLlByb2Nlc3NCdWlsZGVy";
        this.start = "c3RhcnQ=";
        this.getInputStream = "Z2V0SW5wdXRTdHJlYW0=";
        this.destroy = "ZGVzdHJveQ==";
    }
}
