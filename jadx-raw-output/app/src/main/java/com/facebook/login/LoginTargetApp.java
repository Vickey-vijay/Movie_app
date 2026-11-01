package com.facebook.login;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: LoginTargetApp.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/login/LoginTargetApp;", "", "", "toString", "targetApp", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", VastTagName.COMPANION, "a", "FACEBOOK", "INSTAGRAM", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum LoginTargetApp {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String targetApp;

    public static final LoginTargetApp fromString(String str) {
        return INSTANCE.a(str);
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginTargetApp$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LoginTargetApp.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/login/LoginTargetApp$a;", "", "", "stringValue", "Lcom/facebook/login/LoginTargetApp;", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final LoginTargetApp a(String stringValue) {
            LoginTargetApp[] loginTargetAppArrValuesCustom = LoginTargetApp.valuesCustom();
            int length = loginTargetAppArrValuesCustom.length;
            int i10 = 0;
            while (i10 < length) {
                LoginTargetApp loginTargetApp = loginTargetAppArrValuesCustom[i10];
                i10++;
                if (ck.p.e(loginTargetApp.toString(), stringValue)) {
                    return loginTargetApp;
                }
            }
            return LoginTargetApp.FACEBOOK;
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static LoginTargetApp[] valuesCustom() {
        LoginTargetApp[] loginTargetAppArrValuesCustom = values();
        return (LoginTargetApp[]) Arrays.copyOf(loginTargetAppArrValuesCustom, loginTargetAppArrValuesCustom.length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }

    LoginTargetApp(String str) {
        this.targetApp = str;
    }
}
