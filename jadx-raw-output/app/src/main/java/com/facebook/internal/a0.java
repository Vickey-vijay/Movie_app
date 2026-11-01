package com.facebook.internal;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.LoggingBehavior;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00032\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0001J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\u001b\u001a\u00060\u0018j\u0002`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/facebook/internal/a0;", "", "Lmj/r;", "e", "", TypedValues.Custom.S_STRING, InneractiveMediationDefs.GENDER_FEMALE, "b", "format", "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", C3426d4.i.W, "value", "d", "", "g", "Lcom/facebook/LoggingBehavior;", "a", "Lcom/facebook/LoggingBehavior;", "behavior", "Ljava/lang/String;", "tag", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "contents", "", "I", "getPriority", "()I", "setPriority", "(I)V", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "<init>", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, String> f14340f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final LoggingBehavior behavior;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String tag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public StringBuilder contents;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int priority;

    /* JADX INFO: renamed from: com.facebook.internal.a0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J \u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0007J;\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R0\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0019j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/facebook/internal/a0$a;", "", "", "original", "replace", "Lmj/r;", "e", "accessToken", "d", "Lcom/facebook/LoggingBehavior;", "behavior", "tag", TypedValues.Custom.S_STRING, "b", "format", "", "args", "c", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "a", InneractiveMediationDefs.GENDER_FEMALE, "LOG_TAG_BASE", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "stringsToReplace", "Ljava/util/HashMap;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final synchronized void d(String str) {
            ck.p.j(str, "accessToken");
            q1.t tVar = q1.t.f66343a;
            if (!q1.t.H(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                e(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String str, String str2) {
            ck.p.j(str, "original");
            ck.p.j(str2, "replace");
            a0.f14340f.put(str, str2);
        }

        public final synchronized String f(String string) {
            String strN;
            strN = string;
            for (Map.Entry entry : a0.f14340f.entrySet()) {
                strN = lk.x.N(strN, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return strN;
        }

        public final void a(LoggingBehavior loggingBehavior, int i10, String str, String str2) {
            ck.p.j(loggingBehavior, "behavior");
            ck.p.j(str, "tag");
            ck.p.j(str2, TypedValues.Custom.S_STRING);
            if (q1.t.H(loggingBehavior)) {
                String strF = f(str2);
                if (!lk.x.R(str, "FacebookSDK.", false, 2, null)) {
                    str = ck.p.s("FacebookSDK.", str);
                }
                Log.println(i10, str, strF);
                if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(LoggingBehavior loggingBehavior, String str, String str2) {
            ck.p.j(loggingBehavior, "behavior");
            ck.p.j(str, "tag");
            ck.p.j(str2, TypedValues.Custom.S_STRING);
            a(loggingBehavior, 3, str, str2);
        }

        public final void c(LoggingBehavior behavior, String tag, String format, Object... args) {
            ck.p.j(behavior, "behavior");
            ck.p.j(tag, "tag");
            ck.p.j(format, "format");
            ck.p.j(args, "args");
            if (q1.t.H(behavior)) {
                ck.w wVar = ck.w.f6066a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                ck.p.i(str, "java.lang.String.format(format, *args)");
                a(behavior, 3, tag, str);
            }
        }
    }

    public a0(LoggingBehavior loggingBehavior, String str) {
        ck.p.j(loggingBehavior, "behavior");
        ck.p.j(str, "tag");
        this.priority = 3;
        this.behavior = loggingBehavior;
        this.tag = ck.p.s("FacebookSDK.", k0.l(str, "tag"));
        this.contents = new StringBuilder();
    }

    public final void b(String str) {
        ck.p.j(str, TypedValues.Custom.S_STRING);
        if (g()) {
            this.contents.append(str);
        }
    }

    public final void c(String format, Object... args) {
        ck.p.j(format, "format");
        ck.p.j(args, "args");
        if (g()) {
            StringBuilder sb2 = this.contents;
            ck.w wVar = ck.w.f6066a;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            ck.p.i(str, "java.lang.String.format(format, *args)");
            sb2.append(str);
        }
    }

    public final void d(String str, Object obj) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(obj, "value");
        c("  %s:\t%s\n", str, obj);
    }

    public final void e() {
        String string = this.contents.toString();
        ck.p.i(string, "contents.toString()");
        f(string);
        this.contents = new StringBuilder();
    }

    public final void f(String str) {
        ck.p.j(str, TypedValues.Custom.S_STRING);
        INSTANCE.a(this.behavior, this.priority, this.tag, str);
    }

    public final boolean g() {
        q1.t tVar = q1.t.f66343a;
        return q1.t.H(this.behavior);
    }
}
