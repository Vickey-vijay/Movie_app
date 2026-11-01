package yads;

import androidx.core.net.MailTo;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v17 yads.ab3[], still in use, count: 1, list:
  (r4v17 yads.ab3[]) from 0x018b: INVOKE (r4v17 yads.ab3[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:398)
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
/* JADX INFO: loaded from: classes.dex */
public final class ab3 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("sms:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(MailTo.MAILTO_SCHEME),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("voicemail:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("tel:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("callto:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("fax:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("geo:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("map:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("maps:"),
    f75457d("market:"),
    f75458e("play:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("google.streetview:"),
    f75459f("market.android"),
    f75460g("play.google"),
    /* JADX INFO: Fake field, exist only in values array */
    EF168("map"),
    /* JADX INFO: Fake field, exist only in values array */
    EF181("maps"),
    /* JADX INFO: Fake field, exist only in values array */
    EF194("mobile.maps"),
    /* JADX INFO: Fake field, exist only in values array */
    EF207("m.maps"),
    /* JADX INFO: Fake field, exist only in values array */
    EF220("message:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF233("sip:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF246("skype:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF255("sms:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF268("gtalk:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF281("spotify:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF294("lastfm:");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final za3 f75456c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75462b;

    static {
        kotlin.enums.a.a(ab3VarArr);
        f75456c = new za3();
    }

    public static ab3 valueOf(String str) {
        return (ab3) Enum.valueOf(ab3.class, str);
    }

    public static ab3[] values() {
        return (ab3[]) f75461h.clone();
    }

    public ab3(String str) {
        super(str, i);
        this.f75462b = str;
    }
}
