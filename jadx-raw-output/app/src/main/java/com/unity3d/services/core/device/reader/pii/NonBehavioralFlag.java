package com.unity3d.services.core.device.reader.pii;

import ck.i;
import ck.p;
import java.util.Locale;
import kotlin.Result;
import kotlin.c;

/* JADX INFO: compiled from: NonBehavioralFlag.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;

    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: NonBehavioralFlag.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final NonBehavioralFlag fromString(String str) {
            Object objM3458constructorimpl;
            p.j(str, "value");
            try {
                Result.a aVar = Result.Companion;
                String upperCase = str.toUpperCase(Locale.ROOT);
                p.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objM3458constructorimpl = Result.m3458constructorimpl(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) objM3458constructorimpl;
        }
    }
}
