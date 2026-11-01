package y1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.UUID;
import kotlin.Metadata;
import q1.t;

/* JADX INFO: compiled from: SessionInfo.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0006B'\b\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00058F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000b\u0010\t\"\u0004\b\u001d\u0010\u000eR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b \u0010'¨\u0006+"}, d2 = {"Ly1/l;", "", "Lmj/r;", "h", InneractiveMediationDefs.GENDER_MALE, "", "a", "Ljava/lang/Long;", "getSessionStartTime", "()Ljava/lang/Long;", "sessionStartTime", "b", "e", CampaignEx.JSON_KEY_AD_K, "(Ljava/lang/Long;)V", "sessionLastEventTime", "Ljava/util/UUID;", "c", "Ljava/util/UUID;", "d", "()Ljava/util/UUID;", "j", "(Ljava/util/UUID;)V", JsonStorageKeyNames.SESSION_ID_KEY, "", "<set-?>", "I", "()I", "interruptionCount", "i", "diskRestoreTime", "Ly1/n;", InneractiveMediationDefs.GENDER_FEMALE, "Ly1/n;", "g", "()Ly1/n;", "l", "(Ly1/n;)V", "sourceApplicationInfo", "()J", "sessionLength", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Long sessionStartTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Long sessionLastEventTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public UUID sessionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int interruptionCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Long diskRestoreTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public n sourceApplicationInfo;

    public l(Long l10, Long l11, UUID uuid) {
        p.j(uuid, JsonStorageKeyNames.SESSION_ID_KEY);
        this.sessionStartTime = l10;
        this.sessionLastEventTime = l11;
        this.sessionId = uuid;
    }

    /* JADX INFO: renamed from: y1.l$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SessionInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Ly1/l$a;", "", "Ly1/l;", "b", "Lmj/r;", "a", "", "INTERRUPTION_COUNT_KEY", "Ljava/lang/String;", "LAST_SESSION_INFO_END_KEY", "LAST_SESSION_INFO_START_KEY", "SESSION_ID_KEY", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(t.l()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            n.INSTANCE.a();
        }

        public final l b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(t.l());
            long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            l lVar = new l(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            lVar.interruptionCount = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            lVar.l(n.INSTANCE.b());
            lVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            p.i(uuidFromString, "fromString(sessionIDStr)");
            lVar.j(uuidFromString);
            return lVar;
        }
    }

    public final Long b() {
        Long l10 = this.diskRestoreTime;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    public final long f() {
        Long l10;
        if (this.sessionStartTime == null || (l10 = this.sessionLastEventTime) == null) {
            return 0L;
        }
        if (l10 != null) {
            return l10.longValue() - this.sessionStartTime.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    public final void h() {
        this.interruptionCount++;
    }

    public final void i(Long l10) {
        this.diskRestoreTime = l10;
    }

    public final void j(UUID uuid) {
        p.j(uuid, "<set-?>");
        this.sessionId = uuid;
    }

    public final void k(Long l10) {
        this.sessionLastEventTime = l10;
    }

    public final void l(n nVar) {
        this.sourceApplicationInfo = nVar;
    }

    public final void m() {
        long jLongValue;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(t.l()).edit();
        Long l10 = this.sessionStartTime;
        long jLongValue2 = 0;
        if (l10 == null) {
            jLongValue = 0;
        } else {
            jLongValue = l10.longValue();
        }
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", jLongValue);
        Long l11 = this.sessionLastEventTime;
        if (l11 != null) {
            jLongValue2 = l11.longValue();
        }
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", jLongValue2);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.interruptionCount);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.sessionId.toString());
        editorEdit.apply();
        n nVar = this.sourceApplicationInfo;
        if (nVar != null && nVar != null) {
            nVar.a();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(Long l10, Long l11, UUID uuid, int i10, ck.i iVar) {
        if ((i10 & 4) != 0) {
            uuid = UUID.randomUUID();
            p.i(uuid, "randomUUID()");
        }
        this(l10, l11, uuid);
    }
}
