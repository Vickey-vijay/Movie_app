package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 yads.sw[], still in use, count: 1, list:
  (r12v3 yads.sw[]) from 0x0058: INVOKE (r12v3 yads.sw[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:91)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
public final class sw {
    /* JADX INFO: Fake field, exist only in values array */
    EF9(io.bidmachine.z3.IAB_CONSENT_STRING, "IABTCF_TCString"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21(io.bidmachine.z3.IAB_SUBJECT_TO_GDPR, "IABTCF_gdprApplies"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("IABConsent_CMPPresent", "IABTCF_CmpSdkID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents"),
    /* JADX INFO: Fake field, exist only in values array */
    EF68(null, "IABTCF_AddtlConsent");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rw f82776d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82779c;

    static {
        kotlin.enums.a.a(swVarArr);
        f82776d = new rw();
    }

    public static sw valueOf(String str) {
        return (sw) Enum.valueOf(sw.class, str);
    }

    public static sw[] values() {
        return (sw[]) f82777e.clone();
    }

    public sw(String str, String str2) {
        super(str, i);
        this.f82778b = str;
        this.f82779c = str2;
    }
}
